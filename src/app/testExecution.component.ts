import { Component, OnInit} from '@angular/core';
import { Http,Response } from '@angular/http';
//import {ProjectSeServiceComponent} from './projectSelection.service';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { URLSearchParams } from '@angular/http';

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
      runn = [];
     
       moduleNames = [] ;
       featureNames = [];
       typeArray = [];
       datas = [] ;
       shivu= [];
       priorityArray = [];
       testScriptsData:Post[];
      // testScript = [];
       demoArrayaData: String = "";
       moduleId:string;
       moduleName: string;
       featureId:string;
       featureName:string;
       lineNum:string;
      projectId:string;
       srch:boolean;
       test:any;
       var2_featureName:any;
      
      
       a:any; 
       $http: any;
      c:Object={};
  projectSelection: any;
  


  constructor( private data: TestExecutionServiceComponent , private http:Http) {
    this.srch=false;      
  }
  ngOnInit() {
    this.data.projectDetails().subscribe(Data => this.moduleNames = Data) ;
    this.data.childModuleDetails1().subscribe(Data => this.featureNames = Data ) ;
    this.data.typeDetails().subscribe(Data => this.typeArray = Data) ;
    this.data.priorityDetails().subscribe(Data => this.priorityArray = Data) ;
    // this.data.testScriptDetails().subscribe(result => this.testScriptsData=result);
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
   
   this.moduleName=test.moduleName;
   this.featureName=test.featureName;
   this.lineNum=test.lineNum;
   this.projectSelection=test.projectSelection;

   var obj:Object={};
   obj["moduleName"]=this.moduleName;
   obj["featureName"]=this.featureName;
   obj["lineNum"]=this.lineNum;
   obj["projectSelection"]=this.projectSelection;
   
   this.scriptData.push(obj);
          
     console.log(this.scriptData) 
  }

 run(moduleName,featureName,lineNum,projectSelection) 
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
    
        var lineNumm = this.lineNum;
        console.log(moduleName+','+featureName+','+lineNumm+','+projectSelection);  
     
    
       
      return  this.http.post('/testScript',this.scriptData)
       .subscribe(result =>{console.log(result)});
    
  }

}
  
    



