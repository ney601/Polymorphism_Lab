import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorShopTest {

    MotorShop motorShop;

    @BeforeEach
    public void setUp(){
        motorShop = new MotorShop();
    }

    @Test
    public void canCountVehicles() {
        assertThat(motorShop.countVehicles()).isEqualTo(0);
    }

    @Test
    public void canAddVehicle(){
        Vehicle car = new Car("Mercedes", 5, 4, "Automatic");
        Vehicle motorcycle = new Motorcycle("Royal Enfield", 2,2, true);
        motorShop.addVehicle(car);
        motorShop.addVehicle(motorcycle);
        motorShop.removeVehicle(motorcycle);
        assertThat(motorShop.countVehicles()).isEqualTo(1);
    }

}
