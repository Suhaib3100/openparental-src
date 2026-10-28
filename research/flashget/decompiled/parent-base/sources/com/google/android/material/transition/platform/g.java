package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FitModeEvaluators.java */
@x0(21)
/* loaded from: classes6.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f54674a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f54675b = new b();

    /* compiled from: FitModeEvaluators.java */
    static class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f4, float f5, float f6, float f7, float f10, float f11, float f12) {
            float p4 = v.p(f7, f11, f5, f6, f4, true);
            float f13 = p4 / f7;
            float f14 = p4 / f11;
            return new h(f13, f14, p4, f10 * f13, p4, f12 * f14);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f54679d > hVar.f54681f;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f4, h hVar) {
            rectF.bottom -= Math.abs(hVar.f54681f - hVar.f54679d) * f4;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    static class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f4, float f5, float f6, float f7, float f10, float f11, float f12) {
            float p4 = v.p(f10, f12, f5, f6, f4, true);
            float f13 = p4 / f10;
            float f14 = p4 / f12;
            return new h(f13, f14, f7 * f13, p4, f11 * f14, p4);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            return hVar.f54678c > hVar.f54680e;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f4, h hVar) {
            float abs = (Math.abs(hVar.f54680e - hVar.f54678c) / 2.0f) * f4;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    private g() {
    }

    static f a(int i4, boolean z4, RectF rectF, RectF rectF2) {
        if (i4 == 0) {
            return b(z4, rectF, rectF2) ? f54674a : f54675b;
        }
        if (i4 == 1) {
            return f54674a;
        }
        if (i4 == 2) {
            return f54675b;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf291"), i4));
    }

    private static boolean b(boolean z4, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f4 = (height2 * width) / width2;
        float f5 = (width2 * height) / width;
        if (z4) {
            if (f4 < height) {
                return false;
            }
        } else if (f5 < height2) {
            return false;
        }
        return true;
    }
}
