package ddd.projectmanagement.staffing.domain;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProjektService {

  private final ProjektRepository projektRepository;

  public ProjektService(ProjektRepository projektRepository) {
    this.projektRepository = projektRepository;
  }

  public List<Projekt> rufeProjekteAb() {
    return projektRepository.alleProjekte();
  }
}
