<template>
  <div class="footer" style="background-color: #F8F8F8;">
    <div class="foot-links">
      <h2 class="foot-con-tit">友情链接</h2>
      <ul class="foot-links-list" role="menubar">
        <li role="menuitem" style="border: 1px solid gainsboro">
          <a title="中国国家铁路集团有限公司" href="javascript:;">
            <img
              src="@/assets/footer/link05.png"
              alt="中国国家铁路集团有限公司"
              style="width: 200px; height: 50px"
            />
          </a>
        </li>
        <li
          role="menuitem"
          style="margin-left: 5px; border: 1px solid gainsboro"
        >
          <a title="中国铁路财产保险自保有限公司" href="javascript:;">
            <img
              src="@/assets/footer/link02.png"
              alt="中国铁路财产保险自保有限公司"
              style="width: 200px; height: 50px"
            />
          </a>
        </li>
        <li
          role="menuitem"
          style="margin-top: 5px; border: 1px solid gainsboro"
        >
          <a title="中国铁路95306网" href="javascript:;">
            <img
              style="width: 200px; height: 50px"
              src="@/assets/footer/link03.png"
              alt="中国铁路95306网"
            />
          </a>
        </li>
        <li
          style="margin-left: 5px; margin-top: 5px; border: 1px solid gainsboro"
        >
          <a title="中铁快运股份有限公司" href="javascript:;">
            <img
              style="width: 200px; height: 50px"
              src="@/assets/footer/link04.png"
              alt="中铁快运股份有限公司"
            />
          </a>
        </li>
      </ul>
    </div>
    <ul class="foot-code" style="padding-top: 50px">
      <li style="width: 140px;display: flex;flex-direction: column;">
        <h2 class="foot-con-tit">中国铁路官方微信</h2>
        <div class="code-pic">
          <img
            style="width: 100px; height: 100px; border: 1px solid gainsboro"
            src="@/assets/footer/zgtlwx.png"
            alt="中国铁路官方微信"
          />
        </div>
      </li>
      <li style="width: 140px;display: flex;flex-direction: column;">
        <h2 class="foot-con-tit">中国铁路官方微博</h2>
        <div class="code-pic">
          <img
            style="width: 100px; height: 100px; border: 1px solid gainsboro"
            src="@/assets/footer/zgtlwb.png"
            alt="中国铁路官方微博"
          />
        </div>
      </li>
      <li style="width: 110px;display: flex;flex-direction: column;">
        <h2 class="foot-con-tit">12306 公众号</h2>
        <div class="code-pic">
          <img
            style="width: 100px; height: 100px; border: 1px solid gainsboro"
            src="@/assets/footer/public.png"
            alt="12306 公众号"
          />
        </div>
      </li>
      <li style="width: 110px;display: flex;flex-direction: column;">
        <h2 class="foot-con-tit">铁路12306</h2>
        <div class="code-pic">
          <img
            style="width: 100px; height: 100px; border: 1px solid gainsboro"
            src="@/assets/footer/download.png"
            alt="铁路12306"
          />
          <div class="code-tips">
            官方APP下载，目前铁路未授权其他网站或APP开展类似服务内容，敬请广大用户注意。
          </div>
        </div>
      </li>
    </ul>
    <div class="footer-txt" style="width: 100%; position: absolute;background-color: #696969;">
      <p>
        <span class="mr">版权所有©2008-2022</span>
        <span class="mr">中国铁道科学研究院集团有限公司</span>
        <span>技术支持：铁旅科技有限公司</span>
      </p>
      <p>
        <span class="mr">
          <img src="https://www.12306.cn/index/images/gongan.png" alt="公安" style="width:13px">
          <a target="blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010802038392" style="color:#c1c1c1">京公网安备 11010802038392号</a>
        </span>
        <span class="mr">|</span>
        <span class="mr">京ICP备05020493号-4</span>
        <span class="mr">|</span>
        <span>ICP证：京B2-20202537</span>
      </p>
      <div style="position: absolute;top: 17px;left: 50%;margin-left: 350px;">
        <img src="@/assets/footer/footer-slh.jpg" style="display: block;width: 130px;height: 46px;" alt="适老化无障碍服务">
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

li {
  list-style: none;
}

.foot-links-list {
  width: 420px;
  display: flex;
  flex-wrap: wrap;
}
.foot-links {
  margin: 35px 20px 20px 150px;
  /* padding-left: 40px; */
  padding-left: 40px;
  float: left;
  width: 420px;
  height: 250px;
}
.foot-con-tit {
  height: 54px;
  line-height: 54px;
  font-size: 14px;
  float: left;
}
.foot-code {
  display: flex;
  flex-direction: row;
}
.footer .foot-code .code-tips {
    position: absolute;
    top: 1480px;
    right: 160px;
    width: 190px;
    height: 80px;
    border: 1px solid #DEDEDE;
    background-color: #fff;
    line-height: 18px;
    padding: 20px 10px 0;
    font-size: 13px;
    text-align: left;
}
.footer-txt {
    height: 60px;
    text-align: center;
    padding: 20px 0;
    background: #666;
    color: #c1c1c1;
    font-size: 13px;
}
.mr {
    margin-right: 20px !important;
}
</style>
