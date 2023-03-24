/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Admin
 */
public class Clothing {
   private String  description;
    private String  size = "M";
     private double  prize;
  private   final double min_prize= 10.0;
  public   final double tax= 0.2;   

    public Clothing(String description, double prize, String size) {
        this.description = description;
        this.prize = prize;
        this.size = size;
    }
  
  
  

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrize() {
        return prize*(tax+1);
    }

    public void setPrize(double prize) {
        this.prize = (prize<min_prize)? min_prize:prize;
    }
}
