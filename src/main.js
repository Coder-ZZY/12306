import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import axios from 'axios'
/* import the fontawesome core */
import { library } from '@fortawesome/fontawesome-svg-core'
/* import font awesome icon component */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
/* import specific icons */
import {faPenToSquare,faTrain,faUtensils,faClock,faMagnifyingGlass,faRetweet
    ,faRightLeft,faRightLong,faCloudSun,faCheckToSlot,faBellConcierge,faHourglassStart,faClockRotateLeft} from "@fortawesome/free-solid-svg-icons";
// main.js
axios.defaults.baseURL = 'http://localhost:8443/api'
const Vue = createApp(App)
Vue.component('font-awesome-icon', FontAwesomeIcon)
library.add(faCloudSun,faRightLong,faRightLeft,faRetweet,faMagnifyingGlass,
    faClock,faPenToSquare,faTrain,faUtensils,faCheckToSlot,faBellConcierge,faHourglassStart,faClockRotateLeft)
Vue.config.globalProperties.$axios = axios
Vue.use(ElementPlus)
Vue.use(store).use(router).mount('#app')