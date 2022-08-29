import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] A = {-1, -2, 2, 2, 3};
        Arrays.sort(A);
        
        int smallest = A[0];

        int totalCandy = 0;
        int increment = 1;
        //then go over every element of the array and give candy
        for(int i = 0; i < A.length; i++){
            //smallest element gets one candy
            if(A[i] > smallest){ // this element is bigger than before
                increment++;
            }
            totalCandy += increment;
            smallest  = A[i]; // now we have a smallest as the current so we can compare it in the next step
        };
        System.out.println(totalCandy);
    }
}
