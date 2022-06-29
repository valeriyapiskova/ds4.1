public class Calculator {
    int sum(int... values){
        int result = 0;
        for (int i : values){
            result = result + i;
        }
        return result;
    }
    float sum(float... values) {
        float result = 0;
        for (float i : values) {
            result = result + i;
        }
        return result;
    }

    public int add(int x, int y){
       int z;
       z = x + y;
       return z;
    }
    public int sub(int x, int y){
        int z;
        z = x - y;
        return z;
    }
    public int multi(int x, int y){
        int z;
        z = x * y;
        return z;
    }
    public int div(int x, int y) {
        int z;
        z = x / y;

        return z;
    }
}
