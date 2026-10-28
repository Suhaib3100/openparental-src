package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ClassConstructorDescriptorImpl.java */
/* loaded from: classes7.dex */
public class f extends p implements kotlin.reflect.jvm.internal.impl.descriptors.d {
    static final /* synthetic */ boolean G = false;
    protected final boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l b.a aVar, @fg.l a1 a1Var) {
        super(eVar, lVar, gVar, kotlin.reflect.jvm.internal.impl.name.h.f77596i, aVar, a1Var);
        if (eVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (aVar == null) {
            j0(2);
        }
        if (a1Var == null) {
            j0(3);
        }
        this.F = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j0(int r8) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.f.j0(int):void");
    }

    @fg.l
    private List<x0> l1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e c5 = c();
        if (c5.b0().isEmpty()) {
            List<x0> emptyList = Collections.emptyList();
            if (emptyList == null) {
                j0(16);
            }
            return emptyList;
        }
        List<x0> b02 = c5.b0();
        if (b02 == null) {
            j0(15);
        }
        return b02;
    }

    @fg.l
    public static f o1(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l a1 a1Var) {
        if (eVar == null) {
            j0(4);
        }
        if (gVar == null) {
            j0(5);
        }
        if (a1Var == null) {
            j0(6);
        }
        return new f(eVar, null, gVar, z4, b.a.DECLARATION, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.j(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    public void F0(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            j0(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            j0(21);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean f0() {
        return this.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e c5 = c();
        if (c5 == null) {
            j0(18);
        }
        return c5;
    }

    @fg.m
    public x0 m1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e c5 = c();
        if (!c5.n()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c6 = c5.c();
        if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) c6).K0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.R(mVar, e0Var, uVar, aVar, z4);
        if (dVar == null) {
            j0(27);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.l
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public f M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        if (mVar == null) {
            j0(23);
        }
        if (aVar == null) {
            j0(24);
        }
        if (gVar == null) {
            j0(25);
        }
        if (a1Var == null) {
            j0(26);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar == aVar2 || aVar == b.a.SYNTHESIZED) {
            return new f((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, this, gVar, this.F, aVar2, a1Var);
        }
        throw new IllegalStateException(ProtectedSandApp.s("沪\u0001") + this + ProtectedSandApp.s("沫\u0001") + mVar + ProtectedSandApp.s("沬\u0001") + aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e c() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) super.c();
        if (eVar == null) {
            j0(17);
        }
        return eVar;
    }

    public f r1(@fg.l List<j1> list, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            j0(13);
        }
        if (uVar == null) {
            j0(14);
        }
        s1(list, uVar, c().s());
        return this;
    }

    public f s1(@fg.l List<j1> list, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.l List<f1> list2) {
        if (list == null) {
            j0(10);
        }
        if (uVar == null) {
            j0(11);
        }
        if (list2 == null) {
            j0(12);
        }
        super.S0(null, m1(), l1(), list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, uVar);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.d d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) super.d(q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.d a() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.a();
        if (dVar == null) {
            j0(19);
        }
        return dVar;
    }
}
