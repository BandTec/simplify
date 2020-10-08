import React from 'react';

import './styles.css'

export interface InpPros {
    name: string
    placehold: string
    label: string
}

const Input: React.FC<InpPros> = (props) => {
    return (
        <div className="label-inp">
            <label htmlFor={props.label}>{props.label}:</label>

            <input className="inp" type="text" id={props.label} name={props.name} placeholder={props.placehold} />
        </div>
    )
}


export default Input;