package com.google.common.eventbus;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.util.concurrent.g1;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: EventBus.java */
@e
/* loaded from: classes6.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f56721f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final String f56722a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f56723b;

    /* renamed from: c, reason: collision with root package name */
    private final l f56724c;

    /* renamed from: d, reason: collision with root package name */
    private final m f56725d;

    /* renamed from: e, reason: collision with root package name */
    private final d f56726e;

    /* compiled from: EventBus.java */
    static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        static final a f56727a = new a();

        a() {
        }

        private static Logger b(k kVar) {
            String name = f.class.getName();
            String c5 = kVar.b().c();
            StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(c5, name.length() + 1));
            sb.append(name);
            sb.append(ProtectedSandApp.s("\uf59b"));
            sb.append(c5);
            return Logger.getLogger(sb.toString());
        }

        private static String c(k kVar) {
            Method d5 = kVar.d();
            String name = d5.getName();
            String name2 = d5.getParameterTypes()[0].getName();
            String valueOf = String.valueOf(kVar.c());
            String valueOf2 = String.valueOf(kVar.a());
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + name2.length() + com.google.android.gms.common.internal.b.a(name, 80));
            sb.append(ProtectedSandApp.s("\uf59c"));
            sb.append(name);
            sb.append('(');
            sb.append(name2);
            return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("\uf59d"), valueOf, ProtectedSandApp.s("\uf59e"), valueOf2);
        }

        @Override // com.google.common.eventbus.l
        public void a(Throwable th, k kVar) {
            Logger b5 = b(kVar);
            Level level = Level.SEVERE;
            if (b5.isLoggable(level)) {
                b5.log(level, c(kVar), th);
            }
        }
    }

    public f() {
        this(ProtectedSandApp.s("\uf596"));
    }

    final Executor a() {
        return this.f56723b;
    }

    void b(Throwable th, k kVar) {
        th.getClass();
        kVar.getClass();
        try {
            this.f56724c.a(th, kVar);
        } catch (Throwable th2) {
            f56721f.log(Level.SEVERE, String.format(Locale.ROOT, ProtectedSandApp.s("\uf597"), th2, th), th2);
        }
    }

    public final String c() {
        return this.f56722a;
    }

    public void d(Object obj) {
        Iterator<j> f4 = this.f56725d.f(obj);
        if (f4.hasNext()) {
            this.f56726e.a(obj, f4);
        } else {
            if (obj instanceof c) {
                return;
            }
            d(new c(this, obj));
        }
    }

    public void e(Object obj) {
        this.f56725d.h(obj);
    }

    public void f(Object obj) {
        this.f56725d.i(obj);
    }

    public String toString() {
        return d0.c(this).s(this.f56722a).toString();
    }

    public f(String str) {
        this(str, g1.c(), d.d(), a.f56727a);
    }

    public f(l lVar) {
        this(ProtectedSandApp.s("\uf596"), g1.c(), d.d(), lVar);
    }

    f(String str, Executor executor, d dVar, l lVar) {
        this.f56725d = new m(this);
        str.getClass();
        this.f56722a = str;
        executor.getClass();
        this.f56723b = executor;
        dVar.getClass();
        this.f56726e = dVar;
        lVar.getClass();
        this.f56724c = lVar;
    }
}
