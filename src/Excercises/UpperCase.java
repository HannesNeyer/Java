package Excercises;

public class UpperCase
{
    public static void main(String[] args){
        String Input ="HSOwedshHhdodsH";
        char[] arrayInput = Input.toCharArray();

        String Output_Gross ="";
        String Output_Klein ="";

        for(int i = 0; i < arrayInput.length; i++){
            if(Character.isUpperCase(arrayInput[i])){
                Output_Gross += arrayInput[i];
            }
            else
            {
                Output_Klein += arrayInput[i];
            }
        }
        System.out.println(Output_Gross);
        System.out.println(Output_Klein);
    }
}
