package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c1;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.d0;
import kotlin.reflect.jvm.internal.g0;
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
import kotlin.reflect.jvm.internal.p;
import kotlin.reflect.s;
import kotlin.reflect.u;
import kotlin.reflect.v;

/* compiled from: KClassifiers.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001e\u0010\u0016\u001a\u00020\b*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/g;", "", "Lkotlin/reflect/u;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/s;", "b", "(Lkotlin/reflect/g;Ljava/util/List;ZLjava/util/List;)Lkotlin/reflect/s;", "Lkotlin/reflect/jvm/internal/impl/types/d1;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/h1;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/p0;", "a", "(Lkotlin/reflect/jvm/internal/impl/types/d1;Lkotlin/reflect/jvm/internal/impl/types/h1;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/p0;", "d", "(Lkotlin/reflect/g;)Lkotlin/reflect/s;", "e", "(Lkotlin/reflect/g;)V", "starProjectedType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@kd.i(name = "KClassifiers")
@r1({"SMAP\nKClassifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1559#2:98\n1590#2,4:99\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n*L\n69#1:98\n69#1:99,4\n95#1:103\n95#1:104,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* compiled from: KClassifiers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75540a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75540a = iArr;
        }
    }

    private static final p0 a(d1 d1Var, h1 h1Var, List<u> list, boolean z4) {
        m1 v0Var;
        List<f1> parameters = h1Var.getParameters();
        l0.o(parameters, ProtectedSandApp.s("時\u0001"));
        List<u> list2 = list;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                w.Z();
            }
            u uVar = (u) obj;
            d0 d0Var = (d0) uVar.g();
            h0 type = d0Var != null ? d0Var.getType() : null;
            v h4 = uVar.h();
            int i6 = h4 == null ? -1 : a.f75540a[h4.ordinal()];
            if (i6 == -1) {
                f1 f1Var = parameters.get(i4);
                l0.o(f1Var, ProtectedSandApp.s("晃\u0001"));
                v0Var = new v0(f1Var);
            } else if (i6 == 1) {
                x1 x1Var = x1.INVARIANT;
                l0.m(type);
                v0Var = new n1(x1Var, type);
            } else if (i6 == 2) {
                x1 x1Var2 = x1.IN_VARIANCE;
                l0.m(type);
                v0Var = new n1(x1Var2, type);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                x1 x1Var3 = x1.OUT_VARIANCE;
                l0.m(type);
                v0Var = new n1(x1Var3, type);
            }
            arrayList.add(v0Var);
            i4 = i5;
        }
        return i0.l(d1Var, h1Var, arrayList, z4, null, 16, null);
    }

    @l
    @c1(version = "1.1")
    public static final s b(@l kotlin.reflect.g gVar, @l List<u> list, boolean z4, @l List<? extends Annotation> list2) {
        kotlin.reflect.jvm.internal.impl.descriptors.h i4;
        d1 d1Var;
        l0.p(gVar, ProtectedSandApp.s("晄\u0001"));
        l0.p(list, ProtectedSandApp.s("晅\u0001"));
        l0.p(list2, ProtectedSandApp.s("晆\u0001"));
        p pVar = gVar instanceof p ? (p) gVar : null;
        if (pVar == null || (i4 = pVar.i()) == null) {
            throw new g0(ProtectedSandApp.s("晋\u0001") + gVar + ProtectedSandApp.s("晌\u0001") + gVar.getClass() + ')');
        }
        h1 j4 = i4.j();
        l0.o(j4, ProtectedSandApp.s("晇\u0001"));
        List<f1> parameters = j4.getParameters();
        l0.o(parameters, ProtectedSandApp.s("時\u0001"));
        if (parameters.size() == list.size()) {
            if (list2.isEmpty()) {
                d1.f78389c.getClass();
                d1Var = d1.f78390d;
            } else {
                d1.f78389c.getClass();
                d1Var = d1.f78390d;
            }
            return new d0(a(d1Var, j4, list, z4), null, 2, null);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("晈\u0001") + parameters.size() + ProtectedSandApp.s("晉\u0001") + list.size() + ProtectedSandApp.s("晊\u0001"));
    }

    public static s c(kotlin.reflect.g gVar, List list, boolean z4, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = j0.f74919b;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            list2 = j0.f74919b;
        }
        return b(gVar, list, z4, list2);
    }

    @l
    public static final s d(@l kotlin.reflect.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h i4;
        l0.p(gVar, ProtectedSandApp.s("晄\u0001"));
        p pVar = gVar instanceof p ? (p) gVar : null;
        if (pVar == null || (i4 = pVar.i()) == null) {
            return c(gVar, null, false, null, 7, null);
        }
        List<f1> parameters = i4.j().getParameters();
        l0.o(parameters, ProtectedSandApp.s("時\u0001"));
        if (parameters.isEmpty()) {
            return c(gVar, null, false, null, 7, null);
        }
        List<f1> list = parameters;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        for (f1 f1Var : list) {
            u.INSTANCE.getClass();
            arrayList.add(u.f78866d);
        }
        return c(gVar, arrayList, false, null, 6, null);
    }

    @c1(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.g gVar) {
    }
}
