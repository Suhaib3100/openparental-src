package org.minidns;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.a;
import org.minidns.dnsmessage.a;
import org.minidns.record.u;
import org.minidns.util.MultipleIoException;

/* compiled from: DnsClient.java */
/* loaded from: classes3.dex */
public class c extends org.minidns.a {

    /* renamed from: n, reason: collision with root package name */
    static final List<org.minidns.dnsserverlookup.d> f87112n = new CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    static final Set<Inet4Address> f87113o;

    /* renamed from: p, reason: collision with root package name */
    static final Set<Inet6Address> f87114p;

    /* renamed from: q, reason: collision with root package name */
    private static final Set<String> f87115q;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f87116r = false;

    /* renamed from: j, reason: collision with root package name */
    private final Set<InetAddress> f87117j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f87118k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87119l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87120m;

    /* compiled from: DnsClient.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87121a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f87122b;

        static {
            int[] iArr = new int[a.d.values().length];
            f87122b = iArr;
            try {
                iArr[a.d.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87122b[a.d.NX_DOMAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f87121a = iArr2;
            try {
                iArr2[a.c.v4v6.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87121a[a.c.v6v4.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87121a[a.c.v4only.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87121a[a.c.v6only.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        f87113o = copyOnWriteArraySet;
        f87114p = new CopyOnWriteArraySet();
        J(org.minidns.dnsserverlookup.b.f87300b);
        J(org.minidns.dnsserverlookup.c.f87303b);
        J(org.minidns.dnsserverlookup.e.f87305b);
        try {
            copyOnWriteArraySet.add(org.minidns.util.g.b("8.8.8.8"));
        } catch (IllegalArgumentException e4) {
            org.minidns.a.f87101h.log(Level.WARNING, "Could not add static IPv4 DNS Server", (Throwable) e4);
        }
        try {
            f87114p.add(org.minidns.util.g.c("[2001:4860:4860::8888]"));
        } catch (IllegalArgumentException e5) {
            org.minidns.a.f87101h.log(Level.WARNING, "Could not add static IPv6 DNS Server", (Throwable) e5);
        }
        f87115q = Collections.newSetFromMap(new ConcurrentHashMap(4));
    }

    public c() {
        this.f87117j = Collections.newSetFromMap(new ConcurrentHashMap(4));
        this.f87118k = false;
        this.f87119l = false;
        this.f87120m = true;
    }

    public static boolean I(String str) {
        return f87115q.add(str);
    }

    public static void J(org.minidns.dnsserverlookup.d dVar) {
        if (!dVar.isAvailable()) {
            org.minidns.a.f87101h.fine("Not adding " + dVar.getName() + " as it is not available.");
            return;
        }
        List<org.minidns.dnsserverlookup.d> list = f87112n;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
            arrayList.add(dVar);
            Collections.sort(arrayList);
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r4 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (org.minidns.util.g.d(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (org.minidns.c.f87115q.contains(r5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        org.minidns.a.f87101h.fine("The DNS server lookup mechanism '" + r3.getName() + "' returned a blacklisted result: '" + r5 + "'");
        r4.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        org.minidns.a.f87101h.warning("The DNS server lookup mechanism '" + r3.getName() + "' returned an invalid non-IP address result: '" + r5 + "'");
        r4.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r2.isEmpty() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> K() {
        /*
            java.util.List<org.minidns.dnsserverlookup.d> r0 = org.minidns.c.f87112n
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r0.next()
            org.minidns.dnsserverlookup.d r3 = (org.minidns.dnsserverlookup.d) r3
            java.util.List r2 = r3.getDnsServerAddresses()     // Catch: java.lang.SecurityException -> L19
            goto L23
        L19:
            r4 = move-exception
            java.util.logging.Logger r5 = org.minidns.a.f87101h
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r7 = "Could not lookup DNS server"
            r5.log(r6, r7, r4)
        L23:
            if (r2 != 0) goto L26
            goto L8
        L26:
            java.util.Iterator r4 = r2.iterator()
        L2a:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "The DNS server lookup mechanism '"
            if (r5 == 0) goto L90
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = org.minidns.util.g.d(r5)
            java.lang.String r8 = "'"
            if (r7 != 0) goto L64
            java.util.logging.Logger r7 = org.minidns.a.f87101h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = r3.getName()
            r9.append(r6)
            java.lang.String r6 = "' returned an invalid non-IP address result: '"
            r9.append(r6)
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            r7.warning(r5)
            r4.remove()
            goto L2a
        L64:
            java.util.Set<java.lang.String> r7 = org.minidns.c.f87115q
            boolean r7 = r7.contains(r5)
            if (r7 == 0) goto L2a
            java.util.logging.Logger r7 = org.minidns.a.f87101h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = r3.getName()
            r9.append(r6)
            java.lang.String r6 = "' returned a blacklisted result: '"
            r9.append(r6)
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            r7.fine(r5)
            r4.remove()
            goto L2a
        L90:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L97
            goto Lb3
        L97:
            java.util.logging.Logger r2 = org.minidns.a.f87101h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            java.lang.String r3 = "' returned not a single valid IP address after sanitazion"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.warning(r3)
            goto L7
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.c.K():java.util.List");
    }

    public static List<InetAddress> L() {
        InetAddress byName;
        List<String> K = K();
        if (K == null) {
            return new ArrayList();
        }
        a.c cVar = org.minidns.a.f87102i;
        ArrayList arrayList = cVar.v4 ? new ArrayList(K.size()) : null;
        ArrayList arrayList2 = cVar.v6 ? new ArrayList(K.size()) : null;
        int i4 = 0;
        for (String str : K) {
            try {
                byName = InetAddress.getByName(str);
            } catch (UnknownHostException e4) {
                org.minidns.a.f87101h.log(Level.SEVERE, android.support.v4.media.d.a("Could not transform '", str, "' to InetAddress"), (Throwable) e4);
            }
            if (!(byName instanceof Inet4Address)) {
                if (!(byName instanceof Inet6Address)) {
                    throw new AssertionError("The address '" + byName + "' is neither of type Inet(4|6)Address");
                }
                if (cVar.v6) {
                    arrayList2.add((Inet6Address) byName);
                }
            } else if (cVar.v4) {
                arrayList.add((Inet4Address) byName);
            }
            i4++;
        }
        ArrayList arrayList3 = new ArrayList(i4);
        int i5 = a.f87121a[cVar.ordinal()];
        if (i5 == 1) {
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
        } else if (i5 == 2) {
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(arrayList);
        } else if (i5 == 3) {
            arrayList3.addAll(arrayList);
        } else if (i5 == 4) {
            arrayList3.addAll(arrayList2);
        }
        return arrayList3;
    }

    public static org.minidns.dnsmessage.b O(Inet4Address inet4Address) {
        return R(org.minidns.dnsname.a.k(org.minidns.util.g.g(inet4Address), org.minidns.dnsname.a.f87223r));
    }

    public static org.minidns.dnsmessage.b P(Inet6Address inet6Address) {
        return R(org.minidns.dnsname.a.k(org.minidns.util.g.h(inet6Address), org.minidns.dnsname.a.f87224s));
    }

    public static org.minidns.dnsmessage.b Q(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return O((Inet4Address) inetAddress);
        }
        if (inetAddress instanceof Inet6Address) {
            return P((Inet6Address) inetAddress);
        }
        throw new IllegalArgumentException("The provided inetAddress '" + inetAddress + "' is neither of type Inet4Address nor Inet6Address");
    }

    private static org.minidns.dnsmessage.b R(org.minidns.dnsname.a aVar) {
        return new org.minidns.dnsmessage.b(aVar, u.c.PTR);
    }

    private List<InetAddress> S() {
        InetAddress N;
        InetAddress M;
        List<InetAddress> L = L();
        if (this.f87120m) {
            int i4 = a.f87121a[this.f87108f.ordinal()];
            if (i4 == 1) {
                N = N();
                M = M();
            } else if (i4 != 2) {
                M = null;
                if (i4 == 3) {
                    N = N();
                } else {
                    if (i4 != 4) {
                        throw new AssertionError("Unknown ipVersionSetting: " + this.f87108f);
                    }
                    N = M();
                }
            } else {
                N = M();
                M = N();
            }
            L.add(N);
            if (M != null) {
                L.add(M);
            }
        }
        return L;
    }

    public static boolean W(String str) {
        return f87115q.remove(str);
    }

    public static boolean X(org.minidns.dnsserverlookup.d dVar) {
        boolean remove;
        List<org.minidns.dnsserverlookup.d> list = f87112n;
        synchronized (list) {
            remove = list.remove(dVar);
        }
        return remove;
    }

    @Override // org.minidns.a
    protected f<org.minidns.dnsqueryresult.c, IOException> B(a.b bVar) {
        org.minidns.dnsmessage.a x4 = n(bVar).x();
        b bVar2 = this.f87106d;
        org.minidns.dnsqueryresult.a a5 = bVar2 == null ? null : bVar2.a(x4);
        if (a5 != null) {
            return f.h(a5);
        }
        List<InetAddress> S = S();
        Iterator<InetAddress> it = S.iterator();
        while (it.hasNext()) {
            InetAddress next = it.next();
            if (this.f87117j.contains(next)) {
                it.remove();
                org.minidns.a.f87101h.finer("Skipping " + next + " because it was marked as \"recursion not available\"");
            }
        }
        ArrayList arrayList = new ArrayList(S.size());
        Iterator<InetAddress> it2 = S.iterator();
        while (it2.hasNext()) {
            arrayList.add(D(x4, it2.next(), 53));
        }
        return f.f(arrayList);
    }

    public InetAddress M() {
        return (InetAddress) org.minidns.util.d.a(f87114p, this.f87105c);
    }

    public InetAddress N() {
        return (InetAddress) org.minidns.util.d.a(f87113o, this.f87105c);
    }

    public boolean T() {
        return this.f87118k;
    }

    public boolean U() {
        return this.f87119l;
    }

    public boolean V() {
        return this.f87120m;
    }

    public void Y(boolean z4) {
        this.f87118k = z4;
    }

    public void Z(boolean z4) {
        this.f87119l = z4;
    }

    public void a0(boolean z4) {
        this.f87120m = z4;
    }

    @Override // org.minidns.a
    protected a.b n(a.b bVar) {
        bVar.Q(true);
        bVar.B().j(this.f87107e.e()).i(this.f87118k);
        return bVar;
    }

    @Override // org.minidns.a
    public org.minidns.dnsqueryresult.c t(a.b bVar) throws IOException {
        org.minidns.dnsmessage.a x4 = n(bVar).x();
        b bVar2 = this.f87106d;
        org.minidns.dnsqueryresult.a a5 = bVar2 == null ? null : bVar2.a(x4);
        if (a5 != null) {
            return a5;
        }
        List<InetAddress> S = S();
        ArrayList arrayList = new ArrayList(S.size());
        for (InetAddress inetAddress : S) {
            if (this.f87117j.contains(inetAddress)) {
                org.minidns.a.f87101h.finer("Skipping " + inetAddress + " because it was marked as \"recursion not available\"");
            } else {
                try {
                    org.minidns.dnsqueryresult.c v4 = v(x4, inetAddress, 53);
                    org.minidns.dnsmessage.a aVar = v4.f87242c;
                    if (aVar.f87173h) {
                        if (this.f87119l) {
                            return v4;
                        }
                        int i4 = a.f87122b[aVar.f87168c.ordinal()];
                        if (i4 == 1 || i4 == 2) {
                            return v4;
                        }
                        String str = "Response from " + inetAddress + " asked for " + x4.y() + " with error code: " + aVar.f87168c + '.';
                        Logger logger = org.minidns.a.f87101h;
                        if (!logger.isLoggable(Level.FINE)) {
                            str = str + "\n" + aVar;
                        }
                        logger.warning(str);
                        arrayList.add(new MiniDnsException.ErrorResponseException(x4, v4));
                    } else if (this.f87117j.add(inetAddress)) {
                        org.minidns.a.f87101h.warning("The DNS server " + inetAddress + " returned a response without the \"recursion available\" (RA) flag set. This likely indicates a misconfiguration because the server is not suitable for DNS resolution");
                    }
                } catch (IOException e4) {
                    arrayList.add(e4);
                }
            }
        }
        MultipleIoException.c(arrayList);
        throw new MiniDnsException.NoQueryPossibleException(x4);
    }

    public c(b bVar) {
        super(bVar);
        this.f87117j = Collections.newSetFromMap(new ConcurrentHashMap(4));
        this.f87118k = false;
        this.f87119l = false;
        this.f87120m = true;
    }
}
