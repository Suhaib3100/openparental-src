package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Flushables.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f57167a = Logger.getLogger(t.class.getName());

    private t() {
    }

    public static void a(Flushable flushable, boolean z4) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e4) {
            if (!z4) {
                throw e4;
            }
            f57167a.log(Level.WARNING, ProtectedSandApp.s("\uf6d5"), (Throwable) e4);
        }
    }

    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e4) {
            f57167a.log(Level.SEVERE, ProtectedSandApp.s("\uf6d6"), (Throwable) e4);
        }
    }
}
