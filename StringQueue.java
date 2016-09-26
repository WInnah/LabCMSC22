
package stackqueue;

import java.util.Arrays;

/**
 *
 * @author Danielle Hernandez, Mary Amora, Winnah Acal
 */

public class StringQueue {
    
    private String[] elements;
    private int count = 0;
    public static final int DEFAULT_SIZE = 10; 
    
    
    public StringQueue(int x){
     elements = new String[x];   
    }
    
    public StringQueue(){
     elements = new String[DEFAULT_SIZE];   
    }
    
    public void singit(int index, String friend){
        if(index == 0 || index > count){
        throw new IllegalArgumentException("Invalid");
        
        } else {
        for(int i = count++; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = friend;
    
        }
    }    
    
    public int size(){return count;}

    public void queue(String item){
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
    
    public String dequeue(){
     return elements[--count];   
    }
    
    public String peek(){
    return elements[count-1];
    }
    
    public String toString(){
        String list = "";
        if (count == 0){
            return "EMPTY";
        }
        else{
            for (int i = count-1; i > 0; i--){
                list += elements[i] + ", ";
            }
            return list + elements[0];
        }
    }
    
    
    public static void main(String[] args) {
       StringQueue queue1 = new StringQueue(10);
       queue1.queue("Mary");
       queue1.queue("Winnah");
       queue1.queue("Danielle");
       
       System.out.println(queue1);
       System.out.println("SIZE:"+ queue1.size());
       queue1.dequeue();
       System.out.println("SIZE:"+queue1.size());
       System.out.println(queue1);
       //queue1.singit(0,"EmEm");
       queue1.singit(1,"EmEm");
       System.out.println(queue1); 
    }
    
}
