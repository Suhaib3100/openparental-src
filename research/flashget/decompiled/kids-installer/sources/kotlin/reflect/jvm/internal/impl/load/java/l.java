package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.sequences.Sequence;

/* compiled from: ErasedOverridabilityCondition.kt */
/* loaded from: classes5.dex */
public final class l implements kotlin.reflect.jvm.internal.impl.resolve.f {

    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24597a;

        static {
            int[] iArr = new int[k.i.a.values().length];
            try {
                iArr[k.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24597a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<j1, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24598p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.types.h0 N(j1 j1Var) {
            return j1Var.getType();
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.types.h0 a(j1 j1Var) {
            return j1Var.getType();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.a a() {
        return f.a.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.b b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Sequence A1;
        Sequence k12;
        Sequence n22;
        List P;
        Sequence m22;
        boolean z5;
        l0.p(aVar, ProtectedSandApp.s("䨪"));
        l0.p(aVar2, ProtectedSandApp.s("䨫"));
        if (aVar2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) aVar2;
            l0.o(eVar2.getTypeParameters(), ProtectedSandApp.s("䨬"));
            if (!(!r0.isEmpty())) {
                k.i w5 = kotlin.reflect.jvm.internal.impl.resolve.k.w(aVar, aVar2);
                if ((w5 != null ? w5.c() : null) != null) {
                    return f.b.UNKNOWN;
                }
                List<j1> n5 = eVar2.n();
                l0.o(n5, ProtectedSandApp.s("䨭"));
                A1 = kotlin.collections.j0.A1(n5);
                k12 = kotlin.sequences.v.k1(A1, b.f24598p);
                kotlin.reflect.jvm.internal.impl.types.h0 i5 = eVar2.i();
                l0.m(i5);
                n22 = kotlin.sequences.v.n2(k12, i5);
                x0 t02 = eVar2.t0();
                P = kotlin.collections.a0.P(t02 != null ? t02.getType() : null);
                m22 = kotlin.sequences.v.m2(n22, P);
                Iterator it = m22.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = false;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.types.h0 h0Var = (kotlin.reflect.jvm.internal.impl.types.h0) it.next();
                    if ((h0Var.S0().isEmpty() ^ true) && !(h0Var.X0() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h)) {
                        z5 = true;
                        break;
                    }
                }
                if (z5) {
                    return f.b.UNKNOWN;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a d6 = aVar.d(new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g(null, 1, null).c());
                if (d6 == null) {
                    return f.b.UNKNOWN;
                }
                if (d6 instanceof z0) {
                    z0 z0Var = (z0) d6;
                    l0.o(z0Var.getTypeParameters(), ProtectedSandApp.s("䨮"));
                    if (!r0.isEmpty()) {
                        d6 = z0Var.F().l(EmptyList.f23167o).build();
                        l0.m(d6);
                    }
                }
                k.i.a c6 = kotlin.reflect.jvm.internal.impl.resolve.k.f25946f.F(d6, aVar2, false).c();
                l0.o(c6, ProtectedSandApp.s("䨯"));
                return a.f24597a[c6.ordinal()] == 1 ? f.b.OVERRIDABLE : f.b.UNKNOWN;
            }
        }
        return f.b.UNKNOWN;
    }
}
