package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.compose.ui.platform.p4;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: RenderEffectBlur.java */
@x0(31)
/* loaded from: classes7.dex */
public class i implements a {

    /* renamed from: b, reason: collision with root package name */
    private int f73805b;

    /* renamed from: c, reason: collision with root package name */
    private int f73806c;

    /* renamed from: e, reason: collision with root package name */
    @q0
    public a f73808e;

    /* renamed from: f, reason: collision with root package name */
    private Context f73809f;

    /* renamed from: a, reason: collision with root package name */
    private final RenderNode f73804a = p4.a(ProtectedSandApp.s("恁\u0001"));

    /* renamed from: d, reason: collision with root package name */
    private float f73807d = 1.0f;

    @Override // eightbitlab.com.blurview.a
    @o0
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.a
    public boolean b() {
        return true;
    }

    @Override // eightbitlab.com.blurview.a
    public void c(@o0 Canvas canvas, @o0 Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f73804a);
            return;
        }
        if (this.f73808e == null) {
            this.f73808e = new j(this.f73809f);
        }
        this.f73808e.e(bitmap, this.f73807d);
        this.f73808e.c(canvas, bitmap);
    }

    @Override // eightbitlab.com.blurview.a
    public float d() {
        return 6.0f;
    }

    @Override // eightbitlab.com.blurview.a
    public void destroy() {
        this.f73804a.discardDisplayList();
        a aVar = this.f73808e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // eightbitlab.com.blurview.a
    public Bitmap e(@o0 Bitmap bitmap, float f4) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f73807d = f4;
        if (bitmap.getHeight() != this.f73805b || bitmap.getWidth() != this.f73806c) {
            this.f73805b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f73806c = width;
            this.f73804a.setPosition(0, 0, width, this.f73805b);
        }
        beginRecording = this.f73804a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f73804a.endRecording();
        RenderNode renderNode = this.f73804a;
        createBlurEffect = RenderEffect.createBlurEffect(f4, f4, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    void f(@o0 Context context) {
        this.f73809f = context;
    }
}
