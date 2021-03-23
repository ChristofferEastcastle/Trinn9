public   class MovablePoint implements Movable{
    private double x;
    private double y;

    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(double distance) {
        y += distance;
    }

    @Override
    public void moveDown(double distance) {
        y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        x -= distance;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
