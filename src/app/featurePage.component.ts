import { Component ,OnInit} from '@angular/core';

import { Http,Response } from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { URLSearchParams } from '@angular/http';
import{FeatureServiceComponent} from './featurePage.service'
import {ProjectDetailServiceComponent} from './pDetail.service';
import {Post} from './post';
@Component({
   selector: 'app-feature',
 
  templateUrl:'./html/featurePage.component.html',

providers: [ProjectDetailServiceComponent]
   //styleUrls: ['./pDetail.component.css'],

       

})//componrnt  closing

export class FeatureComponent implements OnInit   {
  moduleDatas:Post[]; 
  fShowInc:Post[];
  incfeatureId:string;
    featureName:string;
  selectedValue:string;
  finalSelectedMid:any
   idFromModule:Post[];
    constructor(private sendFeatureName:FeatureServiceComponent,private data:ProjectDetailServiceComponent,
      private http:Http) {
  //alert("jjj")
  
 
    }
 
 
      ngOnInit(){
  	

          this.data.projectDetails()
          .subscribe(Data => this.moduleDatas=Data, error => console.log(error));

 this.sendFeatureName.idFDetails()
.subscribe(moduleData =>{this.fShowInc=moduleData;this.lastIncF(this.fShowInc) });



      }
mData(selectedValue){
//alert(this.selectedValue)
//alert(dd)
this.sendFeatureName.getMId(selectedValue).subscribe(Data =>{this.idFromModule=Data;this.fromMoudle(this.idFromModule)});

setInterval(() => {
      this.ngOnInit();
 
 }, 1000);
}
fromMoudle(takeModuleId){
this.finalSelectedMid=takeModuleId[0].moduleId
}

lastIncF(lastFid){

if(lastFid.length==0){

alert("make responce o")
}
else{
  var iFid=parseInt(lastFid[0].featureId)
  console.log(iFid)

   var uFid=iFid+1;
   this.incfeatureId=uFid.toString();
  console.log(this.incfeatureId)
}

}


   saveFeatureName(){
     console.log(this.featureName)
      console.log(this.finalSelectedMid)
       let urlSearchParams = new URLSearchParams();
 urlSearchParams.append('featureName', this.featureName);
 urlSearchParams.append('moduleId', this.finalSelectedMid);
 urlSearchParams.append('featureId', this.incfeatureId)
 
     return this.http.post('/postFeatureName', urlSearchParams)
      .subscribe(data => {
      console.log(data);
    });
//alert(takeModuleId[0].moduleId)
//var combineMidFN=this.finalSelectedMid+this.featureName;
//this.sendFeatureName.featureServiceDetails(combineMidFN)

   }  




}
