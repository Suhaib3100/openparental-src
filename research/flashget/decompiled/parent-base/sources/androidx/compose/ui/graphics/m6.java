package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/m6;", "Landroidx/compose/ui/graphics/a6;", "Li0/f;", "center", "", "Landroidx/compose/ui/graphics/d2;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Li0/n;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "J", "f", "Ljava/util/List;", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m6 extends a6 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<d2> colors;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<Float> stops;

    public /* synthetic */ m6(long j4, List list, List list2, int i4, kotlin.jvm.internal.w wVar) {
        this(j4, list, (i4 & 4) != 0 ? null : list2);
    }

    @Override // androidx.compose.ui.graphics.a6
    @fg.l
    public Shader c(long size) {
        long a5;
        if (i0.g.f(this.center)) {
            a5 = i0.o.b(size);
        } else {
            a5 = i0.g.a(i0.f.p(this.center) == Float.POSITIVE_INFINITY ? i0.n.t(size) : i0.f.p(this.center), i0.f.r(this.center) == Float.POSITIVE_INFINITY ? i0.n.m(size) : i0.f.r(this.center));
        }
        return d1.d(a5, this.colors, this.stops);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) other;
        return i0.f.l(this.center, m6Var.center) && kotlin.jvm.internal.l0.g(this.colors, m6Var.colors) && kotlin.jvm.internal.l0.g(this.stops, m6Var.stops);
    }

    public int hashCode() {
        int a5 = k6.a(this.colors, i0.f.s(this.center) * 31, 31);
        List<Float> list = this.stops;
        return a5 + (list != null ? list.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        String str;
        if (i0.g.d(this.center)) {
            str = "center=" + ((Object) i0.f.y(this.center)) + ", ";
        } else {
            str = "";
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("SweepGradient(", str, "colors=");
        a5.append(this.colors);
        a5.append(", stops=");
        return l6.a(a5, this.stops, ')');
    }

    public /* synthetic */ m6(long j4, List list, List list2, kotlin.jvm.internal.w wVar) {
        this(j4, list, list2);
    }

    private m6(long j4, List<d2> list, List<Float> list2) {
        this.center = j4;
        this.colors = list;
        this.stops = list2;
    }
}
