<template>
<div style="position: absolute;top: 10px;height: 120px">
  <div class = "up">
    <div class = "logo">
      <img src="../../../../assets/logo2.png" style="height: 50px">
    </div>
  </div>
</div>
</template>

<script>
export default {
  name: "Header",
  data() {
    return {
    }
  },
  methods: {
  }
}
</script>

<style scoped>
.up {
  height: 80px;
  margin-left: 50px;
}
.logo {
  float: left;
  margin: 15px 0 0 0;
  padding: 0;
}
.two li {
  height: 26px;
  line-height: 26px;
}
</style>
