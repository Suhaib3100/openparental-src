package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;

/* compiled from: ReflectKotlinClassFinder.kt */
@r1({"SMAP\nReflectKotlinClassFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectKotlinClassFinder.kt\norg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClassFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes7.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final ClassLoader f76213a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d f76214b;

    public g(@fg.l ClassLoader classLoader) {
        l0.p(classLoader, ProtectedSandApp.s("湥\u0001"));
        this.f76213a = classLoader;
        this.f76214b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d();
    }

    private final r.a d(String str) {
        f a5;
        Class<?> a6 = e.a(this.f76213a, str);
        if (a6 == null || (a5 = f.f76210c.a(a6)) == null) {
            return null;
        }
        return new r.a.b(a5, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    @fg.m
    public r.a a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar) {
        String b5;
        l0.p(bVar, ProtectedSandApp.s("湦\u0001"));
        l0.p(eVar, ProtectedSandApp.s("湧\u0001"));
        b5 = h.b(bVar);
        return d(b5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    @fg.m
    public r.a b(@fg.l wd.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar) {
        String b5;
        l0.p(gVar, ProtectedSandApp.s("湨\u0001"));
        l0.p(eVar, ProtectedSandApp.s("湧\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c g4 = gVar.g();
        if (g4 == null || (b5 = g4.b()) == null) {
            return null;
        }
        return d(b5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.v
    @fg.m
    public InputStream c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("湩\u0001"));
        if (cVar.i(kotlin.reflect.jvm.internal.impl.builtins.l.f75835x)) {
            return this.f76214b.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f78052r.r(cVar));
        }
        return null;
    }
}
