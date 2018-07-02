import { Component} from '@angular/core';

@Component({
   selector: 'app-header',
 
  template:`
<style>
  div.g {
    float: right;
      }
  </style>
      <div class="g"  >
{{"Admin"}}
  
          <button type="button" style="background-color:blue;"  [routerLink]="['/']">Sign Out</button>
      <router-outlet></router-outlet>
      </div>

  `,



})//componrnt  closing

export class HeaderComponent   {
  


}
