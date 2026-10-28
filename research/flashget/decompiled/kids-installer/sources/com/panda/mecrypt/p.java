package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import kotlin.text.h0;

/* compiled from: StringUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0007J%\u0010\u0007\u001a\u00020\n2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000e\"\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\u0010J%\u0010\b\u001a\u00020\n2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000e\"\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¨\u0006\u001b"}, d2 = {"Lcom/panda/mecrypt/p;", "", "", "s", "", "f", "g", "a", "b", "c", "", "d", "str", "m", "", "array", "([Ljava/lang/String;)Ljava/lang/String;", "h", "k", "", "i", "n", "j", "l", "e", "<init>", "()V", "Mecrypt_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtils.kt\ncom/panda/mecrypt/StringUtils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,241:1\n107#2:242\n79#2,22:243\n1#3:265\n1183#4,3:266\n*S KotlinDebug\n*F\n+ 1 StringUtils.kt\ncom/panda/mecrypt/StringUtils\n*L\n58#1:242\n58#1:243,22\n224#1:266,3\n*E\n"})
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final p f21497a = new p();

    private p() {
    }

    @p3.n
    public static final boolean c(@d5.d CharSequence a6, @d5.d CharSequence b6) {
        l0.p(a6, ProtectedSandApp.s("㘱"));
        l0.p(b6, ProtectedSandApp.s("㘲"));
        if (a6 == b6) {
            return true;
        }
        int length = a6.length();
        if (length != b6.length()) {
            return false;
        }
        if ((a6 instanceof String) && (b6 instanceof String)) {
            return l0.g(a6, b6);
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (a6.charAt(i5) != b6.charAt(i5)) {
                return false;
            }
        }
        return true;
    }

    @p3.n
    public static final boolean d(@d5.d String a6, @d5.e String b6) {
        boolean b22;
        l0.p(a6, ProtectedSandApp.s("㘳"));
        if (a6 != b6) {
            if (b6 != null && a6.length() == b6.length()) {
                b22 = e0.b2(a6, 0, b6, 0, b6.length(), true);
                if (b22) {
                }
            }
            return false;
        }
        return true;
    }

    @p3.n
    public static final boolean f(@d5.e CharSequence s5) {
        return s5 == null || s5.length() == 0;
    }

    @p3.n
    public static final boolean g(@d5.e CharSequence s5) {
        return s5 != null && s5.length() > 0;
    }

    @d5.d
    @p3.n
    public static final String m(@d5.e String str) {
        CharSequence C5;
        if (str != null) {
            C5 = h0.C5(str);
            String obj = C5.toString();
            if (obj != null) {
                return obj;
            }
        }
        return "";
    }

    @d5.d
    public final String a(@d5.d String... array) {
        l0.p(array, ProtectedSandApp.s("㘴"));
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : array) {
            stringBuffer.append(str);
        }
        String stringBuffer2 = stringBuffer.toString();
        l0.o(stringBuffer2, ProtectedSandApp.s("㘵"));
        return stringBuffer2;
    }

    @d5.d
    public final String b(@d5.d String... array) {
        l0.p(array, ProtectedSandApp.s("㘶"));
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("㘷"));
        return sb2;
    }

    @d5.d
    public final String e(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("㘸"));
        int i5 = 0;
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            int i7 = i6 + 1;
            if (i6 > 0 && i6 % 4 == 0) {
                sb.append(ProtectedSandApp.s("㘹"));
            }
            sb.append(charAt);
            i5++;
            i6 = i7;
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("㘺"));
        return sb2;
    }

    public final boolean h(@d5.e String s5) {
        if (s5 == null) {
            return true;
        }
        int length = s5.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean z6 = l0.t(s5.charAt(!z5 ? i5 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return s5.subSequence(i5, length + 1).toString().length() == 0;
    }

    public final int i(@d5.e CharSequence s5) {
        if (s5 != null) {
            return s5.length();
        }
        return 0;
    }

    @d5.d
    public final String j(@d5.d String s5) {
        l0.p(s5, ProtectedSandApp.s("㘻"));
        if (f(s5) || !Character.isUpperCase(s5.charAt(0))) {
            return s5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s5.charAt(0) + ' ');
        String substring = s5.substring(1);
        l0.o(substring, ProtectedSandApp.s("㘼"));
        sb.append(substring);
        return sb.toString();
    }

    @d5.d
    public final String k(@d5.e String s5) {
        return s5 == null ? "" : s5;
    }

    @d5.d
    public final String l(@d5.d String s5) {
        l0.p(s5, ProtectedSandApp.s("㘽"));
        int i5 = i(s5);
        if (i5 <= 1) {
            return s5;
        }
        int i6 = i5 >> 1;
        char[] charArray = s5.toCharArray();
        l0.o(charArray, ProtectedSandApp.s("㘾"));
        for (int i7 = 0; i7 < i6; i7++) {
            char c6 = charArray[i7];
            int i8 = (i5 - i7) - 1;
            charArray[i7] = charArray[i8];
            charArray[i8] = c6;
        }
        return new String(charArray);
    }

    @d5.d
    public final String n(@d5.d String s5) {
        l0.p(s5, ProtectedSandApp.s("㘿"));
        if (f(s5) || !Character.isLowerCase(s5.charAt(0))) {
            return s5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s5.charAt(0) - ' ');
        String substring = s5.substring(1);
        l0.o(substring, ProtectedSandApp.s("㙀"));
        sb.append(substring);
        return sb.toString();
    }
}
