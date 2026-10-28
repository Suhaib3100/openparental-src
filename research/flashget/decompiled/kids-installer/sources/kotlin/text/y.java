package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;

/* compiled from: RegexExtensionsJVM.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¨\u0006\u0003"}, d2 = {"toRegex", "Lkotlin/text/Regex;", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
class y extends x {
    @InlineOnly
    private static final Regex s(Pattern pattern) {
        kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("貅"));
        return new Regex(pattern);
    }
}
