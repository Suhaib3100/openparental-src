package com.luck.picture.lib.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class PictureImageGridAdapter extends RecyclerView.h<BaseRecyclerMediaHolder> {
    public static final int ADAPTER_TYPE_AUDIO = 4;
    public static final int ADAPTER_TYPE_CAMERA = 1;
    public static final int ADAPTER_TYPE_IMAGE = 2;
    public static final int ADAPTER_TYPE_VIDEO = 3;
    private boolean isDisplayCamera;
    private OnItemClickListener listener;
    private final SelectorConfig mConfig;
    private final Context mContext;
    private ArrayList<LocalMedia> mData = new ArrayList<>();

    public interface OnItemClickListener {
        void onItemClick(View view, int i4, LocalMedia localMedia);

        void onItemLongClick(View view, int i4);

        int onSelected(View view, int i4, LocalMedia localMedia);

        void openCameraClick();
    }

    public PictureImageGridAdapter(Context context, SelectorConfig selectorConfig) {
        this.mConfig = selectorConfig;
        this.mContext = context;
    }

    private int getItemResourceId(int i4) {
        if (i4 == 1) {
            return R.layout.ps_item_grid_camera;
        }
        if (i4 == 3) {
            int layoutResource = InjectResourceSource.getLayoutResource(this.mContext, 4, this.mConfig);
            return layoutResource != 0 ? layoutResource : R.layout.ps_item_grid_video;
        }
        if (i4 != 4) {
            int layoutResource2 = InjectResourceSource.getLayoutResource(this.mContext, 3, this.mConfig);
            return layoutResource2 != 0 ? layoutResource2 : R.layout.ps_item_grid_image;
        }
        int layoutResource3 = InjectResourceSource.getLayoutResource(this.mContext, 5, this.mConfig);
        return layoutResource3 != 0 ? layoutResource3 : R.layout.ps_item_grid_audio;
    }

    public ArrayList<LocalMedia> getData() {
        return this.mData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.isDisplayCamera ? this.mData.size() + 1 : this.mData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        boolean z4 = this.isDisplayCamera;
        if (z4 && i4 == 0) {
            return 1;
        }
        if (z4) {
            i4--;
        }
        String mimeType = this.mData.get(i4).getMimeType();
        if (PictureMimeType.isHasVideo(mimeType)) {
            return 3;
        }
        return PictureMimeType.isHasAudio(mimeType) ? 4 : 2;
    }

    public boolean isDataEmpty() {
        return this.mData.size() == 0;
    }

    public boolean isDisplayCamera() {
        return this.isDisplayCamera;
    }

    public void notifyItemPositionChanged(int i4) {
        notifyItemChanged(i4);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setDataAndDataSetChanged(ArrayList<LocalMedia> arrayList) {
        if (arrayList != null) {
            this.mData = arrayList;
            notifyDataSetChanged();
        }
    }

    public void setDisplayCamera(boolean z4) {
        this.isDisplayCamera = z4;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(BaseRecyclerMediaHolder baseRecyclerMediaHolder, int i4) {
        if (getItemViewType(i4) == 1) {
            baseRecyclerMediaHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.adapter.PictureImageGridAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PictureImageGridAdapter.this.listener != null) {
                        PictureImageGridAdapter.this.listener.openCameraClick();
                    }
                }
            });
            return;
        }
        if (this.isDisplayCamera) {
            i4--;
        }
        baseRecyclerMediaHolder.bindData(this.mData.get(i4), i4);
        baseRecyclerMediaHolder.setOnItemClickListener(this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    public BaseRecyclerMediaHolder onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        return BaseRecyclerMediaHolder.generate(viewGroup, i4, getItemResourceId(i4), this.mConfig);
    }
}
