package androidx.compose.material3;

import kotlin.Metadata;
import r.a;

/* compiled from: SegmentedButton.kt */
@androidx.compose.runtime.x4
@f5
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008a\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 JC\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0013\b\u0002\u0010%\u001a\r\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b$2\u0015\b\u0002\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0018\u00010#¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b'\u0010(J\"\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u001d\u00102\u001a\u00020*8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u001d\u00104\u001a\u00020*8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b3\u00101R\u0018\u00108\u001a\u00020\u0004*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u001a\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/material3/o8;", "", "<init>", "()V", "Landroidx/compose/material3/m8;", "e", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/m8;", "Landroidx/compose/ui/graphics/d2;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "f", "(JJJJJJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/m8;", "", "index", "count", "Landroidx/compose/foundation/shape/e;", "baseShape", "Landroidx/compose/ui/graphics/e6;", "k", "(IILandroidx/compose/foundation/shape/e;Landroidx/compose/runtime/t;II)Landroidx/compose/ui/graphics/e6;", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V", "", "active", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "activeContent", "inactiveContent", "b", "(ZLld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "color", "Landroidx/compose/ui/unit/h;", "width", "Landroidx/compose/foundation/c0;", "c", "(JF)Landroidx/compose/foundation/c0;", "F", "h", "()F", "BorderWidth", "j", "IconSize", "Landroidx/compose/material3/a3;", "i", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/m8;", "defaultSegmentedButtonColors", "g", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/shape/e;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o8 f12930a = new o8();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float BorderWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12933d = 0;

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12935c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f12935c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            o8.this.a(tVar, androidx.compose.runtime.g3.b(this.f12935c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(3);
            this.f12936b = pVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.animation.s sVar, androidx.compose.runtime.t tVar, Integer num) {
            a(sVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.animation.s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-750750819, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:585)");
            }
            if (androidx.compose.animation.r.a(0, this.f12936b, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(ZLandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<Boolean, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(3);
            this.f12937b = pVar;
            this.f12938c = pVar2;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(Boolean bool, androidx.compose.runtime.t tVar, Integer num) {
            a(bool.booleanValue(), tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.i
        public final void a(boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar;
            if ((i4 & 6) == 0) {
                i4 |= tVar.b(z4) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1364873619, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:589)");
            }
            if (z4) {
                tVar.P(-412602680);
                pVar = this.f12937b;
            } else {
                tVar.P(-412602659);
                pVar = this.f12938c;
            }
            pVar.invoke(tVar, 0);
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12940c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12941d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12942e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12943f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12944g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f12940c = z4;
            this.f12941d = pVar;
            this.f12942e = pVar2;
            this.f12943f = i4;
            this.f12944g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            o8.this.b(this.f12940c, this.f12941d, this.f12942e, tVar, androidx.compose.runtime.g3.b(this.f12943f | 1), this.f12944g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        c0.p0 p0Var = c0.p0.f37871a;
        BorderWidth = p0Var.k();
        IconSize = p0Var.h();
    }

    private o8() {
    }

    public static androidx.compose.foundation.c0 d(o8 o8Var, long j4, float f4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = BorderWidth;
        }
        o8Var.getClass();
        return androidx.compose.foundation.d0.a(f4, j4);
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1273041460);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(this) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1273041460, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:553)");
            }
            v5.c(x.k.a(a.b.f89546a), null, androidx.compose.foundation.layout.c2.w(androidx.compose.ui.q.INSTANCE, IconSize), 0L, o4, 48, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e  */
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r17, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r18, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r19, @fg.m androidx.compose.runtime.t r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.o8.b(boolean, ld.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    public final androidx.compose.foundation.c0 c(long color, float width) {
        return androidx.compose.foundation.d0.a(width, color);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final m8 e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(679457321);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(679457321, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:438)");
        }
        m8 i5 = i(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final m8 f(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        tVar.P(132526205);
        if ((i6 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j4;
        }
        if ((i6 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j5;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j6;
        }
        if ((i6 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j7;
        }
        if ((i6 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j22 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j22 = j10;
        }
        if ((i6 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j23 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j23 = j11;
        }
        if ((i6 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j24 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j24 = j12;
        }
        if ((i6 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j25 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j25 = j13;
        }
        if ((i6 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j26 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j26 = j14;
        }
        if ((i6 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j27 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j27 = j15;
        }
        if ((i6 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j28 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j28 = j16;
        }
        if ((i6 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j29 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j29 = j17;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(132526205, i4, i5, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:474)");
        }
        m8 d5 = i(p6.f13227a.a(tVar, 6)).d(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @androidx.compose.runtime.d3
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getBaseShape")
    public final androidx.compose.foundation.shape.e g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1264240381, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:518)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.p0.f37871a.u(), tVar, 6);
        kotlin.jvm.internal.l0.n(e4, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) e4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return eVar;
    }

    public final float h() {
        return BorderWidth;
    }

    @fg.l
    public final m8 i(@fg.l a3 a3Var) {
        m8 defaultSegmentedButtonColorsCached = a3Var.getDefaultSegmentedButtonColorsCached();
        if (defaultSegmentedButtonColorsCached != null) {
            return defaultSegmentedButtonColorsCached;
        }
        c0.p0 p0Var = c0.p0.f37871a;
        m8 m8Var = new m8(b3.h(a3Var, p0Var.l()), b3.h(a3Var, p0Var.r()), b3.h(a3Var, p0Var.j()), a3Var.getSurface(), b3.h(a3Var, p0Var.A()), b3.h(a3Var, p0Var.j()), b3.h(a3Var, p0Var.l()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, p0Var.d()), p0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, p0Var.j()), p0Var.g(), 0.0f, 0.0f, 0.0f, 14, null), a3Var.getSurface(), b3.h(a3Var, p0Var.d()), b3.h(a3Var, p0Var.j()), null);
        a3Var.c1(m8Var);
        return m8Var;
    }

    public final float j() {
        return IconSize;
    }

    @fg.l
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public final androidx.compose.ui.graphics.e6 k(int i4, int i5, @fg.m androidx.compose.foundation.shape.e eVar, @fg.m androidx.compose.runtime.t tVar, int i6, int i7) {
        if ((i7 & 4) != 0) {
            eVar = g(tVar, (i6 >> 9) & 14);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-942072063, i6, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:534)");
        }
        if (i5 == 1) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            return eVar;
        }
        androidx.compose.ui.graphics.e6 f4 = i4 == 0 ? x8.f(eVar) : i4 == i5 - 1 ? x8.b(eVar) : androidx.compose.ui.graphics.r5.a();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return f4;
    }
}
