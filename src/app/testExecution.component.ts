import { Component, OnInit} from '@angular/core';
import { Http,Response } from '@angular/http';
<<<<<<< HEAD
//import {ProjectSeServiceComponent} from './projectSelection.service';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { URLSearchParams } from '@angular/http';

=======
//import {ProjectSelectionServiceComponent} from './projectSelection.service';

>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0
import { TestExecutionServiceComponent  } from './testExecution.service';
import {Post} from './post';
@Component({
selector: 'app-test',

templateUrl:  './html/testExecution.html',
  styleUrls: ['./css/testExecution.css'],
  providers : [ TestExecutionServiceComponent ]


       }) // componrnt  closing
export class TestExecutionComponent implements OnInit  {
      //  modules : Module [] = [
      //    { moduleName : "Features" , moduleId : 1 }
      //  ]
<<<<<<< HEAD
      runn = [];
=======
>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0
     
       moduleNames = [] ;
       featureNames = [];
       typeArray = [];
       datas = [] ;
<<<<<<< HEAD
       shivu= [];
       priorityArray = [];
       testScriptsData:Post[];
=======
       priorityArray = [];
       testScriptsData = [];
>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0
      // testScript = [];
       demoArrayaData: String = "";
       moduleId:string;
       featureId:string;
       featureName:string;
       lineNum:string;
      projectId:string;
       srch:boolean;
       test:any;
       var2_featureName:any;
      
      
       a:any; 
       $http: any;
<<<<<<< HEAD
      c:Object={};
=======

>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0


  constructor( private data: TestExecutionServiceComponent , private http:Http) {
    this.srch=false;      
  }
  ngOnInit() {
    this.data.projectDetails().subscribe(Data => this.moduleNames = Data) ;
    this.data.childModuleDetails1().subscribe(Data => this.featureNames = Data ) ;
    this.data.typeDetails().subscribe(Data => this.typeArray = Data) ;
    this.data.priorityDetails().subscribe(Data => this.priorityArray = Data) ;
<<<<<<< HEAD
    // this.data.testScriptDetails().subscribe(result => this.testScriptsData=result);
=======
    this.data.testScriptDetails().subscribe(Data => this.testScriptsData = Data)
>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0
    // this.data.showDetails().subscribe(Data => this.testScript = Data)
     this.data.getProjectSelectionDetails().subscribe(Data =>this.datas=Data);

          
    this.demoArrayaData = this.moduleNames[1];

  }
  lineNu:any
  
 search(projectId,moduleId,featureId) 
 {
   if(projectId==undefined || moduleId==undefined || featureId==undefined)
   {
     alert("Please select Module and Feature")

   }
   else
   {
   this.srch=true;
   alert(projectId+","+moduleId+","+featureId) ;
   
   this.lineNu =projectId+','+moduleId+','+featureId ;
   this.data.testScriptDetails(this.lineNu).subscribe(result => this.testScriptsData=result);
  
    }
 }

 scriptData=[];
 lineNumb:any;
 row(index,test) 
 {
  //  alert("Row")  
      alert(index);
  //  alert(test.lineNum);
  
   this.lineNumb=test.lineNum;
   var obj:Object={};
   obj["moduleId"]=this.moduleId;
   obj["featureId"]=this.featureId;
   obj["lineNum"]=this.lineNumb;
   obj["projectId"]=this.projectId;
   
   this.scriptData.push(obj);
          
     console.log(this.scriptData) 
  }

<<<<<<< HEAD
 run(moduleId,featureId,lineNum,projectId) 
 { 
      alert("Run");

      // this.runn.push(
      // {
      //  "moduleId":moduleId,
      //  "featureId":featureId,
      //  "lineNum":this.lineNumb,
      //  "projectname":projectId,  
      //  })
      
      //   console.log(this.runn);  
    
        var lineNum = this.lineNumb;
        console.log(moduleId+','+featureId+','+lineNum+','+projectId);  
     
    
       
      return  this.http.post('/testScript',this.scriptData)
       .subscribe(result =>{console.log(result)});
    
  }

=======
 search(moduleId,featureName) {
   if(moduleId==undefined || featureName==undefined){
     alert("Please select Module and Feature")

   }
   else{
   this.srch=true;
  //alert(moduleId+","+featureName) ;
  let c =moduleId+','+featureName ;
  this.http.get('/getTestScriptDetails'+c,{})
  .subscribe(result =>{console.log(result)}); 
   }

 }

 vicky:any
 row(test) {
   //alert("Row")   
   //alert(test.lineNum);
//   // alert(var2_featureName.featureName);
//   // alert(var2_featureName.featureName+','+test.lineNum) ;
//   // // alert(test.lineNum) ;
//   // console.log(var2_featureName.featureName+','+test.lineNum);
     this.vicky=test.lineNum;
//   this.vicky=test.lineNum;
//  // console.log(test.lineNum);
  }

 run(featureName,projectId) { 
  // alert("Run");
  // alert(featureName)
  // alert(projectId);
  // alert(this.vicky);
  var lineNum = this.vicky;
  console.log(featureName+','+lineNum);  
  
  var c = lineNum+','+featureName+','+projectId;
 
  this.http.post('/testScript'+c,{})
  .subscribe(result =>{console.log(result)});
  // alert(c);
  // console.log(c);
 }
>>>>>>> be75818dba656454965cb2bde3be25ebf1cdd8e0
}
  
    



