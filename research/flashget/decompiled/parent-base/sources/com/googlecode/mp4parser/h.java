package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;

/* compiled from: Version.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f64073a = Logger.getLogger(h.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final String f64074b;

    static {
        String s4;
        try {
            s4 = new LineNumberReader(new InputStreamReader(ProtectedSandApp.a(h.class, ProtectedSandApp.s("ᑁ\u0001")))).readLine();
        } catch (IOException e4) {
            f64073a.warning(e4.getMessage());
            s4 = ProtectedSandApp.s("ᑂ\u0001");
        }
        f64074b = s4;
    }
}
