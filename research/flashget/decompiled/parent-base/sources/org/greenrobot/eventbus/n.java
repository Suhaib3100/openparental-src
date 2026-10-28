package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* compiled from: SubscriberMethod.java */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    final Method f86869a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f86870b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f86871c;

    /* renamed from: d, reason: collision with root package name */
    final int f86872d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f86873e;

    /* renamed from: f, reason: collision with root package name */
    String f86874f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        this.f86869a = method;
        this.f86870b = threadMode;
        this.f86871c = cls;
        this.f86872d = i4;
        this.f86873e = z4;
    }

    private synchronized void a() {
        if (this.f86874f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f86869a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f86869a.getName());
            sb.append('(');
            sb.append(this.f86871c.getName());
            this.f86874f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        a();
        n nVar = (n) obj;
        nVar.a();
        return this.f86874f.equals(nVar.f86874f);
    }

    public int hashCode() {
        return this.f86869a.hashCode();
    }
}
