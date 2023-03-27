<template>
    <el-container direction="vertical">
        <HomeHeader :userName="userName"/>
        <router-view></router-view>
        <HomeFooter/>
    </el-container>
</template>

<script>
import HomeHeader from '../components/HomeHeader.vue'
import HomeFooter from '../components/HomeFooter.vue'

export default {
    name: 'Home',
    components: { HomeHeader, HomeFooter },
    props:['userName'],
    methods:{
    }
}
</script>

<style scoped>
    .el-footer {
        background-color: #E9EEF3;
        color: #333;
        line-height: 60px;
    }
</style>