package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: SOA.java */
/* loaded from: classes9.dex */
public class v extends h {

    /* renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f87503d;

    /* renamed from: e, reason: collision with root package name */
    public final org.minidns.dnsname.a f87504e;

    /* renamed from: f, reason: collision with root package name */
    public final long f87505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87506g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87507h;

    /* renamed from: i, reason: collision with root package name */
    public final int f87508i;

    /* renamed from: j, reason: collision with root package name */
    public final long f87509j;

    public v(String str, String str2, long j4, int i4, int i5, int i6, long j5) {
        this(org.minidns.dnsname.a.h(str), org.minidns.dnsname.a.h(str2), j4, i4, i5, i6, j5);
    }

    public static v h(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new v(org.minidns.dnsname.a.E(dataInputStream, bArr), org.minidns.dnsname.a.E(dataInputStream, bArr), dataInputStream.readInt() & 4294967295L, dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt() & 4294967295L);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.SOA;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        this.f87503d.R(dataOutputStream);
        this.f87504e.R(dataOutputStream);
        dataOutputStream.writeInt((int) this.f87505f);
        dataOutputStream.writeInt(this.f87506g);
        dataOutputStream.writeInt(this.f87507h);
        dataOutputStream.writeInt(this.f87508i);
        dataOutputStream.writeInt((int) this.f87509j);
    }

    public String toString() {
        return ((CharSequence) this.f87503d) + ". " + ((CharSequence) this.f87504e) + ". " + this.f87505f + ' ' + this.f87506g + ' ' + this.f87507h + ' ' + this.f87508i + ' ' + this.f87509j;
    }

    public v(org.minidns.dnsname.a aVar, org.minidns.dnsname.a aVar2, long j4, int i4, int i5, int i6, long j5) {
        this.f87503d = aVar;
        this.f87504e = aVar2;
        this.f87505f = j4;
        this.f87506g = i4;
        this.f87507h = i5;
        this.f87508i = i6;
        this.f87509j = j5;
    }
}
