package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f24906a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final c f24907b;

    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24908a;

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
            f24908a = iArr;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = b0.f24495u;
        l0.o(cVar, ProtectedSandApp.s("䭕"));
        f24906a = new c(cVar);
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = b0.f24496v;
        l0.o(cVar2, ProtectedSandApp.s("䭖"));
        f24907b = new c(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> list) {
        Object h5;
        List V5;
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("䭗").toString());
        }
        if (size != 1) {
            V5 = j0.V5(list);
            return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k((List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g>) V5);
        }
        h5 = j0.h5(list);
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) h5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.h f(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, e eVar, o oVar) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f23962a;
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

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g() {
        return f24906a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(e eVar, o oVar) {
        if (!p.a(oVar)) {
            return null;
        }
        h d6 = eVar.d();
        int i5 = d6 == null ? -1 : a.f24908a[d6.ordinal()];
        if (i5 == 1) {
            return Boolean.TRUE;
        }
        if (i5 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䭘"));
        return s.c(kotlin.reflect.jvm.internal.impl.types.checker.q.f26369a, h0Var);
    }
}
