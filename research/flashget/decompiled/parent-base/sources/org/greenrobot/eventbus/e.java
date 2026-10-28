package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: HandlerPoster.java */
/* loaded from: classes6.dex */
public class e extends Handler implements k {

    /* renamed from: b, reason: collision with root package name */
    private final j f86843b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86844c;

    /* renamed from: d, reason: collision with root package name */
    private final c f86845d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86846e;

    public e(c cVar, Looper looper, int i4) {
        super(looper);
        this.f86845d = cVar;
        this.f86844c = i4;
        this.f86843b = new j();
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        i a5 = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f86843b.a(a5);
                if (!this.f86846e) {
                    this.f86846e = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b5 = this.f86843b.b();
                if (b5 == null) {
                    synchronized (this) {
                        b5 = this.f86843b.b();
                        if (b5 == null) {
                            this.f86846e = false;
                            return;
                        }
                    }
                }
                this.f86845d.l(b5);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f86844c);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f86846e = true;
        } catch (Throwable th) {
            this.f86846e = false;
            throw th;
        }
    }
}
