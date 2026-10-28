package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u00020\b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u00020\b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0017\u0010%\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0017\u0010'\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0017\u0010)\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,²\u0006\f\u0010*\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/ma;", "", "<init>", "()V", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/unit/h;", "height", "Landroidx/compose/ui/graphics/d2;", "color", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/q;FJLandroidx/compose/runtime/t;II)V", "width", "Landroidx/compose/ui/graphics/e6;", "shape", "b", "(Landroidx/compose/ui/q;FFJLandroidx/compose/ui/graphics/e6;Landroidx/compose/runtime/t;II)V", "c", "Landroidx/compose/material3/ka;", "currentTabPosition", "m", "(Landroidx/compose/ui/q;Landroidx/compose/material3/ka;)Landroidx/compose/ui/q;", "F", "j", "()F", "ScrollableTabRowEdgeStartPadding", "d", "(Landroidx/compose/runtime/t;I)J", "e", "containerColor", "f", "g", "contentColor", "h", "primaryContainerColor", "k", "secondaryContainerColor", "i", "primaryContentColor", "l", "secondaryContentColor", "currentTabWidth", "indicatorOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1223:1\n154#2:1224\n154#2:1226\n135#3:1225\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1085#1:1224\n1003#1:1226\n1130#1:1225\n*E\n"})
/* loaded from: classes.dex */
public final class ma {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final ma f12561a = new ma();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ScrollableTabRowEdgeStartPadding = androidx.compose.ui.unit.h.g(52);

    /* renamed from: c, reason: collision with root package name */
    public static final int f12563c = 0;

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12566d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12567e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12568f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12569g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.q qVar, float f4, long j4, int i4, int i5) {
            super(2);
            this.f12565c = qVar;
            this.f12566d = f4;
            this.f12567e = j4;
            this.f12568f = i4;
            this.f12569g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ma.this.a(this.f12565c, this.f12566d, this.f12567e, tVar, androidx.compose.runtime.g3.b(this.f12568f | 1), this.f12569g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f12573e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12574f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12575g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12576h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12577i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.q qVar, float f4, float f5, long j4, androidx.compose.ui.graphics.e6 e6Var, int i4, int i5) {
            super(2);
            this.f12571c = qVar;
            this.f12572d = f4;
            this.f12573e = f5;
            this.f12574f = j4;
            this.f12575g = e6Var;
            this.f12576h = i4;
            this.f12577i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ma.this.b(this.f12571c, this.f12572d, this.f12573e, this.f12574f, this.f12575g, tVar, androidx.compose.runtime.g3.b(this.f12576h | 1), this.f12577i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12580d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12581e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12583g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.q qVar, float f4, long j4, int i4, int i5) {
            super(2);
            this.f12579c = qVar;
            this.f12580d = f4;
            this.f12581e = j4;
            this.f12582f = i4;
            this.f12583g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ma.this.c(this.f12579c, this.f12580d, this.f12581e, tVar, androidx.compose.runtime.g3.b(this.f12582f | 1), this.f12583g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1#1,170:1\n1131#2,3:171\n*E\n"})
    public static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ka f12584b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ka kaVar) {
            super(1);
            this.f12584b = kaVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("tabIndicatorOffset");
            a2Var.e(this.f12584b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1223:1\n81#2:1224\n81#2:1225\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n*L\n1135#1:1224\n1139#1:1225\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ka f12585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ka kaVar) {
            super(3);
            this.f12585b = kaVar;
        }

        private static final float b(androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var) {
            return b5Var.getValue().u();
        }

        private static final float c(androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var) {
            return b5Var.getValue().u();
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1541271084);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1541271084, i4, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1134)");
            }
            androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c5 = androidx.compose.animation.core.d.c(this.f12585b.getWidth(), androidx.compose.animation.core.l.r(250, 0, androidx.compose.animation.core.m0.d(), 2, null), null, null, tVar, 0, 12);
            androidx.compose.ui.q B = androidx.compose.foundation.layout.c2.B(androidx.compose.foundation.layout.f1.f(androidx.compose.foundation.layout.c2.H(androidx.compose.foundation.layout.c2.h(qVar, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.g(), false, 2, null), c(androidx.compose.animation.core.d.c(this.f12585b.getLeft(), androidx.compose.animation.core.l.r(250, 0, androidx.compose.animation.core.m0.d(), 2, null), null, null, tVar, 0, 12)), 0.0f, 2, null), b(c5));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return B;
        }
    }

    private ma() {
    }

    @kotlin.k(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @kotlin.x0(expression = "primaryContainerColor", imports = {}))
    public static /* synthetic */ void e() {
    }

    @kotlin.k(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @kotlin.x0(expression = "primaryContentColor", imports = {}))
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(message = "Use SecondaryIndicator instead.", replaceWith = @kotlin.x0(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.m androidx.compose.ui.q r16, float r17, long r18, @fg.m androidx.compose.runtime.t r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ma.a(androidx.compose.ui.q, float, long, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@fg.m androidx.compose.ui.q r17, float r18, float r19, long r20, @fg.m androidx.compose.ui.graphics.e6 r22, @fg.m androidx.compose.runtime.t r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ma.b(androidx.compose.ui.q, float, float, long, androidx.compose.ui.graphics.e6, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@fg.m androidx.compose.ui.q r16, float r17, long r18, @fg.m androidx.compose.runtime.t r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ma.c(androidx.compose.ui.q, float, long, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2026555673);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2026555673, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1011)");
        }
        long k4 = b3.k(c0.t0.f38146a.l(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContentColor")
    public final long f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1163072359);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1163072359, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1030)");
        }
        long k4 = b3.k(c0.t0.f38146a.i(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getPrimaryContainerColor")
    public final long h(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2069154037);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2069154037, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1016)");
        }
        long k4 = b3.k(c0.t0.f38146a.l(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getPrimaryContentColor")
    public final long i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1410362619);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1410362619, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1035)");
        }
        long k4 = b3.k(c0.t0.f38146a.i(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float j() {
        return ScrollableTabRowEdgeStartPadding;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getSecondaryContainerColor")
    public final long k(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1938007129);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1938007129, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1021)");
        }
        long k4 = b3.k(c0.z0.f38425a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getSecondaryContentColor")
    public final long l(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1166419479);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1166419479, i4, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1040)");
        }
        long k4 = b3.k(c0.z0.f38425a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    public final androidx.compose.ui.q m(@fg.l androidx.compose.ui.q qVar, @fg.l ka kaVar) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new d(kaVar) : androidx.compose.ui.platform.y1.b(), new e(kaVar));
    }
}
