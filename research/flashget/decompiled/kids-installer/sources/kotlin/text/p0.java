package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: _OneToManyTitlecaseMappings.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p0 {
    @d5.d
    public static final String a(char c6) {
        String valueOf = String.valueOf(c6);
        String s5 = ProtectedSandApp.s("宔");
        kotlin.jvm.internal.l0.n(valueOf, s5);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("宕"));
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c6));
        }
        if (c6 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        kotlin.jvm.internal.l0.n(upperCase, s5);
        String substring = upperCase.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("宖"));
        kotlin.jvm.internal.l0.n(substring, s5);
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("宗"));
        return charAt + lowerCase;
    }
}
