package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;

/* compiled from: KParameterImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b03¢\u0006\u0004\b5\u00106J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00067"}, d2 = {"Lkotlin/reflect/jvm/internal/v;", "Lkotlin/reflect/n;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/l;", "o", "Lkotlin/reflect/jvm/internal/l;", "n", "()Lkotlin/reflect/jvm/internal/l;", "callable", "p", "I", "getIndex", "()I", "index", "Lkotlin/reflect/n$b;", "q", "Lkotlin/reflect/n$b;", "j", "()Lkotlin/reflect/n$b;", "kind", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "r", "Lkotlin/reflect/jvm/internal/g0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "s", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/s;", "getType", "()Lkotlin/reflect/s;", "type", "q0", "()Z", "isOptional", "b", "isVararg", "Lkotlin/Function0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/l;ILkotlin/reflect/n$b;Lq3/a;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class v implements KParameter {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26824t = {l1.u(new g1(l1.d(v.class), ProtectedSandApp.s("誠"), ProtectedSandApp.s("誡"))), l1.u(new g1(l1.d(v.class), ProtectedSandApp.s("誢"), ProtectedSandApp.s("誣")))};

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l<?> callable;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final KParameter.b kind;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a descriptor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a annotations;

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements q3.a<List<? extends Annotation>> {
        a() {
            super(0);
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Annotation> n() {
            return n0.e(v.this.v());
        }
    }

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<Type> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type n() {
            r0 v5 = v.this.v();
            if (!(v5 instanceof x0) || !kotlin.jvm.internal.l0.g(n0.i(v.this.n().F0()), v5) || v.this.n().F0().j() != b.a.FAKE_OVERRIDE) {
                return v.this.n().z0().a().get(v.this.getIndex());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = v.this.n().F0().b();
            kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("語"));
            Class<?> p5 = n0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
            if (p5 != null) {
                return p5;
            }
            throw new e0(ProtectedSandApp.s("誟") + v5);
        }
    }

    public v(@d5.d l<?> lVar, int i5, @d5.d KParameter.b bVar, @d5.d q3.a<? extends r0> aVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("誤"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("誥"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("誦"));
        this.callable = lVar;
        this.index = i5;
        this.kind = bVar;
        this.descriptor = g0.d(aVar);
        this.annotations = g0.d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 v() {
        T b6 = this.descriptor.b(this, f26824t[0]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誧"));
        return (r0) b6;
    }

    @Override // kotlin.reflect.KParameter
    public boolean b() {
        r0 v5 = v();
        return (v5 instanceof j1) && ((j1) v5).s0() != null;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof v) {
            v vVar = (v) other;
            if (kotlin.jvm.internal.l0.g(this.callable, vVar.callable) && this.index == vVar.index) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        T b6 = this.annotations.b(this, f26824t[1]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誨"));
        return (List) b6;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    @d5.e
    public String getName() {
        r0 v5 = v();
        j1 j1Var = v5 instanceof j1 ? (j1) v5 : null;
        if (j1Var == null || j1Var.b().P()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = j1Var.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("誩"));
        if (name.q()) {
            return null;
        }
        return name.h();
    }

    @Override // kotlin.reflect.KParameter
    @d5.d
    public KType getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = v().getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("說"));
        return new b0(type, new b());
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.callable.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    @d5.d
    /* renamed from: j, reason: from getter */
    public KParameter.b getKind() {
        return this.kind;
    }

    @d5.d
    public final l<?> n() {
        return this.callable;
    }

    @Override // kotlin.reflect.KParameter
    public boolean q0() {
        r0 v5 = v();
        j1 j1Var = v5 instanceof j1 ? (j1) v5 : null;
        if (j1Var != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var);
        }
        return false;
    }

    @d5.d
    public String toString() {
        return i0.f23876a.f(this);
    }
}
