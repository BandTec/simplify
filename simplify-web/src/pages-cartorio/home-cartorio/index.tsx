import React from 'react';
import './styles.css'

import logo from '../../assets/Simplify.png';

import heroImage from '../../assets/Ilustracao/image-4.svg';
import serviceImage from '../../assets/accept.png'
import loginImage from '../../assets/user.png'




import { Link } from 'react-router-dom';

function HomeCartorio() {
    return (
        <div id="page-landing">
            <div id="page-landing-content" className="container">
                <div className="logo-container">
                    <img src={logo} alt="Proffy" />
                    <h2>Gerar documentos nunca foi tão fácil</h2>
                </div>

                <img src={heroImage} alt="" className="hero-image" />

                <div className="buttons-container">
                    <Link to="/cart/servicos" className="give-classes">
                        <img src={serviceImage} alt="" />
                        Cadastrar serviço
                </Link>
                    <Link to="/cart/profile" className="give-classes">
                        <img src={loginImage} alt="" />
                        Perfil
               </Link>

                </div>
            </div>
        </div>
    )
}

export default HomeCartorio;