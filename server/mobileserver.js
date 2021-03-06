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

  ////////////////////////////////

  var storage = multer.diskStorage({

    filename: function (req, file, cb) {
    cb(null, file.originalname);
    },
    destination: function (req, file, cb) {
    var newDestination = __dirname+'/uploads/'
      cb(null, newDestination);
      }
    });

  var upload = multer(
    { 
        dest: "uploads/",
        limits: {
            fieldNameSize: 100,
            fileSize: 60000000
        },
        storage: storage
        });


///////////////////////////////////////////////
  app.post("/shivaa", upload.any(),function(req, res) {
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
        console.log("insert calll")
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


      
      app.post('/installapk',function(req,res){
        var devicesId = req.body.deviceId;
        var apkpath = req.body.apkPath;
        console.log(devicesId+"devicesId")
        console.log(apkpath+"newapknewapk")
        client.install(devicesId, apkpath)
        .then(function() {
        console.log('Installed %s on all connected devices', apkpath)
        res.json(devicesId)
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