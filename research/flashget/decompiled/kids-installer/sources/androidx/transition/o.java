package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* compiled from: MatrixUtils.java */
/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    static final Matrix f9941a = new a();

    /* compiled from: MatrixUtils.java */
    static class a extends Matrix {
        a() {
        }

        void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f6, float f7, float f8) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f6, float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f6, float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f6, float f7, float f8) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f6, float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f6, float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i5, float[] fArr2, int i6, int i7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f6, float f7, float f8) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f6, float f7, float f8, float f9) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f6, float f7, float f8, float f9) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f6, float f7, float f8, float f9) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f6, float f7) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f6) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f6) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f6, float f7) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f6) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f6, float f7) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f6, float f7) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f6, float f7) {
            a();
        }
    }

    private o() {
    }
}
