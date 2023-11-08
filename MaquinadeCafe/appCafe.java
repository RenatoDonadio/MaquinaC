package MaquinadeCafe;
import java.util.Scanner;
public class appCafe extends Cafe {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
     int option;
     int quantidadedeAgua;
    
     Cafe maquinaCafe = new Cafe(50);

     

        
       do {
       System.out.println("Agua: " + maquinaCafe.getAgua());
       System.out.println("Cápsulas: " + maquinaCafe.getCapsulas());
       System.out.println("Escolha a quantidade do café");
       System.out.println("1. Abastecer Água");
       System.out.println("2. Fazer Café Pequeno");
       System.out.println("3. Fazer Café Médio");
       System.out.println("4. Fazer Café Grande");
       System.out.println("5. Esvaziar reservatorio de capsulas");
       System.out.println("6. Desligar");
       option = teclado.nextInt();

       
         
       switch (option) {
        case 1:
          //maquinaCafe.abastecerAgua(quantidadedeAgua);
           break;
        case 2: 
        try{
          maquinaCafe.fazerCafePequeno();
          System.out.println("Café Pequeno Pronto!");
        } catch (Exception e){
          System.out.println(e.getMessage());
       
        }
          
       
        
        
               
          
          break;
        
          case 3:
          try {
             maquinaCafe.fazerCafeMedio();
             System.out.println("Café Médio Pronto!");
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
         
         



          break;

          case 4:
          try {
            maquinaCafe.fazerCafeGrande();
            System.out.println("Café Grande Pronto!");
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          
        
          break;

          case 5: 
          maquinaCafe.esvaziarReservatorioCapsulas();

          break;

          case 6:
          System.out.println("Desligando...");
          break;

          default: 
          System.out.println("Opção Inválida");
          break;
          
       
        
       }
       
      
      }    while(option != 6); 
       
         
    }
} 
