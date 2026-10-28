package org.minidns.cache;

import org.minidns.record.h;
import org.minidns.record.u;

/* compiled from: FullLruCache.java */
/* loaded from: classes3.dex */
public class b extends a {
    public b() {
        super(512);
    }

    @Override // org.minidns.cache.a
    protected boolean l(u<? extends h> uVar, org.minidns.dnsmessage.b bVar, org.minidns.dnsname.a aVar) {
        return true;
    }

    public b(int i4) {
        super(i4);
    }

    public b(int i4, long j4) {
        super(i4, j4);
    }
}
