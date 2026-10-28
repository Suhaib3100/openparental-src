package org.minidns.hla;

import java.io.IOException;
import org.minidns.MiniDnsException;
import org.minidns.iterative.b;
import org.minidns.record.h;
import org.minidns.record.u;

/* compiled from: DnssecResolverApi.java */
/* loaded from: classes9.dex */
public class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f87363f = new a();

    /* renamed from: c, reason: collision with root package name */
    private final org.minidns.dnssec.b f87364c;

    /* renamed from: d, reason: collision with root package name */
    private final org.minidns.dnssec.b f87365d;

    /* renamed from: e, reason: collision with root package name */
    private final org.minidns.dnssec.b f87366e;

    /* compiled from: DnssecResolverApi.java */
    /* renamed from: org.minidns.hla.a$a, reason: collision with other inner class name */
    class C1357a implements org.minidns.cache.d {
        C1357a() {
        }

        @Override // org.minidns.cache.d
        public org.minidns.b a() {
            return new org.minidns.cache.c();
        }
    }

    public a() {
        this(new C1357a());
    }

    private static <D extends h> c<D> u(org.minidns.dnsmessage.b bVar, org.minidns.dnssec.c cVar) throws MiniDnsException.NullResultException {
        return new c<>(bVar, cVar.f87279b, cVar.b());
    }

    @Override // org.minidns.hla.b
    public <D extends h> c<D> c(org.minidns.dnsmessage.b bVar) throws IOException {
        return u(bVar, this.f87364c.U(bVar));
    }

    public org.minidns.dnssec.b q() {
        return this.f87364c;
    }

    public <D extends h> c<D> r(String str, Class<D> cls) throws IOException {
        return t(org.minidns.dnsname.a.h(str), cls);
    }

    public <D extends h> c<D> s(org.minidns.dnsmessage.b bVar) throws IOException {
        org.minidns.dnssec.c U = this.f87366e.U(bVar);
        if (U == null || !U.c()) {
            U = this.f87365d.U(bVar);
        }
        return u(bVar, U);
    }

    public <D extends h> c<D> t(org.minidns.dnsname.a aVar, Class<D> cls) throws IOException {
        return s(new org.minidns.dnsmessage.b(aVar, u.c.getType(cls)));
    }

    public a(org.minidns.cache.d dVar) {
        this(new org.minidns.dnssec.b(dVar.a()), dVar);
    }

    private a(org.minidns.dnssec.b bVar, org.minidns.cache.d dVar) {
        super(bVar);
        this.f87364c = bVar;
        org.minidns.dnssec.b bVar2 = new org.minidns.dnssec.b(dVar.a());
        this.f87365d = bVar2;
        bVar2.J(b.c.iterativeOnly);
        org.minidns.dnssec.b bVar3 = new org.minidns.dnssec.b(dVar.a());
        this.f87366e = bVar3;
        bVar3.J(b.c.recursiveOnly);
    }
}
