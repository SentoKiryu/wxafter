Page({
  getData(){
    let that = this
    wx.request({
      url: 'http://localhost:8080/abc',
      success(res){
        console.log("cg",res);
        that.setData({
          dataList:res.data
        }) 
    
    },
      fail(res){
        console.log("sb",res)
      }
    })
  }


})