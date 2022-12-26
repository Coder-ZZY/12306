<template>
  <div class="base">
    <!-- 注册登录界面 -->
    <div  class="loginAndRegist">
      <!--登录表单-->
      <div  class="loginArea">
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!-- 标语 -->
          <div v-show="isShow" class="title">
            登录
          </div>
        </transition>
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!-- 密码框和用户名框 -->
          <div v-show="isShow" class="pwdArea">
            <div style="flex: 1;justify-content: center;display: flex;align-items: center">
              <input class="username" v-model="loginUser.name" style="width: 185px"  placeholder="用户名"/>
            </div>
            <div style="flex: 1;justify-content: center;display: flex;align-items: center">
              <input placeholder="密码"  v-model="loginUser.password" style="width: 185px" type="password"/>
            </div>
          </div>
        </transition>
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!-- 登录注册按钮 -->
          <div v-show="isShow" class="btnArea">
            <el-button type="success" round style="background-color: #257B5E;letter-spacing: 5px" @click="UserLogin"  >登录</el-button>
          </div>
        </transition>
      </div>
      <!-- 注册表单 -->
      <div class="registArea">
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!--  注册表头-->
          <div v-show="!isShow" class="rigestTitle">
            用户注册
          </div>
        </transition>
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >

          <!--            注册表单-->
          <div  v-show="!isShow" class="registForm">
            <div style="flex: 1;display: flex;justify-content: center;align-items: center;margin-bottom: 15px">
              用&nbsp;&nbsp;&nbsp;户&nbsp;&nbsp;&nbsp;名:
              <input
                  placeholder="请输入用户名"
                  v-model="regUser.regUsername"
                  style="height: 25px;width: 165px;margin-left: 10px"
              />
            </div>
<!--            <el-alert-->
<!--                title="成功提示的文案"-->
<!--                type="success"-->
<!--                show-icon>-->
<!--            </el-alert>-->
            <div style="flex: 1;display: flex;justify-content: center;align-items: center;margin-bottom: 15px">
              身&nbsp;份&nbsp;证&nbsp;号:
              <input
                  placeholder="请输入身份证号"
                  v-model="regUser.regUserid"
                  style="height: 25px;width: 165px;margin-left: 10px"
              />
            </div>
<!--            <el-alert-->
<!--                title="成功提示的文案"-->
<!--                type="success"-->
<!--                show-icon>-->
<!--            </el-alert>-->
            <div style="flex: 1;display: flex;justify-content: center;align-items: center;margin-bottom: 15px">
              密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:
              <input placeholder="请输入密码" style="height: 25px;width: 165px;margin-left: 10px" v-model="regUser.regPwd" type="password"/>
            </div>
<!--            <el-alert-->
<!--                title="成功提示的文案"-->
<!--                type="success"-->
<!--                show-icon>-->
<!--            </el-alert>-->
            <div style="flex: 1;display: flex;justify-content: center;align-items: center;">
              确&nbsp;认&nbsp;密&nbsp;码:
              <input placeholder="请再次输入密码" style="height: 25px;width: 165px;margin-left: 10px;" v-model="regUser.regRePwd" type="password"/>
            </div>
          <el-alert
              title="没有问题"
              v-show="pwdexistempty==false&&pwdmessage==true"
              type="success"
              :closable="false"
              style="margin-top: 10px"
              show-icon>
          </el-alert>
            <el-alert
                title="两次输入的密码不一致，请重新输入！"
                v-show="pwdexistempty==false&&pwdmessage==false"
                type="error"
                :closable="false"
                style="margin-top: 10px"
                show-icon>
            </el-alert>
            <el-alert
                title="请输入密码"
                v-show="pwdexistempty==true"
                type="warning"
                :closable="false"
                style="margin-top: 10px"
                show-icon>
            </el-alert>
          </div>
        </transition>
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!--            注册按钮-->
          <div  v-show="!isShow" class="registBtn">
            <el-button type="success" round style="margin-bottom: 25px;;background-color: #257B5E;letter-spacing: 5px" @click="userRegister">注册</el-button>
          </div>
        </transition>
      </div>
      <!-- 信息展示界面 -->
      <div id="aaa" class="showInfo"
           :style="{
             borderTopRightRadius:styleObj.bordertoprightradius,
             borderBottomRightRadius:styleObj.borderbottomrightradius,
             borderTopLeftRadius:styleObj.bordertopleftradius,
             borderBottomLeftRadius:styleObj.borderbottomleftradius,
             right:styleObj.rightDis
            }"
           ref="showInfoView">

        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!-- 没有用户输入用户名或者找不到用户名的时候 -->
          <div v-show="isShow" style="display: flex;flex-direction: column;align-items: center;justify-content: center;width: 100%;height: 100%">
            <!-- 欢迎语 -->
            <div style="flex: 2;display: flex;align-items: center;font-size: 22px;color: #FFFFFF;font-weight: bold">
              欢迎登录中国铁路12306网站
            </div>
            <!-- 欢迎图片 -->
            <div style="flex: 2">
              <el-button type="success"  style="background-color:#257B5E;border: 1px solid #ffffff;" round @click="changeToRegiest">还没有账户？点击注册</el-button>
            </div>
          </div>
        </transition>
        <!-- 用户输入用户名时展示头像以及姓名 -->
        <!--           <div>-->

        <!--           </div>-->
        <transition
            name="animate__animated animate__bounce"
            enter-active-class="animate__fadeInUp"
            leave-active-class="animate__zoomOut"
            appear
        >
          <!-- 用户注册的时候展示信息 -->
          <div v-show="!isShow" style="display: flex;flex-direction: column;align-items: center;justify-content: center;width: 100%;height: 100%">
            <!-- 欢迎语 -->
            <div style="flex: 2;display: flex;align-items: center;font-size: 22px;color: #FFFFFF;font-weight: bold">
              欢迎注册
            </div>
            <!-- 欢迎图片 -->
            <div style="flex: 2">
              <el-button type="success"  style="background-color:#257B5E;border: 1px solid #ffffff;" round @click="changeToLogin">已有账户？点击登录</el-button>
            </div>
          </div>
        </transition>
      </div>
    </div>

  </div>
</template>

<script>
// import 'animate.css';
import { ElMessage } from 'element-plus'
// eslint-disable-next-line no-unused-vars
import {Axios as request} from "axios";
export default {
  name:'Login',
  data(){
    return{
      //看看用不用转成用户对象
      loginUser:{
        name:"",
        password:""
      },

      admins:{},
      ////看看用不用转成用户对象
      regUser:{
        regUsername:'',
        regUserid:'',
        regRePwd:'',
        regPwd:'',
      },
      styleObj:{
        bordertoprightradius:'15px',
        borderbottomrightradius: '15px',
        bordertopleftradius:'0px',
        borderbottomleftradius:'0px',
        rightDis:'0px'
      },
      isShow:true,
      //用于控制密码提示框显示的内容
      pwdmessage:false,
      //用于控制密码提示框是否显示
      pwdexistempty:true,
    }
  },
  watch: {
    "regUser":{
      handler(newValue,oldValue){
        if(newValue.regPwd.length === 0 || newValue.regRePwd.length === 0){
          this.pwdexistempty=true;
        }
        else if(newValue.regPwd.length !== 0 && newValue.regRePwd.length !== 0){
          this.pwdexistempty=false;
          if(newValue.regRePwd !== newValue.regPwd){
            this.pwdmessage=false;
          }
          else{
            this.pwdmessage=true;
          }
        }
      },
      deep:true,
      immediate:true
  }
  },
  methods:{
    checkpwd(){
      //若两个密码都不为空且
      if(this.regUser.regRePwd.length !== 0 && this.regUser.regPwd !== 0){
        this.pwdexistempty=false;
        if(this.regUser.regRePwd === this.regUser.regPwd){
          //若两个密码一致，则没问题
          this.pwdmessage=true;
        }
        else{
          //两个密码不一致，显示提示语
          this.pwdmessage=false;
        }
      }
      else{
        this.pwdexistempty=true;
      }
    },
    changeToRegiest(){
      this.styleObj.bordertoprightradius= '0px'
      this.styleObj.borderbottomrightradius='0px'
      this.styleObj.bordertopleftradius='15px'
      this.styleObj.borderbottomleftradius='15px'
      this.styleObj.rightDis='50%'
      this.isShow = !this.isShow
    },
    changeToLogin(){
      this.styleObj.bordertoprightradius= '15px'
      this.styleObj.borderbottomrightradius='15px'
      this.styleObj.bordertopleftradius='0px'
      this.styleObj.borderbottomleftradius='0px'
      this.styleObj.rightDis='0px'
      this.isShow = !this.isShow
    },
    //用户登录
    SuccessLogin(){
      this.$message({
        message: '登录成功，即将开始跳转……',
        type: 'success'
      });
    },
    FailLogin(){
      this.$message.error('用户名或密码错误，请重新输入！');
    },
    EmptyLogin(){
      this.$message.error('请输入用户名和密码');
    },
    UserLogin(){
      if(this.loginUser.name.length == 0 || this.loginUser.password.length == 0){
        this.EmptyLogin();
      }
      else{
        this.$axios
            .post('/login',{
              username:this.loginUser.name,
              password:this.loginUser.password,
            })
            .then(successResponse => {
              if (successResponse.data.code === 200){
                this.SuccessLogin();
                setTimeout(() => {
                  let username=this.loginUser.name;
                  sessionStorage.setItem('username', username);
                  this.$router.push('/index');
                }, 500);
              }
              else{
                this.FailLogin();
              }
            })
            .catch(failResponse =>{
              this.$message.error('服务器未启动，请启动服务器！')
            })
      }
    },
    //用户注册
    userRegister(){
      if(this.regUser.regUsername.length === 0||this.regUser.regUserid.length === 0||this.pwdexistempty === true){
        this.$message.error('当前表单还存在空白信息，请填写后再提交！')
      }
      else if(this.regUser.regUserid.length !== 18){
        this.$message.error('您输入的身份证号不合法，请确认后再重新提交！')
      }
      else if(this.pwdmessage === false){
        this.$message.error('两次密码输入不一致，请确认后再提交！')
      }
      else {
        this.$axios
            .post('/register',{
              username:this.regUser.regUsername,
              userid:this.regUser.regUserid,
              password:this.regUser.regPwd,
            })
            .then(successResponse => {
              if (successResponse.data.code === 200){
                this.$message({message:'注册成功，即将跳转登录',type:'success'})
                setTimeout(() => {
                  location.reload()
                }, 500);
              }
              else{
                this.regUser.regPwd="";
                this.regUser.regUserid="";
                this.regUser.regRePwd="";
                this.regUser.regUsername="";
                this.$message.error('输入的身份证号已存在，请检查后输入！')
              }
            })
            .catch(failResponse =>{
              this.$message.error('服务器未启动，请启动服务器！')
            })
      }
    },
  },

}
</script>

