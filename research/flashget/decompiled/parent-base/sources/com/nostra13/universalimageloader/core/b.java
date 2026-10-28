package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DisplayBitmapTask.java */
/* loaded from: classes6.dex */
final class b implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    private static final String f70285j = ProtectedSandApp.s("ᩙ\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f70286k = ProtectedSandApp.s("ᩘ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f70287l = ProtectedSandApp.s("ᩗ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f70288b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70289c;

    /* renamed from: d, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.imageaware.a f70290d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70291e;

    /* renamed from: f, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.display.a f70292f;

    /* renamed from: g, reason: collision with root package name */
    private final pb.a f70293g;

    /* renamed from: h, reason: collision with root package name */
    private final f f70294h;

    /* renamed from: i, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.assist.f f70295i;

    public b(Bitmap bitmap, g gVar, f fVar, com.nostra13.universalimageloader.core.assist.f fVar2) {
        this.f70288b = bitmap;
        this.f70289c = gVar.f70462a;
        this.f70290d = gVar.f70464c;
        this.f70291e = gVar.f70463b;
        this.f70292f = gVar.f70466e.w();
        this.f70293g = gVar.f70467f;
        this.f70294h = fVar;
        this.f70295i = fVar2;
    }

    private boolean a() {
        return !this.f70291e.equals(this.f70294h.i(this.f70290d));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f70290d.d()) {
            com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("ᩗ\u0001"), this.f70291e);
            this.f70293g.d(this.f70289c, this.f70290d.b());
        } else if (a()) {
            com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("ᩘ\u0001"), this.f70291e);
            this.f70293g.d(this.f70289c, this.f70290d.b());
        } else {
            com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("ᩙ\u0001"), this.f70295i, this.f70291e);
            this.f70292f.a(this.f70288b, this.f70290d, this.f70295i);
            this.f70294h.e(this.f70290d);
            this.f70293g.c(this.f70289c, this.f70290d.b(), this.f70288b);
        }
    }
}
