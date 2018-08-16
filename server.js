const express=require('express');
const app=express();
const path=require('path');
var mongo = require('mongodb');
const bodyParser=require('body-parser');
//const crypto=require('crypto')//give file name
const multer=require('multer')
const GridFsStorage=require('multer-gridfs-storage')
const gridfs=require('gridfs-stream')
var mongojs=require('mongojs');
var mongoose  = require('mongoose');
var fs = require('fs');
const exec = require('child_process')
//var mongoStore = require('connect-mongo')(session);

var methodOverride = require('method-override');
var bson = require('bson');
var Promise = require('es6-promise').Promise;
//var Decimal128 = require('mongodb').Decimal128;
app.use(bodyParser.json({limit: '50mb'})); // parse application/json
app.use(bodyParser.json({ type: 'application/vnd.api+json' })); // parse application/vnd.api+json as json
app.use(bodyParser.urlencoded({limit: '50mb', extended: true,parameterLimit:50000}));// parse application/x-www-form-urlencoded

app.use(bodyParser.json());
//const api=require('./server/routes/api')

app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
});



app.use(express.static(path.join(__dirname,'dist')));

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:true}));


var db=mongojs('collections',['asd'])
console.log(db)

//for folders
mongoose.connect('mongodb://localhost:27017/collections')
mongoose.Promise = global.Promise;

gridfs.mongo = mongoose.mongo;
/*
  Check MongoDB connection
*/
var connection = mongoose.connection;
// const upload = multer({
//   dest: './uploads/' // this saves your file into a directory called "uploads"
// }); 
  //var gfs = gridfs(connection.db);
var shell = require("shelljs");



// Mongo URI
const mongoURI = 'mongodb://localhost:27017/collections';

// Create mongo connection
const conn = mongoose.createConnection(mongoURI);

// Init gfs
var gfs;






conn.once('open', () => {
  // Init stream
  gfs = gridfs(conn.db, mongoose.mongo);
 
   gfs.collection('folder');
//   gfs.files.find().toArray(function (err, files) {
 
//     console.log(files.length)
//     console.log(files)
// })  

});

// gfs = gridfs(conn.db, mongoose.mongo);
// gfs.collection('folder');
 
//Create storage engine
const storage = new GridFsStorage({
  url: mongoURI,
  file: (req, file) => {
    return new Promise((resolve, reject) => {
      //crypto.randomBytes(16, (err, buf) => {
 
        var path = req.params.a;
        var latestPath =   path.replace(/[-]/gi, '/');
       
        let data_Array = latestPath.split("/");
     
        var latestPath123 = data_Array.splice(data_Array.length-1);
 var myJSON = JSON.stringify(latestPath123);
           
             latestPath = latestPath.substring(0, latestPath.length - myJSON.length+3); // "12345.0"
     
      
       // var newDestination = 'uploads/' + latestPath;




        // if (err) {
        //   return reject(err);
        // }
        
        const filename = file.originalname;
       

        const fileInfo = {
            metadata:'uploads/'+latestPath,
          filename:filename,
          contentType :data_Array[0],
          bucketName: 'folder'
        };
        resolve(fileInfo);
    //  });
    });
  }
});
const upload = multer({ storage });

//var a = 1;

