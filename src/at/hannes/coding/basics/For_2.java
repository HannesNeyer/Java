package at.hannes.coding.basics;

public class For_2
{
    public static void main(String[] args)
    {
        int summ = 0;
        for(int i = 0; i <= 1000; i=i+2)
        {
            summ += i;
        }
        System.out.println(summ);
    }
}
