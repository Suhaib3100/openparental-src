package org.minidns.iterative;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import org.minidns.a;
import org.minidns.dnsmessage.a;
import org.minidns.iterative.IterativeClientException;
import org.minidns.record.h;
import org.minidns.record.l;
import org.minidns.record.t;
import org.minidns.record.u;
import org.minidns.util.MultipleIoException;

/* compiled from: IterativeDnsClient.java */
/* loaded from: classes9.dex */
public class a extends org.minidns.a {

    /* renamed from: j, reason: collision with root package name */
    int f87400j;

    /* compiled from: IterativeDnsClient.java */
    /* renamed from: org.minidns.iterative.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1358a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87401a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f87402b;

        static {
            int[] iArr = new int[u.c.values().length];
            f87402b = iArr;
            try {
                iArr[u.c.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87402b[u.c.AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f87401a = iArr2;
            try {
                iArr2[a.c.v4only.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87401a[a.c.v6only.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87401a[a.c.v4v6.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87401a[a.c.v6v4.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: IterativeDnsClient.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final List<InetAddress> f87403a;

        /* compiled from: IterativeDnsClient.java */
        /* renamed from: org.minidns.iterative.a$b$a, reason: collision with other inner class name */
        private static final class C1359a {

            /* renamed from: a, reason: collision with root package name */
            private final Random f87404a;

            /* renamed from: b, reason: collision with root package name */
            private final List<InetAddress> f87405b;

            /* renamed from: c, reason: collision with root package name */
            private final List<InetAddress> f87406c;

            /* synthetic */ C1359a(Random random, C1358a c1358a) {
                this(random);
            }

            public b c() {
                return new b(this.f87405b, this.f87406c, this.f87404a, null);
            }

            private C1359a(Random random) {
                this.f87405b = new ArrayList(8);
                this.f87406c = new ArrayList(8);
                this.f87404a = random;
            }
        }

        /* synthetic */ b(List list, List list2, Random random, C1358a c1358a) {
            this(list, list2, random);
        }

