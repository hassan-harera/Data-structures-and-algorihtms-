package TreeClasses;

public class B extends A {

    int x;

    public B(int x, int y) {
        super(x);
        this.x = y;
    }

    public void setX(int x) {
        super.x = x;
    }

    public int getX() {
        return x;
    }

    public void setXInAVersion(int x) {
        super.setX(x);
    }

    public int getXInAVersion() {
        return super.getX();
    }
}
