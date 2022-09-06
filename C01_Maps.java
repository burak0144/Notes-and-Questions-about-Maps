package day49_maps;

import day48_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {


        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);
    }
}
