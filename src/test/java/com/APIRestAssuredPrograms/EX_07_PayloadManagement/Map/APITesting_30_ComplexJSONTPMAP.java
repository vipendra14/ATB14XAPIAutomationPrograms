package com.APIRestAssuredPrograms.EX_07_PayloadManagement.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class APITesting_30_ComplexJSONTPMAP {

    public static void main(String[] args){

        Map<String, Object> payload = new LinkedHashMap<>();
        List<LinkedHashMap<String,Object>> fruits = new ArrayList<>();

        LinkedHashMap<String,Object> apple = new LinkedHashMap<>();
        apple.put("Name", "Apple");
        apple.put("color", "#FF0000");

        LinkedHashMap<String, Object> appledetails = new LinkedHashMap<>();
        appledetails.put("type","Pome");
        appledetails.put("season","Fall");
        apple.put("details",appledetails);

        LinkedHashMap<String,Object>applenutrients = new LinkedHashMap<>();
        applenutrients.put("calories", 52);
        applenutrients.put("fiber", "2.4g");
        applenutrients.put("vitaminC","4.6mg");
        apple.put("nutrients", applenutrients);



        LinkedHashMap <String, Object> banana = new LinkedHashMap<>();
        banana.put("name", "Banana");
        banana.put("color", "#FFFF00");

        LinkedHashMap<String , Object> bananadetails = new LinkedHashMap<>();
        bananadetails.put("type", "Berry");
        bananadetails.put("season","Year-round");
        banana.put("details", bananadetails);

        LinkedHashMap<String, Object> banananutrients = new LinkedHashMap<>();
        banananutrients.put("calories", 89);
        banananutrients.put("fiber","2.6g");
        banana.put("nutrients", banananutrients);


        fruits.add(apple);
        fruits.add(banana);

        payload.put("fruits", fruits);
        System.out.println(payload);




    }
}
