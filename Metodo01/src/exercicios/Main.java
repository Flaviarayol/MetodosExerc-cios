package exercicios;

public class Main {

    public static void main(String[] args){

        //Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(5,3);
        Calculadora.subtracao(6,3);
        Calculadora.multiplicao(2,2);
        Calculadora.divisao(10,5);

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.mensagem(7);
        Mensagem.mensagem(15);
        Mensagem.mensagem(2);

        //Empréstimo
        System.out.println("Empréstimo");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,5);

    }
}
