import java.util.*;

class Example1{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);

        int max=0;
        int min=0;
        int Avarage=0;
        int total=0;

           
           for(int i = 0; i<5;i++){
             System.out.println("Enter Number"+(i+1)+":");
             int number=input.nextInt();
             total=i+number;

            
             if(max<number && min>number){
                max=number;
                min=number;
               
              }
           
          }

             
               
        }
        System.out.println("Maximum Number is"+ max);
        System.out.println("Minum Number is"+ min);
        System.out.print("total Number is");
        



          



     }



}