package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76782a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final c f76783b;

    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76784a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76784a = iArr;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = b0.f76346v;
        l0.o(cVar, ProtectedSandApp.s("猚\u0001"));
        f76782a = new c(cVar);
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = b0.f76347w;
        l0.o(cVar2, ProtectedSandApp.s("猛\u0001"));
        f76783b = new c(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k((List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g>) w.V5(list)) : (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) w.h5(list);
        }
        throw new IllegalStateException(ProtectedSandApp.s("猜\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.h f(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, e eVar, o oVar) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f75754a;
        if (!p.a(oVar) || !(hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            return null;
        }
        if (eVar.c() == f.READ_ONLY && oVar == o.FLEXIBLE_LOWER) {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) hVar;
            if (dVar.c(eVar2)) {
                return dVar.a(eVar2);
            }
        }
        if (eVar.c() != f.MUTABLE || oVar != o.FLEXIBLE_UPPER) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.e) hVar;
        if (dVar.d(eVar3)) {
            return dVar.b(eVar3);
        }
        return null;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g() {
        return f76782a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(e eVar, o oVar) {
        if (!p.a(oVar)) {
            return null;
        }
        h d5 = eVar.d();
        int i4 = d5 == null ? -1 : a.f76784a[d5.ordinal()];
        if (i4 == 1) {
            return Boolean.TRUE;
        }
        if (i4 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("猝\u0001"));
        return s.c(kotlin.reflect.jvm.internal.impl.types.checker.q.f78377a, h0Var);
    }
}
