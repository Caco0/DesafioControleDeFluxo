import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor");
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosExeption e) {
            // TODO: handle exception
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro!" );
        }
    }
    static void contar(int parametroUm, int  parametroDois) throws ParametrosInvalidosExeption {

        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosExeption();
            
        

        
        int contagem = parametroUm - parametroDois;
        for(int i = 0; i <= contagem; i++){
            System.out.println("Contagem" + (i+1));
        }
    }
}
class ParametrosInvalidosExeption extends Exception{};