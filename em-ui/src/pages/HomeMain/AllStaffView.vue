<template>
    <el-table :data="staffDataList" stripe style="width: 100%">
        <el-table-column prop="empId" label="员工ID" width="150" align="center"></el-table-column>
        <el-table-column prop="name" label="姓名" width="150" align="center"></el-table-column>
        <el-table-column prop="sex" label="性别" width="150" align="center"></el-table-column>
        <el-table-column prop="salary" label="工资" width="150" align="center"></el-table-column>
        <el-table-column prop="jobId" label="工作ID" width="150" align="center"></el-table-column>
        <el-table-column prop="phoneNum" label="电话" width="200" align="center"></el-table-column>
        <el-table-column prop="departmentId" label="部门ID" width="150" align="center"></el-table-column>
        <el-table-column prop="post" label="职位" width="150" align="center"></el-table-column>
        <el-table-column prop="isDelete" label="是否离职" width="150" align="center"></el-table-column>
    </el-table>
</template>

<script>
import axios from 'axios';
export default {
    name:'AllStaffView',
    data() {
        return {
            staffDataList:[]
        }
    },
    created(){
        axios.get('/em/staff', {}).then((res) => {
            this.staffDataList = res.data.data
        })
    },
    updated() {
        for (let index = 0; index < this.staffDataList.length; index++) {
            if (this.staffDataList[index].sex === 'MAIL') {
                this.staffDataList[index].sex = '男';
            }else{
                this.staffDataList[index].sex = '女';
            }
            if (this.staffDataList[index].isDelete === 0) {
                this.staffDataList[index].isDelete = '否';
            }else{
               this.staffDataList[index].isDelete = '是';
            }
            
        }
        
    },
}
</script>

<style scoped></style>