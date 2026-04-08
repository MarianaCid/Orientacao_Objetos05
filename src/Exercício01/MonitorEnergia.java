package Exercício01;

import com.sun.source.tree.BreakTree;

public class MonitorEnergia {
    double[] consumoDiario;
    int indice;

    public MonitorEnergia(int tamanho){
         this.consumoDiario = new double[tamanho];
    }

    public void registar(double valor){
        if(indice < consumoDiario.length) {
            consumoDiario[indice] = valor;
            indice++;
        }
    }

    public double media(){
        /*double aux = 0;
        for (int i=0; i<indice; i++){
            aux += consumoDiario[i];
        }

        return aux/indice;*/
        return media(1, indice);
    }

    public double media(int inicio, int fim){
        double aux =0;
        for (int i= inicio -1; i< fim; i++){
            aux += consumoDiario[i];
        }
        return aux/((fim-inicio)+1);
    }
}



