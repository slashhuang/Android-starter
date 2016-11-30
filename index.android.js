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
        <Text style={styles.hello}>Hello, World</Text>
        <Text style={styles.hello}>恭喜你已经完成React Native移植Android项目</Text>
        <Text style={styles.hello}>博客地址:www.lcode.org</Text>
      </View>
    )
  }
}
var styles = StyleSheet.create({
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});
 
AppRegistry.registerComponent('TestRn', () => MyAwesomeApp);