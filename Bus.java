class Bus{
  private String destination;
  private int number;
  private Passenger[] capacity;

  public Bus(String destination, int number){
    this.destination = destination;
    this.number = number;
    this.capacity = new Passenger[0];
  }
}
