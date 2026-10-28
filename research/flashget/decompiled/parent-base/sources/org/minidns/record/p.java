package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: OPENPGPKEY.java */
/* loaded from: classes9.dex */
public class p extends h {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f87475d;

    /* renamed from: e, reason: collision with root package name */
    private transient String f87476e;

    p(byte[] bArr) {
        this.f87475d = bArr;
    }

    public static p j(DataInputStream dataInputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        dataInputStream.readFully(bArr);
        return new p(bArr);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.OPENPGPKEY;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f87475d);
    }

    public byte[] h() {
        return (byte[]) this.f87475d.clone();
    }

    public String i() {
        if (this.f87476e == null) {
            this.f87476e = org.minidns.util.b.a(this.f87475d);
        }
        return this.f87476e;
    }

    public String toString() {
        return i();
    }
}
