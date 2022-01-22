public class ConvertNum {
    public void Convert(int num) {
        while (num > 0) {
            int convertedNum = num % 10;     //sonda ki sayıyı alıyorum
            System.out.print(convertedNum);  // burda yazdırıyorum
            num /= 10;                       //sondaki sayıyı double hale getirip son haneden silmiş oluyorum
        }

    }
}
