package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.f;

/* compiled from: RuntimeModuleData.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f24367c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f24368a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a f24369b;

    /* compiled from: RuntimeModuleData.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final k a(@d5.d ClassLoader classLoader) {
            l0.p(classLoader, ProtectedSandApp.s("䡡"));
            g gVar = new g(classLoader);
            f.a aVar = kotlin.reflect.jvm.internal.impl.load.kotlin.f.f24999b;
            ClassLoader classLoader2 = m2.class.getClassLoader();
            l0.o(classLoader2, ProtectedSandApp.s("䡢"));
            f.a.C0298a a6 = aVar.a(gVar, new g(classLoader2), new d(classLoader), ProtectedSandApp.s("䡣") + classLoader, j.f24366b, l.f24370a);
            return new k(a6.a().a(), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a(a6.b(), gVar), null);
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a aVar, w wVar) {
        this(kVar, aVar);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a() {
        return this.f24368a;
    }

    @d5.d
    public final h0 b() {
        return this.f24368a.p();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a c() {
        return this.f24369b;
    }

    private k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a aVar) {
        this.f24368a = kVar;
        this.f24369b = aVar;
    }
}
