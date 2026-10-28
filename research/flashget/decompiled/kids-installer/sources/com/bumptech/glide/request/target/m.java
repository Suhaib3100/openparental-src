package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: PreloadTarget.java */
/* loaded from: classes4.dex */
public final class m<Z> extends e<Z> {

    /* renamed from: s, reason: collision with root package name */
    private static final int f12084s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final Handler f12085t = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: r, reason: collision with root package name */
    private final com.bumptech.glide.l f12086r;

    /* compiled from: PreloadTarget.java */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).c();
            return true;
        }
    }

    private m(com.bumptech.glide.l lVar, int i5, int i6) {
        super(i5, i6);
        this.f12086r = lVar;
    }

    public static <Z> m<Z> d(com.bumptech.glide.l lVar, int i5, int i6) {
        return new m<>(lVar, i5, i6);
    }

    @Override // com.bumptech.glide.request.target.p
    public void b(@o0 Z z5, @q0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        f12085t.obtainMessage(1, this).sendToTarget();
    }

    void c() {
        this.f12086r.z(this);
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@q0 Drawable drawable) {
    }
}
