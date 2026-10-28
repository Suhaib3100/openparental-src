package org.mp4parser.aspectj.runtime.reflect;

import lg.c0;

/* compiled from: SourceLocationImpl.java */
/* loaded from: classes9.dex */
class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    Class f87777a;

    /* renamed from: b, reason: collision with root package name */
    String f87778b;

    /* renamed from: c, reason: collision with root package name */
    int f87779c;

    m(Class cls, String str, int i4) {
        this.f87777a = cls;
        this.f87778b = str;
        this.f87779c = i4;
    }

    @Override // lg.c0
    public int a() {
        return -1;
    }

    @Override // lg.c0
    public int b() {
        return this.f87779c;
    }

    @Override // lg.c0
    public Class c() {
        return this.f87777a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(u());
        stringBuffer.append(":");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }

    @Override // lg.c0
    public String u() {
        return this.f87778b;
    }
}
