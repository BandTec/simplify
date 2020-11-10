import React from 'react';

//Routes
import { BrowserRouter, Route, Switch } from 'react-router-dom';

//Component
import Nav from './components/Nav';
import Generate from './pages/Generate';


// Paginas
import Home from './pages/home';
import Servico from './pages/services';
import Status404 from './pages/status';
import Login from './pages/Login';

function Routes() {
    return (
        <BrowserRouter>
            <Nav />
            <Switch>
                <Route path="/" exact component={Home} />

                <Route path="/home" component={Home} />

                <Route path="/services" component={Servico} />

                <Route path="/generate" component={Generate} />

                <Route path="profile" component={Home} />
        
                <Route path="/login" component={Login} />

                <Route path="**" component={Status404} />
            </Switch>
        </BrowserRouter>
    )
}

export default Routes