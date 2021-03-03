class Main {
  public static void main(String[] args) 
  {
   //Number of checkpoints in 4 locations
    int checkpoints = locations(4);
    System.out.println(checkpoints);
   
  }

  public static int locations(int number)
  {
    if (number > 0)
    {
      return number + locations(number - 6 / 3);
      //Formula to find how many checkpoints
    }else{
      return 0;
    }
  }
}