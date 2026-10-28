package androidx.compose.ui.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: ScaleFactor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000f\u001a*\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u001d\u001a\u00020\u0018*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\"\u001f\u0010 \u001a\u00020\u0018*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/n1;", "a", "(FF)J", "i", "(F)F", "Lkotlin/Function0;", "block", "j", "(JLld/a;)J", "Li0/n;", "scaleFactor", "k", "(JJ)J", "size", "l", "c", "start", "stop", "fraction", "h", "(JJF)J", "", "d", "(J)Z", "e", "(J)V", "isSpecified", "f", "g", "isUnspecified", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,198:1\n130#1:202\n25#2,3:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:202\n31#1:199,3\n*E\n"})
/* loaded from: classes.dex */
public final class o1 {
    @x4
    public static final long a(float f4, float f5) {
        return n1.e((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    @x4
    public static final long c(long j4, long j5) {
        return i0.o.a(i0.n.t(j4) / n1.m(j5), i0.n.m(j4) / n1.o(j5));
    }

    public static final boolean d(long j4) {
        n1.INSTANCE.getClass();
        return j4 != n1.f19062c;
    }

    @x4
    public static /* synthetic */ void e(long j4) {
    }

    public static final boolean f(long j4) {
        n1.INSTANCE.getClass();
        return j4 == n1.f19062c;
    }

    @x4
    public static /* synthetic */ void g(long j4) {
    }

    @x4
    public static final long h(long j4, long j5, float f4) {
        return a(androidx.compose.ui.util.d.a(n1.m(j4), n1.m(j5), f4), androidx.compose.ui.util.d.a(n1.o(j4), n1.o(j5), f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f4) {
        float f5 = 10;
        float f6 = f4 * f5;
        int i4 = (int) f6;
        if (f6 - i4 >= 0.5f) {
            i4++;
        }
        return i4 / f5;
    }

    public static final long j(long j4, @fg.l ld.a<n1> aVar) {
        n1.INSTANCE.getClass();
        return j4 != n1.f19062c ? j4 : aVar.invoke().getPackedValue();
    }

    @x4
    public static final long k(long j4, long j5) {
        return i0.o.a(n1.m(j5) * i0.n.t(j4), n1.o(j5) * i0.n.m(j4));
    }

    @x4
    public static final long l(long j4, long j5) {
        return k(j5, j4);
    }
}
