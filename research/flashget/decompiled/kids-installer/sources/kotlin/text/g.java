package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;

/* compiled from: Charsets.kt */
@p3.i(name = "CharsetsKt")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"charset", "Ljava/nio/charset/Charset;", "charsetName", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {
    @InlineOnly
    private static final Charset a(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嫌"));
        Charset forName = Charset.forName(str);
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("嫍"));
        return forName;
    }
}
