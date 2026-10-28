package androidx.compose.foundation;

import android.os.Build;
import kotlin.Metadata;

/* compiled from: Magnifier.android.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0094\u0001\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¬\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Li0/f;", "Lkotlin/u;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/l;", "Lkotlin/k2;", "onSizeChanged", "", "zoom", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "", "clip", "d", "(Landroidx/compose/ui/q;Lld/l;Lld/l;Lld/l;FJFFZ)Landroidx/compose/ui/q;", "useTextDefault", "clippingEnabled", "Landroidx/compose/foundation/l2;", "platformMagnifierFactory", "f", "(Landroidx/compose/ui/q;Lld/l;Lld/l;Lld/l;FZJFFZLandroidx/compose/foundation/l2;)Landroidx/compose/ui/q;", "", "sdkVersion", "b", "(I)Z", "Landroidx/compose/ui/semantics/y;", "Lkotlin/Function0;", "a", "Landroidx/compose/ui/semantics/y;", "()Landroidx/compose/ui/semantics/y;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,467:1\n135#2:468\n146#2:469\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n*L\n156#1:468\n154#1:469\n*E\n"})
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.semantics.y<ld.a<i0.f>> f9095a = new androidx.compose.ui.semantics.y<>("MagnifierPositionInRoot", null, 2, null);

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n*L\n1#1,170:1\n157#2,9:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l f9096b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l f9097c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9098d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f9099e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f9100f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f9101g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9102h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.l lVar, ld.l lVar2, float f4, long j4, float f5, float f6, boolean z4) {
            super(1);
            this.f9096b = lVar;
            this.f9097c = lVar2;
            this.f9098d = f4;
            this.f9099e = j4;
            this.f9100f = f5;
            this.f9101g = f6;
            this.f9102h = z4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("magnifier (not supported)");
            a2Var.getProperties().c("sourceCenter", this.f9096b);
            a2Var.getProperties().c("magnifierCenter", this.f9097c);
            a2Var.getProperties().c("zoom", Float.valueOf(this.f9098d));
            a2Var.getProperties().c("size", androidx.compose.ui.unit.l.c(this.f9099e));
            s1.a(this.f9101g, s1.a(this.f9100f, a2Var.getProperties(), "cornerRadius", a2Var), "elevation", a2Var).c("clippingEnabled", Boolean.valueOf(this.f9102h));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    @fg.l
    public static final androidx.compose.ui.semantics.y<ld.a<i0.f>> a() {
        return f9095a;
    }

    @androidx.annotation.k(api = 28)
    public static final boolean b(int i4) {
        return i4 >= 28;
    }

    public static /* synthetic */ boolean c(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Build.VERSION.SDK_INT;
        }
        return b(i4);
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar, @fg.m ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar2, @fg.m ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar3, float f4, long j4, float f5, float f6, boolean z4) {
        return g(qVar, lVar, lVar2, lVar3, f4, false, j4, f5, f6, z4, null, 512, null);
    }

    public static androidx.compose.ui.q e(androidx.compose.ui.q qVar, ld.l lVar, ld.l lVar2, ld.l lVar3, float f4, long j4, float f5, float f6, boolean z4, int i4, Object obj) {
        long j5;
        float f7;
        float f10;
        ld.l lVar4 = (i4 & 2) != 0 ? null : lVar2;
        ld.l lVar5 = (i4 & 4) == 0 ? lVar3 : null;
        float f11 = (i4 & 8) != 0 ? Float.NaN : f4;
        if ((i4 & 16) != 0) {
            androidx.compose.ui.unit.l.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.l.f21515d;
        } else {
            j5 = j4;
        }
        if ((i4 & 32) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f7 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f7 = f5;
        }
        if ((i4 & 64) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f10 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f10 = f6;
        }
        return d(qVar, lVar, lVar4, lVar5, f11, j5, f7, f10, (i4 & 128) != 0 ? true : z4);
    }

    @fg.l
    public static final androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar, @fg.m ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar2, @fg.m ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, @fg.m l2 l2Var) {
        if (c(0, 1, null)) {
            return qVar.w3(new MagnifierElement(lVar, lVar2, lVar3, f4, z4, j4, f5, f6, z5, l2Var == null ? l2.INSTANCE.a() : l2Var, null));
        }
        return androidx.compose.ui.platform.y1.d(qVar, androidx.compose.ui.platform.y1.e() ? new a(lVar, lVar2, f4, j4, f5, f6, z5) : androidx.compose.ui.platform.y1.b(), androidx.compose.ui.q.INSTANCE);
    }

    public static androidx.compose.ui.q g(androidx.compose.ui.q qVar, ld.l lVar, ld.l lVar2, ld.l lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, l2 l2Var, int i4, Object obj) {
        long j5;
        float f7;
        float f10;
        ld.l lVar4 = (i4 & 2) != 0 ? null : lVar2;
        ld.l lVar5 = (i4 & 4) != 0 ? null : lVar3;
        float f11 = (i4 & 8) != 0 ? Float.NaN : f4;
        boolean z6 = (i4 & 16) != 0 ? false : z4;
        if ((i4 & 32) != 0) {
            androidx.compose.ui.unit.l.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.l.f21515d;
        } else {
            j5 = j4;
        }
        if ((i4 & 64) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f7 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f7 = f5;
        }
        if ((i4 & 128) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f10 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f10 = f6;
        }
        return f(qVar, lVar, lVar4, lVar5, f11, z6, j5, f7, f10, (i4 & 256) != 0 ? true : z5, (i4 & 512) == 0 ? l2Var : null);
    }
}
