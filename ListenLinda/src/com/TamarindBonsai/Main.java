package com.TamarindBonsai;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
TODO:

    Make sure the component's isFocusable method returns true.
    This state allows the component to receive the focus.
    For example, you can enable keyboard focus for a JLabel component by calling the setFocusable(true) method on the label.

    Make sure the component requests the focus when appropriate.
    For custom components, implement a mouse listener that calls the requestFocusInWindow method when the component is clicked.


    Explaination for "this": when adding action listener it refers to the class implementing listener
    this makes it easy to make the perfomaction function stand alone-ish, really it passes the instance
    of the listener but runs the function instead of making another listener with only one function.
 */
public class Main implements ActionListener {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