        private b(List<InetAddress> list, List<InetAddress> list2, Random random) {
            int size;
            int[] iArr = C1358a.f87401a;
            int i4 = iArr[org.minidns.a.f87102i.ordinal()];
            if (i4 == 1) {
                size = list.size();
            } else if (i4 != 2) {
                size = list2.size() + list.size();
            } else {
                size = list2.size();
            }
            if (size == 0) {
                this.f87403a = Collections.emptyList();
                return;
            }
            if (org.minidns.a.f87102i.v4) {
                Collections.shuffle(list, random);
            }
            if (org.minidns.a.f87102i.v6) {
                Collections.shuffle(list2, random);
            }
            ArrayList arrayList = new ArrayList(size);
            int i5 = iArr[org.minidns.a.f87102i.ordinal()];
            if (i5 == 1) {
                arrayList.addAll(list);
            } else if (i5 == 2) {
                arrayList.addAll(list2);
            } else if (i5 == 3) {
                arrayList.addAll(list);
                arrayList.addAll(list2);
            } else if (i5 == 4) {
                arrayList.addAll(list2);
                arrayList.addAll(list);
            }
            this.f87403a = Collections.unmodifiableList(arrayList);
        }
    }

    public a() {
        this.f87400j = 128;
    }

    protected static void I(IOException iOException) throws IOException {
        if (iOException instanceof IterativeClientException.LoopDetected) {
            throw iOException;
        }
    }

    public static List<InetAddress> N(char c5) {
        return O(c5, org.minidns.a.f87102i);
    }

    public static List<InetAddress> O(char c5, a.c cVar) {
        Inet4Address a5 = org.minidns.constants.a.a(c5);
        Inet6Address b5 = org.minidns.constants.a.b(c5);
        ArrayList arrayList = new ArrayList(2);
        int i4 = C1358a.f87401a[cVar.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                    if (b5 != null) {
                        arrayList.add(b5);
                    }
                } else if (i4 == 4) {
                    if (b5 != null) {
                        arrayList.add(b5);
                    }
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
            } else if (b5 != null) {
                arrayList.add(b5);
            }
        } else if (a5 != null) {
            arrayList.add(a5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[EDGE_INSN: B:24:0x0055->B:22:0x0055 BREAK  A[LOOP:1: B:13:0x0034->B:17:0x0044], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress[] P(java.util.Collection<? extends org.minidns.record.j<? extends java.net.InetAddress>> r5, java.util.Collection<? extends org.minidns.record.j<? extends java.net.InetAddress>> r6) {
        /*
            r0 = 2
            java.net.InetAddress[] r0 = new java.net.InetAddress[r0]
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r1 = r5.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            java.lang.Object r1 = r5.next()
            org.minidns.record.j r1 = (org.minidns.record.j) r1
            r4 = r0[r3]
            if (r4 != 0) goto L26
            java.net.InetAddress r4 = r1.i()
            r0[r3] = r4
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L26
            goto L7
        L26:
            r5 = r0[r2]
            if (r5 != 0) goto L30
            java.net.InetAddress r5 = r1.i()
            r0[r2] = r5
        L30:
            java.util.Iterator r5 = r6.iterator()
        L34:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()
            org.minidns.record.j r6 = (org.minidns.record.j) r6
            r1 = r0[r3]
            if (r1 != 0) goto L4b
            java.net.InetAddress r6 = r6.i()
            r0[r3] = r6
            goto L34
        L4b:
            r5 = r0[r2]
            if (r5 != 0) goto L55
            java.net.InetAddress r5 = r6.i()
            r0[r2] = r5
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.iterative.a.P(java.util.Collection, java.util.Collection):java.net.InetAddress[]");
    }

    private static InetAddress Q(String str, org.minidns.record.a aVar) {
        try {
            return InetAddress.getByAddress(str, aVar.j());
        } catch (UnknownHostException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static InetAddress R(String str, org.minidns.record.b bVar) {
        try {
            return InetAddress.getByAddress(str, bVar.j());
        } catch (UnknownHostException e4) {
            throw new RuntimeException(e4);
        }
    }

    private b.C1359a S() {
        return new b.C1359a(this.f87105c, null);
    }

    private org.minidns.dnsqueryresult.c T(c cVar, org.minidns.dnsmessage.a aVar) throws IOException {
        InetAddress inetAddress;
        InetAddress i4;
        org.minidns.dnsname.a v4 = aVar.y().f87207a.v();
        int i5 = C1358a.f87401a[this.f87108f.ordinal()];
        if (i5 == 1) {
            inetAddress = null;
            for (org.minidns.record.a aVar2 : e(v4)) {
                if (inetAddress != null) {
                    i4 = aVar2.i();
                    break;
                }
                inetAddress = aVar2.i();
            }
            i4 = null;
        } else if (i5 == 2) {
            inetAddress = null;
            for (org.minidns.record.b bVar : g(v4)) {
                if (inetAddress != null) {
                    i4 = bVar.i();
                    break;
                }
                inetAddress = bVar.i();
            }
            i4 = null;
        } else if (i5 == 3) {
            InetAddress[] P = P(e(v4), g(v4));
            inetAddress = P[0];
            i4 = P[1];
        } else {
            if (i5 != 4) {
                throw new AssertionError();
            }
            InetAddress[] P2 = P(g(v4), e(v4));
            inetAddress = P2[0];
            i4 = P2[1];
        }
        if (inetAddress == null) {
            v4 = org.minidns.dnsname.a.f87222q;
            int i6 = C1358a.f87401a[this.f87108f.ordinal()];
            if (i6 == 1) {
                inetAddress = org.minidns.constants.a.c(this.f87105c);
            } else if (i6 == 2) {
                inetAddress = org.minidns.constants.a.d(this.f87105c);
            } else if (i6 == 3) {
                inetAddress = org.minidns.constants.a.c(this.f87105c);
                i4 = org.minidns.constants.a.d(this.f87105c);
            } else if (i6 == 4) {
                inetAddress = org.minidns.constants.a.d(this.f87105c);
                i4 = org.minidns.constants.a.c(this.f87105c);
            }
        }
        LinkedList linkedList = new LinkedList();
        try {
            return U(cVar, aVar, inetAddress, v4);
        } catch (IOException e4) {
            I(e4);
            linkedList.add(e4);
            if (i4 != null) {
                try {
                    return U(cVar, aVar, i4, v4);
                } catch (IOException e5) {
                    linkedList.add(e5);
                    MultipleIoException.c(linkedList);
                    return null;
                }
            }
            MultipleIoException.c(linkedList);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private org.minidns.dnsqueryresult.c U(c cVar, org.minidns.dnsmessage.a aVar, InetAddress inetAddress, org.minidns.dnsname.a aVar2) throws IOException {
        b bVar;
        u.c cVar2;
        cVar.b(inetAddress, aVar);
        org.minidns.dnsqueryresult.c v4 = v(aVar, inetAddress, 53);
        org.minidns.dnsmessage.a aVar3 = v4.f87242c;
        if (aVar3.f87170e) {
            return v4;
        }
        org.minidns.b bVar2 = this.f87106d;
        if (bVar2 != null) {
            bVar2.c(aVar, v4, aVar2);
        }
        List<u<? extends h>> h4 = aVar3.h();
        LinkedList linkedList = new LinkedList();
        Iterator<u<? extends h>> it = h4.iterator();
        while (it.hasNext()) {
            u<E> h5 = it.next().h(l.class);
            if (h5 == 0) {
                it.remove();
            } else {
                Iterator<InetAddress> it2 = W(aVar3, ((l) h5.f87498f).f87491d).f87403a.iterator();
                while (it2.hasNext()) {
                    try {
                        return U(cVar, aVar, it2.next(), h5.f87493a);
                    } catch (IOException e4) {
                        I(e4);
                        org.minidns.a.f87101h.log(Level.FINER, "Exception while recursing", (Throwable) e4);
                        cVar.a();
                        linkedList.add(e4);
                        if (!it2.hasNext()) {
                            it.remove();
                        }
                    }
                }
            }
        }
        for (u<? extends h> uVar : h4) {
            org.minidns.dnsmessage.b y4 = aVar.y();
            org.minidns.dnsname.a aVar4 = ((l) uVar.f87498f).f87491d;
            if (!y4.f87207a.equals(aVar4) || ((cVar2 = y4.f87208b) != u.c.A && cVar2 != u.c.AAAA)) {
                try {
                    bVar = V(cVar, aVar4);
                } catch (IOException e5) {
                    cVar.a();
                    linkedList.add(e5);
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    Iterator<InetAddress> it3 = bVar.f87403a.iterator();
                    while (it3.hasNext()) {
                        try {
                            return U(cVar, aVar, it3.next(), uVar.f87493a);
                        } catch (IOException e6) {
                            cVar.a();
                            linkedList.add(e6);
                        }
                    }
                }
            }
        }
        MultipleIoException.c(linkedList);
        throw new IterativeClientException.NotAuthoritativeNorGlueRrFound(aVar, v4, aVar2);
    }

    private b V(c cVar, org.minidns.dnsname.a aVar) throws IOException {
        b.C1359a S = S();
        if (this.f87108f.v4) {
            org.minidns.dnsmessage.b bVar = new org.minidns.dnsmessage.b(aVar, u.c.A);
            org.minidns.dnsqueryresult.c T = T(cVar, l(bVar));
            org.minidns.dnsmessage.a aVar2 = T != null ? T.f87242c : null;
            if (aVar2 != null) {
                for (u<? extends h> uVar : aVar2.f87177l) {
                    if (uVar.i(bVar)) {
                        S.f87405b.add(Q(aVar.f87227b, (org.minidns.record.a) uVar.f87498f));
                    } else if (uVar.f87494b == u.c.CNAME && uVar.f87493a.equals(aVar)) {
                        return V(cVar, ((t) uVar.f87498f).f87491d);
                    }
                }
            }
        }
        if (this.f87108f.v6) {
            org.minidns.dnsmessage.b bVar2 = new org.minidns.dnsmessage.b(aVar, u.c.AAAA);
            org.minidns.dnsqueryresult.c T2 = T(cVar, l(bVar2));
            org.minidns.dnsmessage.a aVar3 = T2 != null ? T2.f87242c : null;
            if (aVar3 != null) {
                for (u<? extends h> uVar2 : aVar3.f87177l) {
                    if (uVar2.i(bVar2)) {
                        S.f87406c.add(R(aVar.f87227b, (org.minidns.record.b) uVar2.f87498f));
                    } else if (uVar2.f87494b == u.c.CNAME && uVar2.f87493a.equals(aVar)) {
                        return V(cVar, ((t) uVar2.f87498f).f87491d);
                    }
                }
            }
        }
        return S.c();
    }

    private b W(org.minidns.dnsmessage.a aVar, org.minidns.dnsname.a aVar2) {
        b.C1359a S = S();
        for (u<? extends h> uVar : aVar.f87179n) {
            if (uVar.f87493a.equals(aVar2)) {
                int i4 = C1358a.f87402b[uVar.f87494b.ordinal()];
                if (i4 == 1) {
                    S.f87405b.add(Q(aVar2.f87227b, (org.minidns.record.a) uVar.f87498f));
                } else if (i4 == 2) {
                    S.f87406c.add(R(aVar2.f87227b, (org.minidns.record.b) uVar.f87498f));
                }
            }
        }
        return S.c();
    }

    @Override // org.minidns.a
    protected boolean m(org.minidns.dnsmessage.b bVar, org.minidns.dnsqueryresult.c cVar) {
        return cVar.f87242c.f87170e;
    }

    @Override // org.minidns.a
    protected a.b n(a.b bVar) {
        bVar.Q(false);
        bVar.B().j(this.f87107e.e());
        return bVar;
    }

    @Override // org.minidns.a
    protected org.minidns.dnsqueryresult.c t(a.b bVar) throws IOException {
        return T(new c(this), bVar.x());
    }

    public a(org.minidns.b bVar) {
        super(bVar);
        this.f87400j = 128;
    }
}
