/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ShopApp {
    public static void main(String[] args) {
        double Tax = 0.2;
        double Total=0.0;
          
    
     Customer c1 = new Customer ("Pinky",3 );
     Customer c2 = new Customer ( "Talent ",14);
        //c1.setName("Pinky");
        //c1.setSize("S");
       
         System.out.println("Hello  : Welcome to Duke Choice Shop" );         
           System.out.println("Customer is  " + c1.getName());
          
          Clothing iterm1 = new Clothing("blue jackect",20.9,"M");
          Clothing iterm2 =new Clothing("Orange Tshirt",10.5,"S");
          Clothing iterm3 = new Clothing("Orange JACKECT",50.5,"XL" );
          
          
          Customer[] customerslist ={c1,c2};
          Clothing[] Iterms = { iterm1, iterm2, iterm3, new Clothing("dori hand bag",5.0,"S")};
         // int measurement = 8;
          
          c1.addItems(Iterms);
         System.out.println(" Customer is :" + iterm1.getDescription() +","+ iterm1.getSize() +","+ iterm1.getPrize() );
           for(Clothing item :c1.getIterms()){
    //System.out.println(" Iterms :" + item.getDescription() +","+ item.getSize() +","+ item.getPrize() ); 
    System.out.println(" Iterms :" + item);
       }
       
          int average=0, count =1;
         for(Clothing item: c1.getIterms()) {
             if(item.getSize().equals("L")){////
             count++;
             average += item.getPrize();
         }
         }
         
         try {
         average = average/count;
         System.out.println("Average  is :" + average +" count is "+ count );
        
         }
         catch(ArithmeticException e) { 
         System.out.println(" dont devide by Zero"); 
         
         }
         Arrays.sort(c1.getIterms(), count, count);
     for(Clothing item :c1.getIterms()){
    //System.out.println(" Iterms :" + item.getDescription() +","+ item.getSize() +","+ item.getPrize() ); 
    System.out.println(" Iterms :" + item);
       }
         
         
         
         
         
    /*  for(Clothing  list : c2.getcustomerslist){
    System.out.println(" our customers :" +  c2.getName() ); 
       }   
          
          
          
      System.out.println("Total is  :"+ Total); 
      
      
      
      
      
      
      
          
    }
         }
          //System.out.println("Customer is :" + iterm3.getDescription() +","+ iterm3.getSize()+","+ iterm3.getPrize() );
          //System.out.println("Item 2 :" + iterm2.description +","+ iterm2.size+","+ iterm2.prize );
          
        //  Total = (iterm1.getPrize() + iterm2.getPrize() *2)*(1+Tax);
    
        //int measurement = 3;
        
       /*   int measurement = 3;
          switch (measurement)
                  {
              case 1: case 2: case 3:
                      c1.setSize("S");
                      break;
              case 4 :case 5: case 6: 
                      c1.setSize("M");
                      break;
                  case 7: case 8: case 9:
                      c1.setSize("L");
                      break;
                  default:
                      c1.setSize("XL");
                      
                     
          }  
          for(Clothing item : Iterms)
          {  
          if(c1.getSize().equals(item.getSize()))  
              System.out.println("Item  :" + item.getDescription() +","+ item.getSize()+","+ item.getPrize() );
             Total = Total + item.getPrize();//i want to avoid hard coding and loop inside the array clothing
             if(Total>15)
             {break;
                     }
    }*/
          
          }        
          

}