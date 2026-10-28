package com.github.penfeizhou.animation.executor;

import android.os.HandlerThread;
import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FrameDecoderExecutor.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static int f50794c = 4;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<HandlerThread> f50795a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f50796b;

    /* compiled from: FrameDecoderExecutor.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f50797a = new a();

        b() {
        }
    }

    public static a b() {
        return b.f50797a;
    }

    public int a() {
        return this.f50796b.getAndIncrement();
    }

    public Looper c(int i4) {
        int i5 = i4 % f50794c;
        if (i5 < this.f50795a.size()) {
            if (this.f50795a.get(i5) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = this.f50795a.get(i5).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread(android.support.v4.media.a.a(ProtectedSandApp.s("쑺"), i5));
        handlerThread.start();
        this.f50795a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    public void d(int i4) {
        f50794c = i4;
    }

    private a() {
        this.f50795a = new ArrayList<>();
        this.f50796b = new AtomicInteger(0);
    }
}
