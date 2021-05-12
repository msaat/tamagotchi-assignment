public class Ponytchi{

  private String name;
  private double food;
  private double sleep;
  private double exercise;


  /* 
  this class is for the second type of pet, Ponytchi, and works nearly identically to the Mametchi class, with idential methods, but with different increments for daily losses in stats and amount gained when fed/napped/worked out. It also works with doubles (of 2 decimal places) instead of integers.
  */

  public Ponytchi(String n, double f, double s, double e){
    name = n;
    food = f;
    sleep = s;
    exercise = e;
  }

  public void setName(String newName){
    name = newName;
  }

  public String getName(){
    return name;
  }
  
  public double getFood(){
    return food;
  }

  public double getSleep(){
    return sleep;
  }

  public double getExercise(){
    return exercise;
  }

  public double feed(){
    food = food + 7.75;
    return food;
  }

  public double nap(){
    sleep = sleep + 6.5;
    return sleep;
  }

  public double workOut(){
    exercise = exercise + 7.25;
    return exercise;
  }

  public double dayPassesFood(){
    food = food - 4.5;
    return food;
  }

  public double dayPassesSleep(){
    sleep = sleep - 3.25;
    return sleep;
  }

  public double dayPassesExercise(){
    exercise = exercise - 3.5;
    return exercise;
  }

  public String toString() {
      return name + " has " + food + " food points " + sleep + " sleep points " + exercise + " exercise points";
   }



  void sort(double arr[]){ 
  int n = arr.length; 
  for (int i = 0; i < n-1; i++){ 
    for (int j = i+1; j < n; j++){ 
    int min_idx = i; 
    if (arr[j] < arr[min_idx]) 
    min_idx = j; 
    double temp = arr[min_idx]; 
    arr[min_idx] = arr[i]; 
    arr[i] = temp; 
    } 
    }
  }

}