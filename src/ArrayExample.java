import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public int[] createArrayRandom(){
        Random rd = new Random();
        int[] array = new int[100];
        System.out.println("Danh sach phan tu cua mang : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = arrayExample.createArrayRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhap vao vi tri cua so can tim trong mang : ");
        int number = scanner.nextInt();

        try{
            System.out.printf("So o vi tri %d la %d",number, array[number]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Vuot qua gioi han index cua mang." +
                    "\nMang co "+array.length+" phan tu, " +
                    "vui long nhap trong khoang : 0~" + (array.length-1));
        }
    }
}
