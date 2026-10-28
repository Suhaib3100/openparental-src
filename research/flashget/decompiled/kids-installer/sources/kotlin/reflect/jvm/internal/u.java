package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.p;

/* compiled from: KPackageImpl.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b,\u0010-J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012 \u001b*\b\u0018\u00010\u001aR\u00020\u00000\u001aR\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u001e\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lkotlin/reflect/jvm/internal/u;", "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/impl/name/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "f0", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "a0", "", "index", "b0", "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "r", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/u$a;", "kotlin.jvm.PlatformType", "s", "Lkotlin/reflect/jvm/internal/g0$b;", "data", "e0", "methodOwner", "Lkotlin/reflect/c;", "A", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "Y", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class u extends p {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Class<?> jClass;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.b<a> data;

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R/\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\n\u0010\u0018R%\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u0004\u0010\u001d¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/u$a;", "Lkotlin/reflect/jvm/internal/p$b;", "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "d", "Lkotlin/reflect/jvm/internal/g0$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/reflect/jvm/internal/g0$b;", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/l1;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e;", "g", "()Lkotlin/l1;", "metadata", "", "Lkotlin/reflect/jvm/internal/l;", "h", "()Ljava/util/Collection;", "members", "<init>", "(Lkotlin/reflect/jvm/internal/u;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    private final class a extends p.b {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26808j = {l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("姦"), ProtectedSandApp.s("姧"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("姨"), ProtectedSandApp.s("姩"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("姪"), ProtectedSandApp.s("姫"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("姬"), ProtectedSandApp.s("姭"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("姮"), ProtectedSandApp.s("姯")))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a kotlinClass;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a scope;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.b multifileFacade;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.b metadata;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a members;

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0403a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f26815p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0403a(u uVar) {
                super(0);
                this.f26815p = uVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f n() {
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f24360c.a(this.f26815p.f());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class b extends Lambda implements q3.a<Collection<? extends l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f26816p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ a f26817q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(u uVar, a aVar) {
                super(0);
                this.f26816p = uVar;
                this.f26817q = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<l<?>> n() {
                return this.f26816p.d0(this.f26817q.g(), p.c.DECLARED);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/l1;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e;", "a", "()Lkotlin/l1;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class c extends Lambda implements q3.a<Triple<? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ? extends a.l, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e>> {
            c() {
                super(0);
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> n() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c6 = a.this.c();
                if (c6 == null || (a6 = c6.a()) == null) {
                    return null;
                }
                String[] a7 = a6.a();
                String[] g5 = a6.g();
                if (a7 == null || g5 == null) {
                    return null;
                }
                Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l> m5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(a7, g5);
                return new Triple<>(m5.a(), m5.b(), a6.d());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "a", "()Ljava/lang/Class;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class d extends Lambda implements q3.a<Class<?>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ u f26820q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(u uVar) {
                super(0);
                this.f26820q = uVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class<?> n() {
                String h22;
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c6 = a.this.c();
                String e6 = (c6 == null || (a6 = c6.a()) == null) ? null : a6.e();
                if (e6 == null) {
                    return null;
                }
                if (!(e6.length() > 0)) {
                    return null;
                }
                ClassLoader classLoader = this.f26820q.f().getClassLoader();
                h22 = kotlin.text.e0.h2(e6, org.apache.commons.io.n.f32060b, org.apache.commons.io.k.f32026a, false, 4, null);
                return classLoader.loadClass(h22);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class e extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
            e() {
                super(0);
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h n() {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c6 = a.this.c();
                return c6 != null ? a.this.a().c().a(c6) : h.c.f26018b;
            }
        }

        public a() {
            super();
            this.kotlinClass = g0.d(new C0403a(u.this));
            this.scope = g0.d(new e());
            this.multifileFacade = g0.b(new d(u.this));
            this.metadata = g0.b(new c());
            this.members = g0.d(new b(u.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) this.kotlinClass.b(this, f26808j[0]);
        }

        @d5.d
        public final Collection<l<?>> d() {
            T b6 = this.members.b(this, f26808j[4]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("姰"));
            return (Collection) b6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e() {
            return (Triple) this.metadata.b(this, f26808j[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final Class<?> f() {
            return (Class) this.multifileFacade.b(this, f26808j[2]);
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h g() {
            T b6 = this.scope.b(this, f26808j[1]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("姱"));
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) b6;
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/u$a;", "Lkotlin/reflect/jvm/internal/u;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/u$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a> {
        b() {
            super(0);
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a n() {
            return u.this.new a();
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements q3.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.x, a.n, u0> {

        /* renamed from: x, reason: collision with root package name */
        public static final c f26823x = new c();

        c() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final u0 g0(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.x xVar, @d5.d a.n nVar) {
            kotlin.jvm.internal.l0.p(xVar, ProtectedSandApp.s("誓"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("誔"));
            return xVar.l(nVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("誕");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.x.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("誖");
        }
    }

    public u(@d5.d Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("誗"));
        this.jClass = cls;
        g0.b<a> b6 = g0.b(new b());
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誘"));
        this.data = b6;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h s0() {
        return this.data.n().g();
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @d5.d
    public Collection<KCallable<?>> A() {
        return this.data.n().d();
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> Y() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> a0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("誙"));
        return s0().a(name, z3.d.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.e
    public u0 b0(int index) {
        Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e6 = this.data.n().e();
        if (e6 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a6 = e6.a();
        a.l b6 = e6.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e c6 = e6.c();
        h.g<a.l, List<a.n>> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25482n;
        kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("誚"));
        a.n nVar = (a.n) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(b6, gVar, index);
        if (nVar == null) {
            return null;
        }
        Class<?> cls = this.jClass;
        a.t V = b6.V();
        kotlin.jvm.internal.l0.o(V, ProtectedSandApp.s("誛"));
        return (u0) n0.h(cls, nVar, a6, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(V), c6, c.f26823x);
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    protected Class<?> e0() {
        Class<?> f6 = this.data.n().f();
        return f6 == null ? this.jClass : f6;
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof u) && kotlin.jvm.internal.l0.g(this.jClass, ((u) other).jClass);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @d5.d
    public Class<?> f() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<u0> f0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("誜"));
        return s0().d(name, z3.d.FROM_REFLECTION);
    }

    public int hashCode() {
        return this.jClass.hashCode();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("誝") + kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.jClass).b();
    }
}
