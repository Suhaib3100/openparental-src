package com.yalantis.ucrop;

import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.d;
import androidx.core.graphics.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes7.dex */
public class UCropGalleryAdapter extends RecyclerView.h<ViewHolder> {
    private int currentSelectPosition;
    private final List<String> list;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int i4, View view);
    }

    public static class ViewHolder extends RecyclerView.e0 {
        ImageView mIvPhoto;
        View mViewCurrentSelect;

        public ViewHolder(View view) {
            super(view);
            this.mIvPhoto = (ImageView) view.findViewById(R.id.iv_photo);
            this.mViewCurrentSelect = view.findViewById(R.id.view_current_select);
        }
    }

    public UCropGalleryAdapter(List<String> list) {
        this.list = list;
    }

    public int getCurrentSelectPosition() {
        return this.currentSelectPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<String> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void setCurrentSelectPosition(int i4) {
        this.currentSelectPosition = i4;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final ViewHolder viewHolder, int i4) {
        ColorFilter a5;
        String str = this.list.get(i4);
        UCropImageEngine uCropImageEngine = UCropDevelopConfig.imageEngine;
        if (uCropImageEngine != null) {
            uCropImageEngine.loadImage(viewHolder.itemView.getContext(), str, viewHolder.mIvPhoto);
        }
        if (this.currentSelectPosition == i4) {
            viewHolder.mViewCurrentSelect.setVisibility(0);
            a5 = d.a(androidx.core.content.d.getColor(viewHolder.itemView.getContext(), R.color.ucrop_color_80), e.SRC_ATOP);
        } else {
            a5 = d.a(androidx.core.content.d.getColor(viewHolder.itemView.getContext(), R.color.ucrop_color_20), e.SRC_ATOP);
            viewHolder.mViewCurrentSelect.setVisibility(8);
        }
        viewHolder.mIvPhoto.setColorFilter(a5);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropGalleryAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UCropGalleryAdapter.this.listener != null) {
                    UCropGalleryAdapter.this.listener.onItemClick(viewHolder.getAbsoluteAdapterPosition(), view);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ucrop_gallery_adapter_item, viewGroup, false));
    }
}
