package org.greenrobot.eventbus;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Logger.java */
/* loaded from: classes6.dex */
public interface f {

    /* compiled from: Logger.java */
    public static class a {
        public static f a() {
            return dg.a.a() ? dg.a.b().f73729a : new c();
        }
    }

    /* compiled from: Logger.java */
    public static class b implements f {

        /* renamed from: a, reason: collision with root package name */
        protected final Logger f86847a;

        public b(String str) {
            this.f86847a = Logger.getLogger(str);
        }

        @Override // org.greenrobot.eventbus.f
        public void a(Level level, String str, Throwable th) {
            this.f86847a.log(level, str, th);
        }

        @Override // org.greenrobot.eventbus.f
        public void b(Level level, String str) {
            this.f86847a.log(level, str);
        }
    }

    /* compiled from: Logger.java */
    public static class c implements f {
        @Override // org.greenrobot.eventbus.f
        public void a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(printStream);
        }

        @Override // org.greenrobot.eventbus.f
        public void b(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th);

    void b(Level level, String str);
}
