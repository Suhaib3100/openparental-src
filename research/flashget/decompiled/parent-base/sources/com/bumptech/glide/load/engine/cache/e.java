package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.b;
import com.bumptech.glide.load.engine.cache.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes3.dex */
public class e implements a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f43942f = ProtectedSandApp.s("࣊");

    /* renamed from: g, reason: collision with root package name */
    private static final int f43943g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f43944h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static e f43945i;

    /* renamed from: b, reason: collision with root package name */
    private final File f43947b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43948c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.disklrucache.b f43950e;

    /* renamed from: d, reason: collision with root package name */
    private final c f43949d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final m f43946a = new m();

    @Deprecated
    protected e(File file, long j4) {
        this.f43947b = file;
        this.f43948c = j4;
    }

    public static a d(File file, long j4) {
        return new e(file, j4);
    }

    @Deprecated
    public static synchronized a e(File file, long j4) {
        e eVar;
        synchronized (e.class) {
            try {
                if (f43945i == null) {
                    f43945i = new e(file, j4);
                }
                eVar = f43945i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    private synchronized com.bumptech.glide.disklrucache.b f() throws IOException {
        try {
            if (this.f43950e == null) {
                this.f43950e = com.bumptech.glide.disklrucache.b.D(this.f43947b, 1, 1, this.f43948c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f43950e;
    }

    private synchronized void g() {
        this.f43950e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.f fVar, a.b bVar) {
        com.bumptech.glide.disklrucache.b f4;
        String s4 = ProtectedSandApp.s("࣊");
        String s5 = ProtectedSandApp.s("࣋");
        String b5 = this.f43946a.b(fVar);
        this.f43949d.a(b5);
        try {
            if (Log.isLoggable(s4, 2)) {
                Objects.toString(fVar);
            }
            try {
                f4 = f();
            } catch (IOException unused) {
                Log.isLoggable(s4, 5);
            }
            if (f4.x(b5) != null) {
                return;
            }
            b.c s6 = f4.s(b5);
            if (s6 == null) {
                throw new IllegalStateException(s5 + b5);
            }
            try {
                if (bVar.a(s6.f(0))) {
                    s6.e();
                }
                s6.b();
            } catch (Throwable th) {
                s6.b();
                throw th;
            }
        } finally {
            this.f43949d.b(b5);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.f fVar) {
        String b5 = this.f43946a.b(fVar);
        String s4 = ProtectedSandApp.s("࣊");
        if (Log.isLoggable(s4, 2)) {
            Objects.toString(fVar);
        }
        try {
            b.e x4 = f().x(b5);
            if (x4 != null) {
                return x4.b(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable(s4, 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(com.bumptech.glide.load.f fVar) {
        try {
            f().I(this.f43946a.b(fVar));
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("࣊"), 5);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().o();
            } catch (IOException unused) {
                Log.isLoggable(ProtectedSandApp.s("࣊"), 5);
            }
        } finally {
            g();
        }
    }
}
