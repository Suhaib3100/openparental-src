package org.threeten.bp.zone;

import androidx.compose.animation.core.k1;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer.java */
/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f88467a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f88468b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<h> f88469c = new AtomicReference<>();

    /* compiled from: ZoneRulesInitializer.java */
    static class a extends h {
        a() {
        }

        @Override // org.threeten.bp.zone.h
        protected void b() {
        }
    }

    /* compiled from: ZoneRulesInitializer.java */
    static class b extends h {
        b() {
        }

        @Override // org.threeten.bp.zone.h
        protected void b() {
            Iterator it = ServiceLoader.load(i.class, i.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    i.j((i) it.next());
                } catch (ServiceConfigurationError e4) {
                    if (!(e4.getCause() instanceof SecurityException)) {
                        throw e4;
                    }
                }
            }
        }
    }

    static void a() {
        if (f88468b.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = f88469c;
        k1.a(atomicReference, null, new b());
        atomicReference.get().b();
    }

    public static void c(h hVar) {
        if (f88468b.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!k1.a(f88469c, null, hVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    protected abstract void b();
}
