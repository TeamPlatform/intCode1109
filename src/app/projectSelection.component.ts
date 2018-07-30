import { Component,OnInit,OnChanges,SimpleChanges,Input} from '@angular/core';
import { Router } from '@angular/router';
import { Http,Response,Headers, RequestOptions } from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { URLSearchParams } from '@angular/http';
import {ProjectSelectionServiceComponent} from './projectSelection.service';
//import {ProjectDetailComponent} from './pDetail.component';
import {Post} from './post';
@Component({
  selector: 'app-selection',
  templateUrl:'./html/projectSelection.html' ,

   providers: [ProjectSelectionServiceComponent],

   


 })//componrnt  closing

export class SelectionComponent implements OnInit, OnChanges {
   // headers: Headers;
   //  options: RequestOptions;
   theFiles:Array<File>;
   relativePath :any;
   datas:Post[]; 
   selectedDropdown:string; 
   child:string
   projectSelectionData=[];
   currentFile:any;
 
 Folder:any
   constructor(private ata:ProjectSelectionServiceComponent,private router: Router,private http:Http){
	this.theFiles= [];

   }


      ngOnInit(){
  	

          this.ata.getProjectSelectionDetails()
          .subscribe(llData => this.datas=llData, error => console.log(error));

         // console.log(this.datas)

          // this.datas=this.projectSelectionData;



      }

// filesPicked(event) {
//   //console.log(event)
//   var Folder:any;
//  var sourceFolder = new Folder("~/Desktop/code000"); 
//  console.log(sourceFolder)
// var destFolder = new Folder("~/Desktop/ingt");  
// var fileList = sourceFolder.getFiles();
// console.log(fileList)  
// for (var i = 0; i < fileList.length; i++) {  
//     if (fileList[i].copy(decodeURI(destFolder) + "/" + fileList[i].displayName)) {  
//         fileList[i].remove();  
//     }    
// } 
//     ///alert(folder[0]);
// }

 filesPicked(e) {
     let totalLength =  e.target.files.length;
    for (var i = 0; i <totalLength ; i++) {
     this.theFiles =<Array<File>>e.target.files;
//console.log(this.theFiles)

    this.relativePath = this.theFiles[i].webkitRelativePath;
    this.currentFile = this.theFiles[i];
   // console.log(this.relativePath)
    //this.upload(this.relativePath,this.theFiles[i] )
   // console.log(this.relativePath)
  //var str = "public/inline.js";
 
      var a =   this.relativePath.replace(/[/]/gi, '-');
     // console.log(a)
      //var b = 10;
        this.makeFileRequest("/projectSelection/"+a, [],this.theFiles,i,totalLength ).then((result) => {



     // this.makeFileRequest("/projectSelection", [],sendFile).then((result) => {
           // console.log(result);
        }, 
        (error) => {
            console.error("error");
        });
    
   
}

   
}

//  upload(sendPath,sendFile) {
// //console.log(sendPath)
// console.log(sendFile)
//   //var str = "public/inline.js";
  
//       var a =   sendPath.replace(/[/]/gi, '-');
//       console.log(a)
//         this.makeFileRequest("/projectSelection/"+a, [],sendFile).then((result) => {



//      // this.makeFileRequest("/projectSelection", [],sendFile).then((result) => {
//            // console.log(result);
//         }, 
//         (error) => {
//             console.error("error");
//         });
//     }
        makeFileRequest(url: string, params: Array<string>, files: Array<File>,i:number,totalLength :number) {
            console.log(' i '+i);
            // console.log("url  "+url)
            // console.log("urlparams  "+params)
            // console.log(files)
            console.log(files.length)
            // console.log(files[i].name)
            // console.log(files[i])
        return new Promise((resolve, reject) => {
            var formData: any = new FormData();
            var xhr = new XMLHttpRequest();
            // for(var i = 0; i < files.length; i++) {
            //     formData.append(this.relativePath , files[i], files[i].name);
            // }
        //   for(var i = 0; i < files.length; i++) {
          //      console.log(files.length)
                formData.append(this.relativePath , files[i]);
           // }
           //formData.append("mm",files[i] );
        
           formData.append("totalLength",totalLength );
           formData.append("currentLength",i );
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4) {
                    if (xhr.status == 200) {
                      //console.log(JSON.parse(xhr.response))
                        resolve(JSON.parse(xhr.response));
                    } else {
                        reject(xhr.response);
                    }
                }
            }
            xhr.open("POST", url, true);
            xhr.send(formData);
            //console.log("formData      "+formData)
        });
    }



          dropdownData(dataSelected){

            sessionStorage.setItem('key',this.selectedDropdown);
             this.router.navigate(['/projectDetail']);

          }

             ngOnChanges(){


             }








}