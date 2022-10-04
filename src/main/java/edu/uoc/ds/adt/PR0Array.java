package edu.uoc.ds.adt;

import java.util.Arrays;

public class PR0Array {

    //S'estableix la mida del array a 50.
    public final int CAPACITY = 50;

    //Es crea com a atribut un array d'enters de mida 50.
    private int[] array = new int[CAPACITY];


    //Constructor on incialitzam l'array amb els 50 primers nombres enters.
    PR0Array(){
        int numero = 0;
        int i =0;
        while(i<CAPACITY) {
            if (numero % 2 == 0) {
                array[i] = numero;
                i++;
            }
            numero++;
        }
    }

    //Retorna l'índex que conté el valor rebut per paràmetres o -1 si el valor no es troba dins l'array.
    public int getIndexOf(int valor){
        for(int i=0;i<CAPACITY;i++){
            if(array[i]==valor){
                return i;
            }

        }
        return -1;
    }

    /**
   Métode que fa una cerca binària. Utilitza el valors alt(49) i baix(0) per calcular el centre (sumantlos
    i dividint per 2). Llavors, s'utilitza el centre com a índex. Segons si el valor passat per paràmetres
     és major o menor, es canvien els valors alts i baix per modificar el centre. El bucle avança fins que els
     valors alt i baix són iguals, on es retorna -1 perquè no s'ha trobat el valor, o fins que el troba i retorna
     l'índex.
     **/
    public int binarySearch(int valor){
        int baix = 0;
        int alt = CAPACITY-1;
        int mitat =0;
        int iteraccions = 1;

        while(baix<=alt){
            mitat = (baix+alt)/2;
            if(array[mitat]==valor){
                return mitat;
            } else if (array[mitat]<valor) {
                baix=mitat+1;
            }
            else if(array[mitat]>valor){
                alt=mitat-1;
            }
            iteraccions++;
        }

        return -1;
    }
    public int[] getArray() {
        return this.array;
    }
}
