import React from 'react';
import { Link } from 'react-router-dom';
import Button from '../../components/button';

import './style.css';

function Status404() {
    return (
        <div className="conteiner-geral">
            <div className="conteiner" >
                <h3> 404 </h3>
                <h4>Nós perdoe, ocorreu um erro pedimos para que <br></br> recarregue sua pagina.</h4>
                <div className="aling-btn">
                    <Link to="/home"> <Button title="Recarregar" classe=" btn btn-recaregar" /> </Link>
                </div>
            </div>

        </div>

    )
}
export default Status404;

