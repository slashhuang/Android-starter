'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

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
  debugger;
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

AppRegistry.registerComponent('TestRn', () => MyAwesomeApp);
AppRegistry.registerComponent('TestRn1', () => MyAwesomeApp1);