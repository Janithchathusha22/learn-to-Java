import java.util.*;

class Example2{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Number 1:");
      int number = input.nextInt();

          int total=0;
          int max=number;
          int min=number;
           
           for(int i = 0; i<5;i++){
             System.out.println("Enter Number"+(i+1)+":");
             number=input.nextInt();

             total=total+number;

            
             if(max<number){
                max=number;

               
              }
           if(min > number){
              min=number;
            }
           
       

             
               
        }
        System.out.println();
        System.out.println("Total is :"+total);

        double average= (double)total/5;
        System.out.println("Average is :"+average);
        
        System.out.println("Maximum Number is"+ max);
        System.out.println("Minum Number is"+ min);

       


     }



}