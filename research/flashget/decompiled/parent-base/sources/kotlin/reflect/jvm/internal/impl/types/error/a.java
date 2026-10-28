package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes7.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@fg.l kotlin.reflect.jvm.internal.impl.name.f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "縏\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.types.error.k r0 = kotlin.reflect.jvm.internal.impl.types.error.k.f78413a
            kotlin.reflect.jvm.internal.impl.descriptors.h0 r2 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS
            kotlin.collections.j0 r10 = kotlin.collections.j0.f74919b
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r11 = kotlin.reflect.jvm.internal.impl.descriptors.a1.f75900a
            r8 = 0
            kotlin.reflect.jvm.internal.impl.storage.n r9 = kotlin.reflect.jvm.internal.impl.storage.f.f78308e
            r1 = r12
            r3 = r13
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r13 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13 = r13.b()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f r13 = kotlin.reflect.jvm.internal.impl.descriptors.impl.f.o1(r12, r13, r1, r11)
            kotlin.reflect.jvm.internal.impl.descriptors.u r1 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76289d
            r13.r1(r10, r1)
            java.lang.String r1 = "縐\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r13, r1)
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = kotlin.reflect.jvm.internal.impl.types.error.g.SCOPE_FOR_ERROR_CLASS
            kotlin.reflect.jvm.internal.impl.name.f r2 = r13.getName()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "縑\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            java.lang.String r3 = ""
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            kotlin.reflect.jvm.internal.impl.types.error.f r1 = kotlin.reflect.jvm.internal.impl.types.error.k.b(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.h r2 = new kotlin.reflect.jvm.internal.impl.types.error.h
            kotlin.reflect.jvm.internal.impl.types.error.j r6 = kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_CLASS
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            kotlin.reflect.jvm.internal.impl.types.error.i r4 = r0.e(r6, r4)
            java.lang.String[] r9 = new java.lang.String[r3]
            r10 = 24
            r11 = 0
            r7 = 0
            r8 = 0
            r3 = r2
            r5 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.h1(r2)
            java.util.Set r0 = kotlin.collections.l1.f(r13)
            r12.L0(r1, r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.error.a.<init>(kotlin.reflect.jvm.internal.impl.name.f):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a
    @fg.l
    /* renamed from: I0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@fg.l q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("縒\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public n d(q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("縒\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h j0(@fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(o1Var, ProtectedSandApp.s("縓\u0001"));
        l0.p(gVar, ProtectedSandApp.s("縔\u0001"));
        g gVar2 = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        l0.o(fVar, ProtectedSandApp.s("縑\u0001"));
        return k.b(gVar2, fVar, o1Var.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @fg.l
    public String toString() {
        String b5 = getName().b();
        l0.o(b5, ProtectedSandApp.s("縕\u0001"));
        return b5;
    }
}
