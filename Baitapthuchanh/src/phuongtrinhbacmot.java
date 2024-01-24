import java.util.Scanner;
public class phuongtrinhbacmot {
    public static void main(String[] args) {
        double a, b , nghiemx;
        Scanner sc = new Scanner(System.in);
        System.out.print("a =");
        a = sc.nextDouble();
        System.out.print("b =");
        b = sc.nextDouble();
        if (a == 0){
            System.out.println("Khong phai la phuong trinh bac nhat!");
        }else {
            nghiemx = -b/a;
           System.out.println("Nghiem cua phuong trinh la :" + nghiemx);
        }

    }
}

