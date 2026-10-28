package androidx.compose.animation.core;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004137$B#\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ'\u0010\u001b\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u001e2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b!\u0010 J)\u0010$\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\r2\u0018\u0010#\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000H\u0001¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J)\u0010/\u001a\u00020\r2\u0018\u0010.\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030-R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010,R+\u0010\u0019\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R7\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000=2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000=8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR1\u0010\u001a\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u001f\u0010C\u0012\u0004\bG\u0010\u000f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u0017R+\u0010J\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010C\u001a\u0004\bH\u0010E\"\u0004\bI\u0010\u0017R+\u0010P\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bK\u00108\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR,\u0010T\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u00000Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010U\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010SR1\u0010Z\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u001e8F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bV\u00108\u0012\u0004\bY\u0010\u000f\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR\"\u0010\\\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010N\u001a\u0004\bV\u0010E\"\u0004\b[\u0010\u0017R\u001b\u0010_\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010]\u001a\u0004\b^\u0010ER\u0011\u0010`\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bR\u0010:R\u0011\u0010b\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\ba\u0010MR\u001b\u0010f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR)\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u00000c8F¢\u0006\u0006\u001a\u0004\bK\u0010e¨\u0006h"}, d2 = {"Landroidx/compose/animation/core/e2;", "S", "", "Landroidx/compose/animation/core/g2;", "transitionState", "", "label", "<init>", "(Landroidx/compose/animation/core/g2;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/h1;", "(Landroidx/compose/animation/core/h1;Ljava/lang/String;)V", "Lkotlin/k2;", "v", "()V", "", "frameTimeNanos", "", "durationScale", "w", "(JF)V", "y", "(J)V", "x", "targetState", "playTimeNanos", "C", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "", "e", "(Landroidx/compose/animation/core/e2;)Z", "B", "Landroidx/compose/animation/core/e2$d;", "animation", "d", "(Landroidx/compose/animation/core/e2$d;)Z", "A", "(Landroidx/compose/animation/core/e2$d;)V", "K", "(Ljava/lang/Object;Landroidx/compose/runtime/t;I)V", "f", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/e2$a;", "deferredAnimation", "z", "(Landroidx/compose/animation/core/e2$a;)V", "a", "Landroidx/compose/animation/core/g2;", "b", "Ljava/lang/String;", "i", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "o", "()Ljava/lang/Object;", "I", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/e2$b;", "m", "()Landroidx/compose/animation/core/e2$b;", "G", "(Landroidx/compose/animation/core/e2$b;)V", "segment", "Landroidx/compose/runtime/j2;", "k", "()J", "E", "l", "n", "H", "startTimeNanos", "g", "r", "()Z", "J", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/b0;", "h", "Landroidx/compose/runtime/snapshots/b0;", "_animations", "_transitions", "j", "t", "F", "u", "isSeeking", "D", "lastSeekedTimeNanos", "Landroidx/compose/runtime/b5;", "p", "totalDurationNanos", "currentState", "s", "isRunning", "", "q", "()Ljava/util/List;", "transitions", "animations", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n81#2:1395\n107#2,2:1396\n81#2:1398\n107#2,2:1399\n81#2:1401\n76#3:1389\n109#3,2:1390\n76#3:1392\n109#3,2:1393\n33#4,6:1402\n33#4,6:1408\n33#4,6:1414\n33#4,6:1420\n33#4,6:1426\n256#4,3:1438\n33#4,4:1441\n259#4,2:1445\n38#4:1447\n261#4:1448\n33#4,6:1449\n1116#5,6:1432\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n408#1:1383\n408#1:1384,2\n415#1:1386\n415#1:1387,2\n434#1:1395\n434#1:1396,2\n455#1:1398\n455#1:1399,2\n467#1:1401\n430#1:1389\n430#1:1390,2\n431#1:1392\n431#1:1393,2\n492#1:1402,6\n501#1:1408,6\n572#1:1414,6\n585#1:1420,6\n630#1:1426,6\n664#1:1438,3\n664#1:1441,4\n664#1:1445,2\n664#1:1447\n664#1:1448\n673#1:1449,6\n646#1:1432,6\n*E\n"})
/* loaded from: classes.dex */
public final class e2<S> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f2644m = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g2<S> transitionState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String label;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 targetState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 segment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.j2 playTimeNanos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.j2 startTimeNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 updateChildrenNeeded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> _animations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.snapshots.b0<e2<?>> _transitions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isSeeking;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 totalDurationNanos;

    /* compiled from: Transition.kt */
    @a1
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0015B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b¢\u0006\u0002\b\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R{\u0010(\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"2.\u0010#\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/e2$a;", "T", "Landroidx/compose/animation/core/s;", "V", "", "Landroidx/compose/animation/core/i2;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/i2;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Lkotlin/u;", "transitionSpec", "Lkotlin/r0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/b5;", "a", "(Lld/l;Lld/l;)Landroidx/compose/runtime/b5;", "Lkotlin/k2;", "f", "()V", "Landroidx/compose/animation/core/i2;", "d", "()Landroidx/compose/animation/core/i2;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Landroidx/compose/animation/core/e2$a$a;", "Landroidx/compose/animation/core/e2;", "<set-?>", "Landroidx/compose/runtime/k2;", "()Landroidx/compose/animation/core/e2$a$a;", "e", "(Landroidx/compose/animation/core/e2$a$a;)V", "data", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n880#1:1383\n880#1:1384,2\n*E\n"})
    public final class a<T, V extends s> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i2<T, V> typeConverter;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String label;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 data;

        /* compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR?\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R=\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0014\u0010&\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/animation/core/e2$a$a;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/e2$d;", "Landroidx/compose/animation/core/e2;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Lkotlin/u;", "transitionSpec", "Lkotlin/r0;", "name", "state", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$d;Lld/l;Lld/l;)V", "segment", "Lkotlin/k2;", "s", "(Landroidx/compose/animation/core/e2$b;)V", "b", "Landroidx/compose/animation/core/e2$d;", "a", "()Landroidx/compose/animation/core/e2$d;", "c", "Lld/l;", "l", "()Lld/l;", "q", "(Lld/l;)V", "d", "i", "m", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.core.e2$a$a, reason: collision with other inner class name */
        public final class C0041a<T, V extends s> implements b5<T> {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final e2<S>.d<T, V> animation;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private ld.l<? super b<S>, ? extends p0<T>> transitionSpec;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private ld.l<? super S, ? extends T> targetValueByState;

            public C0041a(@fg.l e2<S>.d<T, V> dVar, @fg.l ld.l<? super b<S>, ? extends p0<T>> lVar, @fg.l ld.l<? super S, ? extends T> lVar2) {
                this.animation = dVar;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            @fg.l
            public final e2<S>.d<T, V> a() {
                return this.animation;
            }

            @Override // androidx.compose.runtime.b5
            public T getValue() {
                s(e2.this.m());
                return this.animation.getValue();
            }

            @fg.l
            public final ld.l<S, T> i() {
                return this.targetValueByState;
            }

            @fg.l
            public final ld.l<b<S>, p0<T>> l() {
                return this.transitionSpec;
            }

            public final void m(@fg.l ld.l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void q(@fg.l ld.l<? super b<S>, ? extends p0<T>> lVar) {
                this.transitionSpec = lVar;
            }

            public final void s(@fg.l b<S> segment) {
                T invoke = this.targetValueByState.invoke(segment.f());
                if (!e2.this.t()) {
                    this.animation.Z(invoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.Y(this.targetValueByState.invoke(segment.i()), invoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public a(@fg.l i2<T, V> i2Var, @fg.l String str) {
            androidx.compose.runtime.k2 g4;
            this.typeConverter = i2Var;
            this.label = str;
            g4 = t4.g(null, null, 2, null);
            this.data = g4;
        }

        @fg.l
        public final b5<T> a(@fg.l ld.l<? super b<S>, ? extends p0<T>> transitionSpec, @fg.l ld.l<? super S, ? extends T> targetValueByState) {
            e2<S>.C0041a<T, V>.a<T, V> b5 = b();
            if (b5 == null) {
                e2<S> e2Var = e2.this;
                b5 = new C0041a<>(e2Var.new d(targetValueByState.invoke(e2Var.h()), n.i(this.typeConverter, targetValueByState.invoke(e2.this.h())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                e2<S> e2Var2 = e2.this;
                e(b5);
                e2Var2.d(b5.a());
            }
            e2<S> e2Var3 = e2.this;
            b5.m(targetValueByState);
            b5.q(transitionSpec);
            b5.s(e2Var3.m());
            return b5;
        }

        @fg.m
        public final e2<S>.C0041a<T, V>.a<T, V> b() {
            return (C0041a) this.data.getValue();
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @fg.l
        public final i2<T, V> d() {
            return this.typeConverter;
        }

        public final void e(@fg.m e2<S>.C0041a<T, V>.a<T, V> c0041a) {
            this.data.setValue(c0041a);
        }

        public final void f() {
            e2<S>.C0041a<T, V>.a<T, V> b5 = b();
            if (b5 != null) {
                e2<S> e2Var = e2.this;
                b5.a().Y(b5.i().invoke(e2Var.m().i()), b5.i().invoke(e2Var.m().f()), b5.l().invoke(e2Var.m()));
            }
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "S", "", "targetState", "", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "i", "()Ljava/lang/Object;", "initialState", "f", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b<S> {

        /* compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static <S> boolean a(@fg.l b<S> bVar, S s4, S s5) {
                return b.super.j(s4, s5);
            }
        }

        S f();

        S i();

        default boolean j(S s4, S s5) {
            return kotlin.jvm.internal.l0.g(s4, i()) && kotlin.jvm.internal.l0.g(s5, f());
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/e2$c;", "S", "Landroidx/compose/animation/core/e2$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "b", "f", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        public c(S s4, S s5) {
            this.initialState = s4;
            this.targetState = s5;
        }

        public boolean equals(@fg.m Object other) {
            if (other instanceof b) {
                b bVar = (b) other;
                if (kotlin.jvm.internal.l0.g(this.initialState, bVar.i()) && kotlin.jvm.internal.l0.g(this.targetState, bVar.f())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.e2.b
        public S f() {
            return this.targetState;
        }

        public int hashCode() {
            S s4 = this.initialState;
            int hashCode = (s4 != null ? s4.hashCode() : 0) * 31;
            S s5 = this.targetState;
            return hashCode + (s5 != null ? s5.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.e2.b
        public S i() {
            return this.initialState;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00028\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0000¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0000¢\u0006\u0004\b#\u0010$R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001dR+\u0010\u001e\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R7\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00105\"\u0004\b6\u00107RC\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002082\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010D\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010I\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\b\u0001\u0010\u0019R+\u0010L\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR+\u0010O\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010.\u001a\u0004\bN\u00100\"\u0004\b\u0003\u00102R\u0016\u0010R\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010H¨\u0006W"}, d2 = {"Landroidx/compose/animation/core/e2$d;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/b5;", "initialValue", "initialVelocityVector", "Landroidx/compose/animation/core/i2;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/e2;Ljava/lang/Object;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/i2;Ljava/lang/String;)V", "", "isInterrupted", "Lkotlin/k2;", "W", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "F", "(JF)V", "H", "(J)V", "G", "()V", "toString", "()Ljava/lang/String;", "targetValue", "Landroidx/compose/animation/core/p0;", "animationSpec", "Z", "(Ljava/lang/Object;Landroidx/compose/animation/core/p0;)V", "Y", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/p0;)V", "b", "Landroidx/compose/animation/core/i2;", "A", "()Landroidx/compose/animation/core/i2;", "c", "Ljava/lang/String;", "m", "<set-?>", "d", "Landroidx/compose/runtime/k2;", "y", "()Ljava/lang/Object;", "U", "(Ljava/lang/Object;)V", "e", "i", "()Landroidx/compose/animation/core/p0;", "Q", "(Landroidx/compose/animation/core/p0;)V", "Landroidx/compose/animation/core/d2;", "f", "a", "()Landroidx/compose/animation/core/d2;", "K", "(Landroidx/compose/animation/core/d2;)V", "animation", "g", "D", "()Z", "R", "(Z)V", "isFinished", "h", "Landroidx/compose/runtime/j2;", "s", "()J", "offsetTimeNanos", "q", "S", "needsReset", "j", "getValue", "value", "k", "Landroidx/compose/animation/core/s;", "velocityVector", "l", "Landroidx/compose/animation/core/p0;", "interruptionSpec", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x4
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n81#2:1389\n107#2,2:1390\n81#2:1392\n107#2,2:1393\n81#2:1398\n107#2,2:1399\n81#2:1401\n107#2,2:1402\n76#3:1395\n109#3,2:1396\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n696#1:1383\n696#1:1384,2\n702#1:1386\n702#1:1387,2\n709#1:1389\n709#1:1390,2\n717#1:1392\n717#1:1393,2\n719#1:1398\n719#1:1399,2\n722#1:1401\n722#1:1402,2\n718#1:1395\n718#1:1396,2\n*E\n"})
    public final class d<T, V extends s> implements b5<T> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i2<T, V> typeConverter;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String label;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 targetValue;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 animationSpec;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 animation;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 isFinished;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.j2 offsetTimeNanos;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 needsReset;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 value;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private V velocityVector;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p0<T> interruptionSpec;

        public d(T t4, @fg.l V v4, @fg.l i2<T, V> i2Var, @fg.l String str) {
            androidx.compose.runtime.k2 g4;
            androidx.compose.runtime.k2 g5;
            androidx.compose.runtime.k2 g6;
            androidx.compose.runtime.k2 g7;
            androidx.compose.runtime.k2 g10;
            androidx.compose.runtime.k2 g11;
            T t5;
            this.typeConverter = i2Var;
            this.label = str;
            g4 = t4.g(t4, null, 2, null);
            this.targetValue = g4;
            g5 = t4.g(l.p(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animationSpec = g5;
            g6 = t4.g(new d2(i(), i2Var, t4, g4.getValue(), v4), null, 2, null);
            this.animation = g6;
            g7 = t4.g(Boolean.TRUE, null, 2, null);
            this.isFinished = g7;
            this.offsetTimeNanos = androidx.compose.runtime.b.d(0L);
            g10 = t4.g(Boolean.FALSE, null, 2, null);
            this.needsReset = g10;
            g11 = t4.g(t4, null, 2, null);
            this.value = g11;
            this.velocityVector = v4;
            Float f4 = z2.i().get(i2Var);
            if (f4 != null) {
                float floatValue = f4.floatValue();
                V invoke = i2Var.a().invoke(t4);
                int size = invoke.getSize();
                for (int i4 = 0; i4 < size; i4++) {
                    invoke.e(i4, floatValue);
                }
                t5 = this.typeConverter.b().invoke(invoke);
            } else {
                t5 = null;
            }
            this.interruptionSpec = l.p(0.0f, 0.0f, t5, 3, null);
        }

        private final void K(d2<T, V> d2Var) {
            this.animation.setValue(d2Var);
        }

        private final void Q(p0<T> p0Var) {
            this.animationSpec.setValue(p0Var);
        }

        private final void S(boolean z4) {
            this.needsReset.setValue(Boolean.valueOf(z4));
        }

        private final void T(long j4) {
            this.offsetTimeNanos.N(j4);
        }

        private final void U(T t4) {
            this.targetValue.setValue(t4);
        }

        private final void W(T initialValue, boolean isInterrupted) {
            K(new d2<>(isInterrupted ? i() instanceof y1 ? i() : this.interruptionSpec : i(), this.typeConverter, initialValue, this.targetValue.getValue(), this.velocityVector));
            e2.this.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void X(d dVar, Object obj, boolean z4, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            dVar.W(obj, z4);
        }

        private final boolean q() {
            return ((Boolean) this.needsReset.getValue()).booleanValue();
        }

        private final long s() {
            return this.offsetTimeNanos.c();
        }

        private final T y() {
            return this.targetValue.getValue();
        }

        @fg.l
        public final i2<T, V> A() {
            return this.typeConverter;
        }

        public final boolean D() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void F(long playTimeNanos, float durationScale) {
            long durationNanos;
            if (durationScale > 0.0f) {
                float c5 = (playTimeNanos - this.offsetTimeNanos.c()) / durationScale;
                if (Float.isNaN(c5)) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + durationScale + ",playTimeNanos: " + playTimeNanos + ", offsetTimeNanos: " + this.offsetTimeNanos.c()).toString());
                }
                durationNanos = (long) c5;
            } else {
                durationNanos = a().getDurationNanos();
            }
            V(a().f(durationNanos));
            this.velocityVector = a().b(durationNanos);
            if (a().c(durationNanos)) {
                R(true);
                T(0L);
            }
        }

        public final void G() {
            S(true);
        }

        public final void H(long playTimeNanos) {
            V(a().f(playTimeNanos));
            this.velocityVector = a().b(playTimeNanos);
        }

        public final void R(boolean z4) {
            this.isFinished.setValue(Boolean.valueOf(z4));
        }

        public void V(T t4) {
            this.value.setValue(t4);
        }

        public final void Y(T initialValue, T targetValue, @fg.l p0<T> animationSpec) {
            U(targetValue);
            Q(animationSpec);
            if (kotlin.jvm.internal.l0.g(a().j(), initialValue) && kotlin.jvm.internal.l0.g(a().g(), targetValue)) {
                return;
            }
            X(this, initialValue, false, 2, null);
        }

        public final void Z(T targetValue, @fg.l p0<T> animationSpec) {
            if (!kotlin.jvm.internal.l0.g(this.targetValue.getValue(), targetValue) || q()) {
                U(targetValue);
                Q(animationSpec);
                X(this, null, !D(), 1, null);
                R(false);
                T(e2.this.k());
                S(false);
            }
        }

        @fg.l
        public final d2<T, V> a() {
            return (d2) this.animation.getValue();
        }

        @Override // androidx.compose.runtime.b5
        public T getValue() {
            return this.value.getValue();
        }

        @fg.l
        public final p0<T> i() {
            return (p0) this.animationSpec.getValue();
        }

        public final long l() {
            return a().getDurationNanos();
        }

        @fg.l
        /* renamed from: m, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @fg.l
        public String toString() {
            return "current value: " + this.value.getValue() + ", target: " + this.targetValue.getValue() + ", spec: " + i();
        }
    }

    /* compiled from: Transition.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {649}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f2679b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f2680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e2<S> f2681d;

        /* compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e2<S> f2682b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f2683c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e2<S> e2Var, float f4) {
                super(1);
                this.f2682b = e2Var;
                this.f2683c = f4;
            }

            public final void a(long j4) {
                if (this.f2682b.t()) {
                    return;
                }
                this.f2682b.w(j4, this.f2683c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e2<S> e2Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f2681d = e2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f2681d, dVar);
            eVar.f2680c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.r0 r0Var;
            a aVar;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f2679b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                r0Var = (kotlinx.coroutines.r0) this.f2680c;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (kotlinx.coroutines.r0) this.f2680c;
                kotlin.a1.n(obj);
            }
            do {
                aVar = new a(this.f2681d, c2.q(r0Var.getCoroutineContext()));
                this.f2680c = r0Var;
                this.f2679b = 1;
            } while (androidx.compose.runtime.b2.f(aVar, this) != aVar2);
            return aVar2;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f2685c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e2<S> e2Var, S s4, int i4) {
            super(2);
            this.f2684b = e2Var;
            this.f2685c = s4;
            this.f2686d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            this.f2684b.f(this.f2685c, tVar, g3.b(this.f2686d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1382:1\n33#2,6:1383\n33#2,6:1389\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n469#1:1383,6\n472#1:1389,6\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e2<S> e2Var) {
            super(0);
            this.f2687b = e2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            androidx.compose.runtime.snapshots.b0 b0Var = ((e2) this.f2687b)._animations;
            int size = b0Var.size();
            long j4 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                j4 = Math.max(j4, ((d) b0Var.get(i4)).l());
            }
            androidx.compose.runtime.snapshots.b0 b0Var2 = ((e2) this.f2687b)._transitions;
            int size2 = b0Var2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                j4 = Math.max(j4, ((e2) b0Var2.get(i5)).p());
            }
            return Long.valueOf(j4);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f2689c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e2<S> e2Var, S s4, int i4) {
            super(2);
            this.f2688b = e2Var;
            this.f2689c = s4;
            this.f2690d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            this.f2688b.K(this.f2689c, tVar, g3.b(this.f2690d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @kotlin.w0
    public e2(@fg.l g2<S> g2Var, @fg.m String str) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        androidx.compose.runtime.k2 g7;
        this.transitionState = g2Var;
        this.label = str;
        g4 = t4.g(g2Var.a(), null, 2, null);
        this.targetState = g4;
        g5 = t4.g(new c(g2Var.a(), g2Var.a()), null, 2, null);
        this.segment = g5;
        this.playTimeNanos = androidx.compose.runtime.b.d(0L);
        this.startTimeNanos = androidx.compose.runtime.b.d(Long.MIN_VALUE);
        g6 = t4.g(Boolean.TRUE, null, 2, null);
        this.updateChildrenNeeded = g6;
        this._animations = new androidx.compose.runtime.snapshots.b0<>();
        this._transitions = new androidx.compose.runtime.snapshots.b0<>();
        g7 = t4.g(Boolean.FALSE, null, 2, null);
        this.isSeeking = g7;
        this.totalDurationNanos = o4.e(new g(this));
        g2Var.e(this);
    }

    private final void G(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void H(long j4) {
        this.startTimeNanos.N(j4);
    }

    @a1
    public static /* synthetic */ void l() {
    }

    private final long n() {
        return this.startTimeNanos.c();
    }

    @a1
    public static /* synthetic */ void u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        J(true);
        if (t()) {
            androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> b0Var = this._animations;
            int size = b0Var.size();
            long j4 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                e2<S>.d<?, ?> dVar = b0Var.get(i4);
                j4 = Math.max(j4, dVar.l());
                dVar.H(this.lastSeekedTimeNanos);
            }
            J(false);
        }
    }

    public final void A(@fg.l e2<S>.d<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final boolean B(@fg.l e2<?> transition) {
        return this._transitions.remove(transition);
    }

    @kd.i(name = "seek")
    public final void C(S initialState, S targetState, long playTimeNanos) {
        H(Long.MIN_VALUE);
        this.transitionState.d(false);
        if (!t() || !kotlin.jvm.internal.l0.g(this.transitionState.a(), initialState) || !kotlin.jvm.internal.l0.g(this.targetState.getValue(), targetState)) {
            if (!kotlin.jvm.internal.l0.g(this.transitionState.a(), initialState)) {
                g2<S> g2Var = this.transitionState;
                if (g2Var instanceof h1) {
                    ((h1) g2Var).g(initialState);
                }
            }
            I(targetState);
            F(true);
            G(new c(initialState, targetState));
        }
        androidx.compose.runtime.snapshots.b0<e2<?>> b0Var = this._transitions;
        int size = b0Var.size();
        for (int i4 = 0; i4 < size; i4++) {
            e2<?> e2Var = b0Var.get(i4);
            kotlin.jvm.internal.l0.n(e2Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (e2Var.t()) {
                e2Var.C(e2Var.transitionState.a(), e2Var.targetState.getValue(), playTimeNanos);
            }
        }
        androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> b0Var2 = this._animations;
        int size2 = b0Var2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            b0Var2.get(i5).H(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void D(long j4) {
        this.lastSeekedTimeNanos = j4;
    }

    public final void E(long j4) {
        this.playTimeNanos.N(j4);
    }

    public final void F(boolean z4) {
        this.isSeeking.setValue(Boolean.valueOf(z4));
    }

    public final void I(S s4) {
        this.targetState.setValue(s4);
    }

    public final void J(boolean z4) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z4));
    }

    @androidx.compose.runtime.i
    public final void K(S s4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-583974681);
        int i5 = (i4 & 14) == 0 ? (o4.q0(s4) ? 4 : 2) | i4 : i4;
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(this) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-583974681, i5, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!t() && !kotlin.jvm.internal.l0.g(this.targetState.getValue(), s4)) {
                G(new c(this.targetState.getValue(), s4));
                if (!kotlin.jvm.internal.l0.g(this.transitionState.a(), this.targetState.getValue())) {
                    g2<S> g2Var = this.transitionState;
                    if (!(g2Var instanceof h1)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState");
                    }
                    ((h1) g2Var).g(this.targetState.getValue());
                }
                I(s4);
                if (!s()) {
                    J(true);
                }
                androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> b0Var = this._animations;
                int size = b0Var.size();
                for (int i6 = 0; i6 < size; i6++) {
                    b0Var.get(i6).G();
                }
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new h(this, s4, i4));
        }
    }

    public final boolean d(@fg.l e2<S>.d<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final boolean e(@fg.l e2<?> transition) {
        return this._transitions.add(transition);
    }

    @androidx.compose.runtime.i
    public final void f(S s4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1493585151);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(s4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(this) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1493585151, i5, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!t()) {
                K(s4, o4, i5 & 126);
                if (!kotlin.jvm.internal.l0.g(s4, this.transitionState.a()) || s() || r()) {
                    o4.P(-561029496);
                    boolean q02 = o4.q0(this);
                    Object Q = o4.Q();
                    if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                        Q = new e(this, null);
                        o4.E(Q);
                    }
                    o4.p0();
                    androidx.compose.runtime.a1.h(this, (ld.p) Q, o4, ((i5 >> 3) & 14) | 64);
                }
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(this, s4, i4));
        }
    }

    @fg.l
    public final List<e2<S>.d<?, ?>> g() {
        return this._animations;
    }

    public final S h() {
        return this.transitionState.a();
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: j, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long k() {
        return this.playTimeNanos.c();
    }

    @fg.l
    public final b<S> m() {
        return (b) this.segment.getValue();
    }

    public final S o() {
        return (S) this.targetState.getValue();
    }

    public final long p() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    @fg.l
    public final List<e2<?>> q() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final boolean s() {
        return this.startTimeNanos.c() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    @fg.l
    public String toString() {
        androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> b0Var = this._animations;
        int size = b0Var.size();
        String str = "Transition animation values: ";
        for (int i4 = 0; i4 < size; i4++) {
            str = str + b0Var.get(i4) + ", ";
        }
        return str;
    }

    public final void w(long frameTimeNanos, float durationScale) {
        if (this.startTimeNanos.c() == Long.MIN_VALUE) {
            y(frameTimeNanos);
        }
        J(false);
        E(frameTimeNanos - this.startTimeNanos.c());
        androidx.compose.runtime.snapshots.b0<e2<S>.d<?, ?>> b0Var = this._animations;
        int size = b0Var.size();
        boolean z4 = true;
        for (int i4 = 0; i4 < size; i4++) {
            e2<S>.d<?, ?> dVar = b0Var.get(i4);
            if (!dVar.D()) {
                dVar.F(this.playTimeNanos.c(), durationScale);
            }
            if (!dVar.D()) {
                z4 = false;
            }
        }
        androidx.compose.runtime.snapshots.b0<e2<?>> b0Var2 = this._transitions;
        int size2 = b0Var2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            e2<?> e2Var = b0Var2.get(i5);
            if (!kotlin.jvm.internal.l0.g(e2Var.targetState.getValue(), e2Var.transitionState.a())) {
                e2Var.w(this.playTimeNanos.c(), durationScale);
            }
            if (!kotlin.jvm.internal.l0.g(e2Var.targetState.getValue(), e2Var.transitionState.a())) {
                z4 = false;
            }
        }
        if (z4) {
            x();
        }
    }

    public final void x() {
        H(Long.MIN_VALUE);
        g2<S> g2Var = this.transitionState;
        if (g2Var instanceof h1) {
            ((h1) g2Var).g(this.targetState.getValue());
        }
        E(0L);
        this.transitionState.d(false);
    }

    public final void y(long frameTimeNanos) {
        H(frameTimeNanos);
        this.transitionState.d(true);
    }

    public final void z(@fg.l e2<S>.a<?, ?> deferredAnimation) {
        e2<S>.d<?, ?> a5;
        e2<S>.C0041a<?, V>.a<?, ?> b5 = deferredAnimation.b();
        if (b5 == null || (a5 = b5.a()) == null) {
            return;
        }
        A(a5);
    }

    public /* synthetic */ e2(g2 g2Var, String str, int i4, kotlin.jvm.internal.w wVar) {
        this(g2Var, (i4 & 2) != 0 ? null : str);
    }

    public e2(S s4, @fg.m String str) {
        this(new h1(s4), str);
    }

    public /* synthetic */ e2(h1 h1Var, String str, int i4, kotlin.jvm.internal.w wVar) {
        this(h1Var, (i4 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.w0
    public e2(@fg.l h1<S> h1Var, @fg.m String str) {
        this((g2) h1Var, str);
        kotlin.jvm.internal.l0.n(h1Var, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
