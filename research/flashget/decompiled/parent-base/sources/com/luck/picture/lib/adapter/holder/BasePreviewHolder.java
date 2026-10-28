package com.luck.picture.lib.adapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.PhotoView;
import com.luck.picture.lib.utils.BitmapUtils;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.MediaUtils;

/* loaded from: classes6.dex */
public abstract class BasePreviewHolder extends RecyclerView.e0 {
    public static final int ADAPTER_TYPE_AUDIO = 3;
    public static final int ADAPTER_TYPE_IMAGE = 1;
    public static final int ADAPTER_TYPE_VIDEO = 2;
    public PhotoView coverImageView;
    protected OnPreviewEventListener mPreviewEventListener;
    protected LocalMedia media;
    protected final int screenAppInHeight;
    protected final int screenHeight;
    protected final int screenWidth;
    protected final SelectorConfig selectorConfig;

    public interface OnPreviewEventListener {
        void onBackPressed();

        void onLongPressDownload(LocalMedia localMedia);

        void onPreviewVideoTitle(String str);
    }

    public BasePreviewHolder(@o0 View view) {
        super(view);
        this.selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
        this.screenWidth = DensityUtil.getRealScreenWidth(view.getContext());
        this.screenHeight = DensityUtil.getScreenHeight(view.getContext());
        this.screenAppInHeight = DensityUtil.getRealScreenHeight(view.getContext());
        this.coverImageView = (PhotoView) view.findViewById(R.id.preview_image);
        findViews(view);
    }

    public static BasePreviewHolder generate(ViewGroup viewGroup, int i4, int i5) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i5, viewGroup, false);
        return i4 == 2 ? new PreviewVideoHolder(inflate) : i4 == 3 ? new PreviewAudioHolder(inflate) : new PreviewImageHolder(inflate);
    }

    public void bindData(LocalMedia localMedia, int i4) {
        this.media = localMedia;
        int[] realSizeFromMedia = getRealSizeFromMedia(localMedia);
        int[] maxImageSize = BitmapUtils.getMaxImageSize(realSizeFromMedia[0], realSizeFromMedia[1]);
        loadImage(localMedia, maxImageSize[0], maxImageSize[1]);
        setScaleDisplaySize(localMedia);
        setCoverScaleType(localMedia);
        onClickBackPressed();
        onLongPressDownload(localMedia);
    }

    protected abstract void findViews(View view);

    protected int[] getRealSizeFromMedia(LocalMedia localMedia) {
        return (!localMedia.isCut() || localMedia.getCropImageWidth() <= 0 || localMedia.getCropImageHeight() <= 0) ? new int[]{localMedia.getWidth(), localMedia.getHeight()} : new int[]{localMedia.getCropImageWidth(), localMedia.getCropImageHeight()};
    }

    public boolean isPlaying() {
        return false;
    }

    protected abstract void loadImage(LocalMedia localMedia, int i4, int i5);

    protected abstract void onClickBackPressed();

    protected abstract void onLongPressDownload(LocalMedia localMedia);

    public void onViewAttachedToWindow() {
    }

    public void onViewDetachedFromWindow() {
    }

    public void release() {
    }

    public void resumePausePlay() {
    }

    protected void setCoverScaleType(LocalMedia localMedia) {
        if (MediaUtils.isLongImage(localMedia.getWidth(), localMedia.getHeight())) {
            this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.coverImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setOnPreviewEventListener(OnPreviewEventListener onPreviewEventListener) {
        this.mPreviewEventListener = onPreviewEventListener;
    }

    protected void setScaleDisplaySize(LocalMedia localMedia) {
        if (this.selectorConfig.isPreviewZoomEffect || this.screenWidth >= this.screenHeight || localMedia.getWidth() <= 0 || localMedia.getHeight() <= 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.coverImageView.getLayoutParams();
        layoutParams.width = this.screenWidth;
        layoutParams.height = this.screenAppInHeight;
        layoutParams.gravity = 17;
    }
}
