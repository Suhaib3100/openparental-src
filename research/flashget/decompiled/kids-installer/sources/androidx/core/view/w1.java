package androidx.core.view;

import android.view.VelocityTracker;

/* compiled from: VelocityTrackerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class w1 {
    private w1() {
    }

    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getXVelocity(i5);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getYVelocity(i5);
    }
}
