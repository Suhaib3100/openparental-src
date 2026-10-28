package androidx.compose.material3;

import androidx.compose.animation.core.c1;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\u001aH\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aB\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a0\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u0019\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a.\u0010\u001b\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aR\u0010\u001e\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aD\u0010 \u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aL\u0010\"\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a8\u0010$\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a0\u0010&\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a6\u0010,\u001a\u00020\n*\u00020\u00152\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a&\u0010.\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a6\u00100\u001a\u00020\n*\u00020\u00152\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010-\u001a>\u00101\u001a\u00020\n*\u00020\u00152\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103\"\u0014\u00106\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105\"\u001a\u00109\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b7\u00108\"\u001a\u0010;\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b:\u00108\"\u001a\u0010=\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b<\u00108\"\u0014\u0010@\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010?\"\u0014\u0010A\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010?\"\u0014\u0010B\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010?\"\u0014\u0010C\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010?\"\u0014\u0010D\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010?\"\u0014\u0010F\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010?\"\u0014\u0010H\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010?\"\u0014\u0010J\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010?\"\u0014\u0010L\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010?\"\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u0014\u0010R\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010O\"\u0014\u0010T\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010O\"\u0014\u0010V\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010O\"\u0014\u0010X\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010?\"\u0014\u0010Z\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010?\"\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u00103\"\u0014\u0010]\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u00103\"\u0014\u0010^\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u00103\"\u0014\u0010_\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00103\"\u0014\u0010`\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010?\"\u0014\u0010a\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010?\"\u0014\u0010b\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "color", "trackColor", "Landroidx/compose/ui/graphics/i6;", "strokeCap", "Lkotlin/k2;", "i", "(Lld/a;Landroidx/compose/ui/q;JJILandroidx/compose/runtime/t;II)V", "f", "(Landroidx/compose/ui/q;JJILandroidx/compose/runtime/t;II)V", "h", "(FLandroidx/compose/ui/q;JJILandroidx/compose/runtime/t;II)V", "j", "(FLandroidx/compose/ui/q;JJLandroidx/compose/runtime/t;II)V", "g", "(Landroidx/compose/ui/q;JJLandroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/drawscope/f;", "startFraction", "endFraction", "strokeWidth", "z", "(Landroidx/compose/ui/graphics/drawscope/f;FFJFI)V", "A", "(Landroidx/compose/ui/graphics/drawscope/f;JFI)V", "Landroidx/compose/ui/unit/h;", "b", "(Lld/a;Landroidx/compose/ui/q;JFJILandroidx/compose/runtime/t;II)V", "c", "(Landroidx/compose/ui/q;JFJILandroidx/compose/runtime/t;II)V", "a", "(FLandroidx/compose/ui/q;JFJILandroidx/compose/runtime/t;II)V", "d", "(FLandroidx/compose/ui/q;JFLandroidx/compose/runtime/t;II)V", "e", "(Landroidx/compose/ui/q;JFLandroidx/compose/runtime/t;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/n;", "stroke", "v", "(Landroidx/compose/ui/graphics/drawscope/f;FFJLandroidx/compose/ui/graphics/drawscope/n;)V", "w", "(Landroidx/compose/ui/graphics/drawscope/f;JLandroidx/compose/ui/graphics/drawscope/n;)V", "x", "y", "(Landroidx/compose/ui/graphics/drawscope/f;FFFJLandroidx/compose/ui/graphics/drawscope/n;)V", "F", "SemanticsBoundsPadding", "Landroidx/compose/ui/q;", "IncreaseSemanticsBounds", "D", "()F", "LinearIndicatorWidth", "C", "LinearIndicatorHeight", "B", "CircularIndicatorDiameter", "", "I", "LinearAnimationDuration", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "k", "FirstLineHeadDelay", "l", "FirstLineTailDelay", "m", "SecondLineHeadDelay", "n", "SecondLineTailDelay", "Landroidx/compose/animation/core/x;", "o", "Landroidx/compose/animation/core/x;", "FirstLineHeadEasing", "p", "FirstLineTailEasing", "q", "SecondLineHeadEasing", "r", "SecondLineTailEasing", "s", "RotationsPerCycle", "t", "RotationDuration", "u", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,703:1\n1116#2,6:704\n1116#2,6:710\n1116#2,6:716\n1116#2,6:722\n1116#2,6:728\n1116#2,6:734\n1116#2,6:741\n1116#2,6:747\n1116#2,6:754\n1116#2,6:760\n74#3:740\n74#3:753\n75#4,7:766\n92#4:775\n58#4:776\n154#5:773\n154#5:774\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n86#1:704,6\n90#1:710,6\n94#1:716,6\n176#1:722,6\n218#1:728,6\n354#1:734,6\n360#1:741,6\n364#1:747,6\n452#1:754,6\n493#1:760,6\n355#1:740\n397#1:753\n578#1:766,7\n649#1:775\n649#1:776\n300#1:773\n640#1:774\n*E\n"})
/* loaded from: classes.dex */
public final class v7 {

    @fg.l
    private static final androidx.compose.animation.core.x A;

    /* renamed from: a, reason: collision with root package name */
    private static final float f15056a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.q f15057b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f15058c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f15059d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f15060e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15061f = 1800;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15062g = 750;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15063h = 850;

    /* renamed from: i, reason: collision with root package name */
    private static final int f15064i = 567;

    /* renamed from: j, reason: collision with root package name */
    private static final int f15065j = 533;

    /* renamed from: k, reason: collision with root package name */
    private static final int f15066k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f15067l = 333;

    /* renamed from: m, reason: collision with root package name */
    private static final int f15068m = 1000;

    /* renamed from: n, reason: collision with root package name */
    private static final int f15069n = 1267;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f15070o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f15071p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f15072q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f15073r;

    /* renamed from: s, reason: collision with root package name */
    private static final int f15074s = 5;

    /* renamed from: t, reason: collision with root package name */
    private static final int f15075t = 1332;

    /* renamed from: u, reason: collision with root package name */
    private static final float f15076u = -90.0f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f15077v = 286.0f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f15078w = 290.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final float f15079x = 216.0f;

    /* renamed from: y, reason: collision with root package name */
    private static final int f15080y = 666;

    /* renamed from: z, reason: collision with root package name */
    private static final int f15081z = 666;

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ld.a<Float> aVar) {
            super(1);
            this.f15082b = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.k1(zVar, new androidx.compose.ui.semantics.h(this.f15082b.invoke().floatValue(), kotlin.ranges.s.e(0.0f, 1.0f), 0, 4, null));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a0 f15083b = new a0(1);

        a0() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15061f);
            bVar.a(Float.valueOf(0.0f), 1000).c(v7.f15072q);
            bVar.a(Float.valueOf(1.0f), 1567);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15084b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15085c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.n f15086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ld.a<Float> aVar, long j4, androidx.compose.ui.graphics.drawscope.n nVar, long j5) {
            super(1);
            this.f15084b = aVar;
            this.f15085c = j4;
            this.f15086d = nVar;
            this.f15087e = j5;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float floatValue = this.f15084b.invoke().floatValue() * 360.0f;
            v7.w(fVar, this.f15085c, this.f15086d);
            v7.l(fVar, 270.0f, floatValue, this.f15087e, this.f15086d);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b0 f15088b = new b0(1);

        b0() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15061f);
            bVar.a(Float.valueOf(0.0f), v7.f15069n).c(v7.f15073r);
            bVar.a(Float.valueOf(1.0f), v7.f15061f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15091d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15092e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f15093f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15094g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15095h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f15096i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ld.a<Float> aVar, androidx.compose.ui.q qVar, long j4, float f4, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15089b = aVar;
            this.f15090c = qVar;
            this.f15091d = j4;
            this.f15092e = f4;
            this.f15093f = j5;
            this.f15094g = i4;
            this.f15095h = i5;
            this.f15096i = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.b(this.f15089b, this.f15090c, this.f15091d, this.f15092e, this.f15093f, this.f15094g, tVar, androidx.compose.runtime.g3.b(this.f15095h | 1), this.f15096i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15097b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.n f15098c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Integer> f15099d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15100e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15101f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15102g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f15103h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15104i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j4, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.runtime.b5<Integer> b5Var, androidx.compose.runtime.b5<Float> b5Var2, androidx.compose.runtime.b5<Float> b5Var3, androidx.compose.runtime.b5<Float> b5Var4, float f4, long j5) {
            super(1);
            this.f15097b = j4;
            this.f15098c = nVar;
            this.f15099d = b5Var;
            this.f15100e = b5Var2;
            this.f15101f = b5Var3;
            this.f15102g = b5Var4;
            this.f15103h = f4;
            this.f15104i = j5;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            v7.w(fVar, this.f15097b, this.f15098c);
            float floatValue = (this.f15099d.getValue().floatValue() * v7.f15079x) % 360.0f;
            v7.y(fVar, this.f15101f.getValue().floatValue() + this.f15102g.getValue().floatValue() + floatValue + v7.f15076u, this.f15103h, Math.abs(this.f15100e.getValue().floatValue() - this.f15101f.getValue().floatValue()), this.f15104i, this.f15098c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15107d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15108e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15109f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15110g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15111h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.q qVar, long j4, float f4, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15105b = qVar;
            this.f15106c = j4;
            this.f15107d = f4;
            this.f15108e = j5;
            this.f15109f = i4;
            this.f15110g = i5;
            this.f15111h = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.c(this.f15105b, this.f15106c, this.f15107d, this.f15108e, this.f15109f, tVar, androidx.compose.runtime.g3.b(this.f15110g | 1), this.f15111h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f4) {
            super(0);
            this.f15112b = f4;
        }

        @fg.l
        public final Float a() {
            return Float.valueOf(this.f15112b);
        }

        @Override // ld.a
        public Float invoke() {
            return Float.valueOf(this.f15112b);
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15114c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15115d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15116e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f15117f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15118g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15119h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f15120i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f4, androidx.compose.ui.q qVar, long j4, float f5, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15113b = f4;
            this.f15114c = qVar;
            this.f15115d = j4;
            this.f15116e = f5;
            this.f15117f = j5;
            this.f15118g = i4;
            this.f15119h = i5;
            this.f15120i = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.a(this.f15113b, this.f15114c, this.f15115d, this.f15116e, this.f15117f, this.f15118g, tVar, androidx.compose.runtime.g3.b(this.f15119h | 1), this.f15120i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15122c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15123d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15124e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15125f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f4, androidx.compose.ui.q qVar, long j4, float f5, int i4, int i5) {
            super(2);
            this.f15121b = f4;
            this.f15122c = qVar;
            this.f15123d = j4;
            this.f15124e = f5;
            this.f15125f = i4;
            this.f15126g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.d(this.f15121b, this.f15122c, this.f15123d, this.f15124e, tVar, androidx.compose.runtime.g3.b(this.f15125f | 1), this.f15126g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15131f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.q qVar, long j4, float f4, int i4, int i5) {
            super(2);
            this.f15127b = qVar;
            this.f15128c = j4;
            this.f15129d = f4;
            this.f15130e = i4;
            this.f15131f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.e(this.f15127b, this.f15128c, this.f15129d, tVar, androidx.compose.runtime.g3.b(this.f15130e | 1), this.f15131f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ld.a<Float> aVar) {
            super(0);
            this.f15132b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(kotlin.ranges.s.H(this.f15132b.invoke().floatValue(), 0.0f, 1.0f));
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f15133b = new k(1);

        k() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15075t);
            bVar.a(Float.valueOf(0.0f), 0).c(v7.A);
            bVar.a(Float.valueOf(v7.f15078w), 666);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f15134b = new l(1);

        l() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15075t);
            bVar.a(Float.valueOf(0.0f), 666).c(v7.A);
            bVar.a(Float.valueOf(v7.f15078w), bVar.getDurationMillis());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f15135b = new m(3);

        /* compiled from: ProgressIndicator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f15136b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f15137c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4) {
                super(1);
                this.f15136b = i1Var;
                this.f15137c = i4;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f15136b, 0, -this.f15137c, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        m() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            int q22 = o0Var.q2(v7.f15056a);
            int i4 = q22 * 2;
            androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.i(j4, 0, i4));
            return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight() - i4, null, new a(m02, q22), 4, null);
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f15138b = new n(1);

        n() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ld.a<Float> aVar) {
            super(1);
            this.f15139b = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.k1(zVar, new androidx.compose.ui.semantics.h(this.f15139b.invoke().floatValue(), kotlin.ranges.s.e(0.0f, 1.0f), 0, 4, null));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15141c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15142d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15143e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(long j4, int i4, ld.a<Float> aVar, long j5) {
            super(1);
            this.f15140b = j4;
            this.f15141c = i4;
            this.f15142d = aVar;
            this.f15143e = j5;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float m4 = i0.n.m(fVar.e());
            v7.A(fVar, this.f15140b, m4, this.f15141c);
            v7.z(fVar, 0.0f, this.f15142d.invoke().floatValue(), this.f15143e, m4, this.f15141c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15144b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15145c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15146d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15147e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15148f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15149g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15150h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ld.a<Float> aVar, androidx.compose.ui.q qVar, long j4, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15144b = aVar;
            this.f15145c = qVar;
            this.f15146d = j4;
            this.f15147e = j5;
            this.f15148f = i4;
            this.f15149g = i5;
            this.f15150h = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.i(this.f15144b, this.f15145c, this.f15146d, this.f15147e, this.f15148f, tVar, androidx.compose.runtime.g3.b(this.f15149g | 1), this.f15150h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15152c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15153d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15154e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f15155f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15156g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f15157h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j4, int i4, androidx.compose.runtime.b5<Float> b5Var, androidx.compose.runtime.b5<Float> b5Var2, long j5, androidx.compose.runtime.b5<Float> b5Var3, androidx.compose.runtime.b5<Float> b5Var4) {
            super(1);
            this.f15151b = j4;
            this.f15152c = i4;
            this.f15153d = b5Var;
            this.f15154e = b5Var2;
            this.f15155f = j5;
            this.f15156g = b5Var3;
            this.f15157h = b5Var4;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float m4 = i0.n.m(fVar.e());
            v7.A(fVar, this.f15151b, m4, this.f15152c);
            if (this.f15153d.getValue().floatValue() - this.f15154e.getValue().floatValue() > 0.0f) {
                v7.z(fVar, this.f15153d.getValue().floatValue(), this.f15154e.getValue().floatValue(), this.f15155f, m4, this.f15152c);
            }
            if (this.f15156g.getValue().floatValue() - this.f15157h.getValue().floatValue() > 0.0f) {
                v7.z(fVar, this.f15156g.getValue().floatValue(), this.f15157h.getValue().floatValue(), this.f15155f, m4, this.f15152c);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15158b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15159c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15160d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15161e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15162f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15163g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(androidx.compose.ui.q qVar, long j4, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15158b = qVar;
            this.f15159c = j4;
            this.f15160d = j5;
            this.f15161e = i4;
            this.f15162f = i5;
            this.f15163g = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.f(this.f15158b, this.f15159c, this.f15160d, this.f15161e, tVar, androidx.compose.runtime.g3.b(this.f15162f | 1), this.f15163g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(float f4) {
            super(0);
            this.f15164b = f4;
        }

        @fg.l
        public final Float a() {
            return Float.valueOf(this.f15164b);
        }

        @Override // ld.a
        public Float invoke() {
            return Float.valueOf(this.f15164b);
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15166c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15167d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15168e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15169f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15170g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15171h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(float f4, androidx.compose.ui.q qVar, long j4, long j5, int i4, int i5, int i6) {
            super(2);
            this.f15165b = f4;
            this.f15166c = qVar;
            this.f15167d = j4;
            this.f15168e = j5;
            this.f15169f = i4;
            this.f15170g = i5;
            this.f15171h = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.h(this.f15165b, this.f15166c, this.f15167d, this.f15168e, this.f15169f, tVar, androidx.compose.runtime.g3.b(this.f15170g | 1), this.f15171h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15177g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(float f4, androidx.compose.ui.q qVar, long j4, long j5, int i4, int i5) {
            super(2);
            this.f15172b = f4;
            this.f15173c = qVar;
            this.f15174d = j4;
            this.f15175e = j5;
            this.f15176f = i4;
            this.f15177g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.j(this.f15172b, this.f15173c, this.f15174d, this.f15175e, tVar, androidx.compose.runtime.g3.b(this.f15176f | 1), this.f15177g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15182f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(androidx.compose.ui.q qVar, long j4, long j5, int i4, int i5) {
            super(2);
            this.f15178b = qVar;
            this.f15179c = j4;
            this.f15180d = j5;
            this.f15181e = i4;
            this.f15182f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v7.g(this.f15178b, this.f15179c, this.f15180d, tVar, androidx.compose.runtime.g3.b(this.f15181e | 1), this.f15182f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f15183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(ld.a<Float> aVar) {
            super(0);
            this.f15183b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(kotlin.ranges.s.H(this.f15183b.invoke().floatValue(), 0.0f, 1.0f));
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f15184b = new y(1);

        y() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15061f);
            bVar.a(Float.valueOf(0.0f), 0).c(v7.f15070o);
            bVar.a(Float.valueOf(1.0f), v7.f15062g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final z f15185b = new z(1);

        z() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(v7.f15061f);
            bVar.a(Float.valueOf(0.0f), v7.f15067l).c(v7.f15071p);
            bVar.a(Float.valueOf(1.0f), 1183);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    static {
        float g4 = androidx.compose.ui.unit.h.g(10);
        f15056a = g4;
        f15057b = androidx.compose.foundation.layout.j1.m(androidx.compose.ui.semantics.o.e(androidx.compose.ui.layout.d0.a(androidx.compose.ui.q.INSTANCE, m.f15135b), true, n.f15138b), 0.0f, g4, 1, null);
        f15058c = 240;
        f15059d = c0.e0.f37188a.i();
        c0.e eVar = c0.e.f37178a;
        f15060e = eVar.h() - (eVar.b() * 2);
        f15070o = new androidx.compose.animation.core.x(0.2f, 0.0f, 0.8f, 1.0f);
        f15071p = new androidx.compose.animation.core.x(0.4f, 0.0f, 1.0f, 1.0f);
        f15072q = new androidx.compose.animation.core.x(0.0f, 0.0f, 0.65f, 1.0f);
        f15073r = new androidx.compose.animation.core.x(0.1f, 0.0f, 0.45f, 1.0f);
        A = new androidx.compose.animation.core.x(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(androidx.compose.ui.graphics.drawscope.f fVar, long j4, float f4, int i4) {
        z(fVar, 0.0f, 1.0f, j4, f4, i4);
    }

    public static final float B() {
        return f15060e;
    }

    public static final float C() {
        return f15059d;
    }

    public static final float D() {
        return f15058c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0063  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.x0(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r21, @fg.m androidx.compose.ui.q r22, long r23, float r25, long r26, int r28, @fg.m androidx.compose.runtime.t r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.a(float, androidx.compose.ui.q, long, float, long, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ec  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.a<java.lang.Float> r27, @fg.m androidx.compose.ui.q r28, long r29, float r31, long r32, int r34, @fg.m androidx.compose.runtime.t r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.b(ld.a, androidx.compose.ui.q, long, float, long, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0083  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.q r36, long r37, float r39, long r40, int r42, @fg.m androidx.compose.runtime.t r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.c(androidx.compose.ui.q, long, float, long, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void d(float r20, androidx.compose.ui.q r21, long r22, float r24, androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.d(float, androidx.compose.ui.q, long, float, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void e(androidx.compose.ui.q r19, long r20, float r22, androidx.compose.runtime.t r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.e(androidx.compose.ui.q, long, float, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e7, code lost:
    
        if (r1.g(r10) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b4  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.m androidx.compose.ui.q r31, long r32, long r34, int r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.f(androidx.compose.ui.q, long, long, int, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public static final /* synthetic */ void g(androidx.compose.ui.q qVar, long j4, long j5, androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.ui.q qVar2;
        int i6;
        long j6;
        long j7;
        androidx.compose.ui.q qVar3;
        long j10;
        androidx.compose.runtime.t o4 = tVar.o(585576195);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
            qVar2 = qVar;
        } else if ((i4 & 6) == 0) {
            qVar2 = qVar;
            i6 = (o4.q0(qVar2) ? 4 : 2) | i4;
        } else {
            qVar2 = qVar;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            j6 = j4;
            i6 |= ((i5 & 2) == 0 && o4.g(j6)) ? 32 : 16;
        } else {
            j6 = j4;
        }
        if ((i4 & 384) == 0) {
            j7 = j5;
            i6 |= ((i5 & 4) == 0 && o4.g(j7)) ? 256 : 128;
        } else {
            j7 = j5;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
            qVar3 = qVar2;
            j10 = j6;
        } else {
            o4.T();
            if ((i4 & 1) == 0 || o4.i0()) {
                qVar3 = i7 != 0 ? androidx.compose.ui.q.INSTANCE : qVar2;
                if ((i5 & 2) != 0) {
                    j6 = u7.f14959a.f(o4, 6);
                    i6 &= -113;
                }
                if ((i5 & 4) != 0) {
                    j7 = u7.f14959a.h(o4, 6);
                    i6 &= -897;
                }
            } else {
                o4.d0();
                if ((i5 & 2) != 0) {
                    i6 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i6 &= -897;
                }
                qVar3 = qVar2;
            }
            int i10 = i6;
            j10 = j6;
            long j11 = j7;
            o4.I();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(585576195, i10, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:246)");
            }
            f(qVar3, j10, j11, u7.f14959a.g(), o4, (i10 & 14) | 3072 | (i10 & 112) | (i10 & 896), 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            j7 = j11;
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new w(qVar3, j10, j7, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0057  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.x0(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(float r23, @fg.m androidx.compose.ui.q r24, long r25, long r27, int r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.h(float, androidx.compose.ui.q, long, long, int, androidx.compose.runtime.t, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c2: INVOKE (r2v1 ?? I:androidx.compose.runtime.t), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:451)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void i(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c2: INVOKE (r2v1 ?? I:androidx.compose.runtime.t), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:451)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void j(float r20, androidx.compose.ui.q r21, long r22, long r24, androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v7.j(float, androidx.compose.ui.q, long, long, androidx.compose.runtime.t, int, int):void");
    }

    public static final void l(androidx.compose.ui.graphics.drawscope.f fVar, float f4, float f5, long j4, androidx.compose.ui.graphics.drawscope.n nVar) {
        v(fVar, f4, f5, j4, nVar);
    }

    private static final void v(androidx.compose.ui.graphics.drawscope.f fVar, float f4, float f5, long j4, androidx.compose.ui.graphics.drawscope.n nVar) {
        float f6 = 2;
        float width = nVar.getWidth() / f6;
        float t4 = i0.n.t(fVar.e()) - (f6 * width);
        androidx.compose.ui.graphics.drawscope.f.F2(fVar, j4, f4, f5, false, i0.g.a(width, width), i0.o.a(t4, t4), 0.0f, nVar, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(androidx.compose.ui.graphics.drawscope.f fVar, long j4, androidx.compose.ui.graphics.drawscope.n nVar) {
        v(fVar, 0.0f, 360.0f, j4, nVar);
    }

    private static final void x(androidx.compose.ui.graphics.drawscope.f fVar, float f4, float f5, long j4, androidx.compose.ui.graphics.drawscope.n nVar) {
        v(fVar, f4, f5, j4, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(androidx.compose.ui.graphics.drawscope.f fVar, float f4, float f5, float f6, long j4, androidx.compose.ui.graphics.drawscope.n nVar) {
        int cap = nVar.getCap();
        androidx.compose.ui.graphics.i6.INSTANCE.getClass();
        v(fVar, f4 + (androidx.compose.ui.graphics.i6.g(cap, androidx.compose.ui.graphics.i6.f17861c) ? 0.0f : ((f5 / androidx.compose.ui.unit.h.g(f15060e / 2)) * 57.29578f) / 2.0f), Math.max(f6, 0.1f), j4, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(androidx.compose.ui.graphics.drawscope.f fVar, float f4, float f5, long j4, float f6, int i4) {
        float t4 = i0.n.t(fVar.e());
        float m4 = i0.n.m(fVar.e());
        float f7 = 2;
        float f10 = m4 / f7;
        boolean z4 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr;
        float f11 = (z4 ? f4 : 1.0f - f5) * t4;
        float f12 = (z4 ? f5 : 1.0f - f4) * t4;
        androidx.compose.ui.graphics.i6.INSTANCE.getClass();
        if (androidx.compose.ui.graphics.i6.g(i4, androidx.compose.ui.graphics.i6.f17861c) || m4 > t4) {
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, j4, i0.g.a(f11, f10), i0.g.a(f12, f10), f6, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f13 = f6 / f7;
        kotlin.ranges.f e4 = kotlin.ranges.s.e(f13, t4 - f13);
        float floatValue = ((Number) kotlin.ranges.s.N(Float.valueOf(f11), e4)).floatValue();
        float floatValue2 = ((Number) kotlin.ranges.s.N(Float.valueOf(f12), e4)).floatValue();
        if (Math.abs(f5 - f4) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, j4, i0.g.a(floatValue, f10), i0.g.a(floatValue2, f10), f6, i4, null, 0.0f, null, 0, 480, null);
        }
    }
}
