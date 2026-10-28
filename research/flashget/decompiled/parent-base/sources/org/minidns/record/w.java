package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: SRV.java */
/* loaded from: classes9.dex */
public class w extends h implements Comparable<w> {

    /* renamed from: d, reason: collision with root package name */
    public final int f87510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87512f;

    /* renamed from: g, reason: collision with root package name */
    public final org.minidns.dnsname.a f87513g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final org.minidns.dnsname.a f87514h;

    public w(int i4, int i5, int i6, String str) {
        this(i4, i5, i6, org.minidns.dnsname.a.h(str));
    }

    public static w j(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new w(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.SRV;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87510d);
        dataOutputStream.writeShort(this.f87511e);
        dataOutputStream.writeShort(this.f87512f);
        this.f87513g.R(dataOutputStream);
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        int i4 = wVar.f87510d - this.f87510d;
        return i4 == 0 ? this.f87511e - wVar.f87511e : i4;
    }

    public boolean i() {
        return !this.f87513g.B();
    }

    public String toString() {
        return this.f87510d + " " + this.f87511e + " " + this.f87512f + " " + ((Object) this.f87513g) + ".";
    }

    public w(int i4, int i5, int i6, org.minidns.dnsname.a aVar) {
        this.f87510d = i4;
        this.f87511e = i5;
        this.f87512f = i6;
        this.f87513g = aVar;
        this.f87514h = aVar;
    }
}
