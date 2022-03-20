class ChallengeFourBalls {
    private final int speed;
    private int positionVertical;
    private int positionHorizontal;

    public ChallengeFourBalls(int speed, int positionVertical, int positionHorizontal) {
        this.speed = speed;
        this.positionVertical = positionVertical;
        this.positionHorizontal = positionHorizontal;
    }

    public void setPositionVertical(int positionVertical) {
        this.positionVertical = positionVertical;
    }


    public void setPositionHorizontal(int positionHorizontal) {
        this.positionHorizontal = positionHorizontal;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPositionVertical() {
        return positionVertical;
    }

    public int getPositionHorizontal() {
        return positionHorizontal;
    }
    
}