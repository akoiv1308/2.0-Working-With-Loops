// I realized that there're multiple ways to solve parts of the problem, especially Part One. Here are some of them: (but they are not fully completed) //
// 1 //
/*
    int i = 0;
    int a = 0;
    int b = 0;
    while (a < 10) {
      while (i < 10) {
        while (b < 10) {
          System.out.print(i);
          i++;
          System.out.print(a);
          a++;
          System.out.print(b);
          b++;
        }
      }
    }
*/
// 2 //
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

  ArrayList<Integer> n = new ArrayList<>();
    n.add(0);
    n.add(1);
    n.add(2);
    n.add(3);
    n.add(4);
    n.add(5);
    n.add(6);
    n.add(7);
    n.add(8);
    n.add(9);
 for (int i = 0; i < 3; i++) {
  System.out.println(n.toString().replace("[","").replace("]","").replace(",",""));
*/
// Part 2 //
/*
List<String> reverse = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
Collections.reverse(reverse);
 for (int i = 0; i < 3; i++) {
System.out.println(reverse.toString().replace("[","").replace("]","").replace(",",""));
*/

// num = number //
// rep = repeat //

class Main {
// In order for static variables to work independently, I set up variables and assigned them to each static method //
  public static void main(String[] args) {
    // Creating variables (integers) for further use in static methods. I planned it out beforhand by looking at the example given and deciding how many specific characteristics each part contains, such as: how many lines or the amount of repeated numbers,... so that it would be easier to code //
    int a = 10;
    int b = 3;
    partOne(a, b);
    int c = 0;
    int d = 5;
    partTwo(c, d);
    int e = 0;
    int f = 4;
    partThree(e, f);
  }
// First static method that will result in a 3 strings of numbers in increasing order, starting from 0 and ending with a 9, with a repition of 3 //
  public static void partOne(int a, int b) {
    // Used previously created integers, a and b, to simplify the code//
    System.out.print("Part One: \n");
    for(int line = 0; line < b; line++) {
// If b (3) is greater than int line, increase int line by one. This will create 3 lines/strings // 
      for(int num = 0; num < a; num++) {
// If a (10) is greater than int num, increase int number by one. As long as this statement is true, the for loop will execute each number int num has been. The loop will break once the number is greater than 9 //
        for(int rep = 0; rep < b; rep++)
// Again, this for loop is used to create 3 copies of each number in a single string //
          System.out.print(num);
// All necessary steps have been made, so the last thing to do is to print out on screen int num, so that it will print the result. However, it will remain on the same line. By using "println" we can seperate one string into three strings since the for loop will execute the code 3 times //
      }
      System.out.println();
    }
  }
// Second Static Method to Complete Part Two //
// This static method contains the same concept as the static method used before, however, instead of going in increasing order, this method does the opposite way (decreasing order). //
  public static void partTwo(int c, int d) {
    System.out.print("Part Two: \n");
    for(int line = 0; line < d; line++) {
      for(int num = 9; num > c; num--) {
// Integer num starts off as a number 9 and if the current state of that int is greater than already intially set int c, which is 0, the loop wil continue to repeat and decrease int num by one. Therefore, on the screen, the number will decrease //
        for(int rep = 0; rep < d; rep++)
// And numbers repeat 5 times now // 
          System.out.print(num);
      }
      System.out.println();
    }
  }
// Third Static Method for Part Three //
// This was a really challenging part to complete. Since the numbers were also in decreasing order, I used the same line of code for int num. The trickiest part of this task was to repeat the number as many times as it's value. To do that, I created 3rd seperate loop that would take the current value of int num and repeat it. //
 public static void partThree(int e, int f) {
    System.out.print("Part Three: \n");
    for(int line = 0; line < f; line++) {
      for(int num = 9; num > e; num--) {
        for(int rep = 0; rep < num; rep++) {
          System.out.print(num);
        }
      }
      System.out.println();
    }
  }
}
// The End //

