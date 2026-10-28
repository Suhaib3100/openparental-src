package net.time4j.engine;

import java.io.Serializable;

/* compiled from: CalendarDays.java */
/* loaded from: classes7.dex */
public final class i implements Comparable<i>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f82736b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f82737c = new i(1);
    private final long days;

    private i(long j4) {
        this.days = j4;
    }

    public static i b(h hVar, h hVar2) {
        return i(net.time4j.base.c.m(hVar2.b(), hVar.b()));
    }

    public static i i(long j4) {
        return j4 == 0 ? f82736b : j4 == 1 ? f82737c : new i(j4);
    }

    public i a() {
        return this.days < 0 ? e() : this;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        long j4 = this.days;
        long j5 = iVar.days;
        if (j4 < j5) {
            return -1;
        }
        return j4 > j5 ? 1 : 0;
    }

    public long d() {
        return this.days;
    }

    public i e() {
        return i(net.time4j.base.c.k(this.days));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.days == ((i) obj).days;
    }

    public boolean f() {
        return this.days < 0;
    }

    public boolean g() {
        return this.days == 0;
    }

    public i h(i iVar) {
        return i(net.time4j.base.c.m(this.days, iVar.days));
    }

    public int hashCode() {
        long j4 = this.days;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public i j(i iVar) {
        return i(net.time4j.base.c.f(this.days, iVar.days));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.days < 0) {
            sb.append('-');
        }
        sb.append('P');
        sb.append(Math.abs(this.days));
        sb.append('D');
        return sb.toString();
    }
}
