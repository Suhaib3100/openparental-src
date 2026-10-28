package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.collection.a3;
import androidx.core.location.a;
import androidx.core.location.e0;
import androidx.core.location.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;

/* compiled from: LocationManagerCompat.java */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final long f26406a = 30000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f26407b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f26408c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static Field f26409d;

    /* renamed from: e, reason: collision with root package name */
    private static Class<?> f26410e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f26411f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f26412g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("sLocationListeners")
    static final WeakHashMap<l, WeakReference<m>> f26413h = new WeakHashMap<>();

    /* compiled from: LocationManagerCompat.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f26414a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f26415b;

        private a() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean a(LocationManager locationManager, String str, e0 e0Var, androidx.core.location.f fVar, Looper looper) {
            try {
                if (f26414a == null) {
                    f26414a = Class.forName("android.location.LocationRequest");
                }
                if (f26415b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f26414a, LocationListener.class, Looper.class);
                    f26415b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i4 = e0Var.i(str);
                if (i4 == null) {
                    return false;
                }
                f26415b.invoke(locationManager, i4, fVar, looper);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean b(LocationManager locationManager, String str, e0 e0Var, m mVar) {
            try {
                if (f26414a == null) {
                    f26414a = Class.forName("android.location.LocationRequest");
                }
                if (f26415b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f26414a, LocationListener.class, Looper.class);
                    f26415b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i4 = e0Var.i(str);
                if (i4 == null) {
                    return false;
                }
                synchronized (j.f26413h) {
                    f26415b.invoke(locationManager, i4, mVar, Looper.getMainLooper());
                    j.q(locationManager, mVar);
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        @b1("android.permission.ACCESS_FINE_LOCATION")
        static boolean a(@o0 LocationManager locationManager, @o0 GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        @b1("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(@o0 LocationManager locationManager, @o0 GnssMeasurementsEvent.Callback callback, @o0 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean c(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0416a abstractC0416a) {
            androidx.core.util.w.a(handler != null);
            a3<Object, Object> a3Var = g.f26424a;
            synchronized (a3Var) {
                try {
                    n nVar = (n) a3Var.get(abstractC0416a);
                    if (nVar == null) {
                        nVar = new n(abstractC0416a);
                    } else {
                        nVar.j();
                    }
                    nVar.i(executor);
                    if (!locationManager.registerGnssStatusCallback(nVar, handler)) {
                        return false;
                    }
                    a3Var.put(abstractC0416a, nVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void d(@o0 LocationManager locationManager, @o0 GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof n) {
                ((n) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @x0(28)
    private static class c {
        private c() {
        }

        static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @x0(30)
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f26416a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f26417b;

        private d() {
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void a(LocationManager locationManager, @o0 String str, @q0 CancellationSignal cancellationSignal, @o0 Executor executor, @o0 final androidx.core.util.e<Location> eVar) {
            Objects.requireNonNull(eVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.k
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    androidx.core.util.e.this.accept((Location) obj);
                }
            });
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0416a abstractC0416a) {
            a3<Object, Object> a3Var = g.f26424a;
            synchronized (a3Var) {
                try {
                    i iVar = (i) a3Var.get(abstractC0416a);
                    if (iVar == null) {
                        iVar = new i(abstractC0416a);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, iVar)) {
                        return false;
                    }
                    a3Var.put(abstractC0416a, iVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean c(LocationManager locationManager, String str, e0 e0Var, Executor executor, androidx.core.location.f fVar) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            try {
                if (f26416a == null) {
                    f26416a = Class.forName("android.location.LocationRequest");
                }
                if (f26417b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f26416a, Executor.class, LocationListener.class);
                    f26417b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i4 = e0Var.i(str);
                if (i4 == null) {
                    return false;
                }
                f26417b.invoke(locationManager, i4, executor, fVar);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @x0(31)
    private static class e {
        private e() {
        }

        static boolean a(LocationManager locationManager, @o0 String str) {
            return locationManager.hasProvider(str);
        }

        @b1("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(@o0 LocationManager locationManager, @o0 Executor executor, @o0 GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void c(LocationManager locationManager, @o0 String str, @o0 LocationRequest locationRequest, @o0 Executor executor, @o0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    static final class f implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f26418a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f26419b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f26420c = new Handler(Looper.getMainLooper());

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.util.e<Location> f26421d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f26422e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        Runnable f26423f;

        f(LocationManager locationManager, Executor executor, androidx.core.util.e<Location> eVar) {
            this.f26418a = locationManager;
            this.f26419b = executor;
            this.f26421d = eVar;
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.f26421d = null;
            this.f26418a.removeUpdates(this);
            Runnable runnable = this.f26423f;
            if (runnable != null) {
                this.f26420c.removeCallbacks(runnable);
                this.f26423f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f26423f = null;
            onLocationChanged((Location) null);
        }

        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                try {
                    if (this.f26422e) {
                        return;
                    }
                    this.f26422e = true;
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        public void g(long j4) {
            synchronized (this) {
                try {
                    if (this.f26422e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: androidx.core.location.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.f.this.f();
                        }
                    };
                    this.f26423f = runnable;
                    this.f26420c.postDelayed(runnable, j4);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@q0 final Location location) {
            synchronized (this) {
                try {
                    if (this.f26422e) {
                        return;
                    }
                    this.f26422e = true;
                    final androidx.core.util.e<Location> eVar = this.f26421d;
                    this.f26419b.execute(new Runnable() { // from class: androidx.core.location.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.util.e.this.accept(location);
                        }
                    });
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@o0 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@o0 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i4, Bundle bundle) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("sGnssStatusListeners")
        static final a3<Object, Object> f26424a = new a3<>();

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("sGnssMeasurementListeners")
        static final a3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> f26425b = new a3<>();

        private g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    @x0(24)
    static class h extends GnssMeasurementsEvent.Callback {

        /* renamed from: a, reason: collision with root package name */
        final GnssMeasurementsEvent.Callback f26426a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        volatile Executor f26427b;

        h(@o0 GnssMeasurementsEvent.Callback callback, @o0 Executor executor) {
            this.f26426a = callback;
            this.f26427b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.f26427b != executor) {
                return;
            }
            this.f26426a.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Executor executor, int i4) {
            if (this.f26427b != executor) {
                return;
            }
            this.f26426a.onStatusChanged(i4);
        }

        public void e() {
            this.f26427b = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.f26427b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.n
                @Override // java.lang.Runnable
                public final void run() {
                    j.h.this.c(executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i4) {
            final Executor executor = this.f26427b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.o
                @Override // java.lang.Runnable
                public final void run() {
                    j.h.this.d(executor, i4);
                }
            });
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @x0(30)
    private static class i extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final a.AbstractC0416a f26428a;

        i(a.AbstractC0416a abstractC0416a) {
            androidx.core.util.w.b(abstractC0416a != null, "invalid null callback");
            this.f26428a = abstractC0416a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i4) {
            this.f26428a.a(i4);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f26428a.b(new androidx.core.location.b(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f26428a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f26428a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    /* renamed from: androidx.core.location.j$j, reason: collision with other inner class name */
    static class C0419j implements GpsStatus.Listener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f26429a;

        /* renamed from: b, reason: collision with root package name */
        final a.AbstractC0416a f26430b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        volatile Executor f26431c;

        C0419j(LocationManager locationManager, a.AbstractC0416a abstractC0416a) {
            androidx.core.util.w.b(abstractC0416a != null, "invalid null callback");
            this.f26429a = locationManager;
            this.f26430b = abstractC0416a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor) {
            if (this.f26431c != executor) {
                return;
            }
            this.f26430b.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor) {
            if (this.f26431c != executor) {
                return;
            }
            this.f26430b.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor, int i4) {
            if (this.f26431c != executor) {
                return;
            }
            this.f26430b.a(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor, androidx.core.location.a aVar) {
            if (this.f26431c != executor) {
                return;
            }
            this.f26430b.b(aVar);
        }

        public void i(Executor executor) {
            androidx.core.util.w.o(this.f26431c == null, null);
            this.f26431c = executor;
        }

        public void j() {
            this.f26431c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @b1("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i4) {
            GpsStatus gpsStatus;
            final Executor executor = this.f26431c;
            if (executor == null) {
                return;
            }
            if (i4 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0419j.this.e(executor);
                    }
                });
                return;
            }
            if (i4 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0419j.this.f(executor);
                    }
                });
                return;
            }
            if (i4 != 3) {
                if (i4 == 4 && (gpsStatus = this.f26429a.getGpsStatus(null)) != null) {
                    final androidx.core.location.c cVar = new androidx.core.location.c(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.C0419j.this.h(executor, cVar);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f26429a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0419j.this.g(executor, timeToFirstFix);
                    }
                });
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static final class k implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f26432b;

        k(@o0 Handler handler) {
            handler.getClass();
            this.f26432b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            if (Looper.myLooper() == this.f26432b.getLooper()) {
                runnable.run();
                return;
            }
            Handler handler = this.f26432b;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f26432b + " is shutting down");
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        final String f26433a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.core.location.f f26434b;

        l(String str, androidx.core.location.f fVar) {
            this.f26433a = (String) androidx.core.util.r.e(str, "invalid null provider");
            this.f26434b = (androidx.core.location.f) androidx.core.util.r.e(fVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f26433a.equals(lVar.f26433a) && this.f26434b.equals(lVar.f26434b);
        }

        public int hashCode() {
            return Objects.hash(this.f26433a, this.f26434b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    @x0(24)
    static class n extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final a.AbstractC0416a f26437a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        volatile Executor f26438b;

        n(a.AbstractC0416a abstractC0416a) {
            androidx.core.util.w.b(abstractC0416a != null, "invalid null callback");
            this.f26437a = abstractC0416a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor, int i4) {
            if (this.f26438b != executor) {
                return;
            }
            this.f26437a.a(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f26438b != executor) {
                return;
            }
            this.f26437a.b(new androidx.core.location.b(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor) {
            if (this.f26438b != executor) {
                return;
            }
            this.f26437a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor) {
            if (this.f26438b != executor) {
                return;
            }
            this.f26437a.d();
        }

        public void i(Executor executor) {
            androidx.core.util.w.b(executor != null, "invalid null executor");
            androidx.core.util.w.o(this.f26438b == null, null);
            this.f26438b = executor;
        }

        public void j() {
            this.f26438b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i4) {
            final Executor executor = this.f26438b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.z
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.this.e(executor, i4);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f26438b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.a0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.this.f(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f26438b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.c0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.this.g(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f26438b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.b0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.this.h(executor);
                }
            });
        }
    }

    private j() {
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@o0 LocationManager locationManager, @o0 String str, @q0 CancellationSignal cancellationSignal, @o0 Executor executor, @o0 final androidx.core.util.e<Location> eVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, cancellationSignal, executor, eVar);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.d.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: androidx.core.location.g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.e.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, eVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.core.location.h
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    j.f.this.c();
                }
            });
        }
        fVar.g(30000L);
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    public static void d(@o0 LocationManager locationManager, @o0 String str, @q0 androidx.core.os.f fVar, @o0 Executor executor, @o0 androidx.core.util.e<Location> eVar) {
        c(locationManager, str, fVar != null ? (CancellationSignal) fVar.b() : null, executor, eVar);
    }

    @q0
    public static String e(@o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int f(@o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean g(@o0 LocationManager locationManager, @o0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean h(@o0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? c.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean j(LocationManager locationManager, C0419j c0419j) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c0419j));
    }

    @b1("android.permission.ACCESS_FINE_LOCATION")
    @x0(24)
    public static boolean k(@o0 LocationManager locationManager, @o0 GnssMeasurementsEvent.Callback callback, @o0 Handler handler) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 30) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }
        if (i4 == 30) {
            return m(locationManager, androidx.core.os.j.a(handler), callback);
        }
        a3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> a3Var = g.f26425b;
        synchronized (a3Var) {
            try {
                u(locationManager, callback);
                if (!locationManager.registerGnssMeasurementsCallback(callback, handler)) {
                    return false;
                }
                a3Var.put(callback, callback);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @b1("android.permission.ACCESS_FINE_LOCATION")
    @x0(24)
    public static boolean l(@o0 LocationManager locationManager, @o0 Executor executor, @o0 GnssMeasurementsEvent.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 30) {
            return e.b(locationManager, executor, callback);
        }
        if (i4 == 30) {
            return m(locationManager, executor, callback);
        }
        a3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> a3Var = g.f26425b;
        synchronized (a3Var) {
            try {
                h hVar = new h(callback, executor);
                u(locationManager, callback);
                if (!locationManager.registerGnssMeasurementsCallback(hVar)) {
                    return false;
                }
                a3Var.put(callback, hVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @x0(30)
    private static boolean m(@o0 LocationManager locationManager, @o0 Executor executor, @o0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f26410e == null) {
                f26410e = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f26411f == null) {
                Method declaredMethod = f26410e.getDeclaredMethod("build", null);
                f26411f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f26412g == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                f26412g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object invoke = f26412g.invoke(locationManager, f26411f.invoke(f26410e.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @b1("android.permission.ACCESS_FINE_LOCATION")
    private static boolean n(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0416a abstractC0416a) {
        return Build.VERSION.SDK_INT >= 30 ? d.b(locationManager, handler, executor, abstractC0416a) : b.c(locationManager, handler, executor, abstractC0416a);
    }

    @b1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean o(@o0 LocationManager locationManager, @o0 a.AbstractC0416a abstractC0416a, @o0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? p(locationManager, androidx.core.os.j.a(handler), abstractC0416a) : p(locationManager, new k(handler), abstractC0416a);
    }

    @b1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean p(@o0 LocationManager locationManager, @o0 Executor executor, @o0 a.AbstractC0416a abstractC0416a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n(locationManager, null, executor, abstractC0416a);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return n(locationManager, new Handler(myLooper), executor, abstractC0416a);
    }

    @androidx.annotation.b0("sLocationListeners")
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    static void q(LocationManager locationManager, m mVar) {
        WeakReference<m> put = f26413h.put(mVar.g(), new WeakReference<>(mVar));
        m mVar2 = put != null ? put.get() : null;
        if (mVar2 != null) {
            mVar2.n();
            locationManager.removeUpdates(mVar2);
        }
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(@o0 LocationManager locationManager, @o0 androidx.core.location.f fVar) {
        WeakHashMap<l, WeakReference<m>> weakHashMap = f26413h;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<m>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    m mVar = it.next().get();
                    if (mVar != null) {
                        l g4 = mVar.g();
                        if (g4.f26434b == fVar) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(g4);
                            mVar.n();
                            locationManager.removeUpdates(mVar);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f26413h.remove((l) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(fVar);
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void s(@o0 LocationManager locationManager, @o0 String str, @o0 e0 e0Var, @o0 androidx.core.location.f fVar, @o0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e0Var.getClass();
            e.c(locationManager, str, e0.b.a(e0Var), androidx.core.os.j.a(new Handler(looper)), fVar);
        } else {
            if (a.a(locationManager, str, e0Var, fVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, e0Var.f26382b, e0Var.f26386f, fVar, looper);
        }
    }

    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void t(@o0 LocationManager locationManager, @o0 String str, @o0 e0 e0Var, @o0 Executor executor, @o0 androidx.core.location.f fVar) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            e0Var.getClass();
            e.c(locationManager, str, e0.b.a(e0Var), executor, fVar);
        } else if (i4 < 30 || !d.c(locationManager, str, e0Var, executor, fVar)) {
            m mVar = new m(new l(str, fVar), executor);
            if (a.b(locationManager, str, e0Var, mVar)) {
                return;
            }
            synchronized (f26413h) {
                locationManager.requestLocationUpdates(str, e0Var.f26382b, e0Var.f26386f, mVar, Looper.getMainLooper());
                q(locationManager, mVar);
            }
        }
    }

    @x0(24)
    public static void u(@o0 LocationManager locationManager, @o0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
            return;
        }
        a3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> a3Var = g.f26425b;
        synchronized (a3Var) {
            try {
                GnssMeasurementsEvent.Callback remove = a3Var.remove(callback);
                if (remove != null) {
                    if (remove instanceof h) {
                        ((h) remove).e();
                    }
                    locationManager.unregisterGnssMeasurementsCallback(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void v(@o0 LocationManager locationManager, @o0 a.AbstractC0416a abstractC0416a) {
        a3<Object, Object> a3Var = g.f26424a;
        synchronized (a3Var) {
            try {
                Object remove = a3Var.remove(abstractC0416a);
                if (remove != null) {
                    b.e(locationManager, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    static class m implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        @q0
        volatile l f26435a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f26436b;

        m(@q0 l lVar, Executor executor) {
            this.f26435a = lVar;
            this.f26436b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i4) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onFlushComplete(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i4, Bundle bundle) {
            l lVar = this.f26435a;
            if (lVar == null) {
                return;
            }
            lVar.f26434b.onStatusChanged(str, i4, bundle);
        }

        public l g() {
            l lVar = this.f26435a;
            lVar.getClass();
            return lVar;
        }

        public void n() {
            this.f26435a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i4) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.x
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.h(i4);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@o0 final Location location) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.w
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@o0 final String str) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.u
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@o0 final String str) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.t
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i4, final Bundle bundle) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.y
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.m(str, i4, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@o0 final List<Location> list) {
            if (this.f26435a == null) {
                return;
            }
            this.f26436b.execute(new Runnable() { // from class: androidx.core.location.v
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.j(list);
                }
            });
        }
    }
}
