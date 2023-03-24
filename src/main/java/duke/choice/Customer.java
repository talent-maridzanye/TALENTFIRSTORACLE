/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Admin
 */
public class Customer {
    
    private String name ;
    private String size;
    
    private Clothing [] items ;

    public Customer(String name, int measurement ) {
        this.name = name;
        setSize(measurement) ;
    }
    
    
    
    public  void addItems(Clothing [] someitems){
        items = someitems;
    }
    public Clothing [] getIterms(){
            return items;
    }
    public double getTotalclothingcost(){
         for(Clothing item : items)
          {  
          if(c1.getSize().equals(item.getSize()))  
              System.out.println("Item  :" + item.getDescription() +","+ item.getSize()+","+ item.getPrize() );
             Total = Total + item.getPrize();//i want to avoid hard coding and loop inside the array clothing
             if(Total>15)
             {break;
                     }
    } 
        
        
    }
            
    public String getName() {
        return name;
    }

   public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement){
        
          switch (measurement)
                  {
              case 1: case 2: case 3:
                     setSize("S");
                      break;
              case 4 :case 5: case 6: 
                      setSize("M");
                      break;
                  case 7: case 8: case 9:
                     setSize("L");
                      break;
                  default:
                      setSize("XL");
                      
        
    }
    }}

