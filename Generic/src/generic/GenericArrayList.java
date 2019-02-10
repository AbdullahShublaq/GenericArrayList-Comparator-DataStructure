/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.Arrays;

/**
 *
 * @author jit
 */
public class GenericArrayList<E> {

    private int size = 0;
    private Object[] elements;

    public GenericArrayList() {
        elements = new Object[1];
    }
    
    public void add(E object) {
        if (size == 0) {
            elements[0] = object;
            size++;
        } else {
            size++;
            elements = Arrays.copyOf(elements,/*elements.length*/ size);
            elements[size - 1] = object;
        }
    }
    
    public E get(int index) {
        return (E) elements[index];
    }
    
}

