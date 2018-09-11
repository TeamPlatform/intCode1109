const express=require('express');
const app=express();
const path=require('path');
var mongo = require('mongodb');
const bodyParser=require('body-parser');
// <<<<<<< HEAD
// =======
var rimraf = require('rimraf');
// >>>>>>> c49741cc4aec1c2a80e1403f702de05f8427cec7
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


var db=mongojs('Platform',['loginDetails','projectSelection','mobileApps'])
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



app.post("/projectSelection/:a",upload.any(),function(req, res,next) {

   let projectName = req.files[0].fieldname.split("/");
 
  var path=__dirname+"/uploads/"+projectName[0]
                          //  console.log(path)
let lengthCount = Number(req.body.totalLength-1);
 
                                  // if()
 if( Number(req.body.currentLength) === Number(req.body.totalLength-1) && !fs.existsSync(path)){
 
    var trialCall = function() {
        //  setTimeout(function() {
      //console.log("Task 311111111111113333333333333333333333333333  ");
         // conn.once('open', () => {
            // Init stream
            // gfs = gridfs(conn.db, mongoose.mongo);
           
            //  gfs.collection('folder');
           var  lengthCount =1910;
          gfs.files.find({contentType:projectName[0]}).toArray(function (err, files) {
  
            //console.log("files length  "+files.length)
             let lengthCheck = files.length -1 ; 
             var totalfiles=files.length
           //  console.log(files)
             let i = 0;
            // for(m =1;m<=lengthCount;m++){
               //console.log(" heelo 3 "+i)
    
           //return new Promise((resolve, reject) => {
      
               
             //files.forEach(function(files) {
                //trialcall1(0)
                let m =0;
              var  trialcall1 =  function(m){
                    if(m=== lengthCheck){
                      //   setTimeout(function(){

                      
                      //   createDbs(files[m].contentType)
                    
                      // },30000);
                       // createDbs(files[m].contentType)
                        //console.log(m+" no loop "+"   "+files[m].filename) 
                    }else{
                        shell.mkdir('-p',"./"+files[m].metadata)
      
             const stream = gfs.createReadStream(files[m].filename);
      
          var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
      
      
              stream.pipe(eam);

              m++;
                              if(m==totalfiles-1 ){
  eam.on('finish', function(){


                console.log("ffffffffffffffff")

createDbs(files[m].contentType)
        res.json("Imported Succesffully")



              });

}

   
              //console.log(m+" no loop "+"   "+totalfiles)
             
//                                  if(m==totalfiles-1 ){
                         
//                       console.log("ouyyyyyyyyyyyyyyyyyyy")
//          //waitfor()
//          // db.countInc.insert({"projectID":"pID","moduleID":"mID","featureID":"fID","scriptID":"sID","allCount":1})
                    
//                     var wait=parseInt(m*20);

  
// setTimeout(function() {
 
//   createDbs(files[m].contentType)
//         res.json("Imported Succesffully")


//       },wait)

       
 
     
             
//            }
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
    
});



   

   
   // trial start 

// var trialCall123 = function() {
//     //  setTimeout(function() {
//       //console.log("Task 311111111111113333333333333333333333333333  ");
//       conn.once('open', () => {
//         // Init stream
//         gfs = gridfs(conn.db, mongoose.mongo);
       
//          gfs.collection('folder');
//        var  lengthCount =1910;
//       gfs.files.find({contentType:"projectjavatriall7564"}).toArray(function (err, files) {
  
//         //console.log("files length  "+files.length)
//          let lengthCheck = files.length - 1 ; 
//        //  console.log(files)
//          let i = 0;
//         // for(m =1;m<=lengthCount;m++){
//            //console.log(" heelo 3 "+i)

//        //return new Promise((resolve, reject) => {
  
           
//          //files.forEach(function(files) {
//             //trialcall1(0)
//             let m =0;
//           var  trialcall1 =  function(m){
//                 if(m==lengthCheck){
//                    // console.log(m+" no loop "+"   "+files[m].filename) 
                    
//                    // setTimeout(, 1500 );
//                     // setTimeout(function(){

//                     //     // Current time in milliseconds
//                     //     //console.log(new Date().getTime()); 
//                     //     createDbs(files[m].contentType)
                    
//                     //   },15000);
//                 }else{
//                     shell.mkdir('-p',"./"+files[m].metadata)
  
//          const stream = gfs.createReadStream(files[m].filename);
  
//       var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
  
  
//           stream.pipe(eam);
//           m++;
//           //console.log(m+" exectutr loop "+"   "+files[m].filename) 
//                     trialcall1(m)
//                 }
//             }  
//             trialcall1(0)
         
  
  
//         })


app.get('/createFolder:data',function(req,res){
   console.log("uiiiiiiiiiiiiiii"+req.params.data)
var projectName=req.params.data;
  var projectPath=__dirname+"/uploads/"+projectName
var onlyOnce=1
if(  onlyOnce===1 && !fs.existsSync(projectPath) ){
    onlyOnce++
    var trialCall = function() {
        console.log("aaaaaaaaaaaaaaauiiiiiiiiiiiiiii")
           var  lengthCount =2910;
          gfs.files.find({contentType:projectName}).toArray(function (err, files) {
      
        
             let lengthCheck = files.length -1 ; 
             var totalfiles=files.length
       
             let i = 0;
          
                let m =0;
              var  trialcall1 =  function(m){
                    if(m=== lengthCheck){
                  
                    }else{
                 
                    
                        console.log("juuuuuuuuueee")
                        shell.mkdir('-p',"./"+files[m].metadata)
                      
      
             const stream = gfs.createReadStream(files[m].filename);
      
          var eam = fs.createWriteStream(__dirname+"/"+files[m].metadata+"/"+files[m].filename);
      
      
              stream.pipe(eam);
              // eam.on('finish', function(){
              //   console.log("ffffffffffffffff")
              // });
        
              m++;
              console.log(m+" no loop "+"   "+totalfiles) 
        
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

res.json("Synchronized Done");
}   




 //res.json("Please Wait File Is Synchronizing");

 })
  
 
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
 
 console.log(ssID+"aa"+sfID+"aa"+ smId+"aa"+sCount+"aa"+fCount+"aa"+mCount+"aa"+pCount+"aa"+proID)
    moduleCount = 1;
    const Filehound = require('filehound');
    

Filehound.create()
  .ext('feature')
 // .match('*a*')
  .paths("./uploads"+"/"+folderName)
  .find((err, htmlFiles) => {
    //console.log("htmlFilessssssssssssssss"+htmlFiles)
     var filesLength=htmlFiles.length
    // console.log(htmlFiles.length)
    // console.log(htmlFiles[0].length)
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



       createModuleAndFeature(file,data_Array,pID, filesLength);
   


   });

  },6000)

 
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
var mId=null;
let createModuleAndFeature = function(data,data_Array,pID,filesLength){
 
fCount++


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
  mCount++
  mId=smId+mCount
  db.moduleName.insert({"moduleName":modulesName,"moduleId":mId,"projectId":pID})

check.push(modulesName)
}else{

mId=smId+mCount
}
   // for feature creation 
    let featureNames = data.split("\\",(data_Array.length)).pop() ;
    let featureNameWitoutExt = featureNames.replace(".feature", "");
    db.featureName.insert({"featureName":featureNameWitoutExt,"featureId":fID,"moduleId":mId,"projectId":pID})
   console.log("1111111111111111111111111"+filesLength)

    createTestScript( data,featureNameWitoutExt,fID,mId,pID,filesLength)


}


  var forUpdate=1;
  var sID=null;
let createTestScript = function(file,featureName,fID,mId,pID,filesLength){
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
 sID=ssID+sCount
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
     // console.log("2222222222222222222222"+filesLength)
     // console.log("33333333333333333"+forUpdate)
        if(forUpdate===filesLength){
        console.log("uuuuuuuuuuuuuuuu"+fID) 
      //fID,mId,pID
// db.testScript.find({}).sort({_id:-1},function(err,doc){
//     //console.log(doc[0])
//   var uSCount=doc[0].scriptId
            var fFCount=fID.split("fID")
            var fCount=parseInt(fFCount[1])
          
           console.log("uuuuuu"+fCount) 
            var fMCount=mId.split("mID")
             var mCount=parseInt(fMCount[1])
            var fPCount=pID.split("pID")
             var pCount=parseInt(fPCount[1])
            var fSCount=sID.split("sID")
             var sCount=parseInt(fSCount[1])
 

      db.countInc.update({"projectID":"pID"},{$set:{ "fCount":fCount,"sCount":sCount,
    "pCount":pCount,"mCount":mCount}})
            //console.log(pCount+","+mCount+","+fCount+","+sCount)
//            var fSCount=parseInt(sSPCount[1])
// //var fSCount=doc.length
//      //var id=doc[0]._id
//  db.featureName.find({}).sort({_id:-1},function(err,doc){    
//     var uFCount=doc[0].featureId
// //     console.log(uPCount+"ppppppppppppp")
//     var sFCount=uFCount.split("fID")
//      var fFCount=parseInt(sFCount[1])
// // var finalPCount=parseInt(splitUPCount[1])
//   //var fFCount= doc.length  

//  db.moduleName.find({}).sort({_id:-1},function(err,doc){  
//     //console.log(typeof(finalPCount)+finalPCount)
//       var uMCount=doc[0].moduleId
//           var sMPCount=uMCount.split("mID")
// var fMCount=parseInt(sMPCount[1])
// //var fMCount=doc.length
//  db.projectSelection.find({}).sort({_id:-1},function(err,doc){  
//   ///var finalPCount=doc.length
//        var uPCount=doc[0].projectId
//         var sPCount=uPCount.split("pID")
//  var finalPCount=parseInt(sPCount[1])
      
   

// db.countInc.find({},function(err,doc){
//  // console.log(doc[0]._id)
//   var id=doc[0]._id
  
 // })
      //console.log(doc.length)
    // })//projectSelection
    // })//moduleName
    // })//featureName     
    //   })//testScript

       //console.log(cou)
  
  //        
   }
forUpdate++

      console.log("  end end  Scenario  true ") 
        // All lines are read, file is closed now.
    });
}











// app.get('/mobileAppsDetails',function(req,res){
// db.mobileApps.find({},function(err,doc){
// res.json(doc);
// console.log(doc) ;
// })
// }) 



// app.get('/rahuldetails:rahul',function(req,res){
// var idd=req.params.rahul;
// console.log("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR")
// console.log(idd)
// db.featureName.find({},function(err,doc){
// res.json(doc);
// console.log(doc) ;
// })
// })







app.get('/selectionProject',function(req,res){
db.projectSelection.find({},function(err,doc){
res.json(doc);
console.log(doc) ;
})
})


// app.post('/postDevicesName',function(req,res)
// {
// db.mobileApps.insert(req.body,function(err,doc)
// {
// res.json(doc);
// console.log(doc)
// });

// })

app.get('/getTestScriptDetails:ss1',function(req,res)
{
console.log("jjjjjjjjjjjjjrrrrrrrrrrrrrrrrrr") 
var data = req.params.ss1;
//console.log(data)
var data_Array = data.split(",");
var projectId = data_Array[0];
projectId= parseInt(projectId)

var moduleId = data_Array[1];
moduleId= parseInt(moduleId)

var featureId = data_Array[2]; 
featureId= parseInt(featureId)

console.log(typeof(projectId)+projectId);
console.log(typeof(moduleId)+moduleId);
console.log(typeof(featureId)+featureId);


// db.testScript.find({"projectId":projectId,"moduleId":moduleId,"featureId":featureId},function(err,doc){
// res.json(doc);
//console.log(doc);


// var searchCall = function(){
// console.log(" search call")
// db.projectSelection.find({"projectId":Number(projectId)},function(err,projectDetails){
// console.log(projectDetails);
// db.moduleName.find({"projectId":Number(projectId),"moduleId":Number(moduleId)},function(err,moduleDetails){
// console.log(moduleDetails);

// db.featureName.find({"featureId":Number(featureId),"projectId":Number(projectId),"moduleId":Number(moduleId)},function(err,featureDetails){
// console.log(featureDetails);
// console.log(projectDetails[0].projectSelection,moduleDetails[0].moduleName,featureDetails[0].featureName)
// // checkxml(projectDetails[0].projectSelection,featureDetails[0].featureName,lineNum,moduleDetails[0].moduleName) 
// })
// })

// })
var count = 0;
db.projectSelection.find({"projectId":projectId},function(err,projectDetails){
db.moduleName.find({"projectId":projectId,"moduleId":moduleId},function(err,moduleDetails){
db.featureName.find({"featureId":featureId,"projectId":projectId,"moduleId":moduleId},function(err,featureDetails){
// 

db.testScript.find({"projectId":projectId,"moduleId":moduleId,"featureId":featureId},function(err,testScriptDetails)
{
// res.json(doc);
console.log(moduleDetails);
var newArray = [];
// for(j = 0 ;j<moduleDetails.length;j++){

// for(l = 0 ;l<featureDetails.length;l++){
// console.log(doc[i].moduleId === module[j].moduleId );
// for(i = 0 ;i<testScriptDetails.length;i++){
testScriptDetails.forEach(function(testScriptDetail) {
//console.log(testScriptDetail);

// if(testScriptDetail.moduleId === moduleDetails[j].moduleId && testScriptDetail.featureId ===featureDetails[l].featureId){
// console.log(module[j].moduleName);
obj = {}
obj['moduleName']= moduleDetails[0].moduleName;
obj['featureName']= featureDetails[0].featureName;
obj['lineNum']= testScriptDetail.lineNum;
obj['scriptName']=testScriptDetail.scriptName;
obj['scriptId']=testScriptDetail.scriptId;
obj['projectSelection']=projectDetails[0].projectSelection;
newArray.push(obj)
console.log(newArray)
count++;
if(count === ( testScriptDetails.length - 1)){
console.log(" resend call eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee activate")
res.json(newArray);
}
// }

}); 

// }
// } 
// }

}) 
})
})
})
// }
// searchCall()

})
//})

app.post('/testScript',function(req,res)
{

console.log("llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll")

console.log(req.body);

// var moduleName=req.body[0].moduleName;
// var featureName=req.body[0].featureName;
// var lineNum=req.body[0].lineNum;
// var projectSelection=req.body[0].projectSelection;
// checkxml(projectDetails[0].projectSelection,featureDetails[0].featureName,lineNum,moduleDetails[0].moduleName) 
//checkxml(req.body[0].projectSelection,featureDetails[0].featureName,lineNum,moduleDetails[0].moduleName) 
//checkxml(projectDetails[0].projectSelection,featureDetails[0].featureName,lineNum,moduleDetails[0].moduleName) 
checkxml(req.body) 
// dbsNames (moduleName,featureName,lineNum,projectSelection)
})
// var dbsNames = function(moduleName,featureName,lineNum,projectSelection){
// console.log("dbnamesdbnamesssssssssssssss");
// console.log(moduleName);
// console.log(featureName);
// console.log(lineNum);
// console.log(projectSelection) 

// db.projectSelection.find({"projectSelection":String(projectSelection)},function(err,projectDetails){
// console.log(projectDetails);
// db.moduleName.find({"projectId":String(projectSelection),"moduleId":String(moduleName)},function(err,moduleDetails){
// console.log(moduleDetails);

// db.featureName.find({"featureName":Number(featureName),"projectSelection":String(projectSelection),"moduleId":String(moduleName)},function(err,featureDetails){
// console.log(featureDetails);

// console.log(projectDetails[0].projectSelection,moduleDetails[0].moduleName,featureDetails[0].featureName)
// checkxml(projectDetails[0].projectSelection,featureDetails[0].featureName,lineNum,moduleDetails[0].moduleName) 
// })
// })

// })
// }


//var checkxml = function(projectFolder,featureName,lineNum,moduleName){
var checkxml = function(data){ 
console.log("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
console.log(data);
const Filehound = require('filehound');
Filehound.create()
.ext('xml')
//.match(b)
.paths( "./uploads/"+data[0].projectSelection)
.find((err, htmlFiles) => {

htmlFiles.forEach(function(file) {

var LineByLineReader = require('line-by-line');
lr = new LineByLineReader(file)
//console.log(lr)
lr.on('error', function (err) 
{
// 'err' contains error object
//console.log(" error rr rr rr ")
});

lr.on('line', function (line) 
{
//console.log(line)


if((line.includes("<exclude>") === true) && (line.includes("</exclude>") === true) && (line.includes(".java") === true))
{ 
var res = (line.replace("<exclude>",'').replace("</exclude>",'')); 

let pomFilePath = ( file.split("").reverse().join("")).substring(file.indexOf("\\")+1).split("").reverse().join("");

Filehound.create()
.ext('java')
.match(res)
.paths( "./uploads/"+data[0].projectSelection)
.find((err, htmlFiles1) =>
{
// testRunnerCall(htmlFiles1[0].split("\\").pop() ,projectFolder,pomFilePath,featureName,lineNum,moduleName)

console.log("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
testRunnerCall(htmlFiles1[0].split("\\").pop() ,data[0].projectSelection,pomFilePath,data)
// console.log(data);

}) 
}
});

lr.on('end', function () {
// console.log(" end end Scenario true ")
// All lines are read, file is closed now.
});

})
})
} // checkxml

//var testRunnerCall = function(runnerName,path,pomFilePath,featureName,lineNum,moduleName){

var testRunnerCall = function(runnerName,path,pomFilePath,data){ 
console.log("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
console.log(data); 
//var sampleData = data;
var lineString = ''; 


for(k=0;k<data.length;k++){
var lineString1 = "\""+data[k].moduleName+"/"+data[k].featureName+".feature:"+data[k].lineNum+"\""+",";
lineString = lineString.concat(lineString1)
console.log(lineString);
// var abc=data[k].lineNum;
// console.log(abc)
}
const Filehound = require('filehound');
Filehound.create()
.ext('java')
.match(runnerName) // .match('*TestRunnerNew.java*')
.paths("./uploads/"+path)

.find((err, htmlFiles) => {

if (err) return console.error("handle err", err);
console.log("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz")

//console.log(data)
// console.log(path)
// // console.log(featureName+'.'+lineNum);

// lineStringObj=[];
// obj={};

// obj['moduleName']= moduleName;
// obj['featureName']=featureName;
// obj['lineNum']= lineNum;
// lineStringObj.push(obj);
// console.log(lineStringObj);



var fs = require('fs');


// console.log("execTesttt111111"); 
var testPath = "./"+htmlFiles; 
//console.log(testPath+"testpathhhhhh");

var data = fs.readFileSync(testPath).toString().split("\n");
//console.log(data)
// console.log(htmlFiles)
for(i=0;i<data.length;i++){
if( data[i].includes("@CucumberOptions")=== true) {
// for(l = 0 ;l<=data.length;l++){
// var lineString = "\""+moduleName+"/"+featureName[l]+".feature:4"+"\"";
// }

// var lineString = "\""+sampleData[0].moduleName+"/"+sampleData[0].featureName+".feature:"+sampleData[0].lineNum+"\"";
data[i] = "@CucumberOptions(features="+"{"+lineString+"},"+"";
// console.log(true);
}
}

data = data.join("\n");

fs.writeFile(testPath,data,function(err)
{
if (err) return console.log(err);
// console.log(text);
console.log("Replaced");

// execTestRunner( path,pomFilePath)
}) 

})
}//

var execTestRunner = function( projectName,pomFilePath){
// var pomFilePath = "uploads\\projectjava12\\Sample1";
const Filehound = require('filehound');
console.log(" i am ready for executoooooo projectName "+projectName)
console.log(__dirname)

var fs = require('fs'); 
var requiredPath = __dirname+"\\trial.bat"; 
// var requiredPath = "/"+projectName;
// var requiredPath = _dirname+"\\uploads"+"\\"+projectName+"\\trial.bat"; 

var stream = fs.createWriteStream(requiredPath);

stream.write("@echo off\n");
stream.write("cd .\\"+pomFilePath+" && mvn clean install");
console.log(pomFilePath + " fini pomFilePath ")
finalExecution( requiredPath) 

} 


var finalExecution = function( requiredPath){
console.log(__dirname)
console.log(" final executryeriuyteriu req "+requiredPath)
// var dir= "C:\\Users\\user\\Desktop\\Latest_projects\\sample_projects\\code13Aug\\uploads\\anyname\\trial.bat" ; 

// const nodeCmd = require('node-cmd');
//nodeCmd.run(dir, (err, data, stderr) => console.log(data));
//__dirname+"\\uploads\\anyname\\"+"trial.bat"
// "C:\\Users\\user\\Desktop\\Latest_projects\\sample_projects\\code02818demo\\uploads\\projectjava12\\trial.bat"
// "C:\\Users\\user\\Desktop\\Latest_projects\\sample_projects\\code13Aug\\uploads\\anyname\\trial.bat" ; 
// require('child_process').exec 
// //__dirname+"/trial.bat"
require('child_process').exec(requiredPath, (err, stdout, stderr) => {
if (err) throw err;

console.log(stdout, stderr); 
}); 
} 
// finalExecution() //TestRunnerNew_TPE 

// execTest1("projectjava/Sample1/src/test/java/com/zephyr/testrunner/TestRunnerNew.java")

// var execTestRunner = function( projectName){
// const Filehound = require('filehound');
// console.log(" i am ready ")
// console.log(__dirname)

// var fs = require('fs'); 
// var requiredPath = __dirname+"\\trial.bat"; 
// var projectNamePath = "/"+projectName;
// Filehound.create()
// .ext('xml')
// .match('*pom.xml*')
// .paths( "./uploads/"+projectNamePath)
// .find((err, htmlFiles) => {
// if (err) return console.error("handle err", err);
// var stream = fs.createWriteStream(requiredPath);
// console.log(htmlFiles);


// let latest = htmlFiles[0].slice(0,(htmlFiles[0].length - 8));

// console.log(latest);
// stream.write("@echo off\n");
// stream.write("cd .\\"+latest+" && mvn clean install");
// // console.log(latest)
// finalExecution()


// })


// } 


// var finalExecution = function(){

// console.log(" final executryeriuyteriu "+__dirname)

// require('child_process').exec(__dirname+"/trial.bat", (err, stdout, stderr) => {
// if (err) throw err;

// console.log(stdout, stderr); 
// }); 
// } 
//finalExecution() TestRunnerNew_TPE 


// var a = function(){

// const Filehound = require('filehound')
// console.log(__dirname)
// Filehound.create()
// .ext('java')
// .match('*TestRunnerNew.java*')
// .paths("D:\\vickyopal\\charancode\\code3107\\uploads"+"\\Batch5_Development")
// .find((err, htmlFiles) => {
// if (err) return console.error("handle err", err);
// console.log("error "+htmlFiles[0])

// })
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

// console.log("kkkkkkkkkkkkkkkk")
// db.dataIds.find({},function(err,doc){ 
// res.json(doc);
// console.log(doc)
// })
// })
app.get('/getModuleName',function(req,res){



db.moduleName.find({},function(err,doc){ 
res.json(doc);
// console.log(doc)
})
// db.moduleName.find({}).sort({_id:-1}).limit(1,function(err,doc)
// {
// res.json(doc);
// //console.log(doc);
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
// console.log("llllllllllllllllll")
// var moduleName=req.params.mI
// //moduleName1 = parseInt(moduleName1);
// //console.log(moduleName1+"llllllllllllllllll")
// db.moduleName.find({"moduleName":moduleName},function(err,doc){ 
// res.json(doc);
// console.log(doc)
// })
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
// var datastr=req.params.datareceipt;

// var datastr_array=datastr.split(",");
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
require('./server/mobileserver')(app)
app.get('*',(req, res)=> {

res.sendFile(path.join(__dirname,'dist/index.html'));
});
 const port=3666;
app.listen(port,function() {
  console.log("server running on port"+port);
  // body...
});