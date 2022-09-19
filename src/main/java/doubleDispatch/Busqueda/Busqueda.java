package doubleDispatch.Busqueda;

import doubleDispatch.Personal.Postulante;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Busqueda {
  private List<Postulante> postulantes;
  private Integer remuneracion = 0;
  private String puesto = "";
  private String sector = "";

  public boolean estaPostulado(Postulante postulante) {
    return postulantes.contains(postulante);
  }

  public void agregarPostulante(Postulante postulante) {
    postulantes.add(postulante);
  }

  public void postular(Postulante postulante) {
    validarPostulacion(postulante);
    agregarPostulante(postulante);
  }

  public abstract void validarPostulacion(Postulante postulante);
}