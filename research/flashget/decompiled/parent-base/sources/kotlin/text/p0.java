package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: _OneToManyTitlecaseMappings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(C)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p0 {
    @fg.l
    public static final String a(char c5) {
        String valueOf = String.valueOf(c5);
        String s4 = ProtectedSandApp.s("蓓\u0001");
        kotlin.jvm.internal.l0.n(valueOf, s4);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("蓔\u0001"));
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c5));
        }
        if (c5 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        kotlin.jvm.internal.l0.n(upperCase, s4);
        String substring = upperCase.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蓕\u0001"));
        kotlin.jvm.internal.l0.n(substring, s4);
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("蓖\u0001"));
        return charAt + lowerCase;
    }
}
