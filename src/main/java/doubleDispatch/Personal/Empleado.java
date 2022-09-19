package doubleDispatch.Personal;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public abstract class Empleado extends Postulante{
  private Cargo cargo;
  private String sector = "";
  private LocalDate fechaDeIngreso = LocalDate.now();
  private List<Empleado> personasACargo = new ArrayList<>();

  public void agregarPersonasACargo(Empleado empleado) {
    personasACargo.add(empleado);
  }

  public long getFechaAntiguedad(LocalDate dia) {
    return ChronoUnit.YEARS.between(fechaDeIngreso, dia);
  }

  public long getFechaAntiguedad() {
    return getFechaAntiguedad(LocalDate.now());
  }

  public Integer cantidadPersonasACargo() {
    return personasACargo.size();
  }
}
