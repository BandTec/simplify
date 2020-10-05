import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Nav from './components/Nav';
import About from './pages/about';
import Home from './pages/home';



function Routes() {
    return (
        <BrowserRouter>
            <Nav />
            <Switch>
                <Route path="/" exact component={Home} />

                <Route path="/home" component={Home} />

                <Route path="/about" component={About} />

                <Route path="/services" component={Home} />

                <Route path="/generate" component={Home} />

                <Route path="profile" component={Home} />
            </Switch>
        </BrowserRouter>
    )
}

export default Routes