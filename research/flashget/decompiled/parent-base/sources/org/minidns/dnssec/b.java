package org.minidns.dnssec;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.minidns.dnsmessage.a;
import org.minidns.dnssec.DnssecValidationFailedException;
import org.minidns.dnssec.d;
import org.minidns.record.g;
import org.minidns.record.h;
import org.minidns.record.i;
import org.minidns.record.m;
import org.minidns.record.o;
import org.minidns.record.s;
import org.minidns.record.u;

/* compiled from: DnssecClient.java */
/* loaded from: classes5.dex */
public class b extends org.minidns.iterative.b {

    /* renamed from: q, reason: collision with root package name */
    private static final BigInteger f87269q = new BigInteger("1628686155461064465348252249725010996177649738666492500572664444461532807739744536029771810659241049343994038053541290419968870563183856865780916376571550372513476957870843322273120879361960335192976656756972171258658400305760429696147778001233984421619267530978084631948434496468785021389956803104620471232008587410372348519229650742022804219634190734272506220018657920136902014393834092648785514548876370028925405557661759399901378816916683122474038734912535425670533237815676134840739565610963796427401855723026687073600445461090736240030247906095053875491225879656640052743394090544036297390104110989318819106653199917493");

    /* renamed from: r, reason: collision with root package name */
    private static final org.minidns.dnsname.a f87270r = org.minidns.dnsname.a.h("dlv.isc.org");

    /* renamed from: n, reason: collision with root package name */
    private final Map<org.minidns.dnsname.a, byte[]> f87271n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87272o;

    /* renamed from: p, reason: collision with root package name */
    private org.minidns.dnsname.a f87273p;

