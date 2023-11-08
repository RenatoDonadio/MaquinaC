package MaquinadeCafe;
/*
 * Maquina atributos: Quantidade de agua = 950 ML
 *                    Quantidade de capsulas usadas = 4
 * construtor default e construtor com parametros
 * metodo fazerCafe() = tamanho p - 50 ml, tamanho m = 80ml, tamanho G = 100ml
 * Lançar exceção caso não haja água ou reservatorio de capsulas. 
 * Adicionar metodos para abastecer a água.
 */

import javax.swing.tree.ExpandVetoException;

public class Cafe {
 public final int MAX_AGUA = 950;
 private int Agua=0;
 private int Capsulas = 0;
 
 public Cafe(){
    
}

 public Cafe (int Agua){
  abastecerAgua(Agua);
 }

 


public int getAgua() {
    return Agua;
}

public void abastecerAgua(int Agua){
   
        if(this.Agua + Agua > MAX_AGUA){ // exceder o limite
            this.Agua = MAX_AGUA;
        }else{
            this.Agua += Agua;
        }
        
        if (Agua < 950)  {
        
        System.out.println("Agua abastecida.");
    } 
       
    
}


public void esvaziarReservatorioCapsulas(){
  System.out.println("Reservatorio esvaziado");
  Capsulas = 0;
}




public int getCapsulas() {
    return Capsulas;
}

public void fazerCafePequeno() throws Exception{
           if (Agua<50) {
        throw new Exception("Água insuficiente");
          }
         if (Capsulas == 4){
            throw new Exception("Limite de cápsulas atingido");
          }
         
      
       if (Agua>50){
        
        Agua = this.Agua - 50;
    
         Capsulas++;
        }
}
public void fazerCafeMedio() throws Exception{
       if (Agua<80) {
        throw new Exception("Água insuficiente");
        }
        if (Capsulas == 4){
            throw new Exception("Limite de cápsulas atingido");
          }
      
   if (Agua>80) {
        Agua = this.Agua - 80;
        
        Capsulas++;
    }


}
public void fazerCafeGrande() throws Exception{
  
   if (Agua<100) {
     throw new Exception("Água insuficiente");
   }
        if (Capsulas == 4){
            throw new Exception("Limite de cápsulas atingido");
        
          }
       
  
   if (Agua>100) {
        Agua = this.Agua - 100;
        Capsulas++; 


}



 }
}


