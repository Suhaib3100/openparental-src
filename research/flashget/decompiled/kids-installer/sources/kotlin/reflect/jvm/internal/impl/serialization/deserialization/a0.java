package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes5.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f26054a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f26055b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final a1 f26056c;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends a0 {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final a.c f26057d;

        /* renamed from: e, reason: collision with root package name */
        @d5.e
        private final a f26058e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f26059f;

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        private final a.c.EnumC0315c f26060g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f26061h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d a.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.e a1 a1Var, @d5.e a aVar) {
            super(cVar2, gVar, a1Var, null);
            l0.p(cVar, ProtectedSandApp.s("博"));
            l0.p(cVar2, ProtectedSandApp.s("卛"));
            l0.p(gVar, ProtectedSandApp.s("卜"));
            this.f26057d = cVar;
            this.f26058e = aVar;
            this.f26059f = y.a(cVar2, cVar.F0());
            a.c.EnumC0315c d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25438f.d(cVar.E0());
            this.f26060g = d6 == null ? a.c.EnumC0315c.CLASS : d6;
            Boolean d7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25439g.d(cVar.E0());
            l0.o(d7, ProtectedSandApp.s("卝"));
            this.f26061h = d7.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0
        @d5.d
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            kotlin.reflect.jvm.internal.impl.name.c b6 = this.f26059f.b();
            l0.o(b6, ProtectedSandApp.s("卞"));
            return b6;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b e() {
            return this.f26059f;
        }

        @d5.d
        public final a.c f() {
            return this.f26057d;
        }

        @d5.d
        public final a.c.EnumC0315c g() {
            return this.f26060g;
        }

        @d5.e
        public final a h() {
            return this.f26058e;
        }

        public final boolean i() {
            return this.f26061h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends a0 {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.c f26062d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.e a1 a1Var) {
            super(cVar2, gVar, a1Var, null);
            l0.p(cVar, ProtectedSandApp.s("卟"));
            l0.p(cVar2, ProtectedSandApp.s("占"));
            l0.p(gVar, ProtectedSandApp.s("卡"));
            this.f26062d = cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0
        @d5.d
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            return this.f26062d;
        }
    }

    public /* synthetic */ a0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, a1 a1Var, kotlin.jvm.internal.w wVar) {
        this(cVar, gVar, a1Var);
    }

    @d5.d
    public abstract kotlin.reflect.jvm.internal.impl.name.c a();

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c b() {
        return this.f26054a;
    }

    @d5.e
    public final a1 c() {
        return this.f26056c;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g d() {
        return this.f26055b;
    }

    @d5.d
    public String toString() {
        return getClass().getSimpleName() + ProtectedSandApp.s("卙") + a();
    }

    private a0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, a1 a1Var) {
        this.f26054a = cVar;
        this.f26055b = gVar;
        this.f26056c = a1Var;
    }
}
