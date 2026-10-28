package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;

/* compiled from: KCallableImpl.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bN\u0010OJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u001a*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e0\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010!0!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001a*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u00106R\u0014\u0010;\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00106R\u0016\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00103R\u0014\u0010E\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0014\u0010G\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010I\u001a\u0002018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u00103R\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lkotlin/reflect/jvm/internal/l;", "R", "Lkotlin/reflect/c;", "Lkotlin/reflect/jvm/internal/d0;", "", "Lkotlin/reflect/n;", "", "args", "v0", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/s;", "type", "x0", "Ljava/lang/reflect/Type;", "y0", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "X", "Lkotlin/coroutines/d;", "continuationArgument", "w0", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/g0$a;", "", "", "kotlin.jvm.PlatformType", "o", "Lkotlin/reflect/jvm/internal/g0$a;", "_annotations", "Ljava/util/ArrayList;", "p", "_parameters", "Lkotlin/reflect/jvm/internal/b0;", "q", "_returnType", "Lkotlin/reflect/jvm/internal/c0;", "r", "_typeParameters", "Lkotlin/reflect/jvm/internal/calls/e;", "z0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "B0", "defaultCaller", "Lkotlin/reflect/jvm/internal/p;", "A0", "()Lkotlin/reflect/jvm/internal/p;", "container", "", "E0", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "parameters", "i", "()Lkotlin/reflect/s;", "returnType", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/w;", "c", "()Lkotlin/reflect/w;", "visibility", "a", "isFinal", "isOpen", "d", "isAbstract", "D0", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class l<R> implements KCallable<R>, d0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a<List<Annotation>> _annotations;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a<ArrayList<KParameter>> _parameters;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a<b0> _returnType;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a<List<c0>> _typeParameters;

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements q3.a<List<? extends Annotation>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<R> f26713p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? extends R> lVar) {
            super(0);
            this.f26713p = lVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Annotation> n() {
            return n0.e(this.f26713p.F0());
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Ljava/util/ArrayList;", "Lkotlin/reflect/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<ArrayList<KParameter>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<R> f26714p;

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements q3.a<r0> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ x0 f26715p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0 x0Var) {
                super(0);
                this.f26715p = x0Var;
            }

            @d5.d
            public final r0 a() {
                return this.f26715p;
            }

            @Override // q3.a
            public r0 n() {
                return this.f26715p;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.l$b$b, reason: collision with other inner class name */
        static final class C0399b extends Lambda implements q3.a<r0> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ x0 f26716p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0399b(x0 x0Var) {
                super(0);
                this.f26716p = x0Var;
            }

            @d5.d
            public final r0 a() {
                return this.f26716p;
            }

            @Override // q3.a
            public r0 n() {
                return this.f26716p;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 8, 0})
        static final class c extends Lambda implements q3.a<r0> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f26717p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f26718q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, int i5) {
                super(0);
                this.f26717p = bVar;
                this.f26718q = i5;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r0 n() {
                j1 j1Var = this.f26717p.n().get(this.f26718q);
                kotlin.jvm.internal.l0.o(j1Var, ProtectedSandApp.s("觫"));
                return j1Var;
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes5.dex */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t5, T t6) {
                int l5;
                l5 = kotlin.comparisons.g.l(((KParameter) t5).getName(), ((KParameter) t6).getName());
                return l5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? extends R> lVar) {
            super(0);
            this.f26714p = lVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<KParameter> n() {
            int i5;
            kotlin.reflect.jvm.internal.impl.descriptors.b F0 = this.f26714p.F0();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            int i6 = 0;
            if (this.f26714p.E0()) {
                i5 = 0;
            } else {
                x0 i7 = n0.i(F0);
                if (i7 != null) {
                    arrayList.add(new v(this.f26714p, 0, KParameter.b.INSTANCE, new a(i7)));
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                x0 t02 = F0.t0();
                if (t02 != null) {
                    arrayList.add(new v(this.f26714p, i5, KParameter.b.EXTENSION_RECEIVER, new C0399b(t02)));
                    i5++;
                }
            }
            int size = F0.n().size();
            while (i6 < size) {
                arrayList.add(new v(this.f26714p, i5, KParameter.b.VALUE, new c(F0, i6)));
                i6++;
                i5++;
            }
            if (this.f26714p.D0() && (F0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a) && arrayList.size() > 1) {
                kotlin.collections.e0.p0(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/b0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/b0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<b0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<R> f26719p;

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements q3.a<Type> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ l<R> f26720p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? extends R> lVar) {
                super(0);
                this.f26720p = lVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type n() {
                Type y02 = this.f26720p.y0();
                return y02 == null ? this.f26720p.z0().getReturnType() : y02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l<? extends R> lVar) {
            super(0);
            this.f26719p = lVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0 n() {
            kotlin.reflect.jvm.internal.impl.types.h0 i5 = this.f26719p.F0().i();
            kotlin.jvm.internal.l0.m(i5);
            return new b0(i5, new a(this.f26719p));
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "Lkotlin/reflect/jvm/internal/c0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends Lambda implements q3.a<List<? extends c0>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<R> f26721p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l<? extends R> lVar) {
            super(0);
            this.f26721p = lVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<c0> n() {
            int b02;
            List<f1> typeParameters = this.f26721p.F0().getTypeParameters();
            kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("觬"));
            l<R> lVar = this.f26721p;
            b02 = kotlin.collections.b0.b0(typeParameters, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (f1 f1Var : typeParameters) {
                kotlin.jvm.internal.l0.o(f1Var, ProtectedSandApp.s("觭"));
                arrayList.add(new c0(lVar, f1Var));
            }
            return arrayList;
        }
    }

    public l() {
        g0.a<List<Annotation>> d6 = g0.d(new a(this));
        kotlin.jvm.internal.l0.o(d6, ProtectedSandApp.s("觮"));
        this._annotations = d6;
        g0.a<ArrayList<KParameter>> d7 = g0.d(new b(this));
        kotlin.jvm.internal.l0.o(d7, ProtectedSandApp.s("觯"));
        this._parameters = d7;
        g0.a<b0> d8 = g0.d(new c(this));
        kotlin.jvm.internal.l0.o(d8, ProtectedSandApp.s("觰"));
        this._returnType = d8;
        g0.a<List<c0>> d9 = g0.d(new d(this));
        kotlin.jvm.internal.l0.o(d9, ProtectedSandApp.s("觱"));
        this._typeParameters = d9;
    }

    private final R v0(Map<KParameter, ? extends Object> args) {
        int b02;
        Object x02;
        List<KParameter> r5 = r();
        b02 = kotlin.collections.b0.b0(r5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (KParameter kParameter : r5) {
            if (args.containsKey(kParameter)) {
                x02 = args.get(kParameter);
                if (x02 == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觲") + kParameter + ')');
                }
            } else if (kParameter.q0()) {
                x02 = null;
            } else {
                if (!kParameter.b()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觳") + kParameter);
                }
                x02 = x0(kParameter.getType());
            }
            arrayList.add(x02);
        }
        kotlin.reflect.jvm.internal.calls.e<?> B0 = B0();
        if (B0 != null) {
            try {
                return (R) B0.C(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e6) {
                throw new IllegalCallableAccessException(e6);
            }
        }
        throw new e0(ProtectedSandApp.s("觴") + F0());
    }

    private final Object x0(KType type) {
        Class e6 = p3.b.e(kotlin.reflect.jvm.d.b(type));
        if (e6.isArray()) {
            Object newInstance = Array.newInstance(e6.getComponentType(), 0);
            kotlin.jvm.internal.l0.o(newInstance, ProtectedSandApp.s("觵"));
            return newInstance;
        }
        throw new e0(ProtectedSandApp.s("觶") + e6.getSimpleName() + ProtectedSandApp.s("觷"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type y0() {
        Object v32;
        Object ft;
        Type[] lowerBounds;
        Object Rb;
        kotlin.reflect.jvm.internal.impl.descriptors.b F0 = F0();
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = F0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z ? (kotlin.reflect.jvm.internal.impl.descriptors.z) F0 : null;
        boolean z5 = false;
        if (zVar != null && zVar.o()) {
            z5 = true;
        }
        if (!z5) {
            return null;
        }
        v32 = kotlin.collections.j0.v3(z0().a());
        ParameterizedType parameterizedType = v32 instanceof ParameterizedType ? (ParameterizedType) v32 : null;
        if (!kotlin.jvm.internal.l0.g(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.l0.o(actualTypeArguments, ProtectedSandApp.s("觸"));
        ft = kotlin.collections.t.ft(actualTypeArguments);
        WildcardType wildcardType = ft instanceof WildcardType ? (WildcardType) ft : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        Rb = kotlin.collections.t.Rb(lowerBounds);
        return (Type) Rb;
    }

    @d5.d
    /* renamed from: A0 */
    public abstract p getContainer();

    @d5.e
    public abstract kotlin.reflect.jvm.internal.calls.e<?> B0();

    @Override // kotlin.reflect.KCallable
    public R C(@d5.d Object... args) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("觹"));
        try {
            return (R) z0().C(args);
        } catch (IllegalAccessException e6) {
            throw new IllegalCallableAccessException(e6);
        }
    }

    @d5.d
    /* renamed from: C0 */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.b F0();

    protected final boolean D0() {
        return kotlin.jvm.internal.l0.g(getName(), ProtectedSandApp.s("觺")) && getContainer().f().isAnnotation();
    }

    public abstract boolean E0();

    @Override // kotlin.reflect.KCallable
    public R X(@d5.d Map<KParameter, ? extends Object> args) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("觻"));
        return D0() ? v0(args) : w0(args, null);
    }

    @Override // kotlin.reflect.KCallable
    public boolean a() {
        return F0().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    @d5.e
    public KVisibility c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u c6 = F0().c();
        kotlin.jvm.internal.l0.o(c6, ProtectedSandApp.s("觼"));
        return n0.q(c6);
    }

    @Override // kotlin.reflect.KCallable
    public boolean d() {
        return F0().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        List<Annotation> n5 = this._annotations.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("觽"));
        return n5;
    }

    @Override // kotlin.reflect.KCallable
    @d5.d
    public List<KTypeParameter> getTypeParameters() {
        List<c0> n5 = this._typeParameters.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("觾"));
        return n5;
    }

    @Override // kotlin.reflect.KCallable
    @d5.d
    public KType i() {
        b0 n5 = this._returnType.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("觿"));
        return n5;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return F0().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN;
    }

    @Override // kotlin.reflect.KCallable
    @d5.d
    public List<KParameter> r() {
        ArrayList<KParameter> n5 = this._parameters.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("言"));
        return n5;
    }

    public final R w0(@d5.d Map<KParameter, ? extends Object> args, @d5.e Continuation<?> continuationArgument) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("訁"));
        List<KParameter> r5 = r();
        ArrayList arrayList = new ArrayList(r5.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it = r5.iterator();
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (continuationArgument != null) {
                    arrayList.add(continuationArgument);
                }
                if (!z5) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    return C(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i6));
                kotlin.reflect.jvm.internal.calls.e<?> B0 = B0();
                if (B0 == null) {
                    throw new e0(ProtectedSandApp.s("訃") + F0());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(null);
                try {
                    return (R) B0.C(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e6) {
                    throw new IllegalCallableAccessException(e6);
                }
            }
            KParameter next = it.next();
            if (i5 != 0 && i5 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i6));
                i6 = 0;
            }
            if (args.containsKey(next)) {
                arrayList.add(args.get(next));
            } else if (next.q0()) {
                arrayList.add(n0.k(next.getType()) ? null : n0.g(kotlin.reflect.jvm.e.g(next.getType())));
                i6 = (1 << (i5 % 32)) | i6;
                z5 = true;
            } else {
                if (!next.b()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("訂") + next);
                }
                arrayList.add(x0(next.getType()));
            }
            if (next.getKind() == KParameter.b.VALUE) {
                i5++;
            }
        }
    }

    @d5.d
    public abstract kotlin.reflect.jvm.internal.calls.e<?> z0();
}
