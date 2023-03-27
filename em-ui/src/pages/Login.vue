<template>
    <el-container>
        <el-header>
            <el-row type="flex" justify="center">
                <el-col :span="12" style="color: #00a4e8; font-size: 50px; text-align: center;">
                    公司员工管理系统
                </el-col>
            </el-row>
        </el-header>

        <el-main>
            <el-form :model="staffForm" :rules="rules" ref="staffForm" status-icon class="demo-ruleForm">
                <el-row type="flex" justify="center">
                    <el-col :span="8" :push="2">
                        <el-form-item label="账户" prop="account">
                            <el-col :span="12">
                                <el-input type="text" v-model="staffForm.account"></el-input>
                            </el-col>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row type="flex" justify="center">
                    <el-col :span="8" :push="2">
                        <el-form-item label="密码" prop="password">
                            <el-col :span="12">
                                <el-input type="password" v-model="staffForm.password"></el-input>
                            </el-col>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row type="flex" justify="center">
                    <el-form-item>
                        <el-col :span="4">
                            <el-button @click="submitForm('staffForm')" type="primary">登录</el-button>
                        </el-col>
                        <el-col :span="4" :push="16">
                            <el-button @click="resetForm('staffForm')" type="warning">重置</el-button>
                        </el-col>
                    </el-form-item>
                </el-row>
            </el-form>
        </el-main>
        <el-footer>
        </el-footer>
    </el-container>
</template>

<script>
import axios from 'axios';
export default {
    name: "Login",
    data() {
        var validatePassword = (rule, value, callback) => {
            if (value === '') {
                callback(new Error('请输入密码'));
            } else {
                callback();
            }
        };
        return {
            staffForm: {
                account: '',
                password: ''
            },
            rules: {
                password: [
                    { validator: validatePassword, trigger: 'blur' }
                ],
            },
        };
    },
    methods: {
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    axios.post('/em/login', {
                        "accountId": this.staffForm.account,
                        "password": this.staffForm.password,
                    })
                        .then(res => {
                            if (res.data.data === null) {
                                alert('账号或密码输入错误')
                            } else {
                                this.$router.replace({
                                    name: 'CompanyInformation',
                                    params:{
                                        userName: res.data.data.name
                                    }
                                })
                            }

                        })
                        .catch(err => {
                            console.error(err);
                        })
                } else {
                    console.log('error submit!!');
                    return false;
                }
            });
        },
        resetForm(formName) {
            this.$refs[formName].resetFields();
        }
    },
}

</script>