package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: RenderScriptBlur.java */
@Deprecated
/* loaded from: classes7.dex */
public class j implements a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f73811b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f73812c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f73813d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f73810a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f73814e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f73815f = -1;

    @x0(api = 17)
    public j(@o0 Context context) {
        RenderScript create = RenderScript.create(context);
        this.f73811b = create;
        this.f73812c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(@o0 Bitmap bitmap) {
        return bitmap.getHeight() == this.f73815f && bitmap.getWidth() == this.f73814e;
    }

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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f73810a);
    }

    @Override // eightbitlab.com.blurview.a
    public float d() {
        return 6.0f;
    }

    @Override // eightbitlab.com.blurview.a
    public final void destroy() {
        this.f73812c.destroy();
        this.f73811b.destroy();
        Allocation allocation = this.f73813d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // eightbitlab.com.blurview.a
    @x0(api = 17)
    public Bitmap e(@o0 Bitmap bitmap, float f4) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f73811b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f73813d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f73813d = Allocation.createTyped(this.f73811b, createFromBitmap.getType());
            this.f73814e = bitmap.getWidth();
            this.f73815f = bitmap.getHeight();
        }
        this.f73812c.setRadius(f4);
        this.f73812c.setInput(createFromBitmap);
        this.f73812c.forEach(this.f73813d);
        this.f73813d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