app.post("/projectSelection/:a",upload.any(),function(req, res,next) {

// var projectID=null;
// var projectCount=null;


 // var err = null;
 //    try {
         decodeURIComponent(req.path)
 //    }
 //    catch(e) {
 //        err = e;
 //    }

//next()
//  db.countInc.find({},function(err,doc){
//   console.log(doc[0])
//      projectID=doc[0].projectID
//    projectCount=doc[0].pCount
    
// })

//console.log(projectName)





// let lengthCount = Number(req.body.totalLength-1);
//   if( Number(req.body.currentLength) === Number(req.body.totalLength-1)){

// var projectName = req.files[0].fieldname.split("/");
 
//  setTimeout(function() {
//  projectCount++
//  pID=projectID+projectCount

     
  
//   console.log(pID+"qwweerrrrrrrrrrrr")
// //console.log(pID)

//     db.projectSelection.insert({"projectSelection":projectName[0],"projectId":pID})
// },3000)


// }
    // let projectName = req.files[0].fieldname.split("/");
//     var trialCall = function() {
//         //  setTimeout(function() {
//           //console.log("Task 311111111111113333333333333333333333333333  ");
//          // conn.once('open', () => {
//             // Init stream
//             // gfs = gridfs(conn.db, mongoose.mongo);
           
//             //  gfs.collection('folder');
//            var  lengthCount =1910;
//           gfs.files.find({contentType:projectName[0]}).toArray(function (err, files) {
      
//             //console.log("files length  "+files.length)
//              let lengthCheck = files.length -1 ; 
//              var totalfiles=files.length
//            //  console.log(files)
//              let i = 0;
//             // for(m =1;m<=lengthCount;m++){
//                //console.log(" heelo 3 "+i)
    
//            //return new Promise((resolve, reject) => {
      
               
//              //files.forEach(function(files) {
//                 //trialcall1(0)
//                 let m =0;
//               var  trialcall1 =  function(m){
//                     if(m=== lengthCheck){
//                       //   setTimeout(function(){

                      
//                       //   createDbs(files[m].contentType)
                    
//                       // },30000);
//                        // createDbs(files[m].contentType)
//                         //console.log(m+" no loop "+"   "+files[m].filename) 
//                     }else{
//                         shell.mkdir('-p',"./"+files[m].metadata)
      
//              const stream = gfs.createReadStream(files[m].filename);
      
//           var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
      
      
//               stream.pipe(eam);
//               m++;
//               console.log(m+" no loop "+"   "+totalfiles) 
//                                  if(m==totalfiles-1){
//                       console.log("ouyyyyyyyyyyyyyyyyyyy")
//          //waitfor()
//          // db.countInc.insert({"projectID":"pID","moduleID":"mID","featureID":"fID","scriptID":"sID","pCount":1,"sCount":1,"mCount":1,"fCount":1})
//                     var wait=parseInt(m*20);
// setTimeout(function() {
 
//   //wait function must bec files will created but data inside file not created bec
//   //of that testscript will wont work 
//         createDbs(files[m].contentType)
//         res.json("Imported Succesffully")


//       },wait)
       
 
        
//              }
//               //console.log(m+" exectutr loop "+"   "+files[m].filename) 
//                         trialcall1(m)
//                     }
//                 }  
//                 trialcall1(0)
             
      
      
//             })
    
//             // resolve(fileInfo);
            
//        // });
//           // }//)
//         // })//gfs
//        // }) 
      
//           }
    //  console.log("iam project"+ projectName[0]);
    //trialCall();

//}   

res.json([]);

    
});
// var ath=__dirname+"/uploads/odule"

// if(fs.existsSync(ath)){
//  console.log("llllll") 
// }
// else{
//  console.log("fffffffllllll")  
// }


//  app.get('/createFolder:data',function(req,res){
//    console.log("uiiiiiiiiiiiiiii"+req.params.data)
// var projectName=req.params.data;
// var onlyOnce=1
// if(  onlyOnce===1 ){

//     var trialCall = function() {
      
//            var  lengthCount =2910;
//           gfs.files.find({contentType:projectName}).toArray(function (err, files) {
      
        
//              let lengthCheck = files.length -1 ; 
//              var totalfiles=files.length
       
//              let i = 0;
          
//                 let m =0;
//               var  trialcall1 =  function(m){
//                     if(m=== lengthCheck){
                  
//                     }else{
//                      var checkPath= __dirname+"/"+files[m].metadata+"/"+files[m].filename
//                       console.log(checkPath)
//                       if(!fs.existsSync(checkPath)){
//                         console.log("juuuuuuuuueee")
//                         shell.mkdir('-p',"./"+files[m].metadata)
                      
      
//              const stream = gfs.createReadStream(files[m].filename);
      
