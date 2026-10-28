package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/ui/q;", "modifier", "enabled", "Landroidx/compose/material3/y7;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "a", "(ZLld/a;Landroidx/compose/ui/q;ZLandroidx/compose/material3/y7;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "", "I", "RadioAnimationDuration", "Landroidx/compose/ui/unit/h;", "b", "F", "RadioButtonPadding", "c", "RadioButtonDotSize", "d", "RadioStrokeWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n1116#2,6:269\n1116#2,6:278\n75#3:275\n75#3:277\n154#4:276\n154#4:284\n154#4:285\n154#4:286\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:269,6\n116#1:278,6\n82#1:275\n97#1:277\n82#1:276\n265#1:284\n266#1:285\n267#1:286\n*E\n"})
/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9787a = 100;

    /* renamed from: b, reason: collision with root package name */
    private static final float f9788b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f9789c = 12;

    /* renamed from: d, reason: collision with root package name */
    private static final float f9790d;

    /* compiled from: RadioButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n75#2:269\n154#3:270\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n*L\n121#1:269\n124#1:270\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> f9791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f9792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var, androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var2) {
            super(1);
            this.f9791b = b5Var;
            this.f9792c = b5Var2;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float v5 = fVar.v5(a8.f9790d);
            float f4 = 2;
            float f5 = v5 / f4;
            androidx.compose.ui.graphics.drawscope.f.u6(fVar, this.f9791b.getValue().M(), fVar.v5(androidx.compose.ui.unit.h.g(c0.u0.f38224a.c() / f4)) - f5, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.n(v5, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            if (Float.compare(this.f9792c.getValue().u(), 0) > 0) {
                androidx.compose.ui.graphics.drawscope.f.u6(fVar, this.f9791b.getValue().M(), fVar.v5(this.f9792c.getValue().u()) - f5, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.m.f17797a, null, 0, 108, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: RadioButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9795d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9796e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y7 f9797f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f9798g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9799h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9800i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z5, y7 y7Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f9793b = z4;
            this.f9794c = aVar;
            this.f9795d = qVar;
            this.f9796e = z5;
            this.f9797f = y7Var;
            this.f9798g = kVar;
            this.f9799h = i4;
            this.f9800i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a8.a(this.f9793b, this.f9794c, this.f9795d, this.f9796e, this.f9797f, this.f9798g, tVar, androidx.compose.runtime.g3.b(this.f9799h | 1), this.f9800i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 2;
        f9788b = androidx.compose.ui.unit.h.g(f4);
        f9790d = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0062  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r22, @fg.m ld.a<kotlin.k2> r23, @fg.m androidx.compose.ui.q r24, boolean r25, @fg.m androidx.compose.material3.y7 r26, @fg.m androidx.compose.foundation.interaction.k r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.a8.a(boolean, ld.a, androidx.compose.ui.q, boolean, androidx.compose.material3.y7, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }
}
