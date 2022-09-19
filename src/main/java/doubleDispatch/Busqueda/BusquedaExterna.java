package doubleDispatch.Busqueda;

import doubleDispatch.Personal.Postulante;

public class BusquedaExterna extends Busqueda{
  @Override
  public void validarPostulacion(Postulante postulante) {
    postulante.validarPostulacionBusquedaExterna(this);
  }
}
