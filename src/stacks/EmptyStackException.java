/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Henz Montera
 */
public class EmptyStackException extends NullPointerException {
    public EmptyStackException(String msg){                     // syntax of creating a custom error message
        super(msg);
    }
}
