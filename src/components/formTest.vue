<template>
  <el-date-picker
      v-model="formData.startTime"
      type="date"
      placeholder="选择日期时间"
      value-format="yyyy-MM-dd"
      @change="handleHistoryData">
  </el-date-picker>
</template>

<script>
export default {
  name: "formTest",
  data(){
    return{
      formData: {
        startTime: '',// 日期
      }
    }
  },
  mounted() {
    this.getCurrentTime()
  },
  methods:{
    // 获取日期
    handleHistoryData(val) {
      console.log(val)
      this.startTime = val
    },
    // 获取当前日期
    getCurrentTime() {
      let currentTime = new Date(), year = currentTime.getFullYear(),
          month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
          day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate()
      this.formData.startTime = year + '-' + month + '-' + day
    }
  }
}
</script>

<style scoped>

</style>