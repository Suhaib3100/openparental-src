package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final AssetManager f32732a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Executor f32733b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final i.d f32734c;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final File f32736e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private final String f32737f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final String f32738g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final String f32739h;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private d[] f32741j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private byte[] f32742k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32740i = false;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final byte[] f32735d = d();

    @c1({c1.a.LIBRARY})
    public c(@o0 AssetManager assetManager, @o0 Executor executor, @o0 i.d dVar, @o0 String str, @o0 String str2, @o0 String str3, @o0 File file) {
        this.f32732a = assetManager;
        this.f32733b = executor;
        this.f32734c = dVar;
        this.f32737f = str;
        this.f32738g = str2;
        this.f32739h = str3;
        this.f32736e = file;
    }

    @q0
    private c b(d[] dVarArr, byte[] bArr) {
        InputStream h4;
        try {
            h4 = h(this.f32732a, this.f32739h);
        } catch (FileNotFoundException e4) {
            this.f32734c.a(9, e4);
        } catch (IOException e5) {
            this.f32734c.a(7, e5);
        } catch (IllegalStateException e6) {
            this.f32741j = null;
            this.f32734c.a(8, e6);
        }
        if (h4 == null) {
            if (h4 != null) {
                h4.close();
            }
            return null;
        }
        try {
            this.f32741j = n.q(h4, n.o(h4, n.f32800g), bArr, dVarArr);
            h4.close();
            return this;
        } catch (Throwable th) {
            try {
                h4.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f32740i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @q0
    private static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            return null;
        }
        switch (i4) {
        }
        return null;
    }

    @q0
    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f32738g);
        } catch (FileNotFoundException e4) {
            this.f32734c.a(6, e4);
            return null;
        } catch (IOException e5) {
            this.f32734c.a(7, e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i4, Object obj) {
        this.f32734c.a(i4, obj);
    }

    @q0
    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f32734c.b(5, null);
            }
            return null;
        }
    }

    @q0
    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        d[] w4 = n.w(inputStream, n.o(inputStream, n.f32799f), this.f32737f);
                        try {
                            inputStream.close();
                            return w4;
                        } catch (IOException e4) {
                            this.f32734c.a(7, e4);
                            return w4;
                        }
                    } catch (IOException e5) {
                        this.f32734c.a(7, e5);
                        return null;
                    }
                } catch (IllegalStateException e6) {
                    this.f32734c.a(8, e6);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e7) {
                this.f32734c.a(7, e7);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                this.f32734c.a(7, e10);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            return false;
        }
        if (i4 != 24 && i4 != 25) {
            switch (i4) {
            }
            return false;
        }
        return true;
    }

    private void l(final int i4, @q0 final Object obj) {
        this.f32733b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i4, obj);
            }
        });
    }

    @c1({c1.a.LIBRARY})
    public boolean e() {
        if (this.f32735d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f32736e.canWrite()) {
            this.f32740i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    @c1({c1.a.LIBRARY})
    @o0
    public c i() {
        c b5;
        c();
        if (this.f32735d == null) {
            return this;
        }
        InputStream f4 = f(this.f32732a);
        if (f4 != null) {
            this.f32741j = j(f4);
        }
        d[] dVarArr = this.f32741j;
        return (dVarArr == null || !k() || (b5 = b(dVarArr, this.f32735d)) == null) ? this : b5;
    }

    @c1({c1.a.LIBRARY})
    @o0
    public c m() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f32741j;
        byte[] bArr = this.f32735d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    n.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                this.f32734c.a(7, e4);
            } catch (IllegalStateException e5) {
                this.f32734c.a(8, e5);
            }
            if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f32734c.a(5, null);
                this.f32741j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f32742k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f32741j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    public boolean n() {
        byte[] bArr = this.f32742k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f32736e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f32742k = null;
                this.f32741j = null;
            }
        } catch (FileNotFoundException e4) {
            l(6, e4);
            return false;
        } catch (IOException e5) {
            l(7, e5);
            return false;
        }
    }
}
