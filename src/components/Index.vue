<template>
  <div>
    <el-container>
      <el-header class = "header" >
        <Header/>
      </el-header>

      <el-main class="main">
        <my-form />
<!--        <Second-First/>-->
<!--        <formTest />-->
      </el-main>
      <el-footer class="footer">

      </el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "@/components/Header";
import MainFirst from "@/components/Main-First";
import formTest from "@/components/formTest";
// import SecondFirst from "@/components/Second-First";
import myForm from "@/components/myForm";
import FormTest from "@/components/formTest";
export default {
  name: "Index",
  components: {FormTest, MainFirst,myForm,Header},
  data() {
    return {
    }
  }
}
</script>

<style scoped>
.header {
  height: 120px;
  padding: 0;
}
.main {
  padding: 0;
}
.footer{
  padding: 0;
}
</style>
