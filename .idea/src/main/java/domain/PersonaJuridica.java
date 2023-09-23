package domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class PersonaJuridica {
  @ElementCollection
  @CollectionTable(name = "emails_personas_juridicas", joinColumns = @JoinColumn (name = "persona_juridia_id"))
  @Column(name = "email")
  private List<String> emailsDeContacto;
  //SE NECESITA UN CONVERTER CREO TODO
  @Transient
  private LocalDate fechaConstitucion;
  @Column
  private String razonSocial;
  @CollectionTable(name = "telefonos_personas_juridicas", joinColumns = @JoinColumn (name = "persona_juridia_id"))
  @Column(name = "telefono")
  private List<String> telefonosDeContacto;

  public PersonaJuridica(){

  }
  public String emailPreferido(){return null;}
  public String nombre(){ return null;}
  public String telefonoPreferido(){ return null;}
}
