package ddd.projectmanagement.staffing.domain;

public enum Ausschreibungszustand {
  // Innerhalb Bewerbungsphase
  OFFEN,
  VORSCHLAG_ANGEBOTEN,
  UNBESTAETIGTE_ZUSAGE,
  // Außerhalb Bewerbungsphase,
  BESETZT,
  VERLOREN,
  ARBEITEN_ABGESCHLOSSEN
}
