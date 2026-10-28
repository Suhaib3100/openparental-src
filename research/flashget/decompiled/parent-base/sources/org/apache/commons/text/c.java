package org.apache.commons.text;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.b1;

/* compiled from: CaseUtils.java */
/* loaded from: classes3.dex */
public class c {
    private static Set<Integer> a(char[] cArr) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
        if (org.apache.commons.lang3.e.i1(cArr)) {
            return hashSet;
        }
        for (int i4 = 0; i4 < cArr.length; i4++) {
            hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i4)));
        }
        return hashSet;
    }

    public static String b(String str, boolean z4, char... cArr) {
        if (b1.G0(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();
        int[] iArr = new int[length];
        Set<Integer> a5 = a(cArr);
        boolean z5 = z4;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int codePointAt = lowerCase.codePointAt(i4);
            if (a5.contains(Integer.valueOf(codePointAt))) {
                z5 = i5 != 0;
                i4 = Character.charCount(codePointAt) + i4;
            } else if (z5 || (i5 == 0 && z4)) {
                int titleCase = Character.toTitleCase(codePointAt);
                int i6 = i5 + 1;
                iArr[i5] = titleCase;
                int charCount = Character.charCount(titleCase) + i4;
                z5 = false;
                i4 = charCount;
                i5 = i6;
            } else {
                iArr[i5] = codePointAt;
                i4 = Character.charCount(codePointAt) + i4;
                i5++;
            }
        }
        return i5 != 0 ? new String(iArr, 0, i5) : lowerCase;
    }
}
