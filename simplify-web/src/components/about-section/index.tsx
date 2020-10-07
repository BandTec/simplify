import React from 'react';

import './styles.css'

export interface SectionProps {
    title: string
    description: string
    image: string
}


const SectionAbout: React.FC<SectionProps> = (props) => {
    return (
        <div className="container">
            <div className="about1">
                <h2 className="title">{props.title}</h2>
                <p>{props.description} </p>
            </div>
            <div className="container-img">
                <img src={props.image} alt="" />
            </div>
        </div>
    )
}

export default SectionAbout;