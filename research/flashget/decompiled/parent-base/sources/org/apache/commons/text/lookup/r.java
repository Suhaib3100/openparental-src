package org.apache.commons.text.lookup;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: ResourceBundleStringLookup.java */
/* loaded from: classes3.dex */
final class r extends a {

    /* renamed from: d, reason: collision with root package name */
    static final r f86541d = new r(null);

    /* renamed from: c, reason: collision with root package name */
    private final String f86542c;

    r(String str) {
        this.f86542c = str;
    }

    ResourceBundle g(String str) {
        return ResourceBundle.getBundle(str);
    }

    String h(String str, String str2) {
        return ResourceBundle.getBundle(str).getString(str2);
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(a.f86486b);
        int length = split.length;
        String str2 = this.f86542c;
        boolean z4 = str2 == null;
        if (z4 && length != 2) {
            throw l.a("Bad resource bundle key format [%s]; expected format is BundleName:KeyName.", str);
        }
        if (str2 != null && length != 1) {
            throw l.a("Bad resource bundle key format [%s]; expected format is KeyName.", str);
        }
        if (z4) {
            str2 = split[0];
        }
        String str3 = z4 ? split[1] : split[0];
        try {
            return h(str2, str3);
        } catch (MissingResourceException unused) {
            return null;
        } catch (Exception e4) {
            throw l.b(e4, "Error looking up resource bundle [%s] and key [%s].", str2, str3);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [bundleName=");
        return android.support.v4.media.c.a(sb, this.f86542c, "]");
    }

    r() {
        this(null);
    }
}
