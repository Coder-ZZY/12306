<template>
  <div>
    <el-container>
      <el-header class = "header" >
        <Header/>
      </el-header>

      <el-main class="main">
      <Main-First/>
      <Second-First/>
      </el-main>
      <el-footer class="footer">

      </el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "@/components/Header";
import MainFirst from "@/components/Main-First";
import SecondFirst from "@/components/Second-First";
export default {
  name: "Index",
  components: {MainFirst, Header, SecondFirst},
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
