package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.r;

/* compiled from: KPackageImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001e\u0010#\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u001e\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lkotlin/reflect/jvm/internal/w;", "Lkotlin/reflect/jvm/internal/r;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "X", "(Lkotlin/reflect/jvm/internal/impl/name/f;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "S", "", "index", "T", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/Class;", "()Ljava/lang/Class;", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/w$a;", "f", "Lkotlin/b0;", "data", "V", "methodOwner", "Lkotlin/reflect/c;", "r", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "R", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKPackageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPackageImpl.kt\nkotlin/reflect/jvm/internal/KPackageImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes7.dex */
public final class w extends r {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<?> jClass;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a> data;

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R/\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\f\u0010\u001aR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u0006\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/w$a;", "Lkotlin/reflect/jvm/internal/r$b;", "Lkotlin/reflect/jvm/internal/r;", "<init>", "(Lkotlin/reflect/jvm/internal/w;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "d", "Lkotlin/reflect/jvm/internal/i0$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/b0;", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/l1;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e;", "g", "()Lkotlin/l1;", "metadata", "", "Lkotlin/reflect/jvm/internal/n;", "h", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a extends r.b {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f78829j = {l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("芓\u0001"), ProtectedSandApp.s("芔\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("芕\u0001"), ProtectedSandApp.s("芖\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("芗\u0001"), ProtectedSandApp.s("芘\u0001")))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a kotlinClass;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a scope;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.b0 multifileFacade;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.b0 metadata;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a members;

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.w$a$a, reason: collision with other inner class name */
        static final class C1207a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f78836b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1207a(w wVar) {
                super(0);
                this.f78836b = wVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f76210c.a(this.f78836b.e());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f78837b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f78838c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w wVar, a aVar) {
                super(0);
                this.f78837b = wVar;
                this.f78838c = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<n<?>> invoke() {
                return this.f78837b.U(this.f78838c.g(), r.c.DECLARED);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/l1;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e;", "a", "()Lkotlin/l1;"}, k = 3, mv = {1, 9, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.l1<? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ? extends a.l, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e>> {
            c() {
                super(0);
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.l1<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> invoke() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c5 = a.this.c();
                if (c5 == null || (o4 = c5.o()) == null) {
                    return null;
                }
                String[] a5 = o4.a();
                String[] g4 = o4.g();
                if (a5 == null || g4 == null) {
                    return null;
                }
                kotlin.q0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l> m4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(a5, g4);
                return new kotlin.l1<>(m4.a(), m4.b(), o4.d());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "a", "()Ljava/lang/Class;"}, k = 3, mv = {1, 9, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.a<Class<?>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f78841c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w wVar) {
                super(0);
                this.f78841c = wVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class<?> invoke() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c5 = a.this.c();
                String e4 = (c5 == null || (o4 = c5.o()) == null) ? null : o4.e();
                if (e4 == null || e4.length() <= 0) {
                    return null;
                }
                return this.f78841c.e().getClassLoader().loadClass(kotlin.text.v.h2(e4, '/', '.', false, 4, null));
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;"}, k = 3, mv = {1, 9, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
            e() {
                super(0);
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c5 = a.this.c();
                return c5 != null ? a.this.a().c().a(c5) : h.c.f78002b;
            }
        }

        public a() {
            super();
            this.kotlinClass = i0.c(new C1207a(w.this));
            this.scope = i0.c(new e());
            kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
            this.multifileFacade = kotlin.c0.b(f0Var, new d(w.this));
            this.metadata = kotlin.c0.b(f0Var, new c());
            this.members = i0.c(new b(w.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c() {
            i0.a aVar = this.kotlinClass;
            kotlin.reflect.o<Object> oVar = f78829j[0];
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) aVar.invoke();
        }

        @fg.l
        public final Collection<n<?>> d() {
            i0.a aVar = this.members;
            kotlin.reflect.o<Object> oVar = f78829j[2];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("芙\u0001"));
            return (Collection) invoke;
        }

        @fg.m
        public final kotlin.l1<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e() {
            return (kotlin.l1) this.metadata.getValue();
        }

        @fg.m
        public final Class<?> f() {
            return (Class) this.multifileFacade.getValue();
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h g() {
            i0.a aVar = this.scope;
            kotlin.reflect.o<Object> oVar = f78829j[1];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("芙\u0001"));
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) invoke;
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/w$a;", "Lkotlin/reflect/jvm/internal/w;", "a", "()Lkotlin/reflect/jvm/internal/w$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return w.this.new a();
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements ld.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.y, a.n, u0> {

        /* renamed from: d, reason: collision with root package name */
        public static final c f78844d = new c(2);

        c() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final u0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.y yVar, @fg.l a.n nVar) {
            kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("芚\u0001"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("芛\u0001"));
            return yVar.l(nVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("芜\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.y.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("芝\u0001");
        }
    }

    public w(@fg.l Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("芞\u0001"));
        this.jClass = cls;
        this.data = kotlin.c0.b(kotlin.f0.PUBLICATION, new b());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f0() {
        return this.data.getValue().g();
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> R() {
        return kotlin.collections.j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> S(@fg.l kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("芟\u0001"));
        return f0().a(name, ud.d.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.m
    public u0 T(int index) {
        kotlin.l1<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e4 = this.data.getValue().e();
        if (e4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a5 = e4.a();
        a.l b5 = e4.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e c5 = e4.c();
        h.g<a.l, List<a.n>> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77460n;
        kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("芠\u0001"));
        a.n nVar = (a.n) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(b5, gVar, index);
        if (nVar == null) {
            return null;
        }
        Class<?> cls = this.jClass;
        a.t W = b5.W();
        kotlin.jvm.internal.l0.o(W, ProtectedSandApp.s("芡\u0001"));
        return (u0) p0.h(cls, nVar, a5, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(W), c5, c.f78844d);
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    protected Class<?> V() {
        Class<?> f4 = this.data.getValue().f();
        return f4 == null ? this.jClass : f4;
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<u0> X(@fg.l kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("芟\u0001"));
        return f0().b(name, ud.d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.t
    @fg.l
    public Class<?> e() {
        return this.jClass;
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof w) && kotlin.jvm.internal.l0.g(this.jClass, ((w) other).jClass);
    }

    public int hashCode() {
        return this.jClass.hashCode();
    }

    @Override // kotlin.reflect.h
    @fg.l
    public Collection<kotlin.reflect.c<?>> r() {
        return this.data.getValue().d();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("芢\u0001") + kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.jClass).b();
    }
}
