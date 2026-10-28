package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: FinalizableReferenceQueue.java */
@d9.c
@o
/* loaded from: classes6.dex */
public class u implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    final ReferenceQueue<Object> f55044b;

    /* renamed from: c, reason: collision with root package name */
    final PhantomReference<Object> f55045c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f55046d;

    /* renamed from: f, reason: collision with root package name */
    private static final String f55042f = ProtectedSandApp.s("\uf398");

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f55041e = Logger.getLogger(u.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final Method f55043g = c(d(new d(), new a(), new b()));

    /* compiled from: FinalizableReferenceQueue.java */
    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f55047a = ProtectedSandApp.s("\uf392");

        a() {
        }

        @Override // com.google.common.base.u.c
        @zc.a
        public Class<?> a() {
            try {
                return c(b()).loadClass(ProtectedSandApp.s("\uf391"));
            } catch (Exception e4) {
                u.f55041e.log(Level.WARNING, ProtectedSandApp.s("\uf392"), (Throwable) e4);
                return null;
            }
        }

        URL b() throws IOException {
            String concat = String.valueOf(ProtectedSandApp.s("\uf391").replace('.', '/')).concat(ProtectedSandApp.s("\uf393"));
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource == null) {
                throw new FileNotFoundException(concat);
            }
            String url = resource.toString();
            if (url.endsWith(concat)) {
                return new URL(resource, url.substring(0, url.length() - concat.length()));
            }
            int length = url.length();
            String s4 = ProtectedSandApp.s("\uf394");
            throw new IOException(length != 0 ? s4.concat(url) : new String(s4));
        }

        URLClassLoader c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* compiled from: FinalizableReferenceQueue.java */
    static class b implements c {
        b() {
        }

        @Override // com.google.common.base.u.c
        public Class<?> a() {
            try {
                return Class.forName(ProtectedSandApp.s("\uf395"));
            } catch (ClassNotFoundException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    /* compiled from: FinalizableReferenceQueue.java */
    interface c {
        @zc.a
        Class<?> a();
    }

    /* compiled from: FinalizableReferenceQueue.java */
    static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @d9.d
        static boolean f55048a;

        d() {
        }

        @Override // com.google.common.base.u.c
        @zc.a
        public Class<?> a() {
            if (f55048a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(ProtectedSandApp.s("\uf396"));
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                u.f55041e.info(ProtectedSandApp.s("\uf397"));
                return null;
            }
        }
    }

    public u() {
        boolean z4;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f55044b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f55045c = phantomReference;
        try {
            f55043g.invoke(null, t.class, referenceQueue, phantomReference);
            z4 = true;
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (Throwable th) {
            f55041e.log(Level.INFO, ProtectedSandApp.s("\uf399"), th);
            z4 = false;
        }
        this.f55046d = z4;
    }

    static Method c(Class<?> cls) {
        try {
            return cls.getMethod(ProtectedSandApp.s("\uf39a"), Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e4) {
            throw new AssertionError(e4);
        }
    }

    private static Class<?> d(c... cVarArr) {
        for (c cVar : cVarArr) {
            Class<?> a5 = cVar.a();
            if (a5 != null) {
                return a5;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b() {
        if (this.f55046d) {
            return;
        }
        while (true) {
            Reference<? extends Object> poll = this.f55044b.poll();
            if (poll == 0) {
                return;
            }
            poll.clear();
            try {
                ((t) poll).a();
            } catch (Throwable th) {
                f55041e.log(Level.SEVERE, ProtectedSandApp.s("\uf39b"), th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55045c.enqueue();
        b();
    }
}
