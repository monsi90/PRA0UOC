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

    //Es fa una cerca binaria del valor rebut per paràmetres. En cas de trobar-lo ens donarà l'índex, en cas
    //contrari ens retorna un nombre negatiu. Per tant, si torna un nombre que no sigui negatiu, aquest serà
    //l'index que retornam. En cas contrari retornam -1
    public int binarySearch(int valor){
        int index = Arrays.binarySearch(array,valor);
        if(index>0){
            return index;
        }
        return -1;
    }
    public int[] getArray() {
        return this.array;
    }
}
