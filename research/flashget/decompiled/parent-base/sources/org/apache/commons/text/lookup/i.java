package org.apache.commons.text.lookup;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.lang3.b1;

/* compiled from: FileStringLookup.java */
/* loaded from: classes3.dex */
final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    static final a f86521c = new i();

    private i() {
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        Path path;
        byte[] readAllBytes;
        if (str == null) {
            return null;
        }
        String[] split = str.split(String.valueOf(':'));
        if (split.length < 2) {
            throw l.a("Bad file key format [%s], expected format is CharsetName:DocumentPath.", str);
        }
        String str2 = split[0];
        String e32 = b1.e3(str, 58);
        try {
            path = Paths.get(e32, new String[0]);
            readAllBytes = Files.readAllBytes(path);
            return new String(readAllBytes, str2);
        } catch (Exception e4) {
            throw l.b(e4, "Error looking up file [%s] with charset [%s].", e32, str2);
        }
    }
}