    /* compiled from: DnssecClient.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87274a;

        static {
            int[] iArr = new int[u.c.values().length];
            f87274a = iArr;
            try {
                iArr[u.c.NSEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87274a[u.c.NSEC3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b() {
        this(org.minidns.a.f87100g);
    }

    private static boolean Q(String str, String str2) {
        if (str.equals(str2) || str2.isEmpty()) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split2.length > split.length) {
            return false;
        }
        for (int i4 = 1; i4 <= split2.length; i4++) {
            if (!split2[split2.length - i4].equals(split[split.length - i4])) {
                return false;
            }
        }
        return true;
    }

    private c S(org.minidns.dnsqueryresult.c cVar) throws IOException {
        if (cVar == null) {
            return null;
        }
        org.minidns.dnsmessage.a aVar = cVar.f87242c;
        a.b a5 = aVar.a();
        Set<d> Y = Y(aVar);
        a5.E(Y.isEmpty());
        List<u<? extends h>> list = aVar.f87177l;
        List<u<? extends h>> list2 = aVar.f87178m;
        List<u<? extends h>> list3 = aVar.f87179n;
        HashSet hashSet = new HashSet();
        u.c(hashSet, s.class, list);
        u.c(hashSet, s.class, list2);
        u.c(hashSet, s.class, list3);
        if (this.f87272o) {
            a5.D(X(list));
            a5.J(X(list2));
            a5.C(X(list3));
        }
        return new c(a5.x(), cVar, hashSet, Y);
    }

    private static List<u<? extends h>> X(List<u<? extends h>> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (u<? extends h> uVar : list) {
            if (uVar.f87494b != u.c.RRSIG) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    private Set<d> Y(org.minidns.dnsmessage.a aVar) throws IOException {
        return !aVar.f87177l.isEmpty() ? Z(aVar) : a0(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Set<d> Z(org.minidns.dnsmessage.a aVar) throws IOException {
        boolean z4 = false;
        org.minidns.dnsmessage.b bVar = aVar.f87176k.get(0);
        List<u<? extends h>> list = aVar.f87177l;
        List<u<? extends h>> g4 = aVar.g();
        C1353b c02 = c0(bVar, list, g4);
        Set<d> set = c02.f87277c;
        if (!set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator<u<? extends h>> it = g4.iterator();
        while (it.hasNext()) {
            u<E> h4 = it.next().h(org.minidns.record.f.class);
            if (h4 != 0) {
                Set<d> b02 = b0(h4);
                if (b02.isEmpty()) {
                    z4 = true;
                } else {
                    hashSet.addAll(b02);
                }
                if (!c02.f87276b) {
                    org.minidns.a.f87101h.finer("SEP key is not self-signed.");
                }
                it.remove();
            }
        }
        if (c02.f87276b && !z4) {
            set.addAll(hashSet);
        }
        if (c02.f87275a && !c02.f87276b) {
            set.add(new d.g(bVar.f87207a));
        }
        if (!g4.isEmpty()) {
            if (g4.size() != list.size()) {
                throw new DnssecValidationFailedException(bVar, "Only some records are signed!");
            }
            set.add(new d.h(bVar));
        }
        return set;
    }

    private Set<d> a0(org.minidns.dnsmessage.a aVar) throws IOException {
        org.minidns.dnsname.a aVar2;
        d h4;
        HashSet hashSet = new HashSet();
        boolean z4 = false;
        org.minidns.dnsmessage.b bVar = aVar.f87176k.get(0);
        List<u<? extends h>> list = aVar.f87178m;
        Iterator<u<? extends h>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            u<? extends h> next = it.next();
            if (next.f87494b == u.c.SOA) {
                aVar2 = next.f87493a;
                break;
            }
        }
        if (aVar2 == null) {
            throw new DnssecValidationFailedException.AuthorityDoesNotContainSoa(aVar);
        }
        boolean z5 = false;
        for (u<? extends h> uVar : list) {
            int i4 = a.f87274a[uVar.f87494b.ordinal()];
            if (i4 == 1) {
                h4 = f.h(uVar.a(o.class), bVar);
            } else if (i4 == 2) {
                h4 = f.i(aVar2, uVar.a(m.class), bVar);
            }
            if (h4 != null) {
                hashSet.add(h4);
            } else {
                z5 = true;
            }
            z4 = true;
        }
        if (z4 && !z5) {
            throw new DnssecValidationFailedException(bVar, "Invalid NSEC!");
        }
        List<u<? extends h>> h5 = aVar.h();
        C1353b c02 = c0(bVar, list, h5);
        if (z5 && c02.f87277c.isEmpty()) {
            hashSet.clear();
        } else {
            hashSet.addAll(c02.f87277c);
        }
        if (h5.isEmpty() || h5.size() == list.size()) {
            return hashSet;
        }
        throw new DnssecValidationFailedException(bVar, "Only some resource records from the authority section are signed!");
    }

    private Set<d> b0(u<org.minidns.record.f> uVar) throws IOException {
        i iVar;
        org.minidns.dnsname.a aVar;
        org.minidns.record.f fVar = uVar.f87498f;
        HashSet hashSet = new HashSet();
        Set<d> hashSet2 = new HashSet<>();
        if (this.f87271n.containsKey(uVar.f87493a)) {
            if (fVar.o(this.f87271n.get(uVar.f87493a))) {
                return hashSet;
            }
            hashSet.add(new d.c(uVar));
            return hashSet;
        }
        if (uVar.f87493a.B()) {
            hashSet.add(new d.f());
            return hashSet;
        }
        c T = T(uVar.f87493a, u.c.DS);
        hashSet.addAll(T.b());
        Iterator it = T.f87279b.f87242c.k(g.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            iVar = (g) ((u) it.next()).f87498f;
            if (fVar.m() == iVar.f87435d) {
                hashSet2 = T.b();
                break;
            }
        }
        if (iVar == null) {
            org.minidns.a.f87101h.fine("There is no DS record for " + ((Object) uVar.f87493a) + ", server gives empty result");
        }
        if (iVar == null && (aVar = this.f87273p) != null && !aVar.z(uVar.f87493a)) {
            c T2 = T(org.minidns.dnsname.a.k(uVar.f87493a, this.f87273p), u.c.DLV);
            hashSet.addAll(T2.b());
            Iterator it2 = T2.f87279b.f87242c.k(org.minidns.record.d.class).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                u uVar2 = (u) it2.next();
                if (uVar.f87498f.m() == ((org.minidns.record.d) uVar2.f87498f).f87435d) {
                    org.minidns.a.f87101h.fine("Found DLV for " + ((Object) uVar.f87493a) + ", awesome.");
                    iVar = (i) uVar2.f87498f;
                    hashSet2 = T2.b();
                    break;
                }
            }
        }
        if (iVar == null) {
            if (!hashSet.isEmpty()) {
                return hashSet;
            }
            hashSet.add(new d.i(uVar.f87493a));
            return hashSet;
        }
        d g4 = f.g(uVar, iVar);
        if (g4 == null) {
            return hashSet2;
        }
        hashSet.add(g4);
        return hashSet;
    }

    private C1353b c0(org.minidns.dnsmessage.b bVar, Collection<u<? extends h>> collection, List<u<? extends h>> list) throws IOException {
        Date date = new Date();
        LinkedList linkedList = new LinkedList();
        C1353b c1353b = new C1353b(null);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<u<? extends h>> it = list.iterator();
        while (it.hasNext()) {
            u h4 = it.next().h(s.class);
            if (h4 != null) {
                s sVar = (s) h4.f87498f;
                if (sVar.f87485i.compareTo(date) < 0 || sVar.f87486j.compareTo(date) > 0) {
                    linkedList.add(sVar);
                } else {
                    arrayList.add(h4);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (linkedList.isEmpty()) {
                c1353b.f87277c.add(new d.h(bVar));
            } else {
                c1353b.f87277c.add(new d.e(bVar, linkedList));
            }
            return c1353b;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u uVar = (u) it2.next();
            s sVar2 = (s) uVar.f87498f;
            ArrayList arrayList2 = new ArrayList(collection.size());
            for (u<? extends h> uVar2 : collection) {
                if (uVar2.f87494b == sVar2.f87480d && uVar2.f87493a.equals(uVar.f87493a)) {
                    arrayList2.add(uVar2);
                }
            }
            c1353b.f87277c.addAll(d0(bVar, sVar2, arrayList2));
            if (bVar.f87207a.equals(sVar2.f87488l) && sVar2.f87480d == u.c.DNSKEY) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    org.minidns.record.f fVar = (org.minidns.record.f) ((u) it3.next()).h(org.minidns.record.f.class).f87498f;
                    it3.remove();
                    if (fVar.m() == sVar2.f87487k) {
                        c1353b.f87276b = true;
                    }
                }
                c1353b.f87275a = true;
            }
            if (Q(uVar.f87493a.f87227b, sVar2.f87488l.f87227b)) {
                list.removeAll(arrayList2);
            } else {
                org.minidns.a.f87101h.finer("Records at " + ((Object) uVar.f87493a) + " are cross-signed with a key from " + ((Object) sVar2.f87488l));
            }
            list.remove(uVar);
        }
        return c1353b;
    }

    private Set<d> d0(org.minidns.dnsmessage.b bVar, s sVar, List<u<? extends h>> list) throws IOException {
        HashSet hashSet = new HashSet();
        u.c cVar = sVar.f87480d;
        u.c cVar2 = u.c.DNSKEY;
        org.minidns.record.f fVar = null;
        if (cVar == cVar2) {
            Iterator it = u.b(org.minidns.record.f.class, list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u uVar = (u) it.next();
                if (((org.minidns.record.f) uVar.f87498f).m() == sVar.f87487k) {
                    fVar = (org.minidns.record.f) uVar.f87498f;
                    break;
                }
            }
        } else if (bVar.f87208b != u.c.DS || !sVar.f87488l.equals(bVar.f87207a)) {
            c T = T(sVar.f87488l, cVar2);
            hashSet.addAll(T.b());
            Iterator it2 = T.f87279b.f87242c.k(org.minidns.record.f.class).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                u uVar2 = (u) it2.next();
                if (((org.minidns.record.f) uVar2.f87498f).m() == sVar.f87487k) {
                    fVar = (org.minidns.record.f) uVar2.f87498f;
                    break;
                }
            }
        } else {
            hashSet.add(new d.i(bVar.f87207a));
            return hashSet;
        }
        if (fVar != null) {
            d f4 = f.f(list, sVar, fVar);
            if (f4 != null) {
                hashSet.add(f4);
            }
            return hashSet;
        }
        throw new DnssecValidationFailedException(bVar, list.size() + " " + sVar.f87480d + " record(s) are signed using an unknown key.");
    }

    @Override // org.minidns.iterative.b
    protected String I(org.minidns.dnsmessage.a aVar) {
        if (!aVar.A()) {
            return "DNSSEC OK (DO) flag not set in response";
        }
        if (aVar.f87175j) {
            return null;
        }
        return "CHECKING DISABLED (CD) flag not set in response";
    }

    public void L(org.minidns.dnsname.a aVar, byte[] bArr) {
        this.f87271n.put(aVar, bArr);
    }

    public void M() {
        this.f87271n.clear();
    }

    public void N(org.minidns.dnsname.a aVar) {
        this.f87273p = aVar;
    }

    public void O() {
        N(null);
    }

    public void P() {
        N(f87270r);
    }

    public boolean R() {
        return this.f87272o;
    }

    public c T(CharSequence charSequence, u.c cVar) throws IOException {
        return U(new org.minidns.dnsmessage.b(charSequence, cVar, u.b.IN));
    }

    public c U(org.minidns.dnsmessage.b bVar) throws IOException {
        return S(super.w(bVar));
    }

    public void V(org.minidns.dnsname.a aVar) {
        this.f87271n.remove(aVar);
    }

    public void W(boolean z4) {
        this.f87272o = z4;
    }

    @Override // org.minidns.iterative.b, org.minidns.a
    protected a.b n(a.b bVar) {
        bVar.B().j(this.f87107e.e()).h();
        bVar.H(true);
        return bVar;
    }

    @Override // org.minidns.a
    public org.minidns.dnsqueryresult.c w(org.minidns.dnsmessage.b bVar) throws IOException {
        c U = U(bVar);
        if (U.c()) {
            return U.f87279b;
        }
        throw new IOException();
    }

    public b(org.minidns.b bVar) {
        super(bVar);
        this.f87271n = new ConcurrentHashMap();
        this.f87272o = true;
        L(org.minidns.dnsname.a.f87222q, f87269q.toByteArray());
    }

    /* compiled from: DnssecClient.java */
    /* renamed from: org.minidns.dnssec.b$b, reason: collision with other inner class name */
    private static class C1353b {

        /* renamed from: a, reason: collision with root package name */
        boolean f87275a;

        /* renamed from: b, reason: collision with root package name */
        boolean f87276b;

        /* renamed from: c, reason: collision with root package name */
        Set<d> f87277c;

        private C1353b() {
            this.f87275a = false;
            this.f87276b = false;
            this.f87277c = new HashSet();
        }

        /* synthetic */ C1353b(a aVar) {
            this();
        }
    }
}
