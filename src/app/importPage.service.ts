import { Injectable } from '@angular/core';

import { Http,Response } from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {Post} from './post'
@Injectable()
export class ImportServiceComponent {

 
 constructor(public http:Http){

 }
   getTypeDetails():Observable<Post[]>{
 	//alert("ll00")
   return this.http.get("/importType")
  .map((response:Response)=><Post[]>response.json());

  }
     getPriorityDetails():Observable<Post[]>{
 	//alert("ll00")
   return this.http.get("/importPriority")
  .map((response:Response)=><Post[]>response.json());

  }
     featureDetails():Observable<Post[]>{

  
    return this.http.get('/featureName')
    .map((response:Response)=><Post[]>response.json());
 

  }
<<<<<<< HEAD
=======

//  importSaveDetails(dataImportScript){
// console.log(dataImportScript)
// //   let urlSearch= new URLSearchParams();
// // urlSearch.append('moduleName', dataImportScript);
// //urlSearch.append('featureName', dataImportScript);
//     return this.http.post('/savingImportData',dataImportScript)
//       .subscribe(data => {
//       console.log(data);
//     });
 

//   }

>>>>>>> 33fcd6213efeb68638527db387c1a60da88768cf
}