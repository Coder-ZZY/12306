<template>
<div>
  <div>
    <el-carousel style="height: 450px">
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner1.png" style="height: 450px;width: 100%">
      </el-carousel-item>
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner2.png" style="height: 450px;width: 100%">
      </el-carousel-item>
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner3.png" style="height: 450px;width: 100%">
      </el-carousel-item>
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner4.png" style="height: 450px;width: 100%">
      </el-carousel-item>
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner5.png" style="height: 450px;width: 100%">
      </el-carousel-item>
      <el-carousel-item style="height: 450px">
        <img src="../assets/banner/banner6.png" style="height: 450px;width: 100%">
      </el-carousel-item>
    </el-carousel>
  </div>
  <div>
    <ul class="service">
      <li>
        <a href="https://www.12306.cn/index/view/icentre_qxyyInfo.html" target="_blank">
          <img src="../assets/service/2.png">
          <div>重点旅客预约</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/view/icentre_lostInfo.html" target="_blank">
          <img src="../assets/service/6.png">
          <div>遗失物品查找</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/view/station/shared_Car.html" target="_blank">
          <img src="../assets/service/4.png">
          <div>约车服务</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/view/station/hand.html" target="_blank">
          <img src="../assets/service/5.png">
          <div>便民托运</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/czyd_2143/" target="_blank">
          <img src="../assets/service/3.png">
          <div>车站引导</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/zcfc_2548/" target="_blank">
          <img src="../assets/service/7.png">
          <div>站车风采</div>
        </a>
      </li>
      <li>
        <a href="https://www.12306.cn/index/view/advice_adviceInfo.html" target="_blank">
          <img src="../assets/service/9.png">
          <div>用户反馈</div>
        </a>
      </li>
    </ul>
  </div>
</div>
</template>

<script>
export default {
  name: "Main-First"
}
</script>

<style scoped>
.service {
  height: 136px;
  padding: 0;
  margin-left: 165px;
  margin-top: 0;
  margin-bottom: 0;
  list-style-type: none;
}
.service li{
  float:left;
  width: 170px;
  height: 136px;
  display:flex;
  justify-content:center;
  align-items:center;
}
.service li a {
  text-decoration: none;
  font-size: 14px;
  color: black;
}
.service li a img{
  height: 40px;
  width: 36px;
}
</style>
