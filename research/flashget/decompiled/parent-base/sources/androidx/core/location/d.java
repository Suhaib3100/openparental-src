package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: LocationCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26365a = "mockLocation";

    /* renamed from: b, reason: collision with root package name */
    public static final String f26366b = "verticalAccuracy";

    /* renamed from: c, reason: collision with root package name */
    public static final String f26367c = "speedAccuracy";

    /* renamed from: d, reason: collision with root package name */
    public static final String f26368d = "bearingAccuracy";

    /* renamed from: e, reason: collision with root package name */
    public static final String f26369e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f26370f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* renamed from: g, reason: collision with root package name */
    @q0
    private static Method f26371g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private static Field f26372h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private static Integer f26373i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private static Integer f26374j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private static Integer f26375k;

    /* compiled from: LocationCompat.java */
    @x0(26)
    private static class a {
        private a() {
        }

        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        static void g(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.f())));
            } catch (IllegalAccessException e4) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e4);
                throw illegalAccessError;
            } catch (NoSuchFieldException e5) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e5);
                throw noSuchFieldError;
            }
        }

        static void h(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.g())));
            } catch (IllegalAccessException e4) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e4);
                throw illegalAccessError;
            } catch (NoSuchFieldException e5) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e5);
                throw noSuchFieldError;
            }
        }

        static void i(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.h())));
            } catch (IllegalAccessException | NoSuchFieldException e4) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e4);
                throw illegalAccessError;
            }
        }

        static void j(Location location, float f4) {
            location.setBearingAccuracyDegrees(f4);
        }

        static void k(Location location, float f4) {
            location.setSpeedAccuracyMetersPerSecond(f4);
        }

        static void l(Location location, float f4) {
            location.setVerticalAccuracyMeters(f4);
        }
    }

    /* compiled from: LocationCompat.java */
    @x0(28)
    private static class b {
        private b() {
        }

        static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* compiled from: LocationCompat.java */
    @x0(29)
    private static class c {
        private c() {
        }

        static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* compiled from: LocationCompat.java */
    @x0(31)
    /* renamed from: androidx.core.location.d$d, reason: collision with other inner class name */
    static class C0418d {
        private C0418d() {
        }

        static boolean a(Location location) {
            return location.isMock();
        }
    }

    /* compiled from: LocationCompat.java */
    @x0(33)
    private static class e {
        private e() {
        }

        static void a(Location location) {
            location.removeBearingAccuracy();
        }

        static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* compiled from: LocationCompat.java */
    @x0(34)
    private static class f {
        private f() {
        }

        static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void e(Location location) {
            location.removeMslAltitude();
        }

        static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        static void g(Location location, float f4) {
            location.setMslAltitudeAccuracyMeters(f4);
        }

        static void h(Location location, double d5) {
            location.setMslAltitudeMeters(d5);
        }
    }

    private d() {
    }

    public static void A(@o0 Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.j(location, f4);
        } else {
            k(location).putFloat("bearingAccuracy", f4);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void B(@o0 Location location, boolean z4) {
        try {
            l().invoke(location, Boolean.valueOf(z4));
        } catch (IllegalAccessException e4) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e4);
            throw illegalAccessError;
        } catch (NoSuchMethodException e5) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e5);
            throw noSuchMethodError;
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void C(@o0 Location location, @androidx.annotation.x(from = 0.0d) float f4) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.g(location, f4);
        } else {
            k(location).putFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY", f4);
        }
    }

    public static void D(@o0 Location location, double d5) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.h(location, d5);
        } else {
            k(location).putDouble("androidx.core.location.extra.MSL_ALTITUDE", d5);
        }
    }

    public static void E(@o0 Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.k(location, f4);
        } else {
            k(location).putFloat("speedAccuracy", f4);
        }
    }

    public static void F(@o0 Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.l(location, f4);
        } else {
            k(location).putFloat("verticalAccuracy", f4);
        }
    }

    private static boolean a(@o0 Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("bearingAccuracy", 0.0f);
    }

    public static long c(@o0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    @w0(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long d(@o0 Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @SuppressLint({"BlockedPrivateApi"})
    static Field e() throws NoSuchFieldException {
        if (f26372h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f26372h = declaredField;
            declaredField.setAccessible(true);
        }
        return f26372h;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int f() throws NoSuchFieldException, IllegalAccessException {
        if (f26374j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f26374j = Integer.valueOf(declaredField.getInt(null));
        }
        return f26374j.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int g() throws NoSuchFieldException, IllegalAccessException {
        if (f26373i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f26373i = Integer.valueOf(declaredField.getInt(null));
        }
        return f26373i.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int h() throws NoSuchFieldException, IllegalAccessException {
        if (f26375k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f26375k = Integer.valueOf(declaredField.getInt(null));
        }
        return f26375k.intValue();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p)
    public static float i(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.a(location) : k(location).getFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
    }

    public static double j(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.b(location) : k(location).getDouble("androidx.core.location.extra.MSL_ALTITUDE");
    }

    private static Bundle k(@o0 Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    private static Method l() throws NoSuchMethodException {
        if (f26371g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f26371g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f26371g;
    }

    public static float m(@o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("speedAccuracy", 0.0f);
    }

    public static float n(@o0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean o(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.d(location) : a(location, "bearingAccuracy");
    }

    public static boolean p(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.c(location) : a(location, "androidx.core.location.extra.MSL_ALTITUDE");
    }

    public static boolean q(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.d(location) : a(location, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
    }

    public static boolean r(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.e(location) : a(location, "speedAccuracy");
    }

    public static boolean s(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.f(location) : a(location, "verticalAccuracy");
    }

    public static boolean t(@o0 Location location) {
        return Build.VERSION.SDK_INT >= 31 ? C0418d.a(location) : location.isFromMockProvider();
    }

    public static void u(@o0 Location location) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            e.a(location);
            return;
        }
        if (i4 >= 29) {
            c.a(location);
            return;
        }
        if (i4 >= 28) {
            b.a(location);
        } else if (i4 >= 26) {
            a.g(location);
        } else {
            v(location, "bearingAccuracy");
        }
    }

    private static void v(@o0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void w(@o0 Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.e(location);
        } else {
            v(location, "androidx.core.location.extra.MSL_ALTITUDE");
        }
    }

    public static void x(@o0 Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f(location);
        } else {
            v(location, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
        }
    }

    public static void y(@o0 Location location) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            e.b(location);
            return;
        }
        if (i4 >= 29) {
            c.b(location);
            return;
        }
        if (i4 >= 28) {
            b.b(location);
        } else if (i4 >= 26) {
            a.h(location);
        } else {
            v(location, "speedAccuracy");
        }
    }

    public static void z(@o0 Location location) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            e.c(location);
            return;
        }
        if (i4 >= 29) {
            c.c(location);
            return;
        }
        if (i4 >= 28) {
            b.c(location);
        } else if (i4 >= 26) {
            a.i(location);
        } else {
            v(location, "verticalAccuracy");
        }
    }
}