//           var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
      
      
//               stream.pipe(eam);
//             }
//               m++;
//               console.log(m+" no loop "+"   "+totalfiles) 
//                                  if(m==totalfiles-1){
//                       console.log("ouyyyyyyyyyyyyyyyyyyy")
//          //waitfor()
//                     var wait=parseInt(m*20);
//                     var messageWait=wait*15;
// setTimeout(function() {
//   //wait function must bec files will created but data inside file not created bec
//   //of that testscript will wont work 
//         createDbs(files[m].contentType)
        


//       },wait)
//  setTimeout(function() {
       
//  res.json("Succesffully CreateDbs")
//  },messageWait)
        
//              }
//               //console.log(m+" exectutr loop "+"   "+files[m].filename) 
//                         trialcall1(m)
//                     }
//                 }  
//                 trialcall1(0)
             
      
      
//             })
    
//             // resolve(fileInfo);
            
//        // });
//           // }//)
//         // })//gfs
//        // }) 
      
//           }
//     //  console.log("iam project"+ projectName[0]);
//     trialCall();

// }   
// else{
// res.json([]);
// }

//  //res.json("Please Wait File Is Synchronizing");

//  })///open

 app.get('/createFolder:data',function(req,res){
   console.log("uiiiiiiiiiiiiiii"+req.params.data)
var projectName=req.params.data;
var onlyOnce=1
if(  onlyOnce===1 ){

    var trialCall = function() {
      
           var  lengthCount =2910;
          gfs.files.find({contentType:projectName}).toArray(function (err, files) {
      
        
             let lengthCheck = files.length -1 ; 
             var totalfiles=files.length
       
             let i = 0;
          
                let m =0;
              var  trialcall1 =  function(m){
                    if(m=== lengthCheck){
                  
                    }else{
                     var checkPath= __dirname+"/"+files[m].metadata+"/"+files[m].filename
                      console.log(checkPath)
                      if(!fs.existsSync(checkPath)){
                        console.log("juuuuuuuuueee")
                        shell.mkdir('-p',"./"+files[m].metadata)
                      
      
             const stream = gfs.createReadStream(files[m].filename);
      
          var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
      
      
              stream.pipe(eam);
            }
              m++;
              console.log(m+" no loop "+"   "+totalfiles) 
                                 if(m==totalfiles-1){
                      console.log("ouyyyyyyyyyyyyyyyyyyy")
         //waitfor()
                    var wait=parseInt(m*20);
                    var messageWait=wait*15;
setTimeout(function() {
  //wait function must bec files will created but data inside file not created bec
  //of that testscript will wont work 
        createDbs(files[m].contentType)
        


      },wait)
 setTimeout(function() {
       
 res.json("Succesffully CreateDbs")
 },messageWait)
        
             }
              //console.log(m+" exectutr loop "+"   "+files[m].filename) 
                        trialcall1(m)
                    }
                }  
                trialcall1(0)
             
      
      
            })
    
            // resolve(fileInfo);
            
       // });
          // }//)
        // })//gfs
       // }) 
      
          }
    //  console.log("iam project"+ projectName[0]);
    trialCall();

}   
else{
res.json([]);
}

 //res.json("Please Wait File Is Synchronizing");

 })
  
//const Filehound = require('filehound');
    

// Filehound.create()
//   //.ext('')
//   .match('module')
//   .paths("./uploads"+"/"+'module')
//   .find((err, htmlFiles) => {
// console.log(htmlFiles)
//  htmlFiles.forEach(function(file) {
//    console.log(file) 
//   })
//   })



   

 
// creating file names and module and projects
var aCount = null;
  var smId=null;
   var sfID=null;
   var ssID=null;
   //var pIDSyn=null;
    var proID=null;
    var  pCount=null;
     var  mCount=null;
      var  fCount=null;
       var  sCount=null;
    var pID=null;
var moduleCount = 1;

