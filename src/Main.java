import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1, s2, s3, s4;
        System.out.print("s1 giriniz: ");
        s1=input.nextInt();
        System.out.print("s2 giriniz: ");
        s2=input.nextInt();
        System.out.print("s3 giriniz: ");
        s3=input.nextInt();
        System.out.print("s4 giriniz: ");
        s4=input.nextInt();

        if (s1 > s2 && s1>s3 && s1>s4){
            System.out.print("En büyük sayı= "+s1);
        }
        if (s2 > s1 && s2>s3 && s2>s4){
            System.out.print("En büyük sayı= "+s2);
        }
        if (s3 > s1 && s3>s2 && s3>s4){
            System.out.print("En büyük sayı= "+s3);
        }
        if (s4 > s1 && s4>s2 && s4>s3){
            System.out.print("En büyük sayı= "+s4);
        }
        /* <== bışluk ==>*/

        if (s1 < s2 && s1<s3 && s1<s4){
            System.out.print("\nEn küçük sayı= "+s1);
        }
        if (s2 < s1 && s2<s3 && s2<s4){
            System.out.print("\nEn küçük sayı= "+s2);
        }
        if (s3 < s1 && s3<s2 && s3<s4){
            System.out.print("\nEn küçük sayı= "+s3);
        }
        if (s4 < s1 && s4<s2 && s4<s3){
            System.out.print("\nEn küçük sayı= "+s4);
        }
    }
}
