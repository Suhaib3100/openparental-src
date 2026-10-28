package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.n;

/* compiled from: KCallableImpl.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010\u001f\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RD\u0010+\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n $*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010(j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`)0(j\b\u0012\u0004\u0012\u00020\n`)0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\"\u0010.\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010,0,0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R.\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ $*\n\u0012\u0004\u0012\u00020/\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R2\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0006\u0012\u0002\b\u0003098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u0001098&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010M\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0014\u0010V\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0014\u0010W\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010DR\u0014\u0010Y\u001a\u0002058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bX\u0010DR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lkotlin/reflect/jvm/internal/n;", "R", "Lkotlin/reflect/c;", "Lkotlin/reflect/jvm/internal/f0;", "<init>", "()V", "", "", "l0", "()[Ljava/lang/Object;", "Lkotlin/reflect/n;", "parameter", "", "q0", "(Lkotlin/reflect/n;)I", "", "args", "h0", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/s;", "type", "j0", "(Lkotlin/reflect/s;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "k0", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/d;", "continuationArgument", "i0", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/i0$a;", "", "", "kotlin.jvm.PlatformType", "b", "Lkotlin/reflect/jvm/internal/i0$a;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "_parameters", "Lkotlin/reflect/jvm/internal/d0;", "d", "_returnType", "Lkotlin/reflect/jvm/internal/e0;", "e", "_typeParameters", "f", "_absentArguments", "Lkotlin/b0;", "", "g", "Lkotlin/b0;", "parametersNeedMFVCFlattening", "Lkotlin/reflect/jvm/internal/calls/e;", "m0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "o0", "defaultCaller", "Lkotlin/reflect/jvm/internal/r;", "n0", "()Lkotlin/reflect/jvm/internal/r;", "container", "s0", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/s;", "returnType", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/w;", "getVisibility", "()Lkotlin/reflect/w;", "visibility", "isFinal", "isOpen", "isAbstract", "r0", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n227#2,5:277\n227#2,2:282\n229#2,3:285\n227#2,5:288\n227#2,5:293\n227#2,2:303\n229#2,3:307\n26#3:284\n1#4:298\n1549#5:299\n1620#5,3:300\n37#6,2:305\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n107#1:277,5\n158#1:282,2\n158#1:285,3\n206#1:288,5\n214#1:293,5\n248#1:303,2\n248#1:307,3\n159#1:284\n234#1:299\n234#1:300,3\n249#1:305,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class n<R> implements kotlin.reflect.c<R>, f0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<List<Annotation>> _annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<ArrayList<kotlin.reflect.n>> _parameters;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<d0> _returnType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<List<e0>> _typeParameters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<Object[]> _absentArguments;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<Boolean> parametersNeedMFVCFlattening;

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "", "kotlin.jvm.PlatformType", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1774#2,4:277\n1855#2,2:281\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n*L\n124#1:277,4\n132#1:281,2\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Object[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n<? extends R> nVar) {
            super(0);
            this.f78729b = nVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object[] invoke() {
            int i4;
            List<kotlin.reflect.n> parameters = this.f78729b.getParameters();
            int size = (this.f78729b.isSuspend() ? 1 : 0) + parameters.size();
            if (((Boolean) ((n) this.f78729b).parametersNeedMFVCFlattening.getValue()).booleanValue()) {
                n<R> nVar = this.f78729b;
                i4 = 0;
                for (kotlin.reflect.n nVar2 : parameters) {
                    i4 += nVar2.getKind() == n.b.VALUE ? nVar.q0(nVar2) : 0;
                }
            } else {
                List<kotlin.reflect.n> list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i4 = 0;
                    while (it.hasNext()) {
                        if (((kotlin.reflect.n) it.next()).getKind() == n.b.VALUE && (i4 = i4 + 1) < 0) {
                            kotlin.collections.w.Y();
                        }
                    }
                }
            }
            int i5 = (i4 + 31) / 32;
            Object[] objArr = new Object[size + i5 + 1];
            n<R> nVar3 = this.f78729b;
            for (kotlin.reflect.n nVar4 : parameters) {
                if (nVar4.A() && !p0.n(nVar4.getType())) {
                    objArr[nVar4.getIndex()] = p0.g(kotlin.reflect.jvm.e.i(nVar4.getType()));
                } else if (nVar4.a()) {
                    objArr[nVar4.getIndex()] = nVar3.j0(nVar4.getType());
                }
            }
            for (int i6 = 0; i6 < i5; i6++) {
                objArr[size + i6] = 0;
            }
            return objArr;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<List<? extends Annotation>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(n<? extends R> nVar) {
            super(0);
            this.f78730b = nVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Annotation> invoke() {
            return p0.e(this.f78730b.t0());
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"R", "Ljava/util/ArrayList;", "Lkotlin/reflect/n;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_parameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1002#2,2:277\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_parameters$1\n*L\n65#1:277,2\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<ArrayList<kotlin.reflect.n>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78731b;

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<r0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x0 f78732b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0 x0Var) {
                super(0);
                this.f78732b = x0Var;
            }

            @fg.l
            public final r0 a() {
                return this.f78732b;
            }

            @Override // ld.a
            public r0 invoke() {
                return this.f78732b;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 9, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<r0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x0 f78733b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x0 x0Var) {
                super(0);
                this.f78733b = x0Var;
            }

            @fg.l
            public final r0 a() {
                return this.f78733b;
            }

            @Override // ld.a
            public r0 invoke() {
                return this.f78733b;
            }
        }

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/r0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.n$c$c, reason: collision with other inner class name */
        static final class C1203c extends kotlin.jvm.internal.n0 implements ld.a<r0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f78734b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f78735c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1203c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, int i4) {
                super(0);
                this.f78734b = bVar;
                this.f78735c = i4;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r0 invoke() {
                j1 j1Var = this.f78734b.i().get(this.f78735c);
                kotlin.jvm.internal.l0.o(j1Var, ProtectedSandApp.s("臚\u0001"));
                return j1Var;
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_parameters$1\n*L\n1#1,328:1\n65#2:329\n*E\n"})
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return kotlin.comparisons.a.l(((kotlin.reflect.n) t4).getName(), ((kotlin.reflect.n) t5).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(n<? extends R> nVar) {
            super(0);
            this.f78731b = nVar;
        }

        @Override // ld.a
        public final ArrayList<kotlin.reflect.n> invoke() {
            int i4;
            kotlin.reflect.jvm.internal.impl.descriptors.b t02 = this.f78731b.t0();
            ArrayList<kotlin.reflect.n> arrayList = new ArrayList<>();
            int i5 = 0;
            if (this.f78731b.s0()) {
                i4 = 0;
            } else {
                x0 k4 = p0.k(t02);
                if (k4 != null) {
                    arrayList.add(new x(this.f78731b, 0, n.b.INSTANCE, new a(k4)));
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                x0 S = t02.S();
                if (S != null) {
                    arrayList.add(new x(this.f78731b, i4, n.b.EXTENSION_RECEIVER, new b(S)));
                    i4++;
                }
            }
            int size = t02.i().size();
            while (i5 < size) {
                arrayList.add(new x(this.f78731b, i4, n.b.VALUE, new C1203c(t02, i5)));
                i5++;
                i4++;
            }
            if (this.f78731b.r0() && (t02 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a) && arrayList.size() > 1) {
                kotlin.collections.w.p0(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/d0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/d0;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<d0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78736b;

        /* compiled from: KCallableImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Type> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n<R> f78737b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? extends R> nVar) {
                super(0);
                this.f78737b = nVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type k02 = this.f78737b.k0();
                return k02 == null ? this.f78737b.m0().getReturnType() : k02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(n<? extends R> nVar) {
            super(0);
            this.f78736b = nVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            kotlin.reflect.jvm.internal.impl.types.h0 returnType = this.f78736b.t0().getReturnType();
            kotlin.jvm.internal.l0.m(returnType);
            return new d0(returnType, new a(this.f78736b));
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "Lkotlin/reflect/jvm/internal/e0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_typeParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1549#2:277\n1620#2,3:278\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_typeParameters$1\n*L\n85#1:277\n85#1:278,3\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<List<? extends e0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(n<? extends R> nVar) {
            super(0);
            this.f78738b = nVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<e0> invoke() {
            List<f1> typeParameters = this.f78738b.t0().getTypeParameters();
            kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("臛\u0001"));
            List<f1> list = typeParameters;
            n<R> nVar = this.f78738b;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            for (f1 f1Var : list) {
                kotlin.jvm.internal.l0.m(f1Var);
                arrayList.add(new e0(nVar, f1Var));
            }
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$parametersNeedMFVCFlattening$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1747#2,3:277\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$parametersNeedMFVCFlattening$1\n*L\n220#1:277,3\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<R> f78739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(n<? extends R> nVar) {
            super(0);
            this.f78739b = nVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            List<kotlin.reflect.n> parameters = this.f78739b.getParameters();
            boolean z4 = false;
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it = parameters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (p0.m(((kotlin.reflect.n) it.next()).getType())) {
                        z4 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z4);
        }
    }

    public n() {
        i0.a<List<Annotation>> c5 = i0.c(new b(this));
        String s4 = ProtectedSandApp.s("晢\u0001");
        kotlin.jvm.internal.l0.o(c5, s4);
        this._annotations = c5;
        i0.a<ArrayList<kotlin.reflect.n>> c6 = i0.c(new c(this));
        kotlin.jvm.internal.l0.o(c6, s4);
        this._parameters = c6;
        i0.a<d0> c7 = i0.c(new d(this));
        kotlin.jvm.internal.l0.o(c7, s4);
        this._returnType = c7;
        i0.a<List<e0>> c10 = i0.c(new e(this));
        kotlin.jvm.internal.l0.o(c10, s4);
        this._typeParameters = c10;
        i0.a<Object[]> c11 = i0.c(new a(this));
        kotlin.jvm.internal.l0.o(c11, s4);
        this._absentArguments = c11;
        this.parametersNeedMFVCFlattening = kotlin.c0.b(kotlin.f0.PUBLICATION, new f(this));
    }

    private final R h0(Map<kotlin.reflect.n, ? extends Object> args) {
        Object j02;
        List<kotlin.reflect.n> parameters = getParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(parameters, 10));
        for (kotlin.reflect.n nVar : parameters) {
            if (args.containsKey(nVar)) {
                j02 = args.get(nVar);
                if (j02 == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("晣\u0001") + nVar + ')');
                }
            } else if (nVar.A()) {
                j02 = null;
            } else {
                if (!nVar.a()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("晤\u0001") + nVar);
                }
                j02 = j0(nVar.getType());
            }
            arrayList.add(j02);
        }
        kotlin.reflect.jvm.internal.calls.e<?> o02 = o0();
        if (o02 != null) {
            try {
                return (R) o02.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new g0(ProtectedSandApp.s("晥\u0001") + t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j0(kotlin.reflect.s type) {
        Class e4 = kd.b.e(kotlin.reflect.jvm.d.b(type));
        if (e4.isArray()) {
            Object newInstance = Array.newInstance(e4.getComponentType(), 0);
            kotlin.jvm.internal.l0.o(newInstance, ProtectedSandApp.s("晦\u0001"));
            return newInstance;
        }
        throw new g0(ProtectedSandApp.s("晧\u0001") + e4.getSimpleName() + ProtectedSandApp.s("晨\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type k0() {
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object v32 = kotlin.collections.w.v3(m0().c());
        ParameterizedType parameterizedType = v32 instanceof ParameterizedType ? (ParameterizedType) v32 : null;
        if (!kotlin.jvm.internal.l0.g(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.l0.o(actualTypeArguments, ProtectedSandApp.s("晩\u0001"));
        Object gt = kotlin.collections.l.gt(actualTypeArguments);
        WildcardType wildcardType = gt instanceof WildcardType ? (WildcardType) gt : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) kotlin.collections.l.Rb(lowerBounds);
    }

    private final Object[] l0() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q0(kotlin.reflect.n parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("晫\u0001"));
        }
        if (!p0.m(parameter.getType())) {
            return 1;
        }
        kotlin.reflect.s type = parameter.getType();
        kotlin.jvm.internal.l0.n(type, ProtectedSandApp.s("晪\u0001"));
        List<Method> m4 = kotlin.reflect.jvm.internal.calls.k.m(p1.a(((d0) type).getType()));
        kotlin.jvm.internal.l0.m(m4);
        return m4.size();
    }

    @Override // kotlin.reflect.c
    public R call(@fg.l Object... args) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("晬\u0001"));
        try {
            return (R) m0().call(args);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }

    @Override // kotlin.reflect.c
    public R callBy(@fg.l Map<kotlin.reflect.n, ? extends Object> args) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("晬\u0001"));
        return r0() ? h0(args) : i0(args, null);
    }

    @Override // kotlin.reflect.b
    @fg.l
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this._annotations.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("晭\u0001"));
        return invoke;
    }

    @Override // kotlin.reflect.c
    @fg.l
    public List<kotlin.reflect.n> getParameters() {
        ArrayList<kotlin.reflect.n> invoke = this._parameters.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("晭\u0001"));
        return invoke;
    }

    @Override // kotlin.reflect.c
    @fg.l
    public kotlin.reflect.s getReturnType() {
        d0 invoke = this._returnType.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("晭\u0001"));
        return invoke;
    }

    @Override // kotlin.reflect.c
    @fg.l
    public List<kotlin.reflect.t> getTypeParameters() {
        List<e0> invoke = this._typeParameters.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("晭\u0001"));
        return invoke;
    }

    @Override // kotlin.reflect.c
    @fg.m
    public kotlin.reflect.w getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = t0().getVisibility();
        kotlin.jvm.internal.l0.o(visibility, ProtectedSandApp.s("普\u0001"));
        return p0.t(visibility);
    }

    public final R i0(@fg.l Map<kotlin.reflect.n, ? extends Object> args, @fg.m kotlin.coroutines.d<?> continuationArgument) {
        kotlin.jvm.internal.l0.p(args, ProtectedSandApp.s("晬\u0001"));
        List<kotlin.reflect.n> parameters = getParameters();
        boolean z4 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) m0().call(isSuspend() ? new kotlin.coroutines.d[]{continuationArgument} : new kotlin.coroutines.d[0]);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters.size();
        Object[] l02 = l0();
        if (isSuspend()) {
            l02[parameters.size()] = continuationArgument;
        }
        boolean booleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i4 = 0;
        for (kotlin.reflect.n nVar : parameters) {
            int q02 = booleanValue ? q0(nVar) : 1;
            if (args.containsKey(nVar)) {
                l02[nVar.getIndex()] = args.get(nVar);
            } else if (nVar.A()) {
                String s4 = ProtectedSandApp.s("景\u0001");
                if (booleanValue) {
                    int i5 = i4 + q02;
                    for (int i6 = i4; i6 < i5; i6++) {
                        int i7 = (i6 / 32) + size;
                        Object obj = l02[i7];
                        kotlin.jvm.internal.l0.n(obj, s4);
                        l02[i7] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i6 % 32)));
                    }
                } else {
                    int i10 = (i4 / 32) + size;
                    Object obj2 = l02[i10];
                    kotlin.jvm.internal.l0.n(obj2, s4);
                    l02[i10] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i4 % 32)));
                }
                z4 = true;
            } else if (!nVar.a()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("晤\u0001") + nVar);
            }
            if (nVar.getKind() == n.b.VALUE) {
                i4 += q02;
            }
        }
        if (!z4) {
            try {
                kotlin.reflect.jvm.internal.calls.e<?> m02 = m0();
                Object[] copyOf = Arrays.copyOf(l02, size);
                kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("晰\u0001"));
                return (R) m02.call(copyOf);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        kotlin.reflect.jvm.internal.calls.e<?> o02 = o0();
        if (o02 != null) {
            try {
                return (R) o02.call(l02);
            } catch (IllegalAccessException e6) {
                throw new IllegalCallableAccessException(e6);
            }
        }
        throw new g0(ProtectedSandApp.s("晥\u0001") + t0());
    }

    @Override // kotlin.reflect.c
    public boolean isAbstract() {
        return t0().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT;
    }

    @Override // kotlin.reflect.c
    public boolean isFinal() {
        return t0().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @Override // kotlin.reflect.c
    public boolean isOpen() {
        return t0().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN;
    }

    @fg.l
    public abstract kotlin.reflect.jvm.internal.calls.e<?> m0();

    @fg.l
    /* renamed from: n0 */
    public abstract r getContainer();

    @fg.m
    public abstract kotlin.reflect.jvm.internal.calls.e<?> o0();

    @fg.l
    /* renamed from: p0 */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.b t0();

    protected final boolean r0() {
        return kotlin.jvm.internal.l0.g(getName(), ProtectedSandApp.s("晱\u0001")) && getContainer().e().isAnnotation();
    }

    public abstract boolean s0();
}
