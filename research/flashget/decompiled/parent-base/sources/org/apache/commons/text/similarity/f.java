package org.apache.commons.text.similarity;

import java.util.Locale;

/* compiled from: FuzzyScore.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Locale f86648a;

    public f(Locale locale) {
        if (locale == null) {
            throw new IllegalArgumentException("Locale must not be null");
        }
        this.f86648a = locale;
    }

    public Integer a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }
        String lowerCase = charSequence.toString().toLowerCase(this.f86648a);
        String lowerCase2 = charSequence2.toString().toLowerCase(this.f86648a);
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < lowerCase2.length(); i7++) {
            char charAt = lowerCase2.charAt(i7);
            boolean z4 = false;
            while (i6 < lowerCase.length() && !z4) {
                if (charAt == lowerCase.charAt(i6)) {
                    int i10 = i5 + 1;
                    if (i4 + 1 == i6) {
                        i10 = i5 + 3;
                    }
                    i5 = i10;
                    z4 = true;
                    i4 = i6;
                }
                i6++;
            }
        }
        return Integer.valueOf(i5);
    }

    public Locale b() {
        return this.f86648a;
    }
}
