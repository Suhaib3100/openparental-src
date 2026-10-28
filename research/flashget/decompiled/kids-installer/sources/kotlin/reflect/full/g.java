package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.EmptyList;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.m1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.n;

/* compiled from: KClassifiers.kt */
@p3.i(name = "KClassifiers")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\"\u001e\u0010\u0014\u001a\u00020\b*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/g;", "", "Lkotlin/reflect/u;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/s;", "b", "Lkotlin/reflect/jvm/internal/impl/types/d1;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/h1;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/p0;", "a", "d", "(Lkotlin/reflect/g;)Lkotlin/reflect/s;", "getStarProjectedType$annotations", "(Lkotlin/reflect/g;)V", "starProjectedType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class g {

    /* compiled from: KClassifiers.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23791a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23791a = iArr;
        }
    }

    private static final p0 a(d1 d1Var, h1 h1Var, List<KTypeProjection> list, boolean z5) {
        int b02;
        m1 v0Var;
        List<f1> r5 = h1Var.r();
        l0.o(r5, ProtectedSandApp.s("䌠"));
        b02 = b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                a0.Z();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            kotlin.reflect.jvm.internal.b0 b0Var = (kotlin.reflect.jvm.internal.b0) kTypeProjection.g();
            h0 type = b0Var != null ? b0Var.getType() : null;
            KVariance h5 = kTypeProjection.h();
            int i7 = h5 == null ? -1 : a.f23791a[h5.ordinal()];
            if (i7 == -1) {
                f1 f1Var = r5.get(i5);
                l0.o(f1Var, ProtectedSandApp.s("䌡"));
                v0Var = new v0(f1Var);
            } else if (i7 == 1) {
                x1 x1Var = x1.INVARIANT;
                l0.m(type);
                v0Var = new n1(x1Var, type);
            } else if (i7 == 2) {
                x1 x1Var2 = x1.IN_VARIANCE;
                l0.m(type);
                v0Var = new n1(x1Var2, type);
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                x1 x1Var3 = x1.OUT_VARIANCE;
                l0.m(type);
                v0Var = new n1(x1Var3, type);
            }
            arrayList.add(v0Var);
            i5 = i6;
        }
        return i0.l(d1Var, h1Var, arrayList, z5, null, 16, null);
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final KType b(@d5.d KClassifier kClassifier, @d5.d List<KTypeProjection> list, boolean z5, @d5.d List<? extends Annotation> list2) {
        kotlin.reflect.jvm.internal.impl.descriptors.h n5;
        d1 d1Var;
        l0.p(kClassifier, ProtectedSandApp.s("䌢"));
        l0.p(list, ProtectedSandApp.s("䌣"));
        l0.p(list2, ProtectedSandApp.s("䌤"));
        n nVar = kClassifier instanceof n ? (n) kClassifier : null;
        if (nVar == null || (n5 = nVar.n()) == null) {
            throw new e0(ProtectedSandApp.s("䌪") + kClassifier + ProtectedSandApp.s("䌫") + kClassifier.getClass() + ')');
        }
        h1 m5 = n5.m();
        l0.o(m5, ProtectedSandApp.s("䌥"));
        List<f1> r5 = m5.r();
        l0.o(r5, ProtectedSandApp.s("䌦"));
        if (r5.size() == list.size()) {
            if (list2.isEmpty()) {
                d1.f26381p.getClass();
                d1Var = d1.f26382q;
            } else {
                d1.f26381p.getClass();
                d1Var = d1.f26382q;
            }
            return new kotlin.reflect.jvm.internal.b0(a(d1Var, m5, list, z5), null, 2, null);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䌧") + r5.size() + ProtectedSandApp.s("䌨") + list.size() + ProtectedSandApp.s("䌩"));
    }

    public static KType c(KClassifier kClassifier, List list, boolean z5, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = EmptyList.f23167o;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            list2 = EmptyList.f23167o;
        }
        return b(kClassifier, list, z5, list2);
    }

    @d5.d
    public static final KType d(@d5.d KClassifier kClassifier) {
        kotlin.reflect.jvm.internal.impl.descriptors.h n5;
        int b02;
        l0.p(kClassifier, ProtectedSandApp.s("䌬"));
        n nVar = kClassifier instanceof n ? (n) kClassifier : null;
        if (nVar == null || (n5 = nVar.n()) == null) {
            return c(kClassifier, null, false, null, 7, null);
        }
        List<f1> r5 = n5.m().r();
        l0.o(r5, ProtectedSandApp.s("䌭"));
        if (r5.isEmpty()) {
            return c(kClassifier, null, false, null, 7, null);
        }
        b02 = b0.b0(r5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (f1 f1Var : r5) {
            KTypeProjection.f26861c.getClass();
            arrayList.add(KTypeProjection.f26862d);
        }
        return c(kClassifier, arrayList, false, null, 6, null);
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void e(KClassifier kClassifier) {
    }
}
