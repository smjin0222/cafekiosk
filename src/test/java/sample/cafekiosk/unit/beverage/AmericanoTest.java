package sample.cafekiosk.unit.beverage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();
        // assertEquals("아메리카노", americano.getName());
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();
        // assertEquals(4000, americano.getPrice());
        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}