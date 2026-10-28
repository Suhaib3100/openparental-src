package androidx.compose.foundation.shape;

import androidx.annotation.g0;
import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.x1;
import kotlin.Metadata;

/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\" \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/unit/h;", "size", "Landroidx/compose/foundation/shape/f;", "c", "(F)Landroidx/compose/foundation/shape/f;", "", "a", "", "percent", "b", "(I)Landroidx/compose/foundation/shape/f;", "Landroidx/compose/foundation/shape/f;", "d", "()Landroidx/compose/foundation/shape/f;", "e", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final f f7064a = new a();

    /* compiled from: CornerSize.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/shape/g$a", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/x1;", "Li0/n;", "shapeSize", "Landroidx/compose/ui/unit/d;", "density", "", "a", "(JLandroidx/compose/ui/unit/d;)F", "", "toString", "()Ljava/lang/String;", "f", "valueOverride", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements f, x1 {
        a() {
        }

        @Override // androidx.compose.foundation.shape.f
        public float a(long shapeSize, @fg.l androidx.compose.ui.unit.d density) {
            return 0.0f;
        }

        @Override // androidx.compose.ui.platform.x1
        public Object b() {
            return "ZeroCornerSize";
        }

        @fg.l
        public String f() {
            return "ZeroCornerSize";
        }

        @fg.l
        public String toString() {
            return "ZeroCornerSize";
        }
    }

    @x4
    @fg.l
    public static final f a(float f4) {
        return new n(f4);
    }

    @x4
    @fg.l
    public static final f b(@g0(from = 0, to = 100) int i4) {
        return new m(i4);
    }

    @x4
    @fg.l
    public static final f c(float f4) {
        return new k(f4, null);
    }

    @fg.l
    public static final f d() {
        return f7064a;
    }

    @x4
    public static /* synthetic */ void e() {
    }
}
