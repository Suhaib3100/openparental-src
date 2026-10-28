package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LottieRelativePointValueCallback.java */
/* loaded from: classes3.dex */
public class i extends j<PointF> {

    /* renamed from: d, reason: collision with root package name */
    private final PointF f39431d;

    public i() {
        this.f39431d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t4 = this.f39434c;
        if (t4 != 0) {
            return (PointF) t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("˿"));
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f39431d.set(com.airbnb.lottie.utils.i.k(bVar.g().x, bVar.b().x, bVar.c()), com.airbnb.lottie.utils.i.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF e4 = e(bVar);
        this.f39431d.offset(e4.x, e4.y);
        return this.f39431d;
    }

    public i(@o0 PointF pointF) {
        super(pointF);
        this.f39431d = new PointF();
    }
}
