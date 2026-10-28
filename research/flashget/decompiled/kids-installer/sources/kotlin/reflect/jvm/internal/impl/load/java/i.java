package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final i f24579a = new i();

    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24580p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葠"));
            return Boolean.valueOf(i.f24579a.b(bVar));
        }
    }

    private i() {
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        boolean W1;
        W1 = kotlin.collections.j0.W1(g.f24571a.c(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(bVar));
        if (W1 && bVar.n().isEmpty()) {
            return true;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.f0(bVar)) {
            return false;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = bVar.g();
        l0.o(g5, ProtectedSandApp.s("䨖"));
        if (!g5.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : g5) {
                i iVar = f24579a;
                l0.o(bVar2, ProtectedSandApp.s("䨗"));
                if (iVar.b(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @d5.e
    public final String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        l0.p(bVar, ProtectedSandApp.s("䨘"));
        kotlin.reflect.jvm.internal.impl.builtins.h.f0(bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.b f6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(bVar), false, a.f24580p, 1, null);
        if (f6 == null || (fVar = g.f24571a.a().get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(f6))) == null) {
            return null;
        }
        return fVar.h();
    }

    public final boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䨙"));
        if (g.f24571a.d().contains(bVar.getName())) {
            return c(bVar);
        }
        return false;
    }
}
