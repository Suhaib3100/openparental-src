package com.lxj.xpopup.util;

import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.File;

/* compiled from: SSIVListener.java */
/* loaded from: classes6.dex */
public class d implements SubsamplingScaleImageView.OnImageEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SubsamplingScaleImageView f69794a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f69795b;

    /* renamed from: c, reason: collision with root package name */
    private final File f69796c;

    /* renamed from: d, reason: collision with root package name */
    private final int f69797d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f69798e;

    public d(SubsamplingScaleImageView ssiv, ProgressBar progressBar, int errorImage, boolean longImage, File resource) {
        this.f69794a = ssiv;
        this.f69795b = progressBar;
        this.f69797d = errorImage;
        this.f69798e = longImage;
        this.f69796c = resource;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(Exception e4) {
        Bitmap u4 = h.u(this.f69796c, this.f69794a.getMeasuredWidth(), this.f69794a.getMeasuredHeight());
        this.f69794a.setImage(u4 == null ? ImageSource.resource(this.f69797d) : ImageSource.bitmap(u4));
        this.f69795b.setVisibility(4);
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded() {
        this.f69795b.setVisibility(4);
        if (this.f69798e) {
            this.f69794a.setMinimumScaleType(4);
        } else {
            this.f69794a.setMinimumScaleType(1);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(Exception e4) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(Exception e4) {
    }
}
