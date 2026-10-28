package org.minidns.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.minidns.dnsmessage.a;
import org.minidns.dnsqueryresult.e;
import org.minidns.record.h;
import org.minidns.record.u;

/* compiled from: ExtendedLruCache.java */
/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f87123h = false;

    public a() {
        super(512);
    }

    private void j(Map<org.minidns.dnsmessage.a, List<u<? extends h>>> map, org.minidns.dnsmessage.a aVar, List<u<? extends h>> list, org.minidns.dnsname.a aVar2) {
        a.b f4;
        for (u<? extends h> uVar : list) {
            if (l(uVar, aVar.y(), aVar2) && (f4 = uVar.f()) != null) {
                f4.y(aVar);
                f4.C(aVar.f87179n);
                org.minidns.dnsmessage.a x4 = f4.x();
                if (!x4.equals(aVar)) {
                    List<u<? extends h>> list2 = map.get(x4);
                    if (list2 == null) {
                        list2 = new LinkedList<>();
                        map.put(x4, list2);
                    }
                    list2.add(uVar);
                }
            }
        }
    }

    private void k(org.minidns.dnsqueryresult.c cVar, Map<org.minidns.dnsmessage.a, List<u<? extends h>>> map) {
        org.minidns.dnsmessage.a aVar = cVar.f87242c;
        for (Map.Entry<org.minidns.dnsmessage.a, List<u<? extends h>>> entry : map.entrySet()) {
            org.minidns.dnsmessage.a key = entry.getKey();
            e eVar = new e(key, aVar.a().M(key.y()).F(true).u(entry.getValue()).x(), cVar);
            synchronized (this) {
                this.f87129g.put(key, eVar);
            }
        }
    }

    @Override // org.minidns.cache.c, org.minidns.b
    public void c(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar, org.minidns.dnsname.a aVar2) {
        org.minidns.dnsmessage.a aVar3 = cVar.f87242c;
        HashMap hashMap = new HashMap(aVar3.f87179n.size());
        j(hashMap, aVar, aVar3.f87178m, aVar2);
        j(hashMap, aVar, aVar3.f87179n, aVar2);
        k(cVar, hashMap);
    }

    @Override // org.minidns.cache.c, org.minidns.b
    protected void e(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
        super.e(aVar, cVar);
        org.minidns.dnsmessage.a aVar2 = cVar.f87242c;
        HashMap hashMap = new HashMap(aVar2.f87179n.size());
        j(hashMap, aVar, aVar2.f87177l, null);
        j(hashMap, aVar, aVar2.f87178m, null);
        j(hashMap, aVar, aVar2.f87179n, null);
        k(cVar, hashMap);
    }

    protected boolean l(u<? extends h> uVar, org.minidns.dnsmessage.b bVar, org.minidns.dnsname.a aVar) {
        return uVar.f87493a.z(bVar.f87207a) || (aVar != null ? uVar.f87493a.z(aVar) : false);
    }

    public a(int i4) {
        super(i4);
    }

    public a(int i4, long j4) {
        super(i4, j4);
    }
}
