import java.util.Date;

/**
 * Created by wjc on 2018/3/27.
 */
public class Test {

    public static void main(String[] args) {
//
//        int[] num = new int[100];
//        for (int i = 0;i < 100 ; i++) {
//            num[i] = 1 + (int) Math.floor(Math.random() * 4);
//        }
//
//
//        int[] result = new int[4];
//        for (int i: num
//             ) {
//            if(i == 1){
//                result[0] ++ ;
//            }else if (i == 2 ){
//                result[1] ++ ;
//
//            }else if (i == 3 ){
//                result[2] ++ ;
//            }else if (i == 4){
//                result[3] ++;
//            }
//        }
//
//        System.out.println("%d  %d  %d  %d"+result[0]+result[1] +result[2] +result[3]);
        System.out.println(test());

    }
    private static int test() {
        Date date = new Date();

        System.out.println(date);

        Date date1 = new Date(date.getTime() + 13950000);

        System.out.println(date1);


        return 0;
    }

}
