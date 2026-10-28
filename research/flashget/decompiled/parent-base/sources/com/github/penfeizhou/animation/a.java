package com.github.penfeizhou.animation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.loader.d;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: FrameAnimationDrawable.java */
/* loaded from: classes5.dex */
public abstract class a<Decoder extends com.github.penfeizhou.animation.decode.b<?, ?>> extends Drawable implements androidx.vectordrawable.graphics.drawable.b, b.j {

    /* renamed from: m, reason: collision with root package name */
    private static final String f50690m = ProtectedSandApp.s("쑧");

    /* renamed from: n, reason: collision with root package name */
    private static final int f50691n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f50692o = 2;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f50693b;

    /* renamed from: c, reason: collision with root package name */
    private final Decoder f50694c;

    /* renamed from: d, reason: collision with root package name */
    private final DrawFilter f50695d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f50696e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<b.a> f50697f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f50698g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f50699h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f50700i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f50701j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<WeakReference<Drawable.Callback>> f50702k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f50703l;

    /* compiled from: FrameAnimationDrawable.java */
    /* renamed from: com.github.penfeizhou.animation.a$a, reason: collision with other inner class name */
    class HandlerC0777a extends Handler {
        HandlerC0777a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                Iterator it = new ArrayList(a.this.f50697f).iterator();
                while (it.hasNext()) {
                    ((b.a) it.next()).c(a.this);
                }
            } else {
                if (i4 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(a.this.f50697f).iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).b(a.this);
                }
            }
        }
    }

    /* compiled from: FrameAnimationDrawable.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(Decoder decoder) {
        Paint paint = new Paint();
        this.f50693b = paint;
        this.f50695d = new PaintFlagsDrawFilter(0, 3);
        this.f50696e = new Matrix();
        this.f50697f = new HashSet();
        this.f50699h = new HandlerC0777a(Looper.getMainLooper());
        this.f50700i = new b();
        this.f50701j = true;
        this.f50702k = new HashSet();
        this.f50703l = false;
        paint.setAntiAlias(true);
        this.f50694c = decoder;
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        Iterator it = new HashSet(this.f50702k).iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z4 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f50702k.remove((WeakReference) it2.next());
        }
        if (z4) {
            return;
        }
        this.f50702k.add(new WeakReference<>(callback));
    }

    private void k() {
        this.f50694c.p(this);
        if (this.f50701j) {
            this.f50694c.U();
        } else {
            if (this.f50694c.I()) {
                return;
            }
            this.f50694c.U();
        }
    }

    private void l() {
        this.f50694c.O(this);
        if (this.f50701j) {
            this.f50694c.W();
        } else {
            this.f50694c.X();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f50698g;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f50698g = Bitmap.createBitmap(this.f50694c.s().width() / this.f50694c.C(), this.f50694c.s().height() / this.f50694c.C(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f50698g.getByteCount()) {
                return;
            }
            this.f50698g.copyPixelsFromBuffer(byteBuffer);
            this.f50699h.post(this.f50700i);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@o0 b.a aVar) {
        this.f50697f.add(aVar);
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void c() {
        Message.obtain(this.f50699h, 2).sendToTarget();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void d() {
        this.f50697f.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f50698g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f50695d);
        canvas.drawBitmap(this.f50698g, this.f50696e, this.f50693b);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean e(@o0 b.a aVar) {
        return this.f50697f.remove(aVar);
    }

    protected abstract Decoder g(d dVar, b.j jVar);

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f50703l) {
            return -1;
        }
        try {
            return this.f50694c.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f50703l) {
            return -1;
        }
        try {
            return this.f50694c.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Decoder h() {
        return this.f50694c;
    }

    public int i() {
        int z4 = this.f50694c.z();
        Bitmap bitmap = this.f50698g;
        if (bitmap != null && !bitmap.isRecycled()) {
            z4 += this.f50698g.getAllocationByteCount();
        }
        return Math.max(1, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f50702k).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f50694c.I();
    }

    public boolean m() {
        return this.f50694c.H();
    }

    public void n() {
        this.f50694c.K();
    }

    public void o() {
        Bitmap bitmap = this.f50698g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f50698g.eraseColor(0);
        }
        this.f50694c.Q();
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void onStart() {
        Message.obtain(this.f50699h, 1).sendToTarget();
    }

    public void p() {
        this.f50694c.R();
    }

    public void q(boolean z4) {
        this.f50701j = z4;
    }

    public void r(int i4) {
        this.f50694c.T(i4);
    }

    public void s(boolean z4) {
        this.f50703l = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f50693b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, i7);
        int C = this.f50694c.C();
        int S = this.f50694c.S(getBounds().width(), getBounds().height());
        float f4 = S;
        this.f50696e.setScale(((getBounds().width() * 1.0f) * f4) / this.f50694c.s().width(), ((getBounds().height() * 1.0f) * f4) / this.f50694c.s().height());
        if (S != C) {
            this.f50698g = Bitmap.createBitmap(this.f50694c.s().width() / S, this.f50694c.s().height() / S, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f50693b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        j();
        if (this.f50701j) {
            if (z4) {
                if (!isRunning()) {
                    k();
                }
            } else if (isRunning()) {
                l();
            }
        }
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f50694c.I()) {
            this.f50694c.W();
        }
        this.f50694c.Q();
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        l();
    }

    public a(d dVar) {
        Paint paint = new Paint();
        this.f50693b = paint;
        this.f50695d = new PaintFlagsDrawFilter(0, 3);
        this.f50696e = new Matrix();
        this.f50697f = new HashSet();
        this.f50699h = new HandlerC0777a(Looper.getMainLooper());
        this.f50700i = new b();
        this.f50701j = true;
        this.f50702k = new HashSet();
        this.f50703l = false;
        paint.setAntiAlias(true);
        this.f50694c = g(dVar, this);
    }
}
