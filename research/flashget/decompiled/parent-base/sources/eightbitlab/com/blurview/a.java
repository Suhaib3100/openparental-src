package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.annotation.o0;

/* compiled from: BlurAlgorithm.java */
/* loaded from: classes7.dex */
public interface a {
    @o0
    Bitmap.Config a();

    boolean b();

    void c(@o0 Canvas canvas, @o0 Bitmap bitmap);

    float d();

    void destroy();

    Bitmap e(@o0 Bitmap bitmap, @o0 float f4);
}
