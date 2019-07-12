package JAVAadvanced.Collection.Map;

import java.util.HashMap;

public class HashMapPractice {
    /**
     * 统计一个字符中每个字符出现的次数并且保存到HashMap中
     */
    public static void main(String args[]){
        String str="sfgsajfdjalk2,sdfasadf23423a";
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            String c=str.charAt(i)+"";
//            if (map.containsKey(c)){
//                int count=map.get(c);
//                count++;
//                map.put(c,count);
//            }else
//            {
//                map.put(c,1);
//            }
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }
        //方式2,取字符串的首个字符然后替换为空，将原来字符串的长度减去新字符串的长度就是字符出现的字数。
        while(!str.isEmpty()){
           String c= str.charAt(0)+"";
           String newStr=str.replace(c,"");
           map.put(c,str.length()-newStr.length());
           str=newStr;
        }

        System.out.println(map);
    }
}
