<template>
  <Header/>
<loginMain />
  <Footer />
</template>

<script>
import loginMain from "@/pages/login/components/login/loginMain";
import Footer from "@/pages/login/components/login/loginFooter"
import Header from "@/pages/login/components/login/loginHeader"
export default {
  name: "login",
  components: {Header,loginMain,Footer},
}
</script>
<style scoped>

</style>