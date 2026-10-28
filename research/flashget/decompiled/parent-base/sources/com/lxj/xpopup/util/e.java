package com.lxj.xpopup.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.i;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.lxj.xpopup.core.ImageViewerPopupView;
import com.lxj.xpopup.photoview.PhotoView;
import gb.k;
import java.io.File;

/* compiled from: SmartGlideImageLoader.java */
/* loaded from: classes6.dex */
public class e implements k {

    /* renamed from: a, reason: collision with root package name */
    private int f69799a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f69800b;

    /* compiled from: SmartGlideImageLoader.java */
    class a extends com.lxj.xpopup.util.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ProgressBar f69801e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f69802f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f69803g;

        a(final ProgressBar val$context, final View val$imageView, final Context val$progressBar) {
            this.f69801e = val$context;
            this.f69802f = val$imageView;
            this.f69803g = val$progressBar;
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        /* renamed from: b */
        public void j(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
            boolean z4;
            int t4 = com.lxj.xpopup.util.h.t(this.f69803g) * 2;
            int A = com.lxj.xpopup.util.h.A(this.f69803g) * 2;
            int[] w4 = com.lxj.xpopup.util.h.w(resource);
            int z5 = com.lxj.xpopup.util.h.z(resource.getAbsolutePath());
            View view = this.f69802f;
            if (view instanceof PhotoView) {
                this.f69801e.setVisibility(8);
                ((PhotoView) this.f69802f).setZoomable(true);
                if (w4[0] > t4 || w4[1] > A) {
                    ((PhotoView) this.f69802f).setImageBitmap(com.lxj.xpopup.util.h.Q(com.lxj.xpopup.util.h.u(resource, t4, A), z5, w4[0] / 2.0f, w4[1] / 2.0f));
                    return;
                } else {
                    com.bumptech.glide.c.G(this.f69802f).e(resource).g(new i().A(e.this.f69799a).F0(w4[0], w4[1])).E1((PhotoView) this.f69802f);
                    return;
                }
            }
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) view;
            if ((w4[1] * 1.0f) / w4[0] > (com.lxj.xpopup.util.h.A(this.f69803g) * 1.0f) / com.lxj.xpopup.util.h.t(this.f69803g)) {
                subsamplingScaleImageView.setMinimumScaleType(4);
                z4 = true;
            } else {
                subsamplingScaleImageView.setMinimumScaleType(1);
                z4 = false;
            }
            int i4 = w4[0] * w4[1];
            if (i4 != 0) {
                int t5 = (com.lxj.xpopup.util.h.t(this.f69803g) * com.lxj.xpopup.util.h.B(this.f69803g)) / i4;
                if (t5 > 0) {
                    subsamplingScaleImageView.setDoubleTapZoomDpi(320 / t5);
                }
            }
            subsamplingScaleImageView.setOrientation(z5);
            subsamplingScaleImageView.setOnImageEventListener(new com.lxj.xpopup.util.d(subsamplingScaleImageView, this.f69801e, e.this.f69799a, z4, resource));
            Bitmap u4 = com.lxj.xpopup.util.h.u(resource, com.lxj.xpopup.util.h.t(this.f69803g), com.lxj.xpopup.util.h.A(this.f69803g));
            subsamplingScaleImageView.setImage(ImageSource.uri(Uri.fromFile(resource)).dimensions(w4[0], w4[1]), u4 != null ? ImageSource.cachedBitmap(u4) : null);
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        public void m(Drawable errorDrawable) {
            this.f69801e.setVisibility(8);
            View view = this.f69802f;
            if (!(view instanceof PhotoView)) {
                ((SubsamplingScaleImageView) view).setImage(ImageSource.resource(e.this.f69799a));
            } else {
                ((PhotoView) view).setImageResource(e.this.f69799a);
                ((PhotoView) this.f69802f).setZoomable(true);
            }
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class b extends SubsamplingScaleImageView.DefaultOnStateChangedListener {
        b() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF newCenter, int origin) {
            super.onCenterChanged(newCenter, origin);
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class c implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f69806b;

        c(final ImageViewerPopupView val$popupView) {
            this.f69806b = val$popupView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v4) {
            this.f69806b.t();
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class d implements View.OnLongClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f69808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f69809c;

        d(final ImageViewerPopupView val$realPosition, final int val$popupView) {
            this.f69808b = val$realPosition;
            this.f69809c = val$popupView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v4) {
            ImageViewerPopupView imageViewerPopupView = this.f69808b;
            imageViewerPopupView.Q1.a(imageViewerPopupView, this.f69809c);
            return false;
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    /* renamed from: com.lxj.xpopup.util.e$e, reason: collision with other inner class name */
    class C0981e implements com.lxj.xpopup.photoview.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PhotoView f69811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PhotoView f69812b;

        C0981e(final PhotoView val$photoView, final PhotoView val$snapshotView) {
            this.f69811a = val$photoView;
            this.f69812b = val$snapshotView;
        }

        @Override // com.lxj.xpopup.photoview.d
        public void onMatrixChanged(RectF rect) {
            if (this.f69811a != null) {
                Matrix matrix = new Matrix();
                this.f69812b.getSuppMatrix(matrix);
                this.f69811a.setSuppMatrix(matrix);
            }
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class f implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f69814b;

        f(final ImageViewerPopupView val$popupView) {
            this.f69814b = val$popupView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v4) {
            this.f69814b.t();
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class g implements View.OnLongClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f69816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f69817c;

        g(final ImageViewerPopupView val$realPosition, final int val$popupView) {
            this.f69816b = val$realPosition;
            this.f69817c = val$popupView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v4) {
            ImageViewerPopupView imageViewerPopupView = this.f69816b;
            imageViewerPopupView.Q1.a(imageViewerPopupView, this.f69817c);
            return false;
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class h extends com.lxj.xpopup.util.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PhotoView f69819e;

        h(final PhotoView val$snapshot) {
            this.f69819e = val$snapshot;
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        /* renamed from: b */
        public void j(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
            int z4 = com.lxj.xpopup.util.h.z(resource.getAbsolutePath());
            int t4 = com.lxj.xpopup.util.h.t(this.f69819e.getContext());
            int A = com.lxj.xpopup.util.h.A(this.f69819e.getContext());
            int[] w4 = com.lxj.xpopup.util.h.w(resource);
            if (w4[0] <= t4 && w4[1] <= A) {
                com.bumptech.glide.c.G(this.f69819e).e(resource).g(new i().F0(w4[0], w4[1])).E1(this.f69819e);
            } else {
                this.f69819e.setImageBitmap(com.lxj.xpopup.util.h.Q(com.lxj.xpopup.util.h.u(resource, t4, A), z4, w4[0] / 2.0f, w4[1] / 2.0f));
            }
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        public void m(Drawable errorDrawable) {
        }
    }

    public e() {
    }

    private SubsamplingScaleImageView e(final ImageViewerPopupView popupView, ProgressBar progressBar, final int realPosition) {
        SubsamplingScaleImageView subsamplingScaleImageView = new SubsamplingScaleImageView(popupView.getContext());
        subsamplingScaleImageView.setMinimumDpi(1);
        subsamplingScaleImageView.setMaximumDpi(320);
        subsamplingScaleImageView.setDoubleTapZoomDuration(250);
        subsamplingScaleImageView.setDoubleTapZoomStyle(2);
        subsamplingScaleImageView.setOnStateChangedListener(new b());
        subsamplingScaleImageView.setOnClickListener(new c(popupView));
        if (popupView.Q1 != null) {
            subsamplingScaleImageView.setOnLongClickListener(new d(popupView, realPosition));
        }
        return subsamplingScaleImageView;
    }

    private PhotoView f(final ImageViewerPopupView popupView, final PhotoView snapshotView, final int realPosition) {
        PhotoView photoView = new PhotoView(popupView.getContext(), null);
        photoView.setZoomable(false);
        photoView.f(new C0981e(snapshotView, photoView));
        photoView.setOnClickListener(new f(popupView));
        if (popupView.Q1 != null) {
            photoView.setOnLongClickListener(new g(popupView, realPosition));
        }
        return photoView;
    }

    @Override // gb.k
    public void a(@o0 Object uri, @o0 final PhotoView snapshot, @q0 final ImageView srcView) {
        if (!this.f69800b) {
            com.bumptech.glide.c.G(snapshot).n(uri).E0(Integer.MIN_VALUE).E1(snapshot);
            return;
        }
        if (srcView != null && srcView.getDrawable() != null) {
            try {
                snapshot.setImageDrawable(srcView.getDrawable().getConstantState().newDrawable());
            } catch (Exception unused) {
            }
        }
        com.bumptech.glide.c.G(snapshot).C().n(uri).z1(new h(snapshot));
    }

    @Override // gb.k
    public View b(final int position, @o0 final Object url, @o0 ImageViewerPopupView popupView, @q0 final PhotoView snapshot, @o0 final ProgressBar progressBar) {
        progressBar.setVisibility(0);
        View e4 = this.f69800b ? e(popupView, progressBar, position) : f(popupView, snapshot, position);
        Context context = e4.getContext();
        if (snapshot != null && snapshot.getDrawable() != null && ((Integer) snapshot.getTag()).intValue() == position) {
            if (e4 instanceof PhotoView) {
                try {
                    ((PhotoView) e4).setImageDrawable(snapshot.getDrawable().getConstantState().newDrawable());
                } catch (Exception unused) {
                }
            } else {
                ((SubsamplingScaleImageView) e4).setImage(ImageSource.bitmap(com.lxj.xpopup.util.h.W(snapshot)));
            }
        }
        com.bumptech.glide.c.G(e4).C().n(url).z1(new a(progressBar, e4, context));
        return e4;
    }

    @Override // gb.k
    public File c(@o0 Context context, @o0 Object uri) {
        try {
            return com.bumptech.glide.c.F(context).C().n(uri).W1().get();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public e(int errImgRes) {
        this.f69799a = errImgRes;
    }

    public e(boolean bigImage, int errImgRes) {
        this(errImgRes);
        this.f69800b = bigImage;
    }
}
