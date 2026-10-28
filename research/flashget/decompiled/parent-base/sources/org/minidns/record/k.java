package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: MX.java */
/* loaded from: classes9.dex */
public class k extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f87449d;

    /* renamed from: e, reason: collision with root package name */
    public final org.minidns.dnsname.a f87450e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final org.minidns.dnsname.a f87451f;

    public k(int i4, String str) {
        this(i4, org.minidns.dnsname.a.h(str));
    }

    public static k h(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new k(dataInputStream.readUnsignedShort(), org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.MX;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87449d);
        this.f87450e.R(dataOutputStream);
    }

    public String toString() {
        return this.f87449d + " " + ((Object) this.f87450e) + '.';
    }

    public k(int i4, org.minidns.dnsname.a aVar) {
        this.f87449d = i4;
        this.f87450e = aVar;
        this.f87451f = aVar;
    }
}
