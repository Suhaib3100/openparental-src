package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes5.dex */
public final class e0<T> implements d0<T> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, T> f24564b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.f f24565c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> f24566d;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, T> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ e0<T> f24567p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0<T> e0Var) {
            super(1);
            this.f24567p = e0Var;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T N(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.o(cVar, ProtectedSandApp.s("葚"));
            return (T) kotlin.reflect.jvm.internal.impl.name.e.a(cVar, this.f24567p.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@d5.d Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends T> map) {
        l0.p(map, ProtectedSandApp.s("䦧"));
        this.f24564b = map;
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("䦨"), (Runnable) null, (q3.l<InterruptedException, m2>) null);
        this.f24565c = fVar;
        kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> i5 = fVar.i(new a(this));
        l0.o(i5, ProtectedSandApp.s("䦩"));
        this.f24566d = i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.d0
    @d5.e
    public T a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䦪"));
        return this.f24566d.N(cVar);
    }

    @d5.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, T> b() {
        return this.f24564b;
    }
}
