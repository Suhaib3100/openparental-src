package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.l0;
import androidx.annotation.q0;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.q;

/* loaded from: classes3.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    private String f40952b;

    /* renamed from: c, reason: collision with root package name */
    private int f40953c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private Drawable f40954d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private Bitmap f40955e;

    /* renamed from: f, reason: collision with root package name */
    private int f40956f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private Drawable f40957g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private Bitmap f40958h;

    /* renamed from: i, reason: collision with root package name */
    private q f40959i;

    /* renamed from: j, reason: collision with root package name */
    private q.g f40960j;

    class a implements q.h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40961b;

        /* renamed from: com.android.volley.toolbox.NetworkImageView$a$a, reason: collision with other inner class name */
        class RunnableC0677a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q.g f40963b;

            RunnableC0677a(q.g gVar) {
                this.f40963b = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f40963b, false);
            }
        }

        a(boolean z4) {
            this.f40961b = z4;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(q.g gVar, boolean z4) {
            if (z4 && this.f40961b) {
                NetworkImageView.this.post(new RunnableC0677a(gVar));
                return;
            }
            if (gVar.d() != null) {
                NetworkImageView.this.setImageBitmap(gVar.d());
                return;
            }
            if (NetworkImageView.this.f40953c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f40953c);
            } else if (NetworkImageView.this.f40954d != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f40954d);
            } else if (NetworkImageView.this.f40955e != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f40955e);
            }
        }

        @Override // com.android.volley.q.a
        public void onErrorResponse(VolleyError volleyError) {
            if (NetworkImageView.this.f40956f != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f40956f);
            } else if (NetworkImageView.this.f40957g != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f40957g);
            } else if (NetworkImageView.this.f40958h != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f40958h);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    private void j() {
        int i4 = this.f40953c;
        if (i4 != 0) {
            setImageResource(i4);
            return;
        }
        Drawable drawable = this.f40954d;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f40955e;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    void g(boolean z4) {
        boolean z5;
        boolean z6;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z5 = getLayoutParams().width == -2;
            z6 = getLayoutParams().height == -2;
        } else {
            z5 = false;
            z6 = false;
        }
        boolean z7 = z5 && z6;
        if (width == 0 && height == 0 && !z7) {
            return;
        }
        if (TextUtils.isEmpty(this.f40952b)) {
            q.g gVar = this.f40960j;
            if (gVar != null) {
                gVar.c();
                this.f40960j = null;
            }
            j();
            return;
        }
        q.g gVar2 = this.f40960j;
        if (gVar2 != null && gVar2.e() != null) {
            if (this.f40960j.e().equals(this.f40952b)) {
                return;
            }
            this.f40960j.c();
            j();
        }
        if (z5) {
            width = 0;
        }
        this.f40960j = this.f40959i.g(this.f40952b, new a(z4), width, z6 ? 0 : height, scaleType);
    }

    public void h(Bitmap bitmap) {
        this.f40953c = 0;
        this.f40954d = null;
        this.f40955e = bitmap;
    }

    public void i(@q0 Drawable drawable) {
        this.f40953c = 0;
        this.f40955e = null;
        this.f40954d = drawable;
    }

    public void k(int i4) {
        this.f40955e = null;
        this.f40954d = null;
        this.f40953c = i4;
    }

    public void l(Bitmap bitmap) {
        this.f40956f = 0;
        this.f40957g = null;
        this.f40958h = bitmap;
    }

    public void m(@q0 Drawable drawable) {
        this.f40956f = 0;
        this.f40958h = null;
        this.f40957g = drawable;
    }

    public void n(int i4) {
        this.f40958h = null;
        this.f40957g = null;
        this.f40956f = i4;
    }

    @l0
    public void o(String str, q qVar) {
        b0.a();
        this.f40952b = str;
        this.f40959i = qVar;
        g(false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        q.g gVar = this.f40960j;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.f40960j = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        g(true);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
