package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ImageViewTargetFactory.java */
/* loaded from: classes.dex */
public class k {
    @o0
    public <Z> r<ImageView, Z> a(@o0 ImageView imageView, @o0 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new g(imageView);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("Ț") + cls + ProtectedSandApp.s("ț"));
    }
}
