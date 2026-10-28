package i0;

import androidx.compose.animation.l0;
import androidx.compose.runtime.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: RoundRect.kt */
@m1
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u00010BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010$Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b5\u0010\u001fR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\b7\u0010$R\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b8\u0010$R\u001d\u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b9\u0010$R\u001d\u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b:\u0010$R\u0018\u0010<\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010;R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u001fR\u0011\u0010@\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b?\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Li0/l;", "", "", "left", "top", "right", "bottom", "Li0/a;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/w;)V", "y", "()Li0/l;", "min", "radius1", "radius2", "limit", "x", "(FFFF)F", "Li0/f;", "point", "", "j", "(J)Z", "", "toString", "()Ljava/lang/String;", "b", "()F", "c", "d", "e", "f", "()J", "g", "h", "i", "k", "(FFFFJJJJ)Li0/l;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "q", "s", "r", "m", "J", "t", "u", "o", "n", "Li0/l;", "_scaledRadiiRect", "v", "width", "p", "height", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class l {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    public static final int f74159k = 0;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final l f74160l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long topLeftCornerRadius;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long topRightCornerRadius;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long bottomRightCornerRadius;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long bottomLeftCornerRadius;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private l _scaledRadiiRect;

    /* compiled from: RoundRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li0/l$a;", "", "<init>", "()V", "Li0/l;", "Zero", "Li0/l;", "a", "()Li0/l;", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.l$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @kd.n
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final l a() {
            return l.f74160l;
        }

        public Companion(w wVar) {
        }
    }

    static {
        a.INSTANCE.getClass();
        f74160l = m.e(0.0f, 0.0f, 0.0f, 0.0f, a.f74139c);
    }

    public /* synthetic */ l(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7, w wVar) {
        this(f4, f5, f6, f7, j4, j5, j6, j7);
    }

    public static l l(l lVar, float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7, int i4, Object obj) {
        float f10 = (i4 & 1) != 0 ? lVar.left : f4;
        float f11 = (i4 & 2) != 0 ? lVar.top : f5;
        float f12 = (i4 & 4) != 0 ? lVar.right : f6;
        float f13 = (i4 & 8) != 0 ? lVar.bottom : f7;
        long j10 = (i4 & 16) != 0 ? lVar.topLeftCornerRadius : j4;
        long j11 = (i4 & 32) != 0 ? lVar.topRightCornerRadius : j5;
        long j12 = (i4 & 64) != 0 ? lVar.bottomRightCornerRadius : j6;
        long j13 = (i4 & 128) != 0 ? lVar.bottomLeftCornerRadius : j7;
        lVar.getClass();
        return new l(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    @fg.l
    public static final l w() {
        INSTANCE.getClass();
        return f74160l;
    }

    private final float x(float min, float radius1, float radius2, float limit) {
        float f4 = radius1 + radius2;
        return (f4 <= limit || f4 == 0.0f) ? min : Math.min(min, limit / f4);
    }

    private final l y() {
        l lVar = this._scaledRadiiRect;
        if (lVar != null) {
            return lVar;
        }
        float x4 = x(x(x(x(1.0f, a.o(this.bottomLeftCornerRadius), a.o(this.topLeftCornerRadius), p()), a.m(this.topLeftCornerRadius), a.m(this.topRightCornerRadius), v()), a.o(this.topRightCornerRadius), a.o(this.bottomRightCornerRadius), p()), a.m(this.bottomRightCornerRadius), a.m(this.bottomLeftCornerRadius), v());
        l lVar2 = new l(this.left * x4, this.top * x4, this.right * x4, this.bottom * x4, b.a(a.m(this.topLeftCornerRadius) * x4, a.o(this.topLeftCornerRadius) * x4), b.a(a.m(this.topRightCornerRadius) * x4, a.o(this.topRightCornerRadius) * x4), b.a(a.m(this.bottomRightCornerRadius) * x4, a.o(this.bottomRightCornerRadius) * x4), b.a(a.m(this.bottomLeftCornerRadius) * x4, a.o(this.bottomLeftCornerRadius) * x4));
        this._scaledRadiiRect = lVar2;
        return lVar2;
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: c, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: d, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: e, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return Float.compare(this.left, lVar.left) == 0 && Float.compare(this.top, lVar.top) == 0 && Float.compare(this.right, lVar.right) == 0 && Float.compare(this.bottom, lVar.bottom) == 0 && a.j(this.topLeftCornerRadius, lVar.topLeftCornerRadius) && a.j(this.topRightCornerRadius, lVar.topRightCornerRadius) && a.j(this.bottomRightCornerRadius, lVar.bottomRightCornerRadius) && a.j(this.bottomLeftCornerRadius, lVar.bottomLeftCornerRadius);
    }

    /* renamed from: f, reason: from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: g, reason: from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: h, reason: from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    public int hashCode() {
        return Long.hashCode(this.bottomLeftCornerRadius) + k.a(this.bottomRightCornerRadius, k.a(this.topRightCornerRadius, (a.p(this.topLeftCornerRadius) + l0.a(this.bottom, l0.a(this.right, l0.a(this.top, Float.hashCode(this.left) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(long r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.j(long):boolean");
    }

    @fg.l
    public final l k(float left, float top2, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new l(left, top2, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius);
    }

    public final float m() {
        return this.bottom;
    }

    public final long n() {
        return this.bottomLeftCornerRadius;
    }

    public final long o() {
        return this.bottomRightCornerRadius;
    }

    public final float p() {
        return this.bottom - this.top;
    }

    public final float q() {
        return this.left;
    }

    public final float r() {
        return this.right;
    }

    public final float s() {
        return this.top;
    }

    public final long t() {
        return this.topLeftCornerRadius;
    }

    @fg.l
    public String toString() {
        long j4 = this.topLeftCornerRadius;
        long j5 = this.topRightCornerRadius;
        long j6 = this.bottomRightCornerRadius;
        long j7 = this.bottomLeftCornerRadius;
        String str = c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1);
        if (!a.j(j4, j5) || !a.j(j5, j6) || !a.j(j6, j7)) {
            StringBuilder a5 = androidx.appcompat.view.g.a("RoundRect(rect=", str, ", topLeft=");
            a5.append((Object) a.t(j4));
            a5.append(", topRight=");
            a5.append((Object) a.t(j5));
            a5.append(", bottomRight=");
            a5.append((Object) a.t(j6));
            a5.append(", bottomLeft=");
            a5.append((Object) a.t(j7));
            a5.append(')');
            return a5.toString();
        }
        if (a.m(j4) == a.o(j4)) {
            StringBuilder a6 = androidx.appcompat.view.g.a("RoundRect(rect=", str, ", radius=");
            a6.append(c.a(a.m(j4), 1));
            a6.append(')');
            return a6.toString();
        }
        StringBuilder a7 = androidx.appcompat.view.g.a("RoundRect(rect=", str, ", x=");
        a7.append(c.a(a.m(j4), 1));
        a7.append(", y=");
        a7.append(c.a(a.o(j4), 1));
        a7.append(')');
        return a7.toString();
    }

    public final long u() {
        return this.topRightCornerRadius;
    }

    public final float v() {
        return this.right - this.left;
    }

    private l(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7) {
        this.left = f4;
        this.top = f5;
        this.right = f6;
        this.bottom = f7;
        this.topLeftCornerRadius = j4;
        this.topRightCornerRadius = j5;
        this.bottomRightCornerRadius = j6;
        this.bottomLeftCornerRadius = j7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(float r17, float r18, float r19, float r20, long r21, long r23, long r25, long r27, int r29, kotlin.jvm.internal.w r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 16
            if (r1 == 0) goto L11
            i0.a$a r1 = i0.a.INSTANCE
            r1.getClass()
            long r1 = i0.a.a()
            r8 = r1
            goto L13
        L11:
            r8 = r21
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L22
            i0.a$a r1 = i0.a.INSTANCE
            r1.getClass()
            long r1 = i0.a.a()
            r10 = r1
            goto L24
        L22:
            r10 = r23
        L24:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            i0.a$a r1 = i0.a.INSTANCE
            r1.getClass()
            long r1 = i0.a.a()
            r12 = r1
            goto L35
        L33:
            r12 = r25
        L35:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L44
            i0.a$a r0 = i0.a.INSTANCE
            r0.getClass()
            long r0 = i0.a.a()
            r14 = r0
            goto L46
        L44:
            r14 = r27
        L46:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.<init>(float, float, float, float, long, long, long, long, int, kotlin.jvm.internal.w):void");
    }
}
