package Rotations;

public class Method15 {
    static double observerX = 1.0;
    static double observerY = 2.0;
    static double observerZ = 3.0;

    static double targetX = 4.0;
    static double targetY = 5.0;
    static double targetZ = 6.0;

    static double deltaX = targetX - observerX;
    static double deltaY = targetY - observerY;
    static double deltaZ = targetZ - observerZ;

    static double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    public static double yaw = Math.atan2(deltaZ / length, deltaX / length);
    public static double pitch = Math.asin(deltaY / length);
}