var createDbs = function(folderName) {
 // db.projectSelection.find({}).sort({_id:-1},function(err,doc){
 // //console.log(doc[0])
 //        pID=doc[0].projectID
         
 //      })
   
   db.countInc.find({},function(err,doc){
  
    proID=doc[0].projectID
   pCount=doc[0].pCount
     mCount=doc[0].mCount
       fCount=doc[0].fCount
         sCount=doc[0].sCount
   smId=doc[0].moduleID
      sfID=doc[0].featureID
        ssID=doc[0].scriptID

//console.log(pID+"uiiiii")
   
   })
    moduleCount = 1;
    const Filehound = require('filehound');
    

Filehound.create()
  .ext('feature')
 // .match('*a*')
  .paths("./uploads"+"/"+folderName)
  .find((err, htmlFiles) => {
      let start = 1;
    if (err) return console.error("handle err", err);
 //var cc=0;
 var incFileID=0;


  setTimeout(function() {
 pCount++
 pID=proID+pCount

     
  
  console.log(pID+"qwweerrrrrrrrrrrr")
//console.log(pID)

    db.projectSelection.insert({"projectSelection":folderName,"projectId":pID})
},3000)
     //passingID(pID)
 // });


        
setTimeout(function() {
    htmlFiles.forEach(function(file) {
console.log(pID+"ppp")
   // ff++

    // console.log( sID)
 
    
    let data_Array = file.split("\\");
     let mName = file.split("\\",(data_Array.length-1)).pop()



       createModuleAndFeature(file,data_Array,pID);
   


   });

 },9000)

 
  });
}//createDbs ()

//createDbs("projectjavatriall75645")
 // var incId=0;
 //    for (var j =0;j<=5; j++) {
 //     console.log(incId++)
 //     //console.log(j++)
 
 //   }
//
var check=[]
let createModuleAndFeature = function(data,data_Array,pID){
  mCount++
fCount++
 var mId=smId+mCount

// sCount++

   
    var fID=sfID+fCount
    //var sID=ssID+sCount
     //console.log(mId) 
   // console.log(aCount) 
   //console.log( fID)
    // for module creation 
   //var cc=0;
   //console.log(dd)
 // console.log("eeeeeeeeeeeeeeeeee  ");
   //console.log("wwwwwwwwwwww  "+data_Array);
   let modulesName = data.split("\\",(data_Array.length-1)).pop() ;
   //let anotherModuleName = data.split("\\",(data_Array.length-1)).pop() ;
    console.log("modulesNameeeeeeeeeeeeeeeeee  "+modulesName);
   
    // console.log(moduleCount+"kkkjjjjj")
// if(modulesName){

// }
 


//console.log(check.includes(modulesName))
if(check.includes(modulesName)===false){
 
  db.moduleName.insert({"moduleName":modulesName,"moduleId":mId,"projectId":pID})

check.push(modulesName)
}

   // for feature creation 
    let featureNames = data.split("\\",(data_Array.length)).pop() ;
    let featureNameWitoutExt = featureNames.replace(".feature", "");
    db.featureName.insert({"featureName":featureNameWitoutExt,"featureId":fID,"moduleId":mId,"projectId":pID})
    createTestScript( data,featureNameWitoutExt,fID,mId,pID)


}


  var forUpdate=1;
