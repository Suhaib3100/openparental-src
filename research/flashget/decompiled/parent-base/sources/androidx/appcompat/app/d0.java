package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.content.g0;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class d0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f871d = "TwilightManager";

    /* renamed from: e, reason: collision with root package name */
    private static final int f872e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f873f = 22;

    /* renamed from: g, reason: collision with root package name */
    private static d0 f874g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f875a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f876b;

    /* renamed from: c, reason: collision with root package name */
    private final a f877c = new a();

    /* compiled from: TwilightManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f878a;

        /* renamed from: b, reason: collision with root package name */
        long f879b;

        a() {
        }
    }

    @m1
    d0(@o0 Context context, @o0 LocationManager locationManager) {
        this.f875a = context;
        this.f876b = locationManager;
    }

    static d0 a(@o0 Context context) {
        if (f874g == null) {
            Context applicationContext = context.getApplicationContext();
            f874g = new d0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f874g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c5 = g0.d(this.f875a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c6 = g0.d(this.f875a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c6 == null || c5 == null) ? c6 != null ? c6 : c5 : c6.getTime() > c5.getTime() ? c6 : c5;
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f876b.isProviderEnabled(str)) {
                return this.f876b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f877c.f879b > System.currentTimeMillis();
    }

    @m1
    static void f(d0 d0Var) {
        f874g = d0Var;
    }

    private void g(@o0 Location location) {
        long j4;
        a aVar = this.f877c;
        long currentTimeMillis = System.currentTimeMillis();
        c0 b5 = c0.b();
        b5.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b5.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z4 = b5.f870c == 1;
        long j5 = b5.f869b;
        long j6 = b5.f868a;
        b5.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j7 = b5.f869b;
        if (j5 == -1 || j6 == -1) {
            j4 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j6) {
                j7 = currentTimeMillis > j5 ? j6 : j5;
            }
            j4 = j7 + 60000;
        }
        aVar.f878a = z4;
        aVar.f879b = j4;
    }

    boolean d() {
        a aVar = this.f877c;
        if (e()) {
            return aVar.f878a;
        }
        Location b5 = b();
        if (b5 != null) {
            g(b5);
            return aVar.f878a;
        }
        int i4 = Calendar.getInstance().get(11);
        return i4 < 6 || i4 >= 22;
    }
}
