import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  Passenger passenger;

  @Before

  public void before() {
    this.bus = new Bus("Ocean Terminal", 25);
    this.passenger = new Passenger();
  }
}
