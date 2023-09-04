package c_singleton.enummethod;

enum Singleton {
    INSTANCE; // this is a value in enum which is static instance of ESingleton class
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
