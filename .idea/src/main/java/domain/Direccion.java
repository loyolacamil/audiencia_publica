package domain;

import javax.persistence.*;

@Entity
@Table(name = "Direcciones")

public class Direccion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "altura")
  private Integer altura;
  @Column(name = "calle")
  private String calle;
  @Column(name = "localidad_barrio")
  private String localidad_barrio;
  @Column(name = "municipio_comuna")
  private String municipio_comuna;
  @Column(name = "provincia")
  private String provincia;

  public String leyendaCompleta(){
    //TODO
    return null;
  }
}
