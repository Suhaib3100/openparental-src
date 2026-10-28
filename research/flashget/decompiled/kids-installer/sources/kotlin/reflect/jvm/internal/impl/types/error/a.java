package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes6.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@d5.d kotlin.reflect.jvm.internal.impl.name.f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "裪"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r2 = r21
            kotlin.jvm.internal.l0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.error.k r10 = kotlin.reflect.jvm.internal.impl.types.error.k.f26404a
            kotlin.reflect.jvm.internal.impl.descriptors.h0 r1 = r10.i()
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS
            kotlin.collections.m0 r11 = kotlin.collections.EmptyList.f23167o
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.a1.f24103a
            r7 = 0
            kotlin.reflect.jvm.internal.impl.storage.n r8 = kotlin.reflect.jvm.internal.impl.storage.f.f26300e
            r0 = r20
            r2 = r21
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.f.u1(r9, r0, r1, r12)
            kotlin.reflect.jvm.internal.impl.descriptors.u r2 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24439d
            r0.x1(r11, r2)
            java.lang.String r2 = "裫"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            kotlin.reflect.jvm.internal.impl.name.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "裬"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            kotlin.jvm.internal.l0.o(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            kotlin.reflect.jvm.internal.impl.types.error.f r1 = kotlin.reflect.jvm.internal.impl.types.error.k.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.types.error.h r2 = new kotlin.reflect.jvm.internal.impl.types.error.h
            kotlin.reflect.jvm.internal.impl.types.error.j r14 = kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            kotlin.reflect.jvm.internal.impl.types.error.i r12 = r10.e(r14, r3)
            r15 = 0
            r16 = 0
            java.lang.String[] r3 = new java.lang.String[r5]
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.n1(r2)
            java.util.Set r2 = kotlin.collections.o1.f(r0)
            r9.R0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.error.a.<init>(kotlin.reflect.jvm.internal.impl.name.f):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a
    @d5.d
    /* renamed from: M0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@d5.d q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("裭"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q(@d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(o1Var, ProtectedSandApp.s("裮"));
        l0.p(gVar, ProtectedSandApp.s("裯"));
        g gVar2 = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        l0.o(fVar, ProtectedSandApp.s("裰"));
        return k.b(gVar2, fVar, o1Var.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public n d(q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("裱"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @d5.d
    public String toString() {
        String h5 = getName().h();
        l0.o(h5, ProtectedSandApp.s("裲"));
        return h5;
    }
}
