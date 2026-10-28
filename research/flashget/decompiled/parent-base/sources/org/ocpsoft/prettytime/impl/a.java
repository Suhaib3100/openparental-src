package org.ocpsoft.prettytime.impl;

import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeUnit;

/* compiled from: DurationImpl.java */
/* loaded from: classes9.dex */
public class a implements Duration {

    /* renamed from: a, reason: collision with root package name */
    private long f87925a;

    /* renamed from: b, reason: collision with root package name */
    private long f87926b;

    /* renamed from: c, reason: collision with root package name */
    private TimeUnit f87927c;

    @Override // org.ocpsoft.prettytime.Duration
    public TimeUnit a() {
        return this.f87927c;
    }

    @Override // org.ocpsoft.prettytime.Duration
    public boolean b() {
        return !e();
    }

    @Override // org.ocpsoft.prettytime.Duration
    public long c() {
        return this.f87926b;
    }

    @Override // org.ocpsoft.prettytime.Duration
    public long d(int i4) {
        long abs = Math.abs(f());
        return (c() == 0 || Math.abs((((double) c()) / ((double) a().b())) * 100.0d) <= ((double) i4)) ? abs : abs + 1;
    }

    @Override // org.ocpsoft.prettytime.Duration
    public boolean e() {
        return f() < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f87926b != aVar.f87926b || this.f87925a != aVar.f87925a) {
            return false;
        }
        TimeUnit timeUnit = this.f87927c;
        if (timeUnit == null) {
            if (aVar.f87927c != null) {
                return false;
            }
        } else if (!timeUnit.equals(aVar.f87927c)) {
            return false;
        }
        return true;
    }

    @Override // org.ocpsoft.prettytime.Duration
    public long f() {
        return this.f87925a;
    }

    public void g(long j4) {
        this.f87926b = j4;
    }

    public void h(long j4) {
        this.f87925a = j4;
    }

    public int hashCode() {
        long j4 = this.f87926b;
        long j5 = this.f87925a;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) + 31) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        TimeUnit timeUnit = this.f87927c;
        return i4 + (timeUnit == null ? 0 : timeUnit.hashCode());
    }

    public void i(TimeUnit timeUnit) {
        this.f87927c = timeUnit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DurationImpl [");
        sb.append(this.f87925a);
        sb.append(" ");
        sb.append(this.f87927c);
        sb.append(", delta=");
        return android.support.v4.media.session.b.a(sb, this.f87926b, "]");
    }
}
