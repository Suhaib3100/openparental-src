package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* compiled from: InitializerSignatureImpl.java */
/* loaded from: classes9.dex */
class g extends c implements lg.o {

    /* renamed from: p, reason: collision with root package name */
    private Constructor f87751p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    g(int r9, java.lang.Class r10) {
        /*
            r8 = this;
            boolean r0 = java.lang.reflect.Modifier.isStatic(r9)
            if (r0 == 0) goto La
            java.lang.String r0 = "<clinit>"
        L8:
            r3 = r0
            goto Ld
        La:
            java.lang.String r0 = "<init>"
            goto L8
        Ld:
            java.lang.Class[] r7 = org.mp4parser.aspectj.runtime.reflect.l.f87767k
            java.lang.String[] r6 = org.mp4parser.aspectj.runtime.reflect.l.f87766j
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mp4parser.aspectj.runtime.reflect.g.<init>(int, java.lang.Class):void");
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l, org.mp4parser.aspectj.lang.e
    public String getName() {
        return Modifier.isStatic(getModifiers()) ? "<clinit>" : "<init>";
    }

    @Override // lg.o
    public Constructor m() {
        if (this.f87751p == null) {
            try {
                this.f87751p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f87751p;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    g(String str) {
        super(str);
    }
}