let createTestScript = function(file,featureName,fID,mId,pID){
//console.log( "qqqqqqqqqqqqqqqqqq");
    let count =1;
  
    //console.log(file);
    var LineByLineReader = require('line-by-line');
   // lr = new LineByLineReader("./uploads/projectjavatriall756/Sample1/Features/abc.feature")
   // lr = new LineByLineReader("uploads/projectjavatriall7564/Sample1/Features/abc.feature")
    lr = new LineByLineReader(file)
    //console.log(lr)
    lr.on('error', function (err) {
        // 'err' contains error object
        //console.log(" error rr rr rr ")
    });
    
    lr.on('line', function (line) {
      //console.log(line.length+"Opqqqqq")
        //console.log(" line line rr rr rr ")
        //console.log(count +" "+line)
        if(line.includes("Scenario") == true){
sCount++
var sID=ssID+sCount
          //console.log("oooooooooooooooooooooooooooooooooooooo")
            var res = line.substr(line.indexOf(":")+1);
            //var scId=res+count
            db.testScript.insert({"scriptName":res,"featureId":fID,"moduleId":mId,"scriptId":sID,"lineNum":count,"projectId":pID})
  
         // console.log(count+"   Scenario  true ")
          count++;
    
        }else{
            count++;
          //  console.log(" false  ")    
        }
        
        // 'line' contains the current line without the trailing newline character.
    });
    
    lr.on('end', function () {
     
      // if(forUpdate===1){
      //   console.log("uuuuuuuuuuuuuuuu") 
      
db.testScript.find({},function(err,doc){
    //console.log(doc[0])
//  var uSCount=doc[0].scriptId
//            var sSPCount=uSCount.split("sID")
// var fSCount=parseInt(sSPCount[1])
var fSCount=doc.length
     //var id=doc[0]._id
 db.featureName.find({},function(err,doc){    
//     var uPCount=doc[0].projectId
//     console.log(uPCount+"ppppppppppppp")
//     var splitUPCount=uPCount.split("pID")
// var finalPCount=parseInt(splitUPCount[1])
  var fFCount= doc.length  

 db.moduleName.find({},function(err,doc){  
    //console.log(typeof(finalPCount)+finalPCount)
//      var uMCount=doc[0].moduleId
//          var sMPCount=uMCount.split("mID")
// var fMCount=parseInt(sMPCount[1])
var fMCount=doc.length
 db.projectSelection.find({},function(err,doc){  
  var finalPCount=doc.length
//       var uFCount=doc[0].featureId
//           var sFPCount=uFCount.split("fID")
// var fFCount=parseInt(sFPCount[1])
      
   

db.countInc.find({},function(err,doc){
 // console.log(doc[0]._id)
  var id=doc[0]._id
   db.countInc.update({_id : mongojs.ObjectId(id)},{$set:{"sCount":fSCount,
    "pCount":finalPCount,"mCount":fMCount,"fCount":fFCount}})
 })
      //console.log(doc.length)
    })//projectSelection
    })//moduleName
    })//featureName     
      })//testScript

       //console.log(cou)
  
   //      forUpdate++
   // }


      console.log("  end end  Scenario  true ") 
        // All lines are read, file is closed now.
    });
}
// var file = 'uploads\\projectjavatriall756\\Sample1\\Features\\abc.feature';
// var featureName = "abc.feature";
// var moduleName = "feature";
// createTestScript(file,featureName,moduleName)



 


app.get('/mobileAppsDetails',function(req,res){
    db.mobileApps.find({},function(err,doc){
        res.json(doc);
       console.log(doc) ;
    })
  })
app.get('/selectionProject',function(req,res){
    db.projectSelection.find({},function(err,doc){
        res.json(doc);
       console.log(doc) ;
    })
  })

app.post('/postDevicesName',function(req,res)
{
            // var str=abc.split("");
            // var str1=str[0];
            // console.log(str1)
            // var str2=str[1];
            // console.log(str2)
    db.mobileApps.insert(req.body,function(err,doc)
        {
        res.json(doc);
        console.log(doc)
       });


})
app.get('/getTestScriptDetails',function(req,res){
    console.log("getTestScriptDetails")      
    db.testScript.find({},function(err,doc){
    res.json(doc);
    console.log(doc);
    })
})


