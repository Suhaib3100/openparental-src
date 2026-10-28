package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a0\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/unit/h;", "thickness", "Landroidx/compose/ui/graphics/d2;", "color", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/q;FJLandroidx/compose/runtime/t;II)V", "c", "a", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,118:1\n1116#2,6:119\n1116#2,6:125\n74#3:131\n174#4:132\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n52#1:119,6\n78#1:125,6\n98#1:131\n98#1:132\n*E\n"})
/* loaded from: classes.dex */
public final class r4 {

    /* compiled from: Divider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13987c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13988d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13989e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.q qVar, float f4, long j4, int i4, int i5) {
            super(2);
            this.f13986b = qVar;
            this.f13987c = f4;
            this.f13988d = j4;
            this.f13989e = i4;
            this.f13990f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r4.a(this.f13986b, this.f13987c, this.f13988d, tVar, androidx.compose.runtime.g3.b(this.f13989e | 1), this.f13990f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Divider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f4, long j4) {
            super(1);
            this.f13991b = f4;
            this.f13992c = j4;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float f4 = 2;
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, this.f13992c, i0.g.a(0.0f, fVar.v5(this.f13991b) / f4), i0.g.a(i0.n.t(fVar.e()), fVar.v5(this.f13991b) / f4), fVar.v5(this.f13991b), 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Divider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13995d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13996e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13997f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.q qVar, float f4, long j4, int i4, int i5) {
            super(2);
            this.f13993b = qVar;
            this.f13994c = f4;
            this.f13995d = j4;
            this.f13996e = i4;
            this.f13997f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r4.b(this.f13993b, this.f13994c, this.f13995d, tVar, androidx.compose.runtime.g3.b(this.f13996e | 1), this.f13997f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Divider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f4, long j4) {
            super(1);
            this.f13998b = f4;
            this.f13999c = j4;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float f4 = 2;
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, this.f13999c, i0.g.a(fVar.v5(this.f13998b) / f4, 0.0f), i0.g.a(fVar.v5(this.f13998b) / f4, i0.n.m(fVar.e())), fVar.v5(this.f13998b), 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Divider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14003e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14004f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.q qVar, float f4, long j4, int i4, int i5) {
            super(2);
            this.f14000b = qVar;
            this.f14001c = f4;
            this.f14002d = j4;
            this.f14003e = i4;
            this.f14004f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r4.c(this.f14000b, this.f14001c, this.f14002d, tVar, androidx.compose.runtime.g3.b(this.f14003e | 1), this.f14004f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if ((r14 & 4) != 0) goto L46;
     */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(message = "Renamed to HorizontalDivider", replaceWith = @kotlin.x0(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r8, float r9, long r10, @fg.m androidx.compose.runtime.t r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r4.a(androidx.compose.ui.q, float, long, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if ((r14 & 4) != 0) goto L46;
     */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.m androidx.compose.ui.q r8, float r9, long r10, @fg.m androidx.compose.runtime.t r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r4.b(androidx.compose.ui.q, float, long, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if ((r14 & 4) != 0) goto L46;
     */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.q r8, float r9, long r10, @fg.m androidx.compose.runtime.t r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r4.c(androidx.compose.ui.q, float, long, androidx.compose.runtime.t, int, int):void");
    }
}
