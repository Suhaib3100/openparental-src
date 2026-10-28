package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes7.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f78043a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f78044b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final a1 f78045c;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends b0 {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final a.c f78046d;

        /* renamed from: e, reason: collision with root package name */
        @fg.m
        private final a f78047e;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f78048f;

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        private final a.c.EnumC1120c f78049g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f78050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l a.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.m a1 a1Var, @fg.m a aVar) {
            super(cVar2, gVar, a1Var, null);
            l0.p(cVar, ProtectedSandApp.s("端\u0001"));
            l0.p(cVar2, ProtectedSandApp.s("竰\u0001"));
            l0.p(gVar, ProtectedSandApp.s("竱\u0001"));
            this.f78046d = cVar;
            this.f78047e = aVar;
            this.f78048f = z.a(cVar2, cVar.G0());
            a.c.EnumC1120c d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77416f.d(cVar.F0());
            this.f78049g = d5 == null ? a.c.EnumC1120c.CLASS : d5;
            Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77417g.d(cVar.F0());
            l0.o(d6, ProtectedSandApp.s("竲\u0001"));
            this.f78050h = d6.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0
        @fg.l
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            kotlin.reflect.jvm.internal.impl.name.c b5 = this.f78048f.b();
            l0.o(b5, ProtectedSandApp.s("竳\u0001"));
            return b5;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b e() {
            return this.f78048f;
        }

        @fg.l
        public final a.c f() {
            return this.f78046d;
        }

        @fg.l
        public final a.c.EnumC1120c g() {
            return this.f78049g;
        }

        @fg.m
        public final a h() {
            return this.f78047e;
        }

        public final boolean i() {
            return this.f78050h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends b0 {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.c f78051d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.m a1 a1Var) {
            super(cVar2, gVar, a1Var, null);
            l0.p(cVar, ProtectedSandApp.s("竴\u0001"));
            l0.p(cVar2, ProtectedSandApp.s("竵\u0001"));
            l0.p(gVar, ProtectedSandApp.s("競\u0001"));
            this.f78051d = cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0
        @fg.l
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            return this.f78051d;
        }
    }

    public /* synthetic */ b0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, a1 a1Var, kotlin.jvm.internal.w wVar) {
        this(cVar, gVar, a1Var);
    }

    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.name.c a();

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c b() {
        return this.f78043a;
    }

    @fg.m
    public final a1 c() {
        return this.f78045c;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g d() {
        return this.f78044b;
    }

    @fg.l
    public String toString() {
        return getClass().getSimpleName() + ProtectedSandApp.s("竮\u0001") + a();
    }

    private b0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, a1 a1Var) {
        this.f78043a = cVar;
        this.f78044b = gVar;
        this.f78045c = a1Var;
    }
}
