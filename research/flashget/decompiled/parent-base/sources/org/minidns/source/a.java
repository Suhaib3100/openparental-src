package org.minidns.source;

import java.io.IOException;
import java.net.InetAddress;
import org.minidns.f;
import org.minidns.source.b;

/* compiled from: AbstractDnsDataSource.java */
/* loaded from: classes9.dex */
public abstract class a implements b {

    /* renamed from: c, reason: collision with root package name */
    private org.minidns.b f87532c;

    /* renamed from: a, reason: collision with root package name */
    protected int f87530a = 1024;

    /* renamed from: b, reason: collision with root package name */
    protected int f87531b = 5000;

    /* renamed from: d, reason: collision with root package name */
    private EnumC1361a f87533d = EnumC1361a.dontCare;

    /* compiled from: AbstractDnsDataSource.java */
    /* renamed from: org.minidns.source.a$a, reason: collision with other inner class name */
    public enum EnumC1361a {
        dontCare,
        udpTcp,
        tcp
    }

    @Override // org.minidns.source.b
    public abstract org.minidns.dnsqueryresult.c a(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException;

    @Override // org.minidns.source.b
    public f<org.minidns.dnsqueryresult.c, IOException> b(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4, b.a aVar2) {
        f.h hVar = new f.h();
        try {
            hVar.p(a(aVar, inetAddress, i4));
            return hVar;
        } catch (IOException e4) {
            hVar.o(e4);
            return hVar;
        }
    }

    @Override // org.minidns.source.b
    public int c() {
        return this.f87531b;
    }

    @Override // org.minidns.source.b
    public void d(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Timeout must be greater than zero");
        }
        this.f87531b = i4;
    }

    @Override // org.minidns.source.b
    public int e() {
        return this.f87530a;
    }

    protected final void f(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
        org.minidns.b bVar = this.f87532c;
        if (bVar == null) {
            return;
        }
        bVar.d(aVar, cVar);
    }

    public EnumC1361a g() {
        return this.f87533d;
    }

    public void h(EnumC1361a enumC1361a) {
        if (enumC1361a == null) {
            throw new IllegalArgumentException();
        }
        this.f87533d = enumC1361a;
    }

    public void i(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("UDP payload size must be greater than zero");
        }
        this.f87530a = i4;
    }
}
