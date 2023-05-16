public class Factorial {
    public Factorial() {
    }

    public long fIterativo(int num){
        int res = 1;
        for (int i = 1; i <= num; i++){
            res*=i;
        }
        return res;
    }

    public long fRecursivo(int num){
        if (num == 1) {
            return 1;
        } else {
            return num * fRecursivo(num-1);
        }
    }
}
