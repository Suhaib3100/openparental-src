package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "propertyName", "", "defaultValue", "d", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "a", "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes7.dex */
public final /* synthetic */ class x0 {
    public static final int a(@fg.l String str, int i4, int i5, int i6) {
        return (int) b(str, i4, i5, i6);
    }

    public static final long b(@fg.l String str, long j4, long j5, long j6) {
        String b5 = w0.b(str);
        if (b5 == null) {
            return j4;
        }
        Long Z0 = kotlin.text.v.Z0(b5);
        String s4 = ProtectedSandApp.s("蠐\u0001");
        if (Z0 == null) {
            throw new IllegalStateException((s4 + str + ProtectedSandApp.s("蠔\u0001") + b5 + '\'').toString());
        }
        long longValue = Z0.longValue();
        if (j5 <= longValue && longValue <= j6) {
            return longValue;
        }
        StringBuilder a5 = com.cby.txliteav.live.impl.tx.b.a(s4, str, ProtectedSandApp.s("蠑\u0001"), j5);
        androidx.multidex.c.a(a5, ProtectedSandApp.s("蠒\u0001"), j6, ProtectedSandApp.s("蠓\u0001"));
        a5.append(longValue);
        a5.append('\'');
        throw new IllegalStateException(a5.toString().toString());
    }

    @fg.l
    public static final String c(@fg.l String str, @fg.l String str2) {
        String b5 = w0.b(str);
        return b5 == null ? str2 : b5;
    }

    public static final boolean d(@fg.l String str, boolean z4) {
        String b5 = w0.b(str);
        return b5 != null ? Boolean.parseBoolean(b5) : z4;
    }

    public static int e(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return a(str, i4, i5, i6);
    }

    public static long f(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return b(str, j4, j7, j6);
    }
}
