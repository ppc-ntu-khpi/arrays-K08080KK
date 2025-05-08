package domain;

public class Exercise {
    public static int[] Calculate(int R){
        if(R % 2 != 0 && R > 0){
            int[] numbers = new int[R];
            int start = R / 2;
            numbers[start] = 0;
            
            int j = 1;
            for(int i = start + 1; i < R; i++){
                numbers[i] = j;
                j++;
            }
            j = 1;
            for(int i = start - 1; i >= 0; i--){
                numbers[i] = j;
                j++;
            }
            return numbers;
        }
        return null;
    }
}
