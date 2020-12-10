import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080/user',
})

const gerarPDF = axios.create({
    url: 'http://localhost:8855/',
})

export default api;
