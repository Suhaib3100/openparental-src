package org.apache.commons.text.lookup;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import org.apache.commons.lang3.b1;

/* compiled from: PropertiesStringLookup.java */
/* loaded from: classes3.dex */
final class q extends a {

    /* renamed from: d, reason: collision with root package name */
    static final String f86540d = "::";

    /* renamed from: c, reason: collision with root package name */
    static final q f86539c = new q();

    private q() {
    }

    static String g(String str, String str2) {
        return a.f(str, "::", str2);
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        Path path;
        InputStream newInputStream;
        if (str == null) {
            return null;
        }
        String[] split = str.split("::");
        if (split.length < 2) {
            throw l.a("Bad properties key format [%s]; expected format is %s.", str, a.f("DocumentPath", "::", "Key"));
        }
        String str2 = split[0];
        String f32 = b1.f3(str, "::");
        try {
            Properties properties = new Properties();
            path = Paths.get(str2, new String[0]);
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                properties.load(newInputStream);
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return properties.getProperty(f32);
            } finally {
            }
        } catch (Exception e4) {
            throw l.b(e4, "Error looking up properties [%s] and key [%s].", str2, f32);
        }
    }
}
