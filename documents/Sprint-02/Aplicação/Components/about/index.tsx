import React from 'react';
import SectionAbout from '../../components/about-section';

import img from "../../assets/ilustration.png"

import './styles.css';
import Section from '../../components/about-2';
import Contador from '../../components/Contador';

function About() {
    return (
        <div className="container-about">
            <SectionAbout title="Simplify"
                description="Hello world"
                image={img}
            />
            <Section
                image={img}
                title="Praticidade"
                description="Serviços 100% online, simplifcado para trazer sua melhor expriencia"
            />
            <Contador />
        </div>
    )
}

export default About;