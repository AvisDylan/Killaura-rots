package Rotations;

public class Method1 {
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

        double yaw = Math.atan2(dz, dx);
        double pitch = -Math.atan2(dy, Math.sqrt(dx * dx + dz * dz));

        yaw = Math.toDegrees(yaw);
        pitch = Math.toDegrees(pitch);

        return new double[]{yaw, pitch};
    }
}
