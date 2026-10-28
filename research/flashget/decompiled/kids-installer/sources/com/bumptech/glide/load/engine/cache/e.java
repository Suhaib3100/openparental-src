package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.b;
import com.bumptech.glide.load.engine.cache.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes3.dex */
public class e implements a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f11234f = ProtectedSandApp.s("\u1cca");

    /* renamed from: g, reason: collision with root package name */
    private static final int f11235g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11236h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static e f11237i;

    /* renamed from: b, reason: collision with root package name */
    private final File f11239b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11240c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.disklrucache.b f11242e;

    /* renamed from: d, reason: collision with root package name */
    private final c f11241d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final m f11238a = new m();

    @Deprecated
    protected e(File file, long j5) {
        this.f11239b = file;
        this.f11240c = j5;
    }

    public static a d(File file, long j5) {
        return new e(file, j5);
    }

    @Deprecated
    public static synchronized a e(File file, long j5) {
        e eVar;
        synchronized (e.class) {
            if (f11237i == null) {
                f11237i = new e(file, j5);
            }
            eVar = f11237i;
        }
        return eVar;
    }

    private synchronized com.bumptech.glide.disklrucache.b f() throws IOException {
        if (this.f11242e == null) {
            this.f11242e = com.bumptech.glide.disklrucache.b.R(this.f11239b, 1, 1, this.f11240c);
        }
        return this.f11242e;
    }

    private synchronized void g() {
        this.f11242e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.f fVar, a.b bVar) {
        com.bumptech.glide.disklrucache.b f6;
        String s5 = ProtectedSandApp.s("᳅");
        String s6 = ProtectedSandApp.s("᳆");
        String b6 = this.f11238a.b(fVar);
        this.f11241d.a(b6);
        try {
            if (Log.isLoggable(s5, 2)) {
                Objects.toString(fVar);
            }
            try {
                f6 = f();
            } catch (IOException unused) {
                Log.isLoggable(s5, 5);
            }
            if (f6.F(b6) != null) {
                return;
            }
            b.c z5 = f6.z(b6);
            if (z5 == null) {
                throw new IllegalStateException(s6 + b6);
            }
            try {
                if (bVar.a(z5.f(0))) {
                    z5.e();
                }
                z5.b();
            } catch (Throwable th) {
                z5.b();
                throw th;
            }
        } finally {
            this.f11241d.b(b6);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.f fVar) {
        String b6 = this.f11238a.b(fVar);
        String s5 = ProtectedSandApp.s("᳇");
        if (Log.isLoggable(s5, 2)) {
            Objects.toString(fVar);
        }
        try {
            b.e F = f().F(b6);
            if (F != null) {
                return F.b(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable(s5, 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(com.bumptech.glide.load.f fVar) {
        try {
            f().d0(this.f11238a.b(fVar));
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("\u1cc8"), 5);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().t();
            } catch (IOException unused) {
                Log.isLoggable(ProtectedSandApp.s("\u1cc9"), 5);
            }
        } finally {
            g();
        }
    }
}
