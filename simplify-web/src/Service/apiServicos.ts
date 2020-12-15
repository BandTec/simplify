import axios from 'axios';

const apiServicos = axios.create({
    baseURL: 'http://localhost:8080/service',
})

export default apiServicos;
