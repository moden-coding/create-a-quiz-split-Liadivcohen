import java.util.*;
    //The problem should include the split method. You might also add in any String methods
    //or array skills. Think about Practice Quiz problem or CodingBat problems.
    //Create a question AND a solution to that question

    //Give instructions for your problem below:

public class App {
    public static void main(String[] args) throws Exception {
        //Write setup code (if needed)
        Scanner reader = new Scanner(System.in);
        int touchdowns = 0;
int touchdowns2 = 0;
int sum = 0;
int count =0;
String name = " ";
String name2 = " ";

while (true) {
String input = reader.nextLine();
if (input.equals("")) {
break;
}
String[] parts = input.split(",");
sum = sum + Integer.valueOf(parts[1]);
count = count +1;
touchdowns = Integer.valueOf(parts[1]);
if (touchdowns > touchdowns2) {
touchdowns2 = touchdowns;
name = parts[0];
}
else if(touchdowns < touchdowns2) {
touchdowns2 = touchdowns;
name2 = parts[0];

}
}
if (count > 0){
System.out.println("The average total touchdowns is " + (1.0* sum/count));
}

System.out.println("Name of the highest total touchdowner: " + name);
System.out.println("Name of the lowest total touchdowner: " + name2);

}

        





        // ######################################
        // Leave room to complete code below
    }

