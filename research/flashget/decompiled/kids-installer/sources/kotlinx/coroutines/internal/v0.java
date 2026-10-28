package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, d2 = {"", "propertyName", "", "defaultValue", "c", "", "minValue", "maxValue", "a", "", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class v0 {
    public static final int a(@d5.d String str, int i5, int i6, int i7) {
        return (int) b(str, i5, i6, i7);
    }

    public static final long b(@d5.d String str, long j5, long j6, long j7) {
        Long Z0;
        String b6 = u0.b(str);
        if (b6 == null) {
            return j5;
        }
        Z0 = kotlin.text.d0.Z0(b6);
        String s5 = ProtectedSandApp.s("巿");
        if (Z0 == null) {
            throw new IllegalStateException((s5 + str + ProtectedSandApp.s("布") + b6 + '\'').toString());
        }
        long longValue = Z0.longValue();
        boolean z5 = false;
        if (j6 <= longValue && longValue <= j7) {
            z5 = true;
        }
        if (z5) {
            return longValue;
        }
        throw new IllegalStateException((s5 + str + ProtectedSandApp.s("帀") + j6 + ProtectedSandApp.s("币") + j7 + ProtectedSandApp.s("市") + longValue + '\'').toString());
    }

    public static final boolean c(@d5.d String str, boolean z5) {
        String b6 = u0.b(str);
        return b6 != null ? Boolean.parseBoolean(b6) : z5;
    }

    public static int d(String str, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i6 = 1;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return a(str, i5, i6, i7);
    }

    public static long e(String str, long j5, long j6, long j7, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j6 = 1;
        }
        long j8 = j6;
        if ((i5 & 8) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return b(str, j5, j8, j7);
    }
}
