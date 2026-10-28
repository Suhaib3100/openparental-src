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
import androidx.recyclerview.widget.o;
import c3.k;
import com.bumptech.glide.request.i;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.lxj.xpopup.core.ImageViewerPopupView;
import com.lxj.xpopup.photoview.PhotoView;
import java.io.File;

/* compiled from: SmartGlideImageLoader.java */
/* loaded from: classes5.dex */
public class e implements k {

    /* renamed from: a, reason: collision with root package name */
    private int f21322a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21323b;

    /* compiled from: SmartGlideImageLoader.java */
    /* loaded from: classes6.dex */
    class a extends com.lxj.xpopup.util.b {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ProgressBar f21324r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f21325s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f21326t;

        a(final ProgressBar val$context, final View val$imageView, final Context val$progressBar) {
            this.f21324r = val$context;
            this.f21325s = val$imageView;
            this.f21326t = val$progressBar;
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        /* renamed from: c */
        public void b(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
            boolean z5;
            int t5 = com.lxj.xpopup.util.h.t(this.f21326t) * 2;
            int A = com.lxj.xpopup.util.h.A(this.f21326t) * 2;
            int[] w5 = com.lxj.xpopup.util.h.w(resource);
            int z6 = com.lxj.xpopup.util.h.z(resource.getAbsolutePath());
            View view = this.f21325s;
            if (view instanceof PhotoView) {
                this.f21324r.setVisibility(8);
                ((PhotoView) this.f21325s).R(true);
                if (w5[0] > t5 || w5[1] > A) {
                    ((PhotoView) this.f21325s).setImageBitmap(com.lxj.xpopup.util.h.Q(com.lxj.xpopup.util.h.u(resource, t5, A), z6, w5[0] / 2.0f, w5[1] / 2.0f));
                    return;
                } else {
                    com.bumptech.glide.b.F(this.f21325s).f(resource).a(new i().B(e.this.f21322a).J0(w5[0], w5[1])).F1((PhotoView) this.f21325s);
                    return;
                }
            }
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) view;
            if ((w5[1] * 1.0f) / w5[0] > (com.lxj.xpopup.util.h.A(this.f21326t) * 1.0f) / com.lxj.xpopup.util.h.t(this.f21326t)) {
                subsamplingScaleImageView.setMinimumScaleType(4);
                z5 = true;
            } else {
                subsamplingScaleImageView.setMinimumScaleType(1);
                z5 = false;
            }
            int i5 = w5[0] * w5[1];
            if (i5 != 0) {
                int t6 = (com.lxj.xpopup.util.h.t(this.f21326t) * com.lxj.xpopup.util.h.B(this.f21326t)) / i5;
                if (t6 > 0) {
                    subsamplingScaleImageView.setDoubleTapZoomDpi(320 / t6);
                }
            }
            subsamplingScaleImageView.setOrientation(z6);
            subsamplingScaleImageView.setOnImageEventListener(new com.lxj.xpopup.util.d(subsamplingScaleImageView, this.f21324r, e.this.f21322a, z5, resource));
            Bitmap u5 = com.lxj.xpopup.util.h.u(resource, com.lxj.xpopup.util.h.t(this.f21326t), com.lxj.xpopup.util.h.A(this.f21326t));
            subsamplingScaleImageView.setImage(ImageSource.uri(Uri.fromFile(resource)).dimensions(w5[0], w5[1]), u5 != null ? ImageSource.cachedBitmap(u5) : null);
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        public void k(Drawable errorDrawable) {
            this.f21324r.setVisibility(8);
            View view = this.f21325s;
            if (!(view instanceof PhotoView)) {
                ((SubsamplingScaleImageView) view).setImage(ImageSource.resource(e.this.f21322a));
            } else {
                ((PhotoView) view).setImageResource(e.this.f21322a);
                ((PhotoView) this.f21325s).R(true);
            }
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    /* loaded from: classes6.dex */
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

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f21329o;

        c(final ImageViewerPopupView val$popupView) {
            this.f21329o = val$popupView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v5) {
            this.f21329o.x();
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class d implements View.OnLongClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f21331o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f21332p;

        d(final ImageViewerPopupView val$realPosition, final int val$popupView) {
            this.f21331o = val$realPosition;
            this.f21332p = val$popupView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v5) {
            ImageViewerPopupView imageViewerPopupView = this.f21331o;
            imageViewerPopupView.f21134i0.a(imageViewerPopupView, this.f21332p);
            return false;
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    /* renamed from: com.lxj.xpopup.util.e$e, reason: collision with other inner class name */
    class C0241e implements com.lxj.xpopup.photoview.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PhotoView f21334a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PhotoView f21335b;

        C0241e(final PhotoView val$photoView, final PhotoView val$snapshotView) {
            this.f21334a = val$photoView;
            this.f21335b = val$snapshotView;
        }

        @Override // com.lxj.xpopup.photoview.d
        public void a(RectF rect) {
            if (this.f21334a != null) {
                Matrix matrix = new Matrix();
                this.f21335b.t(matrix);
                this.f21334a.P(matrix);
            }
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class f implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f21337o;

        f(final ImageViewerPopupView val$popupView) {
            this.f21337o = val$popupView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v5) {
            this.f21337o.x();
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    class g implements View.OnLongClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageViewerPopupView f21339o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f21340p;

        g(final ImageViewerPopupView val$realPosition, final int val$popupView) {
            this.f21339o = val$realPosition;
            this.f21340p = val$popupView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v5) {
            ImageViewerPopupView imageViewerPopupView = this.f21339o;
            imageViewerPopupView.f21134i0.a(imageViewerPopupView, this.f21340p);
            return false;
        }
    }

    /* compiled from: SmartGlideImageLoader.java */
    /* loaded from: classes6.dex */
    class h extends com.lxj.xpopup.util.b {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ PhotoView f21342r;

        h(final PhotoView val$snapshot) {
            this.f21342r = val$snapshot;
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        /* renamed from: c */
        public void b(@o0 File resource, com.bumptech.glide.request.transition.f<? super File> transition) {
            int z5 = com.lxj.xpopup.util.h.z(resource.getAbsolutePath());
            int t5 = com.lxj.xpopup.util.h.t(this.f21342r.getContext());
            int A = com.lxj.xpopup.util.h.A(this.f21342r.getContext());
            int[] w5 = com.lxj.xpopup.util.h.w(resource);
            if (w5[0] <= t5 && w5[1] <= A) {
                com.bumptech.glide.b.F(this.f21342r).f(resource).a(new i().J0(w5[0], w5[1])).F1(this.f21342r);
            } else {
                this.f21342r.setImageBitmap(com.lxj.xpopup.util.h.Q(com.lxj.xpopup.util.h.u(resource, t5, A), z5, w5[0] / 2.0f, w5[1] / 2.0f));
            }
        }

        @Override // com.lxj.xpopup.util.b, com.bumptech.glide.request.target.p
        public void k(Drawable errorDrawable) {
        }
    }

    public e() {
    }

    private SubsamplingScaleImageView e(final ImageViewerPopupView popupView, ProgressBar progressBar, final int realPosition) {
        SubsamplingScaleImageView subsamplingScaleImageView = new SubsamplingScaleImageView(popupView.getContext());
        subsamplingScaleImageView.setMinimumDpi(1);
        subsamplingScaleImageView.setMaximumDpi(320);
        subsamplingScaleImageView.setDoubleTapZoomDuration(o.f.f9513c);
        subsamplingScaleImageView.setDoubleTapZoomStyle(2);
        subsamplingScaleImageView.setOnStateChangedListener(new b());
        subsamplingScaleImageView.setOnClickListener(new c(popupView));
        if (popupView.f21134i0 != null) {
            subsamplingScaleImageView.setOnLongClickListener(new d(popupView, realPosition));
        }
        return subsamplingScaleImageView;
    }

    private PhotoView f(final ImageViewerPopupView popupView, final PhotoView snapshotView, final int realPosition) {
        PhotoView photoView = new PhotoView(popupView.getContext(), null);
        photoView.R(false);
        photoView.C(new C0241e(snapshotView, photoView));
        photoView.setOnClickListener(new f(popupView));
        if (popupView.f21134i0 != null) {
            photoView.setOnLongClickListener(new g(popupView, realPosition));
        }
        return photoView;
    }

    @Override // c3.k
    public void a(@o0 Object uri, @o0 final PhotoView snapshot, @q0 final ImageView srcView) {
        if (!this.f21323b) {
            com.bumptech.glide.b.F(snapshot).l(uri).I0(Integer.MIN_VALUE).F1(snapshot);
            return;
        }
        if (srcView != null && srcView.getDrawable() != null) {
            try {
                snapshot.setImageDrawable(srcView.getDrawable().getConstantState().newDrawable());
            } catch (Exception unused) {
            }
        }
        com.bumptech.glide.b.F(snapshot).B().l(uri).C1(new h(snapshot));
    }

    @Override // c3.k
    public File b(@o0 Context context, @o0 Object uri) {
        try {
            return com.bumptech.glide.b.E(context).B().l(uri).V1().get();
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // c3.k
    public View c(final int position, @o0 final Object url, @o0 ImageViewerPopupView popupView, @q0 final PhotoView snapshot, @o0 final ProgressBar progressBar) {
        progressBar.setVisibility(0);
        View e6 = this.f21323b ? e(popupView, progressBar, position) : f(popupView, snapshot, position);
        Context context = e6.getContext();
        if (snapshot != null && snapshot.getDrawable() != null && ((Integer) snapshot.getTag()).intValue() == position) {
            if (e6 instanceof PhotoView) {
                try {
                    ((PhotoView) e6).setImageDrawable(snapshot.getDrawable().getConstantState().newDrawable());
                } catch (Exception unused) {
                }
            } else {
                ((SubsamplingScaleImageView) e6).setImage(ImageSource.bitmap(com.lxj.xpopup.util.h.W(snapshot)));
            }
        }
        com.bumptech.glide.b.F(e6).B().l(url).C1(new a(progressBar, e6, context));
        return e6;
    }

    public e(int errImgRes) {
        this.f21322a = errImgRes;
    }

    public e(boolean bigImage, int errImgRes) {
        this(errImgRes);
        this.f21323b = bigImage;
    }
}
