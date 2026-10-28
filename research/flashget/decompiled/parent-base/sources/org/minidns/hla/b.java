package org.minidns.hla;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.record.h;
import org.minidns.record.r;
import org.minidns.record.u;
import org.minidns.record.w;

/* compiled from: ResolverApi.java */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f87367b = new b(new org.minidns.iterative.b());

    /* renamed from: a, reason: collision with root package name */
    private final org.minidns.a f87368a;

    public b(org.minidns.a aVar) {
        this.f87368a = aVar;
    }

    public final org.minidns.a a() {
        return this.f87368a;
    }

    public final <D extends h> c<D> b(String str, Class<D> cls) throws IOException {
        return d(org.minidns.dnsname.a.h(str), cls);
    }

    public <D extends h> c<D> c(org.minidns.dnsmessage.b bVar) throws IOException {
        return new c<>(bVar, this.f87368a.w(bVar), null);
    }

    public final <D extends h> c<D> d(org.minidns.dnsname.a aVar, Class<D> cls) throws IOException {
        return c(new org.minidns.dnsmessage.b(aVar, u.c.getType(cls)));
    }

    public d e(gg.b bVar, gg.a aVar, String str) throws IOException {
        return j(bVar.dnsLabel, aVar.dnsLabel, org.minidns.dnsname.a.h(str));
    }

    public d f(gg.b bVar, gg.a aVar, org.minidns.dnsname.a aVar2) throws IOException {
        return j(bVar.dnsLabel, aVar.dnsLabel, aVar2);
    }

    public d g(gg.d dVar, String str) throws IOException {
        return f(dVar.service, dVar.proto, org.minidns.dnsname.a.h(str));
    }

    public d h(gg.d dVar, org.minidns.dnsname.a aVar) throws IOException {
        return f(dVar.service, dVar.proto, aVar);
    }

    public d i(String str) throws IOException {
        return k(org.minidns.dnsname.a.h(str));
    }

    public d j(DnsLabel dnsLabel, DnsLabel dnsLabel2, org.minidns.dnsname.a aVar) throws IOException {
        return l(aVar, new gg.c(dnsLabel, dnsLabel2));
    }

    public d k(org.minidns.dnsname.a aVar) throws IOException {
        int s4 = aVar.s();
        if (s4 < 3) {
            throw new IllegalArgumentException();
        }
        DnsLabel r4 = aVar.r(s4 - 1);
        int i4 = s4 - 2;
        return l(aVar.N(i4), new gg.c(r4, aVar.r(i4)));
    }

    public d l(org.minidns.dnsname.a aVar, gg.c cVar) throws IOException {
        return new d(d(org.minidns.dnsname.a.i(cVar.f73913a, cVar.f73914b, aVar), w.class), cVar, this);
    }

    public c<r> m(CharSequence charSequence) throws IOException {
        return p(InetAddress.getByName(charSequence.toString()));
    }

    public c<r> n(Inet4Address inet4Address) throws IOException {
        return c(org.minidns.c.O(inet4Address));
    }

    public c<r> o(Inet6Address inet6Address) throws IOException {
        return c(org.minidns.c.P(inet6Address));
    }

    public c<r> p(InetAddress inetAddress) throws IOException {
        if (inetAddress instanceof Inet4Address) {
            return n((Inet4Address) inetAddress);
        }
        if (inetAddress instanceof Inet6Address) {
            return o((Inet6Address) inetAddress);
        }
        throw new IllegalArgumentException("The given InetAddress '" + inetAddress + "' is neither of type Inet4Address or Inet6Address");
    }
}
