<template>
  <el-tabs type="border-card" class="demo-tabs">
    <el-tab-pane label="最新发布">
      <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="address" label="Address" />
        <el-table-column prop="date" label="Date" width="200" />
      </el-table>
    </el-tab-pane>

    <el-tab-pane label="常见问题">
      <el-table :data="tableData2" style="width: 100%">
        <el-table-column prop="address" label="Address" />
        <el-table-column prop="date" label="Date" width="200" />
      </el-table>
    </el-tab-pane>
    <el-tab-pane label="信用信息">
      <div style="display: flex; flex-direction: row">
        <div style="width: 50%">
          <span style="font-size: 16px">
            <el-icon><Avatar /></el-icon>
            失信被执行人（自然人）公示</span
          >
          <el-table :data="tableData3" style="width: 90%; margin-left: 50px">
            <el-table-column prop="address" label="Address" />
            <el-table-column prop="date" label="Date" width="200" />
          </el-table>
        </div>
        <div style="width: 50%">
          <span style="font-size: 16px">
            <el-icon><User /></el-icon>
            失信被执行人（自然人）公示</span
          >
          <el-table :data="tableData4" style="width: 90%; margin-left: 100px">
            <el-table-column prop="address" label="Address" />
            <el-table-column prop="date" label="Date" width="200" />
          </el-table>
        </div>
      </div>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
import { Avatar, User } from "@element-plus/icons-vue";
export default {
  components: {
    Avatar,
    User,
  },
  data() {
    return {
      tableData: [
        {
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1517 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1519 弄",
        },
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1516 弄",
        },
      ],
      tableData2: [
        {
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1517 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1519 弄",
        },
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1516 弄",
        },
      ],
      tableData4: [
        {
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄",
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1517 弄",
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1519 弄",
        },
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1516 弄",
        },
      ],
    };
  },
};
</script>

<style>
.demo-tabs {
  width: 80%;
  margin-left: 150px;
  margin-top: 40px;
}

.demo-tabs > .el-tabs__content {
  padding: 32px;
  color: #6b778c;
  font-size: 32px;
  font-weight: 600;
}

.el-tabs__item {
  width: 406px;
}
</style>
