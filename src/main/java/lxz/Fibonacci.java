package lxz;

/**
 * Hello world!
 *
 */
public class Fibonacci {
    public static long cal1(long n){
        if(n <= 1l){
            return n;
        }else{
            return cal1(n - 1l) + cal1(n - 2l);
        }
    }
    //非递归方式实现
    public static long cal2(long n){
        if(n <= 1l){
            return n;
        }

        long[] arr = new long[2];

        arr[0] = 0l;
        arr[1] = 1l;

        for(long i=2l; i<=n; i++){
            if(i % 2l == 0l) {
                arr[0] = arr[0] + arr[1];
            }else{
                arr[1] = arr[0] + arr[1];
            }
        }
        return arr[(int)(n % 2l)];
    }
}
