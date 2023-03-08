
package Punto1.Parrafo;

public class Texto {
   private String Texto;

    public Texto() {
    }

    public Texto(String Texto) {
        this.Texto = Texto;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return "Parrafo{" + "Texto=" + Texto + '}';
    }
   
     // Retorna el número de vocales en el texto
    public int nVocales() {
        int count = 0;
        for (char c : Texto.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Retorna el número de consonantes en el texto
    public int nConsonantes() {
        int count = 0;
        for (char c : Texto.toCharArray()) {
            if (Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    // Retorna el número de símbolos en el texto
    public int nSimbolos() {
        int count = 0;
        for (char c : Texto.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                count++;
            }
        }
        return count;
    }

    // Retorna el número de repeticiones de la palabra recibida como parámetro
    public int buscar(String palabra) {
        int Contador = 0;
        String[] palabras = Texto.split(" ");
        for (String p : palabras) {
            if (p.equals(palabra)) {
                Contador++;
            }
        }
        return Contador;
    }

    // Retorna la vocal que más repeticiones presenta en el texto
    public char vocalModa() {
        int[] vocales = new int[5];
        for (char c : Texto.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                switch (c) {
                    case 'A':
                    case 'a':
                        vocales[0]++;
                        break;
                    case 'E':
                    case 'e':
                        vocales[1]++;
                        break;
                    case 'I':
                    case 'i':
                        vocales[2]++;
                        break;
                    case 'O':
                    case 'o':
                        vocales[3]++;
                        break;
                    case 'U':
                    case 'u':
                        vocales[4]++;
                        break;
                }
            }
        }
        int max = vocales[0];
        int aux = 0;
        for (int i = 1; i < vocales.length; i++) {
            if (vocales[i] > max) {
                max = vocales[i];
                aux = i;
            }
        }
        char[] moda = {'A', 'E', 'I', 'O', 'U'};
        return moda[aux];
    }

    // Retorna el número de palabras en el párrafo
    public int nPalabras() {
        String[] palabras = Texto.split(" ");
        return palabras.length;
    }
    
     public void palabraMayor() {
        String[] palabras = Texto.split("\\s+");
        String palabraLarga = "";
        int nLetras = 0;
        for (String word : palabras) {
            if (word.length() > nLetras) {
                palabraLarga = word;
                nLetras = word.length();
            }
        }
        System.out.println("La palabra más larga es \"" + palabraLarga + "\" con " + nLetras + " caracteres.");
    }

    public boolean compararTexto(Texto txt) {
        return Texto.equals(txt);
    }
}

