package org.apache.commons.text.lookup;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.lang3.b1;
import org.xml.sax.InputSource;

/* compiled from: XmlStringLookup.java */
/* loaded from: classes3.dex */
final class f0 extends a {

    /* renamed from: c, reason: collision with root package name */
    static final f0 f86519c = new f0();

    private f0() {
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        Path path;
        InputStream newInputStream;
        if (str == null) {
            return null;
        }
        String[] split = str.split(a.f86486b);
        if (split.length != 2) {
            throw l.a("Bad XML key format [%s]; expected format is DocumentPath:XPath.", str);
        }
        String str2 = split[0];
        String e32 = b1.e3(str, 58);
        try {
            path = Paths.get(str2, new String[0]);
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                String evaluate = XPathFactory.newInstance().newXPath().evaluate(e32, new InputSource(newInputStream));
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return evaluate;
            } finally {
            }
        } catch (Exception e4) {
            throw l.b(e4, "Error looking up XML document [%s] and XPath [%s].", str2, e32);
        }
    }
}
