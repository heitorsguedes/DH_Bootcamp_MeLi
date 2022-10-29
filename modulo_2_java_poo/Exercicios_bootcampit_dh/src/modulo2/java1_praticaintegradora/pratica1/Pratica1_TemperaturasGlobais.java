package modulo2.java1_praticaintegradora.pratica1;

public class Pratica1_TemperaturasGlobais {
    public static String[][] temperaturasGlobais = { // Linhas: 10 x Colunas: 3
            {"Londres", "-2","33"},
            {"Madrid", "-3","32"},
            {"Nueva York", "-8","27"},
            {"Buenos Aires", "4","37"},
            {"Assunción", "6","42"},
            {"São Paulo", "5","43"},
            {"Lima", "0","39"},
            {"Santiago de Chile", "-7","26"},
            {"Lisboa", "-1","31"},
            {"Tokio", "-10","35"},
    };

    public static void main(String[] args) {
        int maiorTemperatura = Integer.parseInt(temperaturasGlobais[0][2]);
        int menorTemperatura = Integer.parseInt(temperaturasGlobais[0][1]);
        String cidadeMaiorTemperatura = temperaturasGlobais[0][0];
        String cidadeMenorTemperatura = temperaturasGlobais[0][0];

        for(int i = 1 ; i < temperaturasGlobais.length ; i ++){
            if(maiorTemperatura < Integer.parseInt(temperaturasGlobais[i][2])) {
                maiorTemperatura =Integer.parseInt(temperaturasGlobais[i][2]);
                cidadeMaiorTemperatura = temperaturasGlobais[i][0];
            }

            if(menorTemperatura > Integer.parseInt(temperaturasGlobais[i][1])){
                menorTemperatura = Integer.parseInt(temperaturasGlobais[i][1]);
                cidadeMenorTemperatura = temperaturasGlobais[i][0];
            }
        }

        System.out.println("-------RELATÓRIO-------");
        System.out.println("Cidade com a maior temperatura máxima:" + cidadeMaiorTemperatura + "- Temperatura: "+maiorTemperatura+"°");
        System.out.println("Cidade com a menor temperatura mínima:" + cidadeMenorTemperatura + "- Temperatura: "+menorTemperatura+"°");
    }
}
