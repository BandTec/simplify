import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './simplify/pages/home/home.component';
import { SimplifyRouting } from './simplify/core/simplify.routing.module';


const routes: Routes = [

];

@NgModule({
  imports: [
    SimplifyRouting,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