app.post('/testScript:ss',function(req,res){
    console.log("llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll")
    var data = req.params.ss;
    console.log(data);
    var data_Array = data.split(",");
    var lineNum = data_Array[0];
    var featureName = data_Array[1];
    var projectId = data_Array[2];
    var projectNamePath = "/"+projectId;
    console.log(featureName+'.'+lineNum+'.'+projectNamePath);
        const Filehound = require('filehound');

Filehound.create()
  .ext('java')
  .match('*TestRunnerNew.java*')  //  .match('*TestRunnerNew.java*')
  .paths("./uploads/"+projectNamePath)
  
  .find((err, htmlFiles) => {
    if (err) return console.error("handle err", err);
        console.log(projectNamePath)
        console.log(featureName+'.'+lineNum);
        
    var lineString = "\"Features/"+featureName+".feature:"+lineNum+"\"";
    console.log(lineString);
    console.log(htmlFiles);
    var fs = require('fs');
 var stream = fs.createWriteStream(htmlFiles[0]);
 stream.once('open', function(fd) {
   stream.write("package com.zephyr.testrunner;\n\n");
   stream.write("import org.junit.runner.RunWith;\n\n");
   stream.write("import cucumber.api.CucumberOptions;\n");
   stream.write("import cucumber.api.junit.Cucumber;\n");
   stream.write("import cucumber.api.testng.AbstractTestNGCucumberTests;\n\n");
   stream.write("@RunWith(Cucumber.class)\n");

   stream.write("@CucumberOptions(features="+"{"+lineString+"},"+"\n\n");

   stream.write("//tags={"+"@Import1,@Export11,@Map1,@search1,@Edit1,@DND1"+"},\n\n");
   stream.write("glue={\"com.zephyr.stepdefinition\"},\n");
   stream.write("plugin = {\"html:target/cucumber-html-report\",\n");
   stream.write("\"pretty:target/cucumber-pretty.txt\",\n")
   stream.write("\"json:target/cucumber6.json\"},\n")
   stream.write("monochrome = false)\n\n")
   stream.write("public class TestRunnerNew extends AbstractTestNGCucumberTests\n")
   stream.write("{\n")
   stream.write("}\n")
   stream.end();
   console.log("Replaced");
   execTestRunner( projectNamePath)
 });
 });
       
 
    

    })

    var execTestRunner = function( projectName){
        const Filehound = require('filehound');
        console.log(" i am ready ")
        console.log(__dirname)
        
        var fs = require('fs');    
        var requiredPath = __dirname+"\\trial.bat";         
        var projectNamePath = "/"+projectName;
    Filehound.create()
    .ext('xml')
    .match('*pom.xml*')
    .paths( "./uploads/"+projectNamePath)
    .find((err, htmlFiles) => {
        if (err) return console.error("handle err", err);
        var stream = fs.createWriteStream(requiredPath);
            console.log(htmlFiles);
            
           
            let latest = htmlFiles[0].slice(0,(htmlFiles[0].length - 8));
            
              console.log(latest);
            stream.write("@echo off\n");
            stream.write("cd .\\"+latest+" && mvn clean install");
            console.log(latest)
            finalExecution()
          
        
        })
         
                    
}    


var finalExecution = function(){

    console.log(" final executryeriuyteriu "+__dirname)
   
        require('child_process').exec(__dirname+"/trial.bat", (err, stdout, stderr) => {
            if (err) throw err;
              
            console.log(stdout, stderr);       
          });   
}      
 //finalExecution()        TestRunnerNew_TPE          


// var a = function(){

//     const Filehound = require('filehound')
//     console.log(__dirname)
//     Filehound.create()
//       .ext('java')
//       .match('*TestRunnerNew.java*')
//       .paths("D:\\vickyopal\\charancode\\code3107\\uploads"+"\\Batch5_Development")
//       .find((err, htmlFiles) => {
//         if (err) return console.error("handle err", err);
//         console.log("error   "+htmlFiles[0])
        
//       })
// }

// a()



   

