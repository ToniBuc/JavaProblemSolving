package main.java.com.github.tonibuc;

public class ValidateSubsequence {
    public static void main(String[] args) {
        //sample arrays
        int[] mainArray = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequenceArray = {22, 25, 6};
        int subsequentIndex = 0;
        for(int i = 0; i < mainArray.length; i++){
            if (subsequentIndex < sequenceArray.length){
                if (mainArray[i] == sequenceArray[subsequentIndex]){
                    subsequentIndex++;
                }
            }
        }
        //true if subsequent, false if not
        System.out.println(subsequentIndex == sequenceArray.length);
    }
}
