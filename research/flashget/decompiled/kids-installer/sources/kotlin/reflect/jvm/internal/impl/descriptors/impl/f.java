package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class f extends p implements kotlin.reflect.jvm.internal.impl.descriptors.d {
    static final /* synthetic */ boolean T = false;
    protected final boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d b.a aVar, @d5.d a1 a1Var) {
        super(eVar, lVar, gVar, kotlin.reflect.jvm.internal.impl.name.h.f25614j, aVar, a1Var);
        if (eVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (aVar == null) {
            Q(2);
        }
        if (a1Var == null) {
            Q(3);
        }
        this.S = z5;
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
    private static /* synthetic */ void Q(int r8) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.f.Q(int):void");
    }

    @d5.d
    private List<x0> r1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b6 = b();
        if (b6.N0().isEmpty()) {
            List<x0> emptyList = Collections.emptyList();
            if (emptyList == null) {
                Q(16);
            }
            return emptyList;
        }
        List<x0> N0 = b6.N0();
        if (N0 == null) {
            Q(15);
        }
        return N0;
    }

    @d5.d
    public static f u1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d a1 a1Var) {
        if (eVar == null) {
            Q(4);
        }
        if (gVar == null) {
            Q(5);
        }
        if (a1Var == null) {
            Q(6);
        }
        return new f(eVar, null, gVar, z5, b.a.DECLARATION, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    public void E0(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            Q(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean M() {
        return this.S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e N() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b6 = b();
        if (b6 == null) {
            Q(18);
        }
        return b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.h(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            Q(21);
        }
        return emptySet;
    }

    @d5.e
    public x0 s1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b6 = b();
        if (!b6.y()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b7 = b6.b();
        if (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) b7).Q0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d r0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.r0(mVar, e0Var, uVar, aVar, z5);
        if (dVar == null) {
            Q(27);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public f S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        if (mVar == null) {
            Q(23);
        }
        if (aVar == null) {
            Q(24);
        }
        if (gVar == null) {
            Q(25);
        }
        if (a1Var == null) {
            Q(26);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar == aVar2 || aVar == b.a.SYNTHESIZED) {
            return new f((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, this, gVar, this.S, aVar2, a1Var);
        }
        throw new IllegalStateException(ProtectedSandApp.s("舙") + this + ProtectedSandApp.s("舚") + mVar + ProtectedSandApp.s("舛") + aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) super.b();
        if (eVar == null) {
            Q(17);
        }
        return eVar;
    }

    public f x1(@d5.d List<j1> list, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            Q(13);
        }
        if (uVar == null) {
            Q(14);
        }
        y1(list, uVar, b().G());
        return this;
    }

    public f y1(@d5.d List<j1> list, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.d List<f1> list2) {
        if (list == null) {
            Q(10);
        }
        if (uVar == null) {
            Q(11);
        }
        if (list2 == null) {
            Q(12);
        }
        super.Y0(null, s1(), r1(), list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, uVar);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) super.d(q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: a */
    public kotlin.reflect.jvm.internal.impl.descriptors.d R0() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.R0();
        if (dVar == null) {
            Q(19);
        }
        return dVar;
    }
}
