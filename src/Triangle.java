public class Triangle {

    static int numOfSides = 3;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // THIS IS THE CONSTRUCTOR METHOD THAT IS CALLED TO ACTUALLY CREATE AN INSTANCE BASED ON THE CLASS
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    //NOT STATIC, so requires an instanced triange to call this method
    public double findArea() {
        return((this.base * this.height) / 2);
    }



}
