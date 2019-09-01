import java.util.*;
public class one {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int []arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = in.nextInt();
        }
        int i = 0;
        for(int j=1;j<N;j++){
            if(arr[i]!=arr[j]){
                arr[++i] = arr[j];
            }
        }
        Arrays.stream(arr).forEach(k->System.out.println(k));
    }
}
