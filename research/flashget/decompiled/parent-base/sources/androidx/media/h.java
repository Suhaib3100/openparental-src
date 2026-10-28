package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.media.p;
import androidx.media.q;

/* compiled from: MediaSessionManager.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    static final String f30772b = "MediaSessionManager";

    /* renamed from: c, reason: collision with root package name */
    static final boolean f30773c = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f30774d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static volatile h f30775e;

    /* renamed from: a, reason: collision with root package name */
    a f30776a;

    /* compiled from: MediaSessionManager.java */
    interface a {
        boolean a(c cVar);

        Context getContext();
    }

    /* compiled from: MediaSessionManager.java */
    interface c {
        int a();

        int b();

        String getPackageName();
    }

    private h(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f30776a = new p(context);
        } else {
            this.f30776a = new i(context);
        }
    }

    @o0
    public static h b(@o0 Context context) {
        h hVar = f30775e;
        if (hVar == null) {
            synchronized (f30774d) {
                try {
                    hVar = f30775e;
                    if (hVar == null) {
                        f30775e = new h(context.getApplicationContext());
                        hVar = f30775e;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }

    Context a() {
        return this.f30776a.getContext();
    }

    public boolean c(@o0 b bVar) {
        if (bVar != null) {
            return this.f30776a.a(bVar.f30778a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* compiled from: MediaSessionManager.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final String f30777b = "android.media.session.MediaController";

        /* renamed from: a, reason: collision with root package name */
        c f30778a;

        public b(@o0 String str, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f30778a = new p.a(str, i4, i5);
            } else {
                this.f30778a = new q.a(str, i4, i5);
            }
        }

        @o0
        public String a() {
            return this.f30778a.getPackageName();
        }

        public int b() {
            return this.f30778a.b();
        }

        public int c() {
            return this.f30778a.a();
        }

        public boolean equals(@q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f30778a.equals(((b) obj).f30778a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30778a.hashCode();
        }

        @c1({c1.a.LIBRARY_GROUP})
        @x0(28)
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f30778a = new p.a(remoteUserInfo);
        }
    }
}
