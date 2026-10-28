package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import lg.v;

/* compiled from: MethodSignatureImpl.java */
/* loaded from: classes9.dex */
class k extends c implements v {

    /* renamed from: p, reason: collision with root package name */
    private Method f87762p;

    /* renamed from: q, reason: collision with root package name */
    Class f87763q;

    k(String str) {
        super(str);
    }

    private Method F(Class cls, String str, Class[] clsArr, Set set) {
        if (cls == null) {
            return null;
        }
        if (!set.contains(cls)) {
            set.add(cls);
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method F = F(cls.getSuperclass(), str, clsArr, set);
        if (F != null) {
            return F;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null) {
            for (Class<?> cls2 : interfaces) {
                Method F2 = F(cls2, str, clsArr, set);
                if (F2 != null) {
                    return F2;
                }
            }
        }
        return null;
    }

    @Override // lg.v
    public Method getMethod() {
        if (this.f87762p == null) {
            Class a5 = a();
            try {
                this.f87762p = a5.getDeclaredMethod(getName(), c());
            } catch (NoSuchMethodException unused) {
                HashSet hashSet = new HashSet();
                hashSet.add(a5);
                this.f87762p = F(a5, getName(), c(), hashSet);
            }
        }
        return this.f87762p;
    }

    @Override // lg.v
    public Class getReturnType() {
        if (this.f87763q == null) {
            this.f87763q = v(6);
        }
        return this.f87763q;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        if (nVar.f87784b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f87784b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }

    k(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i4, str, cls, clsArr, strArr, clsArr2);
        this.f87763q = cls2;
    }
}
