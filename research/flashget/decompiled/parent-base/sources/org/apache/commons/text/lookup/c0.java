package org.apache.commons.text.lookup;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: UrlDecoderStringLookup.java */
/* loaded from: classes3.dex */
final class c0 extends a {

    /* renamed from: c, reason: collision with root package name */
    static final c0 f86512c = new c0();

    c0() {
    }

    String g(String str, String str2) throws UnsupportedEncodingException {
        return URLDecoder.decode(str, str2);
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String name = StandardCharsets.UTF_8.name();
        try {
            return URLDecoder.decode(str, name);
        } catch (UnsupportedEncodingException e4) {
            throw l.b(e4, "%s: source=%s, encoding=%s", e4, str, name);
        }
    }
}
