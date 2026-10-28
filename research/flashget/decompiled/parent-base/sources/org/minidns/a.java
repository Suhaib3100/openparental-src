package org.minidns;

import java.io.IOException;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.dnsmessage.a;
import org.minidns.f;
import org.minidns.record.l;
import org.minidns.record.u;
import org.minidns.source.b;

/* compiled from: AbstractDnsClient.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: g, reason: collision with root package name */
    protected static final org.minidns.cache.c f87100g = new org.minidns.cache.c();

    /* renamed from: h, reason: collision with root package name */
    protected static final Logger f87101h = Logger.getLogger(a.class.getName());

    /* renamed from: i, reason: collision with root package name */
    protected static c f87102i = c.v4v6;

    /* renamed from: a, reason: collision with root package name */
    private final b.a f87103a;

    /* renamed from: b, reason: collision with root package name */
    protected final Random f87104b;

    /* renamed from: c, reason: collision with root package name */
    protected final Random f87105c;

    /* renamed from: d, reason: collision with root package name */
    protected final org.minidns.b f87106d;

    /* renamed from: e, reason: collision with root package name */
    protected org.minidns.source.b f87107e;

    /* renamed from: f, reason: collision with root package name */
    protected c f87108f;

    /* compiled from: AbstractDnsClient.java */
    /* renamed from: org.minidns.a$a, reason: collision with other inner class name */
    class C1349a implements b.a {
        C1349a() {
        }

        @Override // org.minidns.source.b.a
        public void a(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
            org.minidns.dnsmessage.b y4 = aVar.y();
            a aVar2 = a.this;
            if (aVar2.f87106d == null || !aVar2.m(y4, cVar)) {
                return;
            }
            a.this.f87106d.d(aVar.c(), cVar);
        }
    }

    /* compiled from: AbstractDnsClient.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87110a;

        static {
            int[] iArr = new int[u.c.values().length];
            f87110a = iArr;
            try {
                iArr[u.c.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87110a[u.c.AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AbstractDnsClient.java */
    public enum c {
        v4only(true, false),
        v6only(false, true),
        v4v6(true, true),
        v6v4(true, true);

        public final boolean v4;
        public final boolean v6;

        c(boolean z4, boolean z5) {
            this.v4 = z4;
            this.v6 = z5;
        }
    }

    protected a(org.minidns.b bVar) {
        SecureRandom secureRandom;
        this.f87103a = new C1349a();
        this.f87105c = new Random();
        this.f87107e = new org.minidns.source.c();
        this.f87108f = f87102i;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            secureRandom = new SecureRandom();
        }
        this.f87104b = secureRandom;
        this.f87106d = bVar;
    }

    public static void G(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        }
        f87102i = cVar;
    }

    private <D extends org.minidns.record.h> Set<D> c(org.minidns.dnsname.a aVar, u.c cVar) {
        Collection d5;
        Set<l> h4 = h(aVar);
        if (h4.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(h4.size() * 3);
        for (l lVar : h4) {
            int i4 = b.f87110a[cVar.ordinal()];
            if (i4 == 1) {
                d5 = d(lVar.f87491d);
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                d5 = f(lVar.f87491d);
            }
            hashSet.addAll(d5);
        }
        return hashSet;
    }

    private <D extends org.minidns.record.h> Set<D> i(org.minidns.dnsname.a aVar, u.c cVar) {
        if (this.f87106d == null) {
            return Collections.emptySet();
        }
        org.minidns.dnsmessage.b bVar = new org.minidns.dnsmessage.b(aVar, cVar);
        org.minidns.dnsqueryresult.a a5 = this.f87106d.a(l(bVar));
        return a5 == null ? Collections.emptySet() : a5.f87242c.o(bVar);
    }

    public final f<org.minidns.dnsqueryresult.c, IOException> A(CharSequence charSequence, u.c cVar) {
        return E(new org.minidns.dnsmessage.b(charSequence, cVar, u.b.IN));
    }

    protected f<org.minidns.dnsqueryresult.c, IOException> B(a.b bVar) {
        f.h hVar = new f.h();
        try {
            hVar.p(t(bVar));
            return hVar;
        } catch (IOException e4) {
            hVar.o(e4);
            return hVar;
        }
    }

    public final f<org.minidns.dnsqueryresult.c, IOException> C(org.minidns.dnsmessage.a aVar, InetAddress inetAddress) {
        return D(aVar, inetAddress, 53);
    }

    public final f<org.minidns.dnsqueryresult.c, IOException> D(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) {
        org.minidns.b bVar = this.f87106d;
        org.minidns.dnsqueryresult.a a5 = bVar == null ? null : bVar.a(aVar);
        if (a5 != null) {
            return f.h(a5);
        }
        f87101h.log(Level.FINE, "Asynchronusly asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, Integer.valueOf(i4), aVar.y(), aVar});
        return this.f87107e.b(aVar, inetAddress, i4, this.f87103a);
    }

    public final f<org.minidns.dnsqueryresult.c, IOException> E(org.minidns.dnsmessage.b bVar) {
        return B(a(bVar));
    }

    public void F(org.minidns.source.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        }
        this.f87107e = bVar;
    }

    public void H(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        }
        this.f87108f = cVar;
    }

    final a.b a(org.minidns.dnsmessage.b bVar) {
        a.b e4 = org.minidns.dnsmessage.a.e();
        e4.M(bVar);
        e4.I(this.f87104b.nextInt());
        return n(e4);
    }

    public org.minidns.b b() {
        return this.f87106d;
    }

    public Set<org.minidns.record.a> d(org.minidns.dnsname.a aVar) {
        return i(aVar, u.c.A);
    }

    public Set<org.minidns.record.a> e(org.minidns.dnsname.a aVar) {
        return c(aVar, u.c.A);
    }

    public Set<org.minidns.record.b> f(org.minidns.dnsname.a aVar) {
        return i(aVar, u.c.AAAA);
    }

    public Set<org.minidns.record.b> g(org.minidns.dnsname.a aVar) {
        return c(aVar, u.c.AAAA);
    }

    public Set<l> h(org.minidns.dnsname.a aVar) {
        return i(aVar, u.c.NS);
    }

    public org.minidns.source.b j() {
        return this.f87107e;
    }

    public c k() {
        return this.f87108f;
    }

    protected org.minidns.dnsmessage.a l(org.minidns.dnsmessage.b bVar) {
        return a(bVar).x();
    }

    protected boolean m(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar) {
        Iterator<u<? extends org.minidns.record.h>> it = cVar.f87242c.f87177l.iterator();
        while (it.hasNext()) {
            if (it.next().i(bVar)) {
                return true;
            }
        }
        return false;
    }

    protected abstract a.b n(a.b bVar);

    public final org.minidns.dnsqueryresult.c o(CharSequence charSequence, u.c cVar) throws IOException {
        return w(new org.minidns.dnsmessage.b(charSequence, cVar, u.b.IN));
    }

    public org.minidns.dnsqueryresult.c p(String str, u.c cVar, InetAddress inetAddress) throws IOException {
        return x(new org.minidns.dnsmessage.b(str, cVar, u.b.IN), inetAddress);
    }

    public final org.minidns.dnsqueryresult.c q(String str, u.c cVar, u.b bVar) throws IOException {
        return w(new org.minidns.dnsmessage.b(str, cVar, bVar));
    }

    public org.minidns.dnsqueryresult.c r(String str, u.c cVar, u.b bVar, InetAddress inetAddress) throws IOException {
        return x(new org.minidns.dnsmessage.b(str, cVar, bVar), inetAddress);
    }

    public org.minidns.dnsqueryresult.c s(String str, u.c cVar, u.b bVar, InetAddress inetAddress, int i4) throws IOException {
        return y(new org.minidns.dnsmessage.b(str, cVar, bVar), inetAddress, i4);
    }

    protected abstract org.minidns.dnsqueryresult.c t(a.b bVar) throws IOException;

    public final org.minidns.dnsqueryresult.c u(org.minidns.dnsmessage.a aVar, InetAddress inetAddress) throws IOException {
        return v(aVar, inetAddress, 53);
    }

    public final org.minidns.dnsqueryresult.c v(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        org.minidns.b bVar = this.f87106d;
        org.minidns.dnsqueryresult.a a5 = bVar == null ? null : bVar.a(aVar);
        if (a5 != null) {
            return a5;
        }
        org.minidns.dnsmessage.b y4 = aVar.y();
        Level level = Level.FINE;
        Logger logger = f87101h;
        logger.log(level, "Asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, Integer.valueOf(i4), y4, aVar});
        try {
            org.minidns.dnsqueryresult.c a6 = this.f87107e.a(aVar, inetAddress, i4);
            logger.log(level, "Response from {0} on {1} for {2}:\n{3}", new Object[]{inetAddress, Integer.valueOf(i4), y4, a6});
            this.f87103a.a(aVar, a6);
            return a6;
        } catch (IOException e4) {
            f87101h.log(level, "IOException {0} on {1} while resolving {2}: {3}", new Object[]{inetAddress, Integer.valueOf(i4), y4, e4});
            throw e4;
        }
    }

    public org.minidns.dnsqueryresult.c w(org.minidns.dnsmessage.b bVar) throws IOException {
        return t(a(bVar));
    }

    public org.minidns.dnsqueryresult.c x(org.minidns.dnsmessage.b bVar, InetAddress inetAddress) throws IOException {
        return y(bVar, inetAddress, 53);
    }

    public final org.minidns.dnsqueryresult.c y(org.minidns.dnsmessage.b bVar, InetAddress inetAddress, int i4) throws IOException {
        return v(l(bVar), inetAddress, i4);
    }

    public final org.minidns.dnsqueryresult.c z(org.minidns.dnsname.a aVar, u.c cVar) throws IOException {
        return w(new org.minidns.dnsmessage.b(aVar, cVar, u.b.IN, false));
    }

    protected a() {
        this(f87100g);
    }
}
