package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: Charsets.kt */
@kd.i(name = "CharsetsKt")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "charsetName", "Ljava/nio/charset/Charset;", "a", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g {
    @kotlin.internal.f
    private static final Charset a(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萣\u0001"));
        Charset forName = Charset.forName(str);
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("萤\u0001"));
        return forName;
    }
}
