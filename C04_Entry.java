package day49_maps;

import day48_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        //Java Entry<K,V> mapin icerisinde bulunan her bir kaydi K=V seklinde tutar
        //dolayisiyla herhangi bir Entrye ulastigimizda hem key hem de valua'ya ulasilabilir ve istedigimiz islemleri
        //yapabiliriz

        //entry.getKey() bize keyi getirir
        //entry.getValue() bize value getirir
        //entry.setValue() valuyu istedigmiz deger olarak update ederiz
        Map<Integer,String> sinifList= ReusableMethods.mapOlustur();
        System.out.println(sinifList);

        //her  elemani alt alta yazdirin
        Set<Map.Entry<Integer,String>>sinifEntrySet=sinifList.entrySet();
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            System.out.println(each);
        }
        //map icersindeki Tester kelimesini QA ile degistirin

        String value="";
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
           value=each.getValue();
           value=value.replaceAll("Tester","QA");
            each.setValue(value);

        }
        System.out.println(sinifList);

}}
