import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N  = in.nextInt();
        int []arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = in.nextInt();
        }
        int R = in.nextInt();
        int i = -1;
        int j = 0;
        while(j<arr.length){
            if(arr[j]!=R){
                arr[++i] = arr[j];
            }
            j++;
        }
        Arrays.stream(arr).forEach(k->System.out.println(k));
    }
}

