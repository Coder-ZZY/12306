<template>
  <div>
    <el-container>
      <el-header class = "header" >
        <Header/>
      </el-header>

      <el-main class="main">
      <MainFirst/>
      <MainSecond/>
      <List/>
      </el-main>
      <el-footer class="footer">
        <Footer/>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "@/components/Header";
import MainFirst from "@/components/Main-First";
import List from "@/components/List";
import Footer from "@/components/Footer";
import MainSecond from "@/components/Main-Second";
export default {
  name: "Index",
  components: {MainSecond, MainFirst, Header, List, Footer},
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
