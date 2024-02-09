package ddd.projectmanagement.staffing.domain;

import java.time.OffsetDateTime;
import java.util.Objects;

public record Dauer(OffsetDateTime start, OffsetDateTime ende) {

  public boolean istInDauer(OffsetDateTime zeitpunkt) {
    return start.isBefore(zeitpunkt) && ende.isAfter(zeitpunkt);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Dauer dauer = (Dauer) o;

    if (!Objects.equals(start, dauer.start)) {
      return false;
    }
    return Objects.equals(ende, dauer.ende);
  }

  @Override
  public int hashCode() {
    int result = start != null ? start.hashCode() : 0;
    result = 31 * result + (ende != null ? ende.hashCode() : 0);
    return result;
  }
}
