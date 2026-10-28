package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GeoResultParser.java */
/* loaded from: classes6.dex */
public final class n extends u {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62743g = Pattern.compile(ProtectedSandApp.s("ৼ\u0001"), 2);

    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public m k(com.google.zxing.n nVar) {
        Matcher matcher = f62743g.matcher(u.c(nVar));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d && parseDouble >= -90.0d) {
                double parseDouble2 = Double.parseDouble(matcher.group(2));
                if (parseDouble2 <= 180.0d && parseDouble2 >= -180.0d) {
                    String group2 = matcher.group(3);
                    double d5 = com.google.firebase.remoteconfig.p.f60679p;
                    if (group2 != null) {
                        double parseDouble3 = Double.parseDouble(matcher.group(3));
                        if (parseDouble3 < com.google.firebase.remoteconfig.p.f60679p) {
                            return null;
                        }
                        d5 = parseDouble3;
                    }
                    return new m(parseDouble, parseDouble2, d5, group);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
