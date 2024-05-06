public class Main{
    public static void main(String[] args) {
//        Q1();
//        Q2();
//        Q3();
//        Q4();
//        Q5();
        //QH1
//        int[] num = {5,-3,-2,16,55,0};
//        QH1(num);
        //QH2
//        int[] num = {5,-3,-2,16,55,0};
//        QH2(num);
        //QH3
//        int[] num = new int[11];
//        QH3(num);
        //QH4
//        int[] num = {5,-3,-2,16,55,0};
//        QH4(num);

    }
    public static void Q1(){
        for (int i = 0; i < 110; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void Q2(){
        for (int i = 90; i > 0 ; i-=5) {
            System.out.print(i+" ");
        }
    }
    public static void Q3(){
        for (int i = 2; i <= 1048576; i*=2) {
            System.out.print(i+" ");
        }
    }
    public static void Q4(){
        for (int i = -29; i <10 ; i++) {
           if(i%5==0){
               System.out.print(i+" ");
           }
        }
    }
    public static void Q5(){
        int sum = 0;
        for (int i = 50; i <= 150; i++) {
            sum += i;
            if (sum%2==0){
                System.out.print(sum+" ");
            }
        }
    }
    //QH == Question Hard
    public static void QH1(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public static void QH2(int[] a){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=1){
                count++;
                sum+=a[i];
            }
        }
        System.out.println("summary is "+sum+" and count is "+count);
    }
    public static void QH3(int[] a){
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i-2]+a[i-1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void QH4(int[] a){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<0){
                count++;
                sum+=a[i];
            }
        }
        System.out.println("summary is "+sum+" and count is "+count);
    }
}