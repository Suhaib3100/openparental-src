package androidx.compose.ui.text.caches;

import fg.l;
import kd.f;
import kotlin.Metadata;

/* compiled from: ContainerHelpers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "", "size", "value", "a", "([III)I", "[I", "EMPTY_INTS", "", "", "b", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    @f
    public static final int[] f20609a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    @l
    @f
    public static final Object[] f20610b = new Object[0];

    public static final int a(@l int[] iArr, int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i10 = (i7 + i6) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i5) {
                i7 = i10 + 1;
            } else {
                if (i11 <= i5) {
                    return i10;
                }
                i6 = i10 - 1;
            }
        }
        return ~i7;
    }
}
