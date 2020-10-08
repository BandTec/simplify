import React from 'react';

//Routes
import { BrowserRouter, Route, Switch } from 'react-router-dom';

//Component
import Nav from './components/Nav';


// Paginas
import Home from './pages/home';
import Servico from './pages/services'

function Routes() {
    return (
        <BrowserRouter>
            <Nav />
            <Switch>
                <Route path="/" exact component={Home} />

                <Route path="/home" component={Home} />

                <Route path="/services" component={Servico} />

                <Route path="/generate" component={Home} />

                <Route path="profile" component={Home} />
            </Switch>
        </BrowserRouter>
    )
}

export default Routes