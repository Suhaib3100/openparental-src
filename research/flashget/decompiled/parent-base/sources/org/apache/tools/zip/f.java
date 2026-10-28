package org.apache.tools.zip;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* compiled from: ZipEntry.java */
/* loaded from: classes3.dex */
public class f extends ZipEntry implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    private static final int f86742h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f86743i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static Method f86744j;

    /* renamed from: k, reason: collision with root package name */
    private static Object f86745k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static boolean f86746l;

    /* renamed from: b, reason: collision with root package name */
    private int f86747b;

    /* renamed from: c, reason: collision with root package name */
    private int f86748c;

    /* renamed from: d, reason: collision with root package name */
    private long f86749d;

    /* renamed from: e, reason: collision with root package name */
    private Vector f86750e;

    /* renamed from: f, reason: collision with root package name */
    private String f86751f;

    /* renamed from: g, reason: collision with root package name */
    private Long f86752g;

    public f(String str) {
        super(str);
        this.f86747b = 0;
        this.f86748c = 0;
        this.f86749d = 0L;
        this.f86750e = new Vector();
        this.f86751f = null;
        this.f86752g = null;
    }

    private static void c() {
        if (f86746l) {
            return;
        }
        synchronized (f86745k) {
            f86746l = true;
            try {
                f86744j = ZipEntry.class.getMethod("setCompressedSize", Long.TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    private static boolean m() {
        c();
        return f86744j != null;
    }

    private static void n(f fVar, long j4) {
        try {
            f86744j.invoke(fVar, new Long(j4));
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            StringBuilder sb = new StringBuilder("Exception setting the compressed size of ");
            sb.append(fVar);
            sb.append(": ");
            throw new RuntimeException(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(targetException, sb));
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Exception setting the compressed size of ");
            sb2.append(fVar);
            sb2.append(": ");
            throw new RuntimeException(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, sb2));
        }
    }

    public void b(g gVar) {
        k b5 = gVar.b();
        boolean z4 = false;
        for (int i4 = 0; !z4 && i4 < this.f86750e.size(); i4++) {
            if (((g) this.f86750e.elementAt(i4)).b().equals(b5)) {
                this.f86750e.setElementAt(gVar, i4);
                z4 = true;
            }
        }
        if (!z4) {
            this.f86750e.addElement(gVar);
        }
        r();
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        try {
            f fVar = (f) super.clone();
            fVar.u(getName());
            fVar.setComment(getComment());
            fVar.setMethod(getMethod());
            fVar.setTime(getTime());
            long size = getSize();
            if (size > 0) {
                fVar.setSize(size);
            }
            long compressedSize = getCompressedSize();
            if (compressedSize > 0) {
                fVar.p(compressedSize);
            }
            long crc = getCrc();
            if (crc > 0) {
                fVar.setCrc(crc);
            }
            fVar.f86750e = (Vector) this.f86750e.clone();
            fVar.t(g());
            fVar.q(e());
            fVar.s(f());
            return fVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public byte[] d() {
        return b.b(f());
    }

    public long e() {
        return this.f86749d;
    }

    public g[] f() {
        g[] gVarArr = new g[this.f86750e.size()];
        this.f86750e.copyInto(gVarArr);
        return gVarArr;
    }

    public int g() {
        return this.f86747b;
    }

    @Override // java.util.zip.ZipEntry
    public long getCompressedSize() {
        Long l4 = this.f86752g;
        return l4 != null ? l4.longValue() : super.getCompressedSize();
    }

    @Override // java.util.zip.ZipEntry
    public String getName() {
        String str = this.f86751f;
        return str == null ? super.getName() : str;
    }

    public byte[] i() {
        byte[] extra = getExtra();
        return extra != null ? extra : new byte[0];
    }

    @Override // java.util.zip.ZipEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    public int k() {
        return this.f86748c;
    }

    public int l() {
        return (int) ((e() >> 16) & okhttp3.internal.ws.g.f84969s);
    }

    public void o(k kVar) {
        boolean z4 = false;
        for (int i4 = 0; !z4 && i4 < this.f86750e.size(); i4++) {
            if (((g) this.f86750e.elementAt(i4)).b().equals(kVar)) {
                this.f86750e.removeElementAt(i4);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException();
        }
        r();
    }

    public void p(long j4) {
        if (m()) {
            n(this, j4);
        } else {
            this.f86752g = new Long(j4);
        }
    }

    public void q(long j4) {
        this.f86749d = j4;
    }

    protected void r() {
        super.setExtra(b.c(f()));
    }

    public void s(g[] gVarArr) {
        this.f86750e.removeAllElements();
        for (g gVar : gVarArr) {
            this.f86750e.addElement(gVar);
        }
        r();
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            s(b.d(bArr));
        } catch (Exception e4) {
            throw new RuntimeException(e4.getMessage());
        }
    }

    public void t(int i4) {
        this.f86747b = i4;
    }

    protected void u(String str) {
        this.f86751f = str;
    }

    protected void v(int i4) {
        this.f86748c = i4;
    }

    public void w(int i4) {
        q(((i4 & 128) == 0 ? 1 : 0) | (i4 << 16) | (isDirectory() ? 16 : 0));
        this.f86748c = 3;
    }

    public f(ZipEntry zipEntry) throws ZipException {
        super(zipEntry.getName());
        this.f86747b = 0;
        this.f86748c = 0;
        this.f86749d = 0L;
        this.f86750e = new Vector();
        this.f86751f = null;
        this.f86752g = null;
        setComment(zipEntry.getComment());
        setMethod(zipEntry.getMethod());
        setTime(zipEntry.getTime());
        long size = zipEntry.getSize();
        if (size > 0) {
            setSize(size);
        }
        long compressedSize = zipEntry.getCompressedSize();
        if (compressedSize > 0) {
            p(compressedSize);
        }
        long crc = zipEntry.getCrc();
        if (crc > 0) {
            setCrc(crc);
        }
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            s(b.d(extra));
        } else {
            r();
        }
    }

    public f(f fVar) throws ZipException {
        this((ZipEntry) fVar);
        t(fVar.g());
        q(fVar.e());
        s(fVar.f());
    }

    protected f() {
        super("");
        this.f86747b = 0;
        this.f86748c = 0;
        this.f86749d = 0L;
        this.f86750e = new Vector();
        this.f86751f = null;
        this.f86752g = null;
    }
}
