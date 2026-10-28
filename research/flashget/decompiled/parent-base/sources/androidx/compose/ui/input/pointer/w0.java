package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.s5;
import androidx.compose.ui.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001VB0\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u001a\u0010\u0011\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\u0010R\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J*\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0019J?\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b$\u0010%Rl\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t2'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\fR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0010R\u00020\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0010R\u00020\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u0010:\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00101R\u001c\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\u00020S8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/ui/input/pointer/w0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/input/pointer/v0;", "Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/ui/unit/d;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "pointerInputHandler", "<init>", "(Lld/p;)V", "Landroidx/compose/ui/input/pointer/r;", "pass", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/w0$a;", "block", "C7", "(Landroidx/compose/ui/input/pointer/r;Lld/l;)V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "B7", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;)V", "j7", "()V", "g5", "i6", "g3", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "R", "Landroidx/compose/ui/input/pointer/c;", "o3", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "p", "Lld/p;", "h6", "()Lld/p;", "B5", "Lkotlinx/coroutines/k2;", "q", "Lkotlinx/coroutines/k2;", "pointerInputJob", "r", "Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Landroidx/compose/runtime/collection/g;", "s", "Landroidx/compose/runtime/collection/g;", "pointerHandlers", "t", "dispatchingPointerHandlers", "u", "lastPointerEvent", "v", "J", "boundsSize", "", "w", "Z", "x5", "()Z", "U2", "(Z)V", "interceptOutOfBoundsChildEvents", "", "b", "()F", "density", "U", "fontScale", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "c", "()J", "size", "Li0/n;", "B", "extendedTouchPadding", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n519#1:806\n520#1:808\n522#1,4:810\n528#1:825\n531#1,3:837\n1208#2:776\n1187#2,2:777\n1208#2:779\n1187#2,2:780\n35#3:782\n35#3:807\n35#3:879\n146#4:783\n460#4,11:784\n492#4,11:795\n146#4:809\n460#4,11:814\n492#4,11:826\n728#4,2:880\n86#5,2:840\n33#5,6:842\n88#5:848\n86#5,2:849\n33#5,6:851\n88#5:857\n416#5,3:858\n33#5,4:861\n419#5:865\n420#5:867\n38#5:868\n421#5:869\n1#6:866\n314#7,9:870\n323#7,2:882\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n543#1:806\n543#1:808\n543#1:810,4\n543#1:825\n543#1:837,3\n435#1:776\n435#1:777,2\n444#1:779\n444#1:780,2\n519#1:782\n543#1:807\n611#1:879\n520#1:783\n525#1:784,11\n528#1:795,11\n543#1:809\n543#1:814,11\n543#1:826,11\n612#1:880,2\n569#1:840,2\n569#1:842,6\n569#1:848\n579#1:849,2\n579#1:851,6\n579#1:857\n582#1:858,3\n582#1:861,4\n582#1:865\n582#1:867\n582#1:868\n582#1:869\n582#1:866\n609#1:870,9\n609#1:882,2\n*E\n"})
/* loaded from: classes.dex */
public final class w0 extends q.d implements v0, k0, androidx.compose.ui.unit.d {

