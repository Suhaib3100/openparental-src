package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.airbnb.lottie.model.content.p;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* loaded from: classes3.dex */
public class g extends b {
    private final com.airbnb.lottie.animation.content.d H;
    private final c I;

    g(n0 n0Var, e eVar, c cVar) {
        super(n0Var, eVar);
        this.I = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(n0Var, this, new p(ProtectedSandApp.s("Ž"), eVar.n(), false));
        this.H = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        this.H.e(eVar, i4, list, eVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        this.H.f(rectF, this.f39112o, z4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(@o0 Canvas canvas, Matrix matrix, int i4) {
        this.H.h(canvas, matrix, i4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @q0
    public com.airbnb.lottie.model.content.a v() {
        com.airbnb.lottie.model.content.a a5 = this.f39114q.a();
        return a5 != null ? a5 : this.I.v();
    }

    @Override // com.airbnb.lottie.model.layer.b
    @q0
    public com.airbnb.lottie.parser.j x() {
        com.airbnb.lottie.parser.j c5 = this.f39114q.c();
        return c5 != null ? c5 : this.I.x();
    }
}
