'use strict';

// import React from 'react';
// import {
//   AppRegistry,
//   StyleSheet,
//   Text,
//   View
// } from 'react-native';

/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 */
import React,{Component} from 'react';
import  {
  AppRegistry,
  // Component,
  StyleSheet,
  Text,
  View,
  Navigator
} from 'react-native';

import IndexPage from './components/index.js';
/**
 * API测试代码
 */
//import ApiTest from './components/test.js';
/*=======  end  =======*/
class mockTMall extends React.Component {
  render() {
    return (
      <Navigator
          tintColor='#cccccc'
          barTintColor='#cccccc'
          initialRoute={{ name: 'indexPage', component: IndexPage }}
          /**
           * 切换界面方式,只能向前切换，不能向后切换
           */

          configureScene={(route) => {
            let  gestureType = Navigator.SceneConfigs.HorizontalSwipeJump;
            gestureType.gestures.jumpForward=null;
             return gestureType
          }}
          renderScene={(route, navigator) => {
            let Component = route.component;
            return <Component {...route.params} {...route} navigator={navigator} />
          }}>
      </Navigator>
    );
  }
}

class MyAwesomeApp extends React.Component {
  render() {
    return (
      <View >
        <Text style={styles.hello}>Hello, World,马蛋</Text>
        <Text style={styles.hello}>恭喜你已经完成React Native移植Android项目</Text>
        <Text style={styles.hello}>博客地址:github.com/slashhuang</Text>
      </View>
    )
  }
}
class MyAwesomeApp1 extends React.Component {
  render() {
    return (
      <View >
        <Text style={styles.hello}>这是第二个页面</Text>
        <Text style={styles.hello}>博客地址:github.com/slashhuang</Text>
      </View>
    )
  }
}
var styles = StyleSheet.create({
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 100,
  },
});

AppRegistry.registerComponent('TestRn', () => mockTMall);
AppRegistry.registerComponent('TestRn1', () => MyAwesomeApp1);