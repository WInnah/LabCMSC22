
package stackqueue;

/**
 *
 * @author Danielle Hernandez, Mary Amora, Winnah Acal
 */

import java.util.*;

public class StringStack {
    
    private String[] elements;
    private int count = 0;
    public static final int DEFAULT_SIZE = 10;
    
    
    public StringStack(int size){
        elements = new String[size];
    }
   
    public void push(String item){
      if(count >= elements.length){
      
      elements = Arrays.copyOf(elements, elements.length * 2);

      }  
      else {  
        
        for (int i = count; i > 0; i--){
            elements[i] = elements[i - 1];
        }
        elements[0] = item;
        count++;
      }
    }   
    
    public String pop(){
        if (elements[0] == "\0"){
            throw new ArrayIndexOutOfBoundsException("NULL");
        }
        else{
            String popped;
            popped = elements[0];
            for (int i = 0; i < count; i++){
                elements[i] = elements[i+1];
            }
            count--;
            return popped;
        }
    }
    
    public int size(){return count;}
    
    public StringStack(){
        elements = new String[DEFAULT_SIZE];
    }
    

    
    public String toString(){
        String list = "";
        if (count == 0){
            return "EMPTY";
        }
        else{
            for (int i =count -1; i > 0; i--){
                list += elements[i] + ", ";
            }
            return list + elements[0];
        }
    }
    
   public static void main(String[] args) {
      StringStack stack = new StringStack(20);
      stack.push("paper");
      stack.push("plastic");
      stack.push("tissue");
      
      System.out.println(stack);
      System.out.println(stack.size());
      
      String item1 = stack.pop();
      String item2 = stack.pop();
      String item3 = stack.pop();
      
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      
      System.out.println(stack);
      System.out.println(stack.size());
      
    } 
    
}
