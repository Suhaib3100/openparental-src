package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Shadow.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/c6;", "", "Landroidx/compose/ui/graphics/d2;", "color", "Li0/f;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "(JJF)Landroidx/compose/ui/graphics/c6;", "a", "J", "f", "()J", "g", "()V", "h", "i", "c", "F", "d", "()F", "e", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final c6 f17640e = new c6(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float blurRadius;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/c6$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/c6;", "None", "Landroidx/compose/ui/graphics/c6;", "a", "()Landroidx/compose/ui/graphics/c6;", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.c6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @androidx.compose.runtime.x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final c6 a() {
            return c6.f17640e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ c6(long j4, long j5, float f4, kotlin.jvm.internal.w wVar) {
        this(j4, j5, f4);
    }

    public static c6 c(c6 c6Var, long j4, long j5, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = c6Var.color;
        }
        long j6 = j4;
        if ((i4 & 2) != 0) {
            j5 = c6Var.offset;
        }
        long j7 = j5;
        if ((i4 & 4) != 0) {
            f4 = c6Var.blurRadius;
        }
        c6Var.getClass();
        return new c6(j6, j7, f4);
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void e() {
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void g() {
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void i() {
    }

    @fg.l
    public final c6 b(long color, long offset, float blurRadius) {
        return new c6(color, offset, blurRadius);
    }

    /* renamed from: d, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) other;
        return d2.y(this.color, c6Var.color) && i0.f.l(this.offset, c6Var.offset) && this.blurRadius == c6Var.blurRadius;
    }

    /* renamed from: f, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: h, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Float.hashCode(this.blurRadius) + ((i0.f.s(this.offset) + (d2.K(this.color) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        androidx.compose.foundation.f2.a(this.color, sb, ", offset=");
        sb.append((Object) i0.f.y(this.offset));
        sb.append(", blurRadius=");
        return androidx.compose.animation.b.a(sb, this.blurRadius, ')');
    }

    private c6(long j4, long j5, float f4) {
        this.color = j4;
        this.offset = j5;
        this.blurRadius = f4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c6(long r7, long r9, float r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto Ld
            r7 = 4278190080(0xff000000, double:2.113706745E-314)
            long r7 = androidx.compose.ui.graphics.f2.d(r7)
        Ld:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L1b
            i0.f$a r7 = i0.f.INSTANCE
            r7.getClass()
            long r9 = i0.f.c()
        L1b:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L21
            r11 = 0
        L21:
            r5 = r11
            r0 = r6
            r0.<init>(r1, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.c6.<init>(long, long, float, int, kotlin.jvm.internal.w):void");
    }
}
