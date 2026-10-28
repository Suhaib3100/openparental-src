package org.minidns.dnssec;

import java.util.Collections;
import java.util.Set;
import org.minidns.record.s;
import org.minidns.record.u;

/* compiled from: DnssecQueryResult.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsmessage.a f87278a;

    /* renamed from: b, reason: collision with root package name */
    public final org.minidns.dnsqueryresult.c f87279b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<u<s>> f87280c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<d> f87281d;

    c(org.minidns.dnsmessage.a aVar, org.minidns.dnsqueryresult.c cVar, Set<u<s>> set, Set<d> set2) {
        this.f87278a = aVar;
        this.f87279b = cVar;
        this.f87280c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            this.f87281d = Collections.emptySet();
        } else {
            this.f87281d = Collections.unmodifiableSet(set2);
        }
    }

    public Set<u<s>> a() {
        return this.f87280c;
    }

    public Set<d> b() {
        return this.f87281d;
    }

    public boolean c() {
        return this.f87281d.isEmpty();
    }
}
