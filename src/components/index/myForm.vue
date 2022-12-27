<template>
  <div class="tl3"  style="position: absolute;top: 120px">
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
                <el-input id="departure" v-model="form1.name1" style="width: 100%"
                          placeholder="简拼/全拼/汉字" @focus="v1=true" @blur="wait(1)"/>
                <SelectCity style="z-index:999;" v-show="v1" v-model:city="form1.name1" v-model:vis="v1"/>
              </el-form-item>
              <el-form-item label="到达地">
                <el-input id="destination" v-model="form1.name2" style="width: 100%"
                          placeholder="简拼/全拼/汉字" @focus="v2=true" @blur="wait(2)"/>
                <SelectCity style="z-index:999;" v-show="v2" v-model:city="form1.name2" v-model:vis="v2"/>
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
                <el-button type="warning" style="width:100%" @click="onSubmit(form1.name1, form1.name2, form1.type)">查询</el-button>
              </el-form-item>
            </el-form>
          </div>
        </transition>
        <!--    往返      -->
        <transition name ="el-fade-in">
          <div v-show="index==1" class="tl3_dl">
            <el-form :model="form2" label-width="auto">
              <el-form-item style="margin-bottom: 10px;" label="出发地">
                <el-input id="departure" v-model="form2.name1" style="width: 100%;"
                          placeholder="简拼/全拼/汉字" @focus="v3=true" @blur="wait(3)"/>
                <SelectCity style="z-index:999;" v-show="v3" v-model:city="form2.name1" v-model:vis="v3"/>
              </el-form-item>
              <el-form-item style="margin-bottom: 10px;" label="到达地">
                <el-input id="destination" v-model="form2.name2" style="width: 100%"
                          placeholder="简拼/全拼/汉字" @focus="v4=true" @blur="wait(4)"/>
                <SelectCity style="z-index:999;" v-show="v4" v-model:city="form2.name2" v-model:vis="v4"/>
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
                <el-button type="warning" style="width:100%;" @click="onSubmit(form2.name1, form2.name2, form2.type)">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="kyfw(ruleForm1.name1, ruleForm1.name2)">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="train_order(ruleForm2.date1, ruleForm2.date2, ruleForm2.searchType)">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="zwd(form3.station, form3.trains,form3.searchType)">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="jpk()">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="qssj(ruleForm4.station, ruleForm4.date)">查询</el-button>
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
                  <el-button type="warning" style="width:100%;" @click="jump()">查询</el-button>
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
                <el-button type="warning" style="width:100%;" @click="yd()">查询</el-button>
              </el-form-item>
            </el-form>
          </div>
        </transition>
      </div>
    </div>
  </div>
  <el-dialog title="车票查询结果" v-model="dialogTableVisible" width="98%">
    <el-table :data="gridData">
      <el-table-column property="trainNum" label="车次" width="80"></el-table-column>
      <el-table-column property="startStation" label="出发站" width="80"></el-table-column>
      <el-table-column property="endStation" label="到达站" width="80"></el-table-column>
      <el-table-column property="startTime" label="出发时间" width="80"></el-table-column>
      <el-table-column property="endTime" label="到达时间" width="80"></el-table-column>
      <el-table-column property="totalTime" label="历时" width="80"></el-table-column>
      <el-table-column property="arrive" label="何时到达" width="80"></el-table-column>
      <el-table-column property="principalSeat" label="商务座特等座" width="70"></el-table-column>
      <el-table-column property="fristSeat" label="一等座" width="80"></el-table-column>
      <el-table-column property="secondSeat" label="二等座" width="80"></el-table-column>
      <el-table-column property="advancedSleeper" label="高级软卧" width="80"></el-table-column>
      <el-table-column property="fristSleeper" label="软卧一等卧" width="100"></el-table-column>
      <el-table-column property="dongSleeper" label="动卧" width="80"></el-table-column>
      <el-table-column property="secondSleeper" label="硬卧二等卧" width="95"></el-table-column>
      <el-table-column property="softSeat" label="软座" width="70"></el-table-column>
      <el-table-column property="hardSeat" label="硬座" width="70"></el-table-column>
      <el-table-column property="noSeat" label="无座" width="70"></el-table-column>
      <el-table-column property="other" label="其他" width="70"></el-table-column>
    </el-table>
    <el-button type="primary" @click="dialogTableVisible = false" style="margin-top: 20px">确 定</el-button>
  </el-dialog>
</template>

