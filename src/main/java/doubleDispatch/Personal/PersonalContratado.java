package doubleDispatch.Personal;

import doubleDispatch.Exception.BusinessException;
import doubleDispatch.Busqueda.BusquedaEspecial;
import doubleDispatch.Busqueda.BusquedaExterna;
import doubleDispatch.Busqueda.BusquedaInterna;

public class PersonalContratado extends Empleado {

  @Override
  public void validarPostulacionBusquedaInterna(BusquedaInterna interna) {
    if (!getSector().equals(interna.getSector())) {
      throw new BusinessException(
          "El postulante pertenece al sector " +  getSector() + " y la búsqueda es para " + interna.getSector()
      );
    }

  }

  @Override
  public void validarPostulacionBusquedaExterna(BusquedaExterna externa) {
    if (this.getFechaAntiguedad() > 1) {
      throw new BusinessException(
          "El postulante no tiene menos de un año de antigüedad"
      );
    }
  }

  @Override
  public void validarPostulacionBusquedaEspecial(BusquedaEspecial especial) {
    if (this.cantidadPersonasACargo() < 20) {
      throw new BusinessException("El postulante no tiene más de 20 personas a cargo");
    }
  }
}
