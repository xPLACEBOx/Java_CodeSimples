// Classe Matriz Jogos aqui será criado uma matriz para colocar todos os números escolhidos dos participantes como ainda está indefinido a quantidade de cartelas;
// A matriz ajuda a criar e manipular cada uma de maneira mais organizada
import java.util.Arrays;
import java.lang.Comparable;
import java.util.*;
class matriz_jogos{
    public int numero1;
    public int numero2;
    public int numero3;
    public int numero4;
    public int numero5;
    public int numero6;

       matriz_jogos(int numero1,int numero2,int numero3, int numero4, int numero5, int numero6)
    {
        this.numero1=numero1;this.numero2=numero2;this.numero3=numero3;this.numero4=numero4;this.numero5=numero5;this.numero6=numero6;
    }

}
//Matriz criada para armazenar os números escolhidos;
class numeros_sorteados{

    public int num1;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int num6;
    numeros_sorteados(int nm1,int nm2,int nm3,int nm4,int nm5,int nm6){
       this.num1=nm1;this.num2=nm2;this.num3=nm3;this.num4=nm4;this.num5=nm5;this.num6=nm6;
    }
}
// classe criada para Comparar um número com o outro na matriz para criar uma ordem Crescente 
// Essa classe é necéssaria pois os números da cartela serão adicionados aleatoriamente e preciso que eles sejam organizados para que seja feita uma comparação com os números sorteados.
//Já que os números sorteados são exibidos de maneira crescente.
class Ordem implements  Comparator<matriz_jogos>{

    public int  compare(matriz_jogos a){
        //Aqui todo número escolhido será ordenado de maneira crescente;
         return a.numero1-a.numero2-a.numero3-a.numero4-a.numero5-a.numero6;
    }

    @Override
    public int compare(matriz_jogos o1, matriz_jogos o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}
public class Jogo_Mega_sena_main {
    public static void main(String[]Args){ 
        

        // NA MATRIZ NUMEROS_SORTEADOS EU COLOCO O RESULTADO  DO BOLÃO DA VIRADA NO DIA 31
        numeros_sorteados cm[]=new numeros_sorteados[1];

        cm[0]=new numeros_sorteados(1, 2, 3, 4, 5, 6);

        System.out.println("\nOs numeros sorteados foram  "+cm[0].num1+", "+cm[0].num2+" , "+cm[0].num3+" , "+cm[0].num4+" , "+cm[0].num5+" , "+cm[0].num6);


        //Aqui coloco o número de todos os jogos conforme cada participante for falando para adicionar na cartela
        matriz_jogos cartela[]=new matriz_jogos[4];

        cartela[0]=new matriz_jogos(4, 2, 10, 51, 37, 41);

        cartela[1]=new matriz_jogos(42, 31, 5, 16, 39, 50);

        cartela[2]=new matriz_jogos(7, 23, 1, 10, 21, 6);

        cartela[3]=new matriz_jogos(2, 1, 3, 4, 6, 5);




        for (int i=0;i < cartela.length; i++){                
          
            // Método .sort usado para ordenar todos os números da cartela de maneira crescente
           Collections.sort(cartela[i],new Ordem());

          // System.out.println(""+cartela[i].numero1+", "+cartela[i].numero2+", "+cartela[i].numero3+", "+cartela[i].numero4+", "+cartela[i].numero5+", "+cartela[i].numero6+"");
            
          // Verifico se os jogos da Cartela são iguais aos números sorteados;
             if(cartela[i].numero1 ==cm[0].num1 && cartela[i].numero2 ==cm[0].num2 && cartela[i].numero3 ==cm[0].num3 && cartela[i].numero4 ==cm[0].num4 && cartela[i].numero5 ==cm[0].num5 && cartela[i].numero6 ==cm[0].num6)
            {
              System.out.println("PARABÉNS VOCÊ GANHOU !!! O JOGO GANHADOR FOI "+ cartela[i]+", COM OS NÚMEROS"+cartela[i].numero1+", "+cartela[i].numero2+", "+cartela[i].numero3+", "+cartela[i].numero4+", "+cartela[i].numero5+", "+cartela[i].numero6+", ");
            }
            // Caso os números da cartela não seja igual retorna
            else{
                System.out.println("\nPOXA NÃO FOI DESSA VEZ QUE VOCÊS CONSEGUIU :/");
            }
           
        }

        
    }
    
   
    
}
