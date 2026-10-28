package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/g6;", "Landroidx/compose/ui/graphics/t1;", "Landroidx/compose/ui/graphics/d2;", "value", "<init>", "(JLkotlin/jvm/internal/w;)V", "Li0/n;", "size", "Landroidx/compose/ui/graphics/d5;", "p", "", "alpha", "Lkotlin/k2;", "a", "(JLandroidx/compose/ui/graphics/d5;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "()J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g6 extends t1 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long value;

    public /* synthetic */ g6(long j4, kotlin.jvm.internal.w wVar) {
        this(j4);
    }

    @Override // androidx.compose.ui.graphics.t1
    public void a(long size, @fg.l d5 p4, float alpha) {
        long w4;
        p4.k(1.0f);
        if (alpha == 1.0f) {
            w4 = this.value;
        } else {
            long j4 = this.value;
            w4 = d2.w(j4, d2.A(j4) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p4.m(w4);
        if (p4.t() != null) {
            p4.s(null);
        }
    }

    /* renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof g6) && d2.y(this.value, ((g6) other).value);
    }

    public int hashCode() {
        return d2.K(this.value);
    }

    @fg.l
    public String toString() {
        return "SolidColor(value=" + ((Object) d2.L(this.value)) + ')';
    }

    private g6(long j4) {
        super(null);
        this.value = j4;
    }
}