app.get('/loginDetails',function(req,res){
     
    // console.log("ooooooooooooooooooo")
     db.loginDetails.find({"userName":"Admin"},function(err,doc){        
         res.json(doc);
         // console.log("kkkkkkkkkkkkkkk"+doc)
     })
 })
 app.get('/selectionProject',function(req,res){
    console.log("qqqqqqqq")  
   
     db.projectSelection.find({},function(err,doc){        
         res.json(doc);
         // console.log("mm"+doc)
     })
 })
 app.get('/importType',function(req,res){
      
   console.log("kkkkkkkkkkkkkkkkkkkkk")
     db.types.find({},function(err,doc){        
         res.json(doc);
          //console.log(doc)
     })
 })
 app.get('/importPriority',function(req,res){
      
   
     db.priority.find({},function(err,doc){        
         res.json(doc);
         // console.log("mm"+doc)
     })
 })
 // app.get('/idIncrement',function(req,res){
      
 //   console.log("kkkkkkkkkkkkkkkk")
 //     db.dataIds.find({},function(err,doc){        
 //         res.json(doc);
 //         console.log(doc)
 //     })
 // })
 app.get('/getModuleName',function(req,res){
      
      //console.log("gggggggggggggggggggg")
   
     db.moduleName.find({},function(err,doc){        
         res.json(doc);
        // console.log(doc)
     })
     // db.moduleName.find({}).sort({_id:-1}).limit(1,function(err,doc)
     // {
     //     res.json(doc);
     //     //console.log(doc);
     // })
 })
 app.get('/idModule',function(req,res){
      
      
   
  
     db.moduleName.find({}).sort({_id:-1}).limit(1,function(err,doc)
     {
         res.json(doc);
         //console.log(doc);
     })
 })
 app.get('/idFeature',function(req,res){
      
      
   
  
     db.featureName.find({}).sort({_id:-1}).limit(1,function(err,doc)
     {
         res.json(doc);
         //console.log(doc);
     })
 })
 app.get('/featureName',function(req,res){
      
      
   
     db.featureName.find({},function(err,doc){        
         res.json(doc);
         //console.log(doc)
     })
 })
 // app.get('/getMoId:mI',function(req,res){
 //      console.log("llllllllllllllllll")
 //      var moduleName=req.params.mI
 //      //moduleName1 = parseInt(moduleName1);
 //   //console.log(moduleName1+"llllllllllllllllll")
 //     db.moduleName.find({"moduleName":moduleName},function(err,doc){        
 //         res.json(doc);
 //         console.log(doc)
 //     })
 // })
 app.get('/getMoId:mI',function(req,res){
   console.log("mmmmmmmmmmmmmmmmmm")
    var moduleName=req.params.mI
   db.moduleName.aggregate([
 {$match:{"moduleName":moduleName}},
 
 
 
 {"$lookup":
     {"from":"featureName",
       "localField":"moduleId",
         "foreignField":"moduleId",
          "as":"unitedFM"
      }
  }
 ],function(err,doc){
   res.json(doc);
   //console.log(doc)
 })
 
 })
 app.get('/mId:mN',function(req,res){
      console.log("llllllllllllllllll")
      var moduleName=req.params.mN
      //moduleName1 = parseInt(moduleName1);
   console.log(moduleName+"llllllllllllllllll")
     db.moduleName.find({"moduleName":moduleName},function(err,doc){        
         res.json(doc);
        // console.log(doc)
     })
 })
 app.post('/postModuleName',function(req,res)
 {
  //console.log("wwwwwwwwwwwwwww")
    //var moduleName=req.params.moduleName;
    
     //var moduleName = str_array[1];
 console.log(req.body.moduleName)
 
 
     db.moduleName.insert(req.body ,function(err,doc)
         {
         res.json(doc);
     
        });
 
 
 })
 app.post('/postFeatureName',function(req,res)
 {
 
    //var moduleName=req.params.moduleName;
    
     //var moduleName = str_array[1];
 //console.log("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk")
 
     db.featureName.insert(req.body ,function(err,doc)
         {
         res.json(doc);
         //console.log(doc)
        });
 
 
 })
 app.post('/savingImportData',function(req,res) {
    console.log("data data data data data data data data");
   //  var datastr=req.params.datareceipt;
  
   //  var datastr_array=datastr.split(",");
   // var pname=datastr_array[0];
   // // var tran=datastr_array[1];
   // // var vNo=datastr_array[2];
   // console.log(pname)
 //console.log("oooooooooooooooooo")
 //console.log(req.body)
   db.importScript.insert(req.body,function(err,doc){
 //console.log("5gggggggggggggggggggggggg")
         res.json(doc);
         //console.log(doc);
       })
 
 })
 //require('./server/serverTestExecution')(app);
// module.exports = app;
 app.get('*',(req, res)=> {
 
   res.sendFile(path.join(__dirname,'dist/index.html'));
 });
 const port=1666;
app.listen(port,function() {
  console.log("server running on port"+port);
  // body...
});
