package i4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;
import kotlin.text.h0;

/* compiled from: capitalizeDecapitalize.kt */
/* loaded from: classes5.dex */
public final class a {
    @d
    public static final String a(@d String str) {
        l0.p(str, ProtectedSandApp.s("㜆"));
        boolean z5 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z5 = true;
        }
        if (!z5) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        l0.o(substring, ProtectedSandApp.s("㜇"));
        return upperCase + substring;
    }

    @d
    public static final String b(@d String str) {
        l0.p(str, ProtectedSandApp.s("㜈"));
        boolean z5 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z5 = true;
        }
        if (!z5) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        l0.o(substring, ProtectedSandApp.s("㜉"));
        return lowerCase + substring;
    }

    @d
    public static final String c(@d String str, boolean z5) {
        IntRange f32;
        Integer num;
        l0.p(str, ProtectedSandApp.s("㜊"));
        if ((str.length() == 0) || !d(str, 0, z5)) {
            return str;
        }
        int length = str.length();
        String s5 = ProtectedSandApp.s("㜋");
        if (length == 1 || !d(str, 1, z5)) {
            if (z5) {
                return b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            l0.o(substring, s5);
            return lowerCase + substring;
        }
        f32 = h0.f3(str);
        Iterator<Integer> it = f32.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!d(str, num.intValue(), z5)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return e(str, z5);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        l0.o(substring2, ProtectedSandApp.s("㜌"));
        sb.append(e(substring2, z5));
        String substring3 = str.substring(intValue);
        l0.o(substring3, s5);
        sb.append(substring3);
        return sb.toString();
    }

    private static final boolean d(String str, int i5, boolean z5) {
        char charAt = str.charAt(i5);
        return z5 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z5) {
        if (z5) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, ProtectedSandApp.s("㜍"));
        return lowerCase;
    }

    @d
    public static final String f(@d String str) {
        l0.p(str, ProtectedSandApp.s("㜎"));
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("㜏"));
        return sb2;
    }
}
