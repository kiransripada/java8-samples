import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataMergeTest {

    public static void main(String[] args) throws Exception {

        Product prod1 = new Product("111","11branccode","11proddesc","11prodnumber");
        Product prod2 = new Product("222","22branccode","22proddesc","22prodnumber");
        Product prod3 = new Product("333","33branccode","33proddesc","33prodnumber");
        Product prod4 = new Product("444","44branccode","44proddesc","44prodnumber");
        Product prod5 = new Product("555","55branccode","55proddesc","55prodnumber");
        Product prod6 = new Product("666","66branccode","66proddesc","66prodnumber");

        List<Product> productList = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6);

        Map<String ,Product> productMap = convertProductListToMap(productList);

        System.out.println("productMap"+productMap);


        Price price1 = new Price("111","121","USA");
        Price price2 = new Price("222","232","USA");
        Price price3 = new Price("333","343","USA");
        Price price4 = new Price("111","101","CAN");
        Price price5 = new Price("222","201","CAN");
        Price price6 = new Price("333","301","CAN");


        List<Price> priceListUSA = Arrays.asList(price1,price2,price3);
        List<Price> priceListCAN = Arrays.asList(price4,price5,price6);
         Map<String,Price>  priceMapUSA = convertListToMap(priceListUSA);
        Map<String,Price>  priceMapCAN= convertListToMap(priceListCAN);
        System.out.println("priceMapCAN"+priceMapCAN);
        System.out.println("priceMapUSA"+priceMapUSA);

        Map<String, Price>  priceMergedMap  =
                priceMapUSA.entrySet()
                        .stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                e -> new Price(e.getValue().getSmis(),null,null, priceMapUSA.get(e.getKey()).getListPrice(), priceMapCAN.get(e.getKey()).getListPrice())
                        ));

        System.out.println("result"+priceMergedMap);
        List<Price> mergedPrice = priceMergedMap.values().stream().collect(Collectors.toList());
         System.out.println("mergedPrice"+mergedPrice);


         Map<String, Product> productPriceMap = productMap.entrySet().stream()
                                             .collect(Collectors.toMap(Map.Entry::getKey,
                                                     e -> new Product(e.getValue().getSmis(), e.getValue().getBrandCode(),
                                                             e.getValue().getDescription(),e.getValue().getProductNumber(),
                                                             null,null,(priceMergedMap.get(e.getKey())!=null ? priceMergedMap.get(e.getKey()).getListPriceUSA():null),
                                                             (priceMergedMap.get(e.getKey())!=null ? priceMergedMap.get(e.getKey()).getListPriceCAN():null))));

        System.out.println("productPriceMap++++"+productPriceMap);



    }
    public static Multimap<String, Price> convertListAfterJava8(List<Price> list) {
       return  Multimaps.index(list, Price::getSmis);
    }


    public static Map<String, Price> convertListToMap(List<Price> list) {
        Map<String, Price> map = list.stream()
                .collect(Collectors.toMap(Price::getSmis, price -> price));
        return map;
    }

    public static Map<String, Product> convertProductListToMap(List<Product> list) {
        Map<String, Product> map = list.stream()
                .collect(Collectors.toMap(Product::getSmis, product -> product));
        return map;
    }

    private static boolean productsFoundInLicensesList(Price price, List<Product> prod) {
        return prod.stream().
                anyMatch(l -> l.getSmis().equals(price.getSmis()));
    }

    private static void  update(Price price,Product prod) {

    }



}
