import React from 'react'
import './styles.css'

export interface btnProps {
    title: string;
    classe?: string
}

const Button: React.FC<btnProps> = (props) => {
    return (
        <button className={props.classe}>
            {props.title}
            {/* Atenção PROPS nescessario */}
        </button>
    )
}

export default Button;