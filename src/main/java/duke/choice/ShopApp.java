/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Admin
 */
public class ShopApp {
    public static void main(String[] args) {
        double Tax = 0.2;
        double Total=0.0;
          
    
     Customer c1 = new Customer ();
        c1.name="Pinky";
        c1.size = "S";
       
                
          System.out.println("Hello World!" + c1.name);
          
          Clothing iterm1 = new Clothing();
          Clothing iterm2 =new Clothing();
          Clothing iterm3 = new Clothing();
          
          Clothing[] Iterms = { iterm1, iterm2, iterm3, new Clothing()};
          
          iterm1.description = "blue jackect";
          iterm1.size ="M";
          iterm1.prize = 20.9;
               
          
          iterm2.size = "S";
          iterm2.prize = 10.5;
          iterm2.description = "Orange Tshirt";
          
          iterm3.size = "XL";
          iterm3.prize = 50.5;
          iterm3.description = "Orange JACKECT";
          
          Iterms[3].description ="dori hand bag";
          Iterms[3].prize = 5.0;
          Iterms[3].size ="S";
          
          //System.out.println("Item 1 :" + iterm1.description +","+ iterm1.size+","+ iterm1.prize );
          //System.out.println("Item 2 :" + iterm2.description +","+ iterm2.size+","+ iterm2.prize );
          
          Total = (iterm1.prize + iterm2.prize *2)*(1+Tax);
    
        
         
          int measurement = 3;
          switch (measurement)
                  {
              case 1: case 2: case 3:
                      c1.size = "S";
                      break;
              case 4 :case 5: case 6: 
                      c1.size ="M";
                      break;
                  case 7: case 8: case 9:
                      c1.size ="L";
                      break;
                  default:
                      c1.size="XL";
                      
                      
          }  
          for(Clothing item : Iterms)
          {  
          if(c1.size.equals(item.size))  
              System.out.println("Item  :" + item.description +","+ item.size+","+ item.prize );
             Total = Total + item.prize;//i want to avoid hard coding and loop inside the array clothing
             if(Total>15)
             {break;
                     }
    }
           System.out.println("Total is  :"+ Total); 
          }        
          
}
