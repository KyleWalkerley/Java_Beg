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
class Excersise6_4_4 {
    int a, b, c;  
  int volume; 
  
  Excersise6_4_4(int i, int j, int k) {  
    a = i;  
    b = j;  
    c = k; 
    volume = a * b * c; 
  }  
  
  // Return true if ob defines same block. 
  boolean sameBlock(Excersise6_4_4 ob) {  
    if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;  
    else return false;  
  }  
 
  // Return true if ob has same volume. 
  boolean sameVolume(Excersise6_4_4 ob) { 
    if(ob.volume == volume) return true; 
    else return false; 
  }
}
