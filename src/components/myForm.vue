<template>
  <div class="tl3">
    <div id="outer" class="tl3_1">
      <div class="tl3_2">
        <ul class="tl3_cp">
          <li @click="click(0)" :class="index>=0&&index<=3 ? 'cp':''">
              <a href="#" :class="index>=0&&index<=3 ? 'ys':''">
                <font-awesome-icon icon="fa-solid fa-train" />
              车票</a>
          </li>
          <li @click="click(4)" :class="index>=4&&index<=7 ? 'cp':''">
              <a href="#" :class="index>=4&&index<=7 ? 'ys':''">
                <font-awesome-icon icon="fa-solid fa-magnifying-glass" />
              常用查询</a>
          </li>
          <li @click="click(8)" :class="index>=8&&index<=9 ? 'cp':''">
               <a href="#" :class="index>=8&&index<=9 ? 'ys':''">
                 <font-awesome-icon icon="fa-solid fa-bell-concierge" />
              订餐</a>
          </li>
        </ul>
        <!--车票选项卡下的功能-->
        <div>
        <ul v-show="index==0||index==1||index==2||index==3" style="margin-top: -330px" class="tl3_cpxx">
          <li @click="click(0)" :class="index==0 ? 'xhx':''">
            <a href="#" :class="index==0 ? 'tgq':''">
              <font-awesome-icon icon="fa-solid fa-right-long"></font-awesome-icon>
              单程</a>
          </li>
          <li @click="click(1)" :class="index==1 ? 'xhx':''">
            <a href="#" :class="index==1 ? 'tgq':''">
              <font-awesome-icon icon="fa-solid fa-right-left" />
              往返</a>
          </li>
          <li @click="click(2)" :class="index==2 ? 'xhx':''">
            <a href="#" :class="index==2 ? 'tgq':''">
              <font-awesome-icon icon="fa-solid fa-retweet" />
              中转换乘
            </a>
          </li>
          <li @click="click(3)" :class="index==3 ? 'xhx':''">
             <a href="#" :class="index==3 ? 'tgq':''">
               <font-awesome-icon icon="fa-solid fa-pen-to-square" />
              退改签
             </a>
          </li>
        </ul>
        </div>
         <!-- 常用查询选下卡下的功能-->
         <ul v-show="index==4||index==5||index==6||index==7" style="margin-top: -330px" class="tl3_cpxx">
           <li @click="click(4)" :class="index==4 ? 'xhx':''">
             <a href="#" :class="index==4 ? 'tgq':''">
               <font-awesome-icon icon="fa-solid fa-clock" />
               正晚点</a>
           </li>
           <li @click="click(5)" :class="index==5 ? 'xhx':''">
             <a href="#" :class="index==5 ? 'tgq':''">
               <font-awesome-icon icon="fa-solid fa-check-to-slot" />
               检票口</a>
           </li>
           <li @click="click(6)" :class="index==6 ? 'xhx':''">
             <a href="#" :class="index==6 ? 'tgq':''">
               <font-awesome-icon icon="fa-solid fa-hourglass-start" />
               起售时间
             </a>
           </li>
           <li @click="click(7)" :class="index==7 ? 'xhx':''">
             <a href="#" :class="index==7 ? 'tgq':''">
               <font-awesome-icon icon="fa-solid fa-cloud-sun"></font-awesome-icon>
               天气查询
             </a>
           </li>
         </ul>
        <!-- 订餐选下卡下的功能-->
        <ul v-show="index==8||index==9" style="margin-top: -330px" class="tl3_cpxx">
          <li @click="click(8)" style="width:45%" :class="index==8 ? 'xhx':''">
            <a href="#" :class="index==8 ? 'tgq':''">
              <font-awesome-icon icon="fa-solid fa-clock-rotate-left" />
                 预订</a>
          </li>
          <li @click="click(9)" style="width: 45%" :class="index==9 ? 'xhx':''">
            <a href="#" :class="index==9 ? 'tgq':''">
              <font-awesome-icon icon="fa-solid fa-utensils" />
              餐饮订单</a>
          </li>
        </ul>
        <!-- 单程   -->
        <transition name="el-fade-in">
          <div v-show="index==0"  class="tl3_dl">
            <el-form :model="form1" label-width="auto">
              <el-form-item label="出发地">
                <el-input id="departure" v-model="form1.name1" style="width: 100%" placeholder="简拼/全拼/汉字"/>
              </el-form-item>
              <el-form-item label="到达地">
                <el-input id="destination" v-model="form1.name2" style="width: 100%" placeholder="简拼/全拼/汉字"/>
              </el-form-item>
              <el-form-item label="出发日期">
                <el-date-picker
                    v-model="form1.date"
                    type="date"
                    placeholder="选择日期"
                    value-format="YYYY-MM-DD"
                    :disabled-date="disabledDate1"
                />
              </el-form-item>
              <el-form-item >
                <div style="margin-left: 70px">
                  <el-checkbox-group v-model="form1.type">
                    <el-checkbox label="学生" name="type" />
                    <el-checkbox label="高铁/动车" name="type" />
                  </el-checkbox-group></div>
              </el-form-item>
              <el-form-item>
                <el-button type="warning" style="width:100%" @click="onSubmit">查询</el-button>
              </el-form-item>
            </el-form>
          </div>
        </transition>
        <!--    往返      -->
        <transition name ="el-fade-in">
          <div v-show="index==1" class="tl3_dl">
            <el-form :model="form2" label-width="auto">
              <el-form-item style="margin-bottom: 10px;" label="出发地">
                <el-input id="departure" v-model="form2.name1" style="width: 100%;" placeholder="简拼/全拼/汉字"/>
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;" label="到达地">
                <el-input id="destination" v-model="form2.name2" style="width: 100%" placeholder="简拼/全拼/汉字"/>
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;" label="出发日期">
                <el-date-picker
                    v-model="form2.date1"
                    type="date"
                    placeholder="选择日期"
                    value-format="YYYY-MM-DD"
                    :disabled-date="disabledDate1"
                />
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;" label="返程日期">
                <el-date-picker
                    v-model="form2.date2"
                    type="date"
                    placeholder="选择日期"
                    value-format="YYYY-MM-DD"
                    :disabled-date="disabledDate1"
                />
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;" >
                <div style="margin-left: 70px;">
                  <el-checkbox-group v-model="form2.type">
                    <el-checkbox label="学生" name="type" />
                    <el-checkbox label="高铁/动车" name="type" />
                  </el-checkbox-group></div>
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;">
                <el-button type="warning" style="width:100%;" @click="onSubmit">查询</el-button>
              </el-form-item>
            </el-form>
        </div>
        </transition>
        <!--   中转换乘    -->
        <transition name="el-fade-in">
        <div v-show="index==2" class="tl3_dl">
          <transition name="el-fade-in">
          <el-form :model="ruleForm1" :rules="rules1" ref="ruleForm1" label-width="auto">
            <el-form-item label="出发地" prop="name1">
              <el-input id="departure" v-model="ruleForm1.name1" style="width: 100%;" placeholder="简拼/全拼/汉字"/>
            </el-form-item>
            <el-form-item label="到达地" prop="name2">
              <el-input id="destination" v-model="ruleForm1.name2" style="width: 100%" placeholder="简拼/全拼/汉字"/>
            </el-form-item>
            <el-form-item label="乘车日期" prop="date">
              <el-date-picker
                  v-model="ruleForm1.date"
                  type="date"
                  placeholder="选择日期"
                  value-format="YYYY-MM-DD"
                  :disabled-date="disabledDate1"
              />
            </el-form-item>
            <el-form-item >
              <div style="margin-left: 70px;">
                <el-checkbox-group v-model="ruleForm1.type">
                  <el-checkbox label="学生" name="type" />
                </el-checkbox-group></div>
            </el-form-item>
            <el-form-item>
              <el-button type="warning" style="width:100%;" @click="submitForm('ruleForm1')">查询</el-button>
            </el-form-item>
          </el-form>
          </transition>
        </div>
        </transition>
        <!--   退改签    -->
        <transition name="el-fade-in">
          <div v-show="index==3" class="tl3_dl">
            <transition name="el-fade-in">
              <el-form :model="ruleForm2" :rules="rules2" ref="ruleForm2" label-width="auto">
                <el-form-item label="查询类型" prop="searchType">
                  <el-radio-group v-model="ruleForm2.searchType">
                    <el-radio label="订票日期" ></el-radio>
                    <el-radio label="乘车日期"></el-radio>
                  </el-radio-group>
                </el-form-item>
                <el-form-item label="开始日期" prop="date1">
                  <el-date-picker
                      v-model="ruleForm2.date1"
                      type="date"
                      placeholder="选择日期"
                      value-format="YYYY-MM-DD"
                      :disabled-date="disabledDate2"
                  />
                </el-form-item>
                <el-form-item label="结束日期" prop="date2">
                  <el-date-picker
                      v-model="ruleForm2.date2"
                      type="date"
                      placeholder="选择日期"
                      value-format="YYYY-MM-DD"
                      :disabled-date="disabledDate2"
                  />
                </el-form-item>
                <el-form-item label="关键字">
                  <el-input id="keyword" v-model="ruleForm2.keyword" style="width: 100%;" placeholder="订单号/车次/乘客姓名"/>
                </el-form-item>
                <el-form-item>
                  <el-button type="warning" style="width:100%;" @click="submitForm('ruleForm2')">查询</el-button>
                </el-form-item>
              </el-form>
            </transition>
          </div>
        </transition>
       <!-- 正晚点 -->
        <transition name="el-fade-in">
          <div v-show="index==4" class="tl3_dl">
            <transition name="el-fade-in">
              <el-form :model="form3" label-width="auto">
                <el-form-item label="查询类型" prop="searchType">
                  <el-radio-group v-model="form3.searchType">
                    <el-radio label="到达站" ></el-radio>
                    <el-radio label="出发站"></el-radio>
                  </el-radio-group>
                </el-form-item>
                <el-form-item label="车站">
                  <el-input id="station" v-model="form3.station" style="width: 230px;" placeholder="简拼/全拼/汉字"/>
                </el-form-item>
                <el-form-item label="车次">
                  <el-input id="station" v-model="form3.trains" style="width: 230px;" placeholder="请输入车次"/>
                </el-form-item>
                <el-form-item>
                  <el-button type="warning" style="width:100%;" @click="onSubmit">查询</el-button>
                </el-form-item>
              </el-form>
            </transition>
          </div>
        </transition>
        <!-- 检票口 -->
        <transition name="el-fade-in">
          <div v-show="index==5" class="tl3_dl">
            <transition name="el-fade-in">
              <el-form :model="ruleForm3" :rules="rules3" ref="ruleForm3" label-width="auto">
                <el-form-item label="乘车日期" prop="date">
                  <el-date-picker
                      v-model="ruleForm3.date"
                      type="date"
                      placeholder="选择日期"
                      value-format="YYYY-MM-DD"
                      :disabled-date="disabledDate1"
                  />
                </el-form-item>
                <el-form-item label="车次" prop="name1">
                  <el-input id="departure" v-model="ruleForm3.name1" style="width: 100%;" placeholder="请输入车次"/>
                </el-form-item>
                <el-form-item label="乘车站" prop="name2">
                  <el-input id="departure" v-model="ruleForm3.name2" style="width: 100%;" placeholder="请输入乘车站"/>
                </el-form-item>
                <el-form-item>
                  <el-button type="warning" style="width:100%;" @click="submitForm('ruleForm3')">查询</el-button>
                </el-form-item>
              </el-form>
            </transition>
          </div>
        </transition>
        <!-- 起售时间 -->
        <transition name="el-fade-in">
          <div v-show="index==6" class="tl3_dl">
            <transition name="el-fade-in">
              <el-form :model="ruleForm4" :rules="rules4" ref="ruleForm4" label-width="auto">
                <el-form-item label="起售日期" prop="date">
                  <el-date-picker
                      v-model="ruleForm4.date"
                      type="date"
                      placeholder="选择日期"
                      value-format="YYYY-MM-DD"
                      :disabled-date="disabledDate1"
                  />
                </el-form-item>
                <el-form-item label="起售车站" prop="station">
                  <el-input id="departure" v-model="ruleForm4.station" style="width: 100%;" placeholder="简拼/全拼/汉字"/>
                </el-form-item>
                <el-form-item>
                  <el-button type="warning" style="width:100%;" @click="submitForm('ruleForm4')">查询</el-button>
                </el-form-item>
              </el-form>
            </transition>
          </div>
        </transition>
        <!-- 天气查询 -->
        <transition name="el-fade-in">
          <div v-show="index==7" class="tl3_dl">
            <transition name="el-fade-in">
              <el-form :model="ruleForm5" :rules="rules5" ref="ruleForm5" label-width="auto">
                <el-form-item label="目的地" prop="weather">
                  <el-input id="departure" v-model="ruleForm5.weather" style="width: 250px;" placeholder="简拼/全拼/汉字"/>
                </el-form-item>
                <el-form-item>
                  <el-button type="warning" style="width:100%;" @click="submitForm('ruleForm5')">查询</el-button>
                </el-form-item>
              </el-form>
            </transition>
          </div>
        </transition>
        <!--    预订      -->
        <transition name ="el-fade-in">
          <div v-show="index==8" class="tl3_dl">
            <el-form :model="form4" label-width="auto">
              <el-form-item style="margin-bottom: 10px;" label="出发日期">
                <el-date-picker
                    v-model="form4.date"
                    type="date"
                    placeholder="选择日期"
                    value-format="YYYY-MM-DD"
                    :disabled-date="disabledDate1"
                />
              </el-form-item>
              <el-form-item label="出发地">
                <el-input id="departure" v-model="form4.departure" style="width: 100%;" placeholder="仅支持G、D字头的动车组列车"/>
              </el-form-item>
              <el-form-item>
                <el-button type="warning" style="width:100%;" @click="onSubmit">查询</el-button>
              </el-form-item>
            </el-form>
          </div>
        </transition>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "myForm",
  mounted() {
    let that = this
    that.getCurrentTime()
  },
  data() {
    return {
      index:4,
      form1: {
        name1: '',
        name2: '',
        type: [],
        date: '',
      },
      form2: {
        name1: '',
        name2: '',
        date1: '',
        date2: '',
        type: [],
      },
      ruleForm1: {
        name1: '',
        name2: '',
        date: '',
        type: [],
      },
      ruleForm2: {
        searchType: '订票日期',
        date1: '',
        date2: '',
        keyword:'',
      },
      form3: {
        searchType: '到达站',
        station: '',
        trains: '',
      },
      ruleForm3: {
        name1: '',
        name2:'',
        date: '',
      },
      ruleForm4: {
        date: '',
        station: '',
      },
      ruleForm5: {
        weather: '',
      },
      form4:{
        departure:'',
        date:'',
      },
      rules1: {
        name1: [
          { required: true, message: '请输入出发地', trigger: 'blur' },
        ],
        name2: [
          { required: true, message: '请输入目的地', trigger: 'blur' },
        ],
        date: [
          { type: 'date', required: true, message: '请选择乘车日期', trigger: 'change' }
        ]
      },
      rules2: {
        date1: [
          { type: 'date', required: true, message: '请选择开始日期', trigger: 'change' }
        ],
        date2: [
          { type: 'date', required: true, message: '请选择结束日期', trigger: 'change' }
        ]
      },
      rules3: {
        name1: [
          { required: true, message: '请输入车站', trigger: 'blur' },
        ],
        name2: [
          { required: true, message: '请输入车次', trigger: 'blur' },
        ],
        date: [
          { type: 'date', required: true, message: '请选择乘车日期', trigger: 'change' }
        ]
      },
      rules4: {
        station: [
          { required: true, message: '请输入起售车站', trigger: 'blur' },
        ],
        date: [
          { type: 'date', required: true, message: '请选择起售日期', trigger: 'change' }
        ]
      },
      rules5: {
        weather: [
          { required: true, message: '请输入目的地', trigger: 'blur' },
        ],
      },
    }
  },
  methods: {
    onSubmit() {
      console.log('submit!');
    },
    click(i) {
      this.index = i;
    },
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert('submit!');
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    // 获取日期
    handleHistoryData(val) {
      console.log(val)
      this.date = val
    },
    //只能选择当前日期之后的
    disabledDate1(time) {
      return time.getTime() < Date.now() - 8.64e7;  //如果没有后面的-8.64e7就是不可以选择今天的
    },
    //只能选择当前日期之前的
    disabledDate2(time) {
      return time.getTime() >= Date.now();  //如果没有后面的-8.64e7就是不可以选择今天的
    },
    // 获取当前日期
    getCurrentTime() {
      let currentTime = new Date(), year = currentTime.getFullYear(),
          month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
          day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate()
      this.form1.date = year + '-' + month + '-' + day
      this.form2.date1 = this.form1.date
      this.form2.date2 = this.form1.date
      this.ruleForm1.date = this.form1.date
      this.ruleForm2.date1 = this.form1.date
      this.ruleForm2.date2 = this.form1.date
      this.ruleForm3.date = this.form1.date
      this.ruleForm4.date = this.form1.date
      this.form4.date = this.form1.date
    }
  },
}
</script>

<style scoped>
@import "../assets/css/index.css";
@import "../assets/css/reset.css";
.el-form-item{

}
</style>