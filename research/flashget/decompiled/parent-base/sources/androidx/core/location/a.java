package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: GnssStatusCompat.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26333a = 0;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26334b = 1;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26335c = 2;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26336d = 3;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26337e = 4;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26338f = 5;

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26339g = 6;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26340h = 7;

    /* compiled from: GnssStatusCompat.java */
    /* renamed from: androidx.core.location.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0416a {
        public void a(@g0(from = 0) int i4) {
        }

        public void b(@o0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    /* compiled from: GnssStatusCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    a() {
    }

    @o0
    @x0(24)
    public static a n(@o0 GnssStatus gnssStatus) {
        return new androidx.core.location.b(gnssStatus);
    }

    @o0
    @SuppressLint({"ReferencesDeprecated"})
    public static a o(@o0 GpsStatus gpsStatus) {
        return new c(gpsStatus);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 360.0d)
    public abstract float a(@g0(from = 0) int i4);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 63.0d)
    public abstract float b(@g0(from = 0) int i4);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p)
    public abstract float c(@g0(from = 0) int i4);

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 63.0d)
    public abstract float d(@g0(from = 0) int i4);

    public abstract int e(@g0(from = 0) int i4);

    @androidx.annotation.x(from = -90.0d, to = 90.0d)
    public abstract float f(@g0(from = 0) int i4);

    @g0(from = 0)
    public abstract int g();

    @g0(from = 1, to = 200)
    public abstract int h(@g0(from = 0) int i4);

    public abstract boolean i(@g0(from = 0) int i4);

    public abstract boolean j(@g0(from = 0) int i4);

    public abstract boolean k(@g0(from = 0) int i4);

    public abstract boolean l(@g0(from = 0) int i4);

    public abstract boolean m(@g0(from = 0) int i4);
}
