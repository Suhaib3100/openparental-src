package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.m2;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004*\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0006H\u0002J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/c0;", "Lkotlin/reflect/t;", "Lkotlin/reflect/jvm/internal/n;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Lkotlin/reflect/jvm/internal/m;", "f", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/h;", "Ljava/lang/Class;", "b", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/impl/descriptors/f1;", "o", "Lkotlin/reflect/jvm/internal/impl/descriptors/f1;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "descriptor", "", "Lkotlin/reflect/s;", "p", "Lkotlin/reflect/jvm/internal/g0$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lkotlin/reflect/jvm/internal/d0;", "q", "Lkotlin/reflect/jvm/internal/d0;", "container", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/v;", "z", "()Lkotlin/reflect/v;", "variance", "v", "()Z", "isReified", "<init>", "(Lkotlin/reflect/jvm/internal/d0;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class c0 implements KTypeParameter, n {

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23818r = {l1.u(new g1(l1.d(c0.class), ProtectedSandApp.s("羛"), ProtectedSandApp.s("羜")))};

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final f1 descriptor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a upperBounds;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d0 container;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23822a;

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
            f23822a = iArr;
        }
    }

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/b0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<List<? extends b0>> {
        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<b0> n() {
            int b02;
            List<kotlin.reflect.jvm.internal.impl.types.h0> upperBounds = c0.this.getDescriptor().getUpperBounds();
            kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("羚"));
            b02 = kotlin.collections.b0.b0(upperBounds, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new b0((kotlin.reflect.jvm.internal.impl.types.h0) it.next(), null, 2, 0 == true ? 1 : 0));
            }
            return arrayList;
        }
    }

    public c0(@d5.e d0 d0Var, @d5.d f1 f1Var) {
        m<?> mVar;
        Object T;
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("羝"));
        this.descriptor = f1Var;
        this.upperBounds = g0.d(new b());
        if (d0Var == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = f1Var.b();
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("羞"));
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                T = f((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
            } else {
                if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
                    throw new e0(ProtectedSandApp.s("羣") + b6);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.m b7 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) b6).b();
                kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("羟"));
                if (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    mVar = f((kotlin.reflect.jvm.internal.impl.descriptors.e) b7);
                } else {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar = b6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) b6 : null;
                    if (hVar == null) {
                        throw new e0(ProtectedSandApp.s("羢") + b6);
                    }
                    KClass i5 = p3.b.i(b(hVar));
                    kotlin.jvm.internal.l0.n(i5, ProtectedSandApp.s("羠"));
                    mVar = (m) i5;
                }
                T = b6.T(new g(mVar), m2.f23662a);
            }
            kotlin.jvm.internal.l0.o(T, ProtectedSandApp.s("羡"));
            d0Var = (d0) T;
        }
        this.container = d0Var;
    }

    private final Class<?> b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar) {
        Class<?> d6;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g j02 = hVar.j0();
        if (!(j02 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.l)) {
            j02 = null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.l lVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.l) j02;
        kotlin.reflect.jvm.internal.impl.load.kotlin.r g5 = lVar != null ? lVar.g() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) (g5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f ? g5 : null);
        if (fVar != null && (d6 = fVar.d()) != null) {
            return d6;
        }
        throw new e0(ProtectedSandApp.s("群") + hVar);
    }

    private final m<?> f(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Class<?> p5 = n0.p(eVar);
        m<?> mVar = (m) (p5 != null ? p3.b.i(p5) : null);
        if (mVar != null) {
            return mVar;
        }
        throw new e0(ProtectedSandApp.s("羥") + eVar.b());
    }

    @d5.d
    /* renamed from: e, reason: from getter */
    public f1 getDescriptor() {
        return this.descriptor;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof c0) {
            c0 c0Var = (c0) other;
            if (kotlin.jvm.internal.l0.g(this.container, c0Var.container) && kotlin.jvm.internal.l0.g(getF23634p(), c0Var.getF23634p())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    /* renamed from: getName */
    public String getF23634p() {
        String h5 = this.descriptor.getName().h();
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("羦"));
        return h5;
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    public List<KType> getUpperBounds() {
        T b6 = this.upperBounds.b(this, f23818r[0]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("羧"));
        return (List) b6;
    }

    public int hashCode() {
        return getF23634p().hashCode() + (this.container.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.n
    public kotlin.reflect.jvm.internal.impl.descriptors.h n() {
        return this.descriptor;
    }

    @d5.d
    public String toString() {
        return TypeParameterReference.f23632t.a(this);
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: v */
    public boolean getF23636r() {
        return this.descriptor.v();
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    /* renamed from: z */
    public KVariance getF23635q() {
        int i5 = a.f23822a[this.descriptor.z().ordinal()];
        if (i5 == 1) {
            return KVariance.INVARIANT;
        }
        if (i5 == 2) {
            return KVariance.IN;
        }
        if (i5 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
