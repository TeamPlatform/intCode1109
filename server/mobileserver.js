module.exports=function(app){

    var mongojs=require('mongojs');
    var bodyParser = require("body-parser");
    var mongoose  = require('mongoose');
    var multer = require('multer');
    var db=mongojs('Platform',['loginDetails','projectSelection','mobileApps'])

    app.use(bodyParser.json());
    app.use(bodyParser.urlencoded({ extended: true }));
    
    console.log("mobile_lab_server Running");
    // var apk = 'apk/areca.apk'
    var Promise = require('bluebird')
    var adb = require('adbkit')
    var client = adb.createClient()

    // app.use(function (req, res, next) {
    //   res.header("Access-Control-Allow-Origin", "*");
    //   res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    //   next();
    // });

    app.use(function(req, res, next) {
      res.header("Access-Control-Allow-Origin", "*");
      res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
      next();
  })

  app.post("/shivaa", multer({dest: "./uploads09/"}).array("uploads[]", 12), function(req, res) {
    res.send(req.files);
});


  client.trackDevices()
  .then(function(tracker) {
    tracker.on('add', function(device) {
      console.log('Device %s was plugged in', device.id)
    })
    tracker.on('remove', function(device) {
      console.log('Device %s was unplugged', device.id);
      db.Devices.remove({"DevicesId":device.id},{function(err,doc){
        console.log(doc);
      }})
    })
    tracker.on('end', function() {
      console.log('Tracking stopped')
    })
  })
  .catch(function(err) {
    console.error('Something went wrong:', err.stack)
  })
    
    app.get('/mobileAppsDetails',function(req,res){

        db.Devices.find({},function(err,doc){
            res.json(doc);
           console.log(doc);
        })
      })

      app.post('/postDevicesName',function(req,res)
        {
            // console.log("yashwanth")
            listDevices();
        })
    
    function listDevices(){
        client.listDevices()
          .then(function(devices) {
            return Promise.map(devices, function(device) {
                return client.shell(device.id, 'getprop ro.product.model')
                .then(adb.util.readAll)
                .then(function(output) {
                 var devicesname=output.toString().trim()
                 console.log(devicesname+" "+"hurry i got devices name");
                  return insert(device.id,devicesname)
                  console.log(devices)
                  // console.log('[%s] %s', device.id, output.toString().trim())
                })
            })
            })
        
          .then(function() {
            console.log('Details of all connected devices')
          })
          .catch(function(err) {
            console.error('Something went wrong:', err.stack)
          }) 
        }
    
        
    
      function insert(devicesid,devicesname)
      {
      db.Devices.insert({"DevicesId":devicesid,"DevicesName":devicesname},function(error,doc){
        console.log(doc)
      });

      var storage = multer.diskStorage({ //multers disk storage settings
        destination: function (req, file, cb) {
          console.log("inside storage")
            cb(null, '../apk/newupload/');
        },
        filename: function (req, file, cb) {
          console.log("inside filename")
          var datetimestamp = Date.now();
          var newfilename= file.fieldname + '-' + datetimestamp + '.' + file.originalname.split('.')[file.originalname.split('.').length -1];
            cb(null, newfilename);
            console.log(file.originalname+"filelllllllllllllllll")
        }
    });

      var upload = multer({ //multer settings
        storage: storage
       }).single('file');

      app.post('/installApkLocally',function(req,res){
        console.log("yahswanthCalllllllllll")
        // uplaod call
        upload(req,res,function(err){
          if(err){
             console.log("insideifffffffffffff")
               res.json({error_code:1,err_desc:err});
               return;
          }
           res.json({error_code:0,err_desc:null});
         });
      });


      
      app.post('/installapk:devices',function(req,res){
        console.log("call_1")
        var newdevicesIdFound = req.params.devices;
        console.log(newdevicesIdFound);
        var devicesIdFound = newdevicesIdFound.split(",");
        var devicesId = devicesIdFound[0];
        var newapk = 'C:/Users/Opal/Desktop/areca.apk'
        console.log(devicesId+"devicesId")
        console.log(newapk+"newapknewapk")
        client.install(devicesId, newapk)
        .then(function() {
        console.log('Installed %s on all connected devices', newapk)
        })
        .catch(function(err) {
        console.error('Something went wrong:', err.stack)
      })
      
      })

      // app.post('/installapk:yash',function(req,res){
      // console.log("llllllllllllll")
      // var newyash = req.params.yash;
      // console.log(newyash);
      // res.json(newyash);
      // })
    
    }
    
    
    
    
    
    }//module exports