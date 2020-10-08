// import React, { useEffect, useRef, useState } from 'react';
// import './styles.css'

// const Contador = () => {
//     const [timersDays, setTimerDays] = useState('');
//     const [timersHours, setTimerHours] = useState('');
//     const [timersMinutes, setTimerMinutes] = useState('');
//     const [timersSeconds, setTimerSeconds] = useState('');

//     let intervalo = useRef();

//     const startTimer = () => {
//         const countdownDate = new Date('July 20  2021 00:00:00').getTime();

//         setInterval(() => {
//             const now = new Date().getTime()
//             const distance = countdownDate - now;

//             const days = Math.floor(distance / (1000 * 60 * 60 * 24));
//             const hours = Math.floor((distance % (1000 * 60 * 60 * 24) / (1000 * 60 * 60)));
//             const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
//             const seconds = Math.floor((distance % (1000 * 60)) / 1000);

//             if (distance < 0) {
//                 //stop timer
//                 clearInterval(intervalo.current)
//             } else {
//                 //update
//                 setTimerDays(days.toString);
//                 setTimerHours(hours);
//                 setTimerMinutes(minutes);
//                 setTimerSeconds(seconds)
//             }
//         }, 1000);
//     };

//     //components
//     useEffect(() => {
//         startTimer();
//         return () => {
//             clearInterval(intervalo.current)
//         }
//     })

//     return (
//         <section className="container-timer">
//             <section className="timer">
//                 <div className="legend">
//                     <h2>Countdow mobile</h2>
//                     <p>Novidades pensando na sua satisfação is coming...</p>
//                 </div>
//                 <div className="count">
//                     <section>
//                         <p>87</p>
//                         <p><small>Days</small></p>
//                     </section>
//                     <span>:</span>
//                     <section>
//                         <p>87</p>
//                         <p><small>Hours</small></p>
//                     </section>
//                     <span>:</span>

//                     <section>
//                         <p>87</p>
//                         <p><small>Minutes</small></p>
//                     </section>
//                     <span>:</span>

//                     <section>
//                         <p>87</p>
//                         <p><small>Seconds</small></p>
//                     </section>
//                 </div>
//             </section>
//         </section>
//     )
// }

// export default Contador;