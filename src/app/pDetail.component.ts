import { Component, Input,OnInit,OnDestroy} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { ProjectDetailServiceComponent } from './pDetail.service';
import {Post} from './post';
import {SelectionComponent} from './projectSelection.component';



@Component({
   selector: 'app-detail',
 
  templateUrl:'./html/projectDetail.html',

   styleUrls: ['./css/pDetail.component.css'],

      providers: [ProjectDetailServiceComponent]   

})//componrnt  closing

export class ProjectDetailComponent implements OnInit  {
   moduleChild:Post[];
   increment:Post[];
 selectedMod:Post[];
 sMN:string;
 ind:number;
  //all=[];
  //temp: any[];
moduleName:Post[];
    projectName:string;
 //moduleChild:any[]=[];
 indexvalue:Post[];
 Mnvalid:any;
 validMn:string;
//charan:string
 message:string;
    show: boolean;
testExecution:boolean;
displayModule:boolean;
displayFeature:boolean;
displayImport:boolean;
showDropDown:boolean;
//dataRefresher: any;
//selectedModule:any;


    constructor(private router: Router,private route:ActivatedRoute,private module:ProjectDetailServiceComponent) {
    this.show = false;
 this.testExecution=false;
 this.displayModule=false;
 this.displayFeature=false;
 this.displayImport=false;

    }
 
 

      ngOnInit(){
        

             let dataFromProjectSelectionDropdown=sessionStorage.getItem('key');
             this.projectName=dataFromProjectSelectionDropdown;
 this.module.projectDetails().subscribe(moduleData =>{this.moduleName=moduleData;

 //this.updateLastSeen(this.moduleName);
 });

      }

// updateLastSeen(ss){
//  this.temp=ss
//   //console.log(ss)
//   //console.log(this.temp[0].moduleName)
//   //console.log(ss[0].moduleName)
//   for(var i=0; i<=this.temp.length; i++) {
//     this.all=this.temp[i].moduleName;
//     // all=this.ll
// console.log(this.all)
//   }
  

// }

manualtoggle(clickModule,index){
 this.sMN=clickModule;
 this.ind=index;
 //alert(this.ind)
//alert(index)
 
 
// this.module.childModuleDetails(clickModule)
// .subscribe(moduleData =>{this.moduleChild=moduleData;this.indexvalue=this.moduleChild[0].moduleId;console.log(this.moduleChild) });

 
this.module.moId(clickModule).subscribe(moduleData =>{this.selectedMod=moduleData;this.verificationModule(this.selectedMod)
;this.indexvalue=this.selectedMod[0].unitedFM});

//alert(this.validMn)

}

verificationModule(vMF){
  //console.log(vMF)
  this.validMn=vMF[0].moduleName;
  //alert( this.validMn)
 // console.log(vMF[0].unitedFM.length)
  //console.log(this.sMN)
  //for(var i=0;i<=vMF[0].unitedFM.length;i++){
 //console.log(vMF[0].unitedFM[i].featureName)
     //this.indexvalue=vMF[0].unitedFM[i];
  //console.log(vMF[0].unitedFM[0].featureName)
//   if (this.validMn==this.sMN){
// this.indexvalue=vMF[0].unitedFM[0].featureName;
//}

//}  


  }
   //this.Mnvalid=this.selectedMod[0].unitedFM[0].moduleName
    



 
        changeShowStatus(){
//alert( this.show)
           this.show = true;
           this.testExecution=false;
 
        }
    
        showTestExecution(){
//alert("2")
this.show = false;
   this.testExecution=true;
        }

        goCreateModule(){
          //var displayModule:string
          this.displayModule=true;
          this.displayFeature=false;
          this.displayImport=false;
setInterval(() => {
      this.ngOnInit();
 
 }, 1000);
  
    



        }
// stopInterval(){

 //   setInterval(() => {
 //      this.ngOnInit();
 
 // }, 1000);
 //   console.log("11111111111")

// }



           goCreateFeature(){
          this.displayFeature=true;
          this.displayModule=false;
          this.displayImport=false;
          //console.log("went")
          //this. ngOnDestroy()
        }
       goImport(){
         //alert("1st")
          this.displayImport=true;
          this.displayModule=false;
          this.displayFeature=false;
        }
  //        ngOnDestroy() { 

  //          //this.stopInterval()
  //          console.log("going")
  //   //this..createCP2Log(new Log('r', this.personName + ' is removed.'));
  
  // }


}
