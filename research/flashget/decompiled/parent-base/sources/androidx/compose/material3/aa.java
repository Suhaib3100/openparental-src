package androidx.compose.material3;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001am\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aq\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u0014*\u00020\u00142\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material3/ca;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/r0;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/material3/ba;", "d", "(Landroidx/compose/material3/ca;Lld/l;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/ba;", "state", "Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "background", "dismissContent", "Landroidx/compose/ui/q;", "modifier", "", "directions", "a", "(Landroidx/compose/material3/ba;Lld/q;Lld/q;Landroidx/compose/ui/q;Ljava/util/Set;Landroidx/compose/runtime/t;II)V", "backgroundContent", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "content", "b", "(Landroidx/compose/material3/ba;Lld/q;Landroidx/compose/ui/q;ZZLld/q;Landroidx/compose/runtime/t;II)V", "e", "(Landroidx/compose/ui/q;Landroidx/compose/material3/ba;ZZ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "F", "DismissThreshold", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,480:1\n74#2:481\n74#2:488\n1116#3,6:482\n68#4,6:489\n74#4:523\n78#4:608\n78#5,11:495\n78#5,11:530\n91#5:562\n78#5,11:570\n91#5:602\n91#5:607\n456#6,8:506\n464#6,3:520\n456#6,8:541\n464#6,3:555\n467#6,3:559\n456#6,8:581\n464#6,3:595\n467#6,3:599\n467#6,3:604\n3737#7,6:514\n3737#7,6:549\n3737#7,6:589\n87#8,6:524\n93#8:558\n97#8:563\n87#8,6:564\n93#8:598\n97#8:603\n154#9:609\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n221#1:481\n294#1:488\n228#1:482,6\n296#1:489,6\n296#1:523\n296#1:608\n296#1:495,11\n306#1:530,11\n306#1:562\n310#1:570,11\n310#1:602\n296#1:607\n296#1:506,8\n296#1:520,3\n306#1:541,8\n306#1:555,3\n306#1:559,3\n310#1:581,8\n310#1:595,3\n310#1:599,3\n296#1:604,3\n296#1:514,6\n306#1:549,6\n310#1:589,6\n306#1:524,6\n306#1:558\n306#1:563\n310#1:564,6\n310#1:598\n310#1:603\n378#1:609\n*E\n"})
/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static final float f9801a = androidx.compose.ui.unit.h.g(125);

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ba f9802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f9803c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f9804d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9805e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set<ca> f9806f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9807g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9808h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ba baVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.ui.q qVar3, Set<? extends ca> set, int i4, int i5) {
            super(2);
            this.f9802b = baVar;
            this.f9803c = qVar;
            this.f9804d = qVar2;
            this.f9805e = qVar3;
            this.f9806f = set;
            this.f9807g = i4;
            this.f9808h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            aa.a(this.f9802b, this.f9803c, this.f9804d, this.f9805e, this.f9806f, tVar, androidx.compose.runtime.g3.b(this.f9807g | 1), this.f9808h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ba f9809b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f9810c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9811d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9812e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9813f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f9814g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9815h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9816i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ba baVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, boolean z4, boolean z5, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, int i4, int i5) {
            super(2);
            this.f9809b = baVar;
            this.f9810c = qVar;
            this.f9811d = qVar2;
            this.f9812e = z4;
            this.f9813f = z5;
            this.f9814g = qVar3;
            this.f9815h = i4;
            this.f9816i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            aa.b(this.f9809b, this.f9810c, this.f9811d, this.f9812e, this.f9813f, this.f9814g, tVar, androidx.compose.runtime.g3.b(this.f9815h | 1), this.f9816i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<ca, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f9817b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l ca caVar) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(ca caVar) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/ba;", "a", "()Landroidx/compose/material3/ba;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<ba> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ca f9818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f9819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<ca, Boolean> f9820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, Float> f9821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ca caVar, androidx.compose.ui.unit.d dVar, ld.l<? super ca, Boolean> lVar, ld.l<? super Float, Float> lVar2) {
            super(0);
            this.f9818b = caVar;
            this.f9819c = dVar;
            this.f9820d = lVar;
            this.f9821e = lVar2;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba invoke() {
            return new ba(this.f9818b, this.f9819c, this.f9820d, this.f9821e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.WARNING, message = "Use SwipeToDismissBox instead", replaceWith = @kotlin.x0(expression = "SwipeToDismissBox(state, background, modifier, enableDismissFromStartToEnd, enableDismissFromEndToStart, dismissContent)", imports = {}))
    @androidx.compose.material3.f5
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.material3.ba r17, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r18, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r19, @fg.m androidx.compose.ui.q r20, @fg.m java.util.Set<? extends androidx.compose.material3.ca> r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.aa.a(androidx.compose.material3.ba, ld.q, ld.q, androidx.compose.ui.q, java.util.Set, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007e  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.material3.ba r20, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.ui.q r22, boolean r23, boolean r24, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.aa.b(androidx.compose.material3.ba, ld.q, androidx.compose.ui.q, boolean, boolean, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final ba d(@fg.m ca caVar, @fg.m ld.l<? super ca, Boolean> lVar, @fg.m ld.l<? super Float, Float> lVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-246335487);
        if ((i5 & 1) != 0) {
            caVar = ca.Settled;
        }
        if ((i5 & 2) != 0) {
            lVar = c.f9817b;
        }
        if ((i5 & 4) != 0) {
            lVar2 = z9.f15862a.a(tVar, 6);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-246335487, i4, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:219)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<ba, ca> a5 = ba.INSTANCE.a(lVar, lVar2, dVar);
        tVar.P(-1012845646);
        boolean q02 = (((6 ^ (i4 & 14)) > 4 && tVar.q0(caVar)) || (i4 & 6) == 4) | tVar.q0(dVar) | ((((i4 & 112) ^ 48) > 32 && tVar.q0(lVar)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && tVar.q0(lVar2)) || (i4 & 384) == 256);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new d(caVar, dVar, lVar, lVar2);
            tVar.E(Q);
        }
        tVar.p0();
        ba baVar = (ba) androidx.compose.runtime.saveable.d.d(objArr, a5, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return baVar;
    }

    private static final androidx.compose.ui.q e(androidx.compose.ui.q qVar, ba baVar, boolean z4, boolean z5) {
        return qVar.w3(new SwipeToDismissAnchorsElement(baVar, z4, z5));
    }
}
