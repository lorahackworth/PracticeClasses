class Apple {
    private String color;
    private String size;


    // constructor
    public Apple(String color, String size) {
        this.color = color;
        this.size = size;
    }

    //getter & setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // toString to properly format if we try to print out a certain apple
    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
