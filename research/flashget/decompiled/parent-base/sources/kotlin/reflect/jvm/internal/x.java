package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.calls.j;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.n;

/* compiled from: KParameterImpl.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001:B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u001b\u0010*\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R!\u00100\u001a\b\u0012\u0004\u0012\u00020,0+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lkotlin/reflect/jvm/internal/x;", "Lkotlin/reflect/n;", "Lkotlin/reflect/jvm/internal/n;", "callable", "", "index", "Lkotlin/reflect/n$b;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/n;ILkotlin/reflect/n$b;Lld/a;)V", "", "Ljava/lang/reflect/Type;", "types", "l", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/reflect/jvm/internal/n;", "o", "()Lkotlin/reflect/jvm/internal/n;", "c", "I", "getIndex", "d", "Lkotlin/reflect/n$b;", "()Lkotlin/reflect/n$b;", "e", "Lkotlin/reflect/jvm/internal/i0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "f", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lkotlin/reflect/s;", "getType", "()Lkotlin/reflect/s;", "type", "A", "()Z", "isOptional", "a", "isVararg", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes7.dex */
public final class x implements kotlin.reflect.n {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f78845g = {l1.u(new g1(l1.d(x.class), ProtectedSandApp.s("芩\u0001"), ProtectedSandApp.s("芪\u0001"))), l1.u(new g1(l1.d(x.class), ProtectedSandApp.s("芫\u0001"), ProtectedSandApp.s("芬\u0001")))};

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n<?> callable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n.b kind;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a descriptor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a annotations;

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/x$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "b", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "c", "I", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Type {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Type[] types;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int hashCode;

        public a(@fg.l Type[] typeArr) {
            kotlin.jvm.internal.l0.p(typeArr, ProtectedSandApp.s("芣\u0001"));
            this.types = typeArr;
            this.hashCode = Arrays.hashCode(typeArr);
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof a) && Arrays.equals(this.types, ((a) other).types);
        }

        @Override // java.lang.reflect.Type
        @fg.l
        public String getTypeName() {
            return kotlin.collections.l.lh(this.types, ProtectedSandApp.s("芤\u0001"), ProtectedSandApp.s("芥\u0001"), ProtectedSandApp.s("芦\u0001"), 0, null, null, 56, null);
        }

        /* renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        @fg.l
        public String toString() {
            return getTypeName();
        }
    }

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<List<? extends Annotation>> {
        b() {
            super(0);
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Annotation> invoke() {
            return p0.e(x.this.u());
        }
    }

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl$type$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,107:1\n37#2,2:108\n37#2,2:110\n*S KotlinDebug\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl$type$1\n*L\n83#1:108,2\n86#1:110,2\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Type> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type invoke() {
            r0 u4 = x.this.u();
            if ((u4 instanceof x0) && kotlin.jvm.internal.l0.g(p0.k(x.this.o().t0()), u4) && x.this.o().t0().b() == b.a.FAKE_OVERRIDE) {
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = x.this.o().t0().c();
                kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("芧\u0001"));
                Class<?> s4 = p0.s((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
                if (s4 != null) {
                    return s4;
                }
                throw new g0(ProtectedSandApp.s("芨\u0001") + u4);
            }
            kotlin.reflect.jvm.internal.calls.e<?> m02 = x.this.o().m0();
            if (m02 instanceof kotlin.reflect.jvm.internal.calls.j) {
                List m5 = kotlin.collections.w.m5(((kotlin.reflect.jvm.internal.calls.j) m02).c(), ((kotlin.reflect.jvm.internal.calls.j) m02).b(x.this.getIndex()));
                x xVar = x.this;
                Type[] typeArr = (Type[]) m5.toArray(new Type[0]);
                return xVar.l((Type[]) Arrays.copyOf(typeArr, typeArr.length));
            }
            if (!(m02 instanceof j.b)) {
                return m02.c().get(x.this.getIndex());
            }
            x xVar2 = x.this;
            Class[] clsArr = (Class[]) ((j.b) m02).b().get(x.this.getIndex()).toArray(new Class[0]);
            return xVar2.l((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
    }

    public x(@fg.l n<?> nVar, int i4, @fg.l n.b bVar, @fg.l ld.a<? extends r0> aVar) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("芭\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("芮\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("芯\u0001"));
        this.callable = nVar;
        this.index = i4;
        this.kind = bVar;
        this.descriptor = i0.c(aVar);
        this.annotations = i0.c(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type l(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new a(types) : (Type) kotlin.collections.l.gt(types);
        }
        throw new kd.r(ProtectedSandApp.s("芰\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 u() {
        i0.a aVar = this.descriptor;
        kotlin.reflect.o<Object> oVar = f78845g[0];
        Object invoke = aVar.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("花\u0001"));
        return (r0) invoke;
    }

    @Override // kotlin.reflect.n
    public boolean A() {
        r0 u4 = u();
        j1 j1Var = u4 instanceof j1 ? (j1) u4 : null;
        if (j1Var != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var);
        }
        return false;
    }

    @Override // kotlin.reflect.n
    public boolean a() {
        r0 u4 = u();
        return (u4 instanceof j1) && ((j1) u4).x0() != null;
    }

    @Override // kotlin.reflect.n
    @fg.l
    /* renamed from: b, reason: from getter */
    public n.b getKind() {
        return this.kind;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof x) {
            x xVar = (x) other;
            if (kotlin.jvm.internal.l0.g(this.callable, xVar.callable) && this.index == xVar.index) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @fg.l
    public List<Annotation> getAnnotations() {
        i0.a aVar = this.annotations;
        kotlin.reflect.o<Object> oVar = f78845g[1];
        Object invoke = aVar.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("花\u0001"));
        return (List) invoke;
    }

    @Override // kotlin.reflect.n
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.n
    @fg.m
    public String getName() {
        r0 u4 = u();
        j1 j1Var = u4 instanceof j1 ? (j1) u4 : null;
        if (j1Var == null || j1Var.c().i0()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = j1Var.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("芲\u0001"));
        if (name.g()) {
            return null;
        }
        return name.b();
    }

    @Override // kotlin.reflect.n
    @fg.l
    public kotlin.reflect.s getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = u().getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("芳\u0001"));
        return new d0(type, new c());
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.callable.hashCode() * 31);
    }

    @fg.l
    public final n<?> o() {
        return this.callable;
    }

    @fg.l
    public String toString() {
        return k0.f78694a.f(this);
    }
}
