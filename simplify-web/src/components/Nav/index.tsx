import React from 'react';
import { Link } from 'react-router-dom';

import './styles.css'


/*CAso precise passar props abra <>*/
const Nav: React.FC = () => {
    return (
        <nav className="navbar">
            <ul className="navbar-nav">
                <li className="logo nav-item">
                    <Link to="/" className="nav-link nav-item">
                        <span className="link-text logo-text">Simplify</span>
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="angle-double-right"
                            role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"
                            className="svg-inline--fa fa-angle-double-right fa-w-14 fa-5x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M224 273L88.37 409a23.78 23.78 0 0 1-33.8 0L32 386.36a23.94 23.94 0 0 1 0-33.89l96.13-96.37L32 159.73a23.94 23.94 0 0 1 0-33.89l22.44-22.79a23.78 23.78 0 0 1 33.8 0L223.88 239a23.94 23.94 0 0 1 .1 34z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M415.89 273L280.34 409a23.77 23.77 0 0 1-33.79 0L224 386.26a23.94 23.94 0 0 1 0-33.89L320.11 256l-96-96.47a23.94 23.94 0 0 1 0-33.89l22.52-22.59a23.77 23.77 0 0 1 33.79 0L416 239a24 24 0 0 1-.11 34z"
                                    className="fa-primary"></path>
                            </g>
                        </svg>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/home" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg>
                        <span className="link-text">
                            Home
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/services" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg>
                        <span className="link-text">
                            Serviços
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/generate" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg> <span className="link-text">
                            Gerar
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/login" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg> <span className="link-text">
                            Bem vindo
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/cadastro" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg> <span className="link-text">
                            Cadastro
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/profile" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg> <span className="link-text">
                            Perfil
                    </span>
                    </Link>
                </li>
                <li className="nav-link nav-item">
                    <Link to="/" className="nav-link">
                        <svg aria-hidden="true" focusable="false" data-prefix="fad" data-icon="cat" role="img"
                            xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"
                            className="svg-inline--fa fa-cat fa-w-16 fa-9x">
                            <g className="fa-group">
                                <path fill="currentColor"
                                    d="M448 96h-64l-64-64v134.4a96 96 0 0 0 192 0V32zm-72 80a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm80 0a16 16 0 1 1 16-16 16 16 0 0 1-16 16zm-165.41 16a204.07 204.07 0 0 0-34.59 2.89V272l-43.15-64.73a183.93 183.93 0 0 0-44.37 26.17L192 304l-60.94-30.47L128 272v-80a96.1 96.1 0 0 0-96-96 32 32 0 0 0 0 64 32 32 0 0 1 32 32v256a64.06 64.06 0 0 0 64 64h176a16 16 0 0 0 16-16v-16a32 32 0 0 0-32-32h-32l128-96v144a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V289.86a126.78 126.78 0 0 1-32 4.54c-61.81 0-113.52-44.05-125.41-102.4z"
                                    className="fa-secondary"></path>
                                <path fill="currentColor"
                                    d="M376 144a16 16 0 1 0 16 16 16 16 0 0 0-16-16zm80 0a16 16 0 1 0 16 16 16 16 0 0 0-16-16zM131.06 273.53L192 304l-23.52-70.56a192.06 192.06 0 0 0-37.42 40.09zM256 272v-77.11a198.62 198.62 0 0 0-43.15 12.38z"
                                    className="fa-primary"></path>
                            </g>
                        </svg>
                        <span className="link-text">
                            Profile
                    </span>
                    </Link>
                </li>
                
            </ul>
        </nav>

    );
}

export default Nav;