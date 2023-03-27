<template>
    <el-row :gutter="20">
        <el-col :span="6">
            <div>
                <el-statistic :title="title" :value="staffTatal" suffix="人"></el-statistic>
            </div>
        </el-col>
        <el-col :span="6">
            <div>
                <el-statistic title="男女比">
                    <template slot="formatter"> 456/2 </template>
                </el-statistic>
            </div>
        </el-col>
        <el-col :span="6">
            <div>
                <el-statistic group-separator="," :precision="2" decimal-separator="." :value="value1" :title="title">
                    <template slot="prefix">
                        <i class="el-icon-s-flag" style="color: red"></i>
                    </template>
                    <template slot="suffix">
                        <i class="el-icon-s-flag" style="color: blue"></i>
                    </template>
                </el-statistic>
            </div>
        </el-col>
        <el-col :span="6">
            <div>
                <el-statistic :value="like ? 521 : 520" title="Feedback">
                    <template slot="suffix">
                        <span @click="like = !like" class="like">
                            <i class="el-icon-star-on" style="color:red" v-show="!!like"></i>
                            <i class="el-icon-star-off" v-show="!like"></i>
                        </span>
                    </template>
                </el-statistic>
            </div>
        </el-col>
    </el-row>
</template>

<script>
import axios from 'axios';
export default {
    name: 'CompanyInformation',
    data() {
        return {
            like: true,
            value1: 4154.564,
            value2: 2222,
            title: '员工总数',
            staffTatal:0
        };
    },
    mounted() {
        axios.get('/em/et').then(res =>{
            this.staffTatal = res.data.data
        })
    },
}
</script>

<style scoped>
.like {
    cursor: pointer;
    font-size: 25px;
    display: inline-block;
}
</style>