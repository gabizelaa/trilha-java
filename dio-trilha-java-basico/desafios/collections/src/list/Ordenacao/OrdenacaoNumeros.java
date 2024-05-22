package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.integerList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(integerList);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public void exibirNumeros(){
        System.out.printf(this.integerList.toString());
    }

    public static void main(String[] args) {

        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }

}
