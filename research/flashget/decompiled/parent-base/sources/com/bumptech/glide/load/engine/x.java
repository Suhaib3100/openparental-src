package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes3.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44227a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f44228b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    private static final class a implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        static final int f44229b = 1;

        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).recycle();
            return true;
        }
    }

    x() {
    }

    synchronized void a(u<?> uVar, boolean z4) {
        try {
            if (!this.f44227a && !z4) {
                this.f44227a = true;
                uVar.recycle();
                this.f44227a = false;
            }
            this.f44228b.obtainMessage(1, uVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
