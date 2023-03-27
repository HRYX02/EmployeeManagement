<template>
    <el-header>
        <el-row>
            <el-col :span="1">
                <el-avatar style="margin-top: 10px;">user</el-avatar>
            </el-col>
            <el-col :span="1" style="line-height: 60px; height: 100%;">{{ userName }}</el-col>
            <el-col :span="18" :push="3">
                <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" background-color="#00a4e8"
                    text-color="#fff" active-text-color="#ffd04b">
                    <el-menu-item index="1" @click="getCompanyInformation">首页</el-menu-item>
                    <el-submenu index="2">
                        <template slot="title">公司内部网</template>
                        <el-menu-item index="2-1">董事会管理</el-menu-item>
                        <el-menu-item index="2-2">部门管理</el-menu-item>
                        <el-submenu index="2-2">
                            <template slot="title">部门管理</template>
                            <el-menu-item index="2-3-1">部门总览</el-menu-item>
                            <el-menu-item index="2-3-2">部门领导</el-menu-item>
                            <el-menu-item index="2-3-3">部门员工</el-menu-item>
                        </el-submenu>
                        <el-submenu index="2-3">
                            <template slot="title">员工管理</template>
                            <el-menu-item index="2-3-1" @click="getAllStuff">所有员工管理</el-menu-item>
                            <el-menu-item index="2-3-2">部门经理</el-menu-item>
                            <el-menu-item index="2-3-3">项目经理</el-menu-item>
                            <el-menu-item index="2-3-4">项目组长</el-menu-item>
                            <el-menu-item index="2-3-5">普通员工</el-menu-item>
                        </el-submenu>
                    </el-submenu>
                    <el-menu-item index="3" @click="addRecruit">招聘信息网</el-menu-item>
                </el-menu>
            </el-col>
            <el-col :span="1" :push="4" style="height: 100%; line-height: 60px;">
                <el-dropdown>
                    <span class="el-dropdown-link">
                        更多<i class="el-icon-arrow-down el-icon--right"></i>
                    </span>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item icon="el-icon-plus">黄金糕</el-dropdown-item>
                        <el-dropdown-item icon="el-icon-circle-plus">狮子头</el-dropdown-item>
                        <el-dropdown-item icon="el-icon-circle-plus-outline">螺蛳粉</el-dropdown-item>
                        <el-dropdown-item icon="el-icon-check">双皮奶</el-dropdown-item>
                        <el-dropdown-item icon="el-icon-circle-check">蚵仔煎</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
            </el-col>
        </el-row>
    </el-header>
</template>

<script>
export default {
    name: 'HomeHeader',
    data() {
        return {
            activeIndex: '1',
            staffList: [],
            name: ''
        };
    },
    props:['userName'],
    methods: {
        //首页信息
        getCompanyInformation(){
            this.$router.push({
                name:'CompanyInformation'
            }, () => ({}), () => ({}))
        },
        //所有员工管理
        getAllStuff() {
                this.$router.push({
                    name: 'AllStaffView',
                    params: {
                        staffList: this.staffList
                    }
                }, () => ({}), () => ({}))
        },
        //招聘信息网
        addRecruit(){
            this.$router.push({
                name: 'AddRecruit',
            }, () => ({}), () => ({}))
        },
    }
}
</script>
<style scoped>
.el-header {
    background-color: #00a4e8;
    color: #fff;
    line-height: 51px;
    width: 100%;
}

.el-dropdown-link {
    cursor: pointer;
    color: #fff;
}

.el-icon-arrow-down {
    font-size: 12px;
}
</style>