<template>
  <div class="tab">
    <div class="content">
      <div style="margin: auto;width: 90%">
        <!--4个按钮-->
        <button :class="index == number ? 'btn1':'btn'" @click="tab(index)" v-for="(item ,index) in dataList"
                :key="index">{{item.option}}
        </button>
      </div>
      <!--4个div-->
      <div id="content1" v-show="number == 0">
        <span>Java语言：Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念。</span>
      </div>
      <div id="content2" v-show="number == 1">
        <span>C语言：C语言是一门面向过程的、抽象化的通用程序设计语言，广泛应用于底层开发。</span>
      </div>
      <div id="content3" v-show="number == 2">
        <span>JavaScript：是一种具有函数优先的轻量级，解释型或即时编译型的编程语言。</span>
      </div>
      <div id="content4" v-show="number == 3">
        <span>PHP：是在服务器端执行的脚本语言，尤其适用于Web开发并可嵌入HTML中。</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "tab",
  data() {
    return {
      number: 0, //点击后的值，与下标同步，为0表示默认第一个按钮与div为选中状态
      dataList: [
        {option: 'Java'},
        {option: 'C+'},
        {option: 'JavaScript'},
        {option: 'PHP'},
      ]
    }
  },
  methods: {
    //定义切换方法
    tab(index) {
      this.number = index;
      // console.log(index, this.number);
    }
  }
}
</script>

<style scoped lang="less">
.content {
  width: 700px;
  margin: auto;
  /*按钮样式*/
  /*未选中时*/
  .btn {
    width: 150px;
    height: 40px;
    border: 0;
    border-radius: 5px;
    color: white;
    margin: 20px 3px;
    background-color: #35cc8f;
  }

  /*选中时*/
  .btn1 {
    width: 150px;
    height: 40px;
    border: 0;
    border-radius: 5px;
    color: white;
    margin: 20px 3px;
    background-color: #099941;
  }

  #content1, #content2, #content3, #content4 {
    background-color: #c1f8c9;
    height: 300px;
    font-size: 16px;
    line-height: 40px;
  }
}
</style>