package liskovSubstitution.step3;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public int area() { return width * height; }


}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Kare olduğundan eşitliyoruz
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}