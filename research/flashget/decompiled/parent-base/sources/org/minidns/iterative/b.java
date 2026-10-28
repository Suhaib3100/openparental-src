package org.minidns.iterative;

import org.minidns.dnsmessage.a;

/* compiled from: ReliableDnsClient.java */
/* loaded from: classes9.dex */
public class b extends org.minidns.a {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f87407m = false;

    /* renamed from: j, reason: collision with root package name */
    private final org.minidns.iterative.a f87408j;

    /* renamed from: k, reason: collision with root package name */
    private final org.minidns.c f87409k;

    /* renamed from: l, reason: collision with root package name */
    private c f87410l;

    /* compiled from: ReliableDnsClient.java */
    class a extends org.minidns.iterative.a {
        a(org.minidns.b bVar) {
            super(bVar);
        }

        @Override // org.minidns.iterative.a, org.minidns.a
        protected boolean m(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar) {
            return b.this.m(bVar, cVar) && cVar.f87242c.f87170e;
        }

        @Override // org.minidns.iterative.a, org.minidns.a
        protected a.b n(a.b bVar) {
            return b.this.n(super.n(bVar));
        }
    }

    /* compiled from: ReliableDnsClient.java */
    /* renamed from: org.minidns.iterative.b$b, reason: collision with other inner class name */
    class C1360b extends org.minidns.c {
        C1360b(org.minidns.b bVar) {
            super(bVar);
        }

        @Override // org.minidns.a
        protected boolean m(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar) {
            return b.this.m(bVar, cVar) && super.m(bVar, cVar);
        }

        @Override // org.minidns.c, org.minidns.a
        protected a.b n(a.b bVar) {
            return b.this.n(super.n(bVar));
        }
    }

    /* compiled from: ReliableDnsClient.java */
    public enum c {
        recursiveWithIterativeFallback,
        recursiveOnly,
        iterativeOnly
    }

    public b(org.minidns.b bVar) {
        super(bVar);
        this.f87410l = c.recursiveWithIterativeFallback;
        this.f87408j = new a(bVar);
        this.f87409k = new C1360b(bVar);
    }

    @Override // org.minidns.a
    public void F(org.minidns.source.b bVar) {
        super.F(bVar);
        this.f87408j.F(bVar);
        this.f87409k.F(bVar);
    }

    protected String I(org.minidns.dnsmessage.a aVar) {
        return null;
    }

    public void J(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Mode must not be null.");
        }
        this.f87410l = cVar;
    }

    public void K(boolean z4) {
        this.f87409k.a0(z4);
    }

    @Override // org.minidns.a
    protected boolean m(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar) {
        return I(cVar.f87242c) == null;
    }

    @Override // org.minidns.a
    protected a.b n(a.b bVar) {
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // org.minidns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.minidns.dnsqueryresult.c t(org.minidns.dnsmessage.a.b r9) throws java.io.IOException {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.minidns.iterative.b$c r1 = r8.f87410l
            org.minidns.iterative.b$c r2 = org.minidns.iterative.b.c.iterativeOnly
            r3 = 0
            if (r1 == r2) goto L29
            org.minidns.c r1 = r8.f87409k     // Catch: java.io.IOException -> L23
            org.minidns.dnsqueryresult.c r1 = r1.t(r9)     // Catch: java.io.IOException -> L23
            if (r1 == 0) goto L1f
            org.minidns.dnsmessage.a r2 = r1.f87242c     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = r8.I(r2)     // Catch: java.io.IOException -> L1d
            if (r3 != 0) goto L1f
            return r1
        L1d:
            r2 = move-exception
            goto L25
        L1f:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L2a
        L23:
            r2 = move-exception
            r1 = r3
        L25:
            r0.add(r2)
            goto L1f
        L29:
            r1 = r3
        L2a:
            org.minidns.iterative.b$c r2 = r8.f87410l
            org.minidns.iterative.b$c r4 = org.minidns.iterative.b.c.recursiveOnly
            if (r2 != r4) goto L31
            return r3
        L31:
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.util.logging.Logger r4 = org.minidns.a.f87101h
            boolean r5 = r4.isLoggable(r2)
            if (r5 == 0) goto L82
            org.minidns.iterative.b$c r5 = r8.f87410l
            org.minidns.iterative.b$c r6 = org.minidns.iterative.b.c.iterativeOnly
            if (r5 == r6) goto L82
            boolean r5 = r0.isEmpty()
            java.lang.String r6 = "Resolution fall back to iterative mode because: "
            if (r5 != 0) goto L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r5 = 0
            java.lang.Object r5 = r0.get(r5)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            goto L76
        L5b:
            if (r3 != 0) goto L60
            java.lang.String r1 = "Resolution fall back to iterative mode because:  DnsClient did not return a response"
            goto L76
        L60:
            if (r1 == 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = ". Response:\n"
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
        L76:
            r4.log(r2, r1)
            goto L82
        L7a:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = "This should never been reached"
            r9.<init>(r0)
            throw r9
        L82:
            org.minidns.iterative.a r1 = r8.f87408j     // Catch: java.io.IOException -> L89
            org.minidns.dnsqueryresult.c r3 = r1.t(r9)     // Catch: java.io.IOException -> L89
            goto L8d
        L89:
            r9 = move-exception
            r0.add(r9)
        L8d:
            if (r3 != 0) goto L92
            org.minidns.util.MultipleIoException.c(r0)
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.iterative.b.t(org.minidns.dnsmessage.a$b):org.minidns.dnsqueryresult.c");
    }

    public b() {
        this(org.minidns.a.f87100g);
    }
}
