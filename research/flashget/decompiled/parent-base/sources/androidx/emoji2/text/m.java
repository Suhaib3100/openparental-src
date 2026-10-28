package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.graphics.v0;
import androidx.core.os.p0;
import androidx.core.provider.q;
import androidx.core.util.w;
import androidx.emoji2.text.g;
import androidx.emoji2.text.m;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes3.dex */
public class m extends g.d {

    /* renamed from: k, reason: collision with root package name */
    private static final b f29476k = new b();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final long f29477a;

        /* renamed from: b, reason: collision with root package name */
        private long f29478b;

        public a(long j4) {
            this.f29477a = j4;
        }

        @Override // androidx.emoji2.text.m.d
        public long a() {
            if (this.f29478b == 0) {
                this.f29478b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f29478b;
            if (uptimeMillis > this.f29477a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.f29477a - uptimeMillis);
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    @c1({c1.a.LIBRARY})
    public static class b {
        @q0
        public Typeface a(@o0 Context context, @o0 q.c cVar) throws PackageManager.NameNotFoundException {
            return v0.d(context, null, new q.c[]{cVar}, 0);
        }

        @o0
        public q.b b(@o0 Context context, @o0 androidx.core.provider.g gVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.q.b(context, null, gVar);
        }

        public void c(@o0 Context context, @o0 Uri uri, @o0 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@o0 Context context, @o0 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    static class c implements g.j {

        /* renamed from: l, reason: collision with root package name */
        private static final String f29479l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final Context f29480a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final androidx.core.provider.g f29481b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final b f29482c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final Object f29483d = new Object();

        /* renamed from: e, reason: collision with root package name */
        @q0
        @b0("mLock")
        private Handler f29484e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @b0("mLock")
        private Executor f29485f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        @b0("mLock")
        private ThreadPoolExecutor f29486g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        @b0("mLock")
        private d f29487h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        @b0("mLock")
        g.k f29488i;

        /* renamed from: j, reason: collision with root package name */
        @q0
        @b0("mLock")
        private ContentObserver f29489j;

        /* renamed from: k, reason: collision with root package name */
        @q0
        @b0("mLock")
        private Runnable f29490k;

        /* compiled from: FontRequestEmojiCompatConfig.java */
        class a extends ContentObserver {
            a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4, Uri uri) {
                c.this.d();
            }
        }

        c(@o0 Context context, @o0 androidx.core.provider.g gVar, @o0 b bVar) {
            w.m(context, "Context cannot be null");
            w.m(gVar, "FontRequest cannot be null");
            this.f29480a = context.getApplicationContext();
            this.f29481b = gVar;
            this.f29482c = bVar;
        }

        private void b() {
            synchronized (this.f29483d) {
                try {
                    this.f29488i = null;
                    ContentObserver contentObserver = this.f29489j;
                    if (contentObserver != null) {
                        this.f29482c.d(this.f29480a, contentObserver);
                        this.f29489j = null;
                    }
                    Handler handler = this.f29484e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f29490k);
                    }
                    this.f29484e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f29486g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f29485f = null;
                    this.f29486g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @n1
        private q.c e() {
            try {
                q.b b5 = this.f29482c.b(this.f29480a, this.f29481b);
                if (b5.e() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + b5.e() + ")");
                }
                q.c[] c5 = b5.c();
                if (c5 == null || c5.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c5[0];
            } catch (PackageManager.NameNotFoundException e4) {
                throw new RuntimeException("provider not found", e4);
            }
        }

        @n1
        @x0(19)
        private void f(Uri uri, long j4) {
            synchronized (this.f29483d) {
                try {
                    Handler handler = this.f29484e;
                    if (handler == null) {
                        handler = androidx.emoji2.text.d.e();
                        this.f29484e = handler;
                    }
                    if (this.f29489j == null) {
                        a aVar = new a(handler);
                        this.f29489j = aVar;
                        this.f29482c.c(this.f29480a, uri, aVar);
                    }
                    if (this.f29490k == null) {
                        this.f29490k = new Runnable() { // from class: androidx.emoji2.text.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                m.c.this.d();
                            }
                        };
                    }
                    handler.postDelayed(this.f29490k, j4);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.emoji2.text.g.j
        @x0(19)
        public void a(@o0 g.k kVar) {
            w.m(kVar, "LoaderCallback cannot be null");
            synchronized (this.f29483d) {
                this.f29488i = kVar;
            }
            d();
        }

        @n1
        @x0(19)
        void c() {
            synchronized (this.f29483d) {
                try {
                    if (this.f29488i == null) {
                        return;
                    }
                    try {
                        q.c e4 = e();
                        int b5 = e4.b();
                        if (b5 == 2) {
                            synchronized (this.f29483d) {
                                try {
                                    d dVar = this.f29487h;
                                    if (dVar != null) {
                                        long a5 = dVar.a();
                                        if (a5 >= 0) {
                                            f(e4.d(), a5);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (b5 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b5 + ")");
                        }
                        try {
                            p0.b("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a6 = this.f29482c.a(this.f29480a, e4);
                            ByteBuffer f4 = androidx.core.graphics.c1.f(this.f29480a, null, e4.d());
                            if (f4 == null || a6 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            q e5 = q.e(a6, f4);
                            Trace.endSection();
                            synchronized (this.f29483d) {
                                try {
                                    g.k kVar = this.f29488i;
                                    if (kVar != null) {
                                        kVar.b(e5);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            p0.d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f29483d) {
                            try {
                                g.k kVar2 = this.f29488i;
                                if (kVar2 != null) {
                                    kVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @x0(19)
        void d() {
            synchronized (this.f29483d) {
                try {
                    if (this.f29488i == null) {
                        return;
                    }
                    if (this.f29485f == null) {
                        ThreadPoolExecutor c5 = androidx.emoji2.text.d.c("emojiCompat");
                        this.f29486g = c5;
                        this.f29485f = c5;
                    }
                    this.f29485f.execute(new Runnable() { // from class: androidx.emoji2.text.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.c.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(@o0 Executor executor) {
            synchronized (this.f29483d) {
                this.f29485f = executor;
            }
        }

        public void h(@q0 d dVar) {
            synchronized (this.f29483d) {
                this.f29487h = dVar;
            }
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static abstract class d {
        public abstract long a();
    }

    public m(@o0 Context context, @o0 androidx.core.provider.g gVar) {
        super(new c(context, gVar, f29476k));
    }

    @o0
    @Deprecated
    public m l(@q0 Handler handler) {
        if (handler == null) {
            return this;
        }
        m(androidx.emoji2.text.d.b(handler));
        return this;
    }

    @o0
    public m m(@o0 Executor executor) {
        ((c) this.f29428a).g(executor);
        return this;
    }

    @o0
    public m n(@q0 d dVar) {
        ((c) this.f29428a).h(dVar);
        return this;
    }

    @c1({c1.a.LIBRARY})
    public m(@o0 Context context, @o0 androidx.core.provider.g gVar, @o0 b bVar) {
        super(new c(context, gVar, bVar));
    }
}
