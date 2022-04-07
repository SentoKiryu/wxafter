var app = getApp()
let name,num,type,pass
Page({

  getname(event){
    name = event.detail.value
  },
  getnum(event){
    num = event.detail.value
  },
  gettype(event){
    type = event.detail.value
  },
  getpass(event){
    pass = event.detail.value
  },
  add(){
    let that = this
    wx.request({
      url: 'http://localhost:8088/team',
      method:"get",
      header:{
        "content-type":"application/x-www-form-urlencoded"
      },
      data:{
        tname:name,
        tnum:num,
        tsel:type,
        tpass:pass,
        dataList:[

        ]
      },
      success(res){
        console.log("发起成功",res)
        if(res.statusCode == 200){
          wx.showToast({
            title: '发起成功',
          })
        }else{
          wx.showToast({
            icon:"none",
            title: '发起失败',
          })
        }
      },fail(res){
        console.log("发起失败",res)
      }
    })
  },
  
  onLoad:function(){
    wx.request({
      url: 'http://localhost:8088/findall2',
      success:res=>{
        this.setData({
          dataList:res.data.data
        })
      }
    })


  },

  //获取用户姓名
  data: {
    navbar: ['组队市场', '发起组队', '加入队伍'],
    currentTab: 0
  },
  navbarTap: function(e){
    this.setData({
      currentTab: e.currentTarget.dataset.idx
    })
  }
})

