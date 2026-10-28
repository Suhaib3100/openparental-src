package org.minidns.hla;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.minidns.MiniDnsException;
import org.minidns.a;
import org.minidns.record.j;
import org.minidns.record.w;

/* compiled from: SrvResolverResult.java */
/* loaded from: classes9.dex */
public class d extends c<w> {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f87378n = false;

    /* renamed from: j, reason: collision with root package name */
    private final org.minidns.hla.b f87379j;

    /* renamed from: k, reason: collision with root package name */
    private final a.c f87380k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.c f87381l;

    /* renamed from: m, reason: collision with root package name */
    private List<b> f87382m;

    /* compiled from: SrvResolverResult.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87383a;

        static {
            int[] iArr = new int[a.c.values().length];
            f87383a = iArr;
            try {
                iArr[a.c.v4only.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87383a[a.c.v6only.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87383a[a.c.v4v6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87383a[a.c.v6v4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SrvResolverResult.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final org.minidns.dnsname.a f87384a;

        /* renamed from: b, reason: collision with root package name */
        public final gg.c f87385b;

        /* renamed from: c, reason: collision with root package name */
        public final w f87386c;

        /* renamed from: d, reason: collision with root package name */
        public final List<j<? extends InetAddress>> f87387d;

        /* renamed from: e, reason: collision with root package name */
        public final c<org.minidns.record.a> f87388e;

        /* renamed from: f, reason: collision with root package name */
        public final c<org.minidns.record.b> f87389f;

        /* renamed from: g, reason: collision with root package name */
        public final int f87390g;

        /* synthetic */ b(org.minidns.dnsname.a aVar, gg.c cVar, w wVar, List list, c cVar2, c cVar3, a aVar2) {
            this(aVar, cVar, wVar, list, cVar2, cVar3);
        }

        private b(org.minidns.dnsname.a aVar, gg.c cVar, w wVar, List<j<? extends InetAddress>> list, c<org.minidns.record.a> cVar2, c<org.minidns.record.b> cVar3) {
            this.f87384a = aVar;
            this.f87385b = cVar;
            this.f87386c = wVar;
            this.f87387d = Collections.unmodifiableList(list);
            this.f87390g = wVar.f87512f;
            this.f87388e = cVar2;
            this.f87389f = cVar3;
        }
    }

    d(c<w> cVar, gg.c cVar2, org.minidns.hla.b bVar) throws MiniDnsException.NullResultException {
        super(cVar.f87369a, cVar.f87375g, cVar.f87373e);
        this.f87379j = bVar;
        this.f87380k = bVar.a().k();
        this.f87381l = cVar2;
    }

    @SafeVarargs
    public static List<b> q(Collection<b>... collectionArr) {
        int i4 = 0;
        for (Collection<b> collection : collectionArr) {
            if (collection != null) {
                i4 += collection.size();
            }
        }
        ArrayList arrayList = new ArrayList(i4);
        IdentityHashMap identityHashMap = new IdentityHashMap(i4);
        for (Collection<b> collection2 : collectionArr) {
            if (collection2 != null) {
                for (b bVar : collection2) {
                    arrayList.add(bVar.f87386c);
                    identityHashMap.put(bVar.f87386c, bVar);
                }
            }
        }
        List<w> b5 = org.minidns.util.j.b(arrayList);
        ArrayList arrayList2 = new ArrayList(i4);
        Iterator<w> it = b5.iterator();
        while (it.hasNext()) {
            arrayList2.add((b) identityHashMap.get(it.next()));
        }
        return arrayList2;
    }

    public List<b> o() throws IOException {
        c cVar;
        c cVar2;
        List<b> list = this.f87382m;
        if (list != null) {
            return list;
        }
        m();
        if (p()) {
            return null;
        }
        List<w> b5 = org.minidns.util.j.b(a());
        ArrayList arrayList = new ArrayList(b5.size());
        for (w wVar : b5) {
            Set emptySet = Collections.emptySet();
            if (this.f87380k.v4) {
                c d5 = this.f87379j.d(wVar.f87513g, org.minidns.record.a.class);
                if (d5.n() && !d5.j()) {
                    emptySet = d5.a();
                }
                cVar = d5;
            } else {
                cVar = null;
            }
            Set emptySet2 = Collections.emptySet();
            if (this.f87380k.v6) {
                c d6 = this.f87379j.d(wVar.f87513g, org.minidns.record.b.class);
                if (d6.n() && !d6.j()) {
                    emptySet2 = d6.a();
                }
                cVar2 = d6;
            } else {
                cVar2 = null;
            }
            if (!emptySet.isEmpty() || !emptySet2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(emptySet2.size() + emptySet.size());
                int i4 = a.f87383a[this.f87380k.ordinal()];
                if (i4 == 1) {
                    arrayList2.addAll(emptySet);
                } else if (i4 == 2) {
                    arrayList2.addAll(emptySet2);
                } else if (i4 == 3) {
                    arrayList2.addAll(emptySet);
                    arrayList2.addAll(emptySet2);
                } else if (i4 == 4) {
                    arrayList2.addAll(emptySet2);
                    arrayList2.addAll(emptySet);
                }
                arrayList.add(new b(this.f87369a.f87207a, this.f87381l, wVar, arrayList2, cVar, cVar2, null));
            }
        }
        this.f87382m = arrayList;
        return arrayList;
    }

    public boolean p() {
        if (a().size() != 1) {
            return false;
        }
        return !r0.iterator().next().i();
    }
}
