package org.minidns;

/* compiled from: DnsCache.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f87111a = 512;

    public final org.minidns.dnsqueryresult.a a(org.minidns.dnsmessage.a aVar) {
        return b(aVar.c());
    }

    protected abstract org.minidns.dnsqueryresult.a b(org.minidns.dnsmessage.a aVar);

    public abstract void c(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar, org.minidns.dnsname.a aVar2);

    public final void d(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
        e(aVar.c(), cVar);
    }

    protected abstract void e(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar);
}
