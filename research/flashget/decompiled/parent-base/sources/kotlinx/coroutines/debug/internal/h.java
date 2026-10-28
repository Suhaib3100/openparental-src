package kotlinx.coroutines.debug.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.text.m0;

/* compiled from: DebugProbesImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("蛁\u0001"));
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\"') {
                sb.append(ProtectedSandApp.s("蛂\u0001"));
            } else if (charAt == '\\') {
                sb.append(ProtectedSandApp.s("蛃\u0001"));
            } else if (charAt == '\b') {
                sb.append(ProtectedSandApp.s("蛄\u0001"));
            } else if (charAt == '\n') {
                sb.append(ProtectedSandApp.s("蛅\u0001"));
            } else if (charAt == '\r') {
                sb.append(ProtectedSandApp.s("蛆\u0001"));
            } else if (charAt == '\t') {
                sb.append(ProtectedSandApp.s("蛇\u0001"));
            } else {
                sb.append(charAt);
            }
        }
        return androidx.collection.c.a(sb, m0.quote, ProtectedSandApp.s("蛈\u0001"));
    }
}
