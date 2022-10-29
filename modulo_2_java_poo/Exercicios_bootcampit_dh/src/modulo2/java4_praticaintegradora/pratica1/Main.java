package modulo2.java4_praticaintegradora.pratica1;

import modulo2.java4_praticaintegradora.pratica1.classes.Cliente;
import modulo2.java4_praticaintegradora.pratica1.classes.Fatura;
import modulo2.java4_praticaintegradora.pratica1.classes.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente c1 = new Cliente(1, "Heitor", "Guedes");
        Cliente c2 = new Cliente(2, "Fernanda", "Junes");
        Cliente c3 = new Cliente(3, "Frei", "Manuela");
        Cliente c4 = new Cliente(3, "Frei", "Manuela");

        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        Item i1 = new Item(1, "Bolo", 40.0);
        Item i2 = new Item(2, "Caramelo", 4.0);
        Item i3 = new Item(3, "Bolo", 40.0);
        Item i4 = new Item(4, "Bolo", 40.0);
        List<Item> listaItens = new ArrayList<>(List.of(i1, i2, i3, i4));
        Fatura f1 = new Fatura(c1, listaItens);

        System.out.println("FATURA");
        System.out.println(f1);

        System.out.println("LISTA DE CLIENTES");
        System.out.println(listaClientes);
        System.out.println("REMOVENDO UM CLIENTE");
        listaClientes.remove(2);
        System.out.println(listaClientes);

        System.out.println("Digite o id de um cliente restante");
        int id = sc.nextInt();
        Optional<Cliente> OpCliente = listaClientes.stream().filter(cliente -> cliente.getId() == id).findFirst();
        if (OpCliente.isEmpty()) {
            System.out.println("Cliente não existente");
        } else {
            System.out.println(OpCliente);
        }
        for(int i = 0 ; i < listaClientes.size() ; i++){
            if(id == listaClientes.get(i).getId()){
                System.out.println(listaClientes.get(i));
                break;
            }else if(i == listaClientes.size()-1){
                System.out.println("Cliente não encontrado!");
            }
        }
        sc.close();
    }
}
