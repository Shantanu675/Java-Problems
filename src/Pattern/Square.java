package Pattern;

public class Square {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n ; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
