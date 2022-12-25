<template>
  <div>
    <el-container>
      <el-header class = "header" >
        <Header/>
      </el-header>
      <el-main class="main">
      <MainFirst/>
        <MainSecond />
        <List />
        <myForm />
      </el-main>
      <el-footer class="footer">
        <Footer/>
      </el-footer>
      <Sidebar/>
    </el-container>
  </div>
</template>

<script>
import myForm from "@/components/index/myForm";
import Header from "@/components/index/Header";
import MainFirst from "@/components/index/Main-First";
import MainSecond from "@/components/index/Main-Second";
import List from "@/components/index/List";
import Footer from "@/components/index/Footer";
import Sidebar from "@/components/index/Sidebar";
export default {
  name: "Index",
  components: { MainFirst, myForm, MainSecond,  Header, List, Footer, Sidebar},
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
  margin-top: 50px;
}
</style>
