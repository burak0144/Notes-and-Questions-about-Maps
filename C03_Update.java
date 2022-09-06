package day49_maps;

import day48_maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {
        //map.contains(key)=>verdigimiz key'in map'de olup olmadigini boolean olarak doner
        //map.contains(value)=>bir butun olarak map'de olup olmadigini doner(valuenin icindeki tum parcalari yazmaliyiz)

        //map.get(key)=>verilen key'e ait degeri dondurur
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.containsKey(104)); //true
        System.out.println(sinifListMap.containsKey(111)); //false

        System.out.println(sinifListMap.containsValue("Ali, Can, Tester"));//true
        System.out.println(sinifListMap.containsValue("Tester"));//false

        //Verilen map'de Dev. degerlerini Tester olarak degistirin
        //replace tum degerleri degistirmek icin kullanilir kismi olarak degisiklikte kullanilamaz
        //ama keyleri bilirsek replace'i kullaniriz
        //bu yuzden Set'le keyvaluelari aldik ve key uzerinden degisiklik yaptik
       Set<Integer> keyValue=sinifListMap.keySet();
       for (Integer each:keyValue
             ) {
             String values=sinifListMap.get(each);//keyi yazip valueda degisiklik yapiyrz

             values=values.replaceAll("Dev.","Tester");

             sinifListMap.put(each,values);//yeni halini put(key,values) ile degistirdik

            }
        System.out.println(sinifListMap);

        }



    }

