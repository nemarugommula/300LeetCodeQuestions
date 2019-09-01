import java.util.Arrays;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int []arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = in.nextInt();
        }
        int i=0;
        int count=1;
        for(int j=1;j<N;j++){
            if((arr[i]==arr[j])&&count<2){
                System.out.println("first");
                i++;
                count++;

            }else if((arr[i]==arr[j])&&count >=2){
                System.out.println("second");
                continue;
            }
            else{
                System.out.println("third");
                arr[++i] = arr[j];
                count = 1;
            }
        }
        Arrays.stream(arr).forEach(k->System.out.print(k));
    }
}
