import java.lang.reflect.Array;
import java.util.Arrays;

public class distinctArray {
    int distinctArray[] = new int[]{3, 5, 5, 8, 9, 11, 3, 3};

    public void findSameNumber() {
        for (int i = 0; i < distinctArray.length; i++) {
            System.out.println("Sirasiz dizi: " + distinctArray[i]);
            int k = distinctArray[i];

            for (int j = i+1; j < distinctArray.length; j++) {
                if (k==distinctArray[j]){

                }
                else{
                    continue ;
                }
            }
        }

    }

}
