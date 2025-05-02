import java.util.Map;
import java.util.LinkedHashMap;
class ProgramFour{
    public static void main(String[] args){
        int[] numbers = {1,2,8,9,12,46,76,82,15,20,30};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=1; i<=9;i++){
            map.put(i,0);
        }

        for(int num: numbers){
            for(int i=1; i<=9;i++){
                if(num % i == 0){
                    map.put(i, map.get(i)+1);
                }
            }
        }

        System.out.println(map);
    }
}