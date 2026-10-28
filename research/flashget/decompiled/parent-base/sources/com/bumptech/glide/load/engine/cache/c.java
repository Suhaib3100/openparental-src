package com.bumptech.glide.load.engine.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f43931a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f43932b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f43933a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f43934b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    private static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f43935b = 10;

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f43936a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f43936a) {
                poll = this.f43936a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.f43936a) {
                try {
                    if (this.f43936a.size() < 10) {
                        this.f43936a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.f43931a.get(str);
                if (aVar == null) {
                    aVar = this.f43932b.a();
                    this.f43931a.put(str, aVar);
                }
                aVar.f43934b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f43933a.lock();
    }

    void b(String str) {
        a aVar;
        String s4 = ProtectedSandApp.s("ࣄ");
        String s5 = ProtectedSandApp.s("ࣅ");
        synchronized (this) {
            try {
                aVar = (a) com.bumptech.glide.util.m.f(this.f43931a.get(str), ProtectedSandApp.s("ࣆ"));
                int i4 = aVar.f43934b;
                if (i4 < 1) {
                    throw new IllegalStateException(s5 + str + ProtectedSandApp.s("ࣉ") + aVar.f43934b);
                }
                int i5 = i4 - 1;
                aVar.f43934b = i5;
                if (i5 == 0) {
                    a remove = this.f43931a.remove(str);
                    if (!remove.equals(aVar)) {
                        throw new IllegalStateException(s4 + aVar + ProtectedSandApp.s("ࣇ") + remove + ProtectedSandApp.s("ࣈ") + str);
                    }
                    this.f43932b.b(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f43933a.unlock();
    }
}
