package ddd.projectmanagement.staffing.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public record Geld(String waehrung, BigDecimal menge) {

  public Geld(String waehrung, BigDecimal menge) {
    this.waehrung = waehrung;
    this.menge = menge.setScale(2, RoundingMode.HALF_UP);
  }

  public Geld multiplizieren(Stunde dauer) {
    return new Geld(waehrung(), menge().multiply(BigDecimal.valueOf(dauer.menge())));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Geld geld = (Geld) o;

    if (!Objects.equals(waehrung, geld.waehrung)) {
      return false;
    }
    return Objects.equals(menge, geld.menge);
  }

  @Override
  public int hashCode() {
    int result = waehrung != null ? waehrung.hashCode() : 0;
    result = 31 * result + (menge != null ? menge.hashCode() : 0);
    return result;
  }
}
