package org.apache.commons.text.translate;

/* compiled from: JavaUnicodeEscaper.java */
/* loaded from: classes3.dex */
public class f extends l {
    public f(int i4, int i5, boolean z4) {
        super(i4, i5, z4);
    }

    public static f l(int i4) {
        return o(0, i4);
    }

    public static f m(int i4) {
        return o(i4, Integer.MAX_VALUE);
    }

    public static f n(int i4, int i5) {
        return new f(i4, i5, true);
    }

    public static f o(int i4, int i5) {
        return new f(i4, i5, false);
    }

    @Override // org.apache.commons.text.translate.l
    protected String k(int i4) {
        char[] chars = Character.toChars(i4);
        return "\\u" + b.a(chars[0]) + "\\u" + b.a(chars[1]);
    }
}
