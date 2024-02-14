import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    public void setUp() {
        plane = new Plane("Aeroplane", 6, 4, 1500);
    }

    @Test
    public void canTakeOff(){
        assertThat(plane.takeOff()).isEqualTo("I can take off!");
    }

    @Test
    public void canLand(){
        assertThat(plane.land()).isEqualTo("I can land!");
    }

    @Test
    public void canProvideDescriptionOfVehicle(){
        assertThat(plane.descriptionOfVehicle()).isEqualTo("This is an Aeroplane with 4 wheels and seating for 6 people. It can also fly up to a maximum altitude of 1500m.");
    }

}
