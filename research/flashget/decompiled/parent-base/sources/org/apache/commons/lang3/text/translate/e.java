package org.apache.commons.lang3.text.translate;

/* compiled from: JavaUnicodeEscaper.java */
@Deprecated
/* loaded from: classes6.dex */
public class e extends j {
    public e(int i4, int i5, boolean z4) {
        super(i4, i5, z4);
    }

    public static e l(int i4) {
        return o(0, i4);
    }

    public static e m(int i4) {
        return o(i4, Integer.MAX_VALUE);
    }

    public static e n(int i4, int i5) {
        return new e(i4, i5, true);
    }

    public static e o(int i4, int i5) {
        return new e(i4, i5, false);
    }

    @Override // org.apache.commons.lang3.text.translate.j
    protected String k(int i4) {
        char[] chars = Character.toChars(i4);
        return "\\u" + b.a(chars[0]) + "\\u" + b.a(chars[1]);
    }
}
