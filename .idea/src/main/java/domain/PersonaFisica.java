package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "personas_fisicas")
public class PersonaFisica {
  @Column
  private String apellido;
  @Column
  private String email;
  //ACA VA UN CONVERTER TODO
  @Transient
  private LocalDate fechaNacimiento;
  @Column
  private String nombre;
  @Column
  private String telefono;

  public String emailPreferido(){return null;}
  public String nombre(){ return null;}
  public String telefonoPreferido(){ return null;}


}
