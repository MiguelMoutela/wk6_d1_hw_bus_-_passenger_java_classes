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

  @Test
  public void hasDestinantion() {
    assertEquals("Ocean Terminal", bus.getDestination());
  }
  @Test
  public void hasNumber() {
    assertEquals(25, bus.getNumber());
  }
  @Test
  public void passengerCount() {
    assertEquals(0, bus.passengerCount());
  }
  @Test
  public void passengerCanBoard() {
    bus.addPassenger(passenger);
    assertEquals(1, bus.passengerCount());
  }
}
