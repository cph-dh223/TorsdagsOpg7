package Part2;

public class Cirkel {
    
    private int r;

    public void setRadius(int newRadius) throws IllegalArgumentException{
        if(newRadius < 0){
            throw new IllegalArgumentException("Radius can not be negative");
        }
        r = newRadius;
    }

    public double area(){
        return Math.pow(r, 2) * Math.PI;
    }
}
