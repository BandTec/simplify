import axios from 'axios';

const apiServicos = axios.create({
    baseURL: 'http://localhost:8888/service',
})

export default apiServicos;
