import React, { useState } from 'react'
import Input from '../../components/input';
import PageHeader from '../../components/page-header';
import Select from '../../components/Select';


import './styles.css'

function Generate() {

    const [scheduleItems, setScheduleItems] = useState([
        { week_day: 0, from: '', to: '' }
    ]);

    function addNewScheduleItems() {
        setScheduleItems([
            ...scheduleItems,
            { week_day: 0, from: '', to: '' }
        ]);
    }

    function setScheduleItemValue(position: number, field: string, value: string) {
        const newArray = scheduleItems.map((scheduleItem, index) => {
            if (index === position) {
                return { ...scheduleItem, [field]: value };
            }

            return scheduleItem;
        }
        )

        setScheduleItems(newArray)
    }
    return (
        <div id="page-teacher-form" className="container">
            <PageHeader title="Que Incrivel que você quer gerar um novo documento !!!"

            />
            <main>
                <fieldset>
                    <legend>Seus dados</legend>
                    <Input name="name" label="Nome completo" value="" />
                    <Input name="whatsapp" label="Whatsapp" value="" />
                </fieldset>
                <fieldset>
                    <legend>Sobre o documento</legend>
                    <Select name="subject" label="Documento"
                        options={[
                            { value: "1", label: 'Documento 1' },
                            { value: "2", label: 'Documento 2' },
                            { value: "3", label: 'Documento 3' },
                            { value: "4", label: 'Documento 4' },
                            { value: "5", label: 'Documento 5' },
                        ]}
                        value=""
                    />


                </fieldset>
                <form>
                    <fieldset>
                        <legend>Horários disponiveis
                        </legend>
                        {scheduleItems.map((scheduleItem, index) => {
                            return (
                                <div key={scheduleItem.week_day} className="schedule-item">
                                    <Select name="week_day" label="Dia da semana"
                                        value={scheduleItem.week_day}
                                        onChange={e => setScheduleItemValue(index, 'week_day', e.target.value)} options={[
                                            { value: "0", label: 'Segunda-feira' },
                                            { value: "1", label: 'Terça-Feira' },
                                            { value: "2", label: 'Quarta-Feira' },
                                            { value: "3", label: 'Quinta-Feira' },
                                            { value: "4", label: 'Sexta-Feita' },
                                            { value: "5", label: 'Sabádo' },
                                            { value: "6", label: 'Domingo' },
                                        ]} />
                                    <Input type="time" onChange={e => setScheduleItemValue(index, 'from', e.target.value)} value={scheduleItem.from} name="from" label="Das" />
                                    <Input type="time" onChange={e => setScheduleItemValue(index, 'to', e.target.value)} value={scheduleItem.to} name="to" label="Até" />
                                </div>
                            );

                        })}
                    </fieldset>

                    <footer>
                        <p >
                            <img src="" alt="Aviso Importante" />
                    Importante !
                    Preencha todos os dados
                </p>
                        <button type="submit">
                            finalizar solicitação
                </button>
                    </footer>
                </form>
            </main>
        </div>
    )
}

export default Generate;