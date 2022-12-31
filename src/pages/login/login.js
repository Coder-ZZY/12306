import {
    createApp
} from 'vue';
import App from './App.vue';
import router from '../../router';
import store from '../../store';
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import axios from "axios";
//axios.defaults.baseURL = 'http://39.105.216.99:8080/api'
axios.defaults.baseURL = 'http://localhost:8443/api'
axios.defaults.withCredentials = true
const Vue = createApp(App)
Vue.config.productionTip = false
Vue.config.globalProperties.$axios = axios
Vue.use(ElementPlus)
Vue.config.productionTip = false
Vue.use(store).use(router).mount('#login')