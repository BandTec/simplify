import React, { InputHTMLAttributes } from 'react';

import './styles.css'

interface InpPros extends InputHTMLAttributes<HTMLInputElement> {
    name: string
    placehold: string
    label: string
}

const Input: React.FC<InpPros> = ({ placehold, label, ...rest }) => {
    return (
        <div className="label-inp">
            <label htmlFor={label}>{label}:</label>
            <input className="inp" placeholder={placehold} {...rest} />
        </div>
    )
}


export default Input;