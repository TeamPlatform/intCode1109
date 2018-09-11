import { Component,OnInit} from '@angular/core';
import { Http,Response } from '@angular/http';
// import { ActivatedRoute, Router } from '@angular/router';
import { CaptureLabServiceComponent} from './captureLab.service';
import { Post } from './post';
@Component({
  selector: 'app-cap',
 
  templateUrl:'./html/captureLab.html',

     providers: [CaptureLabServiceComponent]      
     })

export class CaptureLabComponent implements OnInit  {
 
   devicesName:String;
   devicesId:String;
   dvc:boolean;
   result:Post[];
   deviceslength:string;
   DeviceId:String;
   fulldeviceslist:String[];
   detailObj=[]; 
   rowSelected:boolean;
   checkBox=[];
   selectedrow:string;
   idSelectedVote:string;
   indexx:number;
   yashwanth:string;
   deviceDetails:Object={};
   devicesFun:Function;
   apkUploadCall:Function;
   apkPath:Object={};
   filesToUpload: Array<File>;
   completepath: any;

   

   
   

   constructor(private mobileApps:CaptureLabServiceComponent,  private http:Http) {
    this.dvc=false; 
    this.filesToUpload = []; 
      }

      ngOnInit() {
        // this.mobileApps.mobileAppDetails().subscribe(mobileData => this.result = mobileData);
       }

       ////////////////////////////////////////////

       upload() {
        this.makeFileRequest("/shivaa", [], this.filesToUpload).then((result) => {
            console.log(result);
            if(result!=0)
            {
            console.log(result[0].path);
            this.completepath = result[0].path;
            console.log(this.completepath+"this.completepath");
            console.log(result[0].filename)
            alert(result[0].filename + " Installed in" + this.completepath);

            }
        }, (error) => {
            console.error(error);
        });
    }
   

    fileChangeEvent(fileInput: any){
      this.filesToUpload = <Array<File>> fileInput.target.files;
  }

  makeFileRequest(url: string, params: Array<string>, files: Array<File>) {
    return new Promise((resolve, reject) => {
        var formData: any = new FormData();
        var xhr = new XMLHttpRequest();
        for(var i = 0; i < files.length; i++) {
          console.log(files[i].name)
            formData.append("uploads[]", files[i], files[i].name);
        }
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    resolve(JSON.parse(xhr.response));
                } else {
                    reject(xhr.response);
                }
            }
        }
        xhr.open("POST", url, true);
        xhr.send(formData);
    });
}

        //   this.apkUploadCall = function()
        //  {

        //  }

       ////////////////////////////////////////////

       connect(){
        this.dvc=true;
        this.mobileApps.captureLabServiceDetails(); 
        this.getMobileDevice(); 
        }

        getMobileDevice(){
          alert("Wait for a Second")
          this.mobileApps.mobileAppDetails().subscribe(mobileData => this.result = mobileData);
          // console.log("yashwanth")
        }

        // selectrow(tag){
        //   alert(tag)
        //   console.log(tag)
        //   this.selectedrow = tag;
        //   this.idSelectedVote = tag;
        // }

        setClickedRow = function(i)
        {
          // alert(i)
          this.selectedRownew = i;
        }
        

        checkFunValue(index){
          // alert(index)
          this.indexx = index;
          console.log(this.indexx)
        }

      //   checkSelected(label: string) {
      //     this.checkBox.forEach(x => {
      //         if(x.label !== label) {
      //             x.checked = !x.checked
      //         }
      //     })
      //  }
    
    checkFun(devicesId)
    {
      // alert("inside_check");
      // alert(this.completepath);
      this.rowSelected=true;
      var numbers = {};
      numbers["devicesid"]=devicesId;
      // numbers["fullfilepath"]=this.completepath;
      this.detailObj.push(numbers);
      this.fulldeviceslist=this.detailObj;
     // alert(this.fulldeviceslist.length);
      console.log(this.fulldeviceslist); 
        
      // this.installApk(devicesId)
      //   this.deviceDetails={
      //   devicesId:devicesId
      // }

      // console.log(this.deviceDetails)
    }

    
    // submit = function(e){ 
    //     alert("inside_submit")
    //     var files = e.target.value;
    //     console.log(files)

        
    // }


    
    filesPicked(e) {
      alert("call inside")
      var files = e.target.value;
      let file = e.target.files[0];
      let fileName = file.name;
      console.log(fileName);
      this.apkPath={
        path:fileName
      }
      console.log(this.apkPath)



      this.http.post('/installApkLocally',this.apkPath,{})
      .subscribe(result =>{console.log(result)});
      // this.mobileApps.saveApkLocally(fileName)
      // .subscribe(result =>{console.log(result)}); 
      
      // let totalLength =  e.target.files.length;
      // var files = e.target.files;
      // var path = files[0].webkitRelativePath;
      // return files.replace(/\\/g,'/').replace(/\/[^\/]*$/, '');
      // console.log(files);
      // var path = files[0].webkitRelativePath;
      // console.log(path)
      // var Folder = path.split("/");

    //  this.projectName=Folder[0]
    //  alert(Folder[0]);
    //  this.createDbs(projectName)
    //  for (var i = 0; i <totalLength ; i++) {
    //  this.theFiles =<Array<File>>e.target.files;
    //  }
    }



   
    // installApk(devicesId)
    // {
    //   alert("Install Call")
    //   var yashwanth=devicesId;
    //   this.http.post('/installapk'+yashwanth ,{})
    //   .subscribe(result =>{console.log(result)});

    // }

      installApk()
      {
        console.log(this.fulldeviceslist)
        
        var deviceslength=this.fulldeviceslist.length;
          this.devicesFun = function(y)
          {
            if(y  < deviceslength)
          {
            var obj77={};
            obj77["deviceId"]=this.fulldeviceslist[y].devicesid;
            obj77["apkPath"]=this.completepath;
            this.http.post('/installapk',obj77,{})
            .subscribe(result =>{
            console.log(result)
            // alert("Apk Installed")
            });	
            this.devicesFun(y+1)
            }//ifclosingsfun
          }//closingsfun
          this.devicesFun(0);       

      }
      
      

   }
