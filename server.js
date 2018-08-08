const express=require('express');
const app=express();
const path=require('path');
var mongo= require('mongodb');
const bodyParser=require('body-parser');

var mongojs=require('mongojs');

 
var mongoose  = require('mongoose');

const exec = require('child_process')


var methodOverride = require('method-override');
var bson = require('bson');
var Promise = require('es6-promise').Promise;

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




app.get('/mobileAppsDetails',function(req,res){
    db.mobileApps.find({},function(err,doc){
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




 require('./server/serverTestExecution')(app);
 require('./server/projectSelectionServer')(app);
// module.exports = app;
 app.get('*',(req, res)=> {
 
   res.sendFile(path.join(__dirname,'dist/index.html'));
 });
 const port=5666;
app.listen(port,function() {
  console.log("server running on port"+port);
  // body...
});
