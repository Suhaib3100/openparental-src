package org.apache.tools.zip;

import java.util.zip.ZipException;

/* compiled from: JarMarker.java */
/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    private static k f86732b = new k(51966);

    /* renamed from: c, reason: collision with root package name */
    private static k f86733c = new k(0);

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f86734d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    private static c f86735e = new c();

    public static c a() {
        return f86735e;
    }

    @Override // org.apache.tools.zip.g
    public k b() {
        return f86732b;
    }

    @Override // org.apache.tools.zip.g
    public byte[] c() {
        return f86734d;
    }

    @Override // org.apache.tools.zip.g
    public byte[] d() {
        return f86734d;
    }

    @Override // org.apache.tools.zip.g
    public k e() {
        return f86733c;
    }

    @Override // org.apache.tools.zip.g
    public k f() {
        return f86733c;
    }

    @Override // org.apache.tools.zip.g
    public void g(byte[] bArr, int i4, int i5) throws ZipException {
        if (i5 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
