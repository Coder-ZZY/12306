<template>
  <div>
    <el-container>
      <el-header class = "header" >
        <Header/>
      </el-header>

      <el-main class="main">
      <Main-First/>
      <Second-First/>
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
import SecondFirst from "@/components/Second-First";
import List from "@/components/List";
import Footer from "@/components/Footer";
export default {
  name: "Index",
  components: {MainFirst, Header, SecondFirst, List, Footer},
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
