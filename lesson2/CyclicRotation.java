import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K)
    {
        if (A.length == 0) return A;

        while (K > 0) {
            int lastElem = A[A.length - 1];
            int previousElem = A[0];
            int currentElem;
            for (int i = 1; i < A.length; i++) {
                currentElem = A[i];
                A[i] = previousElem;
                previousElem = currentElem;
            }
            A[0] = lastElem;
            K--;
        }
        return A;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        solution(arr, 4);
    }

}
