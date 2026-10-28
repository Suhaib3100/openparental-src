package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.g3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010%\u001a\b\u0012\u0004\u0012\u00020 0$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&\u001aÝ\u0001\u00106\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000$2%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u001120\b\n\u00101\u001a*\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u000200\u0018\u00010.¢\u0006\u0002\b\u00142%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u001123\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b6\u00107\u001a±\u0002\u0010:\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000$2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010.2E\b\n\u00101\u001a?\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u000200\u0018\u000109¢\u0006\u0002\b\u00142:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0.2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001309¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b:\u0010;\u001aÝ\u0001\u0010=\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000<2%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u001120\b\n\u00101\u001a*\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u000200\u0018\u00010.¢\u0006\u0002\b\u00142%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u001123\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b=\u0010>\u001a±\u0002\u0010?\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000<2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010.2E\b\n\u00101\u001a?\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u000200\u0018\u000109¢\u0006\u0002\b\u00142:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0.2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001309¢\u0006\u0002\b4¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a;", "columns", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/grid/k0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/c0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "b", "(Landroidx/compose/foundation/lazy/grid/a;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "rows", "a", "(Landroidx/compose/foundation/lazy/grid/a;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/lazy/grid/h0;", "m", "(Landroidx/compose/foundation/lazy/grid/a;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/grid/h0;", "n", "(Landroidx/compose/foundation/lazy/grid/a;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/grid/h0;", "", "gridSize", "slotCount", "spacing", "", "d", "(III)Ljava/util/List;", "T", "items", "Lkotlin/r0;", "name", "item", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/s;", "Landroidx/compose/foundation/lazy/grid/b;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/q;", "Landroidx/compose/runtime/i;", "itemContent", "e", "(Landroidx/compose/foundation/lazy/grid/c0;Ljava/util/List;Lld/l;Lld/p;Lld/l;Lld/r;)V", "index", "Lkotlin/Function3;", "i", "(Landroidx/compose/foundation/lazy/grid/c0;Ljava/util/List;Lld/p;Lld/q;Lld/p;Lld/s;)V", "", "f", "(Landroidx/compose/foundation/lazy/grid/c0;[Ljava/lang/Object;Lld/l;Lld/p;Lld/l;Lld/r;)V", "j", "(Landroidx/compose/foundation/lazy/grid/c0;[Ljava/lang/Object;Lld/p;Lld/q;Lld/p;Lld/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,563:1\n154#2:564\n154#2:565\n67#3,3:566\n66#3:569\n67#3,3:576\n66#3:579\n1116#4,6:570\n1116#4,6:580\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n66#1:564\n119#1:565\n149#1:566,3\n149#1:569\n182#1:576,3\n182#1:579\n149#1:570,6\n182#1:580,6\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* compiled from: LazyGridDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.a f5616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5617c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f5618d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f5619e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5620f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.e f5621g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i.m f5622h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5623i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f5624j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<c0, k2> f5625k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5626l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f5627m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.lazy.grid.a aVar, androidx.compose.ui.q qVar, k0 k0Var, l1 l1Var, boolean z4, i.e eVar, i.m mVar, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super c0, k2> lVar, int i4, int i5) {
            super(2);
            this.f5616b = aVar;
            this.f5617c = qVar;
            this.f5618d = k0Var;
            this.f5619e = l1Var;
            this.f5620f = z4;
            this.f5621g = eVar;
            this.f5622h = mVar;
            this.f5623i = e0Var;
            this.f5624j = z5;
            this.f5625k = lVar;
            this.f5626l = i4;
            this.f5627m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            h.a(this.f5616b, this.f5617c, this.f5618d, this.f5619e, this.f5620f, this.f5621g, this.f5622h, this.f5623i, this.f5624j, this.f5625k, tVar, g3.b(this.f5626l | 1), this.f5627m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.a f5628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f5630d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f5631e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5632f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.m f5633g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i.e f5634h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5635i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f5636j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<c0, k2> f5637k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5638l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f5639m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.lazy.grid.a aVar, androidx.compose.ui.q qVar, k0 k0Var, l1 l1Var, boolean z4, i.m mVar, i.e eVar, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super c0, k2> lVar, int i4, int i5) {
            super(2);
            this.f5628b = aVar;
            this.f5629c = qVar;
            this.f5630d = k0Var;
            this.f5631e = l1Var;
            this.f5632f = z4;
            this.f5633g = mVar;
            this.f5634h = eVar;
            this.f5635i = e0Var;
            this.f5636j = z5;
            this.f5637k = lVar;
            this.f5638l = i4;
            this.f5639m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            h.b(this.f5628b, this.f5629c, this.f5630d, this.f5631e, this.f5632f, this.f5633g, this.f5634h, this.f5635i, this.f5636j, this.f5637k, tVar, g3.b(this.f5638l | 1), this.f5639m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10\n*L\n1#1,563:1\n*E\n"})
    public static final class c extends n0 implements ld.r<androidx.compose.foundation.lazy.grid.q, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.grid.q, T, androidx.compose.runtime.t, Integer, k2> f5640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ld.r<? super androidx.compose.foundation.lazy.grid.q, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, T[] tArr) {
            super(4);
            this.f5640b = rVar;
            this.f5641c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.grid.q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(qVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(407562193, i6, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:527)");
            }
            this.f5640b.i(qVar, this.f5641c[i4], tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.grid.q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(qVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1\n*L\n1#1,563:1\n*E\n"})
    public static final class d extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5642b = new d(1);

        public d() {
            super(1);
        }

        @fg.m
        public final Void a(Object obj) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,563:1\n*E\n"})
    public static final class e extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f5643b = lVar;
            this.f5644c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5643b.invoke(this.f5644c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,563:1\n*E\n"})
    public static final class f extends n0 implements ld.p<androidx.compose.foundation.lazy.grid.s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.foundation.lazy.grid.s, T, androidx.compose.foundation.lazy.grid.b> f5645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5646c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ld.p<? super androidx.compose.foundation.lazy.grid.s, ? super T, androidx.compose.foundation.lazy.grid.b> pVar, List<? extends T> list) {
            super(2);
            this.f5645b = pVar;
            this.f5646c = list;
        }

        public final long a(@fg.l androidx.compose.foundation.lazy.grid.s sVar, int i4) {
            return this.f5645b.invoke(sVar, this.f5646c.get(i4)).getPackedValue();
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.b invoke(androidx.compose.foundation.lazy.grid.s sVar, Integer num) {
            return androidx.compose.foundation.lazy.grid.b.a(a(sVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,563:1\n*E\n"})
    public static final class g extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5647b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5648c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f5647b = lVar;
            this.f5648c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5647b.invoke(this.f5648c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n*L\n1#1,563:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.h$h, reason: collision with other inner class name */
    public static final class C0103h extends n0 implements ld.r<androidx.compose.foundation.lazy.grid.q, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.grid.q, T, androidx.compose.runtime.t, Integer, k2> f5649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0103h(ld.r<? super androidx.compose.foundation.lazy.grid.q, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, List<? extends T> list) {
            super(4);
            this.f5649b = rVar;
            this.f5650c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.grid.q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(qVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(699646206, i6, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
            }
            this.f5649b.i(qVar, this.f5650c.get(i4), tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.grid.q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(qVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$6\n*L\n1#1,563:1\n*E\n"})
    public static final class i extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final i f5651b = new i(1);

        public i() {
            super(1);
        }

        @fg.m
        public final Void a(Object obj) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7\n*L\n1#1,563:1\n*E\n"})
    public static final class j extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f5652b = lVar;
            this.f5653c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5652b.invoke(this.f5653c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8\n*L\n1#1,563:1\n*E\n"})
    public static final class k extends n0 implements ld.p<androidx.compose.foundation.lazy.grid.s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.foundation.lazy.grid.s, T, androidx.compose.foundation.lazy.grid.b> f5654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ld.p<? super androidx.compose.foundation.lazy.grid.s, ? super T, androidx.compose.foundation.lazy.grid.b> pVar, T[] tArr) {
            super(2);
            this.f5654b = pVar;
            this.f5655c = tArr;
        }

        public final long a(@fg.l androidx.compose.foundation.lazy.grid.s sVar, int i4) {
            return this.f5654b.invoke(sVar, this.f5655c[i4]).getPackedValue();
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.b invoke(androidx.compose.foundation.lazy.grid.s sVar, Integer num) {
            return androidx.compose.foundation.lazy.grid.b.a(a(sVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9\n*L\n1#1,563:1\n*E\n"})
    public static final class l extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f5656b = lVar;
            this.f5657c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5656b.invoke(this.f5657c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10\n*L\n1#1,563:1\n*E\n"})
    public static final class m extends n0 implements ld.r<androidx.compose.foundation.lazy.grid.q, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.grid.q, Integer, T, androidx.compose.runtime.t, Integer, k2> f5658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(ld.s<? super androidx.compose.foundation.lazy.grid.q, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, T[] tArr) {
            super(4);
            this.f5658b = sVar;
            this.f5659c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.grid.q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(qVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-911455938, i6, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:560)");
            }
            this.f5658b.a0(qVar, Integer.valueOf(i4), this.f5659c[i4], tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.grid.q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(qVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$1\n*L\n1#1,563:1\n*E\n"})
    public static final class n extends n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final n f5660b = new n(2);

        public n() {
            super(2);
        }

        @fg.m
        public final Void a(int i4, Object obj) {
            return null;
        }

        @Override // ld.p
        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2\n*L\n1#1,563:1\n*E\n"})
    public static final class o extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f5661b = pVar;
            this.f5662c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5661b.invoke(Integer.valueOf(i4), this.f5662c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,563:1\n*E\n"})
    public static final class p extends n0 implements ld.p<androidx.compose.foundation.lazy.grid.s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.lazy.grid.s, Integer, T, androidx.compose.foundation.lazy.grid.b> f5663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(ld.q<? super androidx.compose.foundation.lazy.grid.s, ? super Integer, ? super T, androidx.compose.foundation.lazy.grid.b> qVar, List<? extends T> list) {
            super(2);
            this.f5663b = qVar;
            this.f5664c = list;
        }

        public final long a(@fg.l androidx.compose.foundation.lazy.grid.s sVar, int i4) {
            return this.f5663b.R(sVar, Integer.valueOf(i4), this.f5664c.get(i4)).getPackedValue();
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.b invoke(androidx.compose.foundation.lazy.grid.s sVar, Integer num) {
            return androidx.compose.foundation.lazy.grid.b.a(a(sVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4\n*L\n1#1,563:1\n*E\n"})
    public static final class q extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f5665b = pVar;
            this.f5666c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5665b.invoke(Integer.valueOf(i4), this.f5666c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5\n*L\n1#1,563:1\n*E\n"})
    public static final class r extends n0 implements ld.r<androidx.compose.foundation.lazy.grid.q, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.grid.q, Integer, T, androidx.compose.runtime.t, Integer, k2> f5667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(ld.s<? super androidx.compose.foundation.lazy.grid.q, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, List<? extends T> list) {
            super(4);
            this.f5667b = sVar;
            this.f5668c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.grid.q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(qVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1229287273, i6, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:494)");
            }
            this.f5667b.a0(qVar, Integer.valueOf(i4), this.f5668c.get(i4), tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.grid.q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(qVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$6\n*L\n1#1,563:1\n*E\n"})
    public static final class s extends n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final s f5669b = new s(2);

        public s() {
            super(2);
        }

        @fg.m
        public final Void a(int i4, Object obj) {
            return null;
        }

        @Override // ld.p
        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7\n*L\n1#1,563:1\n*E\n"})
    public static final class t extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f5670b = pVar;
            this.f5671c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5670b.invoke(Integer.valueOf(i4), this.f5671c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8\n*L\n1#1,563:1\n*E\n"})
    public static final class u extends n0 implements ld.p<androidx.compose.foundation.lazy.grid.s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.lazy.grid.s, Integer, T, androidx.compose.foundation.lazy.grid.b> f5672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(ld.q<? super androidx.compose.foundation.lazy.grid.s, ? super Integer, ? super T, androidx.compose.foundation.lazy.grid.b> qVar, T[] tArr) {
            super(2);
            this.f5672b = qVar;
            this.f5673c = tArr;
        }

        public final long a(@fg.l androidx.compose.foundation.lazy.grid.s sVar, int i4) {
            return this.f5672b.R(sVar, Integer.valueOf(i4), this.f5673c[i4]).getPackedValue();
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.b invoke(androidx.compose.foundation.lazy.grid.s sVar, Integer num) {
            return androidx.compose.foundation.lazy.grid.b.a(a(sVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9\n*L\n1#1,563:1\n*E\n"})
    public static final class v extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5674b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f5674b = pVar;
            this.f5675c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5674b.invoke(Integer.valueOf(i4), this.f5675c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/grid/g0;", "a", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/grid/g0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,563:1\n51#2:564\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n158#1:564\n*E\n"})
    static final class w extends n0 implements ld.p<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, g0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f5676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.a f5677c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.e f5678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(l1 l1Var, androidx.compose.foundation.lazy.grid.a aVar, i.e eVar) {
            super(2);
            this.f5676b = l1Var;
            this.f5677c = aVar;
            this.f5678d = eVar;
        }

        @fg.l
        public final g0 a(@fg.l androidx.compose.ui.unit.d dVar, long j4) {
            if (androidx.compose.ui.unit.b.p(j4) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
            }
            l1 l1Var = this.f5676b;
            androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
            int p4 = androidx.compose.ui.unit.b.p(j4) - dVar.q2(androidx.compose.ui.unit.h.g(j1.h(this.f5676b, wVar) + j1.i(l1Var, wVar)));
            androidx.compose.foundation.lazy.grid.a aVar = this.f5677c;
            i.e eVar = this.f5678d;
            int[] U5 = kotlin.collections.w.U5(aVar.a(dVar, p4, dVar.q2(eVar.getSpacing())));
            int[] iArr = new int[U5.length];
            eVar.e(dVar, p4, U5, wVar, iArr);
            return new g0(U5, iArr);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ g0 invoke(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.b bVar) {
            return a(dVar, bVar.getValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/grid/g0;", "a", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/grid/g0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,563:1\n51#2:564\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n*L\n191#1:564\n*E\n"})
    static final class x extends n0 implements ld.p<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, g0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f5679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.a f5680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.m f5681d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(l1 l1Var, androidx.compose.foundation.lazy.grid.a aVar, i.m mVar) {
            super(2);
            this.f5679b = l1Var;
            this.f5680c = aVar;
            this.f5681d = mVar;
        }

        @fg.l
        public final g0 a(@fg.l androidx.compose.ui.unit.d dVar, long j4) {
            if (androidx.compose.ui.unit.b.o(j4) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
            }
            int o4 = androidx.compose.ui.unit.b.o(j4) - dVar.q2(androidx.compose.ui.unit.h.g(this.f5679b.getBottom() + this.f5679b.getTop()));
            androidx.compose.foundation.lazy.grid.a aVar = this.f5680c;
            i.m mVar = this.f5681d;
            int[] U5 = kotlin.collections.w.U5(aVar.a(dVar, o4, dVar.q2(mVar.getSpacing())));
            int[] iArr = new int[U5.length];
            mVar.d(dVar, o4, U5, iArr);
            return new g0(U5, iArr);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ g0 invoke(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.b bVar) {
            return a(dVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.foundation.lazy.grid.a r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.grid.k0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, @fg.m androidx.compose.foundation.layout.i.e r33, @fg.m androidx.compose.foundation.layout.i.m r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.grid.c0, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.h.a(androidx.compose.foundation.lazy.grid.a, androidx.compose.ui.q, androidx.compose.foundation.lazy.grid.k0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$e, androidx.compose.foundation.layout.i$m, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.foundation.lazy.grid.a r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.grid.k0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, @fg.m androidx.compose.foundation.layout.i.m r33, @fg.m androidx.compose.foundation.layout.i.e r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.grid.c0, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.h.b(androidx.compose.foundation.lazy.grid.a, androidx.compose.ui.q, androidx.compose.foundation.lazy.grid.k0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$m, androidx.compose.foundation.layout.i$e, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> d(int i4, int i5, int i6) {
        int i7 = i4 - ((i5 - 1) * i6);
        int i10 = i7 / i5;
        int i11 = i7 % i5;
        ArrayList arrayList = new ArrayList(i5);
        int i12 = 0;
        while (i12 < i5) {
            arrayList.add(Integer.valueOf((i12 < i11 ? 1 : 0) + i10));
            i12++;
        }
        return arrayList;
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void e(@fg.l c0 c0Var, @fg.l List<? extends T> list, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.m ld.p<? super androidx.compose.foundation.lazy.grid.s, ? super T, androidx.compose.foundation.lazy.grid.b> pVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.l ld.r<? super androidx.compose.foundation.lazy.grid.q, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        c0Var.m(list.size(), lVar != null ? new e(lVar, list) : null, pVar != null ? new f(pVar, list) : null, new g(lVar2, list), new androidx.compose.runtime.internal.b(699646206, true, new C0103h(rVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void f(@fg.l c0 c0Var, @fg.l T[] tArr, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.m ld.p<? super androidx.compose.foundation.lazy.grid.s, ? super T, androidx.compose.foundation.lazy.grid.b> pVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.l ld.r<? super androidx.compose.foundation.lazy.grid.q, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        c0Var.m(tArr.length, lVar != null ? new j(lVar, tArr) : null, pVar != null ? new k(pVar, tArr) : null, new l(lVar2, tArr), new androidx.compose.runtime.internal.b(407562193, true, new c(rVar, tArr)));
    }

    public static void g(c0 c0Var, List list, ld.l lVar, ld.p pVar, ld.l lVar2, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar = null;
        }
        if ((i4 & 8) != 0) {
            lVar2 = d.f5642b;
        }
        c0Var.m(list.size(), lVar != null ? new e(lVar, list) : null, pVar != null ? new f(pVar, list) : null, new g(lVar2, list), new androidx.compose.runtime.internal.b(699646206, true, new C0103h(rVar, list)));
    }

    public static void h(c0 c0Var, Object[] objArr, ld.l lVar, ld.p pVar, ld.l lVar2, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar = null;
        }
        if ((i4 & 8) != 0) {
            lVar2 = i.f5651b;
        }
        c0Var.m(objArr.length, lVar != null ? new j(lVar, objArr) : null, pVar != null ? new k(pVar, objArr) : null, new l(lVar2, objArr), new androidx.compose.runtime.internal.b(407562193, true, new c(rVar, objArr)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void i(@fg.l c0 c0Var, @fg.l List<? extends T> list, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.m ld.q<? super androidx.compose.foundation.lazy.grid.s, ? super Integer, ? super T, androidx.compose.foundation.lazy.grid.b> qVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.l ld.s<? super androidx.compose.foundation.lazy.grid.q, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        c0Var.m(list.size(), pVar != null ? new o(pVar, list) : null, qVar != null ? new p(qVar, list) : null, new q(pVar2, list), new androidx.compose.runtime.internal.b(1229287273, true, new r(sVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void j(@fg.l c0 c0Var, @fg.l T[] tArr, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.m ld.q<? super androidx.compose.foundation.lazy.grid.s, ? super Integer, ? super T, androidx.compose.foundation.lazy.grid.b> qVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.l ld.s<? super androidx.compose.foundation.lazy.grid.q, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        c0Var.m(tArr.length, pVar != null ? new t(pVar, tArr) : null, qVar != null ? new u(qVar, tArr) : null, new v(pVar2, tArr), new androidx.compose.runtime.internal.b(-911455938, true, new m(sVar, tArr)));
    }

    public static void k(c0 c0Var, List list, ld.p pVar, ld.q qVar, ld.p pVar2, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            qVar = null;
        }
        if ((i4 & 8) != 0) {
            pVar2 = n.f5660b;
        }
        c0Var.m(list.size(), pVar != null ? new o(pVar, list) : null, qVar != null ? new p(qVar, list) : null, new q(pVar2, list), new androidx.compose.runtime.internal.b(1229287273, true, new r(sVar, list)));
    }

    public static void l(c0 c0Var, Object[] objArr, ld.p pVar, ld.q qVar, ld.p pVar2, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            qVar = null;
        }
        if ((i4 & 8) != 0) {
            pVar2 = s.f5669b;
        }
        c0Var.m(objArr.length, pVar != null ? new t(pVar, objArr) : null, qVar != null ? new u(qVar, objArr) : null, new v(pVar2, objArr), new androidx.compose.runtime.internal.b(-911455938, true, new m(sVar, objArr)));
    }

    @androidx.compose.runtime.i
    private static final h0 m(androidx.compose.foundation.lazy.grid.a aVar, i.e eVar, l1 l1Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1632454918);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1632454918, i4, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        tVar.P(1618982084);
        boolean q02 = tVar.q0(aVar) | tVar.q0(eVar) | tVar.q0(l1Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new androidx.compose.foundation.lazy.grid.c(new w(l1Var, aVar, eVar));
            tVar.E(Q);
        }
        tVar.p0();
        h0 h0Var = (h0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h0Var;
    }

    @androidx.compose.runtime.i
    private static final h0 n(androidx.compose.foundation.lazy.grid.a aVar, i.m mVar, l1 l1Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-741512409);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-741512409, i4, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:181)");
        }
        tVar.P(1618982084);
        boolean q02 = tVar.q0(aVar) | tVar.q0(mVar) | tVar.q0(l1Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new androidx.compose.foundation.lazy.grid.c(new x(l1Var, aVar, mVar));
            tVar.E(Q);
        }
        tVar.p0();
        h0 h0Var = (h0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h0Var;
    }
}
