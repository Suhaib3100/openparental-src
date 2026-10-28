package org.apache.commons.lang3;

import java.nio.charset.Charset;

/* compiled from: Charsets.java */
/* loaded from: classes6.dex */
class n {
    n() {
    }

    static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    static String c(String str) {
        return str == null ? Charset.defaultCharset().name() : str;
    }
}
