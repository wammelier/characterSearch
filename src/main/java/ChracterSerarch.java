public class ChracterSerarch {

    public static void main(String[] args) {
        String s = "aweff";
        String answer = "";

        char[] ss = s.toCharArray();
        int num1 = ss.length / 2 - 1;
        int num2 = ss.length / 2;

        System.out.println("ss==>"+ss[num1+1]);
        System.out.println("ss.length % 2 ==>"+ss.length % 2);

        if (ss.length % 2 == 0) {
            answer = String.valueOf(ss[num1]) + String.valueOf(ss[num1+1]);
            System.out.println("짝수 answer ==>" + answer);
        } else if(ss.length % 2 != 0){
            answer = String.valueOf(ss[num2]);
            System.out.println("홀수 answer ==>" + answer);
        }

        System.out.println(answer);
    }

}
