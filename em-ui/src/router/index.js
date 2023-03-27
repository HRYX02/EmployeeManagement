import VueRouter from "vue-router";

import Login from "../pages/Login.vue"
import Home from "../pages/Home.vue"
import HomeMain from "../pages/HomeMain.vue"
import CompanyInformation from "../pages/HomeMain/CompanyInformation.vue"
import AllStaffView from "../pages/HomeMain/AllStaffView.vue"
import AddRecruit from "../pages/HomeMain/AddRecruit.vue"

export default new VueRouter({
    routes:[
        //登录的路由
        {
            path:'/',
            name:'Login',
            component: Login,
        },
        //主要区域容器。
        {
            path:'/',
            component: Home,
            props($route) {
                return {
                    userName: $route.params.userName
                }
            },
            children:[
                {
                    path:'/',
                    component: HomeMain,
                    children:[
                        //招聘网站子路由
                        {
                            path: 'addrecruit',
                            name: 'AddRecruit',
                            component: AddRecruit,
                        },
                        //首页子路由
                        {
                            path:'home',
                            name:'CompanyInformation',
                            component: CompanyInformation,
                            
                        },
                        //所有员工子路由
                        {
                            path: 'allstaffview',
                            name: 'AllStaffView',
                            component: AllStaffView,
                        },
                    ]
                },
            ]
        },
        
    ]
})