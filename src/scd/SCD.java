package scd;
import java.util.Scanner;
public interface SCD {
    public void info();
    public void show();
    
}
class student implements SCD{
    
    int roll;
    int fall;
    String name;
    String dump;
    String Class;
    
  Scanner input=new Scanner(System.in);
    public void info(){
        System.out.println("Enter your fall : ");
        fall=input.nextInt();
        System.out.println("Enter your roll number : ");
        roll=input.nextInt();
       // System.out.println("Enter your name : ");
        dump=input.nextLine();
        System.out.println("Enter your name : ");
        name=input.nextLine();
        System.out.println("Enter your class  : ");
        
        Class =input.nextLine();
    }
    public void show(){
         System.out.println(" Your fall is : "+fall);
       
        System.out.println(" Your roll number : "+roll);
      
        System.out.println(" Your name : "+name);
       
        System.out.println(" Your class  : "+Class);
        
    }
    
    
    
}
class faculty implements SCD{
      int roll;
    int fall;
    String name;
    String dump;
    String Class;
    
  Scanner input=new Scanner(System.in);
     public void info(){
        System.out.println("Enter your Id : ");
        fall=input.nextInt();
        
       // System.out.println("Enter your name : ");
        dump=input.nextLine();
        System.out.println("Enter your name : ");
        name=input.nextLine();
        System.out.println("Enter your dept  : ");
        
        Class =input.nextLine();
    }
    public void show(){
         System.out.println(" Your id is : "+fall);
       
      
      
        System.out.println(" Your name : "+name);
       
        System.out.println(" Your dept  : "+Class);
        
    }
    
}
 class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public SCD detail(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("student")){
         return new student();
         
      } else if(shapeType.equalsIgnoreCase("faculty")){
         return new faculty();
         
      } 
      
      return null;
   }
}


class test{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      ShapeFactory shapeFactory = new ShapeFactory();
        SCD stu = shapeFactory.detail("student");
       SCD fac = shapeFactory.detail("faculty");
      int n;
      System.out.println("Press\n1 for Student\n2 for Faculty");
      n=input.nextInt();
      
if (n==1){

     stu.info();
     System.out.println("===========================");
     
      stu.show();

    
}
else if(n==2){
       fac.info();
         System.out.println("===========================");
     
       fac.show();
               
    
}
else{
      System.out.println("==========Invalid input=================");
     
}
     

     
   

   

   
   }
}
     

    
    

