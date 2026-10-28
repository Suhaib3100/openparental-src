package androidx.compose.ui.unit;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: IntSize.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\n\u001a\u00020\t*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0016\u0010\r\u001a\u00020\f*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0013\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "width", "height", "Landroidx/compose/ui/unit/u;", "a", "(II)J", "size", "d", "(IJ)J", "Landroidx/compose/ui/unit/s;", "e", "(J)Landroidx/compose/ui/unit/s;", "Li0/n;", "f", "(J)J", "Landroidx/compose/ui/unit/q;", "b", "c", "(J)V", "center", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,112:1\n48#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n32#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class v {
    @x4
    public static final long a(int i4, int i5) {
        return u.e((i5 & 4294967295L) | (i4 << 32));
    }

    public static final long b(long j4) {
        return r.a(u.m(j4) / 2, ((int) (j4 & 4294967295L)) / 2);
    }

    @x4
    public static /* synthetic */ void c(long j4) {
    }

    @x4
    public static final long d(int i4, long j4) {
        return u.o(j4, i4);
    }

    @x4
    @fg.l
    public static final s e(long j4) {
        q.INSTANCE.getClass();
        return t.b(q.f21519c, j4);
    }

    @x4
    public static final long f(long j4) {
        return i0.o.a(u.m(j4), (int) (j4 & 4294967295L));
    }
}
