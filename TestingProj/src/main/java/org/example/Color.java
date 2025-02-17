package org.example;

public abstract class Color {
    private float color;
    public int getAnimalColor(float color) throws Exception {
        if(color < 0 || color > 255.69)
            throw new Exception("Wrong color");
        float newColor = convertColor(color);

        if(newColor < -265.12 || newColor > -265.11)
            throw new Exception("Color is wrong again ashdasudhasdiyighasuidghasiydgasdyua");

        int newColor2 = Float.floatToIntBits(newColor) + 1;

        return newColor2;
    }

    abstract float convertColor( float color );
}
