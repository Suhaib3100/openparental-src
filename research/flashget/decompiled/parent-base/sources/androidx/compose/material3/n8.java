package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\f*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/n8;", "Landroidx/compose/ui/layout/s0;", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Lkotlinx/coroutines/r0;", "g", "()Lkotlinx/coroutines/r0;", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "b", "Landroidx/compose/animation/core/b;", "f", "()Landroidx/compose/animation/core/b;", "h", "(Landroidx/compose/animation/core/b;)V", "animatable", "c", "Ljava/lang/Integer;", "initialOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,786:1\n151#2,3:787\n33#2,4:790\n154#2,2:794\n38#2:796\n156#2:797\n171#2,13:798\n151#2,3:811\n33#2,4:814\n154#2,2:818\n38#2:820\n156#2:821\n171#2,13:822\n171#2,13:835\n1#3:848\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:787,3\n354#1:790,4\n354#1:794,2\n354#1:796\n354#1:797\n355#1:798,13\n356#1:811,3\n356#1:814,4\n356#1:818,2\n356#1:820\n356#1:821\n357#1:822,13\n358#1:835,13\n*E\n"})
/* loaded from: classes.dex */
public final class n8 implements androidx.compose.ui.layout.s0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f12695d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> animatable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer initialOffset;

    /* compiled from: SegmentedButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> f12700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12701d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> bVar, int i4, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12700c = bVar;
            this.f12701d = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f12700c, this.f12701d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12699b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> bVar = this.f12700c;
                Integer num = new Integer(this.f12701d);
                androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(350, 0, null, 6, null);
                this.f12699b = 1;
                if (androidx.compose.animation.core.b.i(bVar, num, r4, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,786:1\n33#2,6:787\n33#2,6:793\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2\n*L\n381#1:787,6\n388#1:793,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.layout.i1> f12702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f12703c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n8 f12704d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12705e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.layout.i1> f12706f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.o0 o0Var, n8 n8Var, int i4, List<? extends androidx.compose.ui.layout.i1> list2, int i5) {
            super(1);
            this.f12702b = list;
            this.f12703c = o0Var;
            this.f12704d = n8Var;
            this.f12705e = i4;
            this.f12706f = list2;
            this.f12707g = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            float f4;
            List<androidx.compose.ui.layout.i1> list = this.f12702b;
            int i4 = this.f12707g;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.compose.ui.layout.i1 i1Var = list.get(i5);
                i1.a.g(aVar, i1Var, 0, r.a(i1Var, i4, 2), 0.0f, 4, null);
            }
            int q22 = this.f12703c.q2(o8.f12930a.j());
            androidx.compose.ui.layout.o0 o0Var = this.f12703c;
            f4 = p8.f13319b;
            int q23 = o0Var.q2(f4) + q22;
            androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> f5 = this.f12704d.f();
            int intValue = q23 + (f5 != null ? f5.v().intValue() : this.f12705e);
            List<androidx.compose.ui.layout.i1> list2 = this.f12706f;
            int i6 = this.f12707g;
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                androidx.compose.ui.layout.i1 i1Var2 = list2.get(i7);
                i1.a.g(aVar, i1Var2, intValue, r.a(i1Var2, i6, 2), 0.0f, 4, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public n8(@fg.l kotlinx.coroutines.r0 r0Var) {
        this.scope = r0Var;
    }

    @Override // androidx.compose.ui.layout.s0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends List<? extends androidx.compose.ui.layout.l0>> list, long j4) {
        Object obj;
        Object obj2;
        Object obj3;
        float f4;
        int i4;
        float f5;
        List<? extends androidx.compose.ui.layout.l0> list2 = list.get(0);
        int i5 = 1;
        List<? extends androidx.compose.ui.layout.l0> list3 = list.get(1);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        int i6 = 0;
        while (i6 < size) {
            i6 = androidx.compose.animation.n.a(list2.get(i6), j4, arrayList, i6, 1);
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((androidx.compose.ui.layout.i1) obj).getWidth();
            int J = kotlin.collections.w.J(arrayList);
            if (1 <= J) {
                int i7 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i7);
                    int width2 = ((androidx.compose.ui.layout.i1) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i7 == J) {
                        break;
                    }
                    i7++;
                }
            }
        }
        androidx.compose.ui.layout.i1 i1Var = (androidx.compose.ui.layout.i1) obj;
        int width3 = i1Var != null ? i1Var.getWidth() : 0;
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        int i10 = 0;
        while (i10 < size2) {
            i10 = androidx.compose.animation.n.a(list3.get(i10), j4, arrayList2, i10, 1);
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((androidx.compose.ui.layout.i1) obj2).getWidth();
            int J2 = kotlin.collections.w.J(arrayList2);
            if (1 <= J2) {
                int i11 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i11);
                    int width5 = ((androidx.compose.ui.layout.i1) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i11 == J2) {
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.compose.ui.layout.i1 i1Var2 = (androidx.compose.ui.layout.i1) obj2;
        Integer valueOf = i1Var2 != null ? Integer.valueOf(i1Var2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((androidx.compose.ui.layout.i1) obj3).getHeight();
            int J3 = kotlin.collections.w.J(arrayList2);
            if (1 <= J3) {
                while (true) {
                    Object obj6 = arrayList2.get(i5);
                    int height2 = ((androidx.compose.ui.layout.i1) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i5 == J3) {
                        break;
                    }
                    i5++;
                }
            }
        }
        androidx.compose.ui.layout.i1 i1Var3 = (androidx.compose.ui.layout.i1) obj3;
        int height3 = i1Var3 != null ? i1Var3.getHeight() : 0;
        o8 o8Var = o8.f12930a;
        int max = Math.max(o0Var.q2(o8Var.j()), width3);
        f4 = p8.f13319b;
        int q22 = o0Var.q2(f4) + max + (valueOf != null ? valueOf.intValue() : 0);
        if (width3 == 0) {
            int q23 = o0Var.q2(o8Var.j());
            f5 = p8.f13319b;
            i4 = (-(o0Var.q2(f5) + q23)) / 2;
        } else {
            i4 = 0;
        }
        if (this.initialOffset == null) {
            this.initialOffset = Integer.valueOf(i4);
        } else {
            androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> bVar = this.animatable;
            if (bVar == null) {
                Integer num = this.initialOffset;
                kotlin.jvm.internal.l0.m(num);
                bVar = new androidx.compose.animation.core.b<>(num, androidx.compose.animation.core.k2.j(kotlin.jvm.internal.j0.f75314a), null, null, 12, null);
                this.animatable = bVar;
            }
            if (bVar.s().intValue() != i4) {
                kotlinx.coroutines.k.f(this.scope, null, null, new a(bVar, i4, null), 3, null);
            }
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, q22, height3, null, new b(arrayList, o0Var, this, i4, arrayList2, height3), 4, null);
    }

    @fg.m
    public final androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> f() {
        return this.animatable;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final kotlinx.coroutines.r0 getScope() {
        return this.scope;
    }

    public final void h(@fg.m androidx.compose.animation.core.b<Integer, androidx.compose.animation.core.o> bVar) {
        this.animatable = bVar;
    }
}
