package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: HandlerPoster.java */
/* loaded from: classes6.dex */
public class e extends Handler implements k {

    /* renamed from: o, reason: collision with root package name */
    private final j f32170o;

    /* renamed from: p, reason: collision with root package name */
    private final int f32171p;

    /* renamed from: q, reason: collision with root package name */
    private final c f32172q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f32173r;

    public e(c cVar, Looper looper, int i5) {
        super(looper);
        this.f32172q = cVar;
        this.f32171p = i5;
        this.f32170o = new j();
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        i a6 = i.a(pVar, obj);
        synchronized (this) {
            this.f32170o.a(a6);
            if (!this.f32173r) {
                this.f32173r = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b6 = this.f32170o.b();
                if (b6 == null) {
                    synchronized (this) {
                        b6 = this.f32170o.b();
                        if (b6 == null) {
                            return;
                        }
                    }
                }
                this.f32172q.l(b6);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f32171p);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f32173r = true;
        } finally {
            this.f32173r = false;
        }
    }
}
