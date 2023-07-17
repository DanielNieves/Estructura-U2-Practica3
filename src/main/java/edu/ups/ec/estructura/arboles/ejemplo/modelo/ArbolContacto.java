/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.arboles.ejemplo.modelo;

import edu.ups.ec.estructura.arboles.ejemplo.controlador.Contacto;
import edu.ups.ec.estructura.arboles.ejemplo.controlador.Node;

/**
 *
 * @author Usuario
 */
public class ArbolContacto {

    private Node raiz;

    public ArbolContacto(Node raiz) {
        this.raiz = raiz;
    }

    public ArbolContacto() {
        
    }

    public void insert(Contacto newContacto) {
        if (raiz == null) {
            raiz = new Node(newContacto);

        } else {
            insertRecursivo(raiz, newContacto);

        }
    }

    private void insertRecursivo(Node node, Contacto newContacto) {
        if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(newContacto));
            } else {
                insertRecursivo(node.getLeft(), newContacto);
            }
        } else if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) > 0) {
            if (node.getRight() == null) {
                node.setRight(new Node(newContacto));
            } else {
                insertRecursivo(node.getRight(), newContacto);
            }
        } else {
            //Si el nombre del contacto nuevo es igual a uno existente

        }
    }

    public boolean estaEquilibrado() {
        return verificarBalanse(raiz);
    }

    private boolean verificarBalanse(Node node) {
        if (node == null) {
            return true; // arbol vacio , se considera equlibrado

        }

        int alturaIzuierda = obtenerAltura(node.getLeft());
        int alturaDerecha = obtenerAltura(node.getRight());

        int diferencia = Math.abs(alturaIzuierda - alturaDerecha);

        if (diferencia > 1) {
            return false;

        }
        
        return verificarBalanse(node.getLeft()) && verificarBalanse(node.getRight());

    }

    private int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }

        int alturaIzquierda = obtenerAltura(node.getLeft());
        int alturaDerecha = obtenerAltura(node.getRight());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;

    }

}
