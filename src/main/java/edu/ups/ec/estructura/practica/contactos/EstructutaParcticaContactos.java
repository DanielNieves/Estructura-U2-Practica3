/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.ups.ec.estructura.practica.contactos;

import edu.ups.ec.estructura.arboles.ejemplo.controlador.Contacto;
import edu.ups.ec.estructura.arboles.ejemplo.modelo.ArbolContacto;

/**
 *
 * @author Usuario
 */
public class EstructutaParcticaContactos {

    public static void main(String[] args) {
        ArbolContacto arbol = new ArbolContacto();

        Contacto contacto1 = new Contacto("juan ", "1234");
        Contacto contacto2 = new Contacto("Maria", "1234");
        Contacto contacto3 = new Contacto("Pedro", "1234");
        Contacto contacto4 = new Contacto("pablo", "1234");

        arbol.insert(contacto1);
        arbol.insert(contacto2);
        arbol.insert(contacto3);
        arbol.insert(contacto4);
        arbol.insert(new Contacto("pepe","12342"));
        arbol.insert(new Contacto("david ","12342"));

    }
}
