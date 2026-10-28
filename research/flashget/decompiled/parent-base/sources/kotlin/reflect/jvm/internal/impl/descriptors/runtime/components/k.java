package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;

/* compiled from: RuntimeModuleData.kt */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f76217c = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f76218a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a f76219b;

    /* compiled from: RuntimeModuleData.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final k a(@fg.l ClassLoader classLoader) {
            l0.p(classLoader, ProtectedSandApp.s("湰\u0001"));
            g gVar = new g(classLoader);
            h.a aVar = kotlin.reflect.jvm.internal.impl.load.kotlin.h.f76880b;
            ClassLoader classLoader2 = k2.class.getClassLoader();
            l0.o(classLoader2, ProtectedSandApp.s("湱\u0001"));
            h.a.C1103a a5 = aVar.a(gVar, new g(classLoader2), new d(classLoader), ProtectedSandApp.s("湲\u0001") + classLoader, j.f76216b, l.f76220a);
            return new k(a5.a().a(), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a(a5.b(), gVar), null);
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a aVar, w wVar) {
        this(kVar, aVar);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a() {
        return this.f76218a;
    }

    @fg.l
    public final h0 b() {
        return this.f76218a.q();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a c() {
        return this.f76219b;
    }

    private k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a aVar) {
        this.f76218a = kVar;
        this.f76219b = aVar;
    }
}
