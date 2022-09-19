package doubleDispatch.Personal;

import doubleDispatch.Busqueda.BusquedaEspecial;
import doubleDispatch.Busqueda.BusquedaExterna;
import doubleDispatch.Busqueda.BusquedaInterna;

public abstract class Postulante {

  abstract public void validarPostulacionBusquedaInterna(BusquedaInterna interna);

  abstract public void validarPostulacionBusquedaExterna(BusquedaExterna externa);

  abstract public void validarPostulacionBusquedaEspecial(BusquedaEspecial especial);
}
