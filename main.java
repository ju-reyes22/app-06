import java.util.Scanner; 

// CREA UN PROGRAMA QUE PIDA LA EDAD Y EL SALARIO DE UNA PERSONA 
// EL PROGRAMA DEBE PRESENTAR UN MENU EL CUAL CONTIENE: 
// 1. SI ES MEDICO   2. PROGRAMADOR   3. ABOGADO
// SI ES MEDICO INCREMENTA EN $200
// SI ES PROGRAMADOR EL SALARIO SE INCREMENTA EL 15% DEL SALARIO
// SI ES ABOGADO SE INCREMENTA $50 SIMPRE Y CUANDO SEA MAYOR DE 60 AÑOS

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad; 
        double salario; 
        int opcion; 

        
        System.out.println("Ingresa la edad:");
        edad = entrada.nextInt(); 

        System.out.println("Ingresa el salario:");
        salario = entrada.nextDouble(); 

        System.out.println("######");
        System.out.println("1. Es médico");
        System.out.println("2. Es programador");
        System.out.println("3. Es abogado");
        System.out.println("Ingrese una opción:");
        opcion =entrada.nextInt(); 

        switch(opcion) {
            case 1: 

            case 2: 

            case 3: 

        }

    }
}