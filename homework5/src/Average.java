import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Average
{
    private final int [] data = new int[5];
    private double mean;
    public Average()
    {
        System.out.println("Please enter five scores into the array");
        for(int i = 0;i<5;i++)
        {
            Scanner scanner = new Scanner(System.in);
            data[i]=scanner.nextInt();
        }
        selectionSort();
        calculateMean();
    }
    public void calculateMean()
    {
        double sum = 0;
       for(int i = 0;i < data.length;i++)
       {
           sum += data[i];
       }
        mean=sum/data.length;
    }
    public String toString()
    {
      return Arrays.toString(data)+" "+mean;
    }
    public void selectionSort()
    {
        int k;
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4-i;j++)
            {
                if(data[j]<data[j+1])
                {
                    k=data[j];
                    data[j]=data[j+1];
                    data[j+1]=k;
                }
            }
        }
    }
}