package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: LocationCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4858a = "mockLocation";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4859b = "verticalAccuracy";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4860c = "speedAccuracy";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4861d = "bearingAccuracy";

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private static Method f4862e;

    /* compiled from: LocationCompat.java */
    @androidx.annotation.x0(17)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    /* compiled from: LocationCompat.java */
    @androidx.annotation.x0(18)
    private static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    /* compiled from: LocationCompat.java */
    @androidx.annotation.x0(26)
    private static class c {
        private c() {
        }

        @androidx.annotation.u
        static float a(Location location) {
            float bearingAccuracyDegrees;
            bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
            return bearingAccuracyDegrees;
        }

        @androidx.annotation.u
        static float b(Location location) {
            float speedAccuracyMetersPerSecond;
            speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
            return speedAccuracyMetersPerSecond;
        }

        @androidx.annotation.u
        static float c(Location location) {
            float verticalAccuracyMeters;
            verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            return verticalAccuracyMeters;
        }

        @androidx.annotation.u
        static boolean d(Location location) {
            boolean hasBearingAccuracy;
            hasBearingAccuracy = location.hasBearingAccuracy();
            return hasBearingAccuracy;
        }

        @androidx.annotation.u
        static boolean e(Location location) {
            boolean hasSpeedAccuracy;
            hasSpeedAccuracy = location.hasSpeedAccuracy();
            return hasSpeedAccuracy;
        }

        @androidx.annotation.u
        static boolean f(Location location) {
            boolean hasVerticalAccuracy;
            hasVerticalAccuracy = location.hasVerticalAccuracy();
            return hasVerticalAccuracy;
        }

        @androidx.annotation.u
        static void g(Location location, float f6) {
            location.setBearingAccuracyDegrees(f6);
        }

        @androidx.annotation.u
        static void h(Location location, float f6) {
            location.setSpeedAccuracyMetersPerSecond(f6);
        }

        @androidx.annotation.u
        static void i(Location location, float f6) {
            location.setVerticalAccuracyMeters(f6);
        }
    }

    private h() {
    }

    public static float a(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("bearingAccuracy", 0.0f);
    }

    public static long b(@androidx.annotation.o0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long c(@androidx.annotation.o0 Location location) {
        return a.a(location);
    }

    private static Method d() throws NoSuchMethodException {
        if (f4862e == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f4862e = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f4862e;
    }

    public static float e(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("speedAccuracy", 0.0f);
    }

    public static float f(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean g(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.d(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("bearingAccuracy");
    }

    public static boolean h(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.e(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("speedAccuracy");
    }

    public static boolean i(@androidx.annotation.o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.f(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("verticalAccuracy");
    }

    public static boolean j(@androidx.annotation.o0 Location location) {
        return b.a(location);
    }

    public static void k(@androidx.annotation.o0 Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.g(location, f6);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat("bearingAccuracy", f6);
    }

    public static void l(@androidx.annotation.o0 Location location, boolean z5) {
        try {
            d().invoke(location, Boolean.valueOf(z5));
        } catch (IllegalAccessException e6) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e6);
            throw illegalAccessError;
        } catch (NoSuchMethodException e7) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e7);
            throw noSuchMethodError;
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static void m(@androidx.annotation.o0 Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.h(location, f6);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat("speedAccuracy", f6);
    }

    public static void n(@androidx.annotation.o0 Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.i(location, f6);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat("verticalAccuracy", f6);
    }
}
