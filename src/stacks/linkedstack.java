/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import singlylinkedlistexample0580.SList;

/**
 *
 * @author Henz Montera
 * @param <E>
 */             //|-----------------------|     the linkedstack<E> class is a subclass of stack<E>
public class linkedstack<E> implements stack<E> { // since abtract si stack<E>, dapat "implements" ang gamit instead of extend 

    private SList<E> list  = new SList<>(); // link nmo ang slist nga code nmo 
                                            // dria libraries/right click/add project i search ang slist nmo nga proj
    
    @Override
    public int size() {
        return list.size();                 // for identifying the size of the stack
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();              // telling if the stack is empty or not
    }

    @Override
    public E top() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException("Ambobo mo wala nang Laman ang Stack!");   // use for throwing custom error message
        }
        return list.first();       // for output the current first stack
    }

    @Override
    public void push(E element) {
       list.addFirst(element);  // used for storing stacks in the front.
    }

    @Override
    public E pop() throws EmptyStackException {
        return list.removeFirst();   // used for removing stack in the front
    }

}
