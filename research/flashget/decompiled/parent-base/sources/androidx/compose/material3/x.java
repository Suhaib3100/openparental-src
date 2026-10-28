package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u001a\u0010\u001d\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "badge", "Landroidx/compose/ui/q;", "modifier", "content", "b", "(Lld/q;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/x1;", "a", "(Landroidx/compose/ui/q;JJLld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/unit/h;", "F", "u", "()F", "BadgeWithContentHorizontalPadding", "t", "BadgeWithContentHorizontalOffset", "c", "v", "BadgeWithContentVerticalOffset", "d", "s", "BadgeOffset", "", "layoutAbsoluteLeft", "layoutAbsoluteTop", "greatGrandParentAbsoluteRight", "greatGrandParentAbsoluteTop", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,239:1\n1116#2,6:240\n1116#2,6:246\n1116#2,6:252\n1116#2,6:258\n1116#2,6:264\n1116#2,6:270\n78#3,11:276\n78#3,11:309\n91#3:341\n78#3,11:349\n91#3:381\n91#3:386\n78#3,11:389\n91#3:421\n456#4,8:287\n464#4,3:301\n456#4,8:320\n464#4,3:334\n467#4,3:338\n456#4,8:360\n464#4,3:374\n467#4,3:378\n467#4,3:383\n456#4,8:400\n464#4,3:414\n467#4,3:418\n3737#5,6:295\n3737#5,6:328\n3737#5,6:368\n3737#5,6:408\n69#6,5:304\n74#6:337\n78#6:342\n68#6,6:343\n74#6:377\n78#6:382\n91#7,2:387\n93#7:417\n97#7:422\n76#8:423\n109#8,2:424\n76#8:426\n109#8,2:427\n76#8:429\n109#8,2:430\n76#8:432\n109#8,2:433\n154#9:435\n154#9:436\n154#9:438\n154#9:439\n64#10:437\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n*L\n73#1:240,6\n74#1:246,6\n77#1:252,6\n78#1:258,6\n93#1:264,6\n103#1:270,6\n80#1:276,11\n82#1:309,11\n82#1:341\n87#1:349,11\n87#1:381\n80#1:386\n193#1:389,11\n193#1:421\n80#1:287,8\n80#1:301,3\n82#1:320,8\n82#1:334,3\n82#1:338,3\n87#1:360,8\n87#1:374,3\n87#1:378,3\n80#1:383,3\n193#1:400,8\n193#1:414,3\n193#1:418,3\n80#1:295,6\n82#1:328,6\n87#1:368,6\n193#1:408,6\n82#1:304,5\n82#1:337\n82#1:342\n87#1:343,6\n87#1:377\n87#1:382\n193#1:387,2\n193#1:417\n193#1:422\n73#1:423\n73#1:424,2\n74#1:426\n74#1:427,2\n77#1:429\n77#1:430,2\n78#1:432\n78#1:433,2\n229#1:435\n233#1:436\n234#1:438\n238#1:439\n233#1:437\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    private static final float f15306b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f15307c;

    /* renamed from: a, reason: collision with root package name */
    private static final float f15305a = androidx.compose.ui.unit.h.g(4);

    /* renamed from: d, reason: collision with root package name */
    private static final float f15308d = 0;

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f15309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x1 f15310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.foundation.layout.x1 x1Var) {
            super(2);
            this.f15309b = qVar;
            this.f15310c = x1Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(719214594, i4, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:213)");
            }
            this.f15309b.R(this.f15310c, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15311b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15312c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15313d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f15314e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15315f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15316g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f15311b = qVar;
            this.f15312c = j4;
            this.f15313d = j5;
            this.f15314e = qVar2;
            this.f15315f = i4;
            this.f15316g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x.a(this.f15311b, this.f15312c, this.f15313d, this.f15314e, tVar, androidx.compose.runtime.g3.b(this.f15315f | 1), this.f15316g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "coordinates", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15318c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15319d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15320e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.h2 h2Var, androidx.compose.runtime.h2 h2Var2, androidx.compose.runtime.h2 h2Var3, androidx.compose.runtime.h2 h2Var4) {
            super(1);
            this.f15317b = h2Var;
            this.f15318c = h2Var2;
            this.f15319d = h2Var3;
            this.f15320e = h2Var4;
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            androidx.compose.ui.layout.u n02;
            x.n(this.f15317b, androidx.compose.ui.layout.v.c(uVar).t());
            this.f15318c.E(androidx.compose.ui.layout.v.c(uVar).getTop());
            androidx.compose.ui.layout.u n03 = uVar.n0();
            androidx.compose.ui.layout.u G = (n03 == null || (n02 = n03.n0()) == null) ? null : n02.G();
            if (G != null) {
                androidx.compose.runtime.h2 h2Var = this.f15319d;
                androidx.compose.runtime.h2 h2Var2 = this.f15320e;
                h2Var.E(androidx.compose.ui.layout.v.c(G).x());
                h2Var2.E(androidx.compose.ui.layout.v.c(G).getTop());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$3$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,239:1\n544#2,2:240\n33#2,6:242\n546#2:248\n544#2,2:249\n33#2,6:251\n546#2:257\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$3$1\n*L\n105#1:240,2\n105#1:242,6\n105#1:248\n111#1:249,2\n111#1:251,6\n111#1:257\n*E\n"})
    static final class d implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15323c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.h2 f15324d;

        /* compiled from: Badge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f15325b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.o0 f15326c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f15327d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.h2 f15328e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.h2 f15329f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.h2 f15330g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.h2 f15331h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.runtime.h2 h2Var, androidx.compose.runtime.h2 h2Var2, androidx.compose.runtime.h2 h2Var3, androidx.compose.runtime.h2 h2Var4) {
                super(1);
                this.f15325b = i1Var;
                this.f15326c = o0Var;
                this.f15327d = i1Var2;
                this.f15328e = h2Var;
                this.f15329f = h2Var2;
                this.f15330g = h2Var3;
                this.f15331h = h2Var4;
            }

            public final void a(@fg.l i1.a aVar) {
                boolean z4 = this.f15325b.getWidth() > this.f15326c.q2(c0.b.f36994a.h());
                float t4 = z4 ? x.t() : x.s();
                float v4 = z4 ? x.v() : x.s();
                i1.a.m(aVar, this.f15327d, 0, 0, 0.0f, 4, null);
                int q22 = this.f15326c.q2(t4) + this.f15327d.getWidth();
                int q23 = this.f15326c.q2(v4) + ((-this.f15325b.getHeight()) / 2);
                float o4 = x.o(this.f15328e) + q23;
                float b5 = this.f15330g.b() - ((this.f15329f.b() + q22) + this.f15325b.getWidth());
                float b6 = o4 - this.f15331h.b();
                if (b5 < 0.0f) {
                    q22 += kotlin.math.b.L0(b5);
                }
                int i4 = q22;
                if (b6 < 0.0f) {
                    q23 -= kotlin.math.b.L0(b6);
                }
                i1.a.m(aVar, this.f15325b, i4, q23, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        d(androidx.compose.runtime.h2 h2Var, androidx.compose.runtime.h2 h2Var2, androidx.compose.runtime.h2 h2Var3, androidx.compose.runtime.h2 h2Var4) {
            this.f15321a = h2Var;
            this.f15322b = h2Var2;
            this.f15323c = h2Var3;
            this.f15324d = h2Var4;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "badge")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null));
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "anchor")) {
                            androidx.compose.ui.layout.i1 m03 = l0Var2.m0(j4);
                            return o0Var.U3(m03.getWidth(), m03.getHeight(), kotlin.collections.z0.W(new kotlin.q0(androidx.compose.ui.layout.b.a(), Integer.valueOf(m03.q(androidx.compose.ui.layout.b.a()))), new kotlin.q0(androidx.compose.ui.layout.b.b(), Integer.valueOf(m03.q(androidx.compose.ui.layout.b.b())))), new a(m02, o0Var, m03, this.f15321a, this.f15322b, this.f15323c, this.f15324d));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.t, Integer, kotlin.k2> f15332b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15333c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.t, Integer, kotlin.k2> f15334d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15335e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15336f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, ld.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, int i4, int i5) {
            super(2);
            this.f15332b = qVar;
            this.f15333c = qVar2;
            this.f15334d = qVar3;
            this.f15335e = i4;
            this.f15336f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x.b(this.f15332b, this.f15333c, this.f15334d, tVar, androidx.compose.runtime.g3.b(this.f15335e | 1), this.f15336f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 6;
        f15306b = -f4;
        f15307c = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r17, long r18, long r20, @fg.m ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r22, @fg.m androidx.compose.runtime.t r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x.a(androidx.compose.ui.q, long, long, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0048  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r17, @fg.m androidx.compose.ui.q r18, @fg.l ld.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r19, @fg.m androidx.compose.runtime.t r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x.b(ld.q, androidx.compose.ui.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    private static final float c(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    private static final float d(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    private static final void e(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    private static final void f(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    private static final float g(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    private static final void h(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    private static final float i(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    private static final void j(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    public static final float k(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    public static final float l(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    public static final void m(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    public static final void n(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    public static final float o(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    public static final void p(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    public static final float q(androidx.compose.runtime.h2 h2Var) {
        return h2Var.b();
    }

    public static final void r(androidx.compose.runtime.h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    public static final float s() {
        return f15308d;
    }

    public static final float t() {
        return f15306b;
    }

    public static final float u() {
        return f15305a;
    }

    public static final float v() {
        return f15307c;
    }
}
