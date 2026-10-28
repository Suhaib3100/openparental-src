package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.gestures.t0;
import androidx.compose.foundation.i2;
import androidx.compose.foundation.j2;
import androidx.compose.foundation.layout.l1;
import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t3;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.k0;
import androidx.compose.ui.input.pointer.u0;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÖ\u0001\u0010&\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0083\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020*0(2\u0006\u0010\u0003\u001a\u00020\u000221\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$2#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/gestures/snapping/h;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/h;", "pageSpacing", "Landroidx/compose/foundation/pager/g;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/a;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "index", "", "key", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/v;", "page", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "pageContent", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/gestures/snapping/h;ZIFLandroidx/compose/foundation/pager/g;Landroidx/compose/ui/input/nestedscroll/a;Lld/l;Landroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Lld/r;Landroidx/compose/runtime/t;III)V", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/r;", "c", "(Landroidx/compose/foundation/pager/c0;Lld/r;Lld/l;Lld/a;Landroidx/compose/runtime/t;I)Lld/a;", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/pager/c0;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,328:1\n154#2:329\n1116#3,6:330\n1116#3,6:336\n1116#3,6:344\n1116#3,6:351\n1116#3,6:362\n50#4:342\n49#4:343\n36#4:350\n83#4,3:359\n74#5:357\n74#5:358\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n83#1:329\n108#1:330,6\n122#1:336,6\n125#1:344,6\n135#1:351,6\n251#1:362,6\n125#1:342\n125#1:343\n135#1:350\n251#1:359,3\n156#1:357\n164#1:358\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6658c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f6659d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6660e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0 f6661f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.snapping.h f6662g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6663h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6664i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f6665j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.pager.g f6666k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.nestedscroll.a f6667l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Object> f6668m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ c.b f6669n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6670o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> f6671p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f6672q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f6673r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f6674s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, j0 j0Var, androidx.compose.foundation.gestures.snapping.h hVar, boolean z5, int i4, float f4, androidx.compose.foundation.pager.g gVar, androidx.compose.ui.input.nestedscroll.a aVar, ld.l<? super Integer, ? extends Object> lVar, c.b bVar, c.InterfaceC0326c interfaceC0326c, ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, int i5, int i6, int i7) {
            super(2);
            this.f6657b = qVar;
            this.f6658c = c0Var;
            this.f6659d = l1Var;
            this.f6660e = z4;
            this.f6661f = j0Var;
            this.f6662g = hVar;
            this.f6663h = z5;
            this.f6664i = i4;
            this.f6665j = f4;
            this.f6666k = gVar;
            this.f6667l = aVar;
            this.f6668m = lVar;
            this.f6669n = bVar;
            this.f6670o = interfaceC0326c;
            this.f6671p = rVar;
            this.f6672q = i5;
            this.f6673r = i6;
            this.f6674s = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b.a(this.f6657b, this.f6658c, this.f6659d, this.f6660e, this.f6661f, this.f6662g, this.f6663h, this.f6664i, this.f6665j, this.f6666k, this.f6667l, this.f6668m, this.f6669n, this.f6670o, this.f6671p, tVar, g3.b(this.f6672q | 1), g3.b(this.f6673r), this.f6674s);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.pager.b$b, reason: collision with other inner class name */
    static final class C0116b extends n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f6675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0116b(c0 c0Var) {
            super(0);
            this.f6675b = c0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f6675b.K());
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f6676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var) {
            super(0);
            this.f6676b = c0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f6676b.K());
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6677b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6678c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f6679d;

        /* compiled from: LazyLayoutPager.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f6680b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f6681c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c0 f6682d;

            /* compiled from: LazyLayoutPager.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {277, 281}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,328:1\n86#2,2:329\n33#2,6:331\n88#2:337\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n*L\n282#1:329,2\n282#1:331,6\n282#1:337\n*E\n"})
            /* renamed from: androidx.compose.foundation.pager.b$d$a$a, reason: collision with other inner class name */
            static final class C0117a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f6683c;

                /* renamed from: d, reason: collision with root package name */
                Object f6684d;

                /* renamed from: e, reason: collision with root package name */
                int f6685e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f6686f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ c0 f6687g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0117a(c0 c0Var, kotlin.coroutines.d<? super C0117a> dVar) {
                    super(2, dVar);
                    this.f6687g = c0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0117a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0117a c0117a = new C0117a(this.f6687g, dVar);
                    c0117a.f6686f = obj;
                    return c0117a;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:6:0x0069). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
                    /*
                        r10 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r10.f6685e
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L2d
                        if (r1 == r4) goto L25
                        if (r1 != r2) goto L1d
                        java.lang.Object r1 = r10.f6684d
                        androidx.compose.ui.input.pointer.b0 r1 = (androidx.compose.ui.input.pointer.b0) r1
                        java.lang.Object r4 = r10.f6683c
                        androidx.compose.ui.input.pointer.b0 r4 = (androidx.compose.ui.input.pointer.b0) r4
                        java.lang.Object r5 = r10.f6686f
                        androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                        kotlin.a1.n(r11)
                        goto L69
                    L1d:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L25:
                        java.lang.Object r1 = r10.f6686f
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                        kotlin.a1.n(r11)
                        goto L42
                    L2d:
                        kotlin.a1.n(r11)
                        java.lang.Object r11 = r10.f6686f
                        r1 = r11
                        androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                        androidx.compose.ui.input.pointer.r r11 = androidx.compose.ui.input.pointer.r.Initial
                        r10.f6686f = r1
                        r10.f6685e = r4
                        java.lang.Object r11 = androidx.compose.foundation.gestures.z0.d(r1, r3, r11, r10)
                        if (r11 != r0) goto L42
                        return r0
                    L42:
                        androidx.compose.ui.input.pointer.b0 r11 = (androidx.compose.ui.input.pointer.b0) r11
                        androidx.compose.foundation.pager.c0 r4 = r10.f6687g
                        i0.f$a r5 = i0.f.INSTANCE
                        r5.getClass()
                        long r5 = i0.f.c()
                        r4.x0(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L56:
                        if (r1 != 0) goto L92
                        androidx.compose.ui.input.pointer.r r11 = androidx.compose.ui.input.pointer.r.Initial
                        r10.f6686f = r5
                        r10.f6683c = r4
                        r10.f6684d = r1
                        r10.f6685e = r2
                        java.lang.Object r11 = r5.u3(r11, r10)
                        if (r11 != r0) goto L69
                        return r0
                    L69:
                        androidx.compose.ui.input.pointer.p r11 = (androidx.compose.ui.input.pointer.p) r11
                        java.util.List r6 = r11.e()
                        int r7 = r6.size()
                        r8 = r3
                    L74:
                        if (r8 >= r7) goto L86
                        java.lang.Object r9 = r6.get(r8)
                        androidx.compose.ui.input.pointer.b0 r9 = (androidx.compose.ui.input.pointer.b0) r9
                        boolean r9 = androidx.compose.ui.input.pointer.q.d(r9)
                        if (r9 != 0) goto L83
                        goto L56
                    L83:
                        int r8 = r8 + 1
                        goto L74
                    L86:
                        java.util.List r11 = r11.e()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        androidx.compose.ui.input.pointer.b0 r1 = (androidx.compose.ui.input.pointer.b0) r1
                        goto L56
                    L92:
                        androidx.compose.foundation.pager.c0 r11 = r10.f6687g
                        long r0 = r1.getPosition()
                        long r2 = r4.getPosition()
                        long r0 = i0.f.u(r0, r2)
                        r11.x0(r0)
                        kotlin.k2 r11 = kotlin.k2.f75408a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.b.d.a.C0117a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f6681c = k0Var;
                this.f6682d = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f6681c, this.f6682d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f6680b;
                if (i4 == 0) {
                    a1.n(obj);
                    k0 k0Var = this.f6681c;
                    C0117a c0117a = new C0117a(this.f6682d, null);
                    this.f6680b = 1;
                    if (androidx.compose.foundation.gestures.f0.d(k0Var, c0117a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0 c0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f6679d = c0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f6679d, dVar);
            dVar2.f6678c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6677b;
            if (i4 == 0) {
                a1.n(obj);
                a aVar2 = new a((k0) this.f6678c, this.f6679d, null);
                this.f6677b = 1;
                if (s0.g(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/pager/p;", "a", "()Landroidx/compose/foundation/pager/p;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<p> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2>> f6688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<Integer, Object>> f6689c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<Integer> f6690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(b5<? extends ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var, b5<? extends ld.l<? super Integer, ? extends Object>> b5Var2, ld.a<Integer> aVar) {
            super(0);
            this.f6688b = b5Var;
            this.f6689c = b5Var2;
            this.f6690d = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p(this.f6688b.getValue(), this.f6689c.getValue(), this.f6690d.invoke().intValue());
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/pager/r;", "a", "()Landroidx/compose/foundation/pager/r;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<r> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<p> f6691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b5<p> b5Var, c0 c0Var) {
            super(0);
            this.f6691b = b5Var;
            this.f6692c = c0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            p value = this.f6691b.getValue();
            return new r(this.f6692c, value, new m0(this.f6692c.G(), value));
        }
    }

    @z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.q qVar, @fg.l c0 c0Var, @fg.l l1 l1Var, boolean z4, @fg.l j0 j0Var, @fg.l androidx.compose.foundation.gestures.snapping.h hVar, boolean z5, int i4, float f4, @fg.l androidx.compose.foundation.pager.g gVar, @fg.l androidx.compose.ui.input.nestedscroll.a aVar, @fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l c.b bVar, @fg.l c.InterfaceC0326c interfaceC0326c, @fg.l ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6, int i7) {
        androidx.compose.runtime.t o4 = tVar.o(-301644943);
        int i10 = (i7 & 128) != 0 ? 0 : i4;
        float g4 = (i7 & 256) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-301644943, i5, i6, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:95)");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("beyondBoundsPageCount should be greater than or equal to 0, you selected ", i10).toString());
        }
        androidx.compose.foundation.gestures.r0 r0Var = androidx.compose.foundation.gestures.r0.f4232a;
        i2 c5 = r0Var.c(o4, 6);
        o4.P(1320096574);
        boolean q02 = o4.q0(c0Var);
        Object Q = o4.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c(c0Var);
            o4.E(Q);
        }
        o4.p0();
        int i11 = i5 >> 3;
        int i12 = i11 & 14;
        ld.a<r> c6 = c(c0Var, rVar, lVar, (ld.a) Q, o4, i12 | ((i6 >> 9) & 112) | ((i6 << 3) & 896));
        androidx.compose.foundation.gestures.snapping.l n4 = f0.n();
        o4.P(1320097128);
        boolean q03 = o4.q0(c0Var);
        Object Q2 = o4.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new C0116b(c0Var);
            o4.E(Q2);
        }
        o4.p0();
        int i13 = i5 & 7168;
        int i14 = i5 >> 6;
        int i15 = i6 << 18;
        int i16 = i10;
        ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> c7 = t.c(c6, c0Var, l1Var, z4, j0Var, i10, g4, gVar, bVar, interfaceC0326c, n4, (ld.a) Q2, o4, (65520 & i5) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (234881024 & i15) | (i15 & 1879048192), 0);
        o4.P(511388516);
        boolean q04 = o4.q0(hVar) | o4.q0(c0Var);
        Object Q3 = o4.Q();
        if (q04 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q3 = new g0(hVar, c0Var);
            o4.E(Q3);
        }
        o4.p0();
        g0 g0Var = (g0) Q3;
        androidx.compose.foundation.lazy.layout.g0 a5 = z.a(c0Var, z4, j0Var == j0.Vertical, o4, i12 | (i14 & 112));
        o4.P(1157296644);
        boolean q05 = o4.q0(c0Var);
        Object Q4 = o4.Q();
        if (q05 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q4 = new j(c0Var);
            o4.E(Q4);
        }
        o4.p0();
        androidx.compose.foundation.lazy.layout.w.b(c6, androidx.compose.ui.input.nestedscroll.c.b(b(t0.j(j2.a(androidx.compose.foundation.lazy.layout.m.b(androidx.compose.foundation.m0.a(h0.a(qVar.w3(c0Var.getRemeasurementModifier()).w3(c0Var.getAwaitLayoutModifier()), c6, a5, j0Var, z5, z4, o4, (i11 & 7168) | (i14 & 57344) | ((i5 << 6) & 458752)), j0Var), h.a(c0Var, i16, o4, i12 | ((i5 >> 18) & 112)), c0Var.getBeyondBoundsInfo(), z4, (androidx.compose.ui.unit.w) o4.x(h1.p()), j0Var, z5, o4, (androidx.compose.runtime.collection.g.f16132e << 6) | i13 | ((i5 << 3) & 458752) | (i5 & 3670016)), c5), c0Var, j0Var, c5, z5, r0Var.d((androidx.compose.ui.unit.w) o4.x(h1.p()), j0Var, z4), g0Var, c0Var.getInternalInteractionSource(), (j) Q4), c0Var), aVar, null, 2, null), c0Var.getPrefetchState(), c7, o4, 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(qVar, c0Var, l1Var, z4, j0Var, hVar, z5, i16, g4, gVar, aVar, lVar, bVar, interfaceC0326c, rVar, i5, i6, i7));
        }
    }

    private static final androidx.compose.ui.q b(androidx.compose.ui.q qVar, c0 c0Var) {
        return qVar.w3(u0.e(androidx.compose.ui.q.INSTANCE, c0Var, new d(c0Var, null)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    private static final ld.a<r> c(c0 c0Var, ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, ld.l<? super Integer, ? extends Object> lVar, ld.a<Integer> aVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1372505274);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1372505274, i4, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:247)");
        }
        b5 u4 = o4.u(rVar, tVar, (i4 >> 3) & 14);
        b5 u5 = o4.u(lVar, tVar, (i4 >> 6) & 14);
        Object[] objArr = {c0Var, u4, u5, aVar};
        tVar.P(-568225417);
        boolean z4 = false;
        for (int i5 = 0; i5 < 4; i5++) {
            z4 |= tVar.q0(objArr[i5]);
        }
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e1(o4.d(o4.t(), new g(o4.d(o4.t(), new f(u4, u5, aVar)), c0Var))) { // from class: androidx.compose.foundation.pager.b.e
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((b5) this.receiver).getValue();
                }
            };
            tVar.E(Q);
        }
        tVar.p0();
        kotlin.reflect.p pVar = (kotlin.reflect.p) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pVar;
    }
}
