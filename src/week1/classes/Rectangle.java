package week1.classes;

public class Rectangle {
    // set fields
    private int width;
    private int height;
    private String color = "Blue";

    public Rectangle(int width, int height, String color){
        // call setter function
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        if(width > 0){
            this.width = width;
        }else{
            System.out.println("Width should be greater than 0");
        }
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        if(height > 0){
            this.height = height;
        }else{
            System.out.println("Height should be greater than 0");
        }
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        // Set a variable for initial char of color
        String firstLetter = color.substring(0, 1);
        if(firstLetter.equals(firstLetter.toUpperCase())){
            if(color.length() > 2 && color.length() < 20){
                this.color = color;
            }else{
                System.out.println("Color characters should be more than 2 and less than 20");
            }
        }else{
            System.out.println("A sequence of color should be capitalized");
        }
    }

    public void draw(int width, int height, String color){
        // Extract initial char of color
        String firstLetter = color.substring(0, 1);
        // make lines
        for(int i = 1; i <= height; i++){
            System.out.println("");
            // put initial char of color
            for(int j = 1; j <= width; j++){
                System.out.print(firstLetter);
            }
        }
        // Make one line between this rectangle and next one
        System.out.println("");
    }
}
