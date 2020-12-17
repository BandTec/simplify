import React from 'react';

//Routes
import { BrowserRouter, Route, Switch } from 'react-router-dom';





// Paginas
import Home from './pages/home';
import Servico from './pages/services';
import Status404 from './pages/status';
import Login from './pages/Login';
import Cadastro from './pages/register';
import Profile from './pages/profile';
import PreLogin from './pages/pre-login';

import { CadServices } from './pages-cartorio/cadServices';
import { ExportCart } from './pages-cartorio/pageExport'
import { CartLogin } from './pages-cartorio/cartLogin';
import HomeCartorio from './pages-cartorio/home-cartorio';

function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={PreLogin} />

                <Route path="/home" component={PreLogin} />

                <Route path="/user/home" component={Home} />

                <Route path="/user/services" component={Servico} />

                <Route path="/user/profile" component={Profile} />

                <Route path="/user/login" component={Login} />

                <Route path="/user/cadastro" component={Cadastro} />

                <Route path="/cart/home" component={HomeCartorio} />

                <Route path="/cart/login" component={CartLogin} />

                <Route path="/cart/servicos" component={CadServices} />

                <Route path="/cart/profile" component={ExportCart} />

                <Route path="**" component={Status404} />

            </Switch>
        </BrowserRouter>
    )
}

export default Routes