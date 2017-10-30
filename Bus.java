class Bus{
  private String destination;
  private int number;
  private Passenger[] passenger;

  public Bus(String destination, int number){
    this.destination = destination;
    this.number = number;
    this.passenger = new Passenger[0];
  }
  public String getDestination(){
    return this.destination;
  }
  public int getNumber(){
    return this.number;
  }
  public int count(){
    int count = 0;
    for(Passenger passenger : passenger){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

}
