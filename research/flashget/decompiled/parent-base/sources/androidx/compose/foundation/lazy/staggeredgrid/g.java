package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.g3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0083\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\"\u001aÒ\u0001\u00102\u001a\u00020\u0013\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u00112%\b\u0006\u0010+\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0\u00112%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020,\u0018\u00010\u001123\b\u0004\u00101\u001a-\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b0¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b2\u00103\u001a¦\u0002\u00107\u001a\u00020\u0013\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2:\b\n\u0010*\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010.2:\b\u0006\u0010+\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0.2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020,\u0018\u00010.2H\b\u0004\u00101\u001aB\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001306¢\u0006\u0002\b0¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b7\u00108\u001aÒ\u0001\u0010:\u001a\u00020\u0013\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u0000092%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u00112%\b\u0006\u0010+\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0\u00112%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020,\u0018\u00010\u001123\b\u0004\u00101\u001a-\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b0¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b:\u0010;\u001a¦\u0002\u0010<\u001a\u00020\u0013\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u0000092:\b\n\u0010*\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010.2:\b\u0006\u0010+\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0.2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020,\u0018\u00010.2H\b\u0004\u00101\u001aB\u0012\u0004\u0012\u00020/\u0012\u0013\u0012\u001104¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(5\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001306¢\u0006\u0002\b0¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m0;", "columns", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/h;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/b0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "b", "(Landroidx/compose/foundation/lazy/staggeredgrid/m0;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/staggeredgrid/j0;Landroidx/compose/foundation/layout/l1;ZFLandroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/b;", "k", "(Landroidx/compose/foundation/lazy/staggeredgrid/m0;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/staggeredgrid/b;", "rows", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "horizontalItemSpacing", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/m0;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/staggeredgrid/j0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "l", "(Landroidx/compose/foundation/lazy/staggeredgrid/m0;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/staggeredgrid/b;", "T", "", "items", "Lkotlin/r0;", "name", "item", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "Landroidx/compose/runtime/i;", "itemContent", "c", "(Landroidx/compose/foundation/lazy/staggeredgrid/b0;Ljava/util/List;Lld/l;Lld/l;Lld/l;Lld/r;)V", "", "index", "Lkotlin/Function3;", "g", "(Landroidx/compose/foundation/lazy/staggeredgrid/b0;Ljava/util/List;Lld/p;Lld/p;Lld/p;Lld/s;)V", "", "d", "(Landroidx/compose/foundation/lazy/staggeredgrid/b0;[Ljava/lang/Object;Lld/l;Lld/l;Lld/l;Lld/r;)V", "h", "(Landroidx/compose/foundation/lazy/staggeredgrid/b0;[Ljava/lang/Object;Lld/p;Lld/p;Lld/p;Lld/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,463:1\n154#2:464\n154#2:465\n154#2:466\n154#2:477\n154#2:478\n154#2:479\n67#3,3:467\n66#3:470\n67#3,3:480\n66#3:483\n1116#4,6:471\n1116#4,6:484\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:464\n68#1:465\n69#1:466\n156#1:477\n158#1:478\n159#1:479\n95#1:467,3\n95#1:470\n185#1:480,3\n185#1:483\n95#1:471,6\n185#1:484,6\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f6270b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6271c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f6272d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f6273e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6274f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.m f6275g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f6276h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f6277i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f6278j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<b0, k2> f6279k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6280l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f6281m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m0 m0Var, androidx.compose.ui.q qVar, j0 j0Var, l1 l1Var, boolean z4, i.m mVar, float f4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super b0, k2> lVar, int i4, int i5) {
            super(2);
            this.f6270b = m0Var;
            this.f6271c = qVar;
            this.f6272d = j0Var;
            this.f6273e = l1Var;
            this.f6274f = z4;
            this.f6275g = mVar;
            this.f6276h = f4;
            this.f6277i = e0Var;
            this.f6278j = z5;
            this.f6279k = lVar;
            this.f6280l = i4;
            this.f6281m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g.a(this.f6270b, this.f6271c, this.f6272d, this.f6273e, this.f6274f, this.f6275g, this.f6276h, this.f6277i, this.f6278j, this.f6279k, tVar, g3.b(this.f6280l | 1), this.f6281m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f6282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f6284d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f6285e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6286f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f6287g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i.e f6288h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f6289i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f6290j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<b0, k2> f6291k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6292l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f6293m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(m0 m0Var, androidx.compose.ui.q qVar, j0 j0Var, l1 l1Var, boolean z4, float f4, i.e eVar, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super b0, k2> lVar, int i4, int i5) {
            super(2);
            this.f6282b = m0Var;
            this.f6283c = qVar;
            this.f6284d = j0Var;
            this.f6285e = l1Var;
            this.f6286f = z4;
            this.f6287g = f4;
            this.f6288h = eVar;
            this.f6289i = e0Var;
            this.f6290j = z5;
            this.f6291k = lVar;
            this.f6292l = i4;
            this.f6293m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g.b(this.f6282b, this.f6283c, this.f6284d, this.f6285e, this.f6286f, this.f6287g, this.f6288h, this.f6289i, this.f6290j, this.f6291k, tVar, g3.b(this.f6292l | 1), this.f6293m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "index", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/p;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10\n*L\n1#1,463:1\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, T, androidx.compose.runtime.t, Integer, k2> f6294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ld.r<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, T[] tArr) {
            super(4);
            this.f6294b = rVar;
            this.f6295c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.staggeredgrid.p pVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(pVar) ? 4 : 2) | i5;
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
                androidx.compose.runtime.x.r0(2101296000, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:420)");
            }
            this.f6294b.i(pVar, this.f6295c[i4], tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.staggeredgrid.p pVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(pVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1\n*L\n1#1,463:1\n*E\n"})
    public static final class d extends kotlin.jvm.internal.n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final d f6296b = new d(1);

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

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1\n*L\n1#1,463:1\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f6297b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f6297b = lVar;
            this.f6298c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f6297b.invoke(this.f6298c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3\n*L\n1#1,463:1\n*E\n"})
    public static final class f extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f6299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f6299b = lVar;
            this.f6300c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f6299b.invoke(this.f6300c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1\n*L\n1#1,463:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.g$g, reason: collision with other inner class name */
    static final class C0114g extends kotlin.jvm.internal.n0 implements ld.l<Integer, n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, n0> f6301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0114g(ld.l<? super T, n0> lVar, List<? extends T> list) {
            super(1);
            this.f6301b = lVar;
            this.f6302c = list;
        }

        @fg.l
        public final n0 a(int i4) {
            return this.f6301b.invoke(this.f6302c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ n0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "index", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/p;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5\n*L\n1#1,463:1\n*E\n"})
    public static final class h extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, T, androidx.compose.runtime.t, Integer, k2> f6303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(ld.r<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, List<? extends T> list) {
            super(4);
            this.f6303b = rVar;
            this.f6304c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.staggeredgrid.p pVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(pVar) ? 4 : 2) | i5;
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
                androidx.compose.runtime.x.r0(-886456479, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:342)");
            }
            this.f6303b.i(pVar, this.f6304c.get(i4), tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.staggeredgrid.p pVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(pVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6\n*L\n1#1,463:1\n*E\n"})
    public static final class i extends kotlin.jvm.internal.n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final i f6305b = new i(1);

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

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1\n*L\n1#1,463:1\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f6306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6307c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f6306b = lVar;
            this.f6307c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f6306b.invoke(this.f6307c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8\n*L\n1#1,463:1\n*E\n"})
    public static final class k extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f6308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f6308b = lVar;
            this.f6309c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f6308b.invoke(this.f6309c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1\n*L\n1#1,463:1\n*E\n"})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<Integer, n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, n0> f6310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6311c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(ld.l<? super T, n0> lVar, T[] tArr) {
            super(1);
            this.f6310b = lVar;
            this.f6311c = tArr;
        }

        @fg.l
        public final n0 a(int i4) {
            return this.f6310b.invoke(this.f6311c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ n0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "index", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/p;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10\n*L\n1#1,463:1\n*E\n"})
    public static final class m extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, T, androidx.compose.runtime.t, Integer, k2> f6312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(ld.s<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, T[] tArr) {
            super(4);
            this.f6312b = sVar;
            this.f6313c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.staggeredgrid.p pVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(pVar) ? 4 : 2) | i5;
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
                androidx.compose.runtime.x.r0(-804487775, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:459)");
            }
            this.f6312b.a0(pVar, Integer.valueOf(i4), this.f6313c[i4], tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.staggeredgrid.p pVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(pVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1\n*L\n1#1,463:1\n*E\n"})
    public static final class n extends kotlin.jvm.internal.n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final n f6314b = new n(2);

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

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1\n*L\n1#1,463:1\n*E\n"})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f6315b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f6315b = pVar;
            this.f6316c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f6315b.invoke(Integer.valueOf(i4), this.f6316c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3\n*L\n1#1,463:1\n*E\n"})
    public static final class p extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f6317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f6317b = pVar;
            this.f6318c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f6317b.invoke(Integer.valueOf(i4), this.f6318c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1\n*L\n1#1,463:1\n*E\n"})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<Integer, n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, n0> f6319b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(ld.p<? super Integer, ? super T, n0> pVar, List<? extends T> list) {
            super(1);
            this.f6319b = pVar;
            this.f6320c = list;
        }

        @fg.l
        public final n0 a(int i4) {
            return this.f6319b.invoke(Integer.valueOf(i4), this.f6320c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ n0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "index", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/p;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5\n*L\n1#1,463:1\n*E\n"})
    public static final class r extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.staggeredgrid.p, Integer, T, androidx.compose.runtime.t, Integer, k2> f6321b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f6322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(ld.s<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, List<? extends T> list) {
            super(4);
            this.f6321b = sVar;
            this.f6322c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.staggeredgrid.p pVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(pVar) ? 4 : 2) | i5;
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
                androidx.compose.runtime.x.r0(284833944, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:381)");
            }
            this.f6321b.a0(pVar, Integer.valueOf(i4), this.f6322c.get(i4), tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.staggeredgrid.p pVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(pVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6\n*L\n1#1,463:1\n*E\n"})
    public static final class s extends kotlin.jvm.internal.n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final s f6323b = new s(2);

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

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1\n*L\n1#1,463:1\n*E\n"})
    static final class t extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f6324b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f6324b = pVar;
            this.f6325c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f6324b.invoke(Integer.valueOf(i4), this.f6325c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8\n*L\n1#1,463:1\n*E\n"})
    public static final class u extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f6326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f6326b = pVar;
            this.f6327c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f6326b.invoke(Integer.valueOf(i4), this.f6327c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1\n*L\n1#1,463:1\n*E\n"})
    static final class v extends kotlin.jvm.internal.n0 implements ld.l<Integer, n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, n0> f6328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f6329c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(ld.p<? super Integer, ? super T, n0> pVar, T[] tArr) {
            super(1);
            this.f6328b = pVar;
            this.f6329c = tArr;
        }

        @fg.l
        public final n0 a(int i4) {
            return this.f6328b.invoke(Integer.valueOf(i4), this.f6329c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ n0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "a", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/staggeredgrid/h0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,463:1\n51#2:464\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1\n*L\n105#1:464\n*E\n"})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f6330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f6331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.e f6332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(l1 l1Var, m0 m0Var, i.e eVar) {
            super(2);
            this.f6330b = l1Var;
            this.f6331c = m0Var;
            this.f6332d = eVar;
        }

        @fg.l
        public final h0 a(@fg.l androidx.compose.ui.unit.d dVar, long j4) {
            if (androidx.compose.ui.unit.b.p(j4) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
            }
            l1 l1Var = this.f6330b;
            androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
            int p4 = androidx.compose.ui.unit.b.p(j4) - dVar.q2(androidx.compose.ui.unit.h.g(j1.h(this.f6330b, wVar) + j1.i(l1Var, wVar)));
            m0 m0Var = this.f6331c;
            i.e eVar = this.f6332d;
            int[] a5 = m0Var.a(dVar, p4, dVar.q2(eVar.getSpacing()));
            int[] iArr = new int[a5.length];
            eVar.e(dVar, p4, a5, wVar, iArr);
            return new h0(iArr, a5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.b bVar) {
            return a(dVar, bVar.getValue());
        }
    }

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "a", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/staggeredgrid/h0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,463:1\n51#2:464\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n*L\n194#1:464\n*E\n"})
    static final class x extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f6333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f6334c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.m f6335d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(l1 l1Var, m0 m0Var, i.m mVar) {
            super(2);
            this.f6333b = l1Var;
            this.f6334c = m0Var;
            this.f6335d = mVar;
        }

        @fg.l
        public final h0 a(@fg.l androidx.compose.ui.unit.d dVar, long j4) {
            if (androidx.compose.ui.unit.b.o(j4) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
            }
            int o4 = androidx.compose.ui.unit.b.o(j4) - dVar.q2(androidx.compose.ui.unit.h.g(this.f6333b.getBottom() + this.f6333b.getTop()));
            m0 m0Var = this.f6334c;
            i.m mVar = this.f6335d;
            int[] a5 = m0Var.a(dVar, o4, dVar.q2(mVar.getSpacing()));
            int[] iArr = new int[a5.length];
            mVar.d(dVar, o4, a5, iArr);
            return new h0(iArr, a5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.b bVar) {
            return a(dVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.foundation.lazy.staggeredgrid.m0 r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.staggeredgrid.j0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, @fg.m androidx.compose.foundation.layout.i.m r33, float r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.staggeredgrid.b0, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.g.a(androidx.compose.foundation.lazy.staggeredgrid.m0, androidx.compose.ui.q, androidx.compose.foundation.lazy.staggeredgrid.j0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$m, float, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.foundation.lazy.staggeredgrid.m0 r28, @fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.staggeredgrid.j0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, float r33, @fg.m androidx.compose.foundation.layout.i.e r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.staggeredgrid.b0, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.g.b(androidx.compose.foundation.lazy.staggeredgrid.m0, androidx.compose.ui.q, androidx.compose.foundation.lazy.staggeredgrid.j0, androidx.compose.foundation.layout.l1, boolean, float, androidx.compose.foundation.layout.i$e, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void c(@fg.l b0 b0Var, @fg.l List<? extends T> list, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.m ld.l<? super T, n0> lVar3, @fg.l ld.r<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        b0Var.o(list.size(), lVar != null ? new e(lVar, list) : null, new f(lVar2, list), lVar3 != null ? new C0114g(lVar3, list) : null, new androidx.compose.runtime.internal.b(-886456479, true, new h(rVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void d(@fg.l b0 b0Var, @fg.l T[] tArr, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.m ld.l<? super T, n0> lVar3, @fg.l ld.r<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        b0Var.o(tArr.length, lVar != null ? new j(lVar, tArr) : null, new k(lVar2, tArr), lVar3 != null ? new l(lVar3, tArr) : null, new androidx.compose.runtime.internal.b(2101296000, true, new c(rVar, tArr)));
    }

    public static void e(b0 b0Var, List list, ld.l lVar, ld.l lVar2, ld.l lVar3, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar2 = d.f6296b;
        }
        if ((i4 & 8) != 0) {
            lVar3 = null;
        }
        b0Var.o(list.size(), lVar != null ? new e(lVar, list) : null, new f(lVar2, list), lVar3 != null ? new C0114g(lVar3, list) : null, new androidx.compose.runtime.internal.b(-886456479, true, new h(rVar, list)));
    }

    public static void f(b0 b0Var, Object[] objArr, ld.l lVar, ld.l lVar2, ld.l lVar3, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar2 = i.f6305b;
        }
        if ((i4 & 8) != 0) {
            lVar3 = null;
        }
        b0Var.o(objArr.length, lVar != null ? new j(lVar, objArr) : null, new k(lVar2, objArr), lVar3 != null ? new l(lVar3, objArr) : null, new androidx.compose.runtime.internal.b(2101296000, true, new c(rVar, objArr)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void g(@fg.l b0 b0Var, @fg.l List<? extends T> list, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.m ld.p<? super Integer, ? super T, n0> pVar3, @fg.l ld.s<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        b0Var.o(list.size(), pVar != null ? new o(pVar, list) : null, new p(pVar2, list), pVar3 != null ? new q(pVar3, list) : null, new androidx.compose.runtime.internal.b(284833944, true, new r(sVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void h(@fg.l b0 b0Var, @fg.l T[] tArr, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.m ld.p<? super Integer, ? super T, n0> pVar3, @fg.l ld.s<? super androidx.compose.foundation.lazy.staggeredgrid.p, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        b0Var.o(tArr.length, pVar != null ? new t(pVar, tArr) : null, new u(pVar2, tArr), pVar3 != null ? new v(pVar3, tArr) : null, new androidx.compose.runtime.internal.b(-804487775, true, new m(sVar, tArr)));
    }

    public static void i(b0 b0Var, List list, ld.p pVar, ld.p pVar2, ld.p pVar3, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar2 = n.f6314b;
        }
        if ((i4 & 8) != 0) {
            pVar3 = null;
        }
        b0Var.o(list.size(), pVar != null ? new o(pVar, list) : null, new p(pVar2, list), pVar3 != null ? new q(pVar3, list) : null, new androidx.compose.runtime.internal.b(284833944, true, new r(sVar, list)));
    }

    public static void j(b0 b0Var, Object[] objArr, ld.p pVar, ld.p pVar2, ld.p pVar3, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar2 = s.f6323b;
        }
        if ((i4 & 8) != 0) {
            pVar3 = null;
        }
        b0Var.o(objArr.length, pVar != null ? new t(pVar, objArr) : null, new u(pVar2, objArr), pVar3 != null ? new v(pVar3, objArr) : null, new androidx.compose.runtime.internal.b(-804487775, true, new m(sVar, objArr)));
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.foundation.lazy.staggeredgrid.b k(m0 m0Var, i.e eVar, l1 l1Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1267076841);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1267076841, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        tVar.P(1618982084);
        boolean q02 = tVar.q0(m0Var) | tVar.q0(eVar) | tVar.q0(l1Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new g0(new w(l1Var, m0Var, eVar));
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.foundation.lazy.staggeredgrid.b bVar = (androidx.compose.foundation.lazy.staggeredgrid.b) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return bVar;
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.foundation.lazy.staggeredgrid.b l(m0 m0Var, i.m mVar, l1 l1Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1532383053);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1532383053, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        tVar.P(1618982084);
        boolean q02 = tVar.q0(m0Var) | tVar.q0(mVar) | tVar.q0(l1Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new g0(new x(l1Var, m0Var, mVar));
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.foundation.lazy.staggeredgrid.b bVar = (androidx.compose.foundation.lazy.staggeredgrid.b) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return bVar;
    }
}
