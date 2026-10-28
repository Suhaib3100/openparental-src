package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes7.dex */
public final class r extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private int f71959a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71960b;

    /* renamed from: c, reason: collision with root package name */
    private final a f71961c;

    public interface a {
        void onTimeout();
    }

    public r(Looper looper, a aVar) {
        super(looper);
        this.f71960b = false;
        this.f71961c = aVar;
    }

    public final synchronized void a(int i4) {
        a();
        this.f71959a = i4;
        this.f71960b = true;
        sendEmptyMessageDelayed(0, 0L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this) {
            try {
                if (this.f71960b) {
                    removeMessages(0);
                    sendEmptyMessageDelayed(0, this.f71959a);
                    a aVar = this.f71961c;
                    if (aVar != null) {
                        aVar.onTimeout();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a() {
        while (hasMessages(0)) {
            try {
                removeMessages(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f71960b = false;
    }
}
