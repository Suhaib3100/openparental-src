package kotlin.reflect.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.h;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import kotlin.reflect.jvm.internal.n0;
import kotlin.reflect.jvm.internal.q;
import q3.p;

/* compiled from: reflectLambda.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, d2 = {"R", "Lkotlin/v;", "Lkotlin/reflect/i;", "a", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class f {

    /* compiled from: reflectLambda.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends g0 implements p<x, a.i, z0> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f23793x = new a();

        a() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final z0 g0(@d5.d x xVar, @d5.d a.i iVar) {
            l0.p(xVar, ProtectedSandApp.s("羂"));
            l0.p(iVar, ProtectedSandApp.s("羃"));
            return xVar.j(iVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("羄");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(x.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("羅");
        }
    }

    @kotlin.reflect.jvm.a
    @d5.e
    public static final <R> KFunction<R> a(@d5.d Function<? extends R> function) {
        l0.p(function, ProtectedSandApp.s("䍏"));
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.i> j5 = i.j(d12, metadata.d2());
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a6 = j5.a();
        a.i b6 = j5.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = function.getClass();
        a.t n02 = b6.n0();
        l0.o(n02, ProtectedSandApp.s("䍐"));
        return new q(h.f23875r, (z0) n0.h(cls, b6, a6, new g(n02), eVar, a.f23793x));
    }
}
