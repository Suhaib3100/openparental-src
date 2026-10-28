package b4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: javaLoading.kt */
/* loaded from: classes5.dex */
public final class p {
    private static final boolean a(r rVar) {
        Object k5;
        kotlin.reflect.jvm.internal.impl.name.c f6;
        k5 = j0.k5(rVar.n());
        b0 b0Var = (b0) k5;
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i k6 = jVar.k();
        return (k6 instanceof g) && (f6 = ((g) k6).f()) != null && l0.g(f6.b(), ProtectedSandApp.s("㎗"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r3.n().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r0.equals(com.flashget.kidsdownloader.ProtectedSandApp.s("㎚")) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0.equals(com.flashget.kidsdownloader.ProtectedSandApp.s("㎘")) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(b4.r r3) {
        /*
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.h()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L3b
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L29
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L50
        L1c:
            java.lang.String r1 = "㎘"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L50
        L29:
            java.lang.String r1 = "㎙"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L50
        L36:
            boolean r3 = a(r3)
            goto L51
        L3b:
            java.lang.String r1 = "㎚"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
        L47:
            java.util.List r3 = r3.n()
            boolean r3 = r3.isEmpty()
            goto L51
        L50:
            r3 = 0
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p.b(b4.r):boolean");
    }

    public static final boolean c(@d5.d q qVar) {
        l0.p(qVar, ProtectedSandApp.s("㎛"));
        return qVar.S().K() && (qVar instanceof r) && b((r) qVar);
    }
}
