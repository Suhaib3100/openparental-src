package net.time4j.android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.d0;
import net.time4j.format.e;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.n0;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;
import net.time4j.w0;

/* compiled from: ApplicationStarter.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f81838b = 2021;

    /* renamed from: c, reason: collision with root package name */
    private static final int f81839c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final int f81840d = 27;

    /* renamed from: a, reason: collision with root package name */
    private static final String f81837a = ProtectedSandApp.s("覵\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f81841e = ProtectedSandApp.s("覶\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f81842f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f81843g = new AtomicBoolean(false);

    /* compiled from: ApplicationStarter.java */
    private static class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            System.nanoTime();
            k o4 = p.o(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
            Locale locale = Locale.getDefault();
            try {
                d0 b5 = w0.b();
                o4 = l.e0().G();
                o4.canonical();
                locale.toString();
                e eVar = e.FULL;
                net.time4j.format.expert.c.Q(eVar, eVar, locale, o4).h(b5);
                System.nanoTime();
            } catch (Throwable th) {
                o4.canonical();
                Objects.toString(locale);
                throw new IllegalStateException(th);
            }
        }

        b(C1277a c1277a) {
        }
    }

    /* compiled from: ApplicationStarter.java */
    private static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.b.a();
            l.e0().G().canonical();
            intent.getStringExtra(ProtectedSandApp.s("覴\u0001"));
        }

        c(C1277a c1277a) {
        }
    }

    private a() {
    }

    public static void a(Application application) {
        c(application, false);
    }

    public static void b(Context context, Runnable runnable) {
        System.nanoTime();
        d(context, null);
        e(context.getApplicationContext());
        l0 r12 = l0.r1(f81838b, 3, 27);
        m0 Y0 = m0.Y0();
        r12.getClass();
        Objects.toString(n0.B0(r12, Y0).H0());
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        System.nanoTime();
    }

    public static void c(Context context, boolean z4) {
        b(context, z4 ? new b() : null);
    }

    public static void d(Context context, net.time4j.android.b bVar) {
        if (f81842f.getAndSet(true)) {
            return;
        }
        System.setProperty(ProtectedSandApp.s("覷\u0001"), ProtectedSandApp.s("覸\u0001"));
        ((AndroidResourceLoader) net.time4j.base.d.c()).j(context, bVar);
    }

    public static void e(Context context) {
        if (context == null || f81843g.getAndSet(true)) {
            return;
        }
        System.setProperty(ProtectedSandApp.s("覹\u0001"), ProtectedSandApp.s("覺\u0001"));
        context.registerReceiver(new c(), new IntentFilter(ProtectedSandApp.s("覻\u0001")));
    }
}
