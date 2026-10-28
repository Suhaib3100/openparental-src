package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
@r1({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1747#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i f76434a = new i();

    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76435b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("烟\u0001"));
            return Boolean.valueOf(i.f76434a.b(bVar));
        }
    }

    private i() {
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (kotlin.collections.w.W1(g.f76425a.c(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(bVar)) && bVar.i().isEmpty()) {
            return true;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.g0(bVar)) {
            return false;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar.e();
        l0.o(e4, ProtectedSandApp.s("烵\u0001"));
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection = e4;
        if (!collection.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
                i iVar = f76434a;
                l0.m(bVar2);
                if (iVar.b(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @fg.m
    public final String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        l0.p(bVar, ProtectedSandApp.s("烶\u0001"));
        kotlin.reflect.jvm.internal.impl.builtins.h.g0(bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.b f4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(bVar), false, a.f76435b, 1, null);
        if (f4 == null || (fVar = g.f76425a.a().get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(f4))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("烷\u0001"));
        if (g.f76425a.d().contains(bVar.getName())) {
            return c(bVar);
        }
        return false;
    }
}
