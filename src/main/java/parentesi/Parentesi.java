package parentesi;

/**
 *
 * @author andry
 */

import java.util.*;
public class Parentesi {
    public static ArrayList<Character> pila = new ArrayList<Character>();
    
    
    public static boolean parentesiBilanciate(String testo){
        for(char c : testo.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                push(c);
            else if(c == ')' || c == ']' || c == '}'){
                if(isEmpty())
                    return false;
                char saas = pop();
                if((c == ')' && saas != '(')||(c == ']' && saas != '[')||(c == '}' && saas != '{'))
                    return false;
            }
                
        }
        
        return isEmpty();
    }
    
    public static Character pop(){
        return pila.removeLast();
    }
    
    public static void push(Character c){
        pila.add(c);
    }
    
    public static boolean isEmpty(){
        return pila.isEmpty();
    }
}
