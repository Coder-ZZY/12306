<template>
  <Header/>
<loginMain />
  <Footer />
</template>

<script>
import loginMain from "@/components/login/loginMain";
import Footer from "@/components/login/loginFooter"
import Header from "@/components/login/loginHeader"
export default {
  name: "login",
  components: {Header,loginMain,Footer},
}
</script>
<style scoped>

</style>