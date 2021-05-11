import java.io.File;
import javax.xml.bind.*;

public class Demo {

    public static void main(String[] args) throws Exception  {
        JAXBContext jc = JAXBContext.newInstance(Customer.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("src/input.xml");
        Customer customer = (Customer) unmarshaller.unmarshal(xml);

        for(ContactMethod contactMethod : customer.getContactMethods()) {
            System.out.println(contactMethod.getClass());
        }

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(customer, System.out);
    }

}
