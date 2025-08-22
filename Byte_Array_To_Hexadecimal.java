package JavaPraticeQuestions;

public class Byte_Array_To_Hexadecimal {
    public static void main(String[] args) {
        byte[] array={10, 2, 15, 11};
        for(byte num:array){
            String str=String.format("%02X",num);
            System.out.print(str);
        }
    }
}