    /* renamed from: x, reason: collision with root package name */
    public static final int f18851x = 0;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pointerInputHandler;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 pointerInputJob;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private p currentEvent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a<?>> pointerHandlers;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a<?>> dispatchingPointerHandlers;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p lastPointerEvent;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long boundsSize;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean interceptOutOfBoundsChildEvents;

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0001\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0010J\u0014\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0015*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001a\u0010#\u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020)2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b4\u00105JI\u0010=\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001062\u0006\u00108\u001a\u0002072'\u0010<\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010:09¢\u0006\u0002\b;H\u0096@¢\u0006\u0004\b=\u0010>JG\u0010?\u001a\u00028\u0001\"\u0004\b\u0001\u001062\u0006\u00108\u001a\u0002072'\u0010<\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010:09¢\u0006\u0002\b;H\u0096@¢\u0006\u0004\b?\u0010>R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010N\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b@\u0010OR\u0014\u0010R\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010U\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010Y\u001a\u00020V8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010[R\u001a\u0010^\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/input/pointer/w0$a;", "R", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/unit/d;", "Lkotlin/coroutines/d;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/w0;Lkotlin/coroutines/d;)V", "Landroidx/compose/ui/unit/h;", "", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "", "S", "(F)F", "(I)F", "Li0/n;", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "Landroidx/compose/ui/input/pointer/p;", "event", "Landroidx/compose/ui/input/pointer/r;", "pass", "Lkotlin/k2;", "E", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;)V", "", "cause", "y", "(Ljava/lang/Throwable;)V", "Lkotlin/z0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "u3", "(Landroidx/compose/ui/input/pointer/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/u;", "block", "P6", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k5", "b", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/p;", "d", "Lkotlinx/coroutines/p;", "pointerAwaiter", "e", "Landroidx/compose/ui/input/pointer/r;", "awaitPass", "Lkotlin/coroutines/g;", "f", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "()F", "density", "U", "fontScale", "v3", "()Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Landroidx/compose/ui/unit/u;", "c", "()J", "size", "Landroidx/compose/ui/platform/s5;", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "B", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n35#2:776\n735#3,2:777\n314#4,11:779\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n681#1:776\n682#1:777,2\n689#1:779,11\n*E\n"})
    private final class a<R> implements androidx.compose.ui.input.pointer.c, androidx.compose.ui.unit.d, kotlin.coroutines.d<R> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.coroutines.d<R> completion;

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ w0 f18861c;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private kotlinx.coroutines.p<? super p> pointerAwaiter;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private r awaitPass = r.Main;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.coroutines.g context = kotlin.coroutines.i.f75057b;

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {728}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.input.pointer.w0$a$a, reason: collision with other inner class name */
        static final class C0339a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f18866b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f18867c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a<R> f18868d;

