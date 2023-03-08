package Punto1.Principal;

import Punto1.Parrafo.Texto;


public class Principal {
    public static void main(String[] args) {
        String text = "Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de \n" +
"caballos, el número de puertas y la matricula. Crear el constructor del coche, métodos getter y setter para sus atributos,\n" +
"un método toString que retorne una cadena de caracteres con los valores de sus atributos. Crear una clase \n" +
"PruebaCoche que instancie varios coches, cambie sus estados (valores de sus atributos) y muestre sus datos por \n" +
"pantalla.";
        
        String textEj = "Este es un ejemplo de texto.";
        
        Texto parrafo = new Texto(text);
        Texto ejemplo = new Texto(textEj);
        
        // Prueba de métodos de la clase Parrafo
        System.out.println("Texto del párrafo: " + parrafo.getTexto());
        System.out.println("Número de vocales: " + parrafo.nVocales());
        System.out.println("Número de consonantes: " + parrafo.nConsonantes());
        System.out.println("Número de símbolos: " + parrafo.nSimbolos());
        System.out.println("Número de repeticiones de 'texto': " + parrafo.buscar("texto"));
        System.out.println("Vocal moda: " + parrafo.vocalModa());
        System.out.println("Número de palabras: " + parrafo.nPalabras());
        parrafo.palabraMayor();
        System.out.println("Comparación de texto: " + parrafo.compararTexto(ejemplo));
    }
}
