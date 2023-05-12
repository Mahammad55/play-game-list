import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        List<String> arrQuestion=new ArrayList<>();
        arrQuestion.add("How many seconds are in a minute?");
        arrQuestion.add("Where s the capital of Turkey");
        arrQuestion.add("At what temperature does the water boil?");
        arrQuestion.add("What city contains the Eiffel Towel?");
        arrQuestion.add("Which goes make the sound ridiculous?");

        List<String> arrAnswer=new ArrayList<>();
        arrAnswer.add("60");
        arrAnswer.add("Ankara");
        arrAnswer.add("100");
        arrAnswer.add("Paris");
        arrAnswer.add("Helium");

        List<String> array1=new ArrayList<>();
        array1.add("45");
        array1.add("100");
        array1.add("60");
        array1.add("78");
        array1.add("0");

        List<String> array2=new ArrayList<>();
        array2.add("Ankara");
        array2.add("Lima");
        array2.add("London");
        array2.add("Baku");

        List<String> array3=new ArrayList<>();
        array3.add("100");
        array3.add("0");
        array3.add("50");
        array3.add("90");

        List<String> array4=new ArrayList<>();
        array4.add("Sydney");
        array4.add("Los Angeles");
        array4.add("New York City");
        array4.add("Paris");

        List<String> array5=new ArrayList<>();
        array5.add("Helium");
        array5.add("Oxygen");
        array5.add("Carbon");
        array5.add("Nitrogen");
    }
}