package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlin/reflect/jvm/internal/e0;", "Lkotlin/reflect/t;", "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/f0;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/f1;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/f0;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Lkotlin/reflect/jvm/internal/o;", "c", "(Lkotlin/reflect/jvm/internal/impl/descriptors/e;)Lkotlin/reflect/jvm/internal/o;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/h;", "Ljava/lang/Class;", "a", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/h;)Ljava/lang/Class;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/reflect/jvm/internal/impl/descriptors/f1;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lkotlin/reflect/s;", "Lkotlin/reflect/jvm/internal/i0$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "d", "Lkotlin/reflect/jvm/internal/f0;", "getName", "name", "Lkotlin/reflect/v;", "o", "()Lkotlin/reflect/v;", "variance", "l", "()Z", "isReified", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e0 implements kotlin.reflect.t, p {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f75642e = {l1.u(new g1(l1.d(e0.class), ProtectedSandApp.s("村\u0001"), ProtectedSandApp.s("杒\u0001")))};

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f1 descriptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a upperBounds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f0 container;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75646a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75646a = iArr;
        }
    }

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/d0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKTypeParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1549#2:92\n1620#2,3:93\n*S KotlinDebug\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2\n*L\n38#1:92\n38#1:93,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<List<? extends d0>> {
        b() {
            super(0);
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d0> invoke() {
            List<kotlin.reflect.jvm.internal.impl.types.h0> upperBounds = e0.this.getDescriptor().getUpperBounds();
            kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("材\u0001"));
            List<kotlin.reflect.jvm.internal.impl.types.h0> list = upperBounds;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new d0((kotlin.reflect.jvm.internal.impl.types.h0) it.next(), null, 2, null));
            }
            return arrayList;
        }
    }

    public e0(@fg.m f0 f0Var, @fg.l f1 f1Var) {
        o<?> oVar;
        Object E;
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("杓\u0001"));
        this.descriptor = f1Var;
        this.upperBounds = i0.c(new b());
        if (f0Var == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = f1Var.c();
            String s4 = ProtectedSandApp.s("杔\u0001");
            kotlin.jvm.internal.l0.o(c5, s4);
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                E = c((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
            } else {
                if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
                    throw new g0(ProtectedSandApp.s("杗\u0001") + c5);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.m c6 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) c5).c();
                kotlin.jvm.internal.l0.o(c6, s4);
                if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    oVar = c((kotlin.reflect.jvm.internal.impl.descriptors.e) c6);
                } else {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar = c5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) c5 : null;
                    if (hVar == null) {
                        throw new g0(ProtectedSandApp.s("杖\u0001") + c5);
                    }
                    kotlin.reflect.d i4 = kd.b.i(a(hVar));
                    kotlin.jvm.internal.l0.n(i4, ProtectedSandApp.s("杕\u0001"));
                    oVar = (o) i4;
                }
                E = c5.E(new i(oVar), k2.f75408a);
            }
            kotlin.jvm.internal.l0.m(E);
            f0Var = (f0) E;
        }
        this.container = f0Var;
    }

    private final Class<?> a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar) {
        Class<?> a5;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g M = hVar.M();
        kotlin.reflect.jvm.internal.impl.load.kotlin.n nVar = M instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.n ? (kotlin.reflect.jvm.internal.impl.load.kotlin.n) M : null;
        Object g4 = nVar != null ? nVar.g() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVar = g4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) g4 : null;
        if (fVar != null && (a5 = fVar.a()) != null) {
            return a5;
        }
        throw new g0(ProtectedSandApp.s("杘\u0001") + hVar);
    }

    private final o<?> c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Class<?> s4 = p0.s(eVar);
        o<?> oVar = (o) (s4 != null ? kd.b.i(s4) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new g0(ProtectedSandApp.s("杙\u0001") + eVar.c());
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public f1 getDescriptor() {
        return this.descriptor;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof e0) {
            e0 e0Var = (e0) other;
            if (kotlin.jvm.internal.l0.g(this.container, e0Var.container) && kotlin.jvm.internal.l0.g(getName(), e0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.t
    @fg.l
    public String getName() {
        String b5 = this.descriptor.getName().b();
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("杚\u0001"));
        return b5;
    }

    @Override // kotlin.reflect.t
    @fg.l
    public List<kotlin.reflect.s> getUpperBounds() {
        i0.a aVar = this.upperBounds;
        kotlin.reflect.o<Object> oVar = f75642e[0];
        Object invoke = aVar.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("杛\u0001"));
        return (List) invoke;
    }

    public int hashCode() {
        return getName().hashCode() + (this.container.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.p
    public kotlin.reflect.jvm.internal.impl.descriptors.h i() {
        return this.descriptor;
    }

    @Override // kotlin.reflect.t
    /* renamed from: l */
    public boolean getIsReified() {
        return this.descriptor.l();
    }

    @Override // kotlin.reflect.t
    @fg.l
    /* renamed from: o */
    public kotlin.reflect.v getVariance() {
        int i4 = a.f75646a[this.descriptor.o().ordinal()];
        if (i4 == 1) {
            return kotlin.reflect.v.INVARIANT;
        }
        if (i4 == 2) {
            return kotlin.reflect.v.IN;
        }
        if (i4 == 3) {
            return kotlin.reflect.v.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public String toString() {
        return v1.INSTANCE.a(this);
    }
}
