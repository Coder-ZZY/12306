<template>
  <el-tabs tab-position="left" style="height: 300px">
    <el-tab-pane label="车票">
      <el-tabs
        v-model="activeName"
        @tab-click="handleClick"
        style="height: 80px"
      >
        <el-tab-pane label="单程" name="first">

        </el-tab-pane>

        <el-tab-pane label="往返" name="second">往返</el-tab-pane>
        <el-tab-pane label="中转换乘" name="third">中转换乘</el-tab-pane>
        <el-tab-pane label="退改签" name="fourth">退改签</el-tab-pane>
      </el-tabs>
    </el-tab-pane>

    <el-tab-pane label="常用查询">
      <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="正晚点" name="first">单程</el-tab-pane>
        <el-tab-pane label="检票口" name="second">往返</el-tab-pane>
        <el-tab-pane label="起售时间" name="third">中转换乘</el-tab-pane>
        <el-tab-pane label="天气查询" name="fourth">退改签</el-tab-pane>
      </el-tabs>
    </el-tab-pane>
    <el-tab-pane label="订餐">
      <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="预订" name="first">单程</el-tab-pane>
        <el-tab-pane label="餐饮" name="second">往返</el-tab-pane>
      </el-tabs>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
export default {
  data() {
    return {};
  },
};
</script>

<style>
.el-tabs {
  width: 500px;
}
</style>