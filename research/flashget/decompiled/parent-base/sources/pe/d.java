package pe;

import androidx.core.content.f;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FormatUtils.java */
/* loaded from: classes7.dex */
public class d {
    private d() {
    }

    public static String a(String str) {
        int i4;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i5 = 0;
        boolean z4 = false;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt == '\'') {
                int i6 = i5 + 1;
                if (i6 >= length || str.charAt(i6) != '\'') {
                    z4 = !z4;
                } else {
                    sb.append(charAt);
                    i5 = i6;
                }
                sb.append(charAt);
            } else if (z4) {
                sb.append(charAt);
            } else if (charAt != 'z' && charAt != 'Z' && charAt != 'v' && charAt != 'V' && charAt != 'x' && charAt != 'X') {
                sb.append(charAt);
            }
            i5++;
        }
        int i7 = 0;
        while (i7 < sb.length()) {
            char charAt2 = sb.charAt(i7);
            if (charAt2 == ' ' && (i4 = i7 + 1) < sb.length() && sb.charAt(i4) == ' ') {
                sb.deleteCharAt(i7);
            } else if (charAt2 == '[' || charAt2 == ']' || charAt2 == '(' || charAt2 == ')') {
                sb.deleteCharAt(i7);
            } else {
                i7++;
            }
            i7--;
            i7++;
        }
        String trim = sb.toString().trim();
        if (!trim.endsWith(ProtectedSandApp.s("ꋶ\u0001"))) {
            return trim.endsWith(ProtectedSandApp.s("ꋸ\u0001")) ? f.a(trim, 1, 0) : trim;
        }
        return trim.substring(0, trim.length() - 2) + ProtectedSandApp.s("ꋷ\u0001");
    }
}
