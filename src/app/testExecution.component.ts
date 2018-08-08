import { Component, OnInit} from '@angular/core';
import { Http,Response } from '@angular/http';
//import {ProjectSelectionServiceComponent} from './projectSelection.service';

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
     
       moduleNames = [] ;
       featureNames = [];
       typeArray = [];
       datas = [] ;
       priorityArray = [];
       testScriptsData = [];
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



  constructor( private data: TestExecutionServiceComponent , private http:Http) {
    this.srch=false;      
  }
  ngOnInit() {
    this.data.projectDetails().subscribe(Data => this.moduleNames = Data) ;
    this.data.childModuleDetails1().subscribe(Data => this.featureNames = Data ) ;
    this.data.typeDetails().subscribe(Data => this.typeArray = Data) ;
    this.data.priorityDetails().subscribe(Data => this.priorityArray = Data) ;
    this.data.testScriptDetails().subscribe(Data => this.testScriptsData = Data)
    // this.data.showDetails().subscribe(Data => this.testScript = Data)
     this.data.getProjectSelectionDetails().subscribe(Data =>this.datas=Data);

          
    this.demoArrayaData = this.moduleNames[1];

  }

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
}
  
    



