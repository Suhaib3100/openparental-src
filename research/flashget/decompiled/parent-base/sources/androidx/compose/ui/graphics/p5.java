package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/p5;", "Landroidx/compose/ui/graphics/a6;", "", "Landroidx/compose/ui/graphics/d2;", "colors", "", "stops", "Li0/f;", "center", "radius", "Landroidx/compose/ui/graphics/n6;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/w;)V", "Li0/n;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/util/List;", "f", "g", "J", "h", "F", "i", "I", "b", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p5 extends a6 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<d2> colors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<Float> stops;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    public /* synthetic */ p5(List list, List list2, long j4, float f4, int i4, kotlin.jvm.internal.w wVar) {
        this(list, list2, j4, f4, i4);
    }

    @Override // androidx.compose.ui.graphics.t1
    /* renamed from: b */
    public long getIntrinsicSize() {
        float f4 = this.radius;
        if (Float.isInfinite(f4) || Float.isNaN(f4)) {
            i0.n.INSTANCE.getClass();
            return i0.n.f74172d;
        }
        float f5 = this.radius;
        float f6 = 2;
        return i0.o.a(f5 * f6, f5 * f6);
    }

    @Override // androidx.compose.ui.graphics.a6
    @fg.l
    public Shader c(long size) {
        float t4;
        float m4;
        if (i0.g.f(this.center)) {
            long b5 = i0.o.b(size);
            t4 = i0.f.p(b5);
            m4 = i0.f.r(b5);
        } else {
            t4 = i0.f.p(this.center) == Float.POSITIVE_INFINITY ? i0.n.t(size) : i0.f.p(this.center);
            m4 = i0.f.r(this.center) == Float.POSITIVE_INFINITY ? i0.n.m(size) : i0.f.r(this.center);
        }
        List<d2> list = this.colors;
        List<Float> list2 = this.stops;
        long a5 = i0.g.a(t4, m4);
        float f4 = this.radius;
        return d1.c(a5, f4 == Float.POSITIVE_INFINITY ? i0.n.q(size) / 2 : f4, list, list2, this.tileMode);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) other;
        return kotlin.jvm.internal.l0.g(this.colors, p5Var.colors) && kotlin.jvm.internal.l0.g(this.stops, p5Var.stops) && i0.f.l(this.center, p5Var.center) && this.radius == p5Var.radius && n6.h(this.tileMode, p5Var.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return n6.i(this.tileMode) + androidx.compose.animation.l0.a(this.radius, (i0.f.s(this.center) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    @fg.l
    public String toString() {
        String str;
        String str2 = "";
        if (i0.g.d(this.center)) {
            str = "center=" + ((Object) i0.f.y(this.center)) + ", ";
        } else {
            str = "";
        }
        float f4 = this.radius;
        if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
            str2 = androidx.compose.foundation.shape.j.a(new StringBuilder("radius="), this.radius, ", ");
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) n6.j(this.tileMode)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p5(java.util.List r8, java.util.List r9, long r10, float r12, int r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L5
            r9 = 0
        L5:
            r2 = r9
            r9 = r14 & 16
            if (r9 == 0) goto L13
            androidx.compose.ui.graphics.n6$a r9 = androidx.compose.ui.graphics.n6.INSTANCE
            r9.getClass()
            int r13 = androidx.compose.ui.graphics.n6.a()
        L13:
            r6 = r13
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.p5.<init>(java.util.List, java.util.List, long, float, int, int, kotlin.jvm.internal.w):void");
    }

    private p5(List<d2> list, List<Float> list2, long j4, float f4, int i4) {
        this.colors = list;
        this.stops = list2;
        this.center = j4;
        this.radius = f4;
        this.tileMode = i4;
    }
}
