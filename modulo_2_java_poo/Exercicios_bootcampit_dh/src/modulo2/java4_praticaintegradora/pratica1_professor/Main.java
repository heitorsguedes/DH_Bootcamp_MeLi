package modulo2.java4_praticaintegradora.pratica1_professor;

import modulo2.java4_praticaintegradora.pratica1_professor.domain.Cliente;
import modulo2.java4_praticaintegradora.pratica1_professor.domain.Fatura;
import modulo2.java4_praticaintegradora.pratica1_professor.domain.Item;
import modulo2.java4_praticaintegradora.pratica1_professor.repository.ClienteRepository;
import modulo2.java4_praticaintegradora.pratica1_professor.repository.FaturaRepository;
import modulo2.java4_praticaintegradora.pratica1_professor.repository.ItemRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //repositorios
        ClienteRepository clienteRepository = new ClienteRepository();
        FaturaRepository faturaRepository = new FaturaRepository();
        ItemRepository itemRepository = new ItemRepository();


        //CLIENTES
        Cliente c1 = new Cliente(1L,"Heitor","Guedes");
        Cliente c2 = new Cliente(2L,"Bani","Niko");
        Cliente c3 = new Cliente(3L,"Burtov","La");

        clienteRepository.salvar(c1);
        clienteRepository.salvar(c2);
        clienteRepository.salvar(c3);

        clienteRepository.exibirTodosTela();

        //Buscar um cliente

        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar cliente por id");
        Long idBusca = sc.nextLong();
        System.out.println(clienteRepository.buscarById(idBusca));

        //Excluir um cliente

        System.out.println("Digite o codigo de um cliente para excluir.");
        idBusca = sc.nextLong();
        clienteRepository.excluirById(idBusca);
        clienteRepository.exibirTodosTela();


        //ITENS

        //Criando itens
        Item it1 = new Item(1L,"Bolo",3,8);
        Item it2 = new Item(2L,"Chocolate",5,2);
        Item it3 = new Item(3L,"Banana",10,0.6);
        //Salvando itens
        itemRepository.salvar(it1);
        itemRepository.salvar(it2);
        itemRepository.salvar(it3);

        itemRepository.exibirTodosTela();

        System.out.println("Busque um item na tela:");
        idBusca = sc.nextLong();
        System.out.println(itemRepository.buscarById(idBusca));

        System.out.println("Excluir um item");
        idBusca = sc.nextLong();
        itemRepository.excluirById(idBusca);
        itemRepository.exibirTodosTela();

        //Criando fatura

        Fatura fatura1 = new Fatura(1L,c1,itemRepository.buscarTodos());
        faturaRepository.salvar(fatura1);
        faturaRepository.exibirTodosTela();

    }


}
