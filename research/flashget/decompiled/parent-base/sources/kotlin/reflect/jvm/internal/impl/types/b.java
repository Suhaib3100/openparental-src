package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: AbstractClassTypeConstructor.java */
/* loaded from: classes7.dex */
public abstract class b extends h implements h1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar);
        if (nVar == null) {
            u(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void u(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L10
            if (r9 == r1) goto L10
            if (r9 == r0) goto L10
            java.lang.String r3 = "栰\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            goto L16
        L10:
            java.lang.String r3 = "栱\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
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
            java.lang.String r6 = "栲\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r7 = 0
            if (r9 == r2) goto L43
            if (r9 == r4) goto L3a
            if (r9 == r1) goto L43
            if (r9 == r0) goto L43
            java.lang.String r8 = "栳\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r5[r7] = r8
            goto L45
        L3a:
            java.lang.String r8 = "栴\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
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
            java.lang.String r6 = "栵\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5[r2] = r6
            goto L5f
        L57:
            java.lang.String r6 = "栶\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5[r2] = r6
        L5f:
            if (r9 == r2) goto L78
            if (r9 == r4) goto L70
            if (r9 == r1) goto L78
            if (r9 == r0) goto L78
            java.lang.String r6 = "样\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5[r4] = r6
            goto L78
        L70:
            java.lang.String r6 = "核\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.b.u(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n
    protected boolean g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        if (hVar == null) {
            u(2);
        }
        return (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && e(c(), hVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @fg.m
    protected h0 l() {
        if (kotlin.reflect.jvm.internal.impl.builtins.h.u0(c())) {
            return null;
        }
        return p().i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @fg.l
    protected Collection<h0> m(boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = c().c();
        if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                u(3);
            }
            return emptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) c5;
        fVar.add(eVar.r());
        kotlin.reflect.jvm.internal.impl.descriptors.e p02 = eVar.p0();
        if (z4 && p02 != null) {
            fVar.add(p02.r());
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        kotlin.reflect.jvm.internal.impl.builtins.h j4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(c());
        if (j4 == null) {
            u(1);
        }
        return j4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e c();
}
