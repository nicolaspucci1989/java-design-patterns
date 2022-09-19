package doubleDispatch.Busqueda;

import doubleDispatch.Personal.Postulante;

public class BusquedaEspecial extends Busqueda{
  @Override
  public void validarPostulacion(Postulante postulante) {
    postulante.validarPostulacionBusquedaEspecial(this);
  }
}
