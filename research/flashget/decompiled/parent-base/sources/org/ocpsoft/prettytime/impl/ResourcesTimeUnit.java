package org.ocpsoft.prettytime.impl;

import org.ocpsoft.prettytime.TimeUnit;

/* loaded from: classes9.dex */
public abstract class ResourcesTimeUnit implements TimeUnit {

    /* renamed from: a, reason: collision with root package name */
    private long f87923a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f87924b = 1;

    @Override // org.ocpsoft.prettytime.TimeUnit
    public long a() {
        return this.f87923a;
    }

    @Override // org.ocpsoft.prettytime.TimeUnit
    public long b() {
        return this.f87924b;
    }

    @Override // org.ocpsoft.prettytime.TimeUnit
    public boolean c() {
        return true;
    }

    protected String d() {
        return "org.ocpsoft.prettytime.i18n.Resources";
    }

    protected abstract String e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesTimeUnit resourcesTimeUnit = (ResourcesTimeUnit) obj;
        return this.f87923a == resourcesTimeUnit.f87923a && this.f87924b == resourcesTimeUnit.f87924b;
    }

    public void f(long j4) {
        this.f87923a = j4;
    }

    public void g(long j4) {
        this.f87924b = j4;
    }

    public int hashCode() {
        long j4 = this.f87923a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) + 31) * 31;
        long j5 = this.f87924b;
        return i4 + ((int) ((j5 >>> 32) ^ j5));
    }

    public String toString() {
        return e();
    }
}
