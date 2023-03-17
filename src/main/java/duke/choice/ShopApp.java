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
        double TotalTAX ;
          double TotalPay ;
    
     Customer c1 = new Customer ();
        c1.name="Pinky";
        c1.size = "S";
        int measurement = 3;
                
          System.out.println("Hello World!" + c1.name);
          
          Clothing iterm1 = new Clothing();
          Clothing iterm2 =new Clothing();
          Clothing iterm3 = new Clothing();
          
          iterm1.description = "blue jackect";
          iterm1.size ="M";
          iterm1.prize = 20.9;
               
          
          iterm2.size = "S";
          iterm2.prize = 10.5;
          iterm2.description = "Orange Tshirt";
          
          iterm3.size = "XL";
          iterm3.prize = 50.5;
          iterm3.description = "Orange JACKECT";
          
          System.out.println("Item 1 :" + iterm1.description +","+ iterm1.size+","+ iterm1.prize );
          System.out.println("Item 2 :" + iterm2.description +","+ iterm2.size+","+ iterm2.prize );
          
          TotalTAX = (iterm1.prize + iterm2.prize *2)*Tax;
          TotalPay =(iterm1.prize + iterm2.prize *2)+TotalTAX;
          System.out.println("Total is  :"+ TotalPay );
          
          Switch (measurement)
                  case 1,2,3: size ="S";
          case44,5,6: 
          
          
}
}