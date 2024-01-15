import java.util.*;

public class shortestpath 
{

    public static float displacement(String path)
    {
        float dis;
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++)
        {
            char dir=path.charAt(i);
            //north
            if(dir=='N'){
                y++;
            }
            //south
            else if(dir=='S'){
                y--;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
        }
        dis=(float)Math.sqrt(((x*x) +(y*y)));
        return dis;
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the path");
        String path=sc.next();
        System.out.println("entered path: " + path.toUpperCase());
        System.out.println(displacement(path.toUpperCase()));
    }
}
