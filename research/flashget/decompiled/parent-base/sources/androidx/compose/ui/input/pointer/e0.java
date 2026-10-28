package androidx.compose.ui.input.pointer;

import androidx.compose.animation.d1;
import androidx.compose.ui.graphics.k6;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InternalPointerInput.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\u00020\rHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0018J\u0016\u0010&\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0018J\u0087\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b3\u0010\u0018R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b4\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b5\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b7\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010\u001fR\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010!R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b<\u0010\u001dR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b \u0010=\u001a\u0004\b>\u0010$R\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b?\u0010\u0018R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b@\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/input/pointer/e0;", "", "Landroidx/compose/ui/input/pointer/a0;", "id", "", "uptime", "Li0/f;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/q0;", "type", "issuesEnterExit", "", "Landroidx/compose/ui/input/pointer/f;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/w;)V", "a", "()J", "d", "e", "f", "g", "()Z", "h", "()F", "i", "()I", "j", "k", "()Ljava/util/List;", "b", "c", "l", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/e0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "p", "x", "t", "s", "Z", "n", "F", "u", "I", "w", "q", "Ljava/util/List;", "o", "v", "r", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class e0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f18733l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uptime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long positionOnScreen;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long position;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean down;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float pressure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean issuesEnterExit;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<f> historical;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long originalEventPosition;

    public /* synthetic */ e0(long j4, long j5, long j6, long j7, boolean z4, float f4, int i4, boolean z5, List list, long j10, long j11, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, z4, f4, i4, z5, list, j10, j11);
    }

    public static e0 m(e0 e0Var, long j4, long j5, long j6, long j7, boolean z4, float f4, int i4, boolean z5, List list, long j10, long j11, int i5, Object obj) {
        long j12 = (i5 & 1) != 0 ? e0Var.id : j4;
        long j13 = (i5 & 2) != 0 ? e0Var.uptime : j5;
        long j14 = (i5 & 4) != 0 ? e0Var.positionOnScreen : j6;
        long j15 = (i5 & 8) != 0 ? e0Var.position : j7;
        boolean z6 = (i5 & 16) != 0 ? e0Var.down : z4;
        float f5 = (i5 & 32) != 0 ? e0Var.pressure : f4;
        int i6 = (i5 & 64) != 0 ? e0Var.type : i4;
        boolean z7 = (i5 & 128) != 0 ? e0Var.issuesEnterExit : z5;
        List list2 = (i5 & 256) != 0 ? e0Var.historical : list;
        long j16 = (i5 & 512) != 0 ? e0Var.scrollDelta : j10;
        long j17 = (i5 & 1024) != 0 ? e0Var.originalEventPosition : j11;
        e0Var.getClass();
        return new e0(j12, j13, j14, j15, z6, f5, i6, z7, list2, j16, j17);
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: c, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: d, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* renamed from: e, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return a0.d(this.id, e0Var.id) && this.uptime == e0Var.uptime && i0.f.l(this.positionOnScreen, e0Var.positionOnScreen) && i0.f.l(this.position, e0Var.position) && this.down == e0Var.down && Float.compare(this.pressure, e0Var.pressure) == 0 && q0.i(this.type, e0Var.type) && this.issuesEnterExit == e0Var.issuesEnterExit && kotlin.jvm.internal.l0.g(this.historical, e0Var.historical) && i0.f.l(this.scrollDelta, e0Var.scrollDelta) && i0.f.l(this.originalEventPosition, e0Var.originalEventPosition);
    }

    /* renamed from: f, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* renamed from: h, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return Long.hashCode(this.originalEventPosition) + i0.k.a(this.scrollDelta, k6.a(this.historical, d1.a(this.issuesEnterExit, (q0.j(this.type) + androidx.compose.animation.l0.a(this.pressure, d1.a(this.down, i0.k.a(this.position, (i0.f.s(this.positionOnScreen) + i0.k.a(this.uptime, Long.hashCode(this.id) * 31, 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    @fg.l
    public final List<f> k() {
        return this.historical;
    }

    @fg.l
    public final e0 l(long id2, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean issuesEnterExit, @fg.l List<f> historical, long scrollDelta, long originalEventPosition) {
        return new e0(id2, uptime, positionOnScreen, position, down, pressure, type, issuesEnterExit, historical, scrollDelta, originalEventPosition);
    }

    public final boolean n() {
        return this.down;
    }

    @fg.l
    public final List<f> o() {
        return this.historical;
    }

    public final long p() {
        return this.id;
    }

    public final boolean q() {
        return this.issuesEnterExit;
    }

    public final long r() {
        return this.originalEventPosition;
    }

    public final long s() {
        return this.position;
    }

    public final long t() {
        return this.positionOnScreen;
    }

    @fg.l
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) a0.g(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) i0.f.y(this.positionOnScreen)) + ", position=" + ((Object) i0.f.y(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) q0.k(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) i0.f.y(this.scrollDelta)) + ", originalEventPosition=" + ((Object) i0.f.y(this.originalEventPosition)) + ')';
    }

    public final float u() {
        return this.pressure;
    }

    public final long v() {
        return this.scrollDelta;
    }

    public final int w() {
        return this.type;
    }

    public final long x() {
        return this.uptime;
    }

    private e0(long j4, long j5, long j6, long j7, boolean z4, float f4, int i4, boolean z5, List<f> list, long j10, long j11) {
        this.id = j4;
        this.uptime = j5;
        this.positionOnScreen = j6;
        this.position = j7;
        this.down = z4;
        this.pressure = f4;
        this.type = i4;
        this.issuesEnterExit = z5;
        this.historical = list;
        this.scrollDelta = j10;
        this.originalEventPosition = j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(long r21, long r23, long r25, long r27, boolean r29, float r30, int r31, boolean r32, java.util.List r33, long r34, long r36, int r38, kotlin.jvm.internal.w r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L9
            r1 = 0
            r14 = r1
            goto Lb
        L9:
            r14 = r32
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r15 = r1
            goto L18
        L16:
            r15 = r33
        L18:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L28
            i0.f$a r1 = i0.f.INSTANCE
            r1.getClass()
            long r1 = i0.f.c()
            r16 = r1
            goto L2a
        L28:
            r16 = r34
        L2a:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3a
            i0.f$a r0 = i0.f.INSTANCE
            r0.getClass()
            long r0 = i0.f.c()
            r18 = r0
            goto L3c
        L3a:
            r18 = r36
        L3c:
            r2 = r20
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r11 = r29
            r12 = r30
            r13 = r31
            r2.<init>(r3, r5, r7, r9, r11, r12, r13, r14, r15, r16, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.e0.<init>(long, long, long, long, boolean, float, int, boolean, java.util.List, long, long, int, kotlin.jvm.internal.w):void");
    }
}
