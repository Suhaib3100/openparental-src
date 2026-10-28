package de;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: capitalizeDecapitalize.kt */
@r1({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n288#3,2:146\n288#3,2:148\n766#3:150\n857#3,2:151\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:146,2\n57#1:148,2\n72#1:150\n72#1:151,2\n78#1:153,3\n*E\n"})
/* loaded from: classes7.dex */
public final class a {
    @l
    public static final String a(@l String str) {
        l0.p(str, ProtectedSandApp.s("従\u0001"));
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || charAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        l0.o(substring, ProtectedSandApp.s("徔\u0001"));
        return upperCase + substring;
    }

    @l
    public static final String b(@l String str) {
        l0.p(str, ProtectedSandApp.s("従\u0001"));
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' > charAt || charAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        l0.o(substring, ProtectedSandApp.s("徔\u0001"));
        return lowerCase + substring;
    }

    @l
    public static final String c(@l String str, boolean z4) {
        Integer num;
        l0.p(str, ProtectedSandApp.s("従\u0001"));
        if (str.length() == 0 || !d(str, 0, z4)) {
            return str;
        }
        int length = str.length();
        String s4 = ProtectedSandApp.s("徔\u0001");
        if (length == 1 || !d(str, 1, z4)) {
            if (z4) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            l0.o(substring, s4);
            return lowerCase + substring;
        }
        Iterator<Integer> it = v.f3(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!d(str, num.intValue(), z4)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return e(str, z4);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        l0.o(substring2, s4);
        sb.append(e(substring2, z4));
        String substring3 = str.substring(intValue);
        l0.o(substring3, s4);
        sb.append(substring3);
        return sb.toString();
    }

    private static final boolean d(String str, int i4, boolean z4) {
        char charAt = str.charAt(i4);
        return z4 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z4) {
        if (z4) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, ProtectedSandApp.s("徕\u0001"));
        return lowerCase;
    }

    @l
    public static final String f(@l String str) {
        l0.p(str, ProtectedSandApp.s("従\u0001"));
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("徖\u0001"));
        return sb2;
    }
}
