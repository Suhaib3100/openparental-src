package org.minidns.edns;

import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.edns.a;

/* compiled from: EdnsOption.java */
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f87327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87328b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f87329c;

    /* renamed from: d, reason: collision with root package name */
    private String f87330d;

    /* renamed from: e, reason: collision with root package name */
    private String f87331e;

    /* compiled from: EdnsOption.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87332a;

        static {
            int[] iArr = new int[a.c.values().length];
            f87332a = iArr;
            try {
                iArr[a.c.NSID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    protected b(int i4, byte[] bArr) {
        this.f87327a = i4;
        this.f87328b = bArr.length;
        this.f87329c = bArr;
    }

    public static b d(int i4, byte[] bArr) {
        return a.f87332a[a.c.from(i4).ordinal()] != 1 ? new d(i4, bArr) : new c(bArr);
    }

    public final String a() {
        if (this.f87331e == null) {
            this.f87331e = b().toString();
        }
        return this.f87331e;
    }

    protected abstract CharSequence b();

    public abstract a.c c();

    protected abstract CharSequence e();

    public final void f(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87327a);
        dataOutputStream.writeShort(this.f87328b);
        dataOutputStream.write(this.f87329c);
    }

    public final String toString() {
        if (this.f87330d == null) {
            this.f87330d = e().toString();
        }
        return this.f87330d;
    }

    protected b(byte[] bArr) {
        this.f87327a = c().asInt;
        this.f87328b = bArr.length;
        this.f87329c = bArr;
    }
}
