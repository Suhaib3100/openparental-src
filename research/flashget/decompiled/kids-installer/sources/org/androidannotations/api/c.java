package org.androidannotations.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UiThreadExecutor.java */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f31762a = new a(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f31763b = new HashMap();

    /* compiled from: UiThreadExecutor.java */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Runnable callback = message.getCallback();
            if (callback == null) {
                super.handleMessage(message);
            } else {
                callback.run();
                c.c((b) message.obj);
            }
        }
    }

    /* compiled from: UiThreadExecutor.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f31764a;

        /* renamed from: b, reason: collision with root package name */
        final String f31765b;

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        private b(String str) {
            this.f31764a = 0;
            this.f31765b = str;
        }
    }

    private c() {
    }

    public static void b(String str) {
        b remove;
        Map<String, b> map = f31763b;
        synchronized (map) {
            remove = map.remove(str);
        }
        if (remove == null) {
            return;
        }
        f31762a.removeCallbacksAndMessages(remove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(b bVar) {
        String str;
        b remove;
        Map<String, b> map = f31763b;
        synchronized (map) {
            int i5 = bVar.f31764a - 1;
            bVar.f31764a = i5;
            if (i5 == 0 && (remove = map.remove((str = bVar.f31765b))) != bVar) {
                map.put(str, remove);
            }
        }
    }

    private static b d(String str) {
        b bVar;
        Map<String, b> map = f31763b;
        synchronized (map) {
            bVar = map.get(str);
            if (bVar == null) {
                bVar = new b(str, null);
                map.put(str, bVar);
            }
            bVar.f31764a++;
        }
        return bVar;
    }

    public static void e(String str, Runnable runnable, long j5) {
        if ("".equals(str)) {
            f31762a.postDelayed(runnable, j5);
        } else {
            f31762a.postAtTime(runnable, d(str), SystemClock.uptimeMillis() + j5);
        }
    }
}
