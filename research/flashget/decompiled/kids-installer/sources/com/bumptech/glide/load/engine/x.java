package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11487a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f11488b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    private static final class a implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        static final int f11489a = 1;

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

    synchronized void a(u<?> uVar, boolean z5) {
        if (!this.f11487a && !z5) {
            this.f11487a = true;
            uVar.recycle();
            this.f11487a = false;
        }
        this.f11488b.obtainMessage(1, uVar).sendToTarget();
    }
}
