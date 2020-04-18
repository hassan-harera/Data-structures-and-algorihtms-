package TreeClasses;

public class C extends B {

    int x;

    public C(int x, int y, int z) {
        super(x, y);
        this.x = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setXInAVersion(int x) {
        super.setXInAVersion(x);
    }

    public int getXInAVersion() {
        return super.getXInAVersion();
    }
}
