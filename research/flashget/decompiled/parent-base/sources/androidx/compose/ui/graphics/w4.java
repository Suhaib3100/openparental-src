package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/w4;", "Landroidx/compose/ui/graphics/a6;", "", "Landroidx/compose/ui/graphics/d2;", "colors", "", "stops", "Li0/f;", "start", "end", "Landroidx/compose/ui/graphics/n6;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/w;)V", "Li0/n;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/util/List;", "f", "g", "J", "h", "i", "I", "b", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w4 extends a6 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<d2> colors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<Float> stops;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long start;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long end;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    public /* synthetic */ w4(List list, List list2, long j4, long j5, int i4, kotlin.jvm.internal.w wVar) {
        this(list, list2, j4, j5, i4);
    }

    @Override // androidx.compose.ui.graphics.t1
    /* renamed from: b */
    public long getIntrinsicSize() {
        float f4;
        float r4;
        float r5;
        float p4 = i0.f.p(this.start);
        float f5 = Float.NaN;
        if (!Float.isInfinite(p4) && !Float.isNaN(p4)) {
            float p5 = i0.f.p(this.end);
            if (!Float.isInfinite(p5) && !Float.isNaN(p5)) {
                f4 = Math.abs(i0.f.p(this.start) - i0.f.p(this.end));
                r4 = i0.f.r(this.start);
                if (!Float.isInfinite(r4) && !Float.isNaN(r4)) {
                    r5 = i0.f.r(this.end);
                    if (!Float.isInfinite(r5) && !Float.isNaN(r5)) {
                        f5 = Math.abs(i0.f.r(this.start) - i0.f.r(this.end));
                    }
                }
                return i0.o.a(f4, f5);
            }
        }
        f4 = Float.NaN;
        r4 = i0.f.r(this.start);
        if (!Float.isInfinite(r4)) {
            r5 = i0.f.r(this.end);
            if (!Float.isInfinite(r5)) {
                f5 = Math.abs(i0.f.r(this.start) - i0.f.r(this.end));
            }
        }
        return i0.o.a(f4, f5);
    }

    @Override // androidx.compose.ui.graphics.a6
    @fg.l
    public Shader c(long size) {
        return d1.b(i0.g.a(i0.f.p(this.start) == Float.POSITIVE_INFINITY ? i0.n.t(size) : i0.f.p(this.start), i0.f.r(this.start) == Float.POSITIVE_INFINITY ? i0.n.m(size) : i0.f.r(this.start)), i0.g.a(i0.f.p(this.end) == Float.POSITIVE_INFINITY ? i0.n.t(size) : i0.f.p(this.end), i0.f.r(this.end) == Float.POSITIVE_INFINITY ? i0.n.m(size) : i0.f.r(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) other;
        return kotlin.jvm.internal.l0.g(this.colors, w4Var.colors) && kotlin.jvm.internal.l0.g(this.stops, w4Var.stops) && i0.f.l(this.start, w4Var.start) && i0.f.l(this.end, w4Var.end) && n6.h(this.tileMode, w4Var.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return n6.i(this.tileMode) + i0.k.a(this.end, (i0.f.s(this.start) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    @fg.l
    public String toString() {
        String str;
        String str2 = "";
        if (i0.g.b(this.start)) {
            str = "start=" + ((Object) i0.f.y(this.start)) + ", ";
        } else {
            str = "";
        }
        if (i0.g.b(this.end)) {
            str2 = "end=" + ((Object) i0.f.y(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) n6.j(this.tileMode)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w4(java.util.List r10, java.util.List r11, long r12, long r14, int r16, int r17, kotlin.jvm.internal.w r18) {
        /*
            r9 = this;
            r0 = r17 & 2
            if (r0 == 0) goto L7
            r0 = 0
            r3 = r0
            goto L8
        L7:
            r3 = r11
        L8:
            r0 = r17 & 16
            if (r0 == 0) goto L17
            androidx.compose.ui.graphics.n6$a r0 = androidx.compose.ui.graphics.n6.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.graphics.n6.a()
            r8 = r0
            goto L19
        L17:
            r8 = r16
        L19:
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r1.<init>(r2, r3, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.w4.<init>(java.util.List, java.util.List, long, long, int, int, kotlin.jvm.internal.w):void");
    }

    private w4(List<d2> list, List<Float> list2, long j4, long j5, int i4) {
        this.colors = list;
        this.stops = list2;
        this.start = j4;
        this.end = j5;
        this.tileMode = i4;
    }
}
