package domain;

import javax.persistence.*;

@MappedSuperclass
public abstract class Persona implements Contactable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;
  @Column(name = "cuit_cuil")
  private String cuit_cuil;
  @OneToOne
  @JoinColumn(name = "direccion_id", referencedColumnName = "id")
  private Direccion direccion;
  @Convert(converter = MedioDeComunicacionConverter.class)
  private MedioDeComunicacion medio_preferido;

  public String nombre(){
    //TODO
    return null;
  }
}
