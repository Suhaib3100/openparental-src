package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.engine.ImageEngine;
import com.luck.picture.lib.engine.VideoPlayerEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnExternalPreviewEventListener;
import com.luck.picture.lib.interfaces.OnInjectActivityPreviewListener;
import com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener;
import com.luck.picture.lib.magical.BuildRecycleItemViewParams;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.DoubleUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class PictureSelectionPreviewModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionPreviewModel(PictureSelector pictureSelector) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.isPreviewZoomEffect = false;
    }

    public PictureSelectionPreviewModel isAutoVideoPlay(boolean z4) {
        this.selectionConfig.isAutoVideoPlay = z4;
        return this;
    }

    @Deprecated
    public PictureSelectionPreviewModel isEnableVideoSize(boolean z4) {
        this.selectionConfig.isSyncWidthAndHeight = z4;
        return this;
    }

    public PictureSelectionPreviewModel isHidePreviewDownload(boolean z4) {
        this.selectionConfig.isHidePreviewDownload = z4;
        return this;
    }

    public PictureSelectionPreviewModel isLoopAutoVideoPlay(boolean z4) {
        this.selectionConfig.isLoopAutoPlay = z4;
        return this;
    }

    public PictureSelectionPreviewModel isNewKeyBackMode(boolean z4) {
        this.selectionConfig.isNewKeyBackMode = z4;
        return this;
    }

    public PictureSelectionPreviewModel isPreviewFullScreenMode(boolean z4) {
        this.selectionConfig.isPreviewFullScreenMode = z4;
        return this;
    }

    public PictureSelectionPreviewModel isPreviewZoomEffect(boolean z4, ViewGroup viewGroup) {
        return isPreviewZoomEffect(z4, this.selectionConfig.isPreviewFullScreenMode, viewGroup);
    }

    public PictureSelectionPreviewModel isSyncWidthAndHeight(boolean z4) {
        this.selectionConfig.isSyncWidthAndHeight = z4;
        return this;
    }

    public PictureSelectionPreviewModel isUseSystemVideoPlayer(boolean z4) {
        this.selectionConfig.isUseSystemVideoPlayer = z4;
        return this;
    }

    public PictureSelectionPreviewModel isVideoPauseResumePlay(boolean z4) {
        this.selectionConfig.isPauseResumePlay = z4;
        return this;
    }

    public PictureSelectionPreviewModel setAttachViewLifecycle(IBridgeViewLifecycle iBridgeViewLifecycle) {
        this.selectionConfig.viewLifecycle = iBridgeViewLifecycle;
        return this;
    }

    public PictureSelectionPreviewModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionPreviewModel setDefaultLanguage(int i4) {
        this.selectionConfig.defaultLanguage = i4;
        return this;
    }

    public PictureSelectionPreviewModel setExternalPreviewEventListener(OnExternalPreviewEventListener onExternalPreviewEventListener) {
        this.selectionConfig.onExternalPreviewEventListener = onExternalPreviewEventListener;
        return this;
    }

    public PictureSelectionPreviewModel setImageEngine(ImageEngine imageEngine) {
        this.selectionConfig.imageEngine = imageEngine;
        return this;
    }

    public PictureSelectionPreviewModel setInjectActivityPreviewFragment(OnInjectActivityPreviewListener onInjectActivityPreviewListener) {
        this.selectionConfig.onInjectActivityPreviewListener = onInjectActivityPreviewListener;
        return this;
    }

    public PictureSelectionPreviewModel setInjectLayoutResourceListener(OnInjectLayoutResourceListener onInjectLayoutResourceListener) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isInjectLayoutResource = onInjectLayoutResourceListener != null;
        selectorConfig.onLayoutResourceListener = onInjectLayoutResourceListener;
        return this;
    }

    public PictureSelectionPreviewModel setLanguage(int i4) {
        this.selectionConfig.language = i4;
        return this;
    }

    public PictureSelectionPreviewModel setSelectorUIStyle(PictureSelectorStyle pictureSelectorStyle) {
        if (pictureSelectorStyle != null) {
            this.selectionConfig.selectorStyle = pictureSelectorStyle;
        }
        return this;
    }

    public PictureSelectionPreviewModel setVideoPlayerEngine(VideoPlayerEngine videoPlayerEngine) {
        this.selectionConfig.videoPlayerEngine = videoPlayerEngine;
        return this;
    }

    public void startActivityPreview(int i4, boolean z4, ArrayList<LocalMedia> arrayList) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗢ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
            throw new NullPointerException(ProtectedSandApp.s("ᗜ\u0001"));
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException(ProtectedSandApp.s("ᗡ\u0001"));
        }
        Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
        this.selectionConfig.addSelectedPreviewResult(arrayList);
        intent.putExtra(ProtectedSandApp.s("ᗝ\u0001"), true);
        intent.putExtra(ProtectedSandApp.s("ᗞ\u0001"), 2);
        intent.putExtra(ProtectedSandApp.s("ᗟ\u0001"), i4);
        intent.putExtra(ProtectedSandApp.s("ᗠ\u0001"), z4);
        Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivity(intent);
        } else {
            activity.startActivity(intent);
        }
        SelectorConfig selectorConfig2 = this.selectionConfig;
        if (!selectorConfig2.isPreviewZoomEffect) {
            activity.overridePendingTransition(selectorConfig2.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, R.anim.ps_anim_fade_in);
        } else {
            int i5 = R.anim.ps_anim_fade_in;
            activity.overridePendingTransition(i5, i5);
        }
    }

    public void startFragmentPreview(int i4, boolean z4, ArrayList<LocalMedia> arrayList) {
        startFragmentPreview(null, i4, z4, arrayList);
    }

    public PictureSelectionPreviewModel isPreviewZoomEffect(boolean z4, boolean z5, ViewGroup viewGroup) {
        if ((viewGroup instanceof RecyclerView) || (viewGroup instanceof ListView)) {
            if (z4) {
                if (z5) {
                    BuildRecycleItemViewParams.generateViewParams(viewGroup, 0);
                } else {
                    BuildRecycleItemViewParams.generateViewParams(viewGroup, DensityUtil.getStatusBarHeight(this.selector.getActivity()));
                }
            }
            this.selectionConfig.isPreviewZoomEffect = z4;
            return this;
        }
        throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + ProtectedSandApp.s("ᗚ\u0001") + RecyclerView.class + ProtectedSandApp.s("ᗛ\u0001") + ListView.class);
    }

    public void startFragmentPreview(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, int i4, boolean z4, ArrayList<LocalMedia> arrayList) {
        String str;
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗢ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
            throw new NullPointerException(ProtectedSandApp.s("ᗜ\u0001"));
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException(ProtectedSandApp.s("ᗡ\u0001"));
        }
        FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗣ\u0001"));
        }
        if (pictureSelectorPreviewFragment != null) {
            str = pictureSelectorPreviewFragment.getFragmentTag();
        } else {
            str = PictureSelectorPreviewFragment.TAG;
            pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.newInstance();
        }
        if (ActivityCompatHelper.checkFragmentNonExits((FragmentActivity) activity, str)) {
            ArrayList<LocalMedia> arrayList2 = new ArrayList<>(arrayList);
            pictureSelectorPreviewFragment.setExternalPreviewData(i4, arrayList2.size(), arrayList2, z4);
            FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, pictureSelectorPreviewFragment);
        }
    }
}
