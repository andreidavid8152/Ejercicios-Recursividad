public class Suma {
    private int n;
    private int x;

    public Suma(){
        n = 0;
        x = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long fSumaRecursivo(int n){
        long res;

        if(n == 1){
            return 1;
        }else{
            res = n+fSumaRecursivo(n-1);
        }
        return res;
    }

    public long fSumaRecursivoImpares(int n){
        if (n == 0) { // Caso base: cuando n llega a 0, se detiene la recursión
            return 0;
        }
        if (n % 2 != 0) { // Si el número es impar, se agrega a la suma
            return n + fSumaRecursivoImpares(n - 1);
        } else { // Si el número es par, se ignora y se sigue con el siguiente número
            return fSumaRecursivoImpares(n - 1);
        }
    }

    public long fSumaAB(int n, int x){
        if (n > x) {
            return 0;
        } else {
            return n + fSumaAB(n + 1, x);
        }
    }
    

}