<script>
import SelectCity from "@/components/index/SelectCity"
export default {
  name: "myForm",
  components: {SelectCity},
  mounted() {
    let that = this
    that.getCurrentTime()
  },
  data() {
    return {
      index:0,
      v1: false,
      v2: false,
      v3: false,
      v4: false,
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
      gridData: [{
        end_time:"02:18",
        other: "--"
      }],
      dialogTableVisible: false
    }
  },
  methods: {
    onSubmit(name1, name2, l) {
      if(name1=== "" || name2 === "") {
        alert("出发地或到达地不能为空!")
        return;
      }
      let isQuick = false;
      if(l.indexOf("高铁/动车") > -1)
        isQuick = true
      this.dialogTableVisible = true;
      this.$axios.get('/tickets?startStation=' + name1 + "&endStation=" + name2 + "&isQuick=" + isQuick).then(resp => {
        if(resp && resp.data.code === 200) {
          this.gridData = resp.data.result;
        }
      })
    },
    wait(k) {
      const _this = this
      if(k===1) {
        setTimeout(function () {
          _this.v1 = false
        },100)
      } else if(k===2) {
        setTimeout(function () {
          _this.v2 = false
        },100)
      } else if(k===3) {
        setTimeout(function () {
          _this.v3 = false
        },100)
      } else if(k===4) {
        setTimeout(function () {
          _this.v4 = false
        },100)
      }
    },
    click(i) {
      this.index = i;
    },
    kyfw(name1, name2) {
      let cityCode1, cityCode2;
      if (this.ruleForm1.name1 == "北京" && this.ruleForm1.name2 == "上海") {
        cityCode1 = 'BJP';
        cityCode2 = "SHH"
        window.location.href =
            "https://kyfw.12306.cn/otn/lcQuery/init?linktypeid=lx&fs=" + name1 + "," + cityCode1 + "&ts=" + name2 + "," + cityCode2 + "&date=" + this.ruleForm1.date + "&flag=N,N,Y";
      } else if (this.ruleForm1.name1 == "上海" && this.ruleForm1.name2 == "北京") {
        cityCode1 = 'SHH';
        cityCode2 = "BJP"
        window.location.href =
            "https://kyfw.12306.cn/otn/lcQuery/init?linktypeid=lx&fs=" + name1 + "," + cityCode1 + "&ts=" + name2 + "," + cityCode2 + "&date=" + this.ruleForm1.date + "&flag=N,N,Y";
      }
      else{
        window.open("https://kyfw.12306.cn/otn/lcQuery/init?linktypeid=lx&fs=" + name1 + "&ts=" + name2  + "&date=" + this.ruleForm1.date + "&flag=N,N,Y");
      }
    },
    train_order(date1, date2, searchType) {
      if (searchType == "订票日期") {
        window.location.href =
            "https://kyfw.12306.cn/otn/view/train_order.html?type=2&query_type=" + 1 + "&begin_date=" + date1 + "&end_date=" + date2 + "&sequence_no=";
      } else if (searchType == "乘车日期") {
        window.location.href =
            "https://kyfw.12306.cn/otn/view/train_order.html?type=2&query_type=" + 2 + "&begin_date=" + date1 + "&end_date=" + date2 + "&sequence_no=";
      }
    },
    zwd(station, trains, searchType) {
      let station_code
      if (searchType == "出发站") {
        if (station == '北京') {
          station_code = 'BJP'
          window.location.href =
              "https://kyfw.12306.cn/otn/zwdch/init?cc="+ trains + "&cxlx=0&station_name=" + station + "&station_code=" + station_code;
        }
      } else if (searchType == "到达站") {
        if (station == '北京') {
          station_code = 'BJP'
          window.location.href =
              "https://kyfw.12306.cn/otn/zwdch/init?cc="+ trains + "&cxlx=1&station_name=" + station + "&station_code=" + station_code;
        }
      }
    },
    jpk() {
      if (this.ruleForm3.name1 == "Z2") {
        window.location.href =
            "https://www.12306.cn/index/view/infos/ticket_check.html?isremoveStore=1";
      }
    },
    qssj(station, date) {
      let city;
      if (this.ruleForm4.station == "北京") {
        city = 'BJP';
        window.location.href =
            "https://www.12306.cn/index/view/infos/sale_time.html?station_name=" + station + "&station_code=" + city + "&trainDate=" + date;
      } else if (this.ruleForm4.station == "上海") {
        city = 'SHH';
        window.location.href =
            "https://www.12306.cn/index/view/infos/sale_time.html?station_name=" + station + "&station_code=" + city + "&trainDate=" + date;
      } else if (this.ruleForm4.station == "郑州") {
        city = 'ZZF';
        window.location.href =
            "https://www.12306.cn/index/view/infos/sale_time.html?station_name=" + station + "&station_code=" + city + "&trainDate=" + date;
      }
    },
    jump (){
      let weatherid;
      if(this.ruleForm5.weather == "北京"){
        weatherid='101010100';
        window.open('http://www.weather.com.cn/weather/'+weatherid+'.shtml');
      }
      else if(this.ruleForm5.weather == "上海"){
        weatherid='101020100';
        window.open('http://www.weather.com.cn/weather/'+weatherid+'.shtml');
      }
      else if(this.ruleForm5.weather == "合肥"){
        weatherid='101220101';
        window.open('http://www.weather.com.cn/weather/'+weatherid+'.shtml');
      }
      else if(this.ruleForm5.weather == "郑州"){
        weatherid='101180101';
        window.open('http://www.weather.com.cn/weather/'+weatherid+'.shtml');
      }
      else
      {alert("没有输入城市的天气，请检查后重试！")}
    },
    yd() {
      window.location.href =
          "https://exservice.12306.cn/excater/list.html?date=" + this.form4.date + "&code=" + this.form4.departure;
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
@import "../../assets/css";
@import "../../assets/css/reset.css";
.el-form-item{
}
</style>