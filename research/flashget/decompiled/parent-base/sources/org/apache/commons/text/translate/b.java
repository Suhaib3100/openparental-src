package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang3.k1;

/* compiled from: CharSequenceTranslator.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f86687a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i4) {
        return Integer.toHexString(i4).toUpperCase(Locale.ENGLISH);
    }

    public abstract int b(CharSequence charSequence, int i4, Writer writer) throws IOException;

    public final String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            d(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final void d(CharSequence charSequence, Writer writer) throws IOException {
        k1.B(writer != null, "The Writer must not be null", new Object[0]);
        if (charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            int b5 = b(charSequence, i4, writer);
            if (b5 == 0) {
                char charAt = charSequence.charAt(i4);
                writer.write(charAt);
                int i5 = i4 + 1;
                if (Character.isHighSurrogate(charAt) && i5 < length) {
                    char charAt2 = charSequence.charAt(i5);
                    if (Character.isLowSurrogate(charAt2)) {
                        writer.write(charAt2);
                        i4 += 2;
                    }
                }
                i4 = i5;
            } else {
                for (int i6 = 0; i6 < b5; i6++) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                }
            }
        }
    }

    public final b e(b... bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length + 1];
        bVarArr2[0] = this;
        System.arraycopy(bVarArr, 0, bVarArr2, 1, bVarArr.length);
        return new a(bVarArr2);
    }
}
