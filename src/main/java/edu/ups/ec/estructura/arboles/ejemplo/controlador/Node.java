/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.arboles.ejemplo.controlador;

/**
 *
 * @author Usuario
 */
public class Node {
    
    private Contacto contacto; 
    private Node left ; 
    private Node right; 

    public Node(Contacto contacto) {
        this.contacto = contacto;
        this.left = left;
        this.right = right;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "contacto=" + contacto + ", left=" + left + ", right=" + right + '}';
    }
    
    
}
