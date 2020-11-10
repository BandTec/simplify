import React from 'react';
import './styles.css'

import ilustracao from '../../assets/ilustration.png'
import Button from '../../components/button';
import { Link } from 'react-router-dom';

function Home() {
    return (

        <div className="container-home">
            <div className="container-info">
                <h2>
                    Simplify
                </h2>
                <h3>
                    Lidar com documentos nunca foi tão fácil
                </h3>

                <div className="btn-container">
                    <Link to="home">  <Button title="saiba mais" classe="btn" /> </Link>
                    <Button title="cadastre-se" classe="btn btn-1" />
                </div>
            </div>
            <div className="container-img">
                <img src={ilustracao} alt="" />
            </div>
        </div>

    )
}

export default Home;