package com.nostra13.universalimageloader.cache.disc.impl.ext;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.cache.disc.impl.ext.a;
import com.nostra13.universalimageloader.utils.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: LruDiskCache.java */
/* loaded from: classes6.dex */
public class b implements nb.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f70212g = 32768;

    /* renamed from: i, reason: collision with root package name */
    public static final int f70214i = 100;

    /* renamed from: a, reason: collision with root package name */
    protected a f70217a;

    /* renamed from: b, reason: collision with root package name */
    private File f70218b;

    /* renamed from: c, reason: collision with root package name */
    protected final ob.a f70219c;

    /* renamed from: d, reason: collision with root package name */
    protected int f70220d;

    /* renamed from: e, reason: collision with root package name */
    protected Bitmap.CompressFormat f70221e;

    /* renamed from: f, reason: collision with root package name */
    protected int f70222f;

    /* renamed from: j, reason: collision with root package name */
    private static final String f70215j = ProtectedSandApp.s("ᨩ\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f70216k = ProtectedSandApp.s("ᨪ\u0001");

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.CompressFormat f70213h = Bitmap.CompressFormat.PNG;

    public b(File file, ob.a aVar, long j4) throws IOException {
        this(file, null, aVar, j4, 0);
    }

    private String d(String str) {
        return this.f70219c.a(str);
    }

    private void e(File file, File file2, long j4, int i4) throws IOException {
        try {
            this.f70217a = a.F(file, 1, 1, j4, i4);
        } catch (IOException e4) {
            com.nostra13.universalimageloader.utils.d.d(e4);
            if (file2 != null) {
                e(file2, null, j4, i4);
            }
            if (this.f70217a == null) {
                throw e4;
            }
        }
    }

    @Override // nb.a
    public File a() {
        return this.f70217a.z();
    }

    @Override // nb.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        a.c t4 = this.f70217a.t(this.f70219c.a(str));
        if (t4 == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(t4.i(0), this.f70220d);
        try {
            boolean compress = bitmap.compress(this.f70221e, this.f70222f, bufferedOutputStream);
            if (compress) {
                t4.f();
            } else {
                t4.a();
            }
            return compress;
        } finally {
            com.nostra13.universalimageloader.utils.c.a(bufferedOutputStream);
        }
    }

    @Override // nb.a
    public boolean c(String str, InputStream inputStream, c.a aVar) throws IOException {
        a.c t4 = this.f70217a.t(this.f70219c.a(str));
        if (t4 == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(t4.i(0), this.f70220d);
        try {
            boolean c5 = com.nostra13.universalimageloader.utils.c.c(inputStream, bufferedOutputStream, aVar, this.f70220d);
            com.nostra13.universalimageloader.utils.c.a(bufferedOutputStream);
            if (c5) {
                t4.f();
            } else {
                t4.a();
            }
            return c5;
        } catch (Throwable th) {
            com.nostra13.universalimageloader.utils.c.a(bufferedOutputStream);
            t4.a();
            throw th;
        }
    }

    @Override // nb.a
    public void clear() {
        try {
            this.f70217a.q();
        } catch (IOException e4) {
            com.nostra13.universalimageloader.utils.d.d(e4);
        }
        try {
            e(this.f70217a.z(), this.f70218b, this.f70217a.C(), this.f70217a.B());
        } catch (IOException e5) {
            com.nostra13.universalimageloader.utils.d.d(e5);
        }
    }

    @Override // nb.a
    public void close() {
        try {
            this.f70217a.close();
        } catch (IOException e4) {
            com.nostra13.universalimageloader.utils.d.d(e4);
        }
        this.f70217a = null;
    }

    public void f(int i4) {
        this.f70220d = i4;
    }

    public void g(Bitmap.CompressFormat compressFormat) {
        this.f70221e = compressFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.nostra13.universalimageloader.cache.disc.impl.ext.a$e] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // nb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File get(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            com.nostra13.universalimageloader.cache.disc.impl.ext.a r1 = r4.f70217a     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L24
            ob.a r2 = r4.f70219c     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L29
            java.lang.String r5 = r2.a(r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L29
            com.nostra13.universalimageloader.cache.disc.impl.ext.a$e r5 = r1.y(r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L24
            if (r5 != 0) goto L10
            goto L15
        L10:
            r1 = 0
            java.io.File r0 = r5.b(r1)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
        L15:
            if (r5 == 0) goto L1a
            r5.close()
        L1a:
            return r0
        L1b:
            r0 = move-exception
            goto L34
        L1d:
            r1 = move-exception
            goto L2b
        L1f:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L34
        L24:
            r1 = move-exception
        L25:
            r5 = r0
            goto L2b
        L27:
            r1 = r5
            goto L25
        L29:
            r5 = move-exception
            goto L27
        L2b:
            com.nostra13.universalimageloader.utils.d.d(r1)     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            if (r5 == 0) goto L39
            r5.close()
        L39:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.b.get(java.lang.String):java.io.File");
    }

    public void h(int i4) {
        this.f70222f = i4;
    }

    @Override // nb.a
    public boolean remove(String str) {
        try {
            return this.f70217a.K(this.f70219c.a(str));
        } catch (IOException e4) {
            com.nostra13.universalimageloader.utils.d.d(e4);
            return false;
        }
    }

    public b(File file, File file2, ob.a aVar, long j4, int i4) throws IOException {
        this.f70220d = 32768;
        this.f70221e = f70213h;
        this.f70222f = 100;
        if (file == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨮ\u0001"));
        }
        if (j4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨭ\u0001"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨬ\u0001"));
        }
        if (aVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨫ\u0001"));
        }
        long j5 = j4 == 0 ? Long.MAX_VALUE : j4;
        i4 = i4 == 0 ? Integer.MAX_VALUE : i4;
        this.f70218b = file2;
        this.f70219c = aVar;
        e(file, file2, j5, i4);
    }
}
