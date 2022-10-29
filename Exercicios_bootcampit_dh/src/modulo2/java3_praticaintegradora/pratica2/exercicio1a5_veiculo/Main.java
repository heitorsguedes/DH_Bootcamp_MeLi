package modulo2.java3_praticaintegradora.pratica2.exercicio1a5_veiculo;

import modulo2.java3_praticaintegradora.pratica2.exercicio1a5_veiculo.classes.Garagem;
import modulo2.java3_praticaintegradora.pratica2.exercicio1a5_veiculo.classes.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Garagem garagem = new Garagem(1, new ArrayList<Veiculo>());
        Veiculo v1 = new Veiculo("Fiesta", "Ford", 1000.0);
        Veiculo v2 = new Veiculo("Focus", "Ford", 1200.0);
        garagem.addVeiculo(v1);
        garagem.addVeiculo(v2);

        List<Veiculo> listaVeiculos = new ArrayList<>(List.of(
                new Veiculo("Explorer", "Ford", 2500.0),
                new Veiculo("Uno", "Fiat", 500.0),
                new Veiculo("Cronos", "Fiat", 1000.0),
                new Veiculo("Torino", "Fiat", 1250.0),
                new Veiculo("Aveo", "Chevrolet", 1250.0),
                new Veiculo("Spin", "Chevrolet", 2500.0),
                new Veiculo("Corola", "Toyota", 1200.0),
                new Veiculo("Fortuner", "Toyota", 3000.0),
                new Veiculo("Logan", "Renault", 950.0)
        ));

        garagem.getListaVeiculos().addAll(listaVeiculos);
        //Exercicio 3
//        Usando o método sort na lista de Veículos com expressões lambda, obtenha uma
//        lista de veículos ordenados por preço do menor para o maior, imprima o resultado na
//        tela.
        List<Veiculo>list = garagem.getListaVeiculos().stream().sorted(
                (o1, o2) -> o1.getPreco().compareTo(o2.getPreco())
        ).collect(Collectors.toList());

        System.out.println(list);

        list = list.stream().sorted((o1,o2)->o1.getMarca().compareTo(o2.getMarca())).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("CARROS MENOS DE 1000-----------------");
        list.stream().filter((o)->o.getPreco()<1000).forEach(System.out::println);
        System.out.println("CARROS MAIS OU IGUAL A 1000-------------");
        list.stream().filter((o)->o.getPreco()>=1000).forEach(System.out::println);

        System.out.printf("Media R$ %.2f",list.stream().mapToDouble((o)->o.getPreco()).average().getAsDouble());

    }
}
