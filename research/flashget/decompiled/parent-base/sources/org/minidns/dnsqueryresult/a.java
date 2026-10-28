package org.minidns.dnsqueryresult;

import org.minidns.dnsqueryresult.c;

/* compiled from: CachedDnsQueryResult.java */
/* loaded from: classes4.dex */
public abstract class a extends c {

    /* renamed from: e, reason: collision with root package name */
    protected final c f87238e;

    protected a(org.minidns.dnsmessage.a aVar, c cVar) {
        super(c.a.cachedDirect, aVar, cVar.f87242c);
        this.f87238e = cVar;
    }

    protected a(org.minidns.dnsmessage.a aVar, org.minidns.dnsmessage.a aVar2, c cVar) {
        super(c.a.cachedSynthesized, aVar, aVar2);
        this.f87238e = cVar;
    }
}
