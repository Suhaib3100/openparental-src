package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ProcessAndDisplayImageTask.java */
/* loaded from: classes6.dex */
final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final String f70503f = ProtectedSandApp.s("ᪧ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final f f70504b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap f70505c;

    /* renamed from: d, reason: collision with root package name */
    private final g f70506d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f70507e;

    public i(f fVar, Bitmap bitmap, g gVar, Handler handler) {
        this.f70504b = fVar;
        this.f70505c = bitmap;
        this.f70506d = gVar;
        this.f70507e = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("ᪧ\u0001"), this.f70506d.f70463b);
        h.t(new b(this.f70506d.f70466e.D().a(this.f70505c), this.f70506d, this.f70504b, com.nostra13.universalimageloader.core.assist.f.MEMORY_CACHE), this.f70506d.f70466e.J(), this.f70507e, this.f70504b);
    }
}
