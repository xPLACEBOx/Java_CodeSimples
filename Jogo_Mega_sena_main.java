// Classe Matriz Jogos aqui será criado uma matriz para colocar todos os números escolhidos dos participantes como ainda está indefinido a quantidade de cartelas;
// A matriz ajuda a criar e manipular cada uma de maneira mais organizada
//import java.lang.Comparable;
import java.util.Arrays;
class matriz_jogos {
    int[] num=new int[6];
    
    public  matriz_jogos(int num1,int num2,int num3,int num4,int num5,int num6)
    {
        this.num[0]=num1; this.num[1]=num2;this.num[2]=num3;this.num[3]=num4;this.num[4]=num5; this.num[5]=num6;
        Arrays.sort(num);    
    }  
    
}
//Matriz criada para armazenar os números escolhidos;
class numeros_sorteados{

    int[] num_sorte=new int[6];

    numeros_sorteados(int nm1,int nm2,int nm3,int nm4,int nm5,int nm6){
      this.num_sorte[0]=nm1;this.num_sorte[1]=nm2;this.num_sorte[2]=nm3;this.num_sorte[3]=nm4;this.num_sorte[4]=nm5;this.num_sorte[5]=nm6;
      Arrays.sort(num_sorte); 
    }
}
// classe criada para Comparar um número com o outro na matriz para criar uma ordem Crescente 
// Essa classe é necéssaria pois os números da cartela serão adicionados aleatoriamente e preciso que eles sejam organizados para que seja feita uma comparação com os números sorteados.
//Já que os números sorteados são exibidos de maneira crescente.


public class Jogo_Mega_sena_main {
    public static void main(String[]Args){ 
        // NA MATRIZ NUMEROS_SORTEADOS EU COLOCO O RESULTADO  DO BOLÃO DA VIRADA NO DIA 31
        numeros_sorteados cm[]=new numeros_sorteados[1];     
        cm[0]=new numeros_sorteados(26, 8, 44, 50, 22, 13);
        System.out.println("\nOs numeros sorteados foram  "+cm[0].num_sorte[0]+", "+cm[0].num_sorte[1]+" , "+cm[0].num_sorte[2]+" , "+cm[0].num_sorte[3]+" , "+cm[0].num_sorte[4]+" , "+cm[0].num_sorte[5]+"");
        
        //Aqui coloco o número de todos os jogos conforme cada participante for falando para adicionar na cartela 
        matriz_jogos cartela[]=new matriz_jogos[9];       
        cartela[0]=new matriz_jogos(3, 6, 1, 7, 21, 19);
        cartela[1]=new matriz_jogos(31, 17, 29, 7, 41, 52);
        cartela[2]=new matriz_jogos(9, 20, 27, 39, 42, 57);
        cartela[3]=new matriz_jogos(14, 24, 35, 39, 48, 11);
        cartela[4]=new matriz_jogos(27, 4, 35, 48, 51, 17);
        cartela[5]=new matriz_jogos(8, 22, 26, 44, 50, 13);
        cartela[6]=new matriz_jogos(15, 27, 34, 52, 38, 3);
        cartela[7]=new matriz_jogos(27, 12, 33, 40, 59, 21);
        cartela[8]=new matriz_jogos(12, 25, 31, 39, 47, 21);
        //System.out.print(" "+cartela[0].num[0]+", "+cartela[0].num[1]+", "+cartela[0].num[2]+", ");
        for (int i=0;i < cartela.length; ){                           
          // Verifico se os jogos da Cartela são iguais aos números sorteados;
             if(cartela[i].num[0] ==cm[0].num_sorte[0] && cartela[i].num[1] ==cm[0].num_sorte[1] && cartela[i].num[2] ==cm[0].num_sorte[2] && cartela[i].num[3] ==cm[0].num_sorte[3] && cartela[i].num[4] ==cm[0].num_sorte[4] && cartela[i].num[5] ==cm[0].num_sorte[5])
            {
              System.out.println("\nPARABÉNS VOCÊ GANHOU !!! O JOGO GANHADOR FOI O NÚMERO "+ i +"  COM OS NÚMEROS: "+cartela[i].num[0]+", "+cartela[i].num[1]+", "+cartela[i].num[2]+", "+cartela[i].num[3]+", "+cartela[i].num[4]+", "+cartela[i].num[5]+" ");
            }
            // Caso os números da cartela não seja igual retorna
            else{
                System.out.println("\nPOXA NÃO FOI DESSA VEZ QUE VOCÊS CONSEGUIU :/");
            }          
            i++;
        }
        
    }
    
   
    
}
