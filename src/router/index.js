import { createRouter, createWebHistory } from 'vue-router'
import Index from '../components/Index'
import login from '../components/login'
const routes = [
  {
    path: '/',
    redirect: '/index',
    component: Index
  },
  {
    path: '/index',
    name: 'index',
    component: Index
  },
  {
    path: '/login',
    name: 'login',
    component: login
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
