package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.p;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes6.dex */
public final class g implements p {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final ClassLoader f24363a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d f24364b;

    public g(@d5.d ClassLoader classLoader) {
        l0.p(classLoader, ProtectedSandApp.s("荍"));
        this.f24363a = classLoader;
        this.f24364b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d();
    }

    private final p.a d(String str) {
        f a6;
        Class<?> a7 = e.a(this.f24363a, str);
        if (a7 == null || (a6 = f.f24360c.a(a7)) == null) {
            return null;
        }
        return new p.a.b(a6, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.u
    @d5.e
    public InputStream a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("荎"));
        if (cVar.i(kotlin.reflect.jvm.internal.impl.builtins.l.f24034t)) {
            return this.f24364b.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f26072n.n(cVar));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @d5.e
    public p.a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        String b6;
        l0.p(bVar, ProtectedSandApp.s("荏"));
        b6 = h.b(bVar);
        return d(b6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @d5.e
    public p.a c(@d5.d b4.g gVar) {
        String b6;
        l0.p(gVar, ProtectedSandApp.s("荐"));
        kotlin.reflect.jvm.internal.impl.name.c f6 = gVar.f();
        if (f6 == null || (b6 = f6.b()) == null) {
            return null;
        }
        return d(b6);
    }
}
