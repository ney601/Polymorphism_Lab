import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("Mercedes", 5, 4, "Automatic");
    }

    @Test
    public void canOpenTrunk(){
        assertThat(car.openTrunk()).isEqualTo("I can open the trunk.");
    }

    @Test
    public void canAddCarPlay(){
        assertThat(car.addCarPlay()).isEqualTo("I can add Car Play!");
    }

    @Test
    public void canAccelerate(){
        assertThat(car.accelerate()).isEqualTo("Car is accelerating!");
    }

    @Test
    public void canProvideDescriptionOfVehicle(){
        assertThat(car.descriptionOfVehicle()).isEqualTo("This is a Automatic Mercedes with 4 wheels and seating for 5 people.");
    }
}
