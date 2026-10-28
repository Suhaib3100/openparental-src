package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: GnssStatusCompat.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4829a = 0;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4830b = 1;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4831c = 2;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4832d = 3;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4833e = 4;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4834f = 5;

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4835g = 6;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f4836h = 7;

    /* compiled from: GnssStatusCompat.java */
    /* renamed from: androidx.core.location.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0041a {
        public void a(@androidx.annotation.g0(from = 0) int i5) {
        }

        public void b(@androidx.annotation.o0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    /* compiled from: GnssStatusCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    a() {
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(24)
    public static a n(@androidx.annotation.o0 GnssStatus gnssStatus) {
        return new d(gnssStatus);
    }

    @androidx.annotation.o0
    @SuppressLint({"ReferencesDeprecated"})
    public static a o(@androidx.annotation.o0 GpsStatus gpsStatus) {
        return new g(gpsStatus);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 360.0d)
    public abstract float a(@androidx.annotation.g0(from = 0) int i5);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 63.0d)
    public abstract float b(@androidx.annotation.g0(from = 0) int i5);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o)
    public abstract float c(@androidx.annotation.g0(from = 0) int i5);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 63.0d)
    public abstract float d(@androidx.annotation.g0(from = 0) int i5);

    public abstract int e(@androidx.annotation.g0(from = 0) int i5);

    @androidx.annotation.x(from = -90.0d, to = 90.0d)
    public abstract float f(@androidx.annotation.g0(from = 0) int i5);

    @androidx.annotation.g0(from = 0)
    public abstract int g();

    @androidx.annotation.g0(from = 1, to = 200)
    public abstract int h(@androidx.annotation.g0(from = 0) int i5);

    public abstract boolean i(@androidx.annotation.g0(from = 0) int i5);

    public abstract boolean j(@androidx.annotation.g0(from = 0) int i5);

    public abstract boolean k(@androidx.annotation.g0(from = 0) int i5);

    public abstract boolean l(@androidx.annotation.g0(from = 0) int i5);

    public abstract boolean m(@androidx.annotation.g0(from = 0) int i5);
}
