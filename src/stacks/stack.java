
package stacks;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public interface stack<E> {
 
    int size();     // initialization of the size of the stack
    
    boolean isEmpty(); // initialization of telling the stack is Empty or not.
    
    E top() throws EmptyStackException; // initialization for creating a custom error message
   
    void push(E element);   // initialization for input or storing data in stacks
    
    E pop() throws EmptyStackException; // initialization for removing a data or input in the stacks
    
}
