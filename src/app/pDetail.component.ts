<<<<<<< HEAD
import { Component, Input,OnInit} from '@angular/core';
=======
import { Component, Input,OnInit,OnDestroy} from '@angular/core';
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
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
<<<<<<< HEAD
  // moduleId:Post[];
moduleName:Post[];
    projectName:string;
 //moduleChild:any[]=[];
 indexvalue:number;

 message:string;
    show: boolean;
    mo:boolean;
    execute:boolean;
=======
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
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
testExecution:boolean;
displayModule:boolean;
displayFeature:boolean;
displayImport:boolean;
<<<<<<< HEAD
//selectedModule:any;

    constructor(private router: Router,private route:ActivatedRoute,private module:ProjectDetailServiceComponent) {
    this.show = false;
    this.mo=false;
    this.execute=false;
=======
showDropDown:boolean;
//dataRefresher: any;
//selectedModule:any;


    constructor(private router: Router,private route:ActivatedRoute,private module:ProjectDetailServiceComponent) {
    this.show = false;
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
 this.testExecution=false;
 this.displayModule=false;
 this.displayFeature=false;
 this.displayImport=false;
<<<<<<< HEAD
=======

>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
    }
 
 

      ngOnInit(){
<<<<<<< HEAD
//var index=0;

             let dataFromProjectSelectionDropdown=sessionStorage.getItem('key');
             this.projectName=dataFromProjectSelectionDropdown;
            this.module.projectDetails().subscribe(moduleData =>this.moduleName=moduleData);
  // this.module.childModuleDetails(index)
  //   .subscribe(moduleData =>{this.oduleChild=moduleData;console.log(this.oduleChild) });
  //     //console.log(this.moduleChild)
=======
        

             let dataFromProjectSelectionDropdown=sessionStorage.getItem('key');
             this.projectName=dataFromProjectSelectionDropdown;
 this.module.projectDetails().subscribe(moduleData =>{this.moduleName=moduleData;

 //this.updateLastSeen(this.moduleName);
 });

>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
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
 
<<<<<<< HEAD
   showDropDown:boolean;

manualtoggle(index){
 
//alert(index+"000")
 
 
this.module.childModuleDetails(index)
.subscribe(moduleData =>{this.moduleChild=moduleData;this.indexvalue=this.moduleChild[0].moduleId;console.log(this.moduleChild[0].moduleId);console.log(this.moduleChild) });
//alert(this.oduleChild.length)

// for (let i = 0; i <=this.moduleChild.length; i++) {
 
  //alert(typeof(this.oduleChild[i].featureName)+this.oduleChild[i].featureName)
  //console.log(this.moduleChild[i].moduleId)

  //this.indexvalue=this.moduleChild[i].moduleId;
  //this.showDropDown=!this.showDropDown;
  //alert(this.showDropDown)
  // this.moduleChild=this.oduleChild;
 //alert(typeof(this.oduleChild[i].moduleId)+this.oduleChild[i].moduleId)
 //var i=0;
 //this.indexvalue=this.moduleChild[i].moduleId
 
 //alert(this.indexvalue)

  // }
//  if(index==this.indexvalue){
   
  
// //console.log(this.moduleChild.featureName)
//   }

}

  



=======
 
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
    



>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
 
        changeShowStatus(){
//alert( this.show)
           this.show = true;
           this.testExecution=false;
<<<<<<< HEAD
           this.mo=false;
           this.execute=false; 
=======
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
 
        }
    
        showTestExecution(){
//alert("2")
<<<<<<< HEAD
   this.show = false;
   this.testExecution=true;
   this.mo=false;
   this.execute=false;
=======
this.show = false;
   this.testExecution=true;
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
        }

        goCreateModule(){
          //var displayModule:string
          this.displayModule=true;
          this.displayFeature=false;
          this.displayImport=false;
<<<<<<< HEAD
          //alert("yy")
          //this.router.navigate(['CreateModule'],{relativeTo:this.route})
=======
setInterval(() => {
      this.ngOnInit();
 
 }, 1000);
  
    



>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
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
<<<<<<< HEAD
=======
          //console.log("went")
          //this. ngOnDestroy()
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
        }
       goImport(){
         //alert("1st")
          this.displayImport=true;
          this.displayModule=false;
          this.displayFeature=false;
<<<<<<< HEAD
        }

        mobile(){
          this.mo=true;
          this.execute=false;
          this.show=false;

        }

        execution(){
          this.execute=true;
          this.mo=false;
          this.show=false;
=======
>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
        }
  //        ngOnDestroy() { 

  //          //this.stopInterval()
  //          console.log("going")
  //   //this..createCP2Log(new Log('r', this.personName + ' is removed.'));
  
  // }


}
