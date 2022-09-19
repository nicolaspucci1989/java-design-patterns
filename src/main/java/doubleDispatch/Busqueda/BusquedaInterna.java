package doubleDispatch.Busqueda;

import doubleDispatch.Personal.Postulante;

public class BusquedaInterna extends Busqueda{

  @Override
  public void validarPostulacion(Postulante postulante) {
    postulante.validarPostulacionBusquedaInterna(this);
  }
}
