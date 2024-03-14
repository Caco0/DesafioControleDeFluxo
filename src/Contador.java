import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo valor");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro!" );
        }
    }
    static void contar(int parametroUm, int  parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i <= contagem; i++){
                System.out.println("Interação: " + (i));
            }
        }           
        
    }
}
class ParametrosInvalidosException extends Exception{};