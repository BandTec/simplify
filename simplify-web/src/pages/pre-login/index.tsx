import React from 'react'
import { Link } from 'react-router-dom';
import imgCartorio from '../../assets/cart-home.png'
import imgUser from '../../assets/user-home.png'
import './styles.css'


function PreLogin() {
    return (
        <div id="page-landing">
            <div>
                <p className="prelogin-welcome">Bem Vindo(a) ao Simplify!</p>
                <h1 className="prelogin-title">Escolha o perfil de acesso</h1>
                <div className="prelogin-container">
                    <div>
                        <Link className="prelogin-link" to="user/login">
                            <img width="400px" height="400px" className="prelogin-img" src={imgUser} />
                            <p>Usuário</p>
                        </Link>
                    </div>
                    <div>
                        <Link className="prelogin-link" to="/cart/login">
                            <img width="400px" height="400px" className="prelogin-img" src={imgCartorio} />
                            <p>Cartório</p>
                        </Link>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default PreLogin;