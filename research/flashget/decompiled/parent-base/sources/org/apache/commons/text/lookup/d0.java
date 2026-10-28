package org.apache.commons.text.lookup;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* compiled from: UrlEncoderStringLookup.java */
/* loaded from: classes3.dex */
final class d0 extends a {

    /* renamed from: c, reason: collision with root package name */
    static final d0 f86513c = new d0();

    d0() {
    }

    String g(String str, String str2) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, str2);
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String name = StandardCharsets.UTF_8.name();
        try {
            return URLEncoder.encode(str, name);
        } catch (UnsupportedEncodingException e4) {
            throw l.b(e4, "%s: source=%s, encoding=%s", e4, str, name);
        }
    }
}
