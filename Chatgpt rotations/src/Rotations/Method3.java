package Rotations;

public class Method3 {
    static double observerX = 0.0;
    static double observerY = 0.0;
    static double observerZ = 0.0;

    static double targetX = 1.0;
    static double targetY = 1.0;
    static double targetZ = 1.0;

    public static double[] rots = calculateYawPitch(observerX, observerY, observerZ, targetX, targetY, targetZ);

    private static double[] calculateYawPitch(double observerX, double observerY, double observerZ,
                                              double targetX, double targetY, double targetZ) {
        double yaw = Math.toDegrees(Math.atan2(targetZ - observerZ, targetX - observerX));
        double pitch = Math.toDegrees(-Math.atan2(targetY - observerY, Math.sqrt((targetX - observerX) * (targetX - observerX) + (targetZ - observerZ) * (targetZ - observerZ))));

        return new double[]{yaw, pitch};
    }
}
