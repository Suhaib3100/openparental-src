package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;

/* compiled from: StringMaker.java */
/* loaded from: classes9.dex */
class n {

    /* renamed from: j, reason: collision with root package name */
    static n f87780j;

    /* renamed from: k, reason: collision with root package name */
    static n f87781k;

    /* renamed from: l, reason: collision with root package name */
    static n f87782l;

    /* renamed from: a, reason: collision with root package name */
    boolean f87783a = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f87784b = true;

    /* renamed from: c, reason: collision with root package name */
    boolean f87785c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f87786d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f87787e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f87788f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f87789g = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f87790h = true;

    /* renamed from: i, reason: collision with root package name */
    int f87791i;

    static {
        n nVar = new n();
        f87780j = nVar;
        nVar.f87783a = true;
        nVar.f87784b = false;
        nVar.f87785c = false;
        nVar.f87786d = false;
        nVar.f87787e = true;
        nVar.f87788f = false;
        nVar.f87789g = false;
        nVar.f87791i = 0;
        n nVar2 = new n();
        f87781k = nVar2;
        nVar2.f87783a = true;
        nVar2.f87784b = true;
        nVar2.f87785c = false;
        nVar2.f87786d = false;
        nVar2.f87787e = false;
        f87780j.f87791i = 1;
        n nVar3 = new n();
        f87782l = nVar3;
        nVar3.f87783a = false;
        nVar3.f87784b = true;
        nVar3.f87785c = false;
        nVar3.f87786d = true;
        nVar3.f87787e = false;
        nVar3.f87790h = false;
        nVar3.f87791i = 2;
    }

    n() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f87784b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f87785c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i4]));
        }
    }

    String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    String e(int i4) {
        if (!this.f87786d) {
            return "";
        }
        String modifier = Modifier.toString(i4);
        return modifier.length() == 0 ? "" : modifier.concat(" ");
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f87787e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f87783a);
    }

    String h(Class cls, String str, boolean z4) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z4 ? i(str).replace('$', '.') : str.replace('$', '.');
        }
        Class<?> componentType = cls.getComponentType();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(componentType, componentType.getName(), z4));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
