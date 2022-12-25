<template>
  <div :width="isCollapse ? '0' : '200px'">
    <el-menu
      class="el-menu-vertical-demo"
      :style="'position: fixed; right: 0; bottom: 300px; z-index: 99999;display:'+isDisplay"
      @select="handleSelect"
    >
      <el-menu-item index="1" @click="toNews" id="news">
        <template #title>
          <el-icon><ChatDotSquare /></el-icon>
          <span>最新发布</span>
        </template>
      </el-menu-item>
      <el-menu-item index="2" @click="server">
        <el-icon><PhoneFilled /></el-icon>
        <template #title>联系客服</template>
      </el-menu-item>
      <el-menu-item index="3" class="download">
        <el-icon><PictureFilled /></el-icon>
        <template #title>App 下载</template>
      </el-menu-item>
      <el-menu-item index="4">
        <el-icon><Close /></el-icon>
        <template #title>关闭</template>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
import {
  Close,
  PhoneFilled,
  ChatDotSquare,
  PictureFilled,
} from "@element-plus/icons-vue";
export default {
  components: {
    Close,
    PhoneFilled,
    ChatDotSquare,
    PictureFilled,
  },
  data() {
    return {
      isCollapse: false,
      isDisplay: "inline"
    };
  },
  methods: {
    toNews() {
      const news = document.getElementById("news");
      news.addEventListener("click", function (e) {
        window.scrollTo({ top: 2000, left: 0, behavior: "smooth" });
      });
    },
    server() {
      window.open("https://www.12306.cn/index/view/infos/service_number.html");
    },
    handleSelect(index) {
      if (index == 4) {
        this.isDisplay = "None";
      }
    },
  },
};
</script>

<style>
</style>
