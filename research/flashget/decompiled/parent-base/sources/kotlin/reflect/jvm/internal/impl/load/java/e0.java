package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes7.dex */
public final class e0<T> implements d0<T> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, T> f76418b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.f f76419c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> f76420d;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0<T> f76421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0<T> e0Var) {
            super(1);
            this.f76421b = e0Var;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.m(cVar);
            return (T) kotlin.reflect.jvm.internal.impl.name.e.a(cVar, this.f76421b.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@fg.l Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends T> map) {
        l0.p(map, ProtectedSandApp.s("炌\u0001"));
        this.f76418b = map;
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("炍\u0001"), (Runnable) null, (ld.l<InterruptedException, k2>) null);
        this.f76419c = fVar;
        kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> b5 = fVar.b(new a(this));
        l0.o(b5, ProtectedSandApp.s("炎\u0001"));
        this.f76420d = b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.d0
    @fg.m
    public T a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("炏\u0001"));
        return this.f76420d.invoke(cVar);
    }

    @fg.l
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, T> b() {
        return this.f76418b;
    }
}
