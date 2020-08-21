/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class quick_Sort {
    
   public static void main(String[] args) {
        int[] Num= {15,9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0}; //vetor teste
        int p=0; //posição inicial do vetor
        int f=Num.length-1; // posição final do vetor
        quick_Sort(Num,p,f); //chamada da função de ordenação com o vetor e as posições final e inicial

        for(int z=0;z<Num.length;z++){ //impressão do vetor após ser ordenado
            System.out.println(Num[z]);
        }
   }
   public static int[] quick_Sort(int Num[], int p, int f){ //Utilizado para reoordenar o vetor recursivamente.
       if(p<f){
           int q= particao( Num,p,f); //utilizado para definir o pivo
           quick_Sort(Num,p,q-1); //faz uso do pivo para ordenar a parte que terá os menores valores, em que é utilizado o pivo-1, para delimitar o final do subvetor a ser organizado
           quick_Sort(Num,q+1,f); // faz uso do pivo para ordenar a parte com os valores maiores, em que é utilizado o pivo+1, para indicar o começo do subvetor a ser ordenado
       }
       
       return Num;
   }
   
   public static int particao(int Num[],int p, int f){ // função mais importante do quick sort, ela é a responsável por retornar o pivo de cada vetor e subvetor a ser ordenado.
       int x= Num[f];
       int aux;
       int i= p-1;
            for(int j=p;j<f;j++){
                if(Num[j]<x){
                    i=i+1;
                    aux=Num[i];
                    Num[i]=Num[j];
                    Num[j]=aux;
                }
            }
            aux=Num[i+1];
            Num[i+1]=Num[f];
            Num[f]=aux;
       return i+1;
   }
}
