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
class Excersise6_6_6 {
    int a, b; 
 
  Excersise6_6_6(int i, int j) { 
    a = i; 
    b = j; 
  }
  /* Pass an object. Now, ob.a and ob.b in object 
     used in the call will be changed. */ 
  void change(Excersise6_6_6 ob) { 
    ob.a = ob.a + ob.b; 
    ob.b = -ob.b; 
  }
}
