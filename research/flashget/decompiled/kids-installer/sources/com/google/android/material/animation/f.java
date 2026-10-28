package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes2.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f12787a;

    public f() {
        super(Matrix.class, ProtectedSandApp.s("ᇻ"));
        this.f12787a = new Matrix();
    }

    @Override // android.util.Property
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@o0 ImageView imageView) {
        this.f12787a.set(imageView.getImageMatrix());
        return this.f12787a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@o0 ImageView imageView, @o0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
