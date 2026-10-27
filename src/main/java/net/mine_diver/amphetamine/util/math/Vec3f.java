package net.mine_diver.amphetamine.util.math;

public class Vec3f {
    public static final Vec3f ZERO = new Vec3f(0, 0, 0);

    public final float x;
    public final float y;
    public final float z;

    public Vec3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
