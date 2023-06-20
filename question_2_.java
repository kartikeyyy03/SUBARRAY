
import java.util.Scanner;

public class question_2_{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        

        System.out.println("Enter the number of beggars: ");

        int N=sc.nextInt();
        int[] array1=new int[N];

        for(int i=0;i<N;i++){
            array1[i]=0;
        }

        System.out.println("Enter the number of devotees: ");
        int rows=sc.nextInt();
        
                int[][] array2=new int[rows][3];
        
                for(int i=0;i<rows;i++){
                    System.out.println("Enter the start and end index of beggars and the number of coins donated by number " + (i+1) +" "+"devotee" );
                    for(int j=0;j<3;j++){
                        int element=sc.nextInt();
                        array2[i][j]=element;
                    }
                }
                for(int i=0;i<array2.length;i++){
        
                   
                for(int j=array2[i][0]-1;j<=array2[i][1]-1;j++){
                array1[j]=array1[j]+array2[i][2];
        
                }
            }
            System.out.println("The final amount of money in each beggar's pot at the end of the day is: ");
            for(int i=0;i<N;i++){
                System.out.print(array1[i]+" ");
            }
                    
                    
        }
        
        }
        
        
        
        
                
                    
        
        
                
                
        
        
        
        
        
                

        
        
        
        
