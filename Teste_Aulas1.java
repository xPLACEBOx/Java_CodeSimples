public class Teste_Aulas1{
 // Código simples para pegar os números pares ou impáres 
    public static void main(String[]Args){
        System.out.println("Hello world");
        int low=0;
        int hight =100;

       
        while(low <=hight)
        {
            if(low % 2 ==0)
            {
                System.out.println("Esses são os Números Par: "+low+" ");
            }
            else{
                System.out.println("Esses são os Números Impar: "+low+" ");
            }
            low++;
        }
}}

