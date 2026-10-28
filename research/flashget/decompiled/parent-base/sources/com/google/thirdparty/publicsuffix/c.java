package com.google.thirdparty.publicsuffix;

import com.google.common.base.c0;
import com.google.common.collect.h3;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: TrieParser.java */
@d9.b
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c0 f62591a = c0.p("");

    c() {
    }

    private static int a(Deque<CharSequence> deque, CharSequence charSequence, int i4, h3.b<String, b> bVar) {
        int length = charSequence.length();
        char c5 = 0;
        int i5 = i4;
        while (i5 < length && (c5 = charSequence.charAt(i5)) != '&' && c5 != '?' && c5 != '!' && c5 != ':' && c5 != ',') {
            i5++;
        }
        deque.push(c(charSequence.subSequence(i4, i5)));
        if (c5 == '!' || c5 == '?' || c5 == ':' || c5 == ',') {
            String k4 = f62591a.k(deque);
            if (k4.length() > 0) {
                bVar.i(k4, b.fromCode(c5));
            }
        }
        int i6 = i5 + 1;
        if (c5 != '?' && c5 != ',') {
            while (i6 < length) {
                i6 += a(deque, charSequence, i6, bVar);
                if (charSequence.charAt(i6) == '?' || charSequence.charAt(i6) == ',') {
                    i6++;
                    break;
                }
            }
        }
        deque.pop();
        return i6 - i4;
    }

    static h3<String, b> b(CharSequence charSequence) {
        h3.b c5 = h3.c();
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            i4 += a(new ArrayDeque(), charSequence, i4, c5);
        }
        return c5.d();
    }

    private static CharSequence c(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
