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
                  <a href="https://www.12306.cn/en/index.html">English</a>
                </li>
                <li>
                  <a href="">简体中文</a>
                </li>
              </ul>
            </li>
            <li class="item _item">|</li>
            <li class = "item">
              <a href="https://kyfw.12306.cn/otn/view/index.html" class="item-nav">我的12306</a>
              <ul class="two">
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/train_order.html">火车票订单</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/lineUp_order.html">候补订单</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/commutation_order.html">计次·定期票订单</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/commutation_ticket_order.html">约号订单</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/personal_travel.html">本人车票</a>
                </li>
                <li class="two-line"></li>
                <li>
                  <a href="https://exservice.12306.cn/excater/queryMyOrder.html">我的餐饮·特产</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/my_insurance.html">我的保险</a>
                </li>
                <li>
                  <a href="https://cx.12306.cn/tlcx/welcome.html">我的会员</a>
                </li>
                <li class="two-line"></li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/information.html">查看个人信息</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/userSecurity.html">账户安全</a>
                </li>
                <li class="two-line"></li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/passengers.html">乘车人</a>
                </li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/address_init.html">地址管理</a>
                </li>
                <li class="two-line"></li>
                <li>
                  <a href="https://kyfw.12306.cn/otn/view/icentre_serviceQuery.html">温馨服务查询</a>
                </li>
              </ul>
            </li>
            <li class="item _item">|</li>
            <li class="item">
              <a v-show="isLoginFlag === 0" href="/login" style="color: black">登录</a>
              <a v-show="isLoginFlag === 0" href="/login" style="color: black;margin-left: 10px">注册</a>
              <span v-show="isLoginFlag === 1" style="color: black">您好，</span>
              <span v-show="isLoginFlag === 1">{{username}}</span>
            </li>
            <li v-show="isLoginFlag === 1" class="item _item">|</li>
            <li class="item">
              <a v-show="isLoginFlag === 1" href="/login" @click="clearLoginInfo()" class="item-nav" >退出</a>
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
            <el-menu-item index="2-1-1" @click="dc">单程</el-menu-item>
            <el-menu-item index="2-1-2" @click="wf">往返</el-menu-item>
            <el-menu-item index="2-1-3" @click="zzhc">中转换乘</el-menu-item>
            <el-menu-item index="2-1-4" @click="jcdq">计次·定期票</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2-2">
            <template #title>变更</template>
            <el-menu-item index="2-2-1" @click="tp">退票</el-menu-item>
            <el-menu-item index="2-2-2" @click="gq">改签</el-menu-item>
            <el-menu-item index="2-2-3" @click="bgdz">变更到站</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2-3">
            <template #title>更多</template>
            <el-menu-item index="2-3-1" @click="ytk">中铁银通卡</el-menu-item>
            <el-menu-item index="2-3-2" @click="ztc">广九直通车</el-menu-item>
            <el-menu-item index="2-3-3" @click="kstl">市郊快速铁路</el-menu-item>
            <el-menu-item index="2-3-4" @click="gjlc">国际列车</el-menu-item>
          </el-sub-menu>
        </el-sub-menu>
        <el-sub-menu index="3" class="menu">
          <template #title>团购服务</template>
          <el-menu-item index="3-1" @click="wgry">务工人员</el-menu-item>
          <el-menu-item index="3-2" @click="xstt">学生团体</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="4" class="menu">
          <template #title>会员服务</template>
          <el-menu-item index="4-1" @click="hygl">会员管理</el-menu-item>
          <el-menu-item index="4-2" @click="hygl">积分账户</el-menu-item>
          <el-menu-item index="4-3" @click="hygl">积分兑换</el-menu-item>
          <el-menu-item index="4-4" @click="hygl">会员专项</el-menu-item>
          <el-menu-item index="4-5" @click="hyzx">会员中心</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="5" class="menu">
          <template #title>站车服务</template>
          <el-menu-item index="5-1" @click="zdlkyy">重点旅客预约</el-menu-item>
          <el-menu-item index="5-2" @click="bmty">便民托运</el-menu-item>
          <el-menu-item index="5-3" @click="ycfw">约车服务</el-menu-item>
          <el-menu-item index="5-4" @click="czyd">车站引导</el-menu-item>
          <el-menu-item index="5-5" @click="yswp">遗失物品查找</el-menu-item>
          <el-menu-item index="5-6" @click="dcz">动车组介绍</el-menu-item>
          <el-menu-item index="5-7" @click="dzjs">定制接送</el-menu-item>
          <el-menu-item index="5-8" @click="zcfc">站车风采</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="6" class="menu">
          <template #title>商旅服务</template>
          <el-menu-item index="6-1" @click="cytc">餐饮·特产</el-menu-item>
          <el-menu-item index="6-2" @click="ly">旅游</el-menu-item>
          <el-menu-item index="6-3" @click="bx">保险</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="7" class="menu">
          <template #title>出行指南</template>
          <el-sub-menu index="7-1">
            <template #title>常见问题</template>
            <el-menu-item index="7-1-1" @click="wcp">车票</el-menu-item>
            <el-menu-item index="7-1-2" @click="wgq">改签、变更到站</el-menu-item>
            <el-menu-item index="7-1-3" @click="wgp">购票</el-menu-item>
            <el-menu-item index="7-1-4" @click="wtp">退票</el-menu-item>
            <el-menu-item>更多</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="7-2">
            <template #title>旅客须知</template>
            <el-menu-item index="7-2-1" @click="dzkp">铁路电子客票</el-menu-item>
            <el-menu-item index="7-2-2" @click="sfhy">身份核验</el-menu-item>
            <el-menu-item index="7-2-3" @click="gd">更多</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="7-3">
            <template #title>相关章程</template>
            <el-menu-item index="7-3-1" @click="zxbf">铁路互联网铁路售票暂行办法</el-menu-item>
            <el-menu-item index="7-3-2" @click="ysgc">铁路旅客运输规程</el-menu-item>
            <el-menu-item index="7-3-3" @click="xyml">铁路旅客禁止、限制携带和托运物品目录</el-menu-item>
            <el-menu-item index="7-3-4" @click="zzgz">广深港高速铁路跨境旅客运输组织规则</el-menu-item>
            <el-menu-item index="7-3-5" @click="help">更多</el-menu-item>
          </el-sub-menu>
        </el-sub-menu>
        <el-sub-menu index="8" class="menu">
          <template #title>信息查询</template>
          <el-menu-item index="8-1" @click="zwd">正晚点</el-menu-item>
          <el-menu-item index="8-2" @click="skb">时刻表</el-menu-item>
          <el-menu-item index="8-3" @click="gbpj">公布票价</el-menu-item>
          <el-menu-item index="8-4" @click="jpk">检票口</el-menu-item>
          <el-menu-item index="8-5" @click="qssj">起售时间</el-menu-item>
          <el-menu-item index="8-6" @click="zxfb">最新发布</el-menu-item>
          <el-menu-item index="8-7" @click="tq">天气</el-menu-item>
          <el-menu-item index="8-8" @click="jtcx">交通查询</el-menu-item>
          <el-menu-item index="8-9" @click="dsd">代售点</el-menu-item>
          <el-menu-item index="8-10" @click="kfdh">客服电话</el-menu-item>
          <el-menu-item index="8-11" @click="lczt">列车状态</el-menu-item>
          <el-menu-item index="8-12" @click="xyxx">信用信息</el-menu-item>
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
      state: [],
      isLoginFlag: 0,
      username:"",
    }
  },
  mounted() {
    this.isLogin();
  },
  methods: {
    isLogin(){
      if(sessionStorage.getItem('username')){
        let username = sessionStorage.getItem('username');
        this.username=username;
        this.isLoginFlag=1;
      }
      else{
        this.isLoginFlag=0;
      }
    },
    clearLoginInfo(){
      sessionStorage.removeItem('username');
      this.isLoginFlag=0;
    },
    querySearch(queryString, cb) {
      this.$axios.get('/search?wd=' + queryString ).then(resp => {
        if(resp && resp.data.code === 200) {
          let s = resp.data.result;
          return cb(s);
        }
      })
    },
    dc() {
      window.open("https://kyfw.12306.cn/otn/leftTicket/init?linktypeid=dc");
    },
    wf() {
      window.open("https://kyfw.12306.cn/otn/leftTicket/init?linktypeid=wf");
    },
    zzhc() {
      window.open("https://kyfw.12306.cn/otn/lcQuery/init");
    },
    jcdq() {
      window.open("https://kyfw.12306.cn/otn/view/commutation_index.html");
    },
    tp() {
      window.open("https://kyfw.12306.cn/otn/view/train_order.html?type=2&typefilt=4");
    },
    gq() {
      window.open("https://kyfw.12306.cn/otn/view/train_order.html?type=2&typefilt=2");
    },
    ytk() {
      window.open("https://www.12306.cn/index/view/ticket/zt_card.html");
    },
    bgdz() {
      window.open("https://kyfw.12306.cn/otn/view/train_order.html?type=2&typefilt=3");
    },
    ztc() {
      window.open("https://www.12306.cn/index/view/ticket/through_train.html");
    },
    kstl() {
      window.open("https://www.12306.cn/index/view/ticket/railway.html");
    },
    gjlc() {
      window.open("https://www.12306.cn/index/view/ticket/international_train.html");
    },
    wgry() {
      window.open("https://www.12306.cn/index/view/group/group_management.html?type=1");
    },
    xstt() {
      window.open("https://www.12306.cn/index/view/group/group_management.html?type=2");
    },
    hygl() {
      window.open("https://cx.12306.cn/tlcx/index.html");
    },
    hyzx() {
      window.open("https://cx.12306.cn/tlcx/welcome.html");
    },
    zdlkyy() {
      window.open("https://kyfw.12306.cn/otn/view/icentre_qxyyInfo.html");
    },
    bmty() {
      window.open("https://www.12306.cn/index/view/station/hand.html");
    },
    ycfw() {
      window.open("https://www.12306.cn/index/view/station/shared_Car.html");
    },
    czyd() {
      window.open("https://www.12306.cn/mormhweb/czyd_2143/");
    },
    yswp() {
      window.open("https://kyfw.12306.cn/otn/view/icentre_lostInfo.html");
    },
    dcz() {
      window.open("https://www.12306.cn/index/view/station/train_intro.html");
    },
    dzjs() {
      window.open("https://www.12306.cn/index/view/station/custom_PickUp.html");
    },
    zcfc() {
      window.open("https://www.12306.cn/mormhweb/zcfc_2548/");
    },
    cytc() {
      window.open("https://exservice.12306.cn/excater/index.html");
    },
    ly() {
      window.open("https://travel.12306.cn/portal/");
    },
    bx() {
      window.open("https://kyfw.12306.cn/otn/view/my_insurance.html");
    },
    xjky() {
      window.open("https://kyfw.12306.cn/otn/view/snow_checkedBaggage.html");
    },
    wcp() {
      window.open("https://kyfw.12306.cn/otn/gonggao/ticketType.html");
    },
    wgp() {
      window.open("https://kyfw.12306.cn/otn/gonggao/ticketWindow.html");
    },
    wgq() {
      window.open("https://kyfw.12306.cn/otn/gonggao/windowEndorse.html");
    },
    wtp() {
      window.open("https://kyfw.12306.cn/otn/gonggao/windowRefund.html");
    },
    gd() {
      window.open("https://kyfw.12306.cn/otn/gonggao/help.html");
    },
    dzkp() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means5");
    },
    sfhy() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means5");
    },
    zxbf() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means1");
    },
    ysgc() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means2");
    },
    xyml() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means6");
    },
    zzgz() {
      window.open("https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means7");
    },
    help() {
      window.open("https://kyfw.12306.cn/otn/gonggao/help.html");
    },
    zwd() {
      window.open("https://kyfw.12306.cn/otn/zwdch/init");
    },
    skb() {
      window.open("https://kyfw.12306.cn/otn/queryTrainInfo/init");
    },
    gbpj() {
      window.open("https://kyfw.12306.cn/otn/leftTicketPrice/initPublicPrice");
    },
    jpk() {
      window.open("https://www.12306.cn/index/view/infos/ticket_check.html");
    },
    qssj() {
      window.open("https://www.12306.cn/index/view/infos/sale_time.html");
    },
    zxfb() {
      window.open("https://www.12306.cn/index/index.html#index_ads");
    },
    tq() {
      window.open("http://www.weather.com.cn/weather1d/101180901.shtml#12306");
    },
    jtcx() {
      window.open("https://www.12306.cn/index/view/infos/jiaotong.html");
    },
    dsd() {
      window.open("https://kyfw.12306.cn/otn/queryAgencySellTicket/init");
    },
    kfdh() {
      window.open("https://www.12306.cn/index/view/infos/service_number.html");
    },
    lczt() {
      window.open("https://www.12306.cn/index/view/infos/train-query-status.html");
    },
    xyxx() {
      window.open("https://kyfw.12306.cn/otn/queryDishonest/init");
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
