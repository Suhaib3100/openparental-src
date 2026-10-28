package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.NotFoundException;

/* compiled from: FieldParser.java */
/* loaded from: classes6.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f63135a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object[][] f63136b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object[][] f63137c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[][] f63138d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object[][] f63139e;

    static {
        Object obj = new Object();
        f63135a = obj;
        f63136b = new Object[][]{new Object[]{ProtectedSandApp.s("ஂ\u0001"), 18}, new Object[]{ProtectedSandApp.s("ஃ\u0001"), 14}, new Object[]{ProtectedSandApp.s("\u0b84\u0001"), 14}, new Object[]{ProtectedSandApp.s("அ\u0001"), obj, 20}, new Object[]{ProtectedSandApp.s("ஆ\u0001"), 6}, new Object[]{ProtectedSandApp.s("இ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஈ\u0001"), 6}, new Object[]{ProtectedSandApp.s("உ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஊ\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0b8b\u0001"), 2}, new Object[]{ProtectedSandApp.s("\u0b8c\u0001"), obj, 20}, new Object[]{ProtectedSandApp.s("\u0b8d\u0001"), obj, 29}, new Object[]{ProtectedSandApp.s("எ\u0001"), obj, 8}, new Object[]{ProtectedSandApp.s("ஏ\u0001"), obj, 8}, new Object[]{ProtectedSandApp.s("ஐ\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0b91\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ஒ\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ஓ\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ஔ\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("க\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0b96\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0b97\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0b98\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ங\u0001"), obj, 30}};
        f63137c = new Object[][]{new Object[]{ProtectedSandApp.s("ச\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0b9b\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ஜ\u0001"), obj, 6}, new Object[]{ProtectedSandApp.s("\u0b9d\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ஞ\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ட\u0001"), obj, 17}, new Object[]{ProtectedSandApp.s("\u0ba0\u0001"), obj, 20}, new Object[]{ProtectedSandApp.s("\u0ba1\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0ba2\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("ண\u0001"), 17}, new Object[]{ProtectedSandApp.s("த\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("\u0ba5\u0001"), 13}, new Object[]{ProtectedSandApp.s("\u0ba6\u0001"), 13}, new Object[]{ProtectedSandApp.s("\u0ba7\u0001"), 13}, new Object[]{ProtectedSandApp.s("ந\u0001"), 13}, new Object[]{ProtectedSandApp.s("ன\u0001"), 13}, new Object[]{ProtectedSandApp.s("ப\u0001"), obj, 20}, new Object[]{ProtectedSandApp.s("\u0bab\u0001"), obj, 15}, new Object[]{ProtectedSandApp.s("\u0bac\u0001"), 3}, new Object[]{ProtectedSandApp.s("\u0bad\u0001"), obj, 15}, new Object[]{ProtectedSandApp.s("ம\u0001"), 3}, new Object[]{ProtectedSandApp.s("ய\u0001"), 3}, new Object[]{ProtectedSandApp.s("ர\u0001"), 3}};
        f63138d = new Object[][]{new Object[]{ProtectedSandApp.s("ற\u0001"), 6}, new Object[]{ProtectedSandApp.s("ல\u0001"), 6}, new Object[]{ProtectedSandApp.s("ள\u0001"), 6}, new Object[]{ProtectedSandApp.s("ழ\u0001"), 6}, new Object[]{ProtectedSandApp.s("வ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஶ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஷ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஸ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ஹ\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bba\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bbb\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bbc\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bbd\u0001"), 6}, new Object[]{ProtectedSandApp.s("ா\u0001"), 6}, new Object[]{ProtectedSandApp.s("ி\u0001"), 6}, new Object[]{ProtectedSandApp.s("ீ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ு\u0001"), 6}, new Object[]{ProtectedSandApp.s("ூ\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bc3\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bc4\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bc5\u0001"), 6}, new Object[]{ProtectedSandApp.s("ெ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ே\u0001"), 6}, new Object[]{ProtectedSandApp.s("ை\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bc9\u0001"), 6}, new Object[]{ProtectedSandApp.s("ொ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ோ\u0001"), 6}, new Object[]{ProtectedSandApp.s("ௌ\u0001"), 6}, new Object[]{ProtectedSandApp.s("்\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bce\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bcf\u0001"), 6}, new Object[]{ProtectedSandApp.s("ௐ\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd1\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd2\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd3\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd4\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd5\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd6\u0001"), 6}, new Object[]{ProtectedSandApp.s("ௗ\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd8\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bd9\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bda\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bdb\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bdc\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bdd\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bde\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0bdf\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be0\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be1\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be2\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be3\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be4\u0001"), 6}, new Object[]{ProtectedSandApp.s("\u0be5\u0001"), obj, 15}, new Object[]{ProtectedSandApp.s("௦\u0001"), obj, 18}, new Object[]{ProtectedSandApp.s("௧\u0001"), obj, 15}, new Object[]{ProtectedSandApp.s("௨\u0001"), obj, 18}, new Object[]{ProtectedSandApp.s("௩\u0001"), obj, 30}};
        f63139e = new Object[][]{new Object[]{ProtectedSandApp.s("௪\u0001"), 13}, new Object[]{ProtectedSandApp.s("௫\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("௬\u0001"), 10}, new Object[]{ProtectedSandApp.s("௭\u0001"), 14}, new Object[]{ProtectedSandApp.s("௮\u0001"), obj, 20}, new Object[]{ProtectedSandApp.s("௯\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("௰\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("௱\u0001"), 6}, new Object[]{ProtectedSandApp.s("௲\u0001"), 18}, new Object[]{ProtectedSandApp.s("௳\u0001"), obj, 30}, new Object[]{ProtectedSandApp.s("௴\u0001"), obj, 12}, new Object[]{ProtectedSandApp.s("௵\u0001"), 18}, new Object[]{ProtectedSandApp.s("௶\u0001"), obj, 25}, new Object[]{ProtectedSandApp.s("௷\u0001"), 6}, new Object[]{ProtectedSandApp.s("௸\u0001"), 10}, new Object[]{ProtectedSandApp.s("௹\u0001"), 2}, new Object[]{ProtectedSandApp.s("௺\u0001"), obj, 70}, new Object[]{ProtectedSandApp.s("\u0bfb\u0001"), obj, 70}};
    }

    private r() {
    }

    static String a(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.a();
        }
        String substring = str.substring(0, 2);
        for (Object[] objArr : f63136b) {
            if (objArr[0].equals(substring)) {
                Object obj = objArr[1];
                return obj == f63135a ? c(2, ((Integer) objArr[2]).intValue(), str) : b(2, ((Integer) obj).intValue(), str);
            }
        }
        if (str.length() < 3) {
            throw NotFoundException.a();
        }
        String substring2 = str.substring(0, 3);
        for (Object[] objArr2 : f63137c) {
            if (objArr2[0].equals(substring2)) {
                Object obj2 = objArr2[1];
                return obj2 == f63135a ? c(3, ((Integer) objArr2[2]).intValue(), str) : b(3, ((Integer) obj2).intValue(), str);
            }
        }
        for (Object[] objArr3 : f63138d) {
            if (objArr3[0].equals(substring2)) {
                Object obj3 = objArr3[1];
                return obj3 == f63135a ? c(4, ((Integer) objArr3[2]).intValue(), str) : b(4, ((Integer) obj3).intValue(), str);
            }
        }
        if (str.length() < 4) {
            throw NotFoundException.a();
        }
        String substring3 = str.substring(0, 4);
        for (Object[] objArr4 : f63139e) {
            if (objArr4[0].equals(substring3)) {
                Object obj4 = objArr4[1];
                return obj4 == f63135a ? c(4, ((Integer) objArr4[2]).intValue(), str) : b(4, ((Integer) obj4).intValue(), str);
            }
        }
        throw NotFoundException.a();
    }

    private static String b(int i4, int i5, String str) throws NotFoundException {
        if (str.length() < i4) {
            throw NotFoundException.a();
        }
        String substring = str.substring(0, i4);
        int i6 = i5 + i4;
        if (str.length() < i6) {
            throw NotFoundException.a();
        }
        String substring2 = str.substring(i4, i6);
        String substring3 = str.substring(i6);
        String str2 = ProtectedSandApp.s("\u0bfc\u0001") + substring + ')' + substring2;
        String a5 = a(substring3);
        return a5 == null ? str2 : androidx.compose.runtime.changelist.j.a(str2, a5);
    }

    private static String c(int i4, int i5, String str) throws NotFoundException {
        String substring = str.substring(0, i4);
        int min = Math.min(str.length(), i5 + i4);
        String substring2 = str.substring(i4, min);
        String substring3 = str.substring(min);
        String str2 = ProtectedSandApp.s("\u0bfc\u0001") + substring + ')' + substring2;
        String a5 = a(substring3);
        return a5 == null ? str2 : androidx.compose.runtime.changelist.j.a(str2, a5);
    }
}
