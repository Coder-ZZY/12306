<template>
  <div>
    <div style="margin-left: 160px">
      <ul class="service">
        <li>
          <a href="">
            <img src="../assets/abanner/1.png">
          </a>
        </li>
        <li>
          <a href="">
            <img src="../assets/abanner/2.png">
          </a>
        </li>

      </ul>
      <ul class="service">
        <li>
          <a href="">
            <img src="../assets/abanner/3.png">
          </a>
        </li>
        <li>
          <a href="">
            <img src="../assets/abanner/4.png">
          </a>
        </li>

      </ul>
    </div>
    <div style="margin-top: 40px;margin-left: 200px;margin-right: 125px">
      <div style="height: 40px;text-align: center">
        <div style="float: left;color: #3B99FC">
          铁路旅游
        </div>
        <div style="float: right">
          <a href="" style="text-decoration: none;color: #999">
            更多>
          </a>
        </div>
      </div>
      <div style="height: 508px;width: 1200px">
        <ul class="journey" style="margin-bottom: 0px;margin-top: 0px">
          <li v-for="item in item1">
            <a href="">
              <div>
                <img :src="item.src">
              </div>
              <div class="text">
                <div style="font-size: 14px;color: black;line-height: 32px;text-align: left" >{{item.title}}</div>
                <div style="height: 30px;font-size: 20px;color: #ff8201">
                  <div style="float: left;font-size: 14px">￥</div>
                  <div style="float: left;">{{item.money}}</div>
                </div>
              </div>
            </a>
          </li>
        </ul>
        <ul class="journey" style="margin-top: 0px;">
          <li v-for="item in item2">
            <a href="">
              <div>
                <img :src="item.src">
              </div>
              <div class="text">
                <div style="font-size: 14px;color: black;line-height: 32px;text-align: left" >{{item.title}}</div>
                <div style="height: 30px;font-size: 20px;color: #ff8201">
                  <div style="float: left;font-size: 14px">￥</div>
                  <div style="float: left;">{{item.money}}</div>
                </div>
              </div>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Main-Second",
  data() {
    return {
      item1: [
        {
          src: require("..//assets/journey/1.png"),
          title: "”环西部火车游” 高品质旅游版专线列车",
          money: 2560
        },
        {
          src: require("..//assets/journey/2.png"),
          title: "“环西部火车游” 陇上江南·行摄山>水陇南...",
          money: 930
        },
        {
          src: require("..//assets/journey/3.png"),
          title: "“环西部火车游”华夏寻根·人文始祖天水两...",
          money: 980
        },
        {
          src: require("..//assets/journey/4.png"),
          title: "“环西部火车游”精品旅游线路",
          money: 3380
        }
      ],
      item2: [
        {
          src: require("..//assets/journey/5.png"),
          title: "“环西部火车游”美丽甘南三日游",
          money: 880
        },
        {
          src: require("..//assets/journey/6.png"),
          title: "“环西部火车游” 青海湖、茶卡2日>游",
          money: 880
        },
        {
          src: require("..//assets/journey/7.png"),
          title: "“环西部火车游”嘉敦5日游",
          money: 2260
        },
        {
          src: require("..//assets/journey/8.png"),
          title: "“环西部火车游” 敦煌一地三日游",
          money: 1380
        }
      ]
    }
  }
}
</script>

<style scoped>
.service {
  list-style-type: none;
  display: flex;
}
.service li {
  width: 590px;
  height: 160px;
  margin-right: 10px;
}
.service li a {
  width: 100%;
  height: 100%;
}
.service li a img {
  width: 100%;
  height: 100%;
}
.journey {
  height: 50%;
  list-style-type: none;
  display: flex;
  padding: 0px;
}
.journey li {
  height: 242px;
  width: 288px;
}
.journey li a div img {
  height: 160px;
  width: 288px;
}
.journey li {
  border: 1px solid #DEDEDE;
  margin-right: 10px;
  margin-top: 10px;
}
.journey li a {
  text-decoration: none;
}
.text {
  width: 268px;
  height: 62px;
  padding: 10px;
}
</style>
