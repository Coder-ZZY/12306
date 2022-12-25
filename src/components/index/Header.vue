<template>
<div style="height: 120px">
  <div class = "up">
    <div class = "logo">
      <img src="../../assets/logo.png" style="height: 50px">
    </div>
    <div class = "right">
      <div class = "searchBox">
        <el-autocomplete
            class="inline-input"
            style="width: 300px"
            v-model="state"
            :fetch-suggestions="querySearch"
            placeholder="搜索车票、餐饮、常旅客、相关规章"
            :trigger-on-focus="false"
            @select="handleSelect"
        ></el-autocomplete>
        <el-button type="primary">
          <el-icon><Search /></el-icon>
        </el-button>
      </div>
      <div class="other">
        <ul style="list-style-type: none;margin: 0px;padding: 0px">
          <li class="item">
            <a href="" class="item-nav">无障碍</a>
          </li>
          <li class="item _item">|</li>
          <li class="item">
            <a href="" class="item-nav">爱心版</a>
          </li>
          <li class="item _item">|</li>
          <li class = "item">
            <a href="" class="item-nav">English</a>
            <ul class="two">
              <li>
                <a href="">English</a>
              </li>
              <li>
                <a href="">简体中文</a>
              </li>
            </ul>
          </li>
          <li class="item _item">|</li>
          <li class = "item">
            <a href="" class="item-nav">我的12306</a>
            <ul class="two">
              <li>
                <a href="">火车票订单</a>
              </li>
              <li>
                <a href="">候补订单</a>
              </li>
              <li>
                <a href="">计次·定期票订单</a>
              </li>
              <li>
                <a href="">约号订单</a>
              </li>
              <li>
                <a href="">本人车票</a>
              </li>
              <li class="two-line"></li>
              <li>
                <a href="">我的餐饮·特产</a>
              </li>
              <li>
                <a href="">我的保险</a>
              </li>
              <li>
                <a href="">我的会员</a>
              </li>
              <li class="two-line"></li>
              <li>
                <a href="">查看个人信息</a>
              </li>
              <li>
                <a href="">账户安全</a>
              </li>
              <li class="two-line"></li>
              <li>
                <a href="">乘车人</a>
              </li>
              <li>
                <a href="">地址管理</a>
              </li>
              <li class="two-line"></li>
              <li>
                <a href="">温馨服务查询</a>
              </li>
            </ul>
          </li>
          <li class="item _item">|</li>
          <li class="item">
            <a href="" style="color: black">登录</a>
            <a href="" style="color: black;margin-left: 10px">注册</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
  <div class = "down">
    <el-menu mode="horizontal"
             :default-active="activeIndex"
             active-text-color="#ffb9ab"
             class="menus">
      <el-menu-item index="1" class="menu" style="margin-left: 0px">首页</el-menu-item>
      <el-sub-menu index="2" class="menu">
        <template #title>车票</template>
        <el-sub-menu index="2-1">
          <template #title>购买</template>
          <el-menu-item index="2-1-1">单程</el-menu-item>
          <el-menu-item index="2-1-2">往返</el-menu-item>
          <el-menu-item index="2-1-3">中转换乘</el-menu-item>
          <el-menu-item index="2-1-4">计次·定期票</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="2-2">
          <template #title>变更</template>
          <el-menu-item index="2-2-1">退票</el-menu-item>
          <el-menu-item index="2-2-2">改签</el-menu-item>
          <el-menu-item index="2-2-3">变更到站</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="2-3">
          <template #title>更多</template>
          <el-menu-item index="2-3-1">中铁银通卡</el-menu-item>
          <el-menu-item index="2-3-2">广九直通车</el-menu-item>
          <el-menu-item index="2-3-3">市郊快速铁路</el-menu-item>
          <el-menu-item index="2-3-4">国际列车</el-menu-item>
        </el-sub-menu>
      </el-sub-menu>
      <el-sub-menu index="3" class="menu">
        <template #title>团购服务</template>
        <el-menu-item index="3-1">务工人员</el-menu-item>
        <el-menu-item index="3-2">学生团体</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="4" class="menu">
        <template #title>会员服务</template>
        <el-menu-item index="4-1">会员管理</el-menu-item>
        <el-menu-item index="4-2">积分账户</el-menu-item>
        <el-menu-item index="4-3">积分兑换</el-menu-item>
        <el-menu-item index="4-4">会员专项</el-menu-item>
        <el-menu-item index="4-5">会员中心</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="5" class="menu">
        <template #title>站车服务</template>
        <el-menu-item index="5-1">重点旅客预约</el-menu-item>
        <el-menu-item index="5-2">便民托运</el-menu-item>
        <el-menu-item index="5-3">约车服务</el-menu-item>
        <el-menu-item index="5-4">车站引导</el-menu-item>
        <el-menu-item index="5-5">遗失物品查找</el-menu-item>
        <el-menu-item index="5-6">动车组介绍</el-menu-item>
        <el-menu-item index="5-7">定制接送</el-menu-item>
        <el-menu-item index="5-8">站车风采</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="6" class="menu">
        <template #title>商旅服务</template>
        <el-menu-item index="6-1">餐饮·特产</el-menu-item>
        <el-menu-item index="6-2">旅游</el-menu-item>
        <el-menu-item index="6-3">保险</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="7" class="menu">
        <template #title>出行指南</template>
        <el-sub-menu index="7-1">
          <template #title>常见问题</template>
          <el-menu-item index="7-1-1">车票</el-menu-item>
          <el-menu-item index="7-1-2">改签、变更到站</el-menu-item>
          <el-menu-item index="7-1-3">购票</el-menu-item>
          <el-menu-item index="7-1-4">退票</el-menu-item>
          <el-menu-item>更多</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="7-2">
          <template #title>旅客须知</template>
          <el-menu-item index="7-2-1">铁路电子客票</el-menu-item>
          <el-menu-item index="7-2-2">身份核验</el-menu-item>
          <el-menu-item index="7-2-3">更多</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="7-3">
          <template #title>相关章程</template>
          <el-menu-item index="7-3-1">铁路互联网铁路售票暂行办法</el-menu-item>
          <el-menu-item index="7-3-2">铁路旅客运输规程</el-menu-item>
          <el-menu-item index="7-3-3">铁路旅客禁止、限制携带和托运物品目录</el-menu-item>
          <el-menu-item index="7-3-4">广深港高速铁路跨境旅客运输组织规则</el-menu-item>
          <el-menu-item index="7-3-5">更多</el-menu-item>
        </el-sub-menu>
      </el-sub-menu>
      <el-sub-menu index="8" class="menu">
        <template #title>信息查询</template>
        <el-menu-item index="8-1">正晚点</el-menu-item>
        <el-menu-item index="8-2">时刻表</el-menu-item>
        <el-menu-item index="8-3">公布票价</el-menu-item>
        <el-menu-item index="8-4">检票口</el-menu-item>
        <el-menu-item index="8-5">起售时间</el-menu-item>
        <el-menu-item index="8-6">最新发布</el-menu-item>
        <el-menu-item index="8-7">天气</el-menu-item>
        <el-menu-item index="8-8">交通查询</el-menu-item>
        <el-menu-item index="8-9">代售点</el-menu-item>
        <el-menu-item index="8-10">客服电话</el-menu-item>
        <el-menu-item index="8-11">列车状态</el-menu-item>
        <el-menu-item index="8-12">信用信息</el-menu-item>
      </el-sub-menu>
    </el-menu>
  </div>
