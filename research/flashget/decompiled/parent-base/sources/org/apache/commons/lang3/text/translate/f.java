package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: LookupTranslator.java */
@Deprecated
/* loaded from: classes6.dex */
public class f extends b {

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, String> f86211b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Character> f86212c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final int f86213d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86214e;

    public f(CharSequence[]... charSequenceArr) {
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        if (charSequenceArr != null) {
            int i6 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.f86211b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.f86212c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i4 = length < i4 ? length : i4;
                if (length > i6) {
                    i6 = length;
                }
            }
            i5 = i6;
        }
        this.f86213d = i4;
        this.f86214e = i5;
    }

    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        if (!this.f86212c.contains(Character.valueOf(charSequence.charAt(i4)))) {
            return 0;
        }
        int i5 = this.f86214e;
        if (i4 + i5 > charSequence.length()) {
            i5 = charSequence.length() - i4;
        }
        while (i5 >= this.f86213d) {
            String str = this.f86211b.get(charSequence.subSequence(i4, i4 + i5).toString());
            if (str != null) {
                writer.write(str);
                return i5;
            }
            i5--;
        }
        return 0;
    }
}
