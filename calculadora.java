import java.util.Scanner;
public class calculadora {
    
    public static void main(String[] args)
    {
        do{
            int operação;
            int valor1;
            int valor2;
            int result;

        Scanner ler_opera=new Scanner(System.in);
        Scanner ler_prim_num=new Scanner(System.in);
        Scanner ler_segun_num=new Scanner(System.in);
        System.out.print("\n Que tipo de operação deseja realizar?");
        System.out.printf("\n 1- PARA ADIÇÃO");
        System.out.printf("\n 2- PARA SUBTRAÇÃO");
        System.out.printf("\n 3- PARA DIVISÃO");
        System.out.printf("\n 4- PARA MULTIPLICAÇÃO\n");

        operação=ler_opera.nextInt();

        System.out.println("\nDigite o 1° Valor\n");
        valor1=ler_prim_num.nextInt();

        System.out.println("\nDigite o 2° Valor\n");
        valor2=ler_segun_num.nextInt();

        switch (operação) 
        {
            case 1:
                result=FormulasMath.adição(valor1, valor2);
                System.out.println("O resultado é : "+result+" ");
                break;
            case 2: 
            result=FormulasMath.subtração(valor1, valor2);
            System.out.println("O resultado é : "+result+" ");
                break;
            case 3: 
                result=FormulasMath.divisão(valor1, valor2);
                System.out.println("O resultado é : "+result+" ");
                    break;
            case 4: 
            result=FormulasMath.multiplação(valor1, valor2);
            System.out.println("O resultado é : "+result+" ");
                break;
            default:
                break;
        } 
        }
        while(true);
       

        

              
        
    }
}