</div>
</template>

<script>
import { Search } from '@element-plus/icons-vue'
export default {
  name: "Header",
  components: {Search},
  data() {
    return {
      Search,
      searchText: "",
      activeIndex: "1",
      state: []
    }
  },
  methods: {
    querySearch(queryString, cb) {
      this.$axios.get('/search?wd=' + queryString ).then(resp => {
        if(resp && resp.data.code === 200) {
          let s = resp.data.result;
          return cb(s);
        }
      })
    },
    handleSelect(item) {
      window.open(item["url"]);
    }
  }
}
</script>

<style scoped>
.up {
  height: 80px;
  margin-left: 165px;
}
.logo {
  float: left;
  margin: 15px 0 0 0;
  padding: 0;
}
.right {
  float: right;
  margin: 24px 0 0 0;
  width: 990px;
  height: 40px;
  background-image: url(../../assets/bg/bg-train.png);
  background-size: 500px ;
  background-repeat: no-repeat;
  background-position: left;
  position: relative;
}
.searchBox {
  float: left;
  width: 380px;
  margin: 5px 0 5px 0px;
}
.other {
  float: right;
  margin-right: 200px;
  margin-top: 0px;
}
.item {
  float: left;
  margin-left: 10px;
  height: 40px;
  line-height: 40px;
  font-size: 12px;
  position: relative;
}
.item-nav {
  color: #3B99FC;
  display: block;

}
._item {
  color: #acd1f9;
}
.two {
  display: none;
  list-style-type: none;
  position: absolute;
  top: 40px;
  left: 0;
  background: #ffffff;
  border: 1px solid #DEDEDE;
  width: 90px;
  padding: 10px;
  z-index: 2000;
}
.two li {
  height: 26px;
  line-height: 26px;
}
.two li a {
  color: black;
}
.two .two-line{
  height: 1px;
  line-height: 1px;
  border-bottom: 1px dashed #DEDEDE;
  margin: 3px 0;
}
.item:hover .two{
  display: block;
}
.menus {
  background-color: #3B99FC;
  height: 40px;
  display:flex;
  justify-content:center;
  align-items:center;
}
.menu {
  width: 150px;
}
a {
  text-decoration: none;
}
.back {
  width: 1300px;
  height: 70px;
  margin-top: 10px;
  margin-left: 70px;
  background-image: url(../../assets/bg/bg-train.png);
  background-size: 1200px ;
  background-repeat: no-repeat;
  background-position: left;
  line-height: 70px;
  position: relative;
}
</style>
