import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
How to play: Basically you pick your pet and you 'take care' of it for 10 days. Each day you get to choose if you want your pet to eat, sleep, or exercise. That stat will increase but the other 2 will decrease at a steady rate (rate is different depending on pet type). Instructions as you run the game are pretty clear.

How to win/lose: If at the end of the 10 days and of your stats are less than 0, you lose. If you keep your stats up / get all your stats back up to above 0 by the end of the 10 days, you win.
*/



class Main {
//three data types used, double, int, and String #1
/*This class is where the game is played out.
It starts off by asking you to pick the pet type you want, and then you can name your pet. Then for 10 days (10 iterations of the for loop), you can play the game as described above.
*/
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Welcome to Maria's kind of Tamagotchi-inspired game! The goal is to keep your pet alive (all stats above 0) for 10 days! Enter 1 to pick Mametchi and 2 to pick Ponytchi!");
    int typeSelector = myObj.nextInt();  

//an if statement #10
    if (typeSelector == 1){
      //a function of the math class #9
      Mametchi m = new Mametchi("", (int)(((Math.random() * 30)+10 + 1)), (int)(((Math.random() * 30)+10 + 1)), (int)(((Math.random() * 30)+10 + 1)));
      System.out.println("enter a name for your Mametchi!");
      Scanner myO = new Scanner(System.in);
      String chosenname = myO.nextLine();  
      m.setName(chosenname);
      System.out.println(m);
      
      
        for (int day = 1; day < 11; day ++){
          System.out.println("today is day "+ day);
          m.dayPassesFood();
          m.dayPassesSleep();
          m.dayPassesExercise();
          System.out.println("feed, sleep, or exercise today? (type 'feed', 'sleep', or 'exercise')");
          Scanner my = new Scanner(System.in);
          String actionn = my.nextLine();  
          //a nested if statement #11
          if (actionn.equals("feed")) {
            m.feed();
          }
          else if (actionn.equals("sleep")){
            m.nap();
          }
          else{
            m.workOut();
          }
          System.out.println(m);
        }

        //this sorts food, sleep, and exercise stats into a list from smallest to greatest, making the smallest value easy to retrieve as it is just the 0th index of the list
        int[ ] arr = {m.getFood(),m.getSleep(),m.getExercise()};
        m.sort(arr);
        //this converts the above array to an arraylist
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        for (int z: arr){
          arrli.add(z);
        }
        //this checks to see whether or not the smallest stat is over 0 (if the smallest stat is, the others will be too)
        System.out.println("the lowest stat that " + m.getName() + " had was " + arrli.get(0));
        if (arrli.get(0) > 0){
          System.out.println("that's greater than 0, you win!");
        }
        else{
          System.out.println("That's less than or equal to 0, you lose :(");
        }


    }
    //this code functions the same way as the above code but for the other type of pet
    else if (typeSelector == 2){
      Ponytchi p = new Ponytchi("", (double)(int)(((Math.random() * 30)+10 + 1)), (double)(int)(((Math.random() * 30)+10 + 1)), (double)(int)(((Math.random() * 30)+10 + 1)));
      System.out.println("enter a name for your Ponytchi!");
      Scanner myO = new Scanner(System.in);
      String chosenname = myO.nextLine();  
      p.setName(chosenname);
      System.out.println(p);

    //a for loop #17
    for (int day = 1; day < 11; day ++){
          System.out.println("today is day "+ day);
          p.dayPassesFood();
          p.dayPassesSleep();
          p.dayPassesExercise();
          System.out.println("feed, sleep, or exercise today? (type 'feed', 'sleep', or 'exercise')");
          Scanner my = new Scanner(System.in);
          String actionn = my.nextLine(); 
          //use of a string method from 2.7 #7 
          if (actionn.equals("feed")) {
            p.feed();
          }
          else if (actionn.equals("sleep")){
            p.nap();
          }
          else{
            p.workOut();
          }
          System.out.println(p);
        }

        double[ ] arr = {p.getFood(),p.getSleep(),p.getExercise()};
        p.sort(arr);

        ArrayList<Double> arrli = new ArrayList<Double>();
        //an array traversed by a for loop #23
        for (double z: arr){
          //use of an arraylist method #24
          arrli.add(z);
        }

        System.out.println("the lowest stat that " + p.getName() + " had was " + arrli.get(0));


        


        if (arrli.get(0) > 0){
          System.out.println("that's greater than 0, you win!");
        }
        else{
          System.out.println("That's less than or equal to 0, you lose :(");
        }

    }

  }

}