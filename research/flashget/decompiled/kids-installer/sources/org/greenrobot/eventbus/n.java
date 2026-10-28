package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* compiled from: SubscriberMethod.java */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    final Method f32196a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f32197b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f32198c;

    /* renamed from: d, reason: collision with root package name */
    final int f32199d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f32200e;

    /* renamed from: f, reason: collision with root package name */
    String f32201f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i5, boolean z5) {
        this.f32196a = method;
        this.f32197b = threadMode;
        this.f32198c = cls;
        this.f32199d = i5;
        this.f32200e = z5;
    }

    private synchronized void a() {
        if (this.f32201f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f32196a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f32196a.getName());
            sb.append('(');
            sb.append(this.f32198c.getName());
            this.f32201f = sb.toString();
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
        return this.f32201f.equals(nVar.f32201f);
    }

    public int hashCode() {
        return this.f32196a.hashCode();
    }
}
