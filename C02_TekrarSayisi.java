package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisi {
    public static void main(String[] args) {
        //verilen bir string'deki kullanilan harfleri ve kullanilan harflerin tekrar sayisini
        //H=20 seklinde yazdirin
        String str="Heeeeeelllloooo Wooorrrrlllldddddd";
        str=str.replaceAll("\\W","");
        String harf[]=str.split("");
        Integer harfSonSayisi;

        Map<String,Integer> harfSayisiMap=new HashMap<>();

        for (String each :harf
             ) {
            if(!harfSayisiMap.containsKey(each)){
                harfSayisiMap.put(each,1);
            }else {
                harfSonSayisi=harfSayisiMap.get(each);
                harfSayisiMap.put(each,++harfSonSayisi);
            }
        }
        System.out.println(harfSayisiMap);
    }
}