            /* renamed from: e, reason: collision with root package name */
            int f18869e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0339a(a<R> aVar, kotlin.coroutines.d<? super C0339a> dVar) {
                super(dVar);
                this.f18868d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f18867c = obj;
                this.f18869e |= Integer.MIN_VALUE;
                return this.f18868d.k5(0L, null, this);
            }
        }

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {720, 721}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f18870b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f18871c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a<R> f18872d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j4, a<R> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f18871c = j4;
                this.f18872d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f18871c, this.f18872d, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
                /*
                    r8 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r8.f18870b
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r5) goto L1a
                    if (r1 != r4) goto L12
                    kotlin.a1.n(r9)
                    goto L36
                L12:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1a:
                    kotlin.a1.n(r9)
                    goto L2d
                L1e:
                    kotlin.a1.n(r9)
                    long r6 = r8.f18871c
                    long r6 = r6 - r2
                    r8.f18870b = r5
                    java.lang.Object r9 = kotlinx.coroutines.c1.b(r6, r8)
                    if (r9 != r0) goto L2d
                    return r0
                L2d:
                    r8.f18870b = r4
                    java.lang.Object r9 = kotlinx.coroutines.c1.b(r2, r8)
                    if (r9 != r0) goto L36
                    return r0
                L36:
                    androidx.compose.ui.input.pointer.w0$a<R> r9 = r8.f18872d
                    kotlinx.coroutines.p r9 = androidx.compose.ui.input.pointer.w0.a.a(r9)
                    if (r9 == 0) goto L4e
                    kotlin.z0$a r0 = kotlin.z0.INSTANCE
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f18871c
                    r0.<init>(r1)
                    java.lang.Object r0 = kotlin.a1.a(r0)
                    r9.resumeWith(r0)
                L4e:
                    kotlin.k2 r9 = kotlin.k2.f75408a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.w0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {699}, m = "withTimeoutOrNull", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f18873b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<R> f18874c;

            /* renamed from: d, reason: collision with root package name */
            int f18875d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, kotlin.coroutines.d<? super c> dVar) {
                super(dVar);
                this.f18874c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f18873b = obj;
                this.f18875d |= Integer.MIN_VALUE;
                return this.f18874c.P6(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l kotlin.coroutines.d<? super R> dVar) {
            this.completion = dVar;
            this.f18861c = w0.this;
        }

        @Override // androidx.compose.ui.input.pointer.c
        public long B() {
            return w0.this.B();
        }

        public final void E(@fg.l p event, @fg.l r pass) {
            kotlinx.coroutines.p<? super p> pVar;
            if (pass != this.awaitPass || (pVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(event);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float J2(long j4) {
            return this.f18861c.J2(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public int J5(long j4) {
            return this.f18861c.J5(j4);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // androidx.compose.ui.input.pointer.c
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object P6(long r5, @fg.l ld.p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r7, @fg.l kotlin.coroutines.d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.w0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.w0$a$c r0 = (androidx.compose.ui.input.pointer.w0.a.c) r0
                int r1 = r0.f18875d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18875d = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.w0$a$c r0 = new androidx.compose.ui.input.pointer.w0$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f18873b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f18875d
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.a1.n(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                goto L3c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.a1.n(r8)
                r0.f18875d = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                java.lang.Object r8 = r4.k5(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                if (r8 != r1) goto L3c
                return r1
            L3b:
                r8 = 0
            L3c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.w0.a.P6(long, ld.p, kotlin.coroutines.d):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float R(int i4) {
            return this.f18861c.R(i4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float S(float f4) {
            return this.f18861c.S(f4);
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U */
        public float getFontScale() {
            return this.f18861c.getFontScale();
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b */
        public float getDensity() {
            return this.f18861c.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.c
        public long c() {
            return w0.this.boundsSize;
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        @fg.l
        public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
            return this.f18861c.c5(kVar);
        }

        @Override // androidx.compose.ui.input.pointer.c
        @fg.l
        public s5 d() {
            return w0.this.d();
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long d0(long j4) {
            return this.f18861c.d0(j4);
        }

        @Override // kotlin.coroutines.d
        @fg.l
        /* renamed from: getContext, reason: from getter */
        public kotlin.coroutines.g getF75269b() {
            return this.context;
        }

        @Override // androidx.compose.ui.unit.n
        @x4
        public long h(float f4) {
            return this.f18861c.h(f4);
        }

        @Override // androidx.compose.ui.unit.n
        @x4
        public float i(long j4) {
            return this.f18861c.i(j4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.k2] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.k2] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.c
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object k5(long r11, @fg.l ld.p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r13, @fg.l kotlin.coroutines.d<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.w0.a.C0339a
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.w0$a$a r0 = (androidx.compose.ui.input.pointer.w0.a.C0339a) r0
                int r1 = r0.f18869e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18869e = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.w0$a$a r0 = new androidx.compose.ui.input.pointer.w0$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f18867c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f18869e
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r11 = r0.f18866b
                kotlinx.coroutines.k2 r11 = (kotlinx.coroutines.k2) r11
                kotlin.a1.n(r14)     // Catch: java.lang.Throwable -> L2b
                goto L6f
            L2b:
                r12 = move-exception
                goto L75
            L2d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L35:
                kotlin.a1.n(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L50
                kotlinx.coroutines.p<? super androidx.compose.ui.input.pointer.p> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L50
                kotlin.z0$a r2 = kotlin.z0.INSTANCE
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.a1.a(r2)
                r14.resumeWith(r2)
            L50:
                androidx.compose.ui.input.pointer.w0 r14 = androidx.compose.ui.input.pointer.w0.this
                kotlinx.coroutines.r0 r4 = r14.V6()
                androidx.compose.ui.input.pointer.w0$a$b r7 = new androidx.compose.ui.input.pointer.w0$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.k2 r11 = kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)
                r0.f18866b = r11     // Catch: java.lang.Throwable -> L2b
                r0.f18869e = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2b
                if (r14 != r1) goto L6f
                return r1
            L6f:
                androidx.compose.ui.input.pointer.d r12 = androidx.compose.ui.input.pointer.d.f18725b
                r11.b(r12)
                return r14
            L75:
                androidx.compose.ui.input.pointer.d r13 = androidx.compose.ui.input.pointer.d.f18725b
                r11.b(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.w0.a.k5(long, ld.p, kotlin.coroutines.d):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long n(long j4) {
            return this.f18861c.n(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public int q2(float f4) {
            return this.f18861c.q2(f4);
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@fg.l Object result) {
            androidx.compose.runtime.collection.g gVar = w0.this.pointerHandlers;
            w0 w0Var = w0.this;
            synchronized (gVar) {
                w0Var.pointerHandlers.j0(this);
                k2 k2Var = k2.f75408a;
            }
            this.completion.resumeWith(result);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long u(int i4) {
            return this.f18861c.u(i4);
        }

        @Override // androidx.compose.ui.input.pointer.c
        @fg.m
        public Object u3(@fg.l r rVar, @fg.l kotlin.coroutines.d<? super p> dVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.awaitPass = rVar;
            this.pointerAwaiter = qVar;
            Object y4 = qVar.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        }

        @Override // androidx.compose.ui.input.pointer.c
        @fg.l
        public p v3() {
            return w0.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float v5(float f4) {
            return this.f18861c.getDensity() * f4;
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long w(float f4) {
            return this.f18861c.w(f4);
        }

        public final void y(@fg.m Throwable cause) {
            kotlinx.coroutines.p<? super p> pVar = this.pointerAwaiter;
            if (pVar != null) {
                pVar.f(cause);
            }
            this.pointerAwaiter = null;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18876a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18876a = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<R> f18877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f18877b = aVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f18877b.y(th);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {562}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f18878b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return w0.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f18878b;
            if (i4 == 0) {
                a1.n(obj);
                ld.p<k0, kotlin.coroutines.d<? super k2>, Object> h6 = w0.this.h6();
                w0 w0Var = w0.this;
                this.f18878b = 1;
                if (h6.invoke(w0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public w0(@fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        p pVar2;
        this.pointerInputHandler = pVar;
        pVar2 = u0.f18835b;
        this.currentEvent = pVar2;
        this.pointerHandlers = new androidx.compose.runtime.collection.g<>(new a[16], 0);
        this.dispatchingPointerHandlers = new androidx.compose.runtime.collection.g<>(new a[16], 0);
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        this.boundsSize = androidx.compose.ui.unit.u.f21529c;
    }

    private final void B7(p pointerEvent, r pass) {
        androidx.compose.runtime.collection.g<a<?>> gVar;
        int size;
        synchronized (this.pointerHandlers) {
            androidx.compose.runtime.collection.g<a<?>> gVar2 = this.dispatchingPointerHandlers;
            gVar2.c(gVar2.getSize(), this.pointerHandlers);
        }
        try {
            int i4 = b.f18876a[pass.ordinal()];
            if (i4 == 1 || i4 == 2) {
                androidx.compose.runtime.collection.g<a<?>> gVar3 = this.dispatchingPointerHandlers;
                int size2 = gVar3.getSize();
                if (size2 > 0) {
                    a<?>[] L = gVar3.L();
                    int i5 = 0;
                    do {
                        L[i5].E(pointerEvent, pass);
                        i5++;
                    } while (i5 < size2);
                }
            } else if (i4 == 3 && (size = (gVar = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i6 = size - 1;
                a<?>[] L2 = gVar.L();
                do {
                    L2[i6].E(pointerEvent, pass);
                    i6--;
                } while (i6 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.m();
        }
    }

    private final void C7(r pass, ld.l<? super a<?>, k2> block) {
        androidx.compose.runtime.collection.g<a<?>> gVar;
        int size;
        synchronized (this.pointerHandlers) {
            androidx.compose.runtime.collection.g<a<?>> gVar2 = this.dispatchingPointerHandlers;
            gVar2.c(gVar2.getSize(), this.pointerHandlers);
        }
        try {
            int i4 = b.f18876a[pass.ordinal()];
            if (i4 == 1 || i4 == 2) {
                androidx.compose.runtime.collection.g<a<?>> gVar3 = this.dispatchingPointerHandlers;
                int size2 = gVar3.getSize();
                if (size2 > 0) {
                    a<?>[] L = gVar3.L();
                    int i5 = 0;
                    do {
                        block.invoke(L[i5]);
                        i5++;
                    } while (i5 < size2);
                }
            } else if (i4 == 3 && (size = (gVar = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i6 = size - 1;
                a<?>[] L2 = gVar.L();
                do {
                    block.invoke(L2[i6]);
                    i6--;
                } while (i6 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.m();
        }
    }

    @Override // androidx.compose.ui.input.pointer.k0
    public long B() {
        long d02 = d0(d().d());
        long j4 = this.boundsSize;
        return i0.o.a(Math.max(0.0f, i0.n.t(d02) - androidx.compose.ui.unit.u.m(j4)) / 2.0f, Math.max(0.0f, i0.n.m(d02) - ((int) (j4 & 4294967295L))) / 2.0f);
    }

    @Override // androidx.compose.ui.input.pointer.v0
    public void B5(@fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        g3();
        this.pointerInputHandler = pVar;
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        p pVar = this.lastPointerEvent;
        if (pVar == null) {
            return;
        }
        List<b0> e4 = pVar.e();
        int size = e4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (e4.get(i4).getPressed()) {
                List<b0> e5 = pVar.e();
                ArrayList arrayList = new ArrayList(e5.size());
                int size2 = e5.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    b0 b0Var = e5.get(i5);
                    arrayList.add(new b0(b0Var.getId(), b0Var.getUptimeMillis(), b0Var.getPosition(), false, b0Var.getPressure(), b0Var.getUptimeMillis(), b0Var.getPosition(), b0Var.getPressed(), b0Var.getPressed(), 0, 0L, 1536, (kotlin.jvm.internal.w) null));
                }
                p pVar2 = new p(arrayList, null);
                this.currentEvent = pVar2;
                B7(pVar2, r.Initial);
                B7(pVar2, r.Main);
                B7(pVar2, r.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return androidx.compose.ui.node.k.p(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.k0
    public void U2(boolean z4) {
        this.interceptOutOfBoundsChildEvents = z4;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return androidx.compose.ui.node.k.p(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.k0
    /* renamed from: c, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.k0
    @fg.l
    public s5 d() {
        return androidx.compose.ui.node.k.p(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l p pointerEvent, @fg.l r pass, long bounds) {
        kotlinx.coroutines.k2 f4;
        this.boundsSize = bounds;
        if (pass == r.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            f4 = kotlinx.coroutines.k.f(V6(), null, kotlinx.coroutines.t0.UNDISPATCHED, new d(null), 1, null);
            this.pointerInputJob = f4;
        }
        B7(pointerEvent, pass);
        List<b0> e4 = pointerEvent.e();
        int size = e4.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z4 = true;
                break;
            } else if (!q.e(e4.get(i4))) {
                break;
            } else {
                i4++;
            }
        }
        if (z4) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.input.pointer.v0
    public void g3() {
        kotlinx.coroutines.k2 k2Var = this.pointerInputJob;
        if (k2Var != null) {
            k2Var.b(new j0());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.node.u1
    public void g5() {
        g3();
    }

    @Override // androidx.compose.ui.input.pointer.v0
    @fg.l
    public ld.p<k0, kotlin.coroutines.d<? super k2>, Object> h6() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.u1
    public void i6() {
        g3();
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        g3();
    }

    @Override // androidx.compose.ui.input.pointer.k0
    @fg.m
    public <R> Object o3(@fg.l ld.p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        a<?> aVar = new a<>(qVar);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.b(aVar);
            kotlin.coroutines.d<k2> c5 = kotlin.coroutines.f.c(pVar, aVar, aVar);
            z0.Companion companion = z0.INSTANCE;
            c5.resumeWith(k2.f75408a);
        }
        qVar.k0(new c(aVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @Override // androidx.compose.ui.input.pointer.k0
    /* renamed from: x5, reason: from getter */
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }
}
