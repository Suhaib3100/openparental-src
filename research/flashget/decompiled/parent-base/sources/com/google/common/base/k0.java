package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: Platform.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f54953a = Logger.getLogger(k0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final j0 f54954b = new b();

    /* compiled from: Platform.java */
    private static final class b implements j0 {
        private b() {
        }

        @Override // com.google.common.base.j0
        public l a(String str) {
            return new b0(Pattern.compile(str));
        }

        @Override // com.google.common.base.j0
        public boolean b() {
            return true;
        }

        b(a aVar) {
        }
    }

    private k0() {
    }

    static void a() {
    }

    static l b(String str) {
        str.getClass();
        return f54954b.a(str);
    }

    @zc.a
    static String c(@zc.a String str) {
        if (k(str)) {
            return null;
        }
        return str;
    }

    static String d(double d5) {
        return String.format(Locale.ROOT, ProtectedSandApp.s("\uf301"), Double.valueOf(d5));
    }

    static <T extends Enum<T>> g0<T> e(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = p.a(cls).get(str);
        return weakReference == null ? com.google.common.base.a.n() : g0.f(cls.cast(weakReference.get()));
    }

    private static j0 f() {
        return new b();
    }

    private static void g(ServiceConfigurationError serviceConfigurationError) {
        f54953a.log(Level.WARNING, ProtectedSandApp.s("\uf302"), (Throwable) serviceConfigurationError);
    }

    static String h(@zc.a String str) {
        return str == null ? "" : str;
    }

    static boolean i() {
        return f54954b.b();
    }

    static f j(f fVar) {
        return fVar.K();
    }

    static boolean k(@zc.a String str) {
        return str == null || str.isEmpty();
    }

    static long l() {
        return System.nanoTime();
    }
}
