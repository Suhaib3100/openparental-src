package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.resolve.l;

/* compiled from: ErasedOverridabilityCondition.kt */
@r1({"SMAP\nErasedOverridabilityCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,63:1\n1247#2,2:64\n*S KotlinDebug\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n*L\n44#1:64,2\n*E\n"})
/* loaded from: classes7.dex */
public final class l implements kotlin.reflect.jvm.internal.impl.resolve.g {

    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76456a;

        static {
            int[] iArr = new int[l.i.a.values().length];
            try {
                iArr[l.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f76456a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    static final class b extends n0 implements ld.l<j1, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76457b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.types.h0 a(j1 j1Var) {
            return j1Var.getType();
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.types.h0 invoke(j1 j1Var) {
            return j1Var.getType();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.a a() {
        return g.a.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.b b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(aVar, ProtectedSandApp.s("焊\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("焋\u0001"));
        if (aVar2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) aVar2;
            List<f1> typeParameters = eVar2.getTypeParameters();
            String s4 = ProtectedSandApp.s("焌\u0001");
            l0.o(typeParameters, s4);
            if (typeParameters.isEmpty()) {
                l.i w4 = kotlin.reflect.jvm.internal.impl.resolve.l.w(aVar, aVar2);
                if ((w4 != null ? w4.c() : null) != null) {
                    return g.b.UNKNOWN;
                }
                List<j1> i4 = eVar2.i();
                l0.o(i4, ProtectedSandApp.s("焍\u0001"));
                kotlin.sequences.m k12 = kotlin.sequences.p.k1(kotlin.collections.w.A1(i4), b.f76457b);
                kotlin.reflect.jvm.internal.impl.types.h0 returnType = eVar2.getReturnType();
                l0.m(returnType);
                kotlin.sequences.m n22 = kotlin.sequences.p.n2(k12, returnType);
                x0 S = eVar2.S();
                for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : kotlin.sequences.p.m2(n22, kotlin.collections.w.P(S != null ? S.getType() : null))) {
                    if (!h0Var.M0().isEmpty() && !(h0Var.R0() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h)) {
                        return g.b.UNKNOWN;
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a d5 = aVar.d(new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g(null, 1, null).c());
                if (d5 == null) {
                    return g.b.UNKNOWN;
                }
                if (d5 instanceof z0) {
                    z0 z0Var = (z0) d5;
                    List<f1> typeParameters2 = z0Var.getTypeParameters();
                    l0.o(typeParameters2, s4);
                    if (!typeParameters2.isEmpty()) {
                        d5 = z0Var.A().q(kotlin.collections.j0.f74919b).a();
                        l0.m(d5);
                    }
                }
                l.i.a c5 = kotlin.reflect.jvm.internal.impl.resolve.l.f77929f.F(d5, aVar2, false).c();
                l0.o(c5, ProtectedSandApp.s("焎\u0001"));
                return a.f76456a[c5.ordinal()] == 1 ? g.b.OVERRIDABLE : g.b.UNKNOWN;
            }
        }
        return g.b.UNKNOWN;
    }
}
