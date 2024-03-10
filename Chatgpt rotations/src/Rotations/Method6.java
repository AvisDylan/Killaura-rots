package Rotations;

public class Method6 {
    static double observerX = 0.0;
    static double observerY = 0.0;
    static double observerZ = 0.0;

    static double targetX = 1.0;
    static double targetY = 1.0;
    static double targetZ = 1.0;

    public static double[] rots = calculateYawPitch(observerX, observerY, observerZ, targetX, targetY, targetZ);

    private static double[] calculateYawPitch(double observerX, double observerY, double observerZ,
                                              double targetX, double targetY, double targetZ) {
        double dx = targetX - observerX;
        double dy = targetY - observerY;
        double dz = targetZ - observerZ;

        double yaw = Math.toDegrees(Math.atan2(dx, dz));
        double pitch = Math.toDegrees(Math.asin(dy / Math.sqrt(dx * dx + dy * dy + dz * dz)));

        return new double[]{yaw, pitch};
    }
}
