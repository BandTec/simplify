import React from 'react';
import Button from '../../components/button';

import './style.css';

function Status404 (){return(
    <div className ="conteiner-geral">
        <div className ="conteiner" >
            <h3> 404 </h3>
            <h4>Nós perdoe, ocorreu um erro pedimos para que <br></br> recarregue sua pagina.</h4>
            <div className="aling-btn">
                <Button title="Recarregar"  classe=" btn btn-recaregar"/>
            </div>
        </div>
        
    </div>

)}
export default Status404;

