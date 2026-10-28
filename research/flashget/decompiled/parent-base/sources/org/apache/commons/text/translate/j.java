package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: OctalUnescaper.java */
/* loaded from: classes3.dex */
public class j extends b {
    private boolean f(char c5) {
        return c5 >= '0' && c5 <= '7';
    }

    private boolean g(char c5) {
        return c5 >= '0' && c5 <= '3';
    }

    @Override // org.apache.commons.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        int length = (charSequence.length() - i4) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i4) != '\\' || length <= 0) {
            return 0;
        }
        int i5 = i4 + 1;
        if (!f(charSequence.charAt(i5))) {
            return 0;
        }
        int i6 = i4 + 2;
        int i7 = i4 + 3;
        sb.append(charSequence.charAt(i5));
        if (length > 1 && f(charSequence.charAt(i6))) {
            sb.append(charSequence.charAt(i6));
            if (length > 2 && g(charSequence.charAt(i5)) && f(charSequence.charAt(i7))) {
                sb.append(charSequence.charAt(i7));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
