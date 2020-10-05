import React from 'react';
import ilustracao from '../../assets/ilustration-svg.png'


import './styles.css';

function About() {
    return (
        <div className="container">
            <div className="about1">
                <h2 className="title">Simplify</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
                et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                    aliquip ex ea commodo consequat. </p>
            </div>
            <div className="container-img">
                <img src={ilustracao} alt="" />
            </div>
        </div>

    )
}

export default About;