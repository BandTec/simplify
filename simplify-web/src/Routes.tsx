import React from 'react';

//Routes
import { BrowserRouter, Route, Switch } from 'react-router-dom';

//Component
import Nav from './components/Nav';



// Paginas
import Home from './pages/home';
import Servico from './pages/services';
import Status404 from './pages/status';
import Login from './pages/Login';
import Cadastro from './pages/register';
import Profile from './pages/profile';

function Routes() {
    return (
        <BrowserRouter>
            <Nav />
            <Switch>
                <Route path="/" exact component={Home} />

                <Route path="/home" component={Home} />

                <Route path="/services" component={Servico} />

                <Route path="/profile" component={Profile} />

                <Route path="/login" component={Login} />

                <Route path="/cadastro" component={Cadastro} />

                <Route path="**" component={Status404} />

            </Switch>
        </BrowserRouter>
    )
}

export default Routes