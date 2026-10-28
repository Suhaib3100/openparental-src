package com.luck.picture.lib.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.l0;
import com.luck.picture.lib.R;
import com.luck.picture.lib.interfaces.OnItemClickListener;
import com.luck.picture.lib.utils.DensityUtil;

/* loaded from: classes6.dex */
public class PhotoItemSelectedDialog extends e implements View.OnClickListener {
    public static final int IMAGE_CAMERA = 0;
    public static final int VIDEO_CAMERA = 1;
    private boolean isCancel = true;
    private OnDismissListener onDismissListener;
    private OnItemClickListener onItemClickListener;

    public interface OnDismissListener {
        void onDismiss(boolean z4, DialogInterface dialogInterface);
    }

    private void initDialogStyle() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(DensityUtil.getRealScreenWidth(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(R.style.PictureThemeDialogFragmentAnim);
    }

    public static PhotoItemSelectedDialog newInstance() {
        return new PhotoItemSelectedDialog();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            if (id2 == R.id.ps_tv_photo) {
                onItemClickListener.onItemClick(view, 0);
                this.isCancel = false;
            } else if (id2 == R.id.ps_tv_video) {
                onItemClickListener.onItemClick(view, 1);
                this.isCancel = false;
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @q0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        return layoutInflater.inflate(R.layout.ps_dialog_camera_selected, viewGroup);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@o0 DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.isCancel, dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        initDialogStyle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.ps_tv_photo);
        TextView textView2 = (TextView) view.findViewById(R.id.ps_tv_video);
        TextView textView3 = (TextView) view.findViewById(R.id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.fragment.app.e
    public void show(FragmentManager fragmentManager, String str) {
        l0 u4 = fragmentManager.u();
        u4.l(this, str);
        u4.s();
    }
}
