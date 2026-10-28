package com.lxj.xpopup.util;

import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.File;

/* compiled from: SSIVListener.java */
/* loaded from: classes5.dex */
public class d implements SubsamplingScaleImageView.OnImageEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SubsamplingScaleImageView f21317a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f21318b;

    /* renamed from: c, reason: collision with root package name */
    private final File f21319c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21320d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21321e;

    public d(SubsamplingScaleImageView ssiv, ProgressBar progressBar, int errorImage, boolean longImage, File resource) {
        this.f21317a = ssiv;
        this.f21318b = progressBar;
        this.f21320d = errorImage;
        this.f21321e = longImage;
        this.f21319c = resource;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(Exception e6) {
        Bitmap u5 = h.u(this.f21319c, this.f21317a.getMeasuredWidth(), this.f21317a.getMeasuredHeight());
        this.f21317a.setImage(u5 == null ? ImageSource.resource(this.f21320d) : ImageSource.bitmap(u5));
        this.f21318b.setVisibility(4);
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded() {
        this.f21318b.setVisibility(4);
        if (this.f21321e) {
            this.f21317a.setMinimumScaleType(4);
        } else {
            this.f21317a.setMinimumScaleType(1);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(Exception e6) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(Exception e6) {
    }
}
