import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Decor {
    //Definition d'une propriété pour l'attribut image (utile pour le binding plus tard)
    private  StringProperty image = new SimpleStringProperty();

    public String getImage(){return image.get();}
    public void setToto(String value){image.set(value);}

    public StringProperty imageProperty(){return image;}

}
