class Bus{
  private String destination;
  private int number;
  private Passenger[] passenger;

  public Bus(String destination, int number){
    this.destination = destination;
    this.number = number;
    this.passenger = new Passenger[40];
  }
  public String getDestination(){
    return this.destination;
  }
  public int getNumber(){
    return this.number;
  }
  public int passengerCount(){
    int count = 0;
    for(Passenger passenger : passenger){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == this.passenger.length;
  }
  public void addPassenger(Passenger passenger){
    if(isBusFull()){
      return;
    }
    int passengerCount = this.passengerCount();
    //Passenger passenger
    //Passenger[] passenger
    this.passenger[passengerCount] = passenger;
  }
}
