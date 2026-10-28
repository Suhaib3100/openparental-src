package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a*\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "x", "y", "e", "(Landroidx/compose/ui/q;FF)Landroidx/compose/ui/q;", "b", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "Lkotlin/u;", "offset", "d", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "a", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n154#2:257\n154#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
/* loaded from: classes.dex */
public final class f1 {

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f5017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, float f5) {
            super(1);
            this.f5016b = f4;
            this.f5017c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("absoluteOffset");
            androidx.compose.foundation.s1.a(this.f5016b, a2Var.getProperties(), "x", a2Var).c("y", androidx.compose.ui.unit.h.d(this.f5017c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f5018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
            super(1);
            this.f5018b = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("absoluteOffset");
            a2Var.getProperties().c("offset", this.f5018b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f5020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f4, float f5) {
            super(1);
            this.f5019b = f4;
            this.f5020c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("offset");
            androidx.compose.foundation.s1.a(this.f5019b, a2Var.getProperties(), "x", a2Var).c("y", androidx.compose.ui.unit.h.d(this.f5020c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f5021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
            super(1);
            this.f5021b = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("offset");
            a2Var.getProperties().c("offset", this.f5021b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
        return qVar.w3(new OffsetPxElement(lVar, false, new b(lVar)));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new OffsetElement(f4, f5, false, new a(f4, f5), null));
    }

    public static /* synthetic */ androidx.compose.ui.q c(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        return b(qVar, f4, f5);
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
        return qVar.w3(new OffsetPxElement(lVar, true, new d(lVar)));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new OffsetElement(f4, f5, true, new c(f4, f5), null));
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        return e(qVar, f4, f5);
    }
}
