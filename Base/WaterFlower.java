package Base;

public class WaterFlower {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100 ; i < 1000 ; i ++){
            int g = i % 10 ;//个位
            int b = i / 100;//十位
            int s = (i / 10) % 10;//百位
            if(s*s*s+b*b*b+g*g*g == i){
                count++;

            }

        }
        System.out.println(count);
    }
}
