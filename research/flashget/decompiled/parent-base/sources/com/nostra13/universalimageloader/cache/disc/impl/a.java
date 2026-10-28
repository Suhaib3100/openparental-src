package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.utils.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BaseDiskCache.java */
/* loaded from: classes6.dex */
public abstract class a implements nb.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f70155g = 32768;

    /* renamed from: i, reason: collision with root package name */
    public static final int f70157i = 100;

    /* renamed from: a, reason: collision with root package name */
    protected final File f70160a;

    /* renamed from: b, reason: collision with root package name */
    protected final File f70161b;

    /* renamed from: c, reason: collision with root package name */
    protected final ob.a f70162c;

    /* renamed from: d, reason: collision with root package name */
    protected int f70163d;

    /* renamed from: e, reason: collision with root package name */
    protected Bitmap.CompressFormat f70164e;

    /* renamed from: f, reason: collision with root package name */
    protected int f70165f;

    /* renamed from: j, reason: collision with root package name */
    private static final String f70158j = ProtectedSandApp.s("ᨃ\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f70159k = ProtectedSandApp.s("ᨄ\u0001");

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.CompressFormat f70156h = Bitmap.CompressFormat.PNG;

    public a(File file) {
        this(file, null);
    }

    @Override // nb.a
    public File a() {
        return this.f70160a;
    }

    @Override // nb.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        File d5 = d(str);
        File file = new File(d5.getAbsolutePath() + ProtectedSandApp.s("ᨄ\u0001"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.f70163d);
        try {
            boolean compress = bitmap.compress(this.f70164e, this.f70165f, bufferedOutputStream);
            com.nostra13.universalimageloader.utils.c.a(bufferedOutputStream);
            if (compress && !file.renameTo(d5)) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            com.nostra13.universalimageloader.utils.c.a(bufferedOutputStream);
            file.delete();
            throw th;
        }
    }

    @Override // nb.a
    public boolean c(String str, InputStream inputStream, c.a aVar) throws IOException {
        boolean z4;
        File d5 = d(str);
        File file = new File(d5.getAbsolutePath() + ProtectedSandApp.s("ᨄ\u0001"));
        try {
            try {
                z4 = com.nostra13.universalimageloader.utils.c.c(inputStream, new BufferedOutputStream(new FileOutputStream(file), this.f70163d), aVar, this.f70163d);
                try {
                    boolean z5 = (!z4 || file.renameTo(d5)) ? z4 : false;
                    if (!z5) {
                        file.delete();
                    }
                    return z5;
                } catch (Throwable th) {
                    th = th;
                    if (!((!z4 || file.renameTo(d5)) ? z4 : false)) {
                        file.delete();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            z4 = false;
        }
    }

    @Override // nb.a
    public void clear() {
        File[] listFiles = this.f70160a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
    }

    @Override // nb.a
    public void close() {
    }

    protected File d(String str) {
        File file;
        String a5 = this.f70162c.a(str);
        File file2 = this.f70160a;
        if (!file2.exists() && !this.f70160a.mkdirs() && (file = this.f70161b) != null && (file.exists() || this.f70161b.mkdirs())) {
            file2 = this.f70161b;
        }
        return new File(file2, a5);
    }

    public void e(int i4) {
        this.f70163d = i4;
    }

    public void f(Bitmap.CompressFormat compressFormat) {
        this.f70164e = compressFormat;
    }

    public void g(int i4) {
        this.f70165f = i4;
    }

    @Override // nb.a
    public File get(String str) {
        return d(str);
    }

    @Override // nb.a
    public boolean remove(String str) {
        return d(str).delete();
    }

    public a(File file, File file2) {
        this(file, file2, new ob.b());
    }

    public a(File file, File file2, ob.a aVar) {
        this.f70163d = 32768;
        this.f70164e = f70156h;
        this.f70165f = 100;
        if (file == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨆ\u0001"));
        }
        if (aVar != null) {
            this.f70160a = file;
            this.f70161b = file2;
            this.f70162c = aVar;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᨅ\u0001"));
    }
}
