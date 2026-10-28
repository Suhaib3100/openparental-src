package org.greenrobot.eventbus;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Logger.java */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: Logger.java */
    public static class a {
        public static f a() {
            return c5.a.a() ? c5.a.b().f10689a : new c();
        }
    }

    /* compiled from: Logger.java */
    /* loaded from: classes6.dex */
    public static class b implements f {

        /* renamed from: a, reason: collision with root package name */
        protected final Logger f32174a;

        public b(String str) {
            this.f32174a = Logger.getLogger(str);
        }

        @Override // org.greenrobot.eventbus.f
        public void a(Level level, String str) {
            this.f32174a.log(level, str);
        }

        @Override // org.greenrobot.eventbus.f
        public void b(Level level, String str, Throwable th) {
            this.f32174a.log(level, str, th);
        }
    }

    /* compiled from: Logger.java */
    /* loaded from: classes6.dex */
    public static class c implements f {
        @Override // org.greenrobot.eventbus.f
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // org.greenrobot.eventbus.f
        public void b(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}
