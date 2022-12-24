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
import myForm from "@/components/myForm";
import Header from "@/components/Header";
import MainFirst from "@/components/Main-First";
import MainSecond from "@/components/Main-Second";
import List from "@/components/List";
import Footer from "@/components/Footer";
import Sidebar from "@/components/Sidebar";
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
