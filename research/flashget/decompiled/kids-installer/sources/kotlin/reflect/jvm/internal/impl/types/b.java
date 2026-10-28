package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: AbstractClassTypeConstructor.java */
/* loaded from: classes6.dex */
public abstract class b extends h implements h1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar);
        if (nVar == null) {
            v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L10
            if (r9 == r1) goto L10
            if (r9 == r0) goto L10
            java.lang.String r3 = "耱"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            goto L16
        L10:
            java.lang.String r3 = "耲"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
        L16:
            r4 = 2
            if (r9 == r2) goto L1f
            if (r9 == r1) goto L1f
            if (r9 == r0) goto L1f
            r5 = r1
            goto L20
        L1f:
            r5 = r4
        L20:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "耳"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r7 = 0
            if (r9 == r2) goto L43
            if (r9 == r4) goto L3a
            if (r9 == r1) goto L43
            if (r9 == r0) goto L43
            java.lang.String r8 = "耴"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r5[r7] = r8
            goto L45
        L3a:
            java.lang.String r8 = "耵"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r5[r7] = r8
            goto L45
        L43:
            r5[r7] = r6
        L45:
            if (r9 == r2) goto L57
            if (r9 == r1) goto L4e
            if (r9 == r0) goto L4e
            r5[r2] = r6
            goto L5f
        L4e:
            java.lang.String r6 = "耶"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5[r2] = r6
            goto L5f
        L57:
            java.lang.String r6 = "耷"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5[r2] = r6
        L5f:
            if (r9 == r2) goto L78
            if (r9 == r4) goto L70
            if (r9 == r1) goto L78
            if (r9 == r0) goto L78
            java.lang.String r6 = "耸"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5[r4] = r6
            goto L78
        L70:
            java.lang.String r6 = "耹"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5[r4] = r6
        L78:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L88
            if (r9 == r1) goto L88
            if (r9 == r0) goto L88
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L8d
        L88:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L8d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.b.v(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        kotlin.reflect.jvm.internal.impl.builtins.h j5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(b());
        if (j5 == null) {
            v(1);
        }
        return j5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n
    protected boolean h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        if (hVar == null) {
            v(2);
        }
        return (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && f(b(), hVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @d5.e
    protected h0 l() {
        if (kotlin.reflect.jvm.internal.impl.builtins.h.t0(b())) {
            return null;
        }
        return A().i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @d5.d
    protected Collection<h0> n(boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = b().b();
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                v(3);
            }
            return emptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
        eVar.add(eVar2.E());
        kotlin.reflect.jvm.internal.impl.descriptors.e b02 = eVar2.b0();
        if (z5 && b02 != null) {
            eVar.add(b02.E());
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e b();
}
