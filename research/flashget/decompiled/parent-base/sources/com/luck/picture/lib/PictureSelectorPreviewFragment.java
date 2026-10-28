package com.luck.picture.lib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.adapter.PicturePreviewAdapter;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.basic.IBridgeLoaderFactory;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.basic.PictureMediaScannerConnection;
import com.luck.picture.lib.config.Crop;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.decoration.HorizontalItemDecoration;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.dialog.PictureCommonDialog;
import com.luck.picture.lib.engine.ExtendLoaderEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.MediaExtraInfo;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.interfaces.OnExternalPreviewEventListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.loader.IBridgeMediaLoader;
import com.luck.picture.lib.loader.LocalMediaLoader;
import com.luck.picture.lib.loader.LocalMediaPageLoader;
import com.luck.picture.lib.magical.BuildRecycleItemViewParams;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.OnMagicalViewCallback;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.DownloadFileUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.StyleUtils;
import com.luck.picture.lib.utils.ToastUtils;
import com.luck.picture.lib.utils.ValueOf;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.PreviewBottomNavBar;
import com.luck.picture.lib.widget.PreviewTitleBar;
import com.luck.picture.lib.widget.TitleBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class PictureSelectorPreviewFragment extends PictureCommonFragment {
    public static final String TAG = ProtectedSandApp.s("ᖦ\u0001");
    protected PreviewBottomNavBar bottomNarBar;
    protected CompleteSelectView completeSelectView;
    protected int curPosition;
    protected String currentAlbum;
    protected boolean isAnimationStart;
    protected boolean isDisplayDelete;
    protected boolean isExternalPreview;
    protected boolean isInternalBottomPreview;
    protected boolean isSaveInstanceState;
    protected boolean isShowCamera;
    protected PreviewGalleryAdapter mGalleryAdapter;
    protected RecyclerView mGalleryRecycle;
    protected MagicalView magicalView;
    protected int screenHeight;
    protected int screenWidth;
    protected View selectClickArea;
    protected PreviewTitleBar titleBar;
    protected int totalNum;
    protected TextView tvSelected;
    protected TextView tvSelectedWord;
    protected PicturePreviewAdapter viewPageAdapter;
    protected ViewPager2 viewPager;
    protected ArrayList<LocalMedia> mData = new ArrayList<>();
    protected boolean isHasMore = true;
    protected long mBucketId = -1;
    protected boolean needScaleBig = true;
    protected boolean needScaleSmall = false;
    protected List<View> mAnimViews = new ArrayList();
    private boolean isPause = false;
    private final ViewPager2.j pageChangeCallback = new ViewPager2.j() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.22
        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrolled(int i4, float f4, int i5) {
            if (PictureSelectorPreviewFragment.this.mData.size() > i4) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                int i6 = pictureSelectorPreviewFragment.screenWidth / 2;
                ArrayList<LocalMedia> arrayList = pictureSelectorPreviewFragment.mData;
                if (i5 >= i6) {
                    i4++;
                }
                LocalMedia localMedia = arrayList.get(i4);
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment2.tvSelected.setSelected(pictureSelectorPreviewFragment2.isSelected(localMedia));
                PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                PictureSelectorPreviewFragment.this.notifySelectNumberStyle(localMedia);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.curPosition = i4;
            pictureSelectorPreviewFragment.titleBar.setTitle((PictureSelectorPreviewFragment.this.curPosition + 1) + ProtectedSandApp.s("ᖤ\u0001") + PictureSelectorPreviewFragment.this.totalNum);
            if (PictureSelectorPreviewFragment.this.mData.size() > i4) {
                LocalMedia localMedia = PictureSelectorPreviewFragment.this.mData.get(i4);
                PictureSelectorPreviewFragment.this.notifySelectNumberStyle(localMedia);
                if (PictureSelectorPreviewFragment.this.isHasMagicalEffect()) {
                    PictureSelectorPreviewFragment.this.changeMagicalViewParams(i4);
                }
                if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isPreviewZoomEffect) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment2.isInternalBottomPreview && ((PictureCommonFragment) pictureSelectorPreviewFragment2).selectorConfig.isAutoVideoPlay) {
                        PictureSelectorPreviewFragment.this.startAutoVideoPlay(i4);
                    } else {
                        PictureSelectorPreviewFragment.this.viewPageAdapter.setVideoPlayButtonUI(i4);
                    }
                } else if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isAutoVideoPlay) {
                    PictureSelectorPreviewFragment.this.startAutoVideoPlay(i4);
                }
                PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                PictureSelectorPreviewFragment.this.bottomNarBar.isDisplayEditor(PictureMimeType.isHasVideo(localMedia.getMimeType()) || PictureMimeType.isHasAudio(localMedia.getMimeType()));
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment3.isExternalPreview || pictureSelectorPreviewFragment3.isInternalBottomPreview || ((PictureCommonFragment) pictureSelectorPreviewFragment3).selectorConfig.isOnlySandboxDir || !((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isPageStrategy) {
                    return;
                }
                if (PictureSelectorPreviewFragment.this.isHasMore) {
                    if (i4 == r0.viewPageAdapter.getItemCount() - 11 || i4 == PictureSelectorPreviewFragment.this.viewPageAdapter.getItemCount() - 1) {
                        PictureSelectorPreviewFragment.this.loadMoreData();
                    }
                }
            }
        }
    };

    private class MyOnPreviewEventListener implements BasePreviewHolder.OnPreviewEventListener {
        private MyOnPreviewEventListener() {
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onBackPressed() {
            if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isPreviewFullScreenMode) {
                PictureSelectorPreviewFragment.this.previewFullScreenMode();
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.isExternalPreview) {
                if (((PictureCommonFragment) pictureSelectorPreviewFragment).selectorConfig.isPreviewZoomEffect) {
                    PictureSelectorPreviewFragment.this.magicalView.backToMin();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.handleExternalPreviewBack();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.isInternalBottomPreview || !((PictureCommonFragment) pictureSelectorPreviewFragment).selectorConfig.isPreviewZoomEffect) {
                PictureSelectorPreviewFragment.this.onBackCurrentFragment();
            } else {
                PictureSelectorPreviewFragment.this.magicalView.backToMin();
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onLongPressDownload(LocalMedia localMedia) {
            if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isHidePreviewDownload) {
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.isExternalPreview) {
                pictureSelectorPreviewFragment.onExternalLongPressDownload(localMedia);
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onPreviewVideoTitle(String str) {
            if (!TextUtils.isEmpty(str)) {
                PictureSelectorPreviewFragment.this.titleBar.setTitle(str);
                return;
            }
            PictureSelectorPreviewFragment.this.titleBar.setTitle((PictureSelectorPreviewFragment.this.curPosition + 1) + ProtectedSandApp.s("ᖥ\u0001") + PictureSelectorPreviewFragment.this.totalNum);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeMagicalViewParams(final int i4) {
        LocalMedia localMedia = this.mData.get(i4);
        if (PictureMimeType.isHasVideo(localMedia.getMimeType())) {
            getVideoRealSizeFromMedia(localMedia, false, new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.24
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    PictureSelectorPreviewFragment.this.setMagicalViewParams(iArr[0], iArr[1], i4);
                }
            });
        } else {
            getImageRealSizeFromMedia(localMedia, false, new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.25
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    PictureSelectorPreviewFragment.this.setMagicalViewParams(iArr[0], iArr[1], i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeViewParams(int[] iArr) {
        int i4;
        int i5;
        ViewParams itemViewParams = BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || (i4 = iArr[0]) == 0 || (i5 = iArr[1]) == 0) {
            this.magicalView.setViewParams(0, 0, 0, 0, iArr[0], iArr[1]);
            this.magicalView.resetStartNormal(iArr[0], iArr[1], false);
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.f67067top, itemViewParams.width, itemViewParams.height, i4, i5);
            this.magicalView.resetStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public void deletePreview() {
        OnExternalPreviewEventListener onExternalPreviewEventListener;
        if (!this.isDisplayDelete || (onExternalPreviewEventListener = this.selectorConfig.onExternalPreviewEventListener) == null) {
            return;
        }
        onExternalPreviewEventListener.onPreviewDelete(this.viewPager.h());
        int h4 = this.viewPager.h();
        this.mData.remove(h4);
        if (this.mData.size() == 0) {
            handleExternalPreviewBack();
            return;
        }
        this.titleBar.setTitle(getString(R.string.ps_preview_image_num, Integer.valueOf(this.curPosition + 1), Integer.valueOf(this.mData.size())));
        this.totalNum = this.mData.size();
        this.curPosition = h4;
        if (this.viewPager.g() != null) {
            this.viewPager.z(null);
            this.viewPager.z(this.viewPageAdapter);
        }
        this.viewPager.B(this.curPosition, false);
    }

    private void externalPreviewStyle() {
        this.titleBar.getImageDelete().setVisibility(this.isDisplayDelete ? 0 : 8);
        this.tvSelected.setVisibility(8);
        this.bottomNarBar.setVisibility(8);
        this.completeSelectView.setVisibility(8);
    }

    private void getImageRealSizeFromMedia(final LocalMedia localMedia, boolean z4, final OnCallbackListener<int[]> onCallbackListener) {
        int i4;
        int i5;
        boolean z5 = true;
        if (MediaUtils.isLongImage(localMedia.getWidth(), localMedia.getHeight())) {
            i4 = this.screenWidth;
            i5 = this.screenHeight;
        } else {
            int width = localMedia.getWidth();
            int height = localMedia.getHeight();
            if (z4 && ((width <= 0 || height <= 0 || width > height) && this.selectorConfig.isSyncWidthAndHeight)) {
                this.viewPager.setAlpha(0.0f);
                MediaUtils.getImageSize(getContext(), localMedia.getAvailablePath(), new OnCallbackListener<MediaExtraInfo>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.26
                    @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                    public void onCall(MediaExtraInfo mediaExtraInfo) {
                        if (mediaExtraInfo.getWidth() > 0) {
                            localMedia.setWidth(mediaExtraInfo.getWidth());
                        }
                        if (mediaExtraInfo.getHeight() > 0) {
                            localMedia.setHeight(mediaExtraInfo.getHeight());
                        }
                        OnCallbackListener onCallbackListener2 = onCallbackListener;
                        if (onCallbackListener2 != null) {
                            onCallbackListener2.onCall(new int[]{localMedia.getWidth(), localMedia.getHeight()});
                        }
                    }
                });
                z5 = false;
            }
            i4 = width;
            i5 = height;
        }
        if (localMedia.isCut() && localMedia.getCropImageWidth() > 0 && localMedia.getCropImageHeight() > 0) {
            i4 = localMedia.getCropImageWidth();
            i5 = localMedia.getCropImageHeight();
        }
        if (z5) {
            onCallbackListener.onCall(new int[]{i4, i5});
        }
    }

    private void getVideoRealSizeFromMedia(final LocalMedia localMedia, boolean z4, final OnCallbackListener<int[]> onCallbackListener) {
        if (!z4 || ((localMedia.getWidth() > 0 && localMedia.getHeight() > 0 && localMedia.getWidth() <= localMedia.getHeight()) || !this.selectorConfig.isSyncWidthAndHeight)) {
            onCallbackListener.onCall(new int[]{localMedia.getWidth(), localMedia.getHeight()});
        } else {
            this.viewPager.setAlpha(0.0f);
            MediaUtils.getVideoSize(getContext(), localMedia.getAvailablePath(), new OnCallbackListener<MediaExtraInfo>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.27
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(MediaExtraInfo mediaExtraInfo) {
                    if (mediaExtraInfo.getWidth() > 0) {
                        localMedia.setWidth(mediaExtraInfo.getWidth());
                    }
                    if (mediaExtraInfo.getHeight() > 0) {
                        localMedia.setHeight(mediaExtraInfo.getHeight());
                    }
                    OnCallbackListener onCallbackListener2 = onCallbackListener;
                    if (onCallbackListener2 != null) {
                        onCallbackListener2.onCall(new int[]{localMedia.getWidth(), localMedia.getHeight()});
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleExternalPreviewBack() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (this.selectorConfig.isPreviewFullScreenMode) {
            hideFullScreenStatusBar();
        }
        onExitPictureSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreData(List<LocalMedia> list, boolean z4) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.isHasMore = z4;
        if (z4) {
            if (list.size() <= 0) {
                loadMoreData();
                return;
            }
            int size = this.mData.size();
            this.mData.addAll(list);
            this.viewPageAdapter.notifyItemRangeChanged(size, this.mData.size());
        }
    }

    private void hideFullScreenStatusBar() {
        for (int i4 = 0; i4 < this.mAnimViews.size(); i4++) {
            this.mAnimViews.get(i4).setEnabled(true);
        }
        this.bottomNarBar.getEditor().setEnabled(true);
    }

    private void iniMagicalView() {
        if (!isHasMagicalEffect()) {
            this.magicalView.setBackgroundAlpha(1.0f);
            return;
        }
        float f4 = this.isSaveInstanceState ? 1.0f : 0.0f;
        this.magicalView.setBackgroundAlpha(f4);
        for (int i4 = 0; i4 < this.mAnimViews.size(); i4++) {
            if (!(this.mAnimViews.get(i4) instanceof TitleBar)) {
                this.mAnimViews.get(i4).setAlpha(f4);
            }
        }
    }

    private void initBottomNavBar() {
        this.bottomNarBar.setBottomNavBarStyle();
        this.bottomNarBar.setSelectedChange();
        this.bottomNarBar.setOnBottomNavBarListener(new BottomNavBar.OnBottomNavBarListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.15
            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onCheckOriginalChange() {
                PictureSelectorPreviewFragment.this.sendSelectedOriginalChangeEvent();
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onEditImage() {
                if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.onEditMediaEventListener != null) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                    ((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.onEditMediaEventListener.onStartMediaEdit(PictureSelectorPreviewFragment.this, pictureSelectorPreviewFragment.mData.get(pictureSelectorPreviewFragment.viewPager.h()), Crop.REQUEST_EDIT_CROP);
                }
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onFirstCheckOriginalSelectedChange() {
                int h4 = PictureSelectorPreviewFragment.this.viewPager.h();
                if (PictureSelectorPreviewFragment.this.mData.size() > h4) {
                    PictureSelectorPreviewFragment.this.confirmSelect(PictureSelectorPreviewFragment.this.mData.get(h4), false);
                }
            }
        });
    }

    private void initComplete() {
        final SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectBackground())) {
            this.tvSelected.setBackgroundResource(selectMainStyle.getPreviewSelectBackground());
        } else if (StyleUtils.checkStyleValidity(selectMainStyle.getSelectBackground())) {
            this.tvSelected.setBackgroundResource(selectMainStyle.getSelectBackground());
        }
        if (StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectTextResId())) {
            this.tvSelectedWord.setText(getString(selectMainStyle.getPreviewSelectTextResId()));
        } else if (StyleUtils.checkTextValidity(selectMainStyle.getPreviewSelectText())) {
            this.tvSelectedWord.setText(selectMainStyle.getPreviewSelectText());
        } else {
            this.tvSelectedWord.setText("");
        }
        if (StyleUtils.checkSizeValidity(selectMainStyle.getPreviewSelectTextSize())) {
            this.tvSelectedWord.setTextSize(selectMainStyle.getPreviewSelectTextSize());
        }
        if (StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectTextColor())) {
            this.tvSelectedWord.setTextColor(selectMainStyle.getPreviewSelectTextColor());
        }
        if (StyleUtils.checkSizeValidity(selectMainStyle.getPreviewSelectMarginRight())) {
            if (this.tvSelected.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                if (this.tvSelected.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.tvSelected.getLayoutParams())).rightMargin = selectMainStyle.getPreviewSelectMarginRight();
                }
            } else if (this.tvSelected.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.tvSelected.getLayoutParams()).rightMargin = selectMainStyle.getPreviewSelectMarginRight();
            }
        }
        this.completeSelectView.setCompleteSelectViewStyle();
        this.completeSelectView.setSelectedChange(true);
        if (selectMainStyle.isCompleteSelectRelativeTop()) {
            if (this.completeSelectView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams();
                int i4 = R.id.title_bar;
                layoutParams.f23845j = i4;
                ((ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams()).f23851m = i4;
                if (this.selectorConfig.isPreviewFullScreenMode) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams())).topMargin = DensityUtil.getStatusBarHeight(getContext());
                }
            } else if ((this.completeSelectView.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.selectorConfig.isPreviewFullScreenMode) {
                ((RelativeLayout.LayoutParams) this.completeSelectView.getLayoutParams()).topMargin = DensityUtil.getStatusBarHeight(getContext());
            }
        }
        if (selectMainStyle.isPreviewSelectRelativeBottom()) {
            if (this.tvSelected.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.tvSelected.getLayoutParams();
                int i5 = R.id.bottom_nar_bar;
                layoutParams2.f23845j = i5;
                ((ConstraintLayout.LayoutParams) this.tvSelected.getLayoutParams()).f23851m = i5;
                ((ConstraintLayout.LayoutParams) this.tvSelectedWord.getLayoutParams()).f23845j = i5;
                ((ConstraintLayout.LayoutParams) this.tvSelectedWord.getLayoutParams()).f23851m = i5;
                ((ConstraintLayout.LayoutParams) this.selectClickArea.getLayoutParams()).f23845j = i5;
                ((ConstraintLayout.LayoutParams) this.selectClickArea.getLayoutParams()).f23851m = i5;
            }
        } else if (this.selectorConfig.isPreviewFullScreenMode) {
            if (this.tvSelectedWord.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.tvSelectedWord.getLayoutParams())).topMargin = DensityUtil.getStatusBarHeight(getContext());
            } else if (this.tvSelectedWord.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.tvSelectedWord.getLayoutParams()).topMargin = DensityUtil.getStatusBarHeight(getContext());
            }
        }
        this.completeSelectView.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.6
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
            
                if (((com.luck.picture.lib.basic.PictureCommonFragment) r4.this$0).selectorConfig.getSelectCount() > 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
            
                if (r5.confirmSelect(r5.mData.get(r5.viewPager.h()), false) == 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    com.luck.picture.lib.style.SelectMainStyle r5 = r2
                    boolean r5 = r5.isCompleteSelectRelativeTop()
                    r0 = 1
                    r1 = 0
                    if (r5 == 0) goto L2f
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$200(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 != 0) goto L2f
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r2 = r5.mData
                    androidx.viewpager2.widget.ViewPager2 r3 = r5.viewPager
                    int r3 = r3.h()
                    java.lang.Object r2 = r2.get(r3)
                    com.luck.picture.lib.entity.LocalMedia r2 = (com.luck.picture.lib.entity.LocalMedia) r2
                    int r5 = r5.confirmSelect(r2, r1)
                    if (r5 != 0) goto L2d
                    goto L3b
                L2d:
                    r0 = r1
                    goto L3b
                L2f:
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$300(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 <= 0) goto L2d
                L3b:
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$400(r5)
                    boolean r5 = r5.isEmptyResultReturn
                    if (r5 == 0) goto L57
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$500(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 != 0) goto L57
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    r5.onExitPictureSelector()
                    goto L5e
                L57:
                    if (r0 == 0) goto L5e
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.PictureSelectorPreviewFragment.access$600(r5)
                L5e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.AnonymousClass6.onClick(android.view.View):void");
            }
        });
    }

    private void initTitleBar() {
        if (this.selectorConfig.selectorStyle.getTitleBarStyle().isHideTitleBar()) {
            this.titleBar.setVisibility(8);
        }
        this.titleBar.setTitleBarStyle();
        this.titleBar.setOnTitleBarListener(new TitleBar.OnTitleBarListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.7
            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onBackPressed() {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.isExternalPreview) {
                    if (((PictureCommonFragment) pictureSelectorPreviewFragment).selectorConfig.isPreviewZoomEffect) {
                        PictureSelectorPreviewFragment.this.magicalView.backToMin();
                        return;
                    } else {
                        PictureSelectorPreviewFragment.this.handleExternalPreviewBack();
                        return;
                    }
                }
                if (pictureSelectorPreviewFragment.isInternalBottomPreview || !((PictureCommonFragment) pictureSelectorPreviewFragment).selectorConfig.isPreviewZoomEffect) {
                    PictureSelectorPreviewFragment.this.onBackCurrentFragment();
                } else {
                    PictureSelectorPreviewFragment.this.magicalView.backToMin();
                }
            }
        });
        this.titleBar.setTitle((this.curPosition + 1) + ProtectedSandApp.s("ᖧ\u0001") + this.totalNum);
        this.titleBar.getImageDelete().setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PictureSelectorPreviewFragment.this.deletePreview();
            }
        });
        this.selectClickArea.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.isExternalPreview) {
                    pictureSelectorPreviewFragment.deletePreview();
                    return;
                }
                LocalMedia localMedia = pictureSelectorPreviewFragment.mData.get(pictureSelectorPreviewFragment.viewPager.h());
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment2.confirmSelect(localMedia, pictureSelectorPreviewFragment2.tvSelected.isSelected()) == 0) {
                    if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.onSelectAnimListener != null) {
                        ((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.onSelectAnimListener.onSelectAnim(PictureSelectorPreviewFragment.this.tvSelected);
                    } else {
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                        pictureSelectorPreviewFragment3.tvSelected.startAnimation(AnimationUtils.loadAnimation(pictureSelectorPreviewFragment3.getContext(), R.anim.ps_anim_modal_in));
                    }
                }
            }
        });
        this.tvSelected.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PictureSelectorPreviewFragment.this.selectClickArea.performClick();
            }
        });
    }

    private void initViewPagerData(ArrayList<LocalMedia> arrayList) {
        int i4;
        PicturePreviewAdapter createAdapter = createAdapter();
        this.viewPageAdapter = createAdapter;
        createAdapter.setData(arrayList);
        this.viewPageAdapter.setOnPreviewEventListener(new MyOnPreviewEventListener());
        this.viewPager.E(0);
        this.viewPager.z(this.viewPageAdapter);
        this.selectorConfig.selectedPreviewResult.clear();
        if (arrayList.size() == 0 || this.curPosition >= arrayList.size() || (i4 = this.curPosition) < 0) {
            onKeyBackFragmentFinish();
            return;
        }
        LocalMedia localMedia = arrayList.get(i4);
        this.bottomNarBar.isDisplayEditor(PictureMimeType.isHasVideo(localMedia.getMimeType()) || PictureMimeType.isHasAudio(localMedia.getMimeType()));
        this.tvSelected.setSelected(this.selectorConfig.getSelectedResult().contains(arrayList.get(this.viewPager.h())));
        this.viewPager.u(this.pageChangeCallback);
        this.viewPager.G(new e(DensityUtil.dip2px(getAppContext(), 3.0f)));
        this.viewPager.B(this.curPosition, false);
        sendChangeSubSelectPositionEvent(false);
        notifySelectNumberStyle(arrayList.get(this.curPosition));
        startZoomEffect(localMedia);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHasMagicalEffect() {
        return !this.isInternalBottomPreview && this.selectorConfig.isPreviewZoomEffect;
    }

    private boolean isPlaying() {
        PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        return picturePreviewAdapter != null && picturePreviewAdapter.isPlaying(this.viewPager.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMoreData() {
        int i4 = this.mPage + 1;
        this.mPage = i4;
        SelectorConfig selectorConfig = this.selectorConfig;
        ExtendLoaderEngine extendLoaderEngine = selectorConfig.loaderDataEngine;
        if (extendLoaderEngine == null) {
            this.mLoader.loadPageMediaData(this.mBucketId, i4, selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.5
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                    PictureSelectorPreviewFragment.this.handleMoreData(arrayList, z4);
                }
            });
            return;
        }
        Context context = getContext();
        long j4 = this.mBucketId;
        int i5 = this.mPage;
        int i6 = this.selectorConfig.pageSize;
        extendLoaderEngine.loadMoreMediaData(context, j4, i5, i6, i6, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.4
            @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
            public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                PictureSelectorPreviewFragment.this.handleMoreData(arrayList, z4);
            }
        });
    }

    public static PictureSelectorPreviewFragment newInstance() {
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new Bundle());
        return pictureSelectorPreviewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyGallerySelectMedia(LocalMedia localMedia) {
        if (this.mGalleryAdapter == null || !this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewDisplaySelectGallery()) {
            return;
        }
        this.mGalleryAdapter.isSelectMedia(localMedia);
    }

    private void notifyPreviewGalleryData(boolean z4, LocalMedia localMedia) {
        if (this.mGalleryAdapter == null || !this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewDisplaySelectGallery()) {
            return;
        }
        if (this.mGalleryRecycle.getVisibility() == 4) {
            this.mGalleryRecycle.setVisibility(0);
        }
        if (z4) {
            if (this.selectorConfig.selectionMode == 1) {
                this.mGalleryAdapter.clear();
            }
            this.mGalleryAdapter.addGalleryData(localMedia);
            this.mGalleryRecycle.smoothScrollToPosition(this.mGalleryAdapter.getItemCount() - 1);
            return;
        }
        this.mGalleryAdapter.removeGalleryData(localMedia);
        if (this.selectorConfig.getSelectCount() == 0) {
            this.mGalleryRecycle.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExternalLongPressDownload(final LocalMedia localMedia) {
        OnExternalPreviewEventListener onExternalPreviewEventListener = this.selectorConfig.onExternalPreviewEventListener;
        if (onExternalPreviewEventListener == null || onExternalPreviewEventListener.onLongPressDownload(getContext(), localMedia)) {
            return;
        }
        PictureCommonDialog.showDialog(getContext(), getString(R.string.ps_prompt), (PictureMimeType.isHasAudio(localMedia.getMimeType()) || PictureMimeType.isUrlHasAudio(localMedia.getAvailablePath())) ? getString(R.string.ps_prompt_audio_content) : (PictureMimeType.isHasVideo(localMedia.getMimeType()) || PictureMimeType.isUrlHasVideo(localMedia.getAvailablePath())) ? getString(R.string.ps_prompt_video_content) : getString(R.string.ps_prompt_image_content)).setOnDialogEventListener(new PictureCommonDialog.OnDialogEventListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.21
            @Override // com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener
            public void onConfirm() {
                String availablePath = localMedia.getAvailablePath();
                if (PictureMimeType.isHasHttp(availablePath)) {
                    PictureSelectorPreviewFragment.this.showLoading();
                }
                DownloadFileUtils.saveLocalFile(PictureSelectorPreviewFragment.this.getContext(), availablePath, localMedia.getMimeType(), new OnCallbackListener<String>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.21.1
                    @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                    public void onCall(String str) {
                        PictureSelectorPreviewFragment.this.dismissLoading();
                        if (TextUtils.isEmpty(str)) {
                            ToastUtils.showToast(PictureSelectorPreviewFragment.this.getContext(), PictureMimeType.isHasAudio(localMedia.getMimeType()) ? PictureSelectorPreviewFragment.this.getString(R.string.ps_save_audio_error) : PictureMimeType.isHasVideo(localMedia.getMimeType()) ? PictureSelectorPreviewFragment.this.getString(R.string.ps_save_video_error) : PictureSelectorPreviewFragment.this.getString(R.string.ps_save_image_error));
                            return;
                        }
                        new PictureMediaScannerConnection(PictureSelectorPreviewFragment.this.getActivity(), str);
                        ToastUtils.showToast(PictureSelectorPreviewFragment.this.getContext(), PictureSelectorPreviewFragment.this.getString(R.string.ps_save_success) + ProtectedSandApp.s("ᖣ\u0001") + str);
                    }
                });
            }
        });
    }

    private void onKeyDownBackToMin() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (this.isExternalPreview) {
            if (this.selectorConfig.isPreviewZoomEffect) {
                this.magicalView.backToMin();
                return;
            } else {
                onExitPictureSelector();
                return;
            }
        }
        if (this.isInternalBottomPreview) {
            onBackCurrentFragment();
        } else if (this.selectorConfig.isPreviewZoomEffect) {
            this.magicalView.backToMin();
        } else {
            onBackCurrentFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previewFullScreenMode() {
        if (this.isAnimationStart) {
            return;
        }
        final boolean z4 = this.titleBar.getTranslationY() == 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        float f4 = z4 ? 0.0f : -this.titleBar.getHeight();
        float f5 = z4 ? -this.titleBar.getHeight() : 0.0f;
        float f6 = z4 ? 1.0f : 0.0f;
        float f7 = z4 ? 0.0f : 1.0f;
        for (int i4 = 0; i4 < this.mAnimViews.size(); i4++) {
            View view = this.mAnimViews.get(i4);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ᖨ\u0001"), f6, f7));
            if (view instanceof TitleBar) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ᖩ\u0001"), f4, f5));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.isAnimationStart = true;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.20
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            @SuppressLint({"WrongConstant"})
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.isAnimationStart = false;
                if (SdkVersionUtils.isP() && PictureSelectorPreviewFragment.this.isAdded()) {
                    Window window = PictureSelectorPreviewFragment.this.requireActivity().getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (!z4) {
                        attributes.flags &= -1025;
                        window.setAttributes(attributes);
                        window.clearFlags(512);
                    } else {
                        attributes.flags |= 1024;
                        com.flashget.kid.common.ui.base.e.a(attributes, 1);
                        window.setAttributes(attributes);
                        window.addFlags(512);
                    }
                }
            }
        });
        if (z4) {
            showFullScreenStatusBar();
        } else {
            hideFullScreenStatusBar();
        }
    }

    private void resumePausePlay() {
        BasePreviewHolder currentHolder;
        PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter == null || (currentHolder = picturePreviewAdapter.getCurrentHolder(this.viewPager.h())) == null) {
            return;
        }
        currentHolder.resumePausePlay();
    }

    private void setMagicalViewBackgroundColor() {
        ArrayList<LocalMedia> arrayList;
        SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (StyleUtils.checkStyleValidity(selectMainStyle.getPreviewBackgroundColor())) {
            this.magicalView.setBackgroundColor(selectMainStyle.getPreviewBackgroundColor());
            return;
        }
        if (this.selectorConfig.chooseMode == SelectMimeType.ofAudio() || ((arrayList = this.mData) != null && arrayList.size() > 0 && PictureMimeType.isHasAudio(this.mData.get(0).getMimeType()))) {
            this.magicalView.setBackgroundColor(d.getColor(getContext(), R.color.ps_color_white));
        } else {
            this.magicalView.setBackgroundColor(d.getColor(getContext(), R.color.ps_color_black));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagicalViewParams(int i4, int i5, int i6) {
        this.magicalView.changeRealScreenHeight(i4, i5, true);
        if (this.isShowCamera) {
            i6++;
        }
        ViewParams itemViewParams = BuildRecycleItemViewParams.getItemViewParams(i6);
        if (itemViewParams == null || i4 == 0 || i5 == 0) {
            this.magicalView.setViewParams(0, 0, 0, 0, i4, i5);
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.f67067top, itemViewParams.width, itemViewParams.height, i4, i5);
        }
    }

    private void showFullScreenStatusBar() {
        for (int i4 = 0; i4 < this.mAnimViews.size(); i4++) {
            this.mAnimViews.get(i4).setEnabled(false);
        }
        this.bottomNarBar.getEditor().setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start(final int[] iArr) {
        int i4;
        this.magicalView.changeRealScreenHeight(iArr[0], iArr[1], false);
        ViewParams itemViewParams = BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || ((i4 = iArr[0]) == 0 && iArr[1] == 0)) {
            this.viewPager.post(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.19
                @Override // java.lang.Runnable
                public void run() {
                    MagicalView magicalView = PictureSelectorPreviewFragment.this.magicalView;
                    int[] iArr2 = iArr;
                    magicalView.startNormal(iArr2[0], iArr2[1], false);
                }
            });
            this.magicalView.setBackgroundAlpha(1.0f);
            for (int i5 = 0; i5 < this.mAnimViews.size(); i5++) {
                this.mAnimViews.get(i5).setAlpha(1.0f);
            }
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.f67067top, itemViewParams.width, itemViewParams.height, i4, iArr[1]);
            this.magicalView.start(false);
        }
        ObjectAnimator.ofFloat(this.viewPager, ProtectedSandApp.s("ᖨ\u0001"), 0.0f, 1.0f).setDuration(50L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAutoVideoPlay(final int i4) {
        this.viewPager.post(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.23
            @Override // java.lang.Runnable
            public void run() {
                PictureSelectorPreviewFragment.this.viewPageAdapter.startAutoVideoPlay(i4);
            }
        });
    }

    public void addAminViews(View... viewArr) {
        Collections.addAll(this.mAnimViews, viewArr);
    }

    protected PicturePreviewAdapter createAdapter() {
        return new PicturePreviewAdapter(this.selectorConfig);
    }

    public PicturePreviewAdapter getAdapter() {
        return this.viewPageAdapter;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        int layoutResource = InjectResourceSource.getLayoutResource(getContext(), 2, this.selectorConfig);
        return layoutResource != 0 ? layoutResource : R.layout.ps_fragment_preview;
    }

    public ViewPager2 getViewPager2() {
        return this.viewPager;
    }

    protected void initPreviewSelectGallery(ViewGroup viewGroup) {
        SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (selectMainStyle.isPreviewDisplaySelectGallery()) {
            this.mGalleryRecycle = new RecyclerView(getContext());
            if (StyleUtils.checkStyleValidity(selectMainStyle.getAdapterPreviewGalleryBackgroundResource())) {
                this.mGalleryRecycle.setBackgroundResource(selectMainStyle.getAdapterPreviewGalleryBackgroundResource());
            } else {
                this.mGalleryRecycle.setBackgroundResource(R.drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.mGalleryRecycle);
            ViewGroup.LayoutParams layoutParams = this.mGalleryRecycle.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.f23849l = R.id.bottom_nar_bar;
                layoutParams2.f23859u = 0;
                layoutParams2.f23861w = 0;
            }
            WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getContext()) { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.11
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i4) {
                    super.smoothScrollToPosition(recyclerView, a0Var, i4);
                    s sVar = new s(recyclerView.getContext()) { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.11.1
                        @Override // androidx.recyclerview.widget.s
                        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                            return 300.0f / displayMetrics.densityDpi;
                        }
                    };
                    sVar.setTargetPosition(i4);
                    startSmoothScroll(sVar);
                }
            };
            RecyclerView.m itemAnimator = this.mGalleryRecycle.getItemAnimator();
            if (itemAnimator != null) {
                ((d0) itemAnimator).setSupportsChangeAnimations(false);
            }
            if (this.mGalleryRecycle.getItemDecorationCount() == 0) {
                this.mGalleryRecycle.addItemDecoration(new HorizontalItemDecoration(Integer.MAX_VALUE, DensityUtil.dip2px(getContext(), 6.0f)));
            }
            wrapContentLinearLayoutManager.setOrientation(0);
            this.mGalleryRecycle.setLayoutManager(wrapContentLinearLayoutManager);
            if (this.selectorConfig.getSelectCount() > 0) {
                this.mGalleryRecycle.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.ps_anim_layout_fall_enter));
            }
            this.mGalleryAdapter = new PreviewGalleryAdapter(this.selectorConfig, this.isInternalBottomPreview);
            notifyGallerySelectMedia(this.mData.get(this.curPosition));
            this.mGalleryRecycle.setAdapter(this.mGalleryAdapter);
            this.mGalleryAdapter.setItemClickListener(new PreviewGalleryAdapter.OnItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.12
                @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemClickListener
                public void onItemClick(final int i4, LocalMedia localMedia, View view) {
                    if (i4 == -1) {
                        return;
                    }
                    String string = TextUtils.isEmpty(((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.defaultAlbumName) ? PictureSelectorPreviewFragment.this.getString(R.string.ps_camera_roll) : ((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.defaultAlbumName;
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment.isInternalBottomPreview || TextUtils.equals(pictureSelectorPreviewFragment.currentAlbum, string) || TextUtils.equals(localMedia.getParentFolderName(), PictureSelectorPreviewFragment.this.currentAlbum)) {
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                        if (!pictureSelectorPreviewFragment2.isInternalBottomPreview) {
                            i4 = pictureSelectorPreviewFragment2.isShowCamera ? localMedia.position - 1 : localMedia.position;
                        }
                        if (i4 == pictureSelectorPreviewFragment2.viewPager.h() && localMedia.isChecked()) {
                            return;
                        }
                        LocalMedia item = PictureSelectorPreviewFragment.this.viewPageAdapter.getItem(i4);
                        if (item == null || (TextUtils.equals(localMedia.getPath(), item.getPath()) && localMedia.getId() == item.getId())) {
                            if (PictureSelectorPreviewFragment.this.viewPager.g() != null) {
                                PictureSelectorPreviewFragment.this.viewPager.z(null);
                                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                                pictureSelectorPreviewFragment3.viewPager.z(pictureSelectorPreviewFragment3.viewPageAdapter);
                            }
                            PictureSelectorPreviewFragment.this.viewPager.B(i4, false);
                            PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                            PictureSelectorPreviewFragment.this.viewPager.post(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.12.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.isPreviewZoomEffect) {
                                        PictureSelectorPreviewFragment.this.viewPageAdapter.setVideoPlayButtonUI(i4);
                                    }
                                }
                            });
                        }
                    }
                }
            });
            if (this.selectorConfig.getSelectCount() > 0) {
                this.mGalleryRecycle.setVisibility(0);
            } else {
                this.mGalleryRecycle.setVisibility(4);
            }
            addAminViews(this.mGalleryRecycle);
            final o oVar = new o(new o.f() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13
                @Override // androidx.recyclerview.widget.o.f
                public void clearView(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
                    int lastCheckPosition;
                    e0Var.itemView.setAlpha(1.0f);
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment.needScaleSmall) {
                        pictureSelectorPreviewFragment.needScaleSmall = false;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(e0Var.itemView, ProtectedSandApp.s("ᖠ\u0001"), 1.1f, 1.0f), ObjectAnimator.ofFloat(e0Var.itemView, ProtectedSandApp.s("ᖡ\u0001"), 1.1f, 1.0f));
                        animatorSet.setInterpolator(new LinearInterpolator());
                        animatorSet.setDuration(50L);
                        animatorSet.start();
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                PictureSelectorPreviewFragment.this.needScaleBig = true;
                            }
                        });
                    }
                    super.clearView(recyclerView, e0Var);
                    PictureSelectorPreviewFragment.this.mGalleryAdapter.notifyItemChanged(e0Var.getAbsoluteAdapterPosition());
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment2.isInternalBottomPreview && PictureSelectorPreviewFragment.this.viewPager.h() != (lastCheckPosition = pictureSelectorPreviewFragment2.mGalleryAdapter.getLastCheckPosition()) && lastCheckPosition != -1) {
                        if (PictureSelectorPreviewFragment.this.viewPager.g() != null) {
                            PictureSelectorPreviewFragment.this.viewPager.z(null);
                            PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                            pictureSelectorPreviewFragment3.viewPager.z(pictureSelectorPreviewFragment3.viewPageAdapter);
                        }
                        PictureSelectorPreviewFragment.this.viewPager.B(lastCheckPosition, false);
                    }
                    if (!((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle() || ActivityCompatHelper.isDestroy(PictureSelectorPreviewFragment.this.getActivity())) {
                        return;
                    }
                    List<Fragment> I0 = PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().I0();
                    for (int i4 = 0; i4 < I0.size(); i4++) {
                        Fragment fragment = I0.get(i4);
                        if (fragment instanceof PictureCommonFragment) {
                            ((PictureCommonFragment) fragment).sendChangeSubSelectPositionEvent(true);
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.o.f
                public long getAnimationDuration(@o0 RecyclerView recyclerView, int i4, float f4, float f5) {
                    return super.getAnimationDuration(recyclerView, i4, f4, f5);
                }

                @Override // androidx.recyclerview.widget.o.f
                public int getMovementFlags(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
                    e0Var.itemView.setAlpha(0.7f);
                    return o.f.makeMovementFlags(12, 0);
                }

                @Override // androidx.recyclerview.widget.o.f
                public boolean isLongPressDragEnabled() {
                    return true;
                }

                @Override // androidx.recyclerview.widget.o.f
                public void onChildDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, float f4, float f5, int i4, boolean z4) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment.needScaleBig) {
                        pictureSelectorPreviewFragment.needScaleBig = false;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(e0Var.itemView, ProtectedSandApp.s("ᖠ\u0001"), 1.0f, 1.1f), ObjectAnimator.ofFloat(e0Var.itemView, ProtectedSandApp.s("ᖡ\u0001"), 1.0f, 1.1f));
                        animatorSet.setDuration(50L);
                        animatorSet.setInterpolator(new LinearInterpolator());
                        animatorSet.start();
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                PictureSelectorPreviewFragment.this.needScaleSmall = true;
                            }
                        });
                    }
                    super.onChildDraw(canvas, recyclerView, e0Var, f4, f5, i4, z4);
                }

                @Override // androidx.recyclerview.widget.o.f
                public boolean onMove(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, @o0 RecyclerView.e0 e0Var2) {
                    try {
                        int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
                        int absoluteAdapterPosition2 = e0Var2.getAbsoluteAdapterPosition();
                        if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                            int i4 = absoluteAdapterPosition;
                            while (i4 < absoluteAdapterPosition2) {
                                int i5 = i4 + 1;
                                Collections.swap(PictureSelectorPreviewFragment.this.mGalleryAdapter.getData(), i4, i5);
                                Collections.swap(((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.getSelectedResult(), i4, i5);
                                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                                if (pictureSelectorPreviewFragment.isInternalBottomPreview) {
                                    Collections.swap(pictureSelectorPreviewFragment.mData, i4, i5);
                                }
                                i4 = i5;
                            }
                        } else {
                            for (int i6 = absoluteAdapterPosition; i6 > absoluteAdapterPosition2; i6--) {
                                int i7 = i6 - 1;
                                Collections.swap(PictureSelectorPreviewFragment.this.mGalleryAdapter.getData(), i6, i7);
                                Collections.swap(((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.getSelectedResult(), i6, i7);
                                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                                if (pictureSelectorPreviewFragment2.isInternalBottomPreview) {
                                    Collections.swap(pictureSelectorPreviewFragment2.mData, i6, i7);
                                }
                            }
                        }
                        PictureSelectorPreviewFragment.this.mGalleryAdapter.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                        return true;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return true;
                    }
                }

                @Override // androidx.recyclerview.widget.o.f
                public void onSelectedChanged(@q0 RecyclerView.e0 e0Var, int i4) {
                    super.onSelectedChanged(e0Var, i4);
                }

                @Override // androidx.recyclerview.widget.o.f
                public void onSwiped(@o0 RecyclerView.e0 e0Var, int i4) {
                }
            });
            oVar.d(this.mGalleryRecycle);
            this.mGalleryAdapter.setItemLongClickListener(new PreviewGalleryAdapter.OnItemLongClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.14
                @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemLongClickListener
                public void onItemLongClick(RecyclerView.e0 e0Var, int i4, View view) {
                    ((Vibrator) PictureSelectorPreviewFragment.this.getActivity().getSystemService(ProtectedSandApp.s("ᖢ\u0001"))).vibrate(50L);
                    if (PictureSelectorPreviewFragment.this.mGalleryAdapter.getItemCount() != ((PictureCommonFragment) PictureSelectorPreviewFragment.this).selectorConfig.maxSelectNum) {
                        oVar.y(e0Var);
                    } else if (e0Var.getLayoutPosition() != PictureSelectorPreviewFragment.this.mGalleryAdapter.getItemCount() - 1) {
                        oVar.y(e0Var);
                    }
                }
            });
        }
    }

    protected boolean isSelected(LocalMedia localMedia) {
        return this.selectorConfig.getSelectedResult().contains(localMedia);
    }

    public void notifySelectNumberStyle(LocalMedia localMedia) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewSelectNumberStyle() && this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            this.tvSelected.setText("");
            for (int i4 = 0; i4 < this.selectorConfig.getSelectCount(); i4++) {
                LocalMedia localMedia2 = this.selectorConfig.getSelectedResult().get(i4);
                if (TextUtils.equals(localMedia2.getPath(), localMedia.getPath()) || localMedia2.getId() == localMedia.getId()) {
                    localMedia.setNum(localMedia2.getNum());
                    localMedia2.setPosition(localMedia.getPosition());
                    this.tvSelected.setText(ValueOf.toString(Integer.valueOf(localMedia.getNum())));
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCheckOriginalChange() {
        this.bottomNarBar.setOriginalCheck();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isHasMagicalEffect()) {
            int size = this.mData.size();
            int i4 = this.curPosition;
            if (size > i4) {
                LocalMedia localMedia = this.mData.get(i4);
                if (PictureMimeType.isHasVideo(localMedia.getMimeType())) {
                    getVideoRealSizeFromMedia(localMedia, false, new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.2
                        @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                        public void onCall(int[] iArr) {
                            PictureSelectorPreviewFragment.this.changeViewParams(iArr);
                        }
                    });
                } else {
                    getImageRealSizeFromMedia(localMedia, false, new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.3
                        @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                        public void onCall(int[] iArr) {
                            PictureSelectorPreviewFragment.this.changeViewParams(iArr);
                        }
                    });
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    @q0
    public Animation onCreateAnimation(int i4, boolean z4, int i5) {
        if (isHasMagicalEffect()) {
            return null;
        }
        PictureWindowAnimationStyle windowAnimationStyle = this.selectorConfig.selectorStyle.getWindowAnimationStyle();
        if (windowAnimationStyle.activityPreviewEnterAnimation == 0 || windowAnimationStyle.activityPreviewExitAnimation == 0) {
            return super.onCreateAnimation(i4, z4, i5);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), z4 ? windowAnimationStyle.activityPreviewEnterAnimation : windowAnimationStyle.activityPreviewExitAnimation);
        if (z4) {
            onEnterFragment();
        } else {
            onExitFragment();
        }
        return loadAnimation;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCreateLoader() {
        if (this.isExternalPreview) {
            return;
        }
        SelectorConfig selectorConfig = this.selectorConfig;
        IBridgeLoaderFactory iBridgeLoaderFactory = selectorConfig.loaderFactory;
        if (iBridgeLoaderFactory == null) {
            this.mLoader = selectorConfig.isPageStrategy ? new LocalMediaPageLoader(getAppContext(), this.selectorConfig) : new LocalMediaLoader(getAppContext(), this.selectorConfig);
            return;
        }
        IBridgeMediaLoader onCreateLoader = iBridgeLoaderFactory.onCreateLoader();
        this.mLoader = onCreateLoader;
        if (onCreateLoader != null) {
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᖪ\u0001") + IBridgeMediaLoader.class + ProtectedSandApp.s("ᖫ\u0001"));
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.K(this.pageChangeCallback);
        }
        super.onDestroy();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onEditMedia(Intent intent) {
        if (this.mData.size() > this.viewPager.h()) {
            LocalMedia localMedia = this.mData.get(this.viewPager.h());
            Uri output = Crop.getOutput(intent);
            localMedia.setCutPath(output != null ? output.getPath() : "");
            localMedia.setCropImageWidth(Crop.getOutputImageWidth(intent));
            localMedia.setCropImageHeight(Crop.getOutputImageHeight(intent));
            localMedia.setCropOffsetX(Crop.getOutputImageOffsetX(intent));
            localMedia.setCropOffsetY(Crop.getOutputImageOffsetY(intent));
            localMedia.setCropResultAspectRatio(Crop.getOutputCropAspectRatio(intent));
            localMedia.setCut(!TextUtils.isEmpty(localMedia.getCutPath()));
            localMedia.setCustomData(Crop.getOutputCustomExtraData(intent));
            localMedia.setEditorImage(localMedia.isCut());
            localMedia.setSandboxPath(localMedia.getCutPath());
            if (this.selectorConfig.getSelectedResult().contains(localMedia)) {
                LocalMedia compareLocalMedia = localMedia.getCompareLocalMedia();
                if (compareLocalMedia != null) {
                    compareLocalMedia.setCutPath(localMedia.getCutPath());
                    compareLocalMedia.setCut(localMedia.isCut());
                    compareLocalMedia.setEditorImage(localMedia.isEditorImage());
                    compareLocalMedia.setCustomData(localMedia.getCustomData());
                    compareLocalMedia.setSandboxPath(localMedia.getCutPath());
                    compareLocalMedia.setCropImageWidth(Crop.getOutputImageWidth(intent));
                    compareLocalMedia.setCropImageHeight(Crop.getOutputImageHeight(intent));
                    compareLocalMedia.setCropOffsetX(Crop.getOutputImageOffsetX(intent));
                    compareLocalMedia.setCropOffsetY(Crop.getOutputImageOffsetY(intent));
                    compareLocalMedia.setCropResultAspectRatio(Crop.getOutputCropAspectRatio(intent));
                }
                sendFixedSelectedChangeEvent(localMedia);
            } else {
                confirmSelect(localMedia, false);
            }
            this.viewPageAdapter.notifyItemChanged(this.viewPager.h());
            notifyGallerySelectMedia(localMedia);
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onExitFragment() {
        if (this.selectorConfig.isPreviewFullScreenMode) {
            hideFullScreenStatusBar();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    protected void onExitPictureSelector() {
        PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        super.onExitPictureSelector();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onKeyBackFragmentFinish() {
        onKeyDownBackToMin();
    }

    protected void onMojitoBackgroundAlpha(float f4) {
        for (int i4 = 0; i4 < this.mAnimViews.size(); i4++) {
            if (!(this.mAnimViews.get(i4) instanceof TitleBar)) {
                this.mAnimViews.get(i4).setAlpha(f4);
            }
        }
    }

    protected void onMojitoBeginAnimComplete(MagicalView magicalView, boolean z4) {
        int width;
        int height;
        BasePreviewHolder currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.h());
        if (currentHolder == null) {
            return;
        }
        LocalMedia localMedia = this.mData.get(this.viewPager.h());
        if (!localMedia.isCut() || localMedia.getCropImageWidth() <= 0 || localMedia.getCropImageHeight() <= 0) {
            width = localMedia.getWidth();
            height = localMedia.getHeight();
        } else {
            width = localMedia.getCropImageWidth();
            height = localMedia.getCropImageHeight();
        }
        if (MediaUtils.isLongImage(width, height)) {
            currentHolder.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            currentHolder.coverImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (currentHolder instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) currentHolder;
            if (this.selectorConfig.isAutoVideoPlay) {
                startAutoVideoPlay(this.viewPager.h());
            } else {
                if (previewVideoHolder.ivPlayButton.getVisibility() != 8 || isPlaying()) {
                    return;
                }
                previewVideoHolder.ivPlayButton.setVisibility(0);
            }
        }
    }

    protected void onMojitoBeginBackMinAnim() {
        BasePreviewHolder currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.h());
        if (currentHolder == null) {
            return;
        }
        if (currentHolder.coverImageView.getVisibility() == 8) {
            currentHolder.coverImageView.setVisibility(0);
        }
        if (currentHolder instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) currentHolder;
            if (previewVideoHolder.ivPlayButton.getVisibility() == 0) {
                previewVideoHolder.ivPlayButton.setVisibility(8);
            }
        }
    }

    protected void onMojitoBeginBackMinFinish(boolean z4) {
        BasePreviewHolder currentHolder;
        ViewParams itemViewParams = BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || (currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.h())) == null) {
            return;
        }
        currentHolder.coverImageView.getLayoutParams().width = itemViewParams.width;
        currentHolder.coverImageView.getLayoutParams().height = itemViewParams.height;
        currentHolder.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    protected void onMojitoMagicalViewFinish() {
        if (this.isExternalPreview && isNormalDefaultEnter() && isHasMagicalEffect()) {
            onExitPictureSelector();
        } else {
            onBackCurrentFragment();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (isPlaying()) {
            resumePausePlay();
            this.isPause = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isPause) {
            resumePausePlay();
            this.isPause = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("ᖬ\u0001"), this.mPage);
        bundle.putLong(ProtectedSandApp.s("ᖭ\u0001"), this.mBucketId);
        bundle.putInt(ProtectedSandApp.s("ᖮ\u0001"), this.curPosition);
        bundle.putInt(ProtectedSandApp.s("ᖯ\u0001"), this.totalNum);
        bundle.putBoolean(ProtectedSandApp.s("ᖰ\u0001"), this.isExternalPreview);
        bundle.putBoolean(ProtectedSandApp.s("ᖱ\u0001"), this.isDisplayDelete);
        bundle.putBoolean(ProtectedSandApp.s("ᖲ\u0001"), this.isShowCamera);
        bundle.putBoolean(ProtectedSandApp.s("ᖳ\u0001"), this.isInternalBottomPreview);
        bundle.putString(ProtectedSandApp.s("ᖴ\u0001"), this.currentAlbum);
        this.selectorConfig.addSelectedPreviewResult(this.mData);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onSelectedChange(boolean z4, LocalMedia localMedia) {
        this.tvSelected.setSelected(this.selectorConfig.getSelectedResult().contains(localMedia));
        this.bottomNarBar.setSelectedChange();
        this.completeSelectView.setSelectedChange(true);
        notifySelectNumberStyle(localMedia);
        notifyPreviewGalleryData(z4, localMedia);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        reStartSavedInstance(bundle);
        this.isSaveInstanceState = bundle != null;
        this.screenWidth = DensityUtil.getRealScreenWidth(getContext());
        this.screenHeight = DensityUtil.getScreenHeight(getContext());
        this.titleBar = (PreviewTitleBar) view.findViewById(R.id.title_bar);
        this.tvSelected = (TextView) view.findViewById(R.id.ps_tv_selected);
        this.tvSelectedWord = (TextView) view.findViewById(R.id.ps_tv_selected_word);
        this.selectClickArea = view.findViewById(R.id.select_click_area);
        this.completeSelectView = (CompleteSelectView) view.findViewById(R.id.ps_complete_select);
        this.magicalView = (MagicalView) view.findViewById(R.id.magical);
        this.viewPager = new ViewPager2(getContext());
        this.bottomNarBar = (PreviewBottomNavBar) view.findViewById(R.id.bottom_nar_bar);
        this.magicalView.setMagicalContent(this.viewPager);
        setMagicalViewBackgroundColor();
        setMagicalViewAction();
        addAminViews(this.titleBar, this.tvSelected, this.tvSelectedWord, this.selectClickArea, this.completeSelectView, this.bottomNarBar);
        onCreateLoader();
        initTitleBar();
        initViewPagerData(this.mData);
        if (this.isExternalPreview) {
            externalPreviewStyle();
        } else {
            initBottomNavBar();
            initPreviewSelectGallery((ViewGroup) view);
            initComplete();
        }
        iniMagicalView();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void reStartSavedInstance(Bundle bundle) {
        if (bundle != null) {
            this.mPage = bundle.getInt(ProtectedSandApp.s("ᖬ\u0001"), 1);
            this.mBucketId = bundle.getLong(ProtectedSandApp.s("ᖭ\u0001"), -1L);
            this.curPosition = bundle.getInt(ProtectedSandApp.s("ᖮ\u0001"), this.curPosition);
            this.isShowCamera = bundle.getBoolean(ProtectedSandApp.s("ᖲ\u0001"), this.isShowCamera);
            this.totalNum = bundle.getInt(ProtectedSandApp.s("ᖯ\u0001"), this.totalNum);
            this.isExternalPreview = bundle.getBoolean(ProtectedSandApp.s("ᖰ\u0001"), this.isExternalPreview);
            this.isDisplayDelete = bundle.getBoolean(ProtectedSandApp.s("ᖱ\u0001"), this.isDisplayDelete);
            this.isInternalBottomPreview = bundle.getBoolean(ProtectedSandApp.s("ᖳ\u0001"), this.isInternalBottomPreview);
            this.currentAlbum = bundle.getString(ProtectedSandApp.s("ᖴ\u0001"), "");
            if (this.mData.size() == 0) {
                this.mData.addAll(new ArrayList(this.selectorConfig.selectedPreviewResult));
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendChangeSubSelectPositionEvent(boolean z4) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewSelectNumberStyle() && this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            int i4 = 0;
            while (i4 < this.selectorConfig.getSelectCount()) {
                LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i4);
                i4++;
                localMedia.setNum(i4);
            }
        }
    }

    public void setExternalPreviewData(int i4, int i5, ArrayList<LocalMedia> arrayList, boolean z4) {
        this.mData = arrayList;
        this.totalNum = i5;
        this.curPosition = i4;
        this.isDisplayDelete = z4;
        this.isExternalPreview = true;
    }

    public void setInternalPreviewData(boolean z4, String str, boolean z5, int i4, int i5, int i6, long j4, ArrayList<LocalMedia> arrayList) {
        this.mPage = i6;
        this.mBucketId = j4;
        this.mData = arrayList;
        this.totalNum = i5;
        this.curPosition = i4;
        this.currentAlbum = str;
        this.isShowCamera = z5;
        this.isInternalBottomPreview = z4;
    }

    protected void setMagicalViewAction() {
        if (isHasMagicalEffect()) {
            this.magicalView.setOnMojitoViewCallback(new OnMagicalViewCallback() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.1
                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBackgroundAlpha(float f4) {
                    PictureSelectorPreviewFragment.this.onMojitoBackgroundAlpha(f4);
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginBackMinAnim() {
                    PictureSelectorPreviewFragment.this.onMojitoBeginBackMinAnim();
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginBackMinMagicalFinish(boolean z4) {
                    PictureSelectorPreviewFragment.this.onMojitoBeginBackMinFinish(z4);
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginMagicalAnimComplete(MagicalView magicalView, boolean z4) {
                    PictureSelectorPreviewFragment.this.onMojitoBeginAnimComplete(magicalView, z4);
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onMagicalViewFinish() {
                    PictureSelectorPreviewFragment.this.onMojitoMagicalViewFinish();
                }
            });
        }
    }

    protected void startZoomEffect(LocalMedia localMedia) {
        if (this.isSaveInstanceState || this.isInternalBottomPreview || !this.selectorConfig.isPreviewZoomEffect) {
            return;
        }
        this.viewPager.post(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.16
            @Override // java.lang.Runnable
            public void run() {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment.viewPageAdapter.setCoverScaleType(pictureSelectorPreviewFragment.curPosition);
            }
        });
        if (PictureMimeType.isHasVideo(localMedia.getMimeType())) {
            getVideoRealSizeFromMedia(localMedia, !PictureMimeType.isHasHttp(localMedia.getAvailablePath()), new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.17
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    PictureSelectorPreviewFragment.this.start(iArr);
                }
            });
        } else {
            getImageRealSizeFromMedia(localMedia, !PictureMimeType.isHasHttp(localMedia.getAvailablePath()), new OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.18
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    PictureSelectorPreviewFragment.this.start(iArr);
                }
            });
        }
    }
}
