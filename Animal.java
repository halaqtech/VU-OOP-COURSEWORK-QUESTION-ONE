/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vuprogram.animal;

public class Animal {

    //fields
    String name;
    int age;
       public void makeSound(){
        
    }
    public void eat(){
        
    }
      public void makeSound(int times){
        
    }
    public void eat(String foodType){
       
    }
    
}
class lion extends Animal{
 
    @Override
    public void makeSound(){
        System.out.println("Roar");
    }  
       @Override
    public void eat(){
        System.out.println("eating meat");
    }
}
class elephant extends Animal{
    
   
    @Override
    public void makeSound(){
        System.out.println("Trumpet");
    }  
       @Override
    public void eat(){
        System.out.println("eating grass");
    }
}
class monkey extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("chatter");
    }  
       @Override
    public void eat(){
        System.out.println("eating bananas");
    }
}

