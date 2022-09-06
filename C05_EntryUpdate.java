package day49_maps;

import day48_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        //soyismi Can olanlarin branslarini DataScience yapalim

       Map<Integer,String> listMap= ReusableMethods.mapOlustur();
       Set<Map.Entry<Integer,String>> listEntry=listMap.entrySet();
       String value;
       String arr[];
        for (Map.Entry<Integer,String> each: listEntry
             ) {

            value=each.getValue();
            arr=value.split(", ");

            if(arr[1].equals("Can")){
                arr[2]="DataScience";
            }

            value=arr[0]+", "+arr[1]+", "+arr[2];
            each.setValue(value);

        }
        System.out.println(listMap);
    }
}
