package doubleDispatch.Personal;

import doubleDispatch.Exception.BusinessException;
import doubleDispatch.Busqueda.BusquedaEspecial;
import doubleDispatch.Busqueda.BusquedaExterna;
import doubleDispatch.Busqueda.BusquedaInterna;

public class PersonalPlanta extends Empleado {
  public Integer sueldo() {
    return getCargo().getSueldo();
  }

  @Override
  public void validarPostulacionBusquedaInterna(BusquedaInterna interna) {
    // OK
  }

  @Override
  public void validarPostulacionBusquedaExterna(BusquedaExterna externa) {
    throw new BusinessException("Un empleado de planta no puede postularse a una búsqueda externa");
  }

  @Override
  public void validarPostulacionBusquedaEspecial(BusquedaEspecial especial) {
    if (especial.getRemuneracion() < this.sueldo()) {
      throw new BusinessException("La remuneración de la búsqueda debe superar el sueldo actual para postularse a una búsqueda especial");
    }
    if (this.cantidadPersonasACargo() < 10) {
      throw new BusinessException("Debe tener al menos 10 personas a cargo para postularse a una búsqueda especial");
    }
  }
}
