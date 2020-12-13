import React from 'react';
import './styles.css'

import logo from '../../assets/Simplify.png';

import heroImage from '../../assets/Ilustracao/image-1.svg';

import { Link } from 'react-router-dom';

function Home() {
    return (
        <div id="page-landing">
            <div id="page-landing-content" className="container">
                <div className="logo-container">
                    <img src={logo} alt="Proffy" />
                    <h2>Gerar documentos nunca foi tão fácil</h2>
                </div>

                <img src={heroImage} alt="" className="hero-image" />

                <div className="buttons-container">
                    <Link to="/cadastro" className="study">
                        <img src="" alt="" />
                        Cadastrar-se
               </Link>
                    <Link to="/services" className="give-classes">
                        <img src="" alt="" />
                        Procurar serviços
                </Link>
                    <Link to="/profile" className="give-classes">
                        <img src="" alt="" />
                        Minhas solicitações
               </Link>

                </div>
                <span className="total-connections">
                    Total de 28 documentos gerados <img src={""} alt="" />
                </span>
            </div>
        </div>
    )
}

export default Home;