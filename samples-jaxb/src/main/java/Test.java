import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws Exception {

        Product prod1 = new Product("111","11branccode","11proddesc","11prodnumber");
        Product prod2 = new Product("222","22branccode","22proddesc","22prodnumber");
        Product prod3 = new Product("333","33branccode","33proddesc","33prodnumber");
        Product prod4 = new Product("444","44branccode","44proddesc","44prodnumber");
        Product prod5 = new Product("555","55branccode","55proddesc","55prodnumber");
        Product prod6 = new Product("666","66branccode","66proddesc","66prodnumber");


        Price price1 = new Price("111","121","USA");
        Price price2 = new Price("222","232","USA");
        Price price3 = new Price("333","343","USA");
        Price price4 = new Price("111","101","CAN");
        Price price5 = new Price("222","201","CAN");
        Price price6 = new Price("333","301","CAN");


        List<Product> productList = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6);
        List<Price> priceList = Arrays.asList(price1,price2,price3,price4,price5,price6);
        List<Price> result =priceList.stream().filter(price ->productsFoundInLicensesList(price,productList))
                    .collect(Collectors.toList());

        System.out.println("result====="+result.size());
        System.out.println("result====="+result);


    }
    private static boolean productsFoundInLicensesList(Price price, List<Product> prod) {
        return prod.stream().
                anyMatch(l -> l.getSmis().equals(price.getSmis()));
    }

    private static void  update(Price price,Product prod) {

    }



}
