package com.luck.picture.lib.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class PicturePreviewAdapter extends RecyclerView.h<BasePreviewHolder> {
    private List<LocalMedia> mData;
    private final LinkedHashMap<Integer, BasePreviewHolder> mHolderCache;
    private BasePreviewHolder.OnPreviewEventListener onPreviewEventListener;
    private final SelectorConfig selectorConfig;

    public PicturePreviewAdapter() {
        this(SelectorProviders.getInstance().getSelectorConfig());
    }

    public void destroy() {
        Iterator<Integer> it = this.mHolderCache.keySet().iterator();
        while (it.hasNext()) {
            BasePreviewHolder basePreviewHolder = this.mHolderCache.get(it.next());
            if (basePreviewHolder != null) {
                basePreviewHolder.release();
            }
        }
    }

    public BasePreviewHolder getCurrentHolder(int i4) {
        return this.mHolderCache.get(Integer.valueOf(i4));
    }

    public LocalMedia getItem(int i4) {
        if (i4 > this.mData.size()) {
            return null;
        }
        return this.mData.get(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<LocalMedia> list = this.mData;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        if (PictureMimeType.isHasVideo(this.mData.get(i4).getMimeType())) {
            return 2;
        }
        return PictureMimeType.isHasAudio(this.mData.get(i4).getMimeType()) ? 3 : 1;
    }

    public boolean isPlaying(int i4) {
        BasePreviewHolder currentHolder = getCurrentHolder(i4);
        return currentHolder != null && currentHolder.isPlaying();
    }

    public void setCoverScaleType(int i4) {
        BasePreviewHolder currentHolder = getCurrentHolder(i4);
        if (currentHolder != null) {
            LocalMedia item = getItem(i4);
            if (item.getWidth() == 0 && item.getHeight() == 0) {
                currentHolder.coverImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                currentHolder.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    public void setData(List<LocalMedia> list) {
        this.mData = list;
    }

    public void setOnPreviewEventListener(BasePreviewHolder.OnPreviewEventListener onPreviewEventListener) {
        this.onPreviewEventListener = onPreviewEventListener;
    }

    public void setVideoPlayButtonUI(int i4) {
        BasePreviewHolder currentHolder = getCurrentHolder(i4);
        if (currentHolder instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) currentHolder;
            if (previewVideoHolder.isPlaying()) {
                return;
            }
            previewVideoHolder.ivPlayButton.setVisibility(0);
        }
    }

    public void startAutoVideoPlay(int i4) {
        BasePreviewHolder currentHolder = getCurrentHolder(i4);
        if (currentHolder instanceof PreviewVideoHolder) {
            ((PreviewVideoHolder) currentHolder).startPlay();
        }
    }

    public PicturePreviewAdapter(SelectorConfig selectorConfig) {
        this.mHolderCache = new LinkedHashMap<>();
        this.selectorConfig = selectorConfig;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@o0 BasePreviewHolder basePreviewHolder, int i4) {
        basePreviewHolder.setOnPreviewEventListener(this.onPreviewEventListener);
        LocalMedia item = getItem(i4);
        this.mHolderCache.put(Integer.valueOf(i4), basePreviewHolder);
        basePreviewHolder.bindData(item, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    public BasePreviewHolder onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        if (i4 == 2) {
            int layoutResource = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 8, this.selectorConfig);
            if (layoutResource == 0) {
                layoutResource = R.layout.ps_preview_video;
            }
            return BasePreviewHolder.generate(viewGroup, i4, layoutResource);
        }
        if (i4 == 3) {
            int layoutResource2 = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 10, this.selectorConfig);
            if (layoutResource2 == 0) {
                layoutResource2 = R.layout.ps_preview_audio;
            }
            return BasePreviewHolder.generate(viewGroup, i4, layoutResource2);
        }
        int layoutResource3 = InjectResourceSource.getLayoutResource(viewGroup.getContext(), 7, this.selectorConfig);
        if (layoutResource3 == 0) {
            layoutResource3 = R.layout.ps_preview_image;
        }
        return BasePreviewHolder.generate(viewGroup, i4, layoutResource3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@o0 BasePreviewHolder basePreviewHolder) {
        super.onViewAttachedToWindow((PicturePreviewAdapter) basePreviewHolder);
        basePreviewHolder.onViewAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@o0 BasePreviewHolder basePreviewHolder) {
        super.onViewDetachedFromWindow((PicturePreviewAdapter) basePreviewHolder);
        basePreviewHolder.onViewDetachedFromWindow();
    }
}
