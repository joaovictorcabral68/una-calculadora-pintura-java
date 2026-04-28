import java.util.Scanner;

public class CalculadoraPintura{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        final double ALTURA_PAREDE = 2.7; //metros
        final double RENDIMENTO_LITRO = 10.0; // m quadrado por litro
        final double DESCONTO_ABERTURAS = 0.10; // 10% Para portas/Janela.
        
        System.out.print("Digite o comprimento de um dos lados do quarto (Em metros:");
        double lado= sc.nextDouble();
        
        double areaUmaParede = lado* ALTURA_PAREDE;
        double areaTotalParedes = areaUmaParede * 4;

        double areaLiquida = areaTotalParedes *(1- DESCONTO_ABERTURAS);

        double litrosNecessarios = areaLiquida /  RENDIMENTO_LITRO;

        System.out.println("\n---Resumo do Orçamento ---");
        System.out.printf("Area bruta das paredes: %.2f m² \n", areaTotalParedes);
        System.out.printf("Area a ser pintada (Com descontos): %.2f m² \n", areaLiquida);
        System.out.printf("Total de tinta necessaria: %.2f Litros\n", litrosNecessarios);
        System.out.printf("-----------------------------");

            sc.close(); 
    }
}