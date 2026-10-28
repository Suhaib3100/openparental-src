package pe;

import net.time4j.format.j;

/* compiled from: DualFormatHelper.java */
/* loaded from: classes7.dex */
public class b {
    public static String a(j jVar, char c5, int i4) {
        if (!jVar.isDecimal()) {
            return jVar.toNumeral(i4);
        }
        int i5 = c5 - '0';
        String num = Integer.toString(i4);
        if (i5 == 0) {
            return num;
        }
        StringBuilder sb = new StringBuilder();
        int length = num.length();
        for (int i6 = 0; i6 < length; i6++) {
            sb.append((char) (num.charAt(i6) + i5));
        }
        return sb.toString();
    }
}
