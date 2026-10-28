package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a>\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001b\u0010\u0018\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a:\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "n", "(Landroidx/compose/ui/q;FFFF)Landroidx/compose/ui/q;", "horizontal", "vertical", "l", "(Landroidx/compose/ui/q;FF)Landroidx/compose/ui/q;", "all", "k", "(Landroidx/compose/ui/q;F)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "j", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/l1;)Landroidx/compose/ui/q;", "left", "right", "f", "Landroidx/compose/ui/unit/w;", "layoutDirection", "i", "(Landroidx/compose/foundation/layout/l1;Landroidx/compose/ui/unit/w;)F", "h", "a", "(F)Landroidx/compose/foundation/layout/l1;", "b", "(FF)Landroidx/compose/foundation/layout/l1;", "d", "(FFFF)Landroidx/compose/foundation/layout/l1;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:481\n154#2:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n50#1:468\n51#1:469\n52#1:470\n53#1:471\n83#1:472\n84#1:473\n156#1:474\n157#1:475\n158#1:476\n159#1:477\n275#1:478\n285#1:479\n286#1:480\n287#1:481\n288#1:482\n*E\n"})
/* loaded from: classes.dex */
public final class j1 {

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f5124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f5125d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f5126e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, float f5, float f6, float f7) {
            super(1);
            this.f5123b = f4;
            this.f5124c = f5;
            this.f5125d = f6;
            this.f5126e = f7;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("absolutePadding");
            androidx.compose.foundation.s1.a(this.f5125d, androidx.compose.foundation.s1.a(this.f5124c, androidx.compose.foundation.s1.a(this.f5123b, a2Var.getProperties(), "left", a2Var), "top", a2Var), "right", a2Var).c("bottom", androidx.compose.ui.unit.h.d(this.f5126e));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f5128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f5129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f5130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f4, float f5, float f6, float f7) {
            super(1);
            this.f5127b = f4;
            this.f5128c = f5;
            this.f5129d = f6;
            this.f5130e = f7;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("padding");
            androidx.compose.foundation.s1.a(this.f5129d, androidx.compose.foundation.s1.a(this.f5128c, androidx.compose.foundation.s1.a(this.f5127b, a2Var.getProperties(), "start", a2Var), "top", a2Var), "end", a2Var).c("bottom", androidx.compose.ui.unit.h.d(this.f5130e));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f5132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f4, float f5) {
            super(1);
            this.f5131b = f4;
            this.f5132c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("padding");
            androidx.compose.foundation.s1.a(this.f5131b, a2Var.getProperties(), "horizontal", a2Var).c("vertical", androidx.compose.ui.unit.h.d(this.f5132c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5133b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f4) {
            super(1);
            this.f5133b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("padding");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f5133b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f5134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l1 l1Var) {
            super(1);
            this.f5134b = l1Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("padding");
            a2Var.getProperties().c("paddingValues", this.f5134b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final l1 a(float f4) {
        return new n1(f4, f4, f4, f4, null);
    }

    @x4
    @fg.l
    public static final l1 b(float f4, float f5) {
        return new n1(f4, f5, f4, f5, null);
    }

    public static /* synthetic */ l1 c(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        return b(f4, f5);
    }

    @x4
    @fg.l
    public static final l1 d(float f4, float f5, float f6, float f7) {
        return new n1(f4, f5, f6, f7, null);
    }

    public static /* synthetic */ l1 e(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return d(f4, f5, f6, f7);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7) {
        return qVar.w3(new PaddingElement(f4, f5, f6, f7, false, new a(f4, f5, f6, f7), null));
    }

    public static /* synthetic */ androidx.compose.ui.q g(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return f(qVar, f4, f5, f6, f7);
    }

    @x4
    public static final float h(@fg.l l1 l1Var, @fg.l androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? l1Var.c(wVar) : l1Var.b(wVar);
    }

    @x4
    public static final float i(@fg.l l1 l1Var, @fg.l androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? l1Var.b(wVar) : l1Var.c(wVar);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar, @fg.l l1 l1Var) {
        return qVar.w3(new PaddingValuesElement(l1Var, new e(l1Var)));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q k(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new PaddingElement(f4, f4, f4, f4, true, new d(f4), null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q l(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new PaddingElement(f4, f5, f4, f5, true, new c(f4, f5), null));
    }

    public static /* synthetic */ androidx.compose.ui.q m(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        return l(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q n(@fg.l androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7) {
        return qVar.w3(new PaddingElement(f4, f5, f6, f7, true, new b(f4, f5, f6, f7), null));
    }

    public static /* synthetic */ androidx.compose.ui.q o(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return n(qVar, f4, f5, f6, f7);
    }
}
