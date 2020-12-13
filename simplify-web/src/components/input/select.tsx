import React, { InputHTMLAttributes } from 'react';
import horarios from '../../mocks/services/mock-horarios'

import './styles.css'

interface Select extends InputHTMLAttributes<HTMLInputElement> {
    name: string
}

const Select: React.FC<Select> = ({ name, value,...rest }) => {
    return (
        <select className="select">
            <option value="12:00">12:00</option>
            <option value="13:00">13:00</option>
            <option value="14:00">14:00</option>
            <option value="15:00">15:00</option>
            <option value="16:00">16:00</option>
            <option value="17:00">17:00</option>
            <option value="18:00">18:00</option>
        </select>
    )
}


export default Select;