package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * /
        int numero01 = 19;
        int numero02 = 30;
        int resultadoDaOperacao = numero01 + numero02;
        System.out.println(resultadoDaOperacao);
        int numero03 = 5;
        double numero04 = 10;
        double resultadoDaSegundaOperacao = numero03 / numero04;
        System.out.println(resultadoDaSegundaOperacao);

        //% resto
        int restoDeDez = 10 % 2;
        System.out.println("O resto de dez é : "+restoDeDez+" resultado número par"+" OBS:QUAlQUER NÚMERO QUE NÃO DAR O RESULTADO 0 É IMPAR, CASO DER 0 O NÚMERO É PAR!");

        // < > <= >= == !=
        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorVinte "+isDezMaiorVinte);
        System.out.println("isDezMenorVinte "+isDezMenorVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && || !
        int age = 14;
        boolean isMenorDeIdade = age < 16 && age > 0;
        boolean isMaiorDeIdade = age >= 16 && age > 0;

        System.out.println("isMenorDeIdade "+isMenorDeIdade);
        System.out.println("isMaiorDeIdade "+isMaiorDeIdade);

        double valorContaCorrente = 2220.89;
        double descontoNoventaPorcento = 0.1;
        float valorPlaystation = 5549.99F;
        valorPlaystation *= descontoNoventaPorcento;
        boolean isPlaystationCincoCompravel = valorContaCorrente >= valorPlaystation;
        System.out.println("O playstation 5 é comprável? "+isPlaystationCincoCompravel);
        System.out.println("! valor Do Playstation após o desconto de 90%:"+valorPlaystation+" !");

        // = += -= %= *= /=
        float bonusDeSalario = 2000F;
        bonusDeSalario -= 1000;
        bonusDeSalario += 550.55;
        bonusDeSalario -= 0.55;
        bonusDeSalario *= 2;
        bonusDeSalario /= 2.5;
        bonusDeSalario %= 2;
        bonusDeSalario = 387.5F;
        System.out.println(bonusDeSalario);

        // ++ --
        int counter = 0;
        ++counter;
        counter++;
        counter--;
        --counter;
        System.out.println("O valor do contador é: "+counter);
    }
}
