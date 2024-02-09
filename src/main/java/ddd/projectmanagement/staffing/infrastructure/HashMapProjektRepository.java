package ddd.projectmanagement.staffing.infrastructure;

import ddd.projectmanagement.staffing.domain.Projekt;
import ddd.projectmanagement.staffing.domain.ProjektRepository;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class HashMapProjektRepository implements ProjektRepository {

  private HashMap<UUID, Projekt> projekte = new HashMap<>();

  @Override
  public Projekt projektNachId(UUID projektId) {
    return null;
  }

  @Override
  public void projektSpeichern(Projekt projekt) {

  }

  @Override
  public List<Projekt> alleProjekte() {
    return projekte.values().stream().toList();
  }

  @Override
  public List<Projekt> projekteMitOffenerAusschreibung() {
    return null;
  }
}
