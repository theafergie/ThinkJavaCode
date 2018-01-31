import java.util.Objects;

public class Rectangle
{
    private int height;
    private int width;

    public Rectangle()
    {
        height = 1;
        width = 1;
    }

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }
    //had to get help with this step 11-d #6
   public Rectangle(Rectangle rectangle)
      {
        this.height = rectangle.getHeight();
        this.width = rectangle.getWidth();
    }
    public int getArea()
    {
        int area = getHeight() * getHeight();

        return area;
    }

    public String toString()
    {
        return "Height: " + getHeight() + ", Width: " + getWidth() + ", Area: " + getArea();

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(height, width);
    }
}
