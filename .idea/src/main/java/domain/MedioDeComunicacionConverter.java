package domain;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MedioDeComunicacionConverter implements AttributeConverter<MedioDeComunicacion, String>{
  @Override
  public String convertToDatabaseColumn(MedioDeComunicacion medioDeComunicacion) {
    String medio;
    Email email = new Email();
    Telegram telegram = new Telegram();
    if (medioDeComunicacion.getClass().equals(email.getClass())) {
      medio = "EMAIL";
    }
    else if (medioDeComunicacion.getClass().equals(telegram.getClass())) {
      medio = "TELEGRAM";
    }
    else medio = "WPP";
    return medio;
  }

  @Override
  public MedioDeComunicacion convertToEntityAttribute(String medio) {
    MedioDeComunicacion medioDeComunicacion;
    if (medio == "EMAIL"){
      medioDeComunicacion = new Email();
    } else if (medio == "TELEGRAM") {
      medioDeComunicacion = new Telegram();
    } else medioDeComunicacion = new Whatsapp();
    return medioDeComunicacion;
  }
}
}
