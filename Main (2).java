class Main{ 
  public static void sun() {
    System.out.print("HOT!");
  }
  public static void Summer( int temp) {
    if(temp > 100) { //changed temp
    System.out.print("It's a hot day");
    temp -= 1;
    Summer( temp );
  }
}
public static void main(String[] args) {
  Summer(91);
  sun();
  }
}
