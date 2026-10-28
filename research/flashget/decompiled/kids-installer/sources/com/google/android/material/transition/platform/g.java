package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: FitModeEvaluators.java */
@x0(21)
/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f14842a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f14843b = new b();

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
            float p5 = v.p(f9, f11, f7, f8, f6, true);
            float f13 = p5 / f9;
            float f14 = p5 / f11;
            return new h(f13, f14, p5, f10 * f13, p5, f12 * f14);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f14847d > hVar.f14849f;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f6, h hVar) {
            rectF.bottom -= Math.abs(hVar.f14849f - hVar.f14847d) * f6;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
            float p5 = v.p(f10, f12, f7, f8, f6, true);
            float f13 = p5 / f10;
            float f14 = p5 / f12;
            return new h(f13, f14, f9 * f13, p5, f11 * f14, p5);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f14846c > hVar.f14848e;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f6, h hVar) {
            float abs = (Math.abs(hVar.f14848e - hVar.f14846c) / 2.0f) * f6;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    private g() {
    }

    static f a(int i5, boolean z5, RectF rectF, RectF rectF2) {
        if (i5 == 0) {
            return b(z5, rectF, rectF2) ? f14842a : f14843b;
        }
        if (i5 == 1) {
            return f14842a;
        }
        if (i5 == 2) {
            return f14843b;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("ኍ"), i5));
    }

    private static boolean b(boolean z5, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f6 = (height2 * width) / width2;
        float f7 = (width2 * height) / width;
        if (z5) {
            if (f6 >= height) {
                return true;
            }
        } else if (f7 >= height2) {
            return true;
        }
        return false;
    }
}
