package ddd.projectmanagement.staffing.infrastructure;

import ddd.projectmanagement.staffing.domain.ProjektService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjektRest {

  private final ProjektService projektService;

  public ProjektRest(ProjektService projektService) {
    this.projektService = projektService;
  }

  @GetMapping("/api/projekte")
  public List<ProjektDto> getProjekte() {
    return projektService.rufeProjekteAb().stream().map(ProjektDto::new)
        .collect(Collectors.toList());
  }
}
