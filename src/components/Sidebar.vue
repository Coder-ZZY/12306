<template>
  <div :width="isCollapse ? '0' : '200px'">
    <el-menu
      class="el-menu-vertical-demo"
      style="position: fixed; right: 0; bottom: 100px; z-index: 99999"
    >
      <el-menu-item index="1" @click="toNews" id="news">
        <template #title>
          <el-icon><ChatDotSquare /></el-icon>
          <span>最新发布</span>
        </template>
      </el-menu-item>
      <el-menu-item index="2">
        <el-icon><PhoneFilled /></el-icon>
        <template #title>联系客服</template>
      </el-menu-item>
      <el-menu-item index="3" class="download">
        <el-icon><PictureFilled /></el-icon>
        <template #title>App 下载</template>
      </el-menu-item>
    </el-menu>
    <el-button
      @click="handelColse"
      style="
        width: 125px;
        height: 40px;
        border: none;
        position: fixed;
        right: 0;
        bottom: 70px;
        z-index: 99999;
      "
      ><el-icon><Close /></el-icon>关闭</el-button
    >
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
    };
  },
  methods: {
    toNews() {
      const news = document.getElementById("news");
      news.addEventListener("click", function (e) {
        window.scrollTo({ top: 1000, left: 0, behavior: "smooth" });
      });
    },
    handelColse() {
      this.isCollapse = !this.isCollapse;
    },
  },
};
</script>

<style>
</style>