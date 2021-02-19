import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { NgModule, NO_ERRORS_SCHEMA } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { ServicosComponent } from './pages/servicos/servicos.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { SharedModule } from "../shared/shared.module";
import { ContactComponent } from './pages/contact/contact.component';
import { FormCadastroComponent } from './pages/form-cadastro/form-cadastro.component';

@NgModule({
    declarations: [
        HomeComponent,
        AboutComponent,
        ServicosComponent,
        ContactComponent,
        FormCadastroComponent
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