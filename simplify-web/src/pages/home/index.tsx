import React from 'react';
import './styles.css'

import logo from '../../assets/Simplify.png';

import heroImage from '../../assets/Ilustracao/image-1.svg';
import serviceImage from '../../assets/accept.png'
import loginImage from '../../assets/user.png'
import signInImage from '../../assets/sign-in.png'




import { Link } from 'react-router-dom';

function Home() {
    return (
        <div id="page-landing">
            <div id="page-landing-content" className="container">
                <div className="logo-container">
                    <img src={logo} alt="Proffy" />
                    <h2>Gerar documentos nunca foi tão fácil
                    </h2>
                </div>

                <img src={heroImage} alt="" className="hero-image" />

                <div className="buttons-container">
                    <Link to="/user/servicos" className="study">
                        <img src={serviceImage} alt="" />
                        Procurar serviços
                </Link>
                    <Link to="/user/profile" className="give-classes">
                        <img src={loginImage} alt="" />
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