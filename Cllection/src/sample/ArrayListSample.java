package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        //get要素
        String firstItem = places.get(0);
        System.out.println("一番目の要素（置換前）：" + firstItem);
        
        //置換要素
        places.set(0, "フィンランド");
        System.out.println("一番目の要素（置換後）：" + places.get(0));

        //要素remove
        System.out.println(places.get(1));
        places.remove(1);
        System.out.println(places.get(1));
        
        //拡張forループによる取得
        System.out.println("拡張forループによる取得：");
        for (String place : places) {
            System.out.println(place);
        }    
        // forEachとラムダ式による取得
        System.out.println("forEachとラムダ式による取得:");
        places.forEach((place) -> System.out.println(place));
        
        //サイズの取得
        int size = places.size();
        System.out.println(size);
        places.clear();
        System.out.println(places.size());
        
    }

}
