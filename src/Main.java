public class Main {

    public static void main(String[] args) {
        System.out.println("R = (x && y && z) ^ (x || !(y && z)) ^ (x && y || !z) ^ (x && !Y && z)");
        System.out.println("Таблица истинности");
        System.out.println("X Y Z  R");
        out(false,false,false);
        out(false,false,true);
        out(false,true,false);
        out(false,true,true);
        out(true,false,false);
        out(true,false,true);
        out(true,true,false);
        out(true,true,true);
    }
    public static void out(boolean x, boolean y, boolean z){
        System.out.println((x ? "1 " : "0 ") + (y ? "1 " : "0 ") + (z ? "1 " : "0 ") + ((x && y && z) ^ (x || !(y && z)) ^ (x && y || !z) ^ (x && !y && z) ? " 1" : " 0"));
    }
}