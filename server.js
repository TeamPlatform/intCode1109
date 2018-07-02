const express=require('express');
const path=require('path');
const bodyParser=require('body-parser');

////////////

//const api=require('./server/routes/api')

const app=express();

const port=2111;

app.use(express.static(path.join(__dirname,'dist')));

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:true}));
//app.use('/api',api);

///////////////
////////////
//var app=express();
var mongojs=require('mongojs');
var mongoose  = require('mongoose');
var db=mongojs('collections',['loginDetails','projectSelection'])



var methodOverride = require('method-override');
var bson = require('bson');
var Promise = require('es6-promise').Promise;
var Decimal128 = require('mongodb').Decimal128;
app.use(bodyParser.json({limit: '50mb'})); // parse application/json
app.use(bodyParser.json({ type: 'application/vnd.api+json' })); // parse application/vnd.api+json as json
app.use(bodyParser.urlencoded({limit: '50mb', extended: true,parameterLimit:50000}));// parse application/x-www-form-urlencoded

app.use(bodyParser.json());
 //console.log("mmmmmmmmmmmmmooooooooooooooooooo")

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
     
//   console.log("kkkkkkkkkkkkkkkk")
//     db.dataIds.find({},function(err,doc){        
//         res.json(doc);
//         console.log(doc)
//     })
// })
app.get('/getModuleName',function(req,res){
     
     
  
    db.moduleName.find({},function(err,doc){        
        res.json(doc);
        console.log(doc)
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
        console.log(doc);
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
  console.log(doc)
})

})
app.get('/mId:mN',function(req,res){
     console.log("llllllllllllllllll")
     var moduleName=req.params.mN
     //moduleName1 = parseInt(moduleName1);
  console.log(moduleName+"llllllllllllllllll")
    db.moduleName.find({"moduleName":moduleName},function(err,doc){        
        res.json(doc);
        console.log(doc)
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
        console.log(doc)
        //console.log(doc+1)
       // console.log(" id in sale invoicw "+doc._id+" amount "+doc.moduleId)
        
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
        console.log(doc);
      })

})
app.get('*',(req, res)=> {

  res.sendFile(path.join(__dirname,'dist/index.html'));
});

app.listen(port,function() {
	console.log("server running on port"+port);
	// body...
});





