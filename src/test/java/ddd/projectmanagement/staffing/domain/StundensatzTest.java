package ddd.projectmanagement.staffing.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StundensatzTest {

  @Test
  void berechneAufwaende() {
    Geld geld = new Geld("EUR", BigDecimal.valueOf(46.50));
    Stunde dauer = new Stunde(8.0);

    Geld aufwaende = new Stundensatz(geld).berechneAufwaende(dauer);

    Assertions.assertEquals(new Geld("EUR", BigDecimal.valueOf(372.0)), aufwaende);
  }
}