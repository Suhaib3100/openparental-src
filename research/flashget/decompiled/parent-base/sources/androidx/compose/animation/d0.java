package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.f2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.k2;
import androidx.compose.animation.core.y1;
import androidx.compose.animation.core.z2;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.p4;
import androidx.compose.ui.graphics.p6;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.graphics.q6;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001aB\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aB\u0010\u0015\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a6\u0010\u001d\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aX\u0010$\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b$\u0010%\u001aX\u0010(\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b(\u0010)\u001aX\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010 \u001a\u00020*2\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b.\u0010/\u001aX\u00103\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010 \u001a\u0002002\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b3\u00104\u001aX\u00106\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010&\u001a\u00020*2\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b6\u00107\u001aX\u00109\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010&\u001a\u0002002\b\b\u0002\u0010\"\u001a\u00020!2#\b\u0002\u00108\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b9\u0010:\u001aD\u0010<\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b<\u0010\u0013\u001aD\u0010>\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b>\u0010\u0013\u001aD\u0010@\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\b@\u0010\u0016\u001aD\u0010B\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020+0\fH\u0007¢\u0006\u0004\bB\u0010\u0016\u001a'\u0010H\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0EH\u0000¢\u0006\u0004\bH\u0010I\u001a'\u0010J\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0EH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010L\u001a\u00020\u001f*\u00020*H\u0002¢\u0006\u0004\bL\u0010M\u001a\u0013\u0010N\u001a\u00020\u001f*\u000200H\u0002¢\u0006\u0004\bN\u0010O\u001a&\u0010P\u001a\f\u0012\u0006\b\u0001\u0012\u00020F\u0018\u00010E*\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0080\u0002¢\u0006\u0004\bP\u0010Q\u001a&\u0010R\u001a\f\u0012\u0006\b\u0001\u0012\u00020F\u0018\u00010E*\u00020\b2\u0006\u0010D\u001a\u00020CH\u0080\u0002¢\u0006\u0004\bR\u0010S\u001a1\u0010[\u001a\u00020Z*\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\b2\u0006\u0010Y\u001a\u00020XH\u0001¢\u0006\u0004\b[\u0010\\\u001a!\u0010]\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010V\u001a\u00020\u0004H\u0001¢\u0006\u0004\b]\u0010^\u001a!\u0010_\u001a\u00020\b*\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010W\u001a\u00020\bH\u0001¢\u0006\u0004\b_\u0010`\u001a1\u0010b\u001a\u00020a*\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\b2\u0006\u0010Y\u001a\u00020XH\u0003¢\u0006\u0004\bb\u0010c\" \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00010i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010j\"\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000b0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010j\"\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\r0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q²\u0006\u000e\u0010o\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010p\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/core/p0;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/f0;", "p", "(Landroidx/compose/animation/core/p0;F)Landroidx/compose/animation/f0;", "targetAlpha", "Landroidx/compose/animation/h0;", "r", "(Landroidx/compose/animation/core/p0;F)Landroidx/compose/animation/h0;", "Landroidx/compose/ui/unit/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/u;", "Lkotlin/r0;", "name", "fullSize", "initialOffset", "F", "(Landroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/f0;", "targetOffset", "L", "(Landroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/h0;", "initialScale", "Landroidx/compose/ui/graphics/p6;", "transformOrigin", "v", "(Landroidx/compose/animation/core/p0;FJ)Landroidx/compose/animation/f0;", "targetScale", "x", "(Landroidx/compose/animation/core/p0;FJ)Landroidx/compose/animation/h0;", "Landroidx/compose/ui/c;", "expandFrom", "", "clip", "initialSize", "l", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c;ZLld/l;)Landroidx/compose/animation/f0;", "shrinkTowards", "targetSize", "B", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c;ZLld/l;)Landroidx/compose/animation/h0;", "Landroidx/compose/ui/c$b;", "", "fullWidth", "initialWidth", "j", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c$b;ZLld/l;)Landroidx/compose/animation/f0;", "Landroidx/compose/ui/c$c;", "fullHeight", "initialHeight", "n", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c$c;ZLld/l;)Landroidx/compose/animation/f0;", "targetWidth", "z", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c$b;ZLld/l;)Landroidx/compose/animation/h0;", "targetHeight", "D", "(Landroidx/compose/animation/core/p0;Landroidx/compose/ui/c$c;ZLld/l;)Landroidx/compose/animation/h0;", "initialOffsetX", "H", "initialOffsetY", "J", "targetOffsetX", "N", "targetOffsetY", "P", "", "key", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/q$d;", "node", "b", "(Ljava/lang/Object;Landroidx/compose/ui/node/y0;)Landroidx/compose/animation/f0;", "c", "(Ljava/lang/Object;Landroidx/compose/ui/node/y0;)Landroidx/compose/animation/h0;", "R", "(Landroidx/compose/ui/c$b;)Landroidx/compose/ui/c;", "S", "(Landroidx/compose/ui/c$c;)Landroidx/compose/ui/c;", "t", "(Landroidx/compose/animation/f0;Ljava/lang/Object;)Landroidx/compose/ui/node/y0;", "u", "(Landroidx/compose/animation/h0;Ljava/lang/Object;)Landroidx/compose/ui/node/y0;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "enter", "exit", "", "label", "Landroidx/compose/ui/q;", "i", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;", "T", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/f0;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/f0;", "W", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/h0;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/h0;", "Landroidx/compose/animation/o0;", "g", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/o0;", "Landroidx/compose/animation/core/i2;", "Landroidx/compose/animation/core/p;", "a", "Landroidx/compose/animation/core/i2;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/y1;", "Landroidx/compose/animation/core/y1;", "DefaultAlphaAndScaleSpring", "DefaultOffsetAnimationSpec", "d", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1246:1\n25#2:1247\n25#2:1254\n25#2:1261\n36#2:1268\n36#2:1275\n25#2:1282\n25#2:1289\n1116#3,6:1248\n1116#3,6:1255\n1116#3,6:1262\n1116#3,6:1269\n1116#3,6:1276\n1116#3,6:1283\n1116#3,6:1290\n81#4:1296\n107#4,2:1297\n81#4:1299\n107#4,2:1300\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n865#1:1247\n870#1:1254\n876#1:1261\n900#1:1268\n920#1:1275\n953#1:1282\n959#1:1289\n865#1:1248,6\n870#1:1255,6\n876#1:1262,6\n900#1:1269,6\n920#1:1276,6\n953#1:1283,6\n959#1:1290,6\n900#1:1296\n900#1:1297,2\n920#1:1299\n920#1:1300,2\n*E\n"})
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final i2<p6, androidx.compose.animation.core.p> f3051a = k2.a(a.f3055b, b.f3057b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final y1<Float> f3052b = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final y1<androidx.compose.ui.unit.q> f3053c = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final y1<androidx.compose.ui.unit.u> f3054d;

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/p6;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<p6, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3055b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(p6.k(j4), p6.l(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(p6 p6Var) {
            return a(p6Var.getPackedValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Landroidx/compose/ui/unit/q;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3056b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.r.a(0, this.f3056b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.j(j4))).intValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Landroidx/compose/ui/graphics/p6;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, p6> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3057b = new b(1);

        b() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return q6.a(pVar.getV1(), pVar.getV2());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ p6 invoke(androidx.compose.animation.core.p pVar) {
            return p6.b(a(pVar));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f3058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f3059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var, h0 h0Var) {
            super(1);
            this.f3058b = f0Var;
            this.f3059c = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.p0<Float> invoke(@fg.l e2.b<b0> bVar) {
            androidx.compose.animation.core.p0<Float> f4;
            androidx.compose.animation.core.p0<Float> f5;
            b0 b0Var = b0.PreEnter;
            b0 b0Var2 = b0.Visible;
            if (bVar.j(b0Var, b0Var2)) {
                k0 k4 = this.f3058b.getData().k();
                return (k4 == null || (f5 = k4.f()) == null) ? d0.f3052b : f5;
            }
            if (!bVar.j(b0Var2, b0.PostExit)) {
                return d0.f3052b;
            }
            k0 k5 = this.f3059c.getData().k();
            return (k5 == null || (f4 = k5.f()) == null) ? d0.f3052b : f4;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "", "a", "(Landroidx/compose/animation/b0;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<b0, Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f3060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f3061c;

        /* compiled from: EnterExitTransition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3062a;

            static {
                int[] iArr = new int[b0.values().length];
                try {
                    iArr[b0.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b0.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b0.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3062a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f0 f0Var, h0 h0Var) {
            super(1);
            this.f3060b = f0Var;
            this.f3061c = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@fg.l b0 b0Var) {
            int i4 = a.f3062a[b0Var.ordinal()];
            float f4 = 1.0f;
            if (i4 != 1) {
                if (i4 == 2) {
                    k0 k4 = this.f3060b.getData().k();
                    if (k4 != null) {
                        f4 = k4.e();
                    }
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k0 k5 = this.f3061c.getData().k();
                    if (k5 != null) {
                        f4 = k5.e();
                    }
                }
            }
            return Float.valueOf(f4);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<q4, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<Float> f3063b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<Float> f3064c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b5<p6> f3065d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b5<Float> b5Var, b5<Float> b5Var2, b5<p6> b5Var3) {
            super(1);
            this.f3063b = b5Var;
            this.f3064c = b5Var2;
            this.f3065d = b5Var3;
        }

        public final void a(@fg.l q4 q4Var) {
            long j4;
            b5<Float> b5Var = this.f3063b;
            q4Var.k(b5Var != null ? b5Var.getValue().floatValue() : 1.0f);
            b5<Float> b5Var2 = this.f3064c;
            q4Var.z(b5Var2 != null ? b5Var2.getValue().floatValue() : 1.0f);
            b5<Float> b5Var3 = this.f3064c;
            q4Var.Q(b5Var3 != null ? b5Var3.getValue().floatValue() : 1.0f);
            b5<p6> b5Var4 = this.f3065d;
            if (b5Var4 != null) {
                j4 = b5Var4.getValue().getPackedValue();
            } else {
                p6.INSTANCE.getClass();
                j4 = p6.f17986c;
            }
            q4Var.r2(j4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f3066b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f3067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f0 f0Var, h0 h0Var) {
            super(1);
            this.f3066b = f0Var;
            this.f3067c = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.p0<Float> invoke(@fg.l e2.b<b0> bVar) {
            androidx.compose.animation.core.p0<Float> f4;
            androidx.compose.animation.core.p0<Float> f5;
            b0 b0Var = b0.PreEnter;
            b0 b0Var2 = b0.Visible;
            if (bVar.j(b0Var, b0Var2)) {
                t0 m4 = this.f3066b.getData().m();
                return (m4 == null || (f5 = m4.f()) == null) ? d0.f3052b : f5;
            }
            if (!bVar.j(b0Var2, b0.PostExit)) {
                return d0.f3052b;
            }
            t0 m5 = this.f3067c.getData().m();
            return (m5 == null || (f4 = m5.f()) == null) ? d0.f3052b : f4;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "", "a", "(Landroidx/compose/animation/b0;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<b0, Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f3068b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f3069c;

        /* compiled from: EnterExitTransition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3070a;

            static {
                int[] iArr = new int[b0.values().length];
                try {
                    iArr[b0.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b0.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b0.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3070a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f0 f0Var, h0 h0Var) {
            super(1);
            this.f3068b = f0Var;
            this.f3069c = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@fg.l b0 b0Var) {
            int i4 = a.f3070a[b0Var.ordinal()];
            float f4 = 1.0f;
            if (i4 != 1) {
                if (i4 == 2) {
                    t0 m4 = this.f3068b.getData().m();
                    if (m4 != null) {
                        f4 = m4.g();
                    }
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t0 m5 = this.f3069c.getData().m();
                    if (m5 != null) {
                        f4 = m5.g();
                    }
                }
            }
            return Float.valueOf(f4);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/graphics/p6;", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<p6>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f3071b = new h(1);

        h() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.p0<p6> invoke(@fg.l e2.b<b0> bVar) {
            return androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "Landroidx/compose/ui/graphics/p6;", "a", "(Landroidx/compose/animation/b0;)J"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<b0, p6> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p6 f3072b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f3073c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f3074d;

        /* compiled from: EnterExitTransition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3075a;

            static {
                int[] iArr = new int[b0.values().length];
                try {
                    iArr[b0.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b0.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b0.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3075a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(p6 p6Var, f0 f0Var, h0 h0Var) {
            super(1);
            this.f3072b = p6Var;
            this.f3073c = f0Var;
            this.f3074d = h0Var;
        }

        public final long a(@fg.l b0 b0Var) {
            p6 p6Var;
            int i4 = a.f3075a[b0Var.ordinal()];
            if (i4 != 1) {
                p6Var = null;
                if (i4 == 2) {
                    t0 m4 = this.f3073c.getData().m();
                    if (m4 != null || (m4 = this.f3074d.getData().m()) != null) {
                        p6Var = p6.b(m4.h());
                    }
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t0 m5 = this.f3074d.getData().m();
                    if (m5 != null || (m5 = this.f3073c.getData().m()) != null) {
                        p6Var = p6.b(m5.h());
                    }
                }
            } else {
                p6Var = this.f3072b;
            }
            if (p6Var != null) {
                return p6Var.getPackedValue();
            }
            p6.INSTANCE.getClass();
            return p6.f17986c;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ p6 invoke(b0 b0Var) {
            return p6.b(a(b0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class j extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f3076b = new j(1);

        j() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return 0;
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3077b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(this.f3077b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(j4))).intValue(), (int) (j4 & 4294967295L));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(a(uVar.getPackedValue()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f3078b = new l(1);

        l() {
            super(1);
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(0, 0);
        }

        @Override // ld.l
        public androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            uVar.getPackedValue();
            return androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class m extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f3079b = new m(1);

        m() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return 0;
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3080b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(androidx.compose.ui.unit.u.m(j4), this.f3080b.invoke(Integer.valueOf((int) (j4 & 4294967295L))).intValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(a(uVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class o extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f3081b = new o(1);

        o() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return 0;
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3082b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(this.f3082b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(j4))).intValue(), (int) (j4 & 4294967295L));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(a(uVar.getPackedValue()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f3083b = new q(1);

        q() {
            super(1);
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(0, 0);
        }

        @Override // ld.l
        public androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            uVar.getPackedValue();
            return androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f3084b = new r(1);

        r() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return 0;
        }

        @Override // ld.l
        public Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3085b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(androidx.compose.ui.unit.u.m(j4), this.f3085b.invoke(Integer.valueOf((int) (j4 & 4294967295L))).intValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(a(uVar.getPackedValue()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f3086b = new t(1);

        t() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf((-i4) / 2);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Landroidx/compose/ui/unit/q;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3087b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.r.a(this.f3087b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(j4))).intValue(), 0);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class v extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f3088b = new v(1);

        v() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf((-i4) / 2);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Landroidx/compose/ui/unit/q;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3089b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.r.a(0, this.f3089b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.j(j4))).intValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final x f3090b = new x(1);

        x() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf((-i4) / 2);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Landroidx/compose/ui/unit/q;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3091b = lVar;
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.r.a(this.f3091b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(j4))).intValue(), 0);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class z extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final z f3092b = new z(1);

        z() {
            super(1);
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf((-i4) / 2);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static {
        u.Companion companion = androidx.compose.ui.unit.u.INSTANCE;
        f3054d = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(1, 1)), 1, null);
    }

    public static /* synthetic */ h0 A(androidx.compose.animation.core.p0 p0Var, c.b bVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.s();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = o.f3081b;
        }
        return z(p0Var, bVar, z4, lVar);
    }

    @x4
    @fg.l
    public static final h0 B(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l androidx.compose.ui.c cVar, boolean z4, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> lVar) {
        return new i0(new e1(null, null, new androidx.compose.animation.v(cVar, lVar, p0Var, z4), null, false, null, 59, null));
    }

    public static /* synthetic */ h0 C(androidx.compose.animation.core.p0 p0Var, androidx.compose.ui.c cVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.e();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = q.f3083b;
        }
        return B(p0Var, cVar, z4, lVar);
    }

    @x4
    @fg.l
    public static final h0 D(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l c.InterfaceC0326c interfaceC0326c, boolean z4, @fg.l ld.l<? super Integer, Integer> lVar) {
        return B(p0Var, S(interfaceC0326c), z4, new s(lVar));
    }

    public static /* synthetic */ h0 E(androidx.compose.animation.core.p0 p0Var, c.InterfaceC0326c interfaceC0326c, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            interfaceC0326c = androidx.compose.ui.c.INSTANCE.a();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = r.f3084b;
        }
        return D(p0Var, interfaceC0326c, z4, lVar);
    }

    @x4
    @fg.l
    public static final f0 F(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> lVar) {
        return new g0(new e1(null, new y0(lVar, p0Var), null, null, false, null, 61, null));
    }

    public static /* synthetic */ f0 G(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        return F(p0Var, lVar);
    }

    @x4
    @fg.l
    public static final f0 H(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super Integer, Integer> lVar) {
        return F(p0Var, new u(lVar));
    }

    public static /* synthetic */ f0 I(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            lVar = t.f3086b;
        }
        return H(p0Var, lVar);
    }

    @x4
    @fg.l
    public static final f0 J(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super Integer, Integer> lVar) {
        return F(p0Var, new w(lVar));
    }

    public static /* synthetic */ f0 K(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            lVar = v.f3088b;
        }
        return J(p0Var, lVar);
    }

    @x4
    @fg.l
    public static final h0 L(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> lVar) {
        return new i0(new e1(null, new y0(lVar, p0Var), null, null, false, null, 61, null));
    }

    public static /* synthetic */ h0 M(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        return L(p0Var, lVar);
    }

    @x4
    @fg.l
    public static final h0 N(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super Integer, Integer> lVar) {
        return L(p0Var, new y(lVar));
    }

    public static /* synthetic */ h0 O(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            lVar = x.f3090b;
        }
        return N(p0Var, lVar);
    }

    @x4
    @fg.l
    public static final h0 P(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var, @fg.l ld.l<? super Integer, Integer> lVar) {
        return L(p0Var, new a0(lVar));
    }

    public static /* synthetic */ h0 Q(androidx.compose.animation.core.p0 p0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            lVar = z.f3092b;
        }
        return P(p0Var, lVar);
    }

    private static final androidx.compose.ui.c R(c.b bVar) {
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        return kotlin.jvm.internal.l0.g(bVar, companion.u()) ? companion.o() : kotlin.jvm.internal.l0.g(bVar, companion.s()) ? companion.k() : companion.i();
    }

    private static final androidx.compose.ui.c S(c.InterfaceC0326c interfaceC0326c) {
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        return kotlin.jvm.internal.l0.g(interfaceC0326c, companion.w()) ? companion.y() : kotlin.jvm.internal.l0.g(interfaceC0326c, companion.a()) ? companion.c() : companion.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @androidx.compose.runtime.i
    public static final f0 T(@fg.l e2<b0> e2Var, @fg.l f0 f0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(21614502);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(21614502, i4, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = t4.g(f0Var, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        if (e2Var.h() == e2Var.o() && e2Var.h() == b0.Visible) {
            if (e2Var.t()) {
                k2Var.setValue(f0Var);
            } else {
                f0.INSTANCE.getClass();
                k2Var.setValue(f0.f3170c);
            }
        } else if (e2Var.o() == b0.Visible) {
            k2Var.setValue(((f0) k2Var.getValue()).c(f0Var));
        }
        f0 f0Var2 = (f0) k2Var.getValue();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f0Var2;
    }

    private static final f0 U(androidx.compose.runtime.k2<f0> k2Var) {
        return k2Var.getValue();
    }

    private static final void V(androidx.compose.runtime.k2<f0> k2Var, f0 f0Var) {
        k2Var.setValue(f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @androidx.compose.runtime.i
    public static final h0 W(@fg.l e2<b0> e2Var, @fg.l h0 h0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1363864804);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1363864804, i4, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = t4.g(h0Var, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        if (e2Var.h() == e2Var.o() && e2Var.h() == b0.Visible) {
            if (e2Var.t()) {
                k2Var.setValue(h0Var);
            } else {
                h0.INSTANCE.getClass();
                k2Var.setValue(h0.f3180c);
            }
        } else if (e2Var.o() != b0.Visible) {
            k2Var.setValue(((h0) k2Var.getValue()).d(h0Var));
        }
        h0 h0Var2 = (h0) k2Var.getValue();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h0Var2;
    }

    private static final h0 X(androidx.compose.runtime.k2<h0> k2Var) {
        return k2Var.getValue();
    }

    private static final void Y(androidx.compose.runtime.k2<h0> k2Var, h0 h0Var) {
        k2Var.setValue(h0Var);
    }

    @fg.l
    public static final f0 b(@fg.l Object obj, @fg.l androidx.compose.ui.node.y0<? extends q.d> y0Var) {
        return new g0(new e1(null, null, null, null, false, kotlin.collections.z0.k(new kotlin.q0(obj, y0Var)), 31, null));
    }

    @fg.l
    public static final h0 c(@fg.l Object obj, @fg.l androidx.compose.ui.node.y0<? extends q.d> y0Var) {
        return new i0(new e1(null, null, null, null, false, kotlin.collections.z0.k(new kotlin.q0(obj, y0Var)), 31, null));
    }

    @androidx.compose.runtime.i
    private static final o0 g(final e2<b0> e2Var, final f0 f0Var, final h0 h0Var, String str, androidx.compose.runtime.t tVar, int i4) {
        final e2.a aVar;
        final e2.a aVar2;
        tVar.P(642253525);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(642253525, i4, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z4 = (f0Var.getData().k() == null && h0Var.getData().k() == null) ? false : true;
        boolean z5 = (f0Var.getData().m() == null && h0Var.getData().m() == null) ? false : true;
        tVar.P(-1158245383);
        if (z4) {
            i2<Float, androidx.compose.animation.core.o> i5 = k2.i(kotlin.jvm.internal.a0.f75283a);
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = str + " alpha";
                tVar.E(Q);
            }
            tVar.p0();
            aVar = f2.l(e2Var, i5, (String) Q, tVar, (i4 & 14) | net.minidev.json.parser.f.f81763q, 0);
        } else {
            aVar = null;
        }
        tVar.p0();
        tVar.P(-1158245186);
        if (z5) {
            i2<Float, androidx.compose.animation.core.o> i6 = k2.i(kotlin.jvm.internal.a0.f75283a);
            tVar.P(-492369756);
            Object Q2 = tVar.Q();
            if (Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = str + " scale";
                tVar.E(Q2);
            }
            tVar.p0();
            aVar2 = f2.l(e2Var, i6, (String) Q2, tVar, (i4 & 14) | net.minidev.json.parser.f.f81763q, 0);
        } else {
            aVar2 = null;
        }
        tVar.p0();
        final e2.a l4 = z5 ? f2.l(e2Var, f3051a, "TransformOriginInterruptionHandling", tVar, (i4 & 14) | net.minidev.json.parser.f.f81763q, 0) : null;
        o0 o0Var = new o0() { // from class: androidx.compose.animation.c0
            @Override // androidx.compose.animation.o0
            public final ld.l a() {
                ld.l h4;
                h4 = d0.h(e2.a.this, aVar2, e2Var, f0Var, h0Var, l4);
                return h4;
            }
        };
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.l h(e2.a aVar, e2.a aVar2, e2 e2Var, f0 f0Var, h0 h0Var, e2.a aVar3) {
        p6 b5;
        b5 a5 = aVar != null ? aVar.a(new c(f0Var, h0Var), new d(f0Var, h0Var)) : null;
        b5 a6 = aVar2 != null ? aVar2.a(new f(f0Var, h0Var), new g(f0Var, h0Var)) : null;
        if (e2Var.h() == b0.PreEnter) {
            t0 m4 = f0Var.getData().m();
            if (m4 != null || (m4 = h0Var.getData().m()) != null) {
                b5 = p6.b(m4.h());
            }
            b5 = null;
        } else {
            t0 m5 = h0Var.getData().m();
            if (m5 != null || (m5 = f0Var.getData().m()) != null) {
                b5 = p6.b(m5.h());
            }
            b5 = null;
        }
        return new e(a5, a6, aVar3 != null ? aVar3.a(h.f3071b, new i(b5, f0Var, h0Var)) : null);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.q i(@fg.l e2<b0> e2Var, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l String str, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        e2.a aVar;
        e2.a aVar2;
        androidx.compose.animation.v i6;
        tVar.P(914000546);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(914000546, i4, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i7 = i4 & 14;
        f0 T = T(e2Var, f0Var, tVar, i4 & 126);
        h0 W = W(e2Var, h0Var, tVar, ((i4 >> 3) & 112) | i7);
        boolean z4 = (T.getData().n() == null && W.getData().n() == null) ? false : true;
        boolean z5 = (T.getData().i() == null && W.getData().i() == null) ? false : true;
        tVar.P(1657242209);
        e2.a aVar3 = null;
        if (z4) {
            i2<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> d5 = k2.d(androidx.compose.ui.unit.q.INSTANCE);
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = str + " slide";
                tVar.E(Q);
            }
            tVar.p0();
            i5 = -492369756;
            aVar = f2.l(e2Var, d5, (String) Q, tVar, i7 | net.minidev.json.parser.f.f81763q, 0);
        } else {
            i5 = -492369756;
            aVar = null;
        }
        tVar.p0();
        tVar.P(1657242379);
        if (z5) {
            i2<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> e4 = k2.e(androidx.compose.ui.unit.u.INSTANCE);
            tVar.P(i5);
            Object Q2 = tVar.Q();
            if (Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = str + " shrink/expand";
                tVar.E(Q2);
            }
            tVar.p0();
            aVar2 = f2.l(e2Var, e4, (String) Q2, tVar, i7 | net.minidev.json.parser.f.f81763q, 0);
        } else {
            aVar2 = null;
        }
        tVar.p0();
        tVar.P(1657242547);
        if (z5) {
            i2<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> d6 = k2.d(androidx.compose.ui.unit.q.INSTANCE);
            tVar.P(i5);
            Object Q3 = tVar.Q();
            if (Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = str + " InterruptionHandlingOffset";
                tVar.E(Q3);
            }
            tVar.p0();
            aVar3 = f2.l(e2Var, d6, (String) Q3, tVar, i7 | net.minidev.json.parser.f.f81763q, 0);
        }
        tVar.p0();
        androidx.compose.animation.v i10 = T.getData().i();
        androidx.compose.ui.q w32 = p4.e(androidx.compose.ui.q.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((i10 == null || i10.i()) && ((i6 = W.getData().i()) == null || i6.i()) && z5) ? false : true), null, 0L, 0L, 0, 126975, null).w3(new EnterExitTransitionElement(e2Var, aVar2, aVar3, aVar, T, W, g(e2Var, T, W, str, tVar, i4 & 7182)));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w32;
    }

    @x4
    @fg.l
    public static final f0 j(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l c.b bVar, boolean z4, @fg.l ld.l<? super Integer, Integer> lVar) {
        return l(p0Var, R(bVar), z4, new k(lVar));
    }

    public static /* synthetic */ f0 k(androidx.compose.animation.core.p0 p0Var, c.b bVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.s();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = j.f3076b;
        }
        return j(p0Var, bVar, z4, lVar);
    }

    @x4
    @fg.l
    public static final f0 l(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l androidx.compose.ui.c cVar, boolean z4, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> lVar) {
        return new g0(new e1(null, null, new androidx.compose.animation.v(cVar, lVar, p0Var, z4), null, false, null, 59, null));
    }

    public static /* synthetic */ f0 m(androidx.compose.animation.core.p0 p0Var, androidx.compose.ui.c cVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.e();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = l.f3078b;
        }
        return l(p0Var, cVar, z4, lVar);
    }

    @x4
    @fg.l
    public static final f0 n(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l c.InterfaceC0326c interfaceC0326c, boolean z4, @fg.l ld.l<? super Integer, Integer> lVar) {
        return l(p0Var, S(interfaceC0326c), z4, new n(lVar));
    }

    public static /* synthetic */ f0 o(androidx.compose.animation.core.p0 p0Var, c.InterfaceC0326c interfaceC0326c, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }
        if ((i4 & 2) != 0) {
            interfaceC0326c = androidx.compose.ui.c.INSTANCE.a();
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if ((i4 & 8) != 0) {
            lVar = m.f3079b;
        }
        return n(p0Var, interfaceC0326c, z4, lVar);
    }

    @x4
    @fg.l
    public static final f0 p(@fg.l androidx.compose.animation.core.p0<Float> p0Var, float f4) {
        return new g0(new e1(new k0(f4, p0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ f0 q(androidx.compose.animation.core.p0 p0Var, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        return p(p0Var, f4);
    }

    @x4
    @fg.l
    public static final h0 r(@fg.l androidx.compose.animation.core.p0<Float> p0Var, float f4) {
        return new i0(new e1(new k0(f4, p0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ h0 s(androidx.compose.animation.core.p0 p0Var, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        return r(p0Var, f4);
    }

    @fg.m
    public static final androidx.compose.ui.node.y0<? extends q.d> t(@fg.l f0 f0Var, @fg.l Object obj) {
        return f0Var.getData().j().get(obj);
    }

    @fg.m
    public static final androidx.compose.ui.node.y0<? extends q.d> u(@fg.l h0 h0Var, @fg.l Object obj) {
        return h0Var.getData().j().get(obj);
    }

    @x4
    @fg.l
    public static final f0 v(@fg.l androidx.compose.animation.core.p0<Float> p0Var, float f4, long j4) {
        return new g0(new e1(null, null, null, new t0(f4, j4, p0Var, null), false, null, 55, null));
    }

    public static f0 w(androidx.compose.animation.core.p0 p0Var, float f4, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            p6.INSTANCE.getClass();
            j4 = p6.f17986c;
        }
        return v(p0Var, f4, j4);
    }

    @x4
    @fg.l
    public static final h0 x(@fg.l androidx.compose.animation.core.p0<Float> p0Var, float f4, long j4) {
        return new i0(new e1(null, null, null, new t0(f4, j4, p0Var, null), false, null, 55, null));
    }

    public static h0 y(androidx.compose.animation.core.p0 p0Var, float f4, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            p6.INSTANCE.getClass();
            j4 = p6.f17986c;
        }
        return x(p0Var, f4, j4);
    }

    @x4
    @fg.l
    public static final h0 z(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.l c.b bVar, boolean z4, @fg.l ld.l<? super Integer, Integer> lVar) {
        return B(p0Var, R(bVar), z4, new p(lVar));
    }
}
