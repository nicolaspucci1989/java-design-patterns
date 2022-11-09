package doubleDispatch.Personal;

import doubleDispatch.Busqueda.BusquedaEspecial;
import doubleDispatch.Busqueda.BusquedaExterna;
import doubleDispatch.Busqueda.BusquedaInterna;

public abstract class Postulante {

  // Método default para poder compilar
//  public void validarPostulacion(Busqueda busqueda) {
//    throw new BusinessException("Debe utilizar un tipo de búsqueda específico");
//  }

  abstract public void validarPostulacionBusquedaInterna(BusquedaInterna interna);

  abstract public void validarPostulacionBusquedaExterna(BusquedaExterna externa);

  abstract public void validarPostulacionBusquedaEspecial(BusquedaEspecial especial);
}
