package org.minidns.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes3.dex */
public class c extends org.minidns.b {

    /* renamed from: b, reason: collision with root package name */
    protected long f87124b;

    /* renamed from: c, reason: collision with root package name */
    protected long f87125c;

    /* renamed from: d, reason: collision with root package name */
    protected long f87126d;

    /* renamed from: e, reason: collision with root package name */
    protected int f87127e;

    /* renamed from: f, reason: collision with root package name */
    protected long f87128f;

    /* renamed from: g, reason: collision with root package name */
    protected LinkedHashMap<org.minidns.dnsmessage.a, org.minidns.dnsqueryresult.a> f87129g;

    /* compiled from: LruCache.java */
    class a extends LinkedHashMap<org.minidns.dnsmessage.a, org.minidns.dnsqueryresult.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, float f4, boolean z4, int i5) {
            super(i4, f4, z4);
            this.f87130b = i5;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<org.minidns.dnsmessage.a, org.minidns.dnsqueryresult.a> entry) {
            return size() > this.f87130b;
        }
    }

    public c(int i4, long j4) {
        this.f87124b = 0L;
        this.f87125c = 0L;
        this.f87126d = 0L;
        this.f87127e = i4;
        this.f87128f = j4;
        this.f87129g = new a(Math.min(((i4 + 3) / 4) + i4 + 2, 11), 0.75f, true, i4);
    }

    @Override // org.minidns.b
    protected synchronized org.minidns.dnsqueryresult.a b(org.minidns.dnsmessage.a aVar) {
        org.minidns.dnsqueryresult.a aVar2 = this.f87129g.get(aVar);
        if (aVar2 == null) {
            this.f87124b++;
            return null;
        }
        org.minidns.dnsmessage.a aVar3 = aVar2.f87242c;
        if ((Math.min(aVar3.p(), this.f87128f) * 1000) + aVar3.f87182q >= System.currentTimeMillis()) {
            this.f87126d++;
            return aVar2;
        }
        this.f87124b++;
        this.f87125c++;
        this.f87129g.remove(aVar);
        return null;
    }

    @Override // org.minidns.b
    public void c(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar, org.minidns.dnsname.a aVar2) {
    }

    @Override // org.minidns.b
    protected synchronized void e(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar) {
        if (cVar.f87242c.f87182q <= 0) {
            return;
        }
        this.f87129g.put(aVar, new org.minidns.dnsqueryresult.b(aVar, cVar));
    }

    public synchronized void f() {
        this.f87129g.clear();
        this.f87124b = 0L;
        this.f87126d = 0L;
        this.f87125c = 0L;
    }

    public long g() {
        return this.f87125c;
    }

    public long h() {
        return this.f87126d;
    }

    public long i() {
        return this.f87124b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LRUCache{usage=");
        sb.append(this.f87129g.size());
        sb.append("/");
        sb.append(this.f87127e);
        sb.append(", hits=");
        sb.append(this.f87126d);
        sb.append(", misses=");
        sb.append(this.f87124b);
        sb.append(", expires=");
        return android.support.v4.media.session.b.a(sb, this.f87125c, "}");
    }

    public c(int i4) {
        this(i4, Long.MAX_VALUE);
    }

    public c() {
        this(512);
    }
}
