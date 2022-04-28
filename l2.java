    
class Parent{    
  void msg() throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
public class l2 extends Parent {    
  void msg()throws Exception {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent p = new l2();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}    