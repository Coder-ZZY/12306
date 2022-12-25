<template>
  <el-tabs type="border-card" class="demo-tabs">
    <el-tab-pane label="最新发布">
      <div style="padding: 0 20px 20px;display: block">
        <ul class="recent">
          <li v-for="item in recent_posts">
            <a :href="item.url" target="_blank">
            {{item.content}}
            </a>
            <span>{{item.cDate}}</span>
          </li>
        </ul>
      </div>
      <div style="float: right;color: #999;font-size: 14px;margin-right: 15px;margin-top:-20px;font-weight: normal">
        <a href="https://www.12306.cn/mormhweb/zxdt/index_zxdt.html" target="_blank" style="text-decoration: none;color: #999;">更多></a>
      </div>
    </el-tab-pane >

    <el-tab-pane label="常见问题">
      <div style="padding: 0 20px 20px;display: block">
        <ul class="recent">
          <li v-for="item in common_questions">
            <a :href="item.url" target="_blank">
              {{item.content}}
            </a>
          </li>
        </ul>
      </div>
      <div style="float: right;color: #999;font-size: 14px;margin-right: 15px;margin-top:-20px;font-weight: normal">
        <a href="https://kyfw.12306.cn/otn/gonggao/help.html" target="_blank" style="text-decoration: none;color: #999;">更多></a>
      </div>
    </el-tab-pane>
    <el-tab-pane label="信用信息">
      <div style="padding: 0 20px 20px;width: 1148px;height: 216px">
        <dl class="discredit-list pull-left">
          <dt>
            失信被执行人(自然人)公示
          </dt>
          <div style="height: 128px;overflow: hidden" class="demo">
            <div class="dd_left"><img style="display: block;width: 100px;height: 80px;margin:15px auto" src="https://www.12306.cn/index/images/empty.png">
              <div style="color: #999;font-size: 14px;font-weight: normal">暂无公示数据</div>
            </div>
          </div>
          <dd class="more">
            <a href="https://kyfw.12306.cn/otn/queryDishonest/init">更多></a>
          </dd>
        </dl>
        <dl class="discredit-list pull-right">
          <dt>
            失信已执行人(自然人)公布
          </dt>
          <div style="height: 128px;overflow: hidden" class="demo1">
            <div class="dd_right">
              <dd v-for="item in executor_list" class="dis-item">
                <span class="person-name">{{item.name}}</span>
                <span class="person-card">{{item.idNum}}</span>
              </dd>
            </div>
          </div>
          <dd class="more">
            <a href="https://kyfw.12306.cn/otn/queryDishonest/init" target="_blank">更多></a>
          </dd>
        </dl>
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
      recent_posts: [],
      common_questions: [],
      executor_list: []
    };
  },
  mounted: function () {
    this.loadRecentPosts()
    this.loadCommonQuesions()
    this.loadExecutorList()
  },
  methods: {
    loadRecentPosts() {
      this.$axios.get('/recent_posts').then(resp => {
        if(resp && resp.data.code === 200) {
          this.recent_posts = resp.data.result
        }
      })
    },
    loadCommonQuesions() {
      this.$axios.get('/common_questions').then(resp => {
        if(resp && resp.data.code === 200) {
          this.common_questions = resp.data.result
        }
      })
    },
    loadExecutorList() {
      this.$axios.get('/executor_list').then(resp => {
        if(resp && resp.data.code === 200) {
          this.executor_list = resp.data.result
        }
      })
    }
  }
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
.recent {
  width: 1208px;
  height: 180px;
  padding: 0px;
  margin:0px;
  list-style-type: none;
}
.recent li {
  float: left;
  width: 544px;
  margin-right: 60px;
  height: 36px;
  line-height: 36px;
}
.recent li a {
  float:left;
  height: 36px;
  line-height: 36px;
  color: #333;
  font-weight: normal;
  font-size: 14px;
  max-width: 70%;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  text-decoration: none;
}
.recent li:before {
  content: "";
  float: left;
  width: 6px;
  height: 6px;
  background: #3B99FC;
  margin: 15px 20px 0 0;
}
.recent li span {
  float: right;
  color: #999;
  font-size: 12px;
  font-weight: normal;
}
.discredit-list {
  width: 544px;
  text-align: center;
  margin: 0px;
}
.more {
  text-align: right;
  height: 20px;
  line-height: 20px;
  margin-top: 15px;
  position: relative;
  padding-right: 60px;
}
.more a {
  color: #999;
  font-size: 14px;
  font-weight: normal;
  text-decoration: none;
}
.pull-left {
  float: left;
}
.pull-left dt {
  font-size: 16px;
  height: 48px;
  line-height: 46px;
  border-bottom: 2px solid #DEDEDE;
  margin-bottom: 5px;
  font-weight: normal;
  color: #333;
}
.pull-right {
  float: right;
}
.pull-right dt {
  font-size: 16px;
  height: 48px;
  line-height: 46px;
  border-bottom: 2px solid #DEDEDE;
  margin-bottom: 5px;
  font-weight: normal;
  color: #333;
}
.dis-item {
  height: 32px;
  line-height: 32px;
  border-bottom: 1px solid #DEDEDE;
  text-align: left;
  padding: 0 60px;
}
.dis-item:before {
  content: "";
  width: 6px;
  height: 6px;
  float: left;
  margin: 13px 20px 0 0;
  background: #348ff3;
}
.person-name {
  float: left;
  width: 230px;
  overflow: hidden;
  -ms-text-overflow: ellipsis;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 14px;
  font-weight: normal;
  color: rgb(51,51,51);
}
.person-card {
  float: right;
  overflow: hidden;
  -ms-text-overflow: ellipsis;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 14px;
  font-weight: normal;
  color: rgb(51,51,51);
}
</style>
