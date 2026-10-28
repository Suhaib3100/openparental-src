package org.minidns.hla;

import java.util.Collections;
import java.util.Set;
import org.minidns.MiniDnsException;
import org.minidns.dnsmessage.a;
import org.minidns.dnssec.DnssecResultNotAuthenticException;
import org.minidns.record.h;

/* compiled from: ResolverResult.java */
/* loaded from: classes9.dex */
public class c<D extends h> {

    /* renamed from: a, reason: collision with root package name */
    protected final org.minidns.dnsmessage.b f87369a;

    /* renamed from: b, reason: collision with root package name */
    private final a.d f87370b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<D> f87371c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f87372d;

    /* renamed from: e, reason: collision with root package name */
    protected final Set<org.minidns.dnssec.d> f87373e;

    /* renamed from: f, reason: collision with root package name */
    protected final org.minidns.dnsmessage.a f87374f;

    /* renamed from: g, reason: collision with root package name */
    protected final org.minidns.dnsqueryresult.c f87375g;

    /* renamed from: h, reason: collision with root package name */
    private ResolutionUnsuccessfulException f87376h;

    /* renamed from: i, reason: collision with root package name */
    private DnssecResultNotAuthenticException f87377i;

    c(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar, Set<org.minidns.dnssec.d> set) throws MiniDnsException.NullResultException {
        if (cVar == null) {
            throw new MiniDnsException.NullResultException(bVar.a().x());
        }
        this.f87375g = cVar;
        org.minidns.dnsmessage.a aVar = cVar.f87242c;
        this.f87369a = bVar;
        this.f87370b = aVar.f87168c;
        this.f87374f = aVar;
        Set<D> o4 = aVar.o(bVar);
        if (o4 == null) {
            this.f87371c = Collections.emptySet();
        } else {
            this.f87371c = Collections.unmodifiableSet(o4);
        }
        if (set == null) {
            this.f87373e = null;
            this.f87372d = false;
        } else {
            Set<org.minidns.dnssec.d> unmodifiableSet = Collections.unmodifiableSet(set);
            this.f87373e = unmodifiableSet;
            this.f87372d = unmodifiableSet.isEmpty();
        }
    }

    public Set<D> a() {
        m();
        return this.f87371c;
    }

    public Set<D> b() {
        return this.f87371c;
    }

    public org.minidns.dnsqueryresult.c c() {
        return this.f87375g;
    }

    public DnssecResultNotAuthenticException d() {
        if (!n() || this.f87372d) {
            return null;
        }
        if (this.f87377i == null) {
            this.f87377i = DnssecResultNotAuthenticException.a(i());
        }
        return this.f87377i;
    }

    public org.minidns.dnsmessage.b e() {
        return this.f87369a;
    }

    public org.minidns.dnsmessage.a f() {
        return this.f87374f;
    }

    public ResolutionUnsuccessfulException g() {
        if (n()) {
            return null;
        }
        if (this.f87376h == null) {
            this.f87376h = new ResolutionUnsuccessfulException(this.f87369a, this.f87370b);
        }
        return this.f87376h;
    }

    public a.d h() {
        return this.f87370b;
    }

    public Set<org.minidns.dnssec.d> i() {
        m();
        return this.f87373e;
    }

    boolean j() {
        Set<org.minidns.dnssec.d> set = this.f87373e;
        return (set == null || set.isEmpty()) ? false : true;
    }

    public boolean k() {
        m();
        return this.f87372d;
    }

    public void l() throws ResolutionUnsuccessfulException {
        ResolutionUnsuccessfulException g4 = g();
        if (g4 != null) {
            throw g4;
        }
    }

    protected void m() {
        ResolutionUnsuccessfulException g4 = g();
        if (g4 != null) {
            throw new IllegalStateException("Can not perform operation because the DNS resolution was unsuccessful", g4);
        }
    }

    public boolean n() {
        return this.f87370b == a.d.NO_ERROR;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("\nQuestion: ");
        sb.append(this.f87369a);
        sb.append("\nResponse Code: ");
        sb.append(this.f87370b);
        sb.append('\n');
        if (this.f87370b == a.d.NO_ERROR) {
            if (this.f87372d) {
                sb.append("Results verified via DNSSEC\n");
            }
            if (j()) {
                sb.append(this.f87373e);
                sb.append('\n');
            }
            sb.append(this.f87374f.f87177l);
        }
        return sb.toString();
    }
}
