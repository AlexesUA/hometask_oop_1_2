package geometry;

public class Rectangle {
    private double sideA;
    private double sideB;

    private double areaRectangle;
    private double perimeterRectangle;


    public Rectangle (){
        this.sideA = 0;
        this.sideB = 0;
    }
    public Rectangle (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;

        areaCalculator ();
        perimeterCalculator ();
    }

    public void SetSideA( double value){ sideA = value;}
    public double GetSideA(){return sideA;}

    public void SetSideB( double value){ sideB = value;}
    public double GetSideB(){return sideB;}

    public double areaCalculator (){
        return areaCalculator(sideA, sideB);
    }
    public double areaCalculator (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
        areaRectangle = sideA * sideB;
        return  areaRectangle;
    }


    public double perimeterCalculator (){
        return perimeterCalculator (sideA, sideB);
    }
    public double perimeterCalculator (double sideA, double sideB){
        perimeterRectangle = (sideA * 2) + (sideB * 2);
        return  perimeterRectangle;
    }

    public void  PrintArea (){
        System.out.printf("Площа прямокутника зі сторонами %1$.2f та %2$.2f дорівнює %3$.2f %n",
                sideA, sideB, areaRectangle);
    }

    public void  PrintPerimeter (){
        System.out.printf("Периметр прямокутника зі сторонами %1$.2f та %2$.2f дорівнює %3$.2f %n",
                sideA, sideB, perimeterRectangle);
    }

    public void  PrintAll(){
        PrintArea ();
        PrintPerimeter ();
    }

}
