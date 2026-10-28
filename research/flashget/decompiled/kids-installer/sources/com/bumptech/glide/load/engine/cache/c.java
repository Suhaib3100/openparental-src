package com.bumptech.glide.load.engine.cache;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f11223a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f11224b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f11225a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f11226b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    private static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f11227b = 10;

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f11228a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f11228a) {
                poll = this.f11228a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.f11228a) {
                if (this.f11228a.size() < 10) {
                    this.f11228a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f11223a.get(str);
            if (aVar == null) {
                aVar = this.f11224b.a();
                this.f11223a.put(str, aVar);
            }
            aVar.f11226b++;
        }
        aVar.f11225a.lock();
    }

    void b(String str) {
        a aVar;
        String s5 = ProtectedSandApp.s("Ģ");
        String s6 = ProtectedSandApp.s("ģ");
        synchronized (this) {
            aVar = (a) com.bumptech.glide.util.l.d(this.f11223a.get(str));
            int i5 = aVar.f11226b;
            if (i5 < 1) {
                throw new IllegalStateException(s6 + str + ProtectedSandApp.s("Ħ") + aVar.f11226b);
            }
            int i6 = i5 - 1;
            aVar.f11226b = i6;
            if (i6 == 0) {
                a remove = this.f11223a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException(s5 + aVar + ProtectedSandApp.s("Ĥ") + remove + ProtectedSandApp.s("ĥ") + str);
                }
                this.f11224b.b(remove);
            }
        }
        aVar.f11225a.unlock();
    }
}
