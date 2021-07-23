/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author kyle_
 */
class Excersise6_8_8_2 {
   String msgs[] = { 
    "Output Error", 
    "Input Error", 
    "Disk Full", 
    "Index Out-Of-Bounds" 
  }; 
  int howbad[] = { 3, 3, 2, 4 }; 
 
  Excersise6_8_8 getErrorInfo(int i) { 
    if(i >=0 & i < msgs.length) 
      return new Excersise6_8_8(msgs[i], howbad[i]); 
    else 
      return new Excersise6_8_8("Invalid Error Code", 0); 
  } 
}
