import java.util.Scanner;

public class question_1{


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int N=sc.nextInt();
        int[] array=new int[N];

        System.out.println("Enter the Array elements ");
        for(int i=0;i<N;i++){
            int element=sc.nextInt();
            array[i]=element;
            
        }

        



        
        
        
        int sum=0;
        for(int i=0;i<N;i++){

            for(int j=i;j<N;j++){
                
                for(int k=i;k<=j;k++){

                    sum=sum+array[k];
                    

                    
                    
                }
                
                
                
                
                
                
                
                
            }
            
            
            
        }
        System.out.println("The sum of all the subarrays is "+ sum);

        


    }
}