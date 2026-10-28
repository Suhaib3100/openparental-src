package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;

/* compiled from: RegexExtensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¨\u0006\u0007"}, d2 = {"toRegex", "Lkotlin/text/Regex;", "", "options", "", "Lkotlin/text/RegexOption;", "option", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
class z extends y {
    @InlineOnly
    private static final Regex t(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("貆"));
        return new Regex(str);
    }

    @InlineOnly
    private static final Regex u(String str, Set<? extends RegexOption> set) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("貇"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("貈"));
        return new Regex(str, set);
    }

    @InlineOnly
    private static final Regex v(String str, RegexOption regexOption) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("貉"));
        kotlin.jvm.internal.l0.p(regexOption, ProtectedSandApp.s("貊"));
        return new Regex(str, regexOption);
    }
}
