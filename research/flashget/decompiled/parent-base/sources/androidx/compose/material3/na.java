package androidx.compose.material3;

import androidx.compose.runtime.t;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.profileinstaller.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0090\u0001\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011\u001an\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a~\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a¤\u0001\u0010 \u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a¤\u0001\u0010\"\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010!\u001a\u009a\u0001\u0010#\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a \u0001\u0010%\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/ia;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "b", "(ILandroidx/compose/ui/q;JJLld/q;Lld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "f", "", "Landroidx/compose/material3/ka;", "Lkotlin/r0;", "name", "tabPositions", "g", "h", "(Landroidx/compose/ui/q;JJLld/q;Lld/p;Lld/p;Landroidx/compose/runtime/t;I)V", "i", "Landroidx/compose/foundation/w2;", "scrollState", "Landroidx/compose/ui/unit/h;", "edgePadding", "a", "(ILandroidx/compose/ui/q;Landroidx/compose/foundation/w2;JJFLld/q;Lld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "e", "c", "(ILandroidx/compose/ui/q;JJFLld/q;Lld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "d", "(ILld/q;Landroidx/compose/ui/q;JJFLld/p;Lld/p;Landroidx/compose/foundation/w2;Landroidx/compose/runtime/t;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Landroidx/compose/animation/core/k;", "", "Landroidx/compose/animation/core/k;", "ScrollableTabRowScrollSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n154#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1214#1:1224\n*E\n"})
/* loaded from: classes.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12746a = androidx.compose.ui.unit.h.g(90);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.k<Float> f12747b = androidx.compose.animation.core.l.r(250, 0, androidx.compose.animation.core.m0.d(), 2, null);

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1223:1\n81#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1\n*L\n684#1:1224\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<List<? extends ka>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(3);
            this.f12748b = i4;
        }

        private static final float b(androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var) {
            return b5Var.getValue().u();
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(List<? extends ka> list, androidx.compose.runtime.t tVar, Integer num) {
            a(list, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l List<ka> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(438091970, i4, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:682)");
            }
            if (this.f12748b < list.size()) {
                androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c5 = androidx.compose.animation.core.d.c(list.get(this.f12748b).getContentWidth(), null, null, null, tVar, 0, 14);
                ma maVar = ma.f12561a;
                maVar.b(maVar.m(androidx.compose.ui.q.INSTANCE, list.get(this.f12748b)), b(c5), 0.0f, 0L, null, tVar, o.c.f32821k, 28);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f12751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12754g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12755h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12756i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12757j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12758k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i4, androidx.compose.ui.q qVar, androidx.compose.foundation.w2 w2Var, long j4, long j5, float f4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12749b = i4;
            this.f12750c = qVar;
            this.f12751d = w2Var;
            this.f12752e = j4;
            this.f12753f = j5;
            this.f12754g = f4;
            this.f12755h = qVar2;
            this.f12756i = pVar;
            this.f12757j = pVar2;
            this.f12758k = i5;
            this.f12759l = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.a(this.f12749b, this.f12750c, this.f12751d, this.f12752e, this.f12753f, this.f12754g, this.f12755h, this.f12756i, this.f12757j, tVar, androidx.compose.runtime.g3.b(this.f12758k | 1), this.f12759l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4) {
            super(3);
            this.f12760b = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(ia iaVar, androidx.compose.runtime.t tVar, Integer num) {
            a(iaVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l ia iaVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = ((i4 & 8) == 0 ? tVar.q0(iaVar) : tVar.S(iaVar) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2021049253, i5, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:153)");
            }
            ma maVar = ma.f12561a;
            androidx.compose.ui.q c5 = iaVar.c(androidx.compose.ui.q.INSTANCE, this.f12760b, true);
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            maVar.b(c5, androidx.compose.ui.unit.h.f21501f, 0.0f, 0L, null, tVar, 196656, 28);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12764e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> f12765f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12766g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12767h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12768i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12769j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(int i4, androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12761b = i4;
            this.f12762c = qVar;
            this.f12763d = j4;
            this.f12764e = j5;
            this.f12765f = qVar2;
            this.f12766g = pVar;
            this.f12767h = pVar2;
            this.f12768i = i5;
            this.f12769j = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.b(this.f12761b, this.f12762c, this.f12763d, this.f12764e, this.f12765f, this.f12766g, this.f12767h, tVar, androidx.compose.runtime.g3.b(this.f12768i | 1), this.f12769j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<List<? extends ka>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i4) {
            super(3);
            this.f12770b = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(List<? extends ka> list, androidx.compose.runtime.t tVar, Integer num) {
            a(list, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l List<ka> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-913748678, i4, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:820)");
            }
            ma maVar = ma.f12561a;
            maVar.c(maVar.m(androidx.compose.ui.q.INSTANCE, list.get(this.f12770b)), 0.0f, 0L, tVar, 3072, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12772c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12773d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12774e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f12775f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12776g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12777h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12778i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12779j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12780k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(int i4, androidx.compose.ui.q qVar, long j4, long j5, float f4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12771b = i4;
            this.f12772c = qVar;
            this.f12773d = j4;
            this.f12774e = j5;
            this.f12775f = f4;
            this.f12776g = qVar2;
            this.f12777h = pVar;
            this.f12778i = pVar2;
            this.f12779j = i5;
            this.f12780k = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.c(this.f12771b, this.f12772c, this.f12773d, this.f12774e, this.f12775f, this.f12776g, this.f12777h, this.f12778i, tVar, androidx.compose.runtime.g3.b(this.f12779j | 1), this.f12780k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1223:1\n487#2,4:1224\n491#2,2:1232\n495#2:1238\n25#3:1228\n1116#4,3:1229\n1119#4,3:1235\n1116#4,6:1239\n1116#4,6:1245\n487#5:1234\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1\n*L\n862#1:1224,4\n862#1:1232,2\n862#1:1238\n862#1:1228\n862#1:1229,3\n862#1:1235,3\n863#1:1239,6\n876#1:1245,6\n862#1:1234\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f12781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f12782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12784e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12785f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12786g;

        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n33#2,4:1235\n38#2:1241\n256#2,3:1242\n33#2,4:1245\n259#2,2:1249\n38#2:1251\n261#2:1252\n92#3:1239\n58#3:1240\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n*L\n882#1:1224,3\n882#1:1227,4\n882#1:1231,2\n882#1:1233\n882#1:1234\n894#1:1235,4\n894#1:1241\n906#1:1242,3\n906#1:1245,4\n906#1:1249,2\n906#1:1251\n906#1:1252\n901#1:1239\n901#1:1240\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f12787b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12788c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12789d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ i8 f12790e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f12791f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12792g;

            /* compiled from: TabRow.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2\n*L\n915#1:1224,6\n929#1:1230,6\n944#1:1236,6\n*E\n"})
            /* renamed from: androidx.compose.material3.na$g$a$a, reason: collision with other inner class name */
            static final class C0279a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f12793b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f12794c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.s1 f12795d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12796e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ i8 f12797f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ int f12798g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.unit.h> f12799h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ long f12800i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ int f12801j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f12802k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12803l;

                /* compiled from: TabRow.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.na$g$a$a$a, reason: collision with other inner class name */
                static final class C0280a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12804b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ List<ka> f12805c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0280a(ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, List<ka> list) {
                        super(2);
                        this.f12804b = qVar;
                        this.f12805c = list;
                    }

                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(358596038, i4, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:942)");
                        }
                        this.f12804b.R(this.f12805c, tVar, 0);
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0279a(int i4, List<androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.s1 s1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, i8 i8Var, int i5, List<androidx.compose.ui.unit.h> list2, long j4, int i6, int i7, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                    super(1);
                    this.f12793b = i4;
                    this.f12794c = list;
                    this.f12795d = s1Var;
                    this.f12796e = pVar;
                    this.f12797f = i8Var;
                    this.f12798g = i5;
                    this.f12799h = list2;
                    this.f12800i = j4;
                    this.f12801j = i6;
                    this.f12802k = i7;
                    this.f12803l = qVar;
                }

                public final void a(@fg.l i1.a aVar) {
                    ArrayList arrayList = new ArrayList();
                    int i4 = this.f12793b;
                    List<androidx.compose.ui.layout.i1> list = this.f12794c;
                    androidx.compose.ui.layout.s1 s1Var = this.f12795d;
                    List<androidx.compose.ui.unit.h> list2 = this.f12799h;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        androidx.compose.ui.layout.i1 i1Var = list.get(i5);
                        i1.a.m(aVar, i1Var, i4, 0, 0.0f, 4, null);
                        arrayList.add(new ka(s1Var.R(i4), s1Var.R(i1Var.getWidth()), list2.get(i5).u(), null));
                        i4 += i1Var.getWidth();
                    }
                    List<androidx.compose.ui.layout.l0> E2 = this.f12795d.E2(oa.Divider, this.f12796e);
                    long j4 = this.f12800i;
                    int i6 = this.f12801j;
                    int i7 = this.f12802k;
                    int i10 = 0;
                    for (int size2 = E2.size(); i10 < size2; size2 = size2) {
                        androidx.compose.ui.layout.i1 m02 = E2.get(i10).m0(androidx.compose.ui.unit.b.e(j4, i6, i6, 0, 0, 8, null));
                        i1.a.m(aVar, m02, 0, i7 - m02.getHeight(), 0.0f, 4, null);
                        i10++;
                    }
                    List<androidx.compose.ui.layout.l0> E22 = this.f12795d.E2(oa.Indicator, new androidx.compose.runtime.internal.b(358596038, true, new C0280a(this.f12803l, arrayList)));
                    int i11 = this.f12801j;
                    int i12 = this.f12802k;
                    int size3 = E22.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        i1.a.m(aVar, E22.get(i13).m0(androidx.compose.ui.unit.b.INSTANCE.c(i11, i12)), 0, 0, 0.0f, 4, null);
                    }
                    this.f12797f.c(this.f12795d, this.f12793b, arrayList, this.f12798g);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                    a(aVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, i8 i8Var, int i4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                super(2);
                this.f12787b = f4;
                this.f12788c = pVar;
                this.f12789d = pVar2;
                this.f12790e = i8Var;
                this.f12791f = i4;
                this.f12792g = qVar;
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
                int q22 = s1Var.q2(na.f12746a);
                int q23 = s1Var.q2(this.f12787b);
                List<androidx.compose.ui.layout.l0> E2 = s1Var.E2(oa.Tabs, this.f12788c);
                Integer num = 0;
                int size = E2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    num = Integer.valueOf(Math.max(num.intValue(), E2.get(i4).t(Integer.MAX_VALUE)));
                }
                int intValue = num.intValue();
                long e4 = androidx.compose.ui.unit.b.e(j4, q22, 0, intValue, intValue, 2, null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size2 = E2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    androidx.compose.ui.layout.l0 l0Var = E2.get(i5);
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(e4);
                    float R = s1Var.R(Math.min(l0Var.l0(m02.getHeight()), m02.getWidth())) - androidx.compose.ui.unit.h.g(ja.o() * 2);
                    arrayList.add(m02);
                    arrayList2.add(androidx.compose.ui.unit.h.d(R));
                }
                Integer valueOf = Integer.valueOf(q23 * 2);
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    valueOf = Integer.valueOf(((androidx.compose.ui.layout.i1) arrayList.get(i6)).getWidth() + valueOf.intValue());
                }
                int intValue2 = valueOf.intValue();
                return androidx.compose.ui.layout.o0.x2(s1Var, intValue2, intValue, null, new C0279a(q23, arrayList, s1Var, this.f12789d, this.f12790e, this.f12791f, arrayList2, j4, intValue2, intValue, this.f12792g), 4, null);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
                return a(s1Var, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.foundation.w2 w2Var, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, int i4) {
            super(2);
            this.f12781b = w2Var;
            this.f12782c = f4;
            this.f12783d = pVar;
            this.f12784e = pVar2;
            this.f12785f = qVar;
            this.f12786g = i4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1178901494, i4, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous> (TabRow.kt:861)");
            }
            Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            tVar.p0();
            tVar.P(121290627);
            boolean q02 = tVar.q0(this.f12781b) | tVar.q0(coroutineScope);
            androidx.compose.foundation.w2 w2Var = this.f12781b;
            Object Q = tVar.Q();
            if (q02 || Q == companion.a()) {
                Q = new i8(w2Var, coroutineScope);
                tVar.E(Q);
            }
            i8 i8Var = (i8) Q;
            tVar.p0();
            androidx.compose.ui.q b5 = androidx.compose.ui.draw.h.b(androidx.compose.foundation.selection.a.a(androidx.compose.foundation.v2.b(androidx.compose.foundation.layout.c2.H(androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), this.f12781b, false, null, false, 14, null)));
            tVar.P(121291080);
            boolean d5 = tVar.d(this.f12782c) | tVar.q0(this.f12783d) | tVar.q0(this.f12784e) | tVar.q0(this.f12785f) | tVar.S(i8Var) | tVar.f(this.f12786g);
            float f4 = this.f12782c;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12783d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12784e;
            int i5 = this.f12786g;
            ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12785f;
            Object Q2 = tVar.Q();
            if (d5 || Q2 == companion.a()) {
                Q2 = new a(f4, pVar, pVar2, i8Var, i5, qVar);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.layout.q1.a(b5, (ld.p) Q2, tVar, 0, 0);
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

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12809e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12810f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12811g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12812h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12813i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f12814j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12815k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12816l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(int i4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, long j4, long j5, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.foundation.w2 w2Var, int i5, int i6) {
            super(2);
            this.f12806b = i4;
            this.f12807c = qVar;
            this.f12808d = qVar2;
            this.f12809e = j4;
            this.f12810f = j5;
            this.f12811g = f4;
            this.f12812h = pVar;
            this.f12813i = pVar2;
            this.f12814j = w2Var;
            this.f12815k = i5;
            this.f12816l = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.d(this.f12806b, this.f12807c, this.f12808d, this.f12809e, this.f12810f, this.f12811g, this.f12812h, this.f12813i, this.f12814j, tVar, androidx.compose.runtime.g3.b(this.f12815k | 1), this.f12816l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.q<List<? extends ka>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i4) {
            super(3);
            this.f12817b = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(List<? extends ka> list, androidx.compose.runtime.t tVar, Integer num) {
            a(list, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l List<ka> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-115843248, i4, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:754)");
            }
            ma maVar = ma.f12561a;
            maVar.c(maVar.m(androidx.compose.ui.q.INSTANCE, list.get(this.f12817b)), 0.0f, 0L, tVar, 3072, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f12820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12821e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12822f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f12823g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12824h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12825i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12826j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12827k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(int i4, androidx.compose.ui.q qVar, androidx.compose.foundation.w2 w2Var, long j4, long j5, float f4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12818b = i4;
            this.f12819c = qVar;
            this.f12820d = w2Var;
            this.f12821e = j4;
            this.f12822f = j5;
            this.f12823g = f4;
            this.f12824h = qVar2;
            this.f12825i = pVar;
            this.f12826j = pVar2;
            this.f12827k = i5;
            this.f12828l = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.e(this.f12818b, this.f12819c, this.f12820d, this.f12821e, this.f12822f, this.f12823g, this.f12824h, this.f12825i, this.f12826j, tVar, androidx.compose.runtime.g3.b(this.f12827k | 1), this.f12828l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12829b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i4) {
            super(3);
            this.f12829b = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(ia iaVar, androidx.compose.runtime.t tVar, Integer num) {
            a(iaVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l ia iaVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= (i4 & 8) == 0 ? tVar.q0(iaVar) : tVar.S(iaVar) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(286693261, i4, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:210)");
            }
            ma.f12561a.c(iaVar.c(androidx.compose.ui.q.INSTANCE, this.f12829b, false), 0.0f, 0L, tVar, 3072, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12831c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12832d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12833e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> f12834f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12835g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12836h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12837i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12838j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(int i4, androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12830b = i4;
            this.f12831c = qVar;
            this.f12832d = j4;
            this.f12833e = j5;
            this.f12834f = qVar2;
            this.f12835g = pVar;
            this.f12836h = pVar2;
            this.f12837i = i5;
            this.f12838j = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.f(this.f12830b, this.f12831c, this.f12832d, this.f12833e, this.f12834f, this.f12835g, this.f12836h, tVar, androidx.compose.runtime.g3.b(this.f12837i | 1), this.f12838j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.q<List<? extends ka>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12839b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i4) {
            super(3);
            this.f12839b = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(List<? extends ka> list, androidx.compose.runtime.t tVar, Integer num) {
            a(list, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l List<ka> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2052073983, i4, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:302)");
            }
            if (this.f12839b < list.size()) {
                ma maVar = ma.f12561a;
                maVar.c(maVar.m(androidx.compose.ui.q.INSTANCE, list.get(this.f12839b)), 0.0f, 0L, tVar, 3072, 6);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12840b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12841c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12842d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12843e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12844f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12845g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12846h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12847i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12848j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(int i4, androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i5, int i6) {
            super(2);
            this.f12840b = i4;
            this.f12841c = qVar;
            this.f12842d = j4;
            this.f12843e = j5;
            this.f12844f = qVar2;
            this.f12845g = pVar;
            this.f12846h = pVar2;
            this.f12847i = i5;
            this.f12848j = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.g(this.f12840b, this.f12841c, this.f12842d, this.f12843e, this.f12844f, this.f12845g, this.f12846h, tVar, androidx.compose.runtime.g3.b(this.f12847i | 1), this.f12848j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1223:1\n1116#2,6:1224\n1116#2,6:1230\n1116#2,6:1240\n170#3,3:1236\n169#3:1246\n78#3,11:1247\n91#3:1278\n174#3:1279\n36#4:1239\n456#4,8:1258\n464#4,6:1272\n3737#5,6:1266\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1\n*L\n372#1:1224,6\n417#1:1230,6\n410#1:1240,6\n410#1:1236,3\n410#1:1246\n410#1:1247,11\n410#1:1278\n410#1:1279\n410#1:1239\n410#1:1258,8\n410#1:1272,6\n410#1:1266,6\n*E\n"})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> f12851d;

        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> f12852b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f12853c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, c cVar) {
                super(2);
                this.f12852b = qVar;
                this.f12853c = cVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1236693605, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:414)");
                }
                this.f12852b.R(this.f12853c, tVar, 6);
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

        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<name for destructuring parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n151#2,3:1239\n33#2,4:1242\n154#2,2:1246\n38#2:1248\n156#2:1249\n151#2,3:1250\n33#2,4:1253\n154#2,2:1257\n38#2:1259\n156#2:1260\n151#2,3:1261\n33#2,4:1264\n154#2,2:1268\n38#2:1270\n156#2:1271\n92#3:1235\n58#3:1236\n92#3:1238\n154#4:1237\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1\n*L\n424#1:1224,3\n424#1:1227,4\n424#1:1231,2\n424#1:1233\n424#1:1234\n441#1:1239,3\n441#1:1242,4\n441#1:1246,2\n441#1:1248\n441#1:1249\n452#1:1250,3\n452#1:1253,4\n452#1:1257,2\n452#1:1259\n452#1:1260\n456#1:1261,3\n456#1:1264,4\n456#1:1268,2\n456#1:1270\n456#1:1271\n434#1:1235\n434#1:1236\n438#1:1238\n436#1:1237\n*E\n"})
        static final class b implements androidx.compose.ui.layout.s0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f12854a;

            /* compiled from: TabRow.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2\n*L\n467#1:1224,6\n471#1:1230,6\n475#1:1236,6\n*E\n"})
            static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f12855b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f12856c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f12857d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ k1.f f12858e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f12859f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(List<? extends androidx.compose.ui.layout.i1> list, List<? extends androidx.compose.ui.layout.i1> list2, List<? extends androidx.compose.ui.layout.i1> list3, k1.f fVar, int i4) {
                    super(1);
                    this.f12855b = list;
                    this.f12856c = list2;
                    this.f12857d = list3;
                    this.f12858e = fVar;
                    this.f12859f = i4;
                }

                public final void a(@fg.l i1.a aVar) {
                    List<androidx.compose.ui.layout.i1> list = this.f12855b;
                    k1.f fVar = this.f12858e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        i1.a.m(aVar, list.get(i4), i4 * fVar.f75327b, 0, 0.0f, 4, null);
                    }
                    List<androidx.compose.ui.layout.i1> list2 = this.f12856c;
                    int i5 = this.f12859f;
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        androidx.compose.ui.layout.i1 i1Var = list2.get(i6);
                        i1.a.m(aVar, i1Var, 0, i5 - i1Var.getHeight(), 0.0f, 4, null);
                    }
                    List<androidx.compose.ui.layout.i1> list3 = this.f12857d;
                    int i7 = this.f12859f;
                    int size3 = list3.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        androidx.compose.ui.layout.i1 i1Var2 = list3.get(i10);
                        i1.a.m(aVar, i1Var2, 0, i7 - i1Var2.getHeight(), 0.0f, 4, null);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                    a(aVar);
                    return kotlin.k2.f75408a;
                }
            }

            b(c cVar) {
                this.f12854a = cVar;
            }

            @Override // androidx.compose.ui.layout.s0
            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends List<? extends androidx.compose.ui.layout.l0>> list, long j4) {
                androidx.compose.ui.layout.o0 o0Var2 = o0Var;
                List<? extends androidx.compose.ui.layout.l0> list2 = list.get(0);
                List<? extends androidx.compose.ui.layout.l0> list3 = list.get(1);
                int i4 = 2;
                List<? extends androidx.compose.ui.layout.l0> list4 = list.get(2);
                int p4 = androidx.compose.ui.unit.b.p(j4);
                int size = list2.size();
                k1.f fVar = new k1.f();
                if (size > 0) {
                    fVar.f75327b = p4 / size;
                }
                Integer num = 0;
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    num = Integer.valueOf(Math.max(list2.get(i5).t(fVar.f75327b), num.intValue()));
                }
                int intValue = num.intValue();
                c cVar = this.f12854a;
                ArrayList arrayList = new ArrayList(size);
                int i6 = 0;
                while (i6 < size) {
                    arrayList.add(new ka(o0Var2.R(fVar.f75327b) * i6, o0Var2.R(fVar.f75327b), ((androidx.compose.ui.unit.h) kotlin.comparisons.a.X(androidx.compose.ui.unit.h.d(o0Var2.R(Math.min(list2.get(i6).l0(intValue), fVar.f75327b)) - androidx.compose.ui.unit.h.g(ja.o() * i4)), androidx.compose.ui.unit.h.d(24))).u(), null));
                    i6++;
                    o0Var2 = o0Var;
                    i4 = 2;
                }
                cVar.a(arrayList);
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size3 = list2.size();
                int i7 = 0;
                while (i7 < size3) {
                    androidx.compose.ui.layout.l0 l0Var = list2.get(i7);
                    int i10 = fVar.f75327b;
                    i7 = androidx.compose.animation.n.a(l0Var, androidx.compose.ui.unit.b.d(j4, i10, i10, intValue, intValue), arrayList2, i7, 1);
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                int size4 = list3.size();
                int i11 = 0;
                while (i11 < size4) {
                    i11 = androidx.compose.animation.n.a(list3.get(i11), androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null), arrayList3, i11, 1);
                }
                ArrayList arrayList4 = new ArrayList(list4.size());
                int size5 = list4.size();
                int i12 = 0;
                while (i12 < size5) {
                    androidx.compose.ui.layout.l0 l0Var2 = list4.get(i12);
                    int i13 = fVar.f75327b;
                    i12 = androidx.compose.animation.n.a(l0Var2, androidx.compose.ui.unit.b.e(j4, i13, i13, 0, intValue, 4, null), arrayList4, i12, 1);
                }
                return androidx.compose.ui.layout.o0.x2(o0Var, p4, intValue, null, new a(arrayList2, arrayList3, arrayList4, fVar, intValue), 4, null);
            }
        }

        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000S\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002JD\u0010\r\u001a\u00020\u0003*\u00020\u00032/\u0010\f\u001a+\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00198\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"androidx/compose/material3/na$o$c", "Landroidx/compose/material3/ia;", "Landroidx/compose/material3/la;", "Landroidx/compose/ui/q;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "", "Landroidx/compose/material3/ka;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measure", "b", "(Landroidx/compose/ui/q;Lld/r;)Landroidx/compose/ui/q;", "", "selectedTabIndex", "", "matchContentSize", "c", "(Landroidx/compose/ui/q;IZ)Landroidx/compose/ui/q;", "positions", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/k2;", "e", "()Landroidx/compose/runtime/k2;", "tabPositions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements ia, la {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final androidx.compose.runtime.k2<List<ka>> tabPositions;

            /* compiled from: TabRow.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.r<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, List<ka>, androidx.compose.ui.layout.n0> f12861b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f12862c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(ld.r<? super androidx.compose.ui.layout.o0, ? super androidx.compose.ui.layout.l0, ? super androidx.compose.ui.unit.b, ? super List<ka>, ? extends androidx.compose.ui.layout.n0> rVar, c cVar) {
                    super(3);
                    this.f12861b = rVar;
                    this.f12862c = cVar;
                }

                @Override // ld.q
                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
                    return a(o0Var, l0Var, bVar.getValue());
                }

                @fg.l
                public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
                    return this.f12861b.i(o0Var, l0Var, androidx.compose.ui.unit.b.b(j4), this.f12862c.e().getValue());
                }
            }

            c() {
                androidx.compose.runtime.k2<List<ka>> g4;
                g4 = androidx.compose.runtime.t4.g(kotlin.collections.j0.f74919b, null, 2, null);
                this.tabPositions = g4;
            }

            @Override // androidx.compose.material3.la
            public void a(@fg.l List<ka> positions) {
                this.tabPositions.setValue(positions);
            }

            @Override // androidx.compose.material3.ia
            @fg.l
            public androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.r<? super androidx.compose.ui.layout.o0, ? super androidx.compose.ui.layout.l0, ? super androidx.compose.ui.unit.b, ? super List<ka>, ? extends androidx.compose.ui.layout.n0> rVar) {
                return androidx.compose.ui.layout.d0.a(qVar, new a(rVar, this));
            }

            @Override // androidx.compose.material3.ia
            @fg.l
            public androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, int i4, boolean z4) {
                return qVar.w3(new TabIndicatorModifier(this.tabPositions, i4, z4));
            }

            @fg.l
            public final androidx.compose.runtime.k2<List<ka>> e() {
                return this.tabPositions;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12849b = pVar;
            this.f12850c = pVar2;
            this.f12851d = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-65106680, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:371)");
            }
            tVar.P(474062752);
            Object Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = new c();
                tVar.E(Q);
            }
            c cVar = (c) Q;
            tVar.p0();
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
            List O = kotlin.collections.w.O(this.f12849b, this.f12850c, androidx.compose.runtime.internal.c.b(tVar, 1236693605, true, new a(this.f12851d, cVar)));
            tVar.P(474064303);
            Object Q2 = tVar.Q();
            if (Q2 == companion.a()) {
                Q2 = new b(cVar);
                tVar.E(Q2);
            }
            androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) Q2;
            tVar.p0();
            tVar.P(1399185516);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> e4 = androidx.compose.ui.layout.a0.e(O);
            tVar.P(1157296644);
            boolean q02 = tVar.q0(s0Var);
            Object Q3 = tVar.Q();
            if (q02 || Q3 == companion.a()) {
                Q3 = androidx.compose.ui.layout.t0.a(s0Var);
                tVar.E(Q3);
            }
            tVar.p0();
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q3;
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, m0Var, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            if (androidx.compose.foundation.x.a(0, e4, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<ia, androidx.compose.runtime.t, Integer, kotlin.k2> f12866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12868g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12869h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4) {
            super(2);
            this.f12863b = qVar;
            this.f12864c = j4;
            this.f12865d = j5;
            this.f12866e = qVar2;
            this.f12867f = pVar;
            this.f12868g = pVar2;
            this.f12869h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.h(this.f12863b, this.f12864c, this.f12865d, this.f12866e, this.f12867f, this.f12868g, tVar, androidx.compose.runtime.g3.b(this.f12869h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1223:1\n1116#2,6:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1\n*L\n589#1:1224,6\n*E\n"})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12872d;

        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n151#2,3:1235\n33#2,4:1238\n154#2,2:1242\n38#2:1244\n156#2:1245\n92#3:1246\n58#3:1247\n92#3:1249\n154#4:1248\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1\n*L\n597#1:1224,3\n597#1:1227,4\n597#1:1231,2\n597#1:1233\n597#1:1234\n601#1:1235,3\n601#1:1238,4\n601#1:1242,2\n601#1:1244\n601#1:1245\n615#1:1246\n615#1:1247\n618#1:1249\n617#1:1248\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12873b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12874c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12875d;

            /* compiled from: TabRow.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1\n*L\n622#1:1224,6\n626#1:1230,6\n633#1:1236,6\n*E\n"})
            /* renamed from: androidx.compose.material3.na$q$a$a, reason: collision with other inner class name */
            static final class C0281a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f12876b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.s1 f12877c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12878d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ k1.f f12879e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ long f12880f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ int f12881g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12882h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ List<ka> f12883i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ int f12884j;

                /* compiled from: TabRow.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.na$q$a$a$a, reason: collision with other inner class name */
                static final class C0282a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12885b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ List<ka> f12886c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0282a(ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, List<ka> list) {
                        super(2);
                        this.f12885b = qVar;
                        this.f12886c = list;
                    }

                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(1621992604, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:631)");
                        }
                        this.f12885b.R(this.f12886c, tVar, 0);
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0281a(List<? extends androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.s1 s1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, k1.f fVar, long j4, int i4, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, List<ka> list2, int i5) {
                    super(1);
                    this.f12876b = list;
                    this.f12877c = s1Var;
                    this.f12878d = pVar;
                    this.f12879e = fVar;
                    this.f12880f = j4;
                    this.f12881g = i4;
                    this.f12882h = qVar;
                    this.f12883i = list2;
                    this.f12884j = i5;
                }

                public final void a(@fg.l i1.a aVar) {
                    List<androidx.compose.ui.layout.i1> list = this.f12876b;
                    k1.f fVar = this.f12879e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        i1.a.m(aVar, list.get(i4), i4 * fVar.f75327b, 0, 0.0f, 4, null);
                    }
                    List<androidx.compose.ui.layout.l0> E2 = this.f12877c.E2(oa.Divider, this.f12878d);
                    long j4 = this.f12880f;
                    int i5 = this.f12881g;
                    int size2 = E2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        androidx.compose.ui.layout.i1 m02 = E2.get(i6).m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null));
                        i1.a.m(aVar, m02, 0, i5 - m02.getHeight(), 0.0f, 4, null);
                    }
                    List<androidx.compose.ui.layout.l0> E22 = this.f12877c.E2(oa.Indicator, new androidx.compose.runtime.internal.b(1621992604, true, new C0282a(this.f12882h, this.f12883i)));
                    int i7 = this.f12884j;
                    int i10 = this.f12881g;
                    int size3 = E22.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        i1.a.m(aVar, E22.get(i11).m0(androidx.compose.ui.unit.b.INSTANCE.c(i7, i10)), 0, 0, 0.0f, 4, null);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                    a(aVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                super(2);
                this.f12873b = pVar;
                this.f12874c = pVar2;
                this.f12875d = qVar;
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
                int p4 = androidx.compose.ui.unit.b.p(j4);
                List<androidx.compose.ui.layout.l0> E2 = s1Var.E2(oa.Tabs, this.f12873b);
                int size = E2.size();
                k1.f fVar = new k1.f();
                if (size > 0) {
                    fVar.f75327b = p4 / size;
                }
                Integer num = 0;
                int size2 = E2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    num = Integer.valueOf(Math.max(E2.get(i4).t(fVar.f75327b), num.intValue()));
                }
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList(E2.size());
                int size3 = E2.size();
                int i5 = 0;
                while (i5 < size3) {
                    androidx.compose.ui.layout.l0 l0Var = E2.get(i5);
                    int i6 = fVar.f75327b;
                    i5 = androidx.compose.animation.n.a(l0Var, androidx.compose.ui.unit.b.d(j4, i6, i6, intValue, intValue), arrayList, i5, 1);
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(new ka(s1Var.R(fVar.f75327b) * i7, s1Var.R(fVar.f75327b), ((androidx.compose.ui.unit.h) kotlin.comparisons.a.X(androidx.compose.ui.unit.h.d(s1Var.R(Math.min(E2.get(i7).l0(intValue), fVar.f75327b)) - androidx.compose.ui.unit.h.g(ja.o() * 2)), androidx.compose.ui.unit.h.d(24))).u(), null));
                }
                return androidx.compose.ui.layout.o0.x2(s1Var, p4, intValue, null, new C0281a(arrayList, s1Var, this.f12874c, fVar, j4, intValue, this.f12875d, arrayList2, p4), 4, null);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
                return a(s1Var, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12870b = pVar;
            this.f12871c = pVar2;
            this.f12872d = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1617702432, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:588)");
            }
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
            tVar.P(-1028159188);
            boolean q02 = tVar.q0(this.f12870b) | tVar.q0(this.f12871c) | tVar.q0(this.f12872d);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12870b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12871c;
            ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12872d;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(pVar, pVar2, qVar);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.layout.q1.a(h4, (ld.p) Q, tVar, 6, 0);
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

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12888c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12889d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<List<ka>, androidx.compose.runtime.t, Integer, kotlin.k2> f12890e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12891f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12892g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12893h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4) {
            super(2);
            this.f12887b = qVar;
            this.f12888c = j4;
            this.f12889d = j5;
            this.f12890e = qVar2;
            this.f12891f = pVar;
            this.f12892g = pVar2;
            this.f12893h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            na.i(this.f12887b, this.f12888c, this.f12889d, this.f12890e, this.f12891f, this.f12892g, tVar, androidx.compose.runtime.g3.b(this.f12893h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0173  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.w2 r30, long r31, long r33, float r35, @fg.m ld.q<? super java.util.List<androidx.compose.material3.ka>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.a(int, androidx.compose.ui.q, androidx.compose.foundation.w2, long, long, float, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007e  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r21, @fg.m androidx.compose.ui.q r22, long r23, long r25, @fg.m ld.q<? super androidx.compose.material3.ia, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.b(int, androidx.compose.ui.q, long, long, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009c  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r27, @fg.m androidx.compose.ui.q r28, long r29, long r31, float r33, @fg.m ld.q<? super java.util.List<androidx.compose.material3.ka>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r34, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.c(int, androidx.compose.ui.q, long, long, float, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00db  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r27, ld.q<? super java.util.List<androidx.compose.material3.ka>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, androidx.compose.ui.q r29, long r30, long r32, float r34, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, androidx.compose.foundation.w2 r37, androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.d(int, ld.q, androidx.compose.ui.q, long, long, float, ld.p, ld.p, androidx.compose.foundation.w2, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0173  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.w2 r30, long r31, long r33, float r35, @fg.m ld.q<? super java.util.List<androidx.compose.material3.ka>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.e(int, androidx.compose.ui.q, androidx.compose.foundation.w2, long, long, float, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007e  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(int r21, @fg.m androidx.compose.ui.q r22, long r23, long r25, @fg.m ld.q<? super androidx.compose.material3.ia, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.f(int, androidx.compose.ui.q, long, long, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007e  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(int r21, @fg.m androidx.compose.ui.q r22, long r23, long r25, @fg.m ld.q<? super java.util.List<androidx.compose.material3.ka>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.na.g(int, androidx.compose.ui.q, long, long, ld.q, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    public static final void h(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super ia, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1757425411);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(qVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(pVar2) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1757425411, i5, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:365)");
            }
            int i6 = i5 << 3;
            x9.a(androidx.compose.foundation.selection.a.a(qVar), null, j4, j5, 0.0f, 0.0f, null, androidx.compose.runtime.internal.c.b(o4, -65106680, true, new o(pVar2, pVar, qVar2)), o4, (i6 & 896) | 12582912 | (i6 & 7168), 114);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p(qVar, j4, j5, qVar2, pVar, pVar2, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.i
    public static final void i(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super List<ka>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-160898917);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(qVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(pVar2) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-160898917, i5, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:582)");
            }
            int i6 = i5 << 3;
            x9.a(androidx.compose.foundation.selection.a.a(qVar), null, j4, j5, 0.0f, 0.0f, null, androidx.compose.runtime.internal.c.b(o4, -1617702432, true, new q(pVar2, pVar, qVar2)), o4, (i6 & 896) | 12582912 | (i6 & 7168), 114);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new r(qVar, j4, j5, qVar2, pVar, pVar2, i4));
        }
    }
}
