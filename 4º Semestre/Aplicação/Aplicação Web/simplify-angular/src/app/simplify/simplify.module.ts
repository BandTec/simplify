import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { NgModule, NO_ERRORS_SCHEMA } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { ServicosComponent } from './pages/servicos/servicos.component';
import { ListServicosComponent } from './pages/list-servicos/list-servicos.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { FormSolicitaComponent } from './pages/form-solicita/form-solicita.component';
import { SharedModule } from "../shared/shared.module";

@NgModule({
    declarations: [
        HomeComponent,
        AboutComponent,
        ServicosComponent,
        ListServicosComponent,
        FormSolicitaComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        CommonModule,
        HttpClientModule,
        SharedModule,
        FormsModule,
        ReactiveFormsModule,

    ],
    providers: [],
    schemas: [NO_ERRORS_SCHEMA]
})

export class SimplifyModule { }