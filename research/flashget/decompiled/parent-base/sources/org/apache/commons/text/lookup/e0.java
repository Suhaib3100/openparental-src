package org.apache.commons.text.lookup;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import org.apache.commons.lang3.b1;

/* compiled from: UrlStringLookup.java */
/* loaded from: classes3.dex */
final class e0 extends a {

    /* renamed from: c, reason: collision with root package name */
    static final e0 f86517c = new e0();

    private e0() {
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(a.f86486b);
        if (split.length < 2) {
            throw l.a("Bad URL key format [%s]; expected format is DocumentPath:Key.", str);
        }
        String str2 = split[0];
        String e32 = b1.e3(str, 58);
        try {
            URL url = new URL(e32);
            StringWriter stringWriter = new StringWriter(8192);
            char[] cArr = new char[8192];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, str2);
                while (true) {
                    try {
                        int read = inputStreamReader.read(cArr);
                        if (-1 == read) {
                            inputStreamReader.close();
                            bufferedInputStream.close();
                            return stringWriter.toString();
                        }
                        stringWriter.write(cArr, 0, read);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Exception e4) {
            throw l.b(e4, "Error looking up URL [%s] with Charset [%s].", e32, str2);
        }
    }
}
