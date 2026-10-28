package i0;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Rect.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a\"\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Li0/f;", "offset", "Li0/n;", "size", "Li0/i;", "c", "(JJ)Li0/i;", "topLeft", "bottomRight", "a", "center", "", "radius", "b", "(JF)Li0/i;", "start", "stop", "fraction", "d", "(Li0/i;Li0/i;F)Li0/i;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    @x4
    @fg.l
    public static final i a(long j4, long j5) {
        return new i(f.p(j4), f.r(j4), f.p(j5), f.r(j5));
    }

    @x4
    @fg.l
    public static final i b(long j4, float f4) {
        return new i(f.p(j4) - f4, f.r(j4) - f4, f.p(j4) + f4, f.r(j4) + f4);
    }

    @x4
    @fg.l
    public static final i c(long j4, long j5) {
        return new i(f.p(j4), f.r(j4), n.t(j5) + f.p(j4), n.m(j5) + f.r(j4));
    }

    @x4
    @fg.l
    public static final i d(@fg.l i iVar, @fg.l i iVar2, float f4) {
        return new i(androidx.compose.ui.util.d.a(iVar.t(), iVar2.t(), f4), androidx.compose.ui.util.d.a(iVar.getTop(), iVar2.getTop(), f4), androidx.compose.ui.util.d.a(iVar.x(), iVar2.x(), f4), androidx.compose.ui.util.d.a(iVar.j(), iVar2.j(), f4));
    }
}
