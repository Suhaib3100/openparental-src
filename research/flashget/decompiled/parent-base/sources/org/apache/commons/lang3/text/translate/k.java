package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: UnicodeUnescaper.java */
@Deprecated
/* loaded from: classes6.dex */
public class k extends b {
    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        int i5;
        int i6;
        if (charSequence.charAt(i4) != '\\' || (i5 = i4 + 1) >= charSequence.length() || charSequence.charAt(i5) != 'u') {
            return 0;
        }
        int i7 = 2;
        while (true) {
            i6 = i4 + i7;
            if (i6 >= charSequence.length() || charSequence.charAt(i6) != 'u') {
                break;
            }
            i7++;
        }
        if (i6 < charSequence.length() && charSequence.charAt(i6) == '+') {
            i7++;
        }
        int i10 = i4 + i7;
        int i11 = i10 + 4;
        if (i11 > charSequence.length()) {
            throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + ((Object) charSequence.subSequence(i4, charSequence.length())) + "' due to end of CharSequence");
        }
        CharSequence subSequence = charSequence.subSequence(i10, i11);
        try {
            writer.write((char) Integer.parseInt(subSequence.toString(), 16));
            return i7 + 4;
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) subSequence), e4);
        }
    }
}
