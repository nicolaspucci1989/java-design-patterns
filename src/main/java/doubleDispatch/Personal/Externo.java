package doubleDispatch.Personal;

import doubleDispatch.Exception.BusinessException;
import doubleDispatch.Busqueda.BusquedaEspecial;
import doubleDispatch.Busqueda.BusquedaExterna;
import doubleDispatch.Busqueda.BusquedaInterna;

import java.util.ArrayList;
import java.util.List;

public class Externo extends Postulante{
  private final List<String> puestosAnteriores = new ArrayList<>();

  public void trabarDe(String puesto) {
    puestosAnteriores.add(puesto);
  }
  @Override
  public void validarPostulacionBusquedaInterna(BusquedaInterna interna) {
    throw new BusinessException("No puede postularse a búsquedas internas");
  }

  @Override
  public void validarPostulacionBusquedaExterna(BusquedaExterna externa) {
    // OK
  }

  @Override
  public void validarPostulacionBusquedaEspecial(BusquedaEspecial especial) {
    if (!puestosAnteriores.contains(especial.getPuesto())) {
      throw new BusinessException("Para poder postularse debe haber trabajado anteriormente en el mismo puesto");
    }
  }
}
