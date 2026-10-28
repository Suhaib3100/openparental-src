package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: PreloadTarget.java */
/* loaded from: classes3.dex */
public final class m<Z> extends e<Z> {

    /* renamed from: f, reason: collision with root package name */
    private static final int f44890f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f44891g = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.n f44892e;

    /* compiled from: PreloadTarget.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).b();
            return true;
        }
    }

    private m(com.bumptech.glide.n nVar, int i4, int i5) {
        super(i4, i5);
        this.f44892e = nVar;
    }

    public static <Z> m<Z> c(com.bumptech.glide.n nVar, int i4, int i5) {
        return new m<>(nVar, i4, i5);
    }

    void b() {
        this.f44892e.y(this);
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void j(@o0 Z z4, @q0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        com.bumptech.glide.request.e h4 = h();
        if (h4 == null || !h4.isComplete()) {
            return;
        }
        f44891g.obtainMessage(1, this).sendToTarget();
    }
}
