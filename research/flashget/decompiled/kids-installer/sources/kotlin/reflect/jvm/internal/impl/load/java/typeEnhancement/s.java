package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.types.r1;

/* compiled from: typeEnhancementUtils.kt */
/* loaded from: classes5.dex */
public final class s {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        if (r6 != false) goto L49;
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a(@d5.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r6, @d5.d java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "䭙"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            java.lang.String r0 = "䭚"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = b(r2)
            if (r2 == 0) goto L1b
            r0.add(r2)
            goto L1b
        L31:
            java.util.Set r0 = kotlin.collections.y.a6(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = b(r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = e(r0, r1, r8)
            if (r0 != 0) goto L6b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r3 = r3.d()
            if (r3 == 0) goto L48
            r1.add(r3)
            goto L48
        L5e:
            java.util.Set r1 = kotlin.collections.y.a6(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = r6.d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = e(r1, r2, r8)
            goto L6c
        L6b:
            r1 = r0
        L6c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e) r4
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r4 = r4.c()
            if (r4 == 0) goto L75
            r2.add(r4)
            goto L75
        L8b:
            java.util.Set r2 = kotlin.collections.y.a6(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.MUTABLE
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.READ_ONLY
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r5 = r6.c()
            java.lang.Object r8 = d(r2, r3, r4, r5, r8)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto Lb1
            if (r10 != 0) goto Lad
            if (r9 == 0) goto Lab
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
            if (r1 != r9) goto Lab
            goto Lad
        Lab:
            r9 = r4
            goto Lae
        Lad:
            r9 = r3
        Lae:
            if (r9 != 0) goto Lb1
            r2 = r1
        Lb1:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL
            if (r2 != r9) goto Lde
            boolean r6 = r6.b()
            if (r6 != 0) goto Ldc
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lc3
        Lc1:
            r6 = r4
            goto Lda
        Lc3:
            java.util.Iterator r6 = r7.iterator()
        Lc7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc1
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r7 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lc7
            r6 = r3
        Lda:
            if (r6 == 0) goto Lde
        Ldc:
            r6 = r3
            goto Ldf
        Lde:
            r6 = r4
        Ldf:
            if (r2 == 0) goto Le4
            if (r0 == r1) goto Le4
            goto Le5
        Le4:
            r3 = r4
        Le5:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s.a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e, java.util.Collection, boolean, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e");
    }

    private static final h b(e eVar) {
        if (eVar.e()) {
            return null;
        }
        return eVar.d();
    }

    public static final boolean c(@d5.d r1 r1Var, @d5.d h4.i iVar) {
        l0.p(r1Var, ProtectedSandApp.s("䭛"));
        l0.p(iVar, ProtectedSandApp.s("䭜"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = b0.f24495u;
        l0.o(cVar, ProtectedSandApp.s("䭝"));
        return r1Var.s(iVar, cVar);
    }

    private static final <T> T d(Set<? extends T> set, T t5, T t6, T t7, boolean z5) {
        Set D;
        Set<? extends T> a6;
        Object i5;
        if (z5) {
            T t8 = set.contains(t5) ? t5 : set.contains(t6) ? t6 : null;
            if (l0.g(t8, t5) && l0.g(t7, t6)) {
                return null;
            }
            return t7 == null ? t8 : t7;
        }
        if (t7 != null) {
            D = kotlin.collections.r1.D(set, t7);
            a6 = j0.a6(D);
            if (a6 != null) {
                set = a6;
            }
        }
        i5 = j0.i5(set);
        return (T) i5;
    }

    private static final h e(Set<? extends h> set, h hVar, boolean z5) {
        h hVar2 = h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (h) d(set, h.NOT_NULL, h.NULLABLE, hVar, z5);
    }
}
