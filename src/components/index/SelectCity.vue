<template>
<div>
  <div id="select">
    <div class="cities">郑州</div>
    <div class="cities">北京</div>
    <div class="cities">西宁</div>
    <div class="cities">拉萨</div>
    <div class="cities">呼和浩特</div>
    <div class="cities">哈尔滨</div>
    <div class="cities">长春</div>
    <div class="cities">沈阳</div>
    <div class="cities">三亚</div>
    <div class="cities">兰州</div>
    <div class="cities">天津</div>
    <div class="cities">太原</div>
    <div class="cities">济南</div>
    <div class="cities">银川</div>
    <div class="cities">西安</div>
    <div class="cities">乌鲁木齐</div>
    <div class="cities">南京</div>
    <div class="cities">杭州</div>
    <div class="cities">福州</div>
    <div class="cities">广州</div>
    <div class="cities">台北</div>
    <div class="cities">南宁</div>
    <div class="cities">昆明</div>
    <div class="cities">成都</div>
    <div class="cities">重庆</div>
    <div class="cities">贵阳</div>
    <div class="cities">长沙</div>
    <div class="cities">南昌</div>
    <div class="cities">合肥</div>
    <div class="cities">武汉</div>
    <div class="cities">上海</div>
    <div class="cities">海口</div>
    <div class="cities">香港</div>
    <div class="cities">澳门</div>
  </div>
</div>
</template>

<script>
import $ from "../../assets/js/jquery-1.12.3.min"
export default {
  name: "SelectCity1",
  props: ['city', 'vis'],
  mounted() {
    const _this = this
    $(document).ready(function(){
      $(".cities").click(function(){
        if(_this.vis == true) {
          _this.$emit("update:vis", false);
          _this.$emit("update:city", $(this).text());
        }
      });
    });
  }
}
</script>

<style scoped>
#select{
  width:420px;
  height:185px;
  position:absolute;
  top:31px;
  left:0;
  background:#eeeeee;
}
.cities{
  width:60px;
  height:25px;
  line-height:25px;
  margin:5px 5px 0 5px;
  float:left;
  text-align:center;
  font-family:'Times New Roman';
  font-size:15px;
  cursor:pointer;
}
</style>
