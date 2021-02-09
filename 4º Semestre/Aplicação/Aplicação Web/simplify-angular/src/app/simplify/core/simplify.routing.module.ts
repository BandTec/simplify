import { ModuleWithProviders } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AboutComponent } from "../pages/about/about.component";
import { FormSolicitaComponent } from "../pages/form-solicita/form-solicita.component";
import { HomeComponent } from "../pages/home/home.component";
import { ListServicosComponent } from "../pages/list-servicos/list-servicos.component";
import { ServicosComponent } from "../pages/servicos/servicos.component";

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },
    { path: 'servicos', component: ServicosComponent },
    { path: 'list', component: ListServicosComponent },
    { path: 'form', component: FormSolicitaComponent }
]

export const SimplifyRouting: ModuleWithProviders = RouterModule.forChild(routes)