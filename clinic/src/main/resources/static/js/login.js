new Vue({
    el:'#app',
    data:{
        form: {
            users: '',
            upassword:''
        },
        rules:{
            users: [
                { required: true, message: '请输入用户名', trigger: 'blur' },
                { min: 2, max: 12, message: '长度在 2 到 12 个字符', trigger: 'blur' }
            ],
            upassword: [
                { required: true, message: '请输入密码', trigger: 'blur' },
                { min: 2, max: 12, message: '长度在 2 到 12 个字符', trigger: 'blur' }
            ],
        }
    },
    methods:{
        onSubmit(formName){
            var vm = this;
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    //alert('submit!');
                    axios.post('log/selectByid', {
                        username:vm.form.users,
                        pwd:vm.form.upassword
                    })
                        .then(function (response) {
                            console.log(response)
                            if(response.data == "success"){
                                location.href="index.html"
                            }else{
                                vm.$message.error('用户名或密码错误');
                            }
                        })
                        .catch(function (error) {
                            console.log(error);
                        });
                } else {

                    return false;
                }
            });
        }
    }
})