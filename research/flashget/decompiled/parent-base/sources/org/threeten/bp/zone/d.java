package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.s;

/* compiled from: ZoneOffsetTransition.java */
/* loaded from: classes9.dex */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88430e = -6946044323557704546L;

    /* renamed from: b, reason: collision with root package name */
    private final org.threeten.bp.h f88431b;

    /* renamed from: c, reason: collision with root package name */
    private final s f88432c;

    /* renamed from: d, reason: collision with root package name */
    private final s f88433d;

    d(org.threeten.bp.h hVar, s sVar, s sVar2) {
        this.f88431b = hVar;
        this.f88432c = sVar;
        this.f88433d = sVar2;
    }

    private int e() {
        return this.f88433d.v() - this.f88432c.v();
    }

    public static d m(org.threeten.bp.h hVar, s sVar, s sVar2) {
        ng.d.j(hVar, "transition");
        ng.d.j(sVar, "offsetBefore");
        ng.d.j(sVar2, "offsetAfter");
        if (sVar.equals(sVar2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        if (hVar.Y() == 0) {
            return new d(hVar, sVar, sVar2);
        }
        throw new IllegalArgumentException("Nano-of-second must be zero");
    }

    static d n(DataInput dataInput) throws IOException {
        long b5 = a.b(dataInput);
        s d5 = a.d(dataInput);
        s d6 = a.d(dataInput);
        if (d5.equals(d6)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new d(b5, d5, d6);
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return f().compareTo(dVar.f());
    }

    public org.threeten.bp.h b() {
        return this.f88431b.L0(e());
    }

    public org.threeten.bp.h c() {
        return this.f88431b;
    }

    public org.threeten.bp.e d() {
        return org.threeten.bp.e.K(e());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f88431b.equals(dVar.f88431b) && this.f88432c.equals(dVar.f88432c) && this.f88433d.equals(dVar.f88433d);
    }

    public org.threeten.bp.f f() {
        return this.f88431b.A(this.f88432c);
    }

    public s g() {
        return this.f88433d;
    }

    public s h() {
        return this.f88432c;
    }

    public int hashCode() {
        return (this.f88431b.hashCode() ^ this.f88432c.hashCode()) ^ Integer.rotateLeft(this.f88433d.hashCode(), 16);
    }

    List<s> i() {
        return j() ? Collections.emptyList() : Arrays.asList(this.f88432c, this.f88433d);
    }

    public boolean j() {
        return this.f88433d.v() > this.f88432c.v();
    }

    public boolean k() {
        return this.f88433d.v() < this.f88432c.v();
    }

    public boolean l(s sVar) {
        if (j()) {
            return false;
        }
        return this.f88432c.equals(sVar) || this.f88433d.equals(sVar);
    }

    public long o() {
        return this.f88431b.z(this.f88432c);
    }

    void p(DataOutput dataOutput) throws IOException {
        a.f(o(), dataOutput);
        a.h(this.f88432c, dataOutput);
        a.h(this.f88433d, dataOutput);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(j() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f88431b);
        sb.append(this.f88432c);
        sb.append(" to ");
        sb.append(this.f88433d);
        sb.append(']');
        return sb.toString();
    }

    d(long j4, s sVar, s sVar2) {
        this.f88431b = org.threeten.bp.h.z0(j4, 0, sVar);
        this.f88432c = sVar;
        this.f88433d = sVar2;
    }
}
