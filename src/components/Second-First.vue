<template>
  <div class="search-main">
    <!-- 车票查询 -->
    <div class="search-main-item" style="display: block">
      <div class="search-main-tab">
        <div class="search-tab-hd">
          <ul>
            <li class="">
              <a href="javascript:void(0)">
                <i class="icon icon-dancheng"></i>单程</a>
            </li>
            <li class="">
              <a href="javascript:void(0)">
                <i class="icon icon-wangfan"></i>往返</a>
            </li>
            <li class="">
              <a href="javascript:void(0)">
                <i class="icon icon-huancheng"></i>中转换乘</a>
            </li>
            <li class="active">
              <a href="javascript:void(0)">
                <i class="icon icon-chepiao"></i>退改签</a>
            </li>
          </ul>
        </div>
        <div class="search-tab-bd">
          <!-- 单程 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item-group">
                <div class="form-item">
                  <label for="fromStationText" class="form-label">出发地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="fromStation" type="hidden" value="" name="from_station">
                      <input type="text" class="input " value="" id="fromStationText" aria-label="请输入或选择出发地，按键盘上下键进行选择，按回车键选中" autocomplete="off">
                      <i class="icon icon-place" data-click="fromStationText"></i>
                    </div>
                  </div>
                </div>
                <div class="form-item">
                  <label for="toStationText" class="form-label">到达地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="toStation" type="hidden" value="" name="to_station">
                      <input type="text" class="input" value="" id="toStationText" aria-label="请输入或选择到达地，按键盘上下键进行选择，按回车键选中" autocomplete="off">
                      <i class="icon icon-place" data-click="toStationText"></i>
                    </div>
                  </div>
                </div>
                <div class="city-change">
                  <i class="icon icon-qiehuan" title="切换" id="danChange"></i>
                </div>
              </div>
              <div class="form-item">
                <label for="train_date" class="form-label">出发日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="2018-07-21" id="train_date" aria-label="请输入日期，例如2021杠01杠01" autocomplete="off">
                    <i class="icon icon-date" data-click="train_date"></i>
                  </div>
                </div>
              </div>
              <div class="form-item form-item-check">
                <div class="form-bd">
                  <ul class="check-list check-list-right">
                    <li id="isStudentDan">学生
                      <i></i>
                    </li>
                    <li id="isHighDan">高铁/动车
                      <i></i>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="form-item form-item-btn">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="search_one">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
            <style>
              .history-list-wrap {
                white-space: nowrap;
                margin: 0 auto;
                overflow: hidden;
                white-space: nowrap;
              }

              .history-list {
                display: inline;
              }

              .history-list li {
                display: inline;
              }
            </style>
            <div id="search-history" style="display: none;">
              <div class="search-history-bd">
                <i id="iconLeftHos" class="history-prev icon icon-caret-left"></i>
                <i id="iconRightHos" class="history-next icon icon-caret-right"></i>
                <div class="history-list-wrap">

                  <ul class="history-list" id="history_ul" style="position: relative;"></ul>


                </div>
              </div>
              <div class="search-history-btn">
                <a href="javascript:void(0)">删除历史</a>
              </div>
            </div>
          </div>
          <!-- 往返 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item-group">
                <div class="form-item">
                  <label for="fromStationFanText" class="form-label">出发地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="fromStationFan" type="hidden" value="" name="from_station_fan">
                      <input type="text" class="input" value="" id="fromStationFanText" autocomplete="off" aria-label="请输入或选择出发地，按键盘上下键进行选择，按回车键选中">
                      <i class="icon icon-place" data-click="fromStationFanText"></i>
                    </div>
                  </div>
                </div>
                <div class="form-item">
                  <label for="toStationFanText" class="form-label">到达地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="toStationFan" type="hidden" value="" name="to_station_fan">
                      <input type="text" class="input" value="" id="toStationFanText" autocomplete="off" aria-label="请输入或选择到达地，按键盘上下键进行选择，按回车键选中">
                      <i class="icon icon-place" data-click="toStationFanText"></i>
                    </div>
                  </div>
                </div>
                <div class="city-change">
                  <i class="icon icon-qiehuan" title="切换" id="returnChange"></i>
                </div>
              </div>
              <div class="form-item">
                <label for="go_date" class="form-label">出发日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="" id="go_date" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="go_date"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="from_date" class="form-label">返程日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="" id="from_date" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="from_date"></i>
                  </div>
                </div>
              </div>
              <div class="form-item form-item-check">
                <div class="form-bd">
                  <ul class="check-list check-list-right">
                    <li id="isStudent">学生
                      <i></i>
                    </li>
                    <li id="isHigh">高铁/动车
                      <i></i>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="form-item form-item-btn">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="search_two">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- 接续换乘 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item-group">
                <div class="form-item">
                  <label for="fromStationSerialText" class="form-label">
                    <b class="required">*</b>出发地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="fromStationSerial" type="hidden" value="" name="from_station_serial">
                      <input type="text" class="input" value="" id="fromStationSerialText" autocomplete="off" aria-label="请输入或选择出发地，按键盘上下键进行选择，按回车键选中">
                      <i class="icon icon-place" data-click="fromStationSerialText"></i>
                    </div>
                  </div>
                </div>
                <div class="form-item">
                  <label for="toStationSerialText" class="form-label">
                    <b class="required">*</b>到达地</label>
                  <div class="form-bd">
                    <div class="input-box input-city">
                      <input id="toStationSerial" type="hidden" value="" name="to_station_serial">
                      <input type="text" class="input" value="" id="toStationSerialText" autocomplete="off" aria-label="请输入或选择到达地，按键盘上下键进行选择，按回车键选中">
                      <i class="icon icon-place" data-click="toStationSerialText"></i>
                    </div>
                  </div>
                </div>
                <div class="city-change">
                  <i class="icon icon-qiehuan" title="切换" id="serialChange"></i>
                </div>
              </div>
              <div class="form-item">
                <label for="serial_date" class="form-label">
                  <b class="required">*</b>乘车日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="2018-07-21" id="serial_date" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="serial_date"></i>
                  </div>
                </div>
              </div>
              <div class="form-item form-item-check">
                <div class="form-bd">
                  <ul class="check-list check-list-right">
                    <li id="isStudentLian">学生
                      <i></i>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="form-item form-item-btn">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="search_three">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- 退改签 -->
          <div class="search-tab-item" style="display: block;">
            <div class="search-form">
              <div class="form-item">
                <span class="form-label">查询类型</span>
                <div class="form-bd">
                  <ul class="radio-list radio-list-ding">
                    <li class="active" id="dingqiaoID">
                      <i></i>订票日期
                    </li>
                    <li>
                      <i></i>乘车日期
                    </li>
                  </ul>
                </div>
              </div>
              <div class="form-item">
                <label for="refund_start" class="form-label">
                  <b class="required">*</b>开始日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="" id="refund_start" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="refund_start"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="" class="form-label">
                  <b class="required">*</b>结束日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="" id="refund_end" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="refund_end"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="refund_code" class="form-label">
                  <b class="required"></b>关键字</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input type="text" class="input search-input" placeholder="订单号/车次/乘客姓名" id="refund_code">
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg">
                <a href="javascript:;" class="btn btn-primary form-block" id="refund_button">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- 常用查询 -->
    <div class="search-main-item" style="display: none;">
      <div class="search-main-tab">
        <div class="search-tab-hd">
          <ul>
            <li class="active">
              <a href="javascript:void(0)">
                <i class="icon icon-shijian"></i>正晚点</a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <i class="icon icon-jianpiaokou"></i>检票口</a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <i class="icon icon-qishou"></i>起售时间</a>
            </li>
            <li>
              <a href="javascript:void(0)">
                <i class="icon icon-tianqi"></i>天气查询</a>
            </li>
          </ul>
        </div>
        <div class="search-tab-bd">
          <!-- 正晚点 -->
          <div class="search-tab-item" style="display: block;">
            <div class="search-form">
              <div class="form-item">
                <span class="form-label">查询类型</span>
                <div class="form-bd">
                  <ul class="radio-list radio-list-station">
                    <li zwd="0" name="zwd_type" class="active" id="destination_station">
                      <i></i>到达站
                    </li>
                    <li zwd="1" name="zwd_type">
                      <i></i>出发站
                    </li>
                  </ul>
                </div>
              </div>
              <div class="form-item">
                <label for="stationValue" class="form-label">车站</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input id="stationValue" type="hidden" value="" name="stationValue">
                    <input type="text" class="input" value="" placeholder="简拼／全拼／汉字" id="stationValueText" autocomplete="off" aria-label="请输入或选择车站，按键盘上下键进行选择，按回车键选中">
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="numberValue" class="form-label">车次</label>
                <div class="form-bd">
                  <div class="input-box late_poit">
                    <input type="text" class="input" placeholder="请输入车次" id="numberValue" value="" autocomplete="off">
                    <ul class="active" name="makeupCoSe" id="train_hide" style="width: 270px; display: none;">
                    </ul>
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="bie_button">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- 检票口 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item">
                <label for="check_in" class="form-label">
                  <b class="required">*</b>乘车日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="2018-07-21" id="check_in" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="check_in"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="train_num" class="form-label">
                  <b class="required">*</b>车次</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input type="text" class="input search-input" data-provide="typeahead" placeholder="请输入车次" data-items="4" autocomplete="off" id="train_num" style="text-transform:uppercase;">
                    <input class="input" type="hidden" id="topicId">
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="ticketEntranceSel" class="form-label">
                  <b class="required">*</b>乘车站</label>

                <div class="form-bd">
                  <div class="input-box">
                    <div class="model-select-box">
                      <div class="model-select-text " data-value="" id="ticketEntranceSel" tabindex="0">请选择车站
                      </div>
                      <div class="station-loading" id="station_loading" style="display: none">
                        <img src="images/loading.gif" alt="">
                      </div>
                      <ul class="model-select-option train_hide" id="check_model_select" style="display: none;">
                      </ul>
                      <input type="hidden" class="selected-input" data-value="" name="cityID" value="" id="selected_input">
                    </div>
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg">
                <a href="javascript:;" class="btn btn-primary form-block" id="check_button">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- 起售时间 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item">
                <label for="sale_time" class="form-label">
                  <b class="required">*</b>起售日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="" id="sale_time" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="sale_time"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="start_sell" class="form-label">
                  <b class="required">*</b>起售车站</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input id="start_sell" type="hidden" value="" name="start_sell">
                    <input type="text" class="input" value="" id="start_sellText" autocomplete="off" aria-label="请输入或选择起售车站，按键盘上下键进行选择，按回车键选中">
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="sell_button">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- 天气查询 -->
          <div class="search-tab-item" style="display: none;">
            <div class="search-form">
              <div class="form-item">
                <label for="destinationText" class="form-label">
                  <b class="required">*</b>目的地</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input id="destination" type="hidden" value="" name="destination">
                    <input type="text" class="input" value="" id="destinationText" placeholder="简拼／全拼／汉字" autocomplete="off" aria-label="请输入或选择查询天气的目的地，按键盘上下键进行选择，按回车键选中">
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="weather_button">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- 订餐 -->
    <div class="search-main-item" style="display: none;">
      <div class="search-main-tab">
        <div class="search-tab-hd">
          <ul>
            <li class="active" style="width: 50%">
              <a href="javascript:;">
                <i class="icon icon-shijian"></i>预订</a>
            </li>
            <li style="width: 50%">
              <a name="g_href" data-type="10" data-href="queryMyOrder.html" data-redirect="Y" href="javascript:;"><i class="icon icon-jianpiaokou"></i>餐饮订单</a>
            </li>
          </ul>
        </div>
        <div class="search-tab-bd">
          <!-- 订餐 -->
          <div class="search-tab-item dinner-yuding" style="display: block;">
            <div class="search-form">
              <div class="form-item">
                <label for="dinner_date" class="form-label">出发日期</label>
                <div class="form-bd">
                  <div class="input-box input-data">
                    <input type="text" class="input" value="2018-07-21" id="dinner_date" aria-label="请输入日期，例如2021杠01杠01">
                    <i class="icon icon-date" data-click="dinner_date"></i>
                  </div>
                </div>
              </div>
              <div class="form-item">
                <label for="dinner_sub_mun" class="form-label">出发车次</label>
                <div class="form-bd">
                  <div class="input-box">
                    <input type="text" class="input search-input" data-provide="typeahead" placeholder="仅支持G、D字头的动车组列车" data-items="4" autocomplete="off" id="dinner_sub_mun" style="text-transform:uppercase;">
                    <input class="input" type="hidden" id="dinner_sub_code">
                  </div>
                </div>
              </div>
              <div class="form-item form-item-btn mt-mlg dinner-search">
                <a href="javascript:void(0)" class="btn btn-primary form-block" id="search_four">查&nbsp;&nbsp;&nbsp;&nbsp;询</a>
              </div>
            </div>
          </div>
          <!-- <div class="search-tab-item"></div> -->
        </div>
      </div>
    </div>
  </div>
  <el-tabs tab-position="left" style="height: auto">
    <el-tab-pane label="车票">
      <el-tabs
          v-model="activeName1"
          @tab-click="handleClick"
          style="height: 50px;width: auto"
      >
        <el-tab-pane label="单程" name="first">
        </el-tab-pane>
        <el-tab-pane label="往返" name="second">往返</el-tab-pane>
        <el-tab-pane label="中转换乘" name="third">中转换乘</el-tab-pane>
        <el-tab-pane label="退改签" name="fourth">退改签</el-tab-pane>
      </el-tabs>
    </el-tab-pane>
    <el-tab-pane label="常用查询">
      <el-tabs v-model="activeName2" @tab-click="handleClick">
        <el-tab-pane label="正晚点" name="first">单程</el-tab-pane>
        <el-tab-pane label="检票口" name="second">往返</el-tab-pane>
        <el-tab-pane label="起售时间" name="third">中转换乘</el-tab-pane>
        <el-tab-pane label="天气查询" name="fourth">退改签</el-tab-pane>
      </el-tabs>
    </el-tab-pane>
    <el-tab-pane label="订餐">
      <el-tabs v-model="activeName3" @tab-click="handleClick">
        <el-tab-pane label="预订" name="first">单程</el-tab-pane>
        <el-tab-pane label="餐饮" name="second">往返</el-tab-pane>
      </el-tabs>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
export default {
  data() {
    return {
      form: {
        name: '',
        region: '',
        date1: '',
        date2: '',
        delivery: false,
        type: [],
        resource: '',
        desc: ''
      }
      // activeName1:"first",
      // activeName2:"first",
      // activeName3:"first",
    };
  },
  methods: {
    onSubmit() {
      console.log('submit!');
    }
  }
};
</script>
<style>
.el-tabs {
  width: 500px;
}
</style>