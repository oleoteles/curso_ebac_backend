package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        List<? extends Carro> listaDeCarros;

        Honda civic = new Honda();
        Chevrolet onix = new Chevrolet();
        Peugeot boxer = new Peugeot();
        Renault logan = new Renault();


        List<Carro> novaLista = new ArrayList<>();
        novaLista.add(civic);
        novaLista.add(onix);
        novaLista.add(boxer);
        novaLista.add(logan);

        listaDeCarros = novaLista;

        for (Carro carro : listaDeCarros) System.out.println(carro);

    }
}
