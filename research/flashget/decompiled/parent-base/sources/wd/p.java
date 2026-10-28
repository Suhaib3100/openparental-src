package wd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: javaLoading.kt */
/* loaded from: classes8.dex */
public final class p {
    private static final boolean a(r rVar) {
        kotlin.reflect.jvm.internal.impl.name.c g4;
        b0 b0Var = (b0) kotlin.collections.w.k5(rVar.i());
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i d5 = jVar.d();
        return (d5 instanceof g) && (g4 = ((g) d5).g()) != null && l0.g(g4.b(), ProtectedSandApp.s("ꍄ\u0001"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r3.i().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r0.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("ꍇ\u0001")) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("ꍅ\u0001")) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(wd.r r3) {
        /*
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L3b
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L29
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L50
        L1c:
            java.lang.String r1 = "ꍅ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L50
        L29:
            java.lang.String r1 = "ꍆ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L50
        L36:
            boolean r3 = a(r3)
            goto L51
        L3b:
            java.lang.String r1 = "ꍇ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
        L47:
            java.util.List r3 = r3.i()
            boolean r3 = r3.isEmpty()
            goto L51
        L50:
            r3 = 0
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.p.b(wd.r):boolean");
    }

    public static final boolean c(@fg.l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("ꍈ\u0001"));
        return qVar.N().f() && (qVar instanceof r) && b((r) qVar);
    }
}
