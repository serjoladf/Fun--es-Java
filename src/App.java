import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String y = ("Serjola");
        String x = (" Hello, World!, e ai Serjola tudo bem.");
        System.out.println(x.length()); // Conta a quantidade de caractere de uma String
        System.out.println(x.contains("llo")); // verifica se há a palavra igual ou parte da palavra na String X 
        System.out.println(x.indexOf("ld")); // verifica onde de caracter esta a palavra ou parte na String X
        System.out.println(x.lastIndexOf("bem"));
        System.out.println(x.indexOf("ld"));
        System.out.println(x.toLowerCase()); // Converte a String para caixa baixa
        System.out.println(x.toUpperCase()); // Converte a String para caixa Alta
        System.out.println(x.trim()); // Tira espaços desnecessário do inicio
        System.out.println(x.substring(16)); // Rescreva a String a partir do da quantidade de numero dado
        System.err.println(x.equals("Serjola")); // Compara a palavra com a String - AQUI FALSO
        System.err.println(y.equals("Serjola")); // Compara a palavra com a String - AQUI Verdadeiro
        
        int numb1 = 2, numb2 = 3;
        // if, else if, else
        if(numb1 > numb2){
            System.err.println("legal numb1 é maior que numb2");
        }else if(numb1 == numb2){
            System.err.println("legal numb1 é igual que numb2");
        }else {
         System.err.println("legal, numb1 é menor que numb2 ");
        }
        
        // switch comportamento

        System.out.println("Digite um numero na switch 1");
        int opcao = sc.nextInt();


        switch (opcao) {
            case 1 :
                System.err.println("caso 1 primeira opção");
                break;
             case 2 :
             System.err.println("caso 2 primeira opção");
                break;
            default:
                throw new IllegalArgumentException("Opção inválida"+ opcao + "redigite");
        }

        System.out.println("Digite um numero na switch 2");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 :
                System.err.println("caso 1");
                break;
             case 2 :
             System.err.println("caso 2");
                break;
            default:
                throw new AssertionError("err");
        }
        // laço FOR

        for(int i = 1; i <= 3; i++){
            System.err.println(" for "+ i + "ª vez");
        }
        // Quebrando um laço de Repetição
        for(int i = 1; i <= 50 ; i++){
           System.err.println(" Testando for "+ i + "ª vez");
           
           if(i == 7){  // Condição para parar o Loop utilizando BREAK;
            break;
           }
       }
        
        // Wlhile e DO while
        int number = 0;
        do{ 
            System.out.println("Digite um numero DO While 1 para sair");
            number = sc.nextInt();

        }while(number != 1); // Se o numero for igual a 1 sai do loop tem que ser deiferente de 1

        // Wlhile e DO while
        number = 0;

        do{ 
            System.out.println("Digite um numero DO While "+ number+ " Vez");
            number++;
        }while(number < 5); // (ENQUANTO i FOR MENOR QUE 5) o Loop não para

        int i = 0;

        while(i < 3){ // Significa: (ENQUANTO i FOR MENOR QUE 3) Neste caso o Lopp só termina quiando a condição é verdadeira.
            System.out.println("Digite um numero somente while, digitar 3 numeros");
            number = sc.nextInt();
            i++;
        }
        // Entrada de Dados






    }
}
