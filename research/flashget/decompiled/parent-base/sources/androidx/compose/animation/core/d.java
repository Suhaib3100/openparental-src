package androidx.compose.animation.core;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import com.tencent.rtmp.TXLiveConstants;
import i0.f;
import i0.n;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

/* compiled from: AnimateAsState.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aR\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0001\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012\u001aO\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aR\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012\u001aR\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u0001\u001a\u00020\u001d2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0012\u001a\u007f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b$\u0010%\u001aO\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b&\u0010'\u001aH\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aH\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aH\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0001\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010+\u001aE\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b-\u0010.\u001aE\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b/\u00100\u001aH\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010+\u001aH\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u0001\u001a\u00020\u001d2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010+\u001au\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b3\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\r058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0010058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00107\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107\"\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00107\"\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006*\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 8\nX\u008a\u0084\u0002²\u0006\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010!*\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/k;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "Lkotlin/k2;", "finishedListener", "Landroidx/compose/runtime/b5;", "e", "(FLandroidx/compose/animation/core/k;FLjava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/unit/h;", "c", "(FLandroidx/compose/animation/core/k;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Li0/n;", "r", "(JLandroidx/compose/animation/core/k;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Li0/f;", "m", "Li0/i;", "o", "(Li0/i;Landroidx/compose/animation/core/k;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "", "g", "(ILandroidx/compose/animation/core/k;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/unit/q;", "j", "Landroidx/compose/ui/unit/u;", "k", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "typeConverter", "s", "(Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/k;Ljava/lang/Object;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "f", "(FLandroidx/compose/animation/core/k;FLld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "d", "(FLandroidx/compose/animation/core/k;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "q", "(JLandroidx/compose/animation/core/k;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "n", "p", "(Li0/i;Landroidx/compose/animation/core/k;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "h", "(ILandroidx/compose/animation/core/k;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "i", "l", "t", "(Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/k;Ljava/lang/Object;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/y1;", "a", "Landroidx/compose/animation/core/y1;", "defaultAnimation", "b", "dpDefaultSpring", "sizeDefaultSpring", "offsetDefaultSpring", "rectDefaultSpring", "intDefaultSpring", "intOffsetDefaultSpring", "intSizeDefaultSpring", "listener", "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1116#3,6:586\n1116#3,6:593\n1116#3,6:600\n1116#3,6:607\n1116#3,6:614\n1116#3,6:621\n81#4:627\n81#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y1<Float> f2605a = l.p(0.0f, 0.0f, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final y1<androidx.compose.ui.unit.h> f2606b = l.p(0.0f, 0.0f, androidx.compose.ui.unit.h.d(z2.a(androidx.compose.ui.unit.h.INSTANCE)), 3, null);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final y1<i0.n> f2607c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final y1<i0.f> f2608d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final y1<i0.i> f2609e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final y1<Integer> f2610f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final y1<androidx.compose.ui.unit.q> f2611g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final y1<androidx.compose.ui.unit.u> f2612h;

    /* compiled from: AnimateAsState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<T> f2613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f2614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlinx.coroutines.channels.l<T> lVar, T t4) {
            super(0);
            this.f2613b = lVar;
            this.f2614c = t4;
        }

        public final void a() {
            this.f2613b.M(this.f2614c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AnimateAsState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f2615b;

        /* renamed from: c, reason: collision with root package name */
        int f2616c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f2617d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<T> f2618e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<T, V> f2619f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b5<k<T>> f2620g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<T, kotlin.k2>> f2621h;

        /* compiled from: AnimateAsState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f2622b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f2623c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.b<T, V> f2624d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b5<k<T>> f2625e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b5<ld.l<T, kotlin.k2>> f2626f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t4, androidx.compose.animation.core.b<T, V> bVar, b5<? extends k<T>> b5Var, b5<? extends ld.l<? super T, kotlin.k2>> b5Var2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f2623c = t4;
                this.f2624d = bVar;
                this.f2625e = b5Var;
                this.f2626f = b5Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f2623c, this.f2624d, this.f2625e, this.f2626f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f2622b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    if (!kotlin.jvm.internal.l0.g(this.f2623c, this.f2624d.s())) {
                        androidx.compose.animation.core.b<T, V> bVar = this.f2624d;
                        T t4 = this.f2623c;
                        k b5 = d.b(this.f2625e);
                        this.f2622b = 1;
                        if (androidx.compose.animation.core.b.i(bVar, t4, b5, null, null, this, 12, null) == aVar) {
                            return aVar;
                        }
                    }
                    return kotlin.k2.f75408a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                ld.l a5 = d.a(this.f2626f);
                if (a5 != null) {
                    a5.invoke(this.f2624d.v());
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.channels.l<T> lVar, androidx.compose.animation.core.b<T, V> bVar, b5<? extends k<T>> b5Var, b5<? extends ld.l<? super T, kotlin.k2>> b5Var2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f2618e = lVar;
            this.f2619f = bVar;
            this.f2620g = b5Var;
            this.f2621h = b5Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f2618e, this.f2619f, this.f2620g, this.f2621h, dVar);
            bVar.f2617d = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:5:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r13.f2616c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r13.f2615b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r3 = r13.f2617d
                kotlinx.coroutines.r0 r3 = (kotlinx.coroutines.r0) r3
                kotlin.a1.n(r14)
                r4 = r14
                goto L3b
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                kotlin.a1.n(r14)
                java.lang.Object r1 = r13.f2617d
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlinx.coroutines.channels.l<T> r3 = r13.f2618e
                kotlinx.coroutines.channels.n r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L2e:
                r13.f2617d = r3
                r13.f2615b = r1
                r13.f2616c = r2
                java.lang.Object r4 = r1.c(r13)
                if (r4 != r0) goto L3b
                return r0
            L3b:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6d
                java.lang.Object r4 = r1.next()
                kotlinx.coroutines.channels.l<T> r5 = r13.f2618e
                java.lang.Object r5 = r5.T()
                java.lang.Object r5 = kotlinx.coroutines.channels.p.h(r5)
                if (r5 != 0) goto L55
                r7 = r4
                goto L56
            L55:
                r7 = r5
            L56:
                androidx.compose.animation.core.d$b$a r4 = new androidx.compose.animation.core.d$b$a
                androidx.compose.animation.core.b<T, V> r8 = r13.f2619f
                androidx.compose.runtime.b5<androidx.compose.animation.core.k<T>> r9 = r13.f2620g
                androidx.compose.runtime.b5<ld.l<T, kotlin.k2>> r10 = r13.f2621h
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                goto L2e
            L6d:
                kotlin.k2 r0 = kotlin.k2.f75408a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    static {
        n.Companion companion = i0.n.INSTANCE;
        f2607c = l.p(0.0f, 0.0f, i0.n.c(i0.o.a(0.5f, 0.5f)), 3, null);
        f.Companion companion2 = i0.f.INSTANCE;
        f2608d = l.p(0.0f, 0.0f, i0.f.d(i0.g.a(0.5f, 0.5f)), 3, null);
        f2609e = l.p(0.0f, 0.0f, z2.h(i0.i.INSTANCE), 3, null);
        kotlin.jvm.internal.j0 j0Var = kotlin.jvm.internal.j0.f75314a;
        f2610f = l.p(0.0f, 0.0f, 1, 3, null);
        q.Companion companion3 = androidx.compose.ui.unit.q.INSTANCE;
        f2611g = l.p(0.0f, 0.0f, androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.r.a(1, 1)), 3, null);
        u.Companion companion4 = androidx.compose.ui.unit.u.INSTANCE;
        f2612h = l.p(0.0f, 0.0f, androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(1, 1)), 3, null);
    }

    public static final ld.l a(b5 b5Var) {
        return (ld.l) b5Var.getValue();
    }

    public static final k b(b5 b5Var) {
        return (k) b5Var.getValue();
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<androidx.compose.ui.unit.h> c(float f4, @fg.m k<androidx.compose.ui.unit.h> kVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.unit.h, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1407150062);
        k<androidx.compose.ui.unit.h> kVar2 = (i5 & 2) != 0 ? f2606b : kVar;
        String str2 = (i5 & 4) != 0 ? "DpAnimation" : str;
        ld.l<? super androidx.compose.ui.unit.h, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1407150062, i4, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i6 = i4 << 6;
        b5<androidx.compose.ui.unit.h> s4 = s(androidx.compose.ui.unit.h.d(f4), k2.b(androidx.compose.ui.unit.h.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 d(float f4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(704104481);
        if ((i5 & 2) != 0) {
            kVar = f2606b;
        }
        k kVar2 = kVar;
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        ld.l lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(704104481, i4, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        b5 s4 = s(androidx.compose.ui.unit.h.d(f4), k2.b(androidx.compose.ui.unit.h.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<Float> e(float f4, @fg.m k<Float> kVar, float f5, @fg.m String str, @fg.m ld.l<? super Float, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(668842840);
        k<Float> kVar2 = (i5 & 2) != 0 ? f2605a : kVar;
        float f6 = (i5 & 4) != 0 ? 0.01f : f5;
        String str2 = (i5 & 8) != 0 ? "FloatAnimation" : str;
        ld.l<? super Float, kotlin.k2> lVar2 = (i5 & 16) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(668842840, i4, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        tVar.P(841393662);
        if (kVar2 == f2605a) {
            Float valueOf = Float.valueOf(f6);
            tVar.P(1157296644);
            boolean q02 = tVar.q0(valueOf);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = l.p(0.0f, 0.0f, Float.valueOf(f6), 3, null);
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (k) Q;
        }
        tVar.p0();
        int i6 = i4 << 3;
        b5<Float> s4 = s(Float.valueOf(f4), k2.i(kotlin.jvm.internal.a0.f75283a), kVar2, Float.valueOf(f6), str2, lVar2, tVar, (i6 & 7168) | (i4 & 14) | (57344 & i6) | (i6 & 458752), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 f(float f4, k kVar, float f5, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1091643291);
        if ((i5 & 2) != 0) {
            kVar = f2605a;
        }
        k kVar2 = kVar;
        if ((i5 & 4) != 0) {
            f5 = 0.01f;
        }
        float f6 = f5;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        ld.l lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1091643291, i4, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        b5<Float> e4 = e(f4, kVar2, f6, null, lVar2, tVar, (i4 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED) | ((i4 << 3) & 57344), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<Integer> g(int i4, @fg.m k<Integer> kVar, @fg.m String str, @fg.m ld.l<? super Integer, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(428074472);
        k<Integer> kVar2 = (i6 & 2) != 0 ? f2610f : kVar;
        String str2 = (i6 & 4) != 0 ? "IntAnimation" : str;
        ld.l<? super Integer, kotlin.k2> lVar2 = (i6 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(428074472, i5, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i7 = i5 << 6;
        b5<Integer> s4 = s(Integer.valueOf(i4), k2.j(kotlin.jvm.internal.j0.f75314a), kVar2, null, str2, lVar2, tVar, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i7) | (i7 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 h(int i4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-842612981);
        if ((i6 & 2) != 0) {
            kVar = f2610f;
        }
        k kVar2 = kVar;
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        ld.l lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-842612981, i5, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        b5 s4 = s(Integer.valueOf(i4), k2.j(kotlin.jvm.internal.j0.f75314a), kVar2, null, null, lVar2, tVar, (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 i(long j4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1010307371);
        k kVar2 = (i5 & 2) != 0 ? f2611g : kVar;
        ld.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1010307371, i4, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        b5 s4 = s(androidx.compose.ui.unit.q.b(j4), k2.d(androidx.compose.ui.unit.q.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<androidx.compose.ui.unit.q> j(long j4, @fg.m k<androidx.compose.ui.unit.q> kVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.unit.q, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-696782904);
        k<androidx.compose.ui.unit.q> kVar2 = (i5 & 2) != 0 ? f2611g : kVar;
        String str2 = (i5 & 4) != 0 ? "IntOffsetAnimation" : str;
        ld.l<? super androidx.compose.ui.unit.q, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-696782904, i4, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i6 = i4 << 6;
        b5<androidx.compose.ui.unit.q> s4 = s(androidx.compose.ui.unit.q.b(j4), k2.d(androidx.compose.ui.unit.q.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<androidx.compose.ui.unit.u> k(long j4, @fg.m k<androidx.compose.ui.unit.u> kVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.unit.u, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(582576328);
        k<androidx.compose.ui.unit.u> kVar2 = (i5 & 2) != 0 ? f2612h : kVar;
        String str2 = (i5 & 4) != 0 ? "IntSizeAnimation" : str;
        ld.l<? super androidx.compose.ui.unit.u, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(582576328, i4, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i6 = i4 << 6;
        b5<androidx.compose.ui.unit.u> s4 = s(androidx.compose.ui.unit.u.b(j4), k2.e(androidx.compose.ui.unit.u.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 l(long j4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1749239765);
        k kVar2 = (i5 & 2) != 0 ? f2612h : kVar;
        ld.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1749239765, i4, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        b5 s4 = s(androidx.compose.ui.unit.u.b(j4), k2.e(androidx.compose.ui.unit.u.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<i0.f> m(long j4, @fg.m k<i0.f> kVar, @fg.m String str, @fg.m ld.l<? super i0.f, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(357896800);
        k<i0.f> kVar2 = (i5 & 2) != 0 ? f2608d : kVar;
        String str2 = (i5 & 4) != 0 ? "OffsetAnimation" : str;
        ld.l<? super i0.f, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(357896800, i4, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i6 = i4 << 6;
        b5<i0.f> s4 = s(i0.f.d(j4), k2.f(i0.f.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 n(long j4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-456513133);
        k kVar2 = (i5 & 2) != 0 ? f2608d : kVar;
        ld.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-456513133, i4, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        b5 s4 = s(i0.f.d(j4), k2.f(i0.f.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<i0.i> o(@fg.l i0.i iVar, @fg.m k<i0.i> kVar, @fg.m String str, @fg.m ld.l<? super i0.i, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(536062978);
        k<i0.i> kVar2 = (i5 & 2) != 0 ? f2609e : kVar;
        String str2 = (i5 & 4) != 0 ? "RectAnimation" : str;
        ld.l<? super i0.i, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(536062978, i4, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i6 = i4 << 6;
        b5<i0.i> s4 = s(iVar, k2.g(i0.i.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 p(i0.i iVar, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-782613967);
        if ((i5 & 2) != 0) {
            kVar = f2609e;
        }
        k kVar2 = kVar;
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        ld.l lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-782613967, i4, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        b5 s4 = s(iVar, k2.g(i0.i.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 q(long j4, k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(875212471);
        k kVar2 = (i5 & 2) != 0 ? f2607c : kVar;
        ld.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(875212471, i4, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        b5 s4 = s(i0.n.c(j4), k2.h(i0.n.INSTANCE), kVar2, null, null, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | ((i4 << 9) & 458752), 24);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<i0.n> r(long j4, @fg.m k<i0.n> kVar, @fg.m String str, @fg.m ld.l<? super i0.n, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1374633148);
        k<i0.n> kVar2 = (i5 & 2) != 0 ? f2607c : kVar;
        String str2 = (i5 & 4) != 0 ? "SizeAnimation" : str;
        ld.l<? super i0.n, kotlin.k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1374633148, i4, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i6 = i4 << 6;
        b5<i0.n> s4 = s(i0.n.c(j4), k2.h(i0.n.INSTANCE), kVar2, null, str2, lVar2, tVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T, V extends s> b5<T> s(T t4, @fg.l i2<T, V> i2Var, @fg.m k<T> kVar, @fg.m T t5, @fg.m String str, @fg.m ld.l<? super T, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        k<T> kVar2;
        tVar.P(-1994373980);
        if ((i5 & 4) != 0) {
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = l.p(0.0f, 0.0f, null, 7, null);
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (k) Q;
        } else {
            kVar2 = kVar;
        }
        T t6 = (i5 & 8) != 0 ? null : t5;
        String str2 = (i5 & 16) != 0 ? "ValueAnimation" : str;
        ld.l<? super T, kotlin.k2> lVar2 = (i5 & 32) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1994373980, i4, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        tVar.P(-492369756);
        Object Q2 = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q2 == companion.a()) {
            Q2 = t4.g(null, null, 2, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q2;
        tVar.P(-492369756);
        Object Q3 = tVar.Q();
        if (Q3 == companion.a()) {
            Q3 = new androidx.compose.animation.core.b(t4, i2Var, t6, str2);
            tVar.E(Q3);
        }
        tVar.p0();
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q3;
        b5 u4 = o4.u(lVar2, tVar, (i4 >> 15) & 14);
        if (t6 != null && (kVar2 instanceof y1)) {
            y1 y1Var = (y1) kVar2;
            if (!kotlin.jvm.internal.l0.g(y1Var.j(), t6)) {
                kVar2 = new y1(y1Var.getDampingRatio(), y1Var.getStiffness(), t6);
            }
        }
        b5 u5 = o4.u(kVar2, tVar, 0);
        tVar.P(-492369756);
        Object Q4 = tVar.Q();
        if (Q4 == companion.a()) {
            Q4 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
            tVar.E(Q4);
        }
        tVar.p0();
        kotlinx.coroutines.channels.l lVar3 = (kotlinx.coroutines.channels.l) Q4;
        androidx.compose.runtime.a1.k(new a(lVar3, t4), tVar, 0);
        androidx.compose.runtime.a1.h(lVar3, new b(lVar3, bVar, u5, u4, null), tVar, 72);
        b5<T> b5Var = (b5) k2Var.getValue();
        if (b5Var == null) {
            b5Var = bVar.j();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5Var;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 t(Object obj, i2 i2Var, k kVar, Object obj2, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        k kVar2;
        tVar.P(-846382129);
        if ((i5 & 4) != 0) {
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = l.p(0.0f, 0.0f, null, 7, null);
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (k) Q;
        } else {
            kVar2 = kVar;
        }
        Object obj3 = (i5 & 8) != 0 ? null : obj2;
        ld.l lVar2 = (i5 & 16) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-846382129, i4, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i6 = i4 & 8;
        b5 s4 = s(obj, i2Var, kVar2, obj3, "ValueAnimation", lVar2, tVar, (i6 << 9) | i6 | 24576 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | ((i4 << 3) & 458752), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    private static final <T> ld.l<T, kotlin.k2> u(b5<? extends ld.l<? super T, kotlin.k2>> b5Var) {
        return b5Var.getValue();
    }

    private static final <T> k<T> v(b5<? extends k<T>> b5Var) {
        return b5Var.getValue();
    }
}
