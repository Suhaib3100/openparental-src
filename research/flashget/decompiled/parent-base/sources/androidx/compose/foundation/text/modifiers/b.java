package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.t;
import androidx.compose.ui.unit.b;
import kotlin.Metadata;

/* compiled from: LayoutUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/unit/b;", "constraints", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "Landroidx/compose/ui/unit/b$a;", "width", "height", "d", "(Landroidx/compose/ui/unit/b$a;II)J", "I", "BigConstraintValue", "MediumConstraintValue", "SmallConstraintValue", "TinyConstraintValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7712a = 262143;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7713b = 65535;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7714c = 32767;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7715d = 8191;

    public static final long a(long j4, boolean z4, int i4, float f4) {
        return androidx.compose.ui.unit.c.b(0, c(j4, z4, i4, f4), 0, androidx.compose.ui.unit.b.o(j4), 5, null);
    }

    public static final int b(boolean z4, int i4, int i5) {
        if (!z4) {
            t.INSTANCE.getClass();
            if (t.g(i4, t.f21405d)) {
                return 1;
            }
        }
        if (i5 < 1) {
            i5 = 1;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        if (androidx.compose.ui.text.style.t.g(r3, androidx.compose.ui.text.style.t.f21405d) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(long r0, boolean r2, int r3, float r4) {
        /*
            if (r2 != 0) goto L11
            androidx.compose.ui.text.style.t$a r2 = androidx.compose.ui.text.style.t.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.t.b()
            boolean r2 = androidx.compose.ui.text.style.t.g(r3, r2)
            if (r2 == 0) goto L1c
        L11:
            boolean r2 = androidx.compose.ui.unit.b.j(r0)
            if (r2 == 0) goto L1c
            int r2 = androidx.compose.ui.unit.b.p(r0)
            goto L1f
        L1c:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1f:
            int r3 = androidx.compose.ui.unit.b.r(r0)
            if (r3 != r2) goto L26
            goto L32
        L26:
            int r3 = androidx.compose.foundation.text.n0.a(r4)
            int r0 = androidx.compose.ui.unit.b.r(r0)
            int r2 = kotlin.ranges.s.I(r3, r0, r2)
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.c(long, boolean, int, float):int");
    }

    public static final long d(@fg.l b.Companion companion, int i4, int i5) {
        int min = Math.min(i4, 262142);
        return companion.c(min, min < f7715d ? Math.min(i5, 262142) : min < 32767 ? Math.min(i5, 65534) : min < 65535 ? Math.min(i5, 32766) : Math.min(i5, 8190));
    }
}
