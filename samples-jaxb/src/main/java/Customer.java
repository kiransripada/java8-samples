
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    public List<ContactMethod> getContactMethods() {
        return contactMethods;
    }

    public void setContactMethods(List<ContactMethod> contactMethods) {
        this.contactMethods = contactMethods;
    }

    @XmlElement(name="contact-method")
    private List<ContactMethod> contactMethods;

}