<style>
/* @import '../assets/css/Login.css' */
@import "../../assets/css/animate.css";
.base{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-image: url("../../assets/bg/login.jpg");
  background-size: 100%;
}
.loginAndRegist{
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  overflow: hidden;
}
.loginArea{
  background-color: rgba(255,255,255,0.8);
  border-top-left-radius: 15px;
  border-bottom-left-radius: 15px;
  height: 400px;
  width: 350px;
  z-index: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: hidden;
}
.registArea{
  border-top-right-radius: 15px;
  border-bottom-right-radius: 15px;
  height: 400px;
  width: 350px;
  background-color: rgba(255,255,255,0.8);
  z-index: 1;
  display: flex;
  flex-direction: column;
  justify-content:center ;
  align-items: center;
}
.showInfo{
  border-top-right-radius: 15px;
  border-bottom-right-radius: 15px;
  position: absolute;
  height: 400px;
  width: 350px;
  z-index:2;
  top: 0;
  right: 0;
  background-image: url("../../assets/bg/welcome.webp");
  background-size: 90%;
}
.showInfo:hover{
  background-size: 100%;
  background-position: -50px -50px;
}
.title{
  width: 70%;
  flex:1;
  border-bottom: 1px solid #257B5E;
  display: flex;
  align-items: center;
  color: #257B5E;
  font-weight: bold;
  font-size: 24px;
  justify-content: center;
}
#aaa{
  transition: 0.3s linear;
}
.pwdArea{
  width: 100%;
  flex:2;
  display: flex;
  flex-direction: column;


}
.pwdArea input{
  outline: none;
  height: 30%;
  border-radius:13px ;
  padding-left: 10px;
  font-size: 12px;
  border: 1px solid gray;
}
.pwdArea input:focus{
  border: 2px solid #257B5E;
}
.btnArea{
  flex:1;
  width: 100%;
  display: flex;
  margin-bottom: 20px;
  justify-content: space-around;
  align-items: center;
}
.rigestTitle{
  width: 70%;
  flex: 1;
  color: #257B5E;
  font-weight: bold;
  font-size: 24px;
  display: flex;
  justify-content: center;
  align-items: center;
  border-bottom: 1px solid #257B5E;
}
.registForm{
  flex: 2;
  display: flex;
  flex-direction: column;
  color: #257B5E;
  font-size: 16px;
  margin-top: 30px;
}

.registForm input{
  outline: none;
  height: 50%;
  border-radius:13px ;
  padding-left: 10px;
  font-size: 12px;
  border: 1px solid gray;
}
.registForm input:focus{
  border: 2px solid #257B5E;
}
.registBtn{
  flex: 1;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
