package modulo2.java5_praticaintegradora.pratica1.classes;

import java.util.List;
import java.util.Optional;

public class Corrida {
    private double distancia;
    private double premioDolar;
    private String nome;
    private int maxVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SalvaVidasAuto salvaVidasAuto;
    private SalvaVidasMoto salvaVidasMoto;

    public Corrida() {
    }

    public Corrida(double distancia, double premioDolar, String nome, int maxVeiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioDolar = premioDolar;
        this.nome = nome;
        this.maxVeiculosPermitidos = maxVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public Corrida(double distancia, double premioDolar, String nome, int maxVeiculosPermitidos, List<Veiculo> listaVeiculos, SalvaVidasAuto salvaVidasAuto, SalvaVidasMoto salvaVidasMoto) {
        this.distancia = distancia;
        this.premioDolar = premioDolar;
        this.nome = nome;
        this.maxVeiculosPermitidos = maxVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
        this.salvaVidasAuto = salvaVidasAuto;
        this.salvaVidasMoto = salvaVidasMoto;
    }

    public void addCarro(double velocidade, double aceleracao, int anguloGiro, String placa) {
        if (this.listaVeiculos.size() < this.maxVeiculosPermitidos) {
            Carro c = new Carro(velocidade, aceleracao, anguloGiro, placa);
            this.listaVeiculos.add(c);
        } else {
            System.out.println("Numero maximo de veiculos permitidos atingido.");
        }
    }

    public void addMoto(double velocidade, double aceleracao, int anguloGiro, String placa) {
        if (this.listaVeiculos.size() < this.maxVeiculosPermitidos) {
            Moto m = new Moto(velocidade, aceleracao, anguloGiro, placa);
            this.listaVeiculos.add(m);
        } else {
            System.out.println("Numero maximo de veiculos permitidos atingido.");
        }
    }

    public void deleteVeiculo(Veiculo v) {
        boolean veiculoEstaNaLista = false;
        for (Veiculo veiculo : this.listaVeiculos) {
            if (veiculo.equals(v)) {
                this.listaVeiculos.remove(v);
                veiculoEstaNaLista = true;
                break;
            }
        }
        if (veiculoEstaNaLista) {
            System.out.println("Veiculo Removido");
        } else {

            System.out.println("Veiculo nao encontrado");
        }

    }

    public void deleteVeiculoComPlaca(String placa) {
        Veiculo veiculoToDelete = getVeiculoByPlaca(placa);
        if (veiculoToDelete != null) {
            this.listaVeiculos.remove(veiculoToDelete);
            System.out.println("Veiculo Removido");
        } else {
            System.out.println("Veiculo nao encontrado");
        }
    }

    public Veiculo getVeiculoByPlaca(String placa) {
        Optional<Veiculo> veiculo = this.listaVeiculos.stream().filter(v -> v.getPlaca() == placa).findFirst();
        if(veiculo.isEmpty())return null;
        return veiculo.get();
    }

    public void socorrerAuto(String placa) {
        Veiculo v = getVeiculoByPlaca(placa);
        if(v != null) {

            Carro c = null;

            if (v.getRodas() == 4) {
                c = (Carro) v;
            }
            if (c != null) {
                salvaVidasAuto.socorrer(c);
            } else {
                System.out.println("Carro nao encontrado");
            }
        }else{
            System.out.println("Carro nao encontrado");
        }
    }

    public void socorrerMoto(String placa) {
        Veiculo v = getVeiculoByPlaca(placa);
        Moto m = null;

        if(v.getRodas() == 2 ){
            m = (Moto) v;
        }
        if(m!=null){
            salvaVidasMoto.socorrer(m);
        }else{
            System.out.println("Moto nao encontrada.");
        }
    }

    public Veiculo vencedorCorrida() {
        Veiculo veiculoVencedor = null;
        double maiorPontuacao = 0;
        for (Veiculo veiculo : this.listaVeiculos) {
            double pontuacaoVeiculo = (veiculo.getVelocidade() * (veiculo.getAceleracao() * 0.5)) / (
                    veiculo.getAnguloGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100)
            );
            if (pontuacaoVeiculo > maiorPontuacao) {
                maiorPontuacao = pontuacaoVeiculo;
                veiculoVencedor = veiculo;
            }
        }
        if (veiculoVencedor == null) return null;

        return veiculoVencedor;
    }

    //Getters,Setter and toString
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDolar() {
        return premioDolar;
    }

    public void setPremioDolar(double premioDolar) {
        this.premioDolar = premioDolar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxVeiculosPermitidos() {
        return maxVeiculosPermitidos;
    }

    public void setMaxVeiculosPermitidos(int maxVeiculosPermitidos) {
        this.maxVeiculosPermitidos = maxVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }


    public SalvaVidasAuto getSalvaVidasAuto() {
        return salvaVidasAuto;
    }

    public void setSalvaVidasAuto(SalvaVidasAuto salvaVidasAuto) {
        this.salvaVidasAuto = salvaVidasAuto;
    }

    public SalvaVidasMoto getSalvaVidasMoto() {
        return salvaVidasMoto;
    }

    public void setSalvaVidasMoto(SalvaVidasMoto salvaVidasMoto) {
        this.salvaVidasMoto = salvaVidasMoto;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioDolar=" + premioDolar +
                ", nome='" + nome + '\'' +
                ", maxVeiculosPermitidos=" + maxVeiculosPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                ", salvaVidasAuto=" + salvaVidasAuto +
                ", salvaVidasMoto=" + salvaVidasMoto +
                '}';
    }
}
