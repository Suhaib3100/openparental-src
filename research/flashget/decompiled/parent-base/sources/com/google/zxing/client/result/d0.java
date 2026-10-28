package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: URIResultParser.java */
/* loaded from: classes6.dex */
public final class d0 extends u {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62668g = Pattern.compile(ProtectedSandApp.s("ढ़\u0001"));

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f62669h = Pattern.compile(ProtectedSandApp.s("फ़\u0001"));

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f62670i = Pattern.compile(ProtectedSandApp.s("य़\u0001"));

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f62671j = Pattern.compile(ProtectedSandApp.s("ॠ\u0001"));

    static boolean q(String str) {
        if (str.contains(ProtectedSandApp.s("ॡ\u0001"))) {
            return false;
        }
        Matcher matcher = f62670i.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f62671j.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    static boolean r(String str) {
        return !f62668g.matcher(str).matches() || f62669h.matcher(str).find();
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public c0 k(com.google.zxing.n nVar) {
        String c5 = u.c(nVar);
        if (c5.startsWith(ProtectedSandApp.s("ॢ\u0001")) || c5.startsWith(ProtectedSandApp.s("ॣ\u0001"))) {
            return new c0(c5.substring(4).trim(), null);
        }
        String trim = c5.trim();
        if (!q(trim) || r(trim)) {
            return null;
        }
        return new c0(trim, null);
    }
}
