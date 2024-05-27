
package vuprogram.animal;

public class zoo {
     public static void main(String[] args) {
        Animal lion = new lion();
        Animal elephant = new elephant();
        Animal monkey = new monkey();
        
       System.out.println("lion features");
        lion.makeSound();
        lion.eat();
        System.out.println("........................................................................");
        System.out.println("elephant features");
        elephant.makeSound();
        elephant.eat();
        System.out.println("........................................................................");
     
        System.out.println("monkey features");
        
        monkey.makeSound();
        monkey.eat();
      
    }
    
}
