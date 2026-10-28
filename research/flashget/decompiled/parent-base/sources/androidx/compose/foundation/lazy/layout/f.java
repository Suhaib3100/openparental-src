package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q0;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyAnimateScroll.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\u0010\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lkotlin/k2;", "e", "(Lld/a;)V", "Landroidx/compose/foundation/lazy/layout/g;", "", "index", "", "f", "(Landroidx/compose/foundation/lazy/layout/g;I)Z", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/d;", "density", "d", "(Landroidx/compose/foundation/lazy/layout/g;IIILandroidx/compose/ui/unit/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/h;", "a", "F", "TargetDistance", "b", "BoundDistance", "c", "MinimumDistance", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,317:1\n154#2:318\n154#2:319\n154#2:320\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n35#1:318\n36#1:319\n37#1:320\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final float f5962a = androidx.compose.ui.unit.h.g(com.android.volley.g.f40879e);

    /* renamed from: b, reason: collision with root package name */
    private static final float f5963b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* renamed from: c, reason: collision with root package name */
    private static final float f5964c = 50;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f5965d = false;

    /* compiled from: LazyAnimateScroll.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {182, 280}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n1#2:318\n41#3,4:319\n41#3,4:323\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n174#1:319,4\n277#1:323,4\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f5966b;

        /* renamed from: c, reason: collision with root package name */
        Object f5967c;

        /* renamed from: d, reason: collision with root package name */
        Object f5968d;

        /* renamed from: e, reason: collision with root package name */
        float f5969e;

        /* renamed from: f, reason: collision with root package name */
        float f5970f;

        /* renamed from: g, reason: collision with root package name */
        float f5971g;

        /* renamed from: h, reason: collision with root package name */
        int f5972h;

        /* renamed from: i, reason: collision with root package name */
        int f5973i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f5974j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5975k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f5976l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f5977m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f5978n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f5979o;

        /* compiled from: LazyAnimateScroll.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n41#2,4:326\n41#2,4:330\n41#2,4:334\n41#2,4:338\n41#2,4:342\n41#2,4:346\n41#2,4:350\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n195#1:318,4\n201#1:322,4\n204#1:326,4\n212#1:330,4\n217#1:334,4\n228#1:338,4\n240#1:342,4\n253#1:346,4\n264#1:350,4\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.f$a$a, reason: collision with other inner class name */
        static final class C0107a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f5980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f5981c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f5982d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k1.e f5983e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0 f5984f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ k1.a f5985g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f5986h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f5987i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ k1.f f5988j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f5989k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f5990l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ k1.h<androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o>> f5991m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0107a(g gVar, int i4, float f4, k1.e eVar, q0 q0Var, k1.a aVar, boolean z4, float f5, k1.f fVar, int i5, int i6, k1.h<androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o>> hVar) {
                super(1);
                this.f5980b = gVar;
                this.f5981c = i4;
                this.f5982d = f4;
                this.f5983e = eVar;
                this.f5984f = q0Var;
                this.f5985g = aVar;
                this.f5986h = z4;
                this.f5987i = f5;
                this.f5988j = fVar;
                this.f5989k = i5;
                this.f5990l = i6;
                this.f5991m = hVar;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                if (!f.f(this.f5980b, this.f5981c)) {
                    float A = (this.f5982d > 0.0f ? kotlin.ranges.s.A(jVar.g().floatValue(), this.f5982d) : kotlin.ranges.s.t(jVar.g().floatValue(), this.f5982d)) - this.f5983e.f75326b;
                    float a5 = this.f5984f.a(A);
                    if (!f.f(this.f5980b, this.f5981c) && !a.m(this.f5986h, this.f5980b, this.f5981c, this.f5990l)) {
                        if (A != a5) {
                            jVar.a();
                            this.f5985g.f75322b = false;
                            return;
                        }
                        this.f5983e.f75326b += A;
                        if (this.f5986h) {
                            if (jVar.g().floatValue() > this.f5987i) {
                                jVar.a();
                            }
                        } else if (jVar.g().floatValue() < (-this.f5987i)) {
                            jVar.a();
                        }
                        if (this.f5986h) {
                            if (this.f5988j.f75327b >= 2) {
                                int g4 = this.f5981c - this.f5980b.g();
                                int i4 = this.f5989k;
                                if (g4 > i4) {
                                    this.f5980b.f(this.f5984f, this.f5981c - i4, 0);
                                }
                            }
                        } else if (this.f5988j.f75327b >= 2) {
                            int d5 = this.f5980b.d();
                            int i5 = this.f5981c;
                            int i6 = d5 - i5;
                            int i7 = this.f5989k;
                            if (i6 > i7) {
                                this.f5980b.f(this.f5984f, i5 + i7, 0);
                            }
                        }
                    }
                }
                if (!a.m(this.f5986h, this.f5980b, this.f5981c, this.f5990l)) {
                    if (f.f(this.f5980b, this.f5981c)) {
                        throw new e(this.f5980b.i(this.f5981c), this.f5991m.f75329b);
                    }
                } else {
                    this.f5980b.f(this.f5984f, this.f5981c, this.f5990l);
                    this.f5985g.f75322b = false;
                    jVar.a();
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* compiled from: LazyAnimateScroll.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n295#1:318,4\n300#1:322,4\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f5992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.e f5993c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q0 f5994d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f4, k1.e eVar, q0 q0Var) {
                super(1);
                this.f5992b = f4;
                this.f5993c = eVar;
                this.f5994d = q0Var;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                float f4 = this.f5992b;
                float f5 = 0.0f;
                if (f4 > 0.0f) {
                    f5 = kotlin.ranges.s.A(jVar.g().floatValue(), this.f5992b);
                } else if (f4 < 0.0f) {
                    f5 = kotlin.ranges.s.t(jVar.g().floatValue(), this.f5992b);
                }
                float f6 = f5 - this.f5993c.f75326b;
                if (f6 != this.f5994d.a(f6) || f5 != jVar.g().floatValue()) {
                    jVar.a();
                }
                this.f5993c.f75326b += f6;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, androidx.compose.ui.unit.d dVar, g gVar, int i5, int i6, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f5975k = i4;
            this.f5976l = dVar;
            this.f5977m = gVar;
            this.f5978n = i5;
            this.f5979o = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(boolean z4, g gVar, int i4, int i5) {
            if (z4) {
                if (gVar.d() <= i4 && (gVar.d() != i4 || gVar.c() <= i5)) {
                    return false;
                }
            } else if (gVar.d() >= i4 && (gVar.d() != i4 || gVar.c() >= i5)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f5975k, this.f5976l, this.f5977m, this.f5978n, this.f5979o, dVar);
            aVar.f5974j = obj;
            return aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[Catch: e -> 0x00f2, TryCatch #1 {e -> 0x00f2, blocks: (B:20:0x00c7, B:22:0x00cb, B:24:0x00d3, B:26:0x00e5, B:29:0x00fb, B:32:0x0138), top: B:19:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e5 A[Catch: e -> 0x00f2, TryCatch #1 {e -> 0x00f2, blocks: (B:20:0x00c7, B:22:0x00cb, B:24:0x00d3, B:26:0x00e5, B:29:0x00fb, B:32:0x0138), top: B:19:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0197 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x022b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
        /* JADX WARN: Type inference failed for: r2v19, types: [T, androidx.compose.animation.core.m] */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, androidx.compose.animation.core.m] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0198 -> B:16:0x01a0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 587
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @fg.m
    public static final Object d(@fg.l g gVar, int i4, int i5, int i6, @fg.l androidx.compose.ui.unit.d dVar, @fg.l kotlin.coroutines.d<? super k2> dVar2) {
        Object h4 = gVar.h(new a(i4, dVar, gVar, i5, i6, null), dVar2);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
    }

    private static final void e(ld.a<String> aVar) {
    }

    public static final boolean f(@fg.l g gVar, int i4) {
        return i4 <= gVar.g() && gVar.d() <= i4;
    }
}
