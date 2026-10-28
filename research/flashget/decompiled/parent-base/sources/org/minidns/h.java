package org.minidns;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.minidns.record.u;

/* compiled from: RrSet.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsname.a f87351a;

    /* renamed from: b, reason: collision with root package name */
    public final u.c f87352b;

    /* renamed from: c, reason: collision with root package name */
    public final u.b f87353c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<u<? extends org.minidns.record.h>> f87354d;

    /* compiled from: RrSet.java */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f87355e = false;

        /* renamed from: a, reason: collision with root package name */
        private org.minidns.dnsname.a f87356a;

        /* renamed from: b, reason: collision with root package name */
        private u.c f87357b;

        /* renamed from: c, reason: collision with root package name */
        private u.b f87358c;

        /* renamed from: d, reason: collision with root package name */
        Set<u<? extends org.minidns.record.h>> f87359d;

        public boolean a(u<? extends org.minidns.record.h> uVar) {
            if (!d(uVar)) {
                return false;
            }
            b(uVar);
            return true;
        }

        public b b(u<? extends org.minidns.record.h> uVar) {
            if (this.f87356a == null) {
                this.f87356a = uVar.f87493a;
                this.f87357b = uVar.f87494b;
                this.f87358c = uVar.f87495c;
            } else if (!d(uVar)) {
                throw new IllegalArgumentException("Can not add " + uVar + " to RRSet " + ((Object) this.f87356a) + ' ' + this.f87357b + ' ' + this.f87358c);
            }
            this.f87359d.add(uVar);
            return this;
        }

        public h c() {
            org.minidns.dnsname.a aVar = this.f87356a;
            if (aVar != null) {
                return new h(aVar, this.f87357b, this.f87358c, this.f87359d);
            }
            throw new IllegalStateException();
        }

        public boolean d(u<? extends org.minidns.record.h> uVar) {
            org.minidns.dnsname.a aVar = this.f87356a;
            if (aVar == null) {
                return true;
            }
            return aVar.equals(uVar.f87493a) && this.f87357b == uVar.f87494b && this.f87358c == uVar.f87495c;
        }

        private b() {
            this.f87359d = new LinkedHashSet(8);
        }
    }

    public static b a() {
        return new b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f87351a);
        sb.append('\t');
        sb.append(this.f87353c);
        sb.append('\t');
        sb.append(this.f87352b);
        sb.append('\n');
        Iterator<u<? extends org.minidns.record.h>> it = this.f87354d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }

    private h(org.minidns.dnsname.a aVar, u.c cVar, u.b bVar, Set<u<? extends org.minidns.record.h>> set) {
        this.f87351a = aVar;
        this.f87352b = cVar;
        this.f87353c = bVar;
        this.f87354d = Collections.unmodifiableSet(set);
    }
}
