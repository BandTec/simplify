import { ModuleWithProviders } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AboutComponent } from "../pages/about/about.component";
import { ContactComponent } from "../pages/contact/contact.component";
import { FormCadastroComponent } from "../pages/form-cadastro/form-cadastro.component";
import { HomeComponent } from "../pages/home/home.component";
import { ServicosComponent } from "../pages/servicos/servicos.component";

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },
    { path: 'servicos', component: ServicosComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'cadastro', component: FormCadastroComponent }
]

export const SimplifyRouting: ModuleWithProviders = RouterModule.forChild(routes)