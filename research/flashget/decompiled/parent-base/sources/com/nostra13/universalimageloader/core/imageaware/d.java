package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.assist.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: ViewAware.java */
/* loaded from: classes6.dex */
public abstract class d implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f70511c = ProtectedSandApp.s("᪩\u0001");

    /* renamed from: d, reason: collision with root package name */
    public static final String f70512d = ProtectedSandApp.s("᪪\u0001");

    /* renamed from: a, reason: collision with root package name */
    protected Reference<View> f70513a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f70514b;

    public d(View view) {
        this(view, true);
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int a() {
        View view = this.f70513a.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public View b() {
        return this.f70513a.get();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean c(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f70513a.get();
            if (view != null) {
                h(drawable, view);
                return true;
            }
        } else {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("᪩\u0001"), new Object[0]);
        }
        return false;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean d() {
        return this.f70513a.get() == null;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public h e() {
        return h.CROP;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public boolean f(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f70513a.get();
            if (view != null) {
                g(bitmap, view);
                return true;
            }
        } else {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("᪪\u0001"), new Object[0]);
        }
        return false;
    }

    protected abstract void g(Bitmap bitmap, View view);

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int getHeight() {
        View view = this.f70513a.get();
        int i4 = 0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f70514b && layoutParams != null && layoutParams.height != -2) {
            i4 = view.getHeight();
        }
        return (i4 > 0 || layoutParams == null) ? i4 : layoutParams.height;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.a
    public int getWidth() {
        View view = this.f70513a.get();
        int i4 = 0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f70514b && layoutParams != null && layoutParams.width != -2) {
            i4 = view.getWidth();
        }
        return (i4 > 0 || layoutParams == null) ? i4 : layoutParams.width;
    }

    protected abstract void h(Drawable drawable, View view);

    public d(View view, boolean z4) {
        if (view == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("᪨\u0001"));
        }
        this.f70513a = new WeakReference(view);
        this.f70514b = z4;
    }
}
