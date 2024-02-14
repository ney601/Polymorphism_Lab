import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    public void setUp(){
            motorcycle = new Motorcycle("Royal Enfield", 2, 2, true);
    }

    @Test
    public void canPerformWheelie(){
        assertThat(motorcycle.performWheelie()).isEqualTo("I can perform a wheelie");
    }

    @Test
    public void canPerformStoppie(){
        assertThat(motorcycle.performStoppie()).isEqualTo("I can perform a stoppie");
    }

    @Test
    public void canProvideDescriptionOfVehicle(){
        assertThat(motorcycle.descriptionOfVehicle()).isEqualTo("This is a Royal Enfield with 2 wheels, seating for 2 people and it is true that it has a side car.");
    }
}
