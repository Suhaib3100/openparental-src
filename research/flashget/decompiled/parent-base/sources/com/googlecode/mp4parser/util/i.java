package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Logger.java */
/* loaded from: classes6.dex */
public abstract class i {
    public static i a(Class cls) {
        return System.getProperty(ProtectedSandApp.s("ᑃ\u0001")).equalsIgnoreCase(ProtectedSandApp.s("ᑄ\u0001")) ? new a(cls.getSimpleName()) : new g(cls.getSimpleName());
    }

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
