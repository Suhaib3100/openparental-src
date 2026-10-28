package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.content.r;
import java.util.Calendar;
import org.apache.log4j.helpers.FileWatchdog;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: d, reason: collision with root package name */
    private static final String f414d = "TwilightManager";

    /* renamed from: e, reason: collision with root package name */
    private static final int f415e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f416f = 22;

    /* renamed from: g, reason: collision with root package name */
    private static p f417g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f418a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f419b;

    /* renamed from: c, reason: collision with root package name */
    private final a f420c = new a();

    /* compiled from: TwilightManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f421a;

        /* renamed from: b, reason: collision with root package name */
        long f422b;

        /* renamed from: c, reason: collision with root package name */
        long f423c;

        /* renamed from: d, reason: collision with root package name */
        long f424d;

        /* renamed from: e, reason: collision with root package name */
        long f425e;

        /* renamed from: f, reason: collision with root package name */
        long f426f;

        a() {
        }
    }

    @m1
    p(@o0 Context context, @o0 LocationManager locationManager) {
        this.f418a = context;
        this.f419b = locationManager;
    }

    static p a(@o0 Context context) {
        if (f417g == null) {
            Context applicationContext = context.getApplicationContext();
            f417g = new p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f417g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c6 = r.d(this.f418a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c7 = r.d(this.f418a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c7 == null || c6 == null) ? c7 != null ? c7 : c6 : c7.getTime() > c6.getTime() ? c7 : c6;
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f419b.isProviderEnabled(str)) {
                return this.f419b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f420c.f426f > System.currentTimeMillis();
    }

    @m1
    static void f(p pVar) {
        f417g = pVar;
    }

    private void g(@o0 Location location) {
        long j5;
        a aVar = this.f420c;
        long currentTimeMillis = System.currentTimeMillis();
        o b6 = o.b();
        b6.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j6 = b6.f411a;
        b6.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z5 = b6.f413c == 1;
        long j7 = b6.f412b;
        long j8 = b6.f411a;
        b6.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j9 = b6.f412b;
        if (j7 == -1 || j8 == -1) {
            j5 = currentTimeMillis + 43200000;
        } else {
            j5 = (currentTimeMillis > j8 ? 0 + j9 : currentTimeMillis > j7 ? 0 + j8 : 0 + j7) + FileWatchdog.DEFAULT_DELAY;
        }
        aVar.f421a = z5;
        aVar.f422b = j6;
        aVar.f423c = j7;
        aVar.f424d = j8;
        aVar.f425e = j9;
        aVar.f426f = j5;
    }

    boolean d() {
        a aVar = this.f420c;
        if (e()) {
            return aVar.f421a;
        }
        Location b6 = b();
        if (b6 != null) {
            g(b6);
            return aVar.f421a;
        }
        int i5 = Calendar.getInstance().get(11);
        return i5 < 6 || i5 >= 22;
    }
}
