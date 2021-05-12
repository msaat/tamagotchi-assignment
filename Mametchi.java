public class Mametchi{

  private String name;
  private int food;
  private int sleep;
  private int exercise;

/*
this class is for the first type of pet, a Mametchi
*/


//a constructor #19
//this sets up objects of the Mametchi class as having 4 attributes: name, food stat, sleep stat, exercise stat
  public Mametchi(String n, int f, int s, int e){
    name = n;
    food = f;
    sleep = s;
    exercise = e;
  }

//method with parameters #4
//setter method used so that the user can name their pet
  public void setName(String newName){
    name = newName;
  }

  //a getter method for name, used in to-stringing out the object
  public String getName(){
    //a return statement #5
    return name;
  }
  
  //a method without parameters #3
  //a getter method for food, used in adding food to an array
  public int getFood(){
    return food;
  }

  //an accessor method #20
  //a getter method for sleep, used in adding sleep to an array
  public int getSleep(){
    return sleep;
  }

  //a getter method for exercise, used in adding exercise to an array
  public int getExercise(){
    return exercise;
  }

  //used so that the user can feed their pet (raise food stat)
  public int feed(){
    food = food + 9;
    return food;
  }

  //used so that the user can let their pet sleep (raise sleep stat)
  public int nap(){
    sleep = sleep + 9;
    return sleep;
  }

  //used so that the user can ket their pet exercise (raise exercise stat)
  public int workOut(){
    exercise = exercise + 9;
    return exercise;
  }

  //the daily decrease of the food stat
  public int dayPassesFood(){
    food = food - 5;
    return food;
  }

  //the daily decrease of the sleep stat
  public int dayPassesSleep(){
    sleep = sleep - 5;
    return sleep;
  }

  //a mutator method 21
  //the daily decrease of the exercise stat
  public int dayPassesExercise(){
    exercise = exercise - 5;
    return exercise;
  }

  //string concatenation #6
  //used so that the user can know how much of each stat their pet has
  public String toString() {
      return name + " has " + food + " food points " + sleep + " sleep points " + exercise + " exercise points";
   }

  //a sorting algorithm #25
  //used to retrieve smallest stat by sorting stats from lowest to highest and picking the first item in the array
  void sort(int arr[]){ 
  int n = arr.length; 
  for (int i = 0; i < n-1; i++){ 
    for (int j = i+1; j < n; j++){ 
    int min_idx = i; 
    if (arr[j] < arr[min_idx]) 
    min_idx = j; 
    int temp = arr[min_idx]; 
    arr[min_idx] = arr[i]; 
    arr[i] = temp; 
    } 
    }
  }

}