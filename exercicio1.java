package exerc2;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
        int a = leia.nextInt();
        
        System.out.println("Digite o número B:");
        int b = leia.nextInt();
        
        System.out.println("Digite o número C:");
        int c = leia.nextInt();
        
        int soma = a + b;

        if (soma<c){
        System.out.println(a+"+"+b+"="+soma+"<"+c);
        System.out.println ("a soma de a+b é menor que c");
        } 
        else if (soma>c) {
        System.out.println(a+"+"+b+"="+soma+">"+c);
        System.out.println ("a soma de a+b é maior que c");
        }
        else {
        System.out.println(a+"+"+b+"="+soma+"="+c);
        System.out.println ("a soma de a+b é igual a c");
        }
        leia.close();
        }

	}
