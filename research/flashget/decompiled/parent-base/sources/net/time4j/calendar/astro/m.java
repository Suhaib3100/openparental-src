package net.time4j.calendar.astro;

/* compiled from: Twilight.java */
/* loaded from: classes7.dex */
public enum m {
    BLUE_HOUR(4.0d),
    CIVIL(6.0d),
    NAUTICAL(12.0d),
    ASTRONOMICAL(18.0d);

    private final transient double angle;

    m(double d5) {
        this.angle = d5;
    }

    double getAngle() {
        return this.angle;
    }
}
