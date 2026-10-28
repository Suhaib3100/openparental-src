package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.display.d;

/* compiled from: RoundedVignetteBitmapDisplayer.java */
/* loaded from: classes6.dex */
public class e extends d {

    /* compiled from: RoundedVignetteBitmapDisplayer.java */
    protected static class a extends d.a {
        a(Bitmap bitmap, int i4, int i5) {
            super(bitmap, i4, i5);
        }

        @Override // com.nostra13.universalimageloader.core.display.d.a, android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            RadialGradient radialGradient = new RadialGradient(this.f70386c.centerX(), (this.f70386c.centerY() * 1.0f) / 0.7f, 1.3f * this.f70386c.centerX(), new int[]{0, 0, 2130706432}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, 0.7f);
            radialGradient.setLocalMatrix(matrix);
            this.f70389f.setShader(new ComposeShader(this.f70388e, radialGradient, PorterDuff.Mode.SRC_OVER));
        }
    }

    public e(int i4, int i5) {
        super(i4, i5);
    }

    @Override // com.nostra13.universalimageloader.core.display.d, com.nostra13.universalimageloader.core.display.a
    public void a(Bitmap bitmap, com.nostra13.universalimageloader.core.imageaware.a aVar, com.nostra13.universalimageloader.core.assist.f fVar) {
        if (!(aVar instanceof com.nostra13.universalimageloader.core.imageaware.b)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᩴ\u0001"));
        }
        aVar.c(new a(bitmap, this.f70382a, this.f70383b));
    }
}
