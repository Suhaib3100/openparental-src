package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.m1;
import java.util.List;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: PointerEvent.kt */
@m1
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014B]\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015BS\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010(Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010,Jz\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0090\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b7\u00106R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\bA\u00106R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u00106R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\bD\u0010<R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\bI\u00106R$\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010 R(\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u00104\u001a\u0004\bN\u00106\"\u0004\b>\u0010OR*\u0010\u0017\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u00168\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010 \u001a\u0004\bS\u0010TR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010 \u001a\u0004\bV\u0010WR\u0017\u0010[\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bZ\u0010 \u001a\u0004\bY\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "", "Landroidx/compose/ui/input/pointer/a0;", "id", "", "uptimeMillis", "Li0/f;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/q0;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/w;)V", "(JJJZJJZZIJLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/input/pointer/e;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;ILkotlin/jvm/internal/w;)V", "", "Landroidx/compose/ui/input/pointer/f;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "f", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;I)Landroidx/compose/ui/input/pointer/b0;", "h", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/b0;", "b", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;IJ)Landroidx/compose/ui/input/pointer/b0;", "l", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/b0;", "j", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/b0;", "d", "(JJJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/b0;", "", "toString", "()Ljava/lang/String;", "J", "r", "()J", "B", "c", "t", "Z", "u", "()Z", "e", "F", "v", "()F", "y", "g", "w", "x", "i", "I", "A", "()I", "z", "k", "Ljava/util/List;", "C", "_historical", "s", "(J)V", "<set-?>", "m", "Landroidx/compose/ui/input/pointer/e;", "n", "()Landroidx/compose/ui/input/pointer/e;", "o", "p", "()Ljava/util/List;", "q", "D", "E", "isConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int f18706n = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uptimeMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean pressed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float pressure;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long previousUptimeMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long previousPosition;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean previousPressed;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<f> _historical;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e consumed;

    public /* synthetic */ b0(long j4, long j5, long j6, boolean z4, float f4, long j7, long j10, boolean z5, boolean z6, int i4, long j11, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, z4, f4, j7, j10, z5, z6, i4, j11);
    }

    private static /* synthetic */ void C() {
    }

    public static /* synthetic */ void E() {
    }

    public static /* synthetic */ b0 e(b0 b0Var, long j4, long j5, long j6, long j7, boolean z4, float f4, long j10, long j11, boolean z5, int i4, List list, long j12, int i5, Object obj) {
        return b0Var.d((i5 & 1) != 0 ? b0Var.id : j4, (i5 & 2) != 0 ? b0Var.uptimeMillis : j5, (i5 & 4) != 0 ? b0Var.position : j6, (i5 & 8) != 0 ? b0Var.originalEventPosition : j7, (i5 & 16) != 0 ? b0Var.pressed : z4, (i5 & 32) != 0 ? b0Var.pressure : f4, (i5 & 64) != 0 ? b0Var.previousUptimeMillis : j10, (i5 & 128) != 0 ? b0Var.previousPosition : j11, (i5 & 256) != 0 ? b0Var.previousPressed : z5, (i5 & 512) != 0 ? b0Var.type : i4, (i5 & 1024) != 0 ? b0Var.p() : list, (i5 & 2048) != 0 ? b0Var.scrollDelta : j12);
    }

    @kotlin.k(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void o() {
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void q() {
    }

    /* renamed from: A, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: B, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean D() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final void F(long j4) {
        this.originalEventPosition = j4;
    }

    public final void a() {
        this.consumed.e(true);
        this.consumed.f(true);
    }

    @fg.l
    @kotlin.k(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @x0(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    public final b0 b(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @fg.l e consumed, int type, long scrollDelta) {
        b0 b0Var = new b0(id2, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, p(), scrollDelta, this.originalEventPosition);
        this.consumed = consumed;
        return b0Var;
    }

    @fg.l
    @androidx.compose.ui.k
    public final b0 d(long id2, long currentTime, long currentPosition, long originalEventPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @fg.l List<f> historical, long scrollDelta) {
        b0 b0Var = new b0(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, originalEventPosition);
        b0Var.consumed = this.consumed;
        return b0Var;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @x0(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final /* synthetic */ b0 f(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, e consumed, int type) {
        b0 b0Var = new b0(id2, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, p(), this.scrollDelta, this.originalEventPosition);
        this.consumed = consumed;
        return b0Var;
    }

    @fg.l
    public final b0 h(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        return e(this, id2, currentTime, currentPosition, 0L, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, p(), scrollDelta, 8, null);
    }

    @fg.l
    @androidx.compose.ui.k
    public final b0 j(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @fg.l List<f> historical, long scrollDelta) {
        return e(this, id2, currentTime, currentPosition, 0L, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta, 8, null);
    }

    @fg.l
    public final b0 l(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        b0 b0Var = new b0(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, p(), scrollDelta, this.originalEventPosition);
        b0Var.consumed = this.consumed;
        return b0Var;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final e getConsumed() {
        return this.consumed;
    }

    @fg.l
    @androidx.compose.ui.k
    public final List<f> p() {
        List<f> list = this._historical;
        return list == null ? kotlin.collections.j0.f74919b : list;
    }

    /* renamed from: r, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: s, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: t, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @fg.l
    public String toString() {
        return "PointerInputChange(id=" + ((Object) a0.g(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) i0.f.y(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) i0.f.y(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + D() + ", type=" + ((Object) q0.k(this.type)) + ", historical=" + p() + ",scrollDelta=" + ((Object) i0.f.y(this.scrollDelta)) + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: v, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: w, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* renamed from: y, reason: from getter */
    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: z, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    private b0(long j4, long j5, long j6, boolean z4, float f4, long j7, long j10, boolean z5, boolean z6, int i4, List<f> list, long j11, long j12) {
        this(j4, j5, j6, z4, f4, j7, j10, z5, z6, i4, j11);
        this._historical = list;
        this.originalEventPosition = j12;
    }

    public /* synthetic */ b0(long j4, long j5, long j6, boolean z4, float f4, long j7, long j10, boolean z5, boolean z6, int i4, List list, long j11, long j12, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, z4, f4, j7, j10, z5, z6, i4, (List<f>) list, j11, j12);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @x0(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ b0(long j4, long j5, long j6, boolean z4, long j7, long j10, boolean z5, e eVar, int i4, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, z4, j7, j10, z5, eVar, i4);
    }

    private b0(long j4, long j5, long j6, boolean z4, long j7, long j10, boolean z5, boolean z6, int i4, long j11) {
        this(j4, j5, j6, z4, 1.0f, j7, j10, z5, z6, i4, j11);
    }

    public /* synthetic */ b0(long j4, long j5, long j6, boolean z4, long j7, long j10, boolean z5, boolean z6, int i4, long j11, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, z4, j7, j10, z5, z6, i4, j11);
    }

    private b0(long j4, long j5, long j6, boolean z4, float f4, long j7, long j10, boolean z5, boolean z6, int i4, long j11) {
        this.id = j4;
        this.uptimeMillis = j5;
        this.position = j6;
        this.pressed = z4;
        this.pressure = f4;
        this.previousUptimeMillis = j7;
        this.previousPosition = j10;
        this.previousPressed = z5;
        this.type = i4;
        this.scrollDelta = j11;
        i0.f.INSTANCE.getClass();
        this.originalEventPosition = i0.f.f74147c;
        this.consumed = new e(z6, z6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(long r21, long r23, long r25, boolean r27, float r28, long r29, long r31, boolean r33, boolean r34, int r35, long r36, int r38, kotlin.jvm.internal.w r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L12
            androidx.compose.ui.input.pointer.q0$a r1 = androidx.compose.ui.input.pointer.q0.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.input.pointer.q0.d()
            r17 = r1
            goto L14
        L12:
            r17 = r35
        L14:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L24
            i0.f$a r0 = i0.f.INSTANCE
            r0.getClass()
            long r0 = i0.f.c()
            r18 = r0
            goto L26
        L24:
            r18 = r36
        L26:
            r2 = r20
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r10 = r28
            r11 = r29
            r13 = r31
            r15 = r33
            r16 = r34
            r2.<init>(r3, r5, r7, r9, r10, r11, r13, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.b0.<init>(long, long, long, boolean, float, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(long r20, long r22, long r24, boolean r26, long r27, long r29, boolean r31, boolean r32, int r33, long r34, int r36, kotlin.jvm.internal.w r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L12
            androidx.compose.ui.input.pointer.q0$a r1 = androidx.compose.ui.input.pointer.q0.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.input.pointer.q0.d()
            r16 = r1
            goto L14
        L12:
            r16 = r33
        L14:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L24
            i0.f$a r0 = i0.f.INSTANCE
            r0.getClass()
            long r0 = i0.f.c()
            r17 = r0
            goto L26
        L24:
            r17 = r34
        L26:
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r24
            r9 = r26
            r10 = r27
            r12 = r29
            r14 = r31
            r15 = r32
            r2.<init>(r3, r5, r7, r9, r10, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.b0.<init>(long, long, long, boolean, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(long r17, long r19, long r21, boolean r23, long r24, long r26, boolean r28, androidx.compose.ui.input.pointer.e r29, int r30, int r31, kotlin.jvm.internal.w r32) {
        /*
            r16 = this;
            r0 = r31
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L11
            androidx.compose.ui.input.pointer.q0$a r0 = androidx.compose.ui.input.pointer.q0.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.input.pointer.q0.d()
            r15 = r0
            goto L13
        L11:
            r15 = r30
        L13:
            r1 = r16
            r2 = r17
            r4 = r19
            r6 = r21
            r8 = r23
            r9 = r24
            r11 = r26
            r13 = r28
            r14 = r29
            r1.<init>(r2, r4, r6, r8, r9, r11, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.b0.<init>(long, long, long, boolean, long, long, boolean, androidx.compose.ui.input.pointer.e, int, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b0(long r20, long r22, long r24, boolean r26, long r27, long r29, boolean r31, androidx.compose.ui.input.pointer.e r32, int r33) {
        /*
            r19 = this;
            boolean r0 = r32.getDownChange()
            if (r0 != 0) goto L10
            boolean r0 = r32.getPositionChange()
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            r0 = 0
        Le:
            r15 = r0
            goto L12
        L10:
            r0 = 1
            goto Le
        L12:
            i0.f$a r0 = i0.f.INSTANCE
            r0.getClass()
            long r17 = i0.f.c()
            r9 = 1065353216(0x3f800000, float:1.0)
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r24
            r8 = r26
            r10 = r27
            r12 = r29
            r14 = r31
            r16 = r33
            r1.<init>(r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.b0.<init>(long, long, long, boolean, long, long, boolean, androidx.compose.ui.input.pointer.e, int):void");
    }
}
