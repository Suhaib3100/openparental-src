package androidx.core.location;

import android.annotation.SuppressLint;
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
import androidx.core.location.a;
import androidx.core.location.v0;
import androidx.core.location.w;
import androidx.core.os.c;
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
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final long f4927a = 30000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f4928b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f4929c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static Field f4930d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("sLocationListeners")
    static final WeakHashMap<k, WeakReference<l>> f4931e = new WeakHashMap<>();

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(19)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f4932a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f4933b;

        private a() {
        }

        @androidx.annotation.u
        static boolean a(LocationManager locationManager, String str, v0 v0Var, s sVar, Looper looper) {
            try {
                if (f4932a == null) {
                    f4932a = Class.forName("android.location.LocationRequest");
                }
                if (f4933b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4932a, LocationListener.class, Looper.class);
                    f4933b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i5 = v0Var.i(str);
                if (i5 != null) {
                    f4933b.invoke(locationManager, i5, sVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @androidx.annotation.u
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean b(LocationManager locationManager, String str, v0 v0Var, l lVar) {
            try {
                if (f4932a == null) {
                    f4932a = Class.forName("android.location.LocationRequest");
                }
                if (f4933b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4932a, LocationListener.class, Looper.class);
                    f4933b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i5 = v0Var.i(str);
                if (i5 != null) {
                    synchronized (w.f4931e) {
                        f4933b.invoke(locationManager, i5, lVar, Looper.getMainLooper());
                        w.m(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(24)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean a(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0041a abstractC0041a) {
            androidx.core.util.q.a(handler != null);
            androidx.collection.i<Object, Object> iVar = g.f4942a;
            synchronized (iVar) {
                m mVar = (m) iVar.get(abstractC0041a);
                if (mVar == null) {
                    mVar = new m(abstractC0041a);
                } else {
                    mVar.j();
                }
                mVar.i(executor);
                if (!locationManager.registerGnssStatusCallback(mVar, handler)) {
                    return false;
                }
                iVar.put(abstractC0041a, mVar);
                return true;
            }
        }

        @androidx.annotation.u
        static void b(LocationManager locationManager, Object obj) {
            if (obj instanceof m) {
                ((m) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(28)
    private static class c {
        private c() {
        }

        @androidx.annotation.u
        static String a(LocationManager locationManager) {
            String gnssHardwareModelName;
            gnssHardwareModelName = locationManager.getGnssHardwareModelName();
            return gnssHardwareModelName;
        }

        @androidx.annotation.u
        static int b(LocationManager locationManager) {
            int gnssYearOfHardware;
            gnssYearOfHardware = locationManager.getGnssYearOfHardware();
            return gnssYearOfHardware;
        }

        @androidx.annotation.u
        static boolean c(LocationManager locationManager) {
            boolean isLocationEnabled;
            isLocationEnabled = locationManager.isLocationEnabled();
            return isLocationEnabled;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(30)
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f4934a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f4935b;

        private d() {
        }

        @androidx.annotation.u
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void a(LocationManager locationManager, @androidx.annotation.o0 String str, @androidx.annotation.q0 androidx.core.os.c cVar, @androidx.annotation.o0 Executor executor, @androidx.annotation.o0 final androidx.core.util.c<Location> cVar2) {
            CancellationSignal cancellationSignal = cVar != null ? (CancellationSignal) cVar.b() : null;
            Objects.requireNonNull(cVar2);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.c0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    androidx.core.util.c.this.accept((Location) obj);
                }
            });
        }

        @androidx.annotation.u
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0041a abstractC0041a) {
            boolean registerGnssStatusCallback;
            androidx.collection.i<Object, Object> iVar = g.f4942a;
            synchronized (iVar) {
                h hVar = (h) iVar.get(abstractC0041a);
                if (hVar == null) {
                    hVar = new h(abstractC0041a);
                }
                registerGnssStatusCallback = locationManager.registerGnssStatusCallback(executor, hVar);
                if (!registerGnssStatusCallback) {
                    return false;
                }
                iVar.put(abstractC0041a, hVar);
                return true;
            }
        }

        @androidx.annotation.u
        public static boolean c(LocationManager locationManager, String str, v0 v0Var, Executor executor, s sVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f4934a == null) {
                        f4934a = Class.forName("android.location.LocationRequest");
                    }
                    if (f4935b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4934a, Executor.class, LocationListener.class);
                        f4935b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i5 = v0Var.i(str);
                    if (i5 != null) {
                        f4935b.invoke(locationManager, i5, executor, sVar);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(31)
    private static class e {
        private e() {
        }

        @androidx.annotation.u
        static boolean a(LocationManager locationManager, @androidx.annotation.o0 String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        @androidx.annotation.u
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void b(LocationManager locationManager, @androidx.annotation.o0 String str, @androidx.annotation.o0 LocationRequest locationRequest, @androidx.annotation.o0 Executor executor, @androidx.annotation.o0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    static final class f implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f4936a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f4937b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f4938c = new Handler(Looper.getMainLooper());

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.util.c<Location> f4939d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f4940e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        Runnable f4941f;

        f(LocationManager locationManager, Executor executor, androidx.core.util.c<Location> cVar) {
            this.f4936a = locationManager;
            this.f4937b = executor;
            this.f4939d = cVar;
        }

        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.f4939d = null;
            this.f4936a.removeUpdates(this);
            Runnable runnable = this.f4941f;
            if (runnable != null) {
                this.f4938c.removeCallbacks(runnable);
                this.f4941f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f4941f = null;
            onLocationChanged((Location) null);
        }

        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                if (this.f4940e) {
                    return;
                }
                this.f4940e = true;
                d();
            }
        }

        @SuppressLint({"MissingPermission"})
        public void g(long j5) {
            synchronized (this) {
                if (this.f4940e) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: androidx.core.location.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.f.this.f();
                    }
                };
                this.f4941f = runnable;
                this.f4938c.postDelayed(runnable, j5);
            }
        }

        @Override // android.location.LocationListener
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@androidx.annotation.q0 final Location location) {
            synchronized (this) {
                if (this.f4940e) {
                    return;
                }
                this.f4940e = true;
                final androidx.core.util.c<Location> cVar = this.f4939d;
                this.f4937b.execute(new Runnable() { // from class: androidx.core.location.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.util.c.this.accept(location);
                    }
                });
                d();
            }
        }

        @Override // android.location.LocationListener
        @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@androidx.annotation.o0 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.o0 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i5, Bundle bundle) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("sGnssStatusListeners")
        static final androidx.collection.i<Object, Object> f4942a = new androidx.collection.i<>();

        private g() {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(30)
    private static class h extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final a.AbstractC0041a f4943a;

        h(a.AbstractC0041a abstractC0041a) {
            androidx.core.util.q.b(abstractC0041a != null, "invalid null callback");
            this.f4943a = abstractC0041a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i5) {
            this.f4943a.a(i5);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f4943a.b(new androidx.core.location.d(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f4943a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f4943a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    static class i implements GpsStatus.Listener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f4944a;

        /* renamed from: b, reason: collision with root package name */
        final a.AbstractC0041a f4945b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        volatile Executor f4946c;

        i(LocationManager locationManager, a.AbstractC0041a abstractC0041a) {
            androidx.core.util.q.b(abstractC0041a != null, "invalid null callback");
            this.f4944a = locationManager;
            this.f4945b = abstractC0041a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor) {
            if (this.f4946c != executor) {
                return;
            }
            this.f4945b.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor) {
            if (this.f4946c != executor) {
                return;
            }
            this.f4945b.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor, int i5) {
            if (this.f4946c != executor) {
                return;
            }
            this.f4945b.a(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor, androidx.core.location.a aVar) {
            if (this.f4946c != executor) {
                return;
            }
            this.f4945b.b(aVar);
        }

        public void i(Executor executor) {
            androidx.core.util.q.o(this.f4946c == null, null);
            this.f4946c = executor;
        }

        public void j() {
            this.f4946c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @androidx.annotation.b1("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i5) {
            GpsStatus gpsStatus;
            final Executor executor = this.f4946c;
            if (executor == null) {
                return;
            }
            if (i5 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.i.this.e(executor);
                    }
                });
                return;
            }
            if (i5 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.i.this.f(executor);
                    }
                });
                return;
            }
            if (i5 != 3) {
                if (i5 == 4 && (gpsStatus = this.f4944a.getGpsStatus(null)) != null) {
                    final androidx.core.location.g gVar = new androidx.core.location.g(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.i.this.h(executor, gVar);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f4944a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.i.this.g(executor, timeToFirstFix);
                    }
                });
            }
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static final class j implements Executor {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f4947o;

        j(@androidx.annotation.o0 Handler handler) {
            handler.getClass();
            this.f4947o = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.o0 Runnable runnable) {
            if (Looper.myLooper() == this.f4947o.getLooper()) {
                runnable.run();
                return;
            }
            Handler handler = this.f4947o;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f4947o + " is shutting down");
        }
    }

    /* compiled from: LocationManagerCompat.java */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        final String f4948a;

        /* renamed from: b, reason: collision with root package name */
        final s f4949b;

        k(String str, s sVar) {
            this.f4948a = (String) androidx.core.util.l.e(str, "invalid null provider");
            this.f4949b = (s) androidx.core.util.l.e(sVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f4948a.equals(kVar.f4948a) && this.f4949b.equals(kVar.f4949b);
        }

        public int hashCode() {
            return androidx.core.util.l.b(this.f4948a, this.f4949b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    @androidx.annotation.x0(24)
    static class m extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final a.AbstractC0041a f4952a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        volatile Executor f4953b;

        m(a.AbstractC0041a abstractC0041a) {
            androidx.core.util.q.b(abstractC0041a != null, "invalid null callback");
            this.f4952a = abstractC0041a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor, int i5) {
            if (this.f4953b != executor) {
                return;
            }
            this.f4952a.a(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f4953b != executor) {
                return;
            }
            this.f4952a.b(new androidx.core.location.d(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor) {
            if (this.f4953b != executor) {
                return;
            }
            this.f4952a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor) {
            if (this.f4953b != executor) {
                return;
            }
            this.f4952a.d();
        }

        public void i(Executor executor) {
            androidx.core.util.q.b(executor != null, "invalid null executor");
            androidx.core.util.q.o(this.f4953b == null, null);
            this.f4953b = executor;
        }

        public void j() {
            this.f4953b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i5) {
            final Executor executor = this.f4953b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.t0
                @Override // java.lang.Runnable
                public final void run() {
                    w.m.this.e(executor, i5);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f4953b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.s0
                @Override // java.lang.Runnable
                public final void run() {
                    w.m.this.f(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f4953b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.r0
                @Override // java.lang.Runnable
                public final void run() {
                    w.m.this.g(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f4953b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.u0
                @Override // java.lang.Runnable
                public final void run() {
                    w.m.this.h(executor);
                }
            });
        }
    }

    private w() {
    }

    @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 String str, @androidx.annotation.q0 androidx.core.os.c cVar, @androidx.annotation.o0 Executor executor, @androidx.annotation.o0 final androidx.core.util.c<Location> cVar2) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, cVar, executor, cVar2);
            return;
        }
        if (cVar != null) {
            cVar.e();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.h.b(lastKnownLocation) < f4928b) {
            executor.execute(new Runnable() { // from class: androidx.core.location.u
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.c.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, cVar2);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (cVar != null) {
            cVar.d(new c.b() { // from class: androidx.core.location.v
                @Override // androidx.core.os.c.b
                public final void onCancel() {
                    w.f.this.c();
                }
            });
        }
        fVar.g(f4927a);
    }

    @androidx.annotation.q0
    public static String d(@androidx.annotation.o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int e(@androidx.annotation.o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean f(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 String str) {
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

    public static boolean g(@androidx.annotation.o0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? c.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(LocationManager locationManager, i iVar) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(iVar));
    }

    @androidx.annotation.b1("android.permission.ACCESS_FINE_LOCATION")
    private static boolean j(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0041a abstractC0041a) {
        return Build.VERSION.SDK_INT >= 30 ? d.b(locationManager, handler, executor, abstractC0041a) : b.a(locationManager, handler, executor, abstractC0041a);
    }

    @androidx.annotation.b1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean k(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 a.AbstractC0041a abstractC0041a, @androidx.annotation.o0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? l(locationManager, androidx.core.os.f.a(handler), abstractC0041a) : l(locationManager, new j(handler), abstractC0041a);
    }

    @androidx.annotation.b1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean l(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 Executor executor, @androidx.annotation.o0 a.AbstractC0041a abstractC0041a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j(locationManager, null, executor, abstractC0041a);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return j(locationManager, new Handler(myLooper), executor, abstractC0041a);
    }

    @androidx.annotation.b0("sLocationListeners")
    @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    static void m(LocationManager locationManager, l lVar) {
        WeakReference<l> put = f4931e.put(lVar.g(), new WeakReference<>(lVar));
        l lVar2 = put != null ? put.get() : null;
        if (lVar2 != null) {
            lVar2.n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void n(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 s sVar) {
        WeakHashMap<k, WeakReference<l>> weakHashMap = f4931e;
        synchronized (weakHashMap) {
            Iterator<WeakReference<l>> it = weakHashMap.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                l lVar = it.next().get();
                if (lVar != null) {
                    k g5 = lVar.g();
                    if (g5.f4949b == sVar) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(g5);
                        lVar.n();
                        locationManager.removeUpdates(lVar);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f4931e.remove((k) it2.next());
                }
            }
        }
        locationManager.removeUpdates(sVar);
    }

    @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void o(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 String str, @androidx.annotation.o0 v0 v0Var, @androidx.annotation.o0 s sVar, @androidx.annotation.o0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            v0Var.getClass();
            e.b(locationManager, str, v0.b.a(v0Var), androidx.core.os.f.a(new Handler(looper)), sVar);
        } else {
            if (a.a(locationManager, str, v0Var, sVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, v0Var.f4908b, v0Var.f4912f, sVar, looper);
        }
    }

    @androidx.annotation.b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void p(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 String str, @androidx.annotation.o0 v0 v0Var, @androidx.annotation.o0 Executor executor, @androidx.annotation.o0 s sVar) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            v0Var.getClass();
            e.b(locationManager, str, v0.b.a(v0Var), executor, sVar);
        } else if (i5 < 30 || !d.c(locationManager, str, v0Var, executor, sVar)) {
            l lVar = new l(new k(str, sVar), executor);
            if (a.b(locationManager, str, v0Var, lVar)) {
                return;
            }
            synchronized (f4931e) {
                locationManager.requestLocationUpdates(str, v0Var.f4908b, v0Var.f4912f, lVar, Looper.getMainLooper());
                m(locationManager, lVar);
            }
        }
    }

    public static void q(@androidx.annotation.o0 LocationManager locationManager, @androidx.annotation.o0 a.AbstractC0041a abstractC0041a) {
        androidx.collection.i<Object, Object> iVar = g.f4942a;
        synchronized (iVar) {
            Object remove = iVar.remove(abstractC0041a);
            if (remove != null) {
                b.b(locationManager, remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationManagerCompat.java */
    static class l implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        volatile k f4950a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f4951b;

        l(@androidx.annotation.q0 k kVar, Executor executor) {
            this.f4950a = kVar;
            this.f4951b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i5) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onFlushComplete(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i5, Bundle bundle) {
            k kVar = this.f4950a;
            if (kVar == null) {
                return;
            }
            kVar.f4949b.onStatusChanged(str, i5, bundle);
        }

        public k g() {
            k kVar = this.f4950a;
            kVar.getClass();
            return kVar;
        }

        public void n() {
            this.f4950a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i5) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.m0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.h(i5);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.o0 final Location location) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.p0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@androidx.annotation.o0 final String str) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.o0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.o0 final String str) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.l0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i5, final Bundle bundle) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.q0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.m(str, i5, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.o0 final List<Location> list) {
            if (this.f4950a == null) {
                return;
            }
            this.f4951b.execute(new Runnable() { // from class: androidx.core.location.n0
                @Override // java.lang.Runnable
                public final void run() {
                    w.l.this.j(list);
                }
            });
        }
    }
}
