import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServiceTest {

    Car car;
    Motorcycle motorcycle;
    Plane plane;

    @BeforeEach
    public void setUp(){
        car  = new Car("Mercedes", 5, 4, "Automatic");
        motorcycle = new Motorcycle("Royal Enfield", 2, 2, true);
        plane = new Plane("Aeroplane", 6, 4, 1500);
    }

    @Test
    public void canCheckEngine(){
        assertThat(car.checkEngine()).isEqualTo(true);
    }

    @Test
    public void canCheckWiring(){
        assertThat(plane.checkWiring()).isEqualTo(true);

    }

    @Test
    public void canSellingTires(){
        assertThat(motorcycle.sellingTires(4)).isEqualTo(4);
    }
}
