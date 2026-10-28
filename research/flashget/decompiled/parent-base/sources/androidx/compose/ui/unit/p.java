package androidx.compose.ui.unit;

import androidx.annotation.c1;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FontScaling.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/p;", "", "Landroidx/compose/ui/unit/h;", "Landroidx/compose/ui/unit/z;", "h", "(F)J", "i", "(J)F", "", "U", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@m1
@c1({c1.a.LIBRARY_GROUP})
@r1({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes.dex */
public interface p {

    /* compiled from: FontScaling.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @x4
        public static /* synthetic */ void a() {
        }

        @x4
        @Deprecated
        public static float b(@fg.l p pVar, long j4) {
            return p.super.i(j4);
        }

        @x4
        @Deprecated
        public static long c(@fg.l p pVar, float f4) {
            return p.super.h(f4);
        }
    }

    float U();

    @x4
    default long h(float f4) {
        return a0.v(4294967296L, f4 / U());
    }

    @x4
    default float i(long j4) {
        long m4 = z.m(j4);
        b0.INSTANCE.getClass();
        if (!b0.g(m4, b0.f21487d)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return h.g(U() * z.n(j4));
    }
}
