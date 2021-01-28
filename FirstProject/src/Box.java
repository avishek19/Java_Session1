public class Box {

    static int a = 2020;
    static int b = 2021;

double width;
double length;
double height;

Box(){
    this.width = -1;
    this.length = -2;
    this.height = -4;
}

Box(Box ob){
    width = ob.width;
    height = ob.height;
    length = ob.length;
}

Box(double w, double l, double h){
    width = w;
    length =l ;
    height = h;
}

 double vloume(){
     return length*width*height;
 }

public static void main(String[] args) throws Exception{

    Box obj1 = new Box();
    Box obj2 = new Box(20, 50,100);

    Box clone = new Box(obj1); 
 
    double vol;
    vol = obj1.vloume();
    System.out.println("First Call - Volume:" +vol);

    vol = obj2.vloume();
    System.out.println("Second Call - Volume:" +vol);

    vol = clone.vloume();
    System.out.println("Third Call - Volume:" +vol);

    System.out.println("No Object needed, I m Static!!! - Value of A & B :"+a +" " +b); 

}

    
}
