module.exports = {
  devServer: {
    proxy: {
      '/api': {
        // target: 'http://39.105.216.99:8080', //接口域名
        target: 'http://localhost:8443', //接口域名
        changeOrigin: true,             //是否跨域
        ws: true,                       //是否代理 websockets
        secure: true,                   //是否https接口
        pathRewrite: {                  //路径重置
          '^/api': ''
        }
      }
    }
  },
  configureWebpack: {
    // provide the app's title in webpack's name field, so that
    // it can be accessed in index.html to inject the correct title.
    performance: {
      //入口起点的最大体积
      maxEntrypointSize: 50000000,
      //生成文件的最大体积
      maxAssetSize: 30000000,
    }
  },
  pages: {
    // 先配置主页
    index: {
      entry: './src/main.js',
      template: './public/index.html',
    },
    // 再配置各个子页面：
    login: {
      entry: './src/pages/login/login.js',
      template: './public/login.html',
    }
  }
};

