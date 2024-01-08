import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in).useLocale(Locale.US);
        analisarCadidato(1900.0);
        analisarCadidato(2200.0);
        analisarCadidato(2000.0);
    }

    static void analisarCadidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
