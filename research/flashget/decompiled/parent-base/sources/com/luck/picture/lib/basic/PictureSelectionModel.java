package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.content.preferences.protobuf.o1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.PictureSelectorFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.engine.CompressEngine;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.engine.CropEngine;
import com.luck.picture.lib.engine.CropFileEngine;
import com.luck.picture.lib.engine.ExtendLoaderEngine;
import com.luck.picture.lib.engine.ImageEngine;
import com.luck.picture.lib.engine.SandboxFileEngine;
import com.luck.picture.lib.engine.UriToFileTransformEngine;
import com.luck.picture.lib.engine.VideoPlayerEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener;
import com.luck.picture.lib.interfaces.OnCameraInterceptListener;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnGridItemSelectAnimListener;
import com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener;
import com.luck.picture.lib.interfaces.OnMediaEditInterceptListener;
import com.luck.picture.lib.interfaces.OnPermissionDeniedListener;
import com.luck.picture.lib.interfaces.OnPermissionDescriptionListener;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnPreviewInterceptListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.luck.picture.lib.interfaces.OnSelectAnimListener;
import com.luck.picture.lib.interfaces.OnSelectFilterListener;
import com.luck.picture.lib.interfaces.OnSelectLimitTipsListener;
import com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.luck.picture.lib.utils.DoubleUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class PictureSelectionModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionModel(PictureSelector pictureSelector, int i4) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i4;
        setMaxVideoSelectNum(selectorConfig.maxVideoSelectNum);
    }

    public PictureSelectorFragment build() {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗕ\u0001"));
        }
        if (!(activity instanceof IBridgePictureBehavior)) {
            throw new NullPointerException(o1.a(ProtectedSandApp.s("ᗔ\u0001"), IBridgePictureBehavior.class));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        selectorConfig.onResultCallListener = null;
        return new PictureSelectorFragment();
    }

    public PictureSelectorFragment buildLaunch(int i4, OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗕ\u0001"));
        }
        if (onResultCallbackListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗗ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = true;
        selectorConfig.isActivityResultBack = false;
        selectorConfig.onResultCallListener = onResultCallbackListener;
        FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗖ\u0001"));
        }
        PictureSelectorFragment pictureSelectorFragment = new PictureSelectorFragment();
        Fragment s02 = supportFragmentManager.s0(pictureSelectorFragment.getFragmentTag());
        if (s02 != null) {
            supportFragmentManager.u().C(s02).s();
        }
        supportFragmentManager.u().h(i4, pictureSelectorFragment, pictureSelectorFragment.getFragmentTag()).p(pictureSelectorFragment.getFragmentTag()).s();
        return pictureSelectorFragment;
    }

    public void forResult(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗕ\u0001"));
        }
        if (onResultCallbackListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗗ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = true;
        selectorConfig.isActivityResultBack = false;
        selectorConfig.onResultCallListener = onResultCallbackListener;
        if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
            throw new NullPointerException(ProtectedSandApp.s("ᗘ\u0001"));
        }
        activity.startActivity(new Intent(activity, (Class<?>) PictureSelectorSupporterActivity.class));
        activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, R.anim.ps_anim_fade_in);
    }

    public PictureSelectionModel isAutoVideoPlay(boolean z4) {
        this.selectionConfig.isAutoVideoPlay = z4;
        return this;
    }

    public PictureSelectionModel isAutomaticTitleRecyclerTop(boolean z4) {
        this.selectionConfig.isAutomaticTitleRecyclerTop = z4;
        return this;
    }

    public PictureSelectionModel isBmp(boolean z4) {
        this.selectionConfig.isBmp = z4;
        return this;
    }

    public PictureSelectionModel isCameraAroundState(boolean z4) {
        this.selectionConfig.isCameraAroundState = z4;
        return this;
    }

    public PictureSelectionModel isCameraForegroundService(boolean z4) {
        this.selectionConfig.isCameraForegroundService = z4;
        return this;
    }

    public PictureSelectionModel isCameraRotateImage(boolean z4) {
        this.selectionConfig.isCameraRotateImage = z4;
        return this;
    }

    public PictureSelectionModel isDirectReturnSingle(boolean z4) {
        boolean z5 = false;
        if (z4) {
            this.selectionConfig.isFastSlidingSelect = false;
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1 && z4) {
            z5 = true;
        }
        selectorConfig.isDirectReturnSingle = z5;
        return this;
    }

    public PictureSelectionModel isDisplayCamera(boolean z4) {
        this.selectionConfig.isDisplayCamera = z4;
        return this;
    }

    public PictureSelectionModel isDisplayTimeAxis(boolean z4) {
        this.selectionConfig.isDisplayTimeAxis = z4;
        return this;
    }

    public PictureSelectionModel isEmptyResultReturn(boolean z4) {
        this.selectionConfig.isEmptyResultReturn = z4;
        return this;
    }

    @Deprecated
    public PictureSelectionModel isEnableVideoSize(boolean z4) {
        this.selectionConfig.isSyncWidthAndHeight = z4;
        return this;
    }

    public PictureSelectionModel isFastSlidingSelect(boolean z4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.isDirectReturnSingle) {
            selectorConfig.isFastSlidingSelect = false;
        } else {
            selectorConfig.isFastSlidingSelect = z4;
        }
        return this;
    }

    public PictureSelectionModel isFilterSizeDuration(boolean z4) {
        this.selectionConfig.isFilterSizeDuration = z4;
        return this;
    }

    public PictureSelectionModel isGif(boolean z4) {
        this.selectionConfig.isGif = z4;
        return this;
    }

    public PictureSelectionModel isHeic(boolean z4) {
        this.selectionConfig.isHeic = z4;
        return this;
    }

    public PictureSelectionModel isLoopAutoVideoPlay(boolean z4) {
        this.selectionConfig.isLoopAutoPlay = z4;
        return this;
    }

    public PictureSelectionModel isMaxSelectEnabledMask(boolean z4) {
        this.selectionConfig.isMaxSelectEnabledMask = z4;
        return this;
    }

    public PictureSelectionModel isNewKeyBackMode(boolean z4) {
        this.selectionConfig.isNewKeyBackMode = z4;
        return this;
    }

    public PictureSelectionModel isOnlyObtainSandboxDir(boolean z4) {
        this.selectionConfig.isOnlySandboxDir = z4;
        return this;
    }

    public PictureSelectionModel isOpenClickSound(boolean z4) {
        this.selectionConfig.isOpenClickSound = z4;
        return this;
    }

    public PictureSelectionModel isOriginalControl(boolean z4) {
        this.selectionConfig.isOriginalControl = z4;
        return this;
    }

    public PictureSelectionModel isOriginalSkipCompress(boolean z4) {
        this.selectionConfig.isOriginalSkipCompress = z4;
        return this;
    }

    public PictureSelectionModel isPageStrategy(boolean z4) {
        this.selectionConfig.isPageStrategy = z4;
        return this;
    }

    public PictureSelectionModel isPageSyncAlbumCount(boolean z4) {
        this.selectionConfig.isPageSyncAsCount = z4;
        return this;
    }

    public PictureSelectionModel isPreloadFirst(boolean z4) {
        this.selectionConfig.isPreloadFirst = z4;
        return this;
    }

    public PictureSelectionModel isPreviewAudio(boolean z4) {
        this.selectionConfig.isEnablePreviewAudio = z4;
        return this;
    }

    public PictureSelectionModel isPreviewFullScreenMode(boolean z4) {
        this.selectionConfig.isPreviewFullScreenMode = z4;
        return this;
    }

    public PictureSelectionModel isPreviewImage(boolean z4) {
        this.selectionConfig.isEnablePreviewImage = z4;
        return this;
    }

    public PictureSelectionModel isPreviewVideo(boolean z4) {
        this.selectionConfig.isEnablePreviewVideo = z4;
        return this;
    }

    public PictureSelectionModel isPreviewZoomEffect(boolean z4) {
        if (this.selectionConfig.chooseMode == SelectMimeType.ofAudio()) {
            this.selectionConfig.isPreviewZoomEffect = false;
        } else {
            this.selectionConfig.isPreviewZoomEffect = z4;
        }
        return this;
    }

    public PictureSelectionModel isQuickCapture(boolean z4) {
        this.selectionConfig.isQuickCapture = z4;
        return this;
    }

    public PictureSelectionModel isSelectZoomAnim(boolean z4) {
        this.selectionConfig.isSelectZoomAnim = z4;
        return this;
    }

    public PictureSelectionModel isSyncCover(boolean z4) {
        this.selectionConfig.isSyncCover = z4;
        return this;
    }

    public PictureSelectionModel isSyncWidthAndHeight(boolean z4) {
        this.selectionConfig.isSyncWidthAndHeight = z4;
        return this;
    }

    public PictureSelectionModel isUseSystemVideoPlayer(boolean z4) {
        this.selectionConfig.isUseSystemVideoPlayer = z4;
        return this;
    }

    public PictureSelectionModel isVideoPauseResumePlay(boolean z4) {
        this.selectionConfig.isPauseResumePlay = z4;
        return this;
    }

    public PictureSelectionModel isWebp(boolean z4) {
        this.selectionConfig.isWebp = z4;
        return this;
    }

    public PictureSelectionModel isWithSelectVideoImage(boolean z4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isWithVideoImage = selectorConfig.chooseMode == SelectMimeType.ofAll() && z4;
        return this;
    }

    public PictureSelectionModel setAddBitmapWatermarkListener(OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public PictureSelectionModel setAttachViewLifecycle(IBridgeViewLifecycle iBridgeViewLifecycle) {
        this.selectionConfig.viewLifecycle = iBridgeViewLifecycle;
        return this;
    }

    public PictureSelectionModel setCameraImageFormat(String str) {
        this.selectionConfig.cameraImageFormat = str;
        return this;
    }

    public PictureSelectionModel setCameraImageFormatForQ(String str) {
        this.selectionConfig.cameraImageFormatForQ = str;
        return this;
    }

    public PictureSelectionModel setCameraInterceptListener(OnCameraInterceptListener onCameraInterceptListener) {
        this.selectionConfig.onCameraInterceptListener = onCameraInterceptListener;
        return this;
    }

    public PictureSelectionModel setCameraVideoFormat(String str) {
        this.selectionConfig.cameraVideoFormat = str;
        return this;
    }

    public PictureSelectionModel setCameraVideoFormatForQ(String str) {
        this.selectionConfig.cameraVideoFormatForQ = str;
        return this;
    }

    @Deprecated
    public PictureSelectionModel setCompressEngine(CompressEngine compressEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressEngine = compressEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    @Deprecated
    public PictureSelectionModel setCropEngine(CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public PictureSelectionModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionModel setDefaultAlbumName(String str) {
        this.selectionConfig.defaultAlbumName = str;
        return this;
    }

    public PictureSelectionModel setDefaultLanguage(int i4) {
        this.selectionConfig.defaultLanguage = i4;
        return this;
    }

    public PictureSelectionModel setEditMediaInterceptListener(OnMediaEditInterceptListener onMediaEditInterceptListener) {
        this.selectionConfig.onEditMediaEventListener = onMediaEditInterceptListener;
        return this;
    }

    @Deprecated
    public PictureSelectionModel setExtendLoaderEngine(ExtendLoaderEngine extendLoaderEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.loaderDataEngine = extendLoaderEngine;
        selectorConfig.isLoaderDataEngine = true;
        return this;
    }

    public PictureSelectionModel setFilterMaxFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.filterMaxFileSize = j4;
        } else {
            this.selectionConfig.filterMaxFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionModel setFilterMinFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.filterMinFileSize = j4;
        } else {
            this.selectionConfig.filterMinFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionModel setFilterVideoMaxSecond(int i4) {
        this.selectionConfig.filterVideoMaxSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionModel setFilterVideoMinSecond(int i4) {
        this.selectionConfig.filterVideoMinSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionModel setGridItemSelectAnimListener(OnGridItemSelectAnimListener onGridItemSelectAnimListener) {
        this.selectionConfig.onItemSelectAnimListener = onGridItemSelectAnimListener;
        return this;
    }

    public PictureSelectionModel setImageEngine(ImageEngine imageEngine) {
        this.selectionConfig.imageEngine = imageEngine;
        return this;
    }

    public PictureSelectionModel setImageSpanCount(int i4) {
        this.selectionConfig.imageSpanCount = i4;
        return this;
    }

    public PictureSelectionModel setInjectLayoutResourceListener(OnInjectLayoutResourceListener onInjectLayoutResourceListener) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isInjectLayoutResource = onInjectLayoutResourceListener != null;
        selectorConfig.onLayoutResourceListener = onInjectLayoutResourceListener;
        return this;
    }

    public PictureSelectionModel setLanguage(int i4) {
        this.selectionConfig.language = i4;
        return this;
    }

    public PictureSelectionModel setLoaderFactoryEngine(IBridgeLoaderFactory iBridgeLoaderFactory) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.loaderFactory = iBridgeLoaderFactory;
        selectorConfig.isLoaderFactoryEngine = true;
        return this;
    }

    public PictureSelectionModel setMagicalEffectInterpolator(InterpolatorFactory interpolatorFactory) {
        this.selectionConfig.interpolatorFactory = interpolatorFactory;
        return this;
    }

    public PictureSelectionModel setMaxSelectNum(int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1) {
            i4 = 1;
        }
        selectorConfig.maxSelectNum = i4;
        return this;
    }

    public PictureSelectionModel setMaxVideoSelectNum(int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.chooseMode == SelectMimeType.ofVideo()) {
            i4 = 0;
        }
        selectorConfig.maxVideoSelectNum = i4;
        return this;
    }

    public PictureSelectionModel setMinAudioSelectNum(int i4) {
        this.selectionConfig.minAudioSelectNum = i4;
        return this;
    }

    public PictureSelectionModel setMinSelectNum(int i4) {
        this.selectionConfig.minSelectNum = i4;
        return this;
    }

    public PictureSelectionModel setMinVideoSelectNum(int i4) {
        this.selectionConfig.minVideoSelectNum = i4;
        return this;
    }

    public PictureSelectionModel setOfAllCameraType(int i4) {
        this.selectionConfig.ofAllCameraType = i4;
        return this;
    }

    public PictureSelectionModel setOutputAudioDir(String str) {
        this.selectionConfig.outPutAudioDir = str;
        return this;
    }

    public PictureSelectionModel setOutputAudioFileName(String str) {
        this.selectionConfig.outPutAudioFileName = str;
        return this;
    }

    public PictureSelectionModel setOutputCameraDir(String str) {
        this.selectionConfig.outPutCameraDir = str;
        return this;
    }

    public PictureSelectionModel setOutputCameraImageFileName(String str) {
        this.selectionConfig.outPutCameraImageFileName = str;
        return this;
    }

    public PictureSelectionModel setOutputCameraVideoFileName(String str) {
        this.selectionConfig.outPutCameraVideoFileName = str;
        return this;
    }

    public PictureSelectionModel setPermissionDeniedListener(OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public PictureSelectionModel setPermissionDescriptionListener(OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public PictureSelectionModel setPermissionsInterceptListener(OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public PictureSelectionModel setPreviewInterceptListener(OnPreviewInterceptListener onPreviewInterceptListener) {
        this.selectionConfig.onPreviewInterceptListener = onPreviewInterceptListener;
        return this;
    }

    public PictureSelectionModel setQueryFilterListener(OnQueryFilterListener onQueryFilterListener) {
        this.selectionConfig.onQueryFilterListener = onQueryFilterListener;
        return this;
    }

    public PictureSelectionModel setQueryOnlyMimeType(String... strArr) {
        for (String str : strArr) {
            if (PictureMimeType.isHasImage(str)) {
                if (!this.selectionConfig.queryOnlyImageList.contains(str)) {
                    this.selectionConfig.queryOnlyImageList.add(str);
                }
            } else if (PictureMimeType.isHasVideo(str)) {
                if (!this.selectionConfig.queryOnlyVideoList.contains(str)) {
                    this.selectionConfig.queryOnlyVideoList.add(str);
                }
            } else if (PictureMimeType.isHasAudio(str) && !this.selectionConfig.queryOnlyAudioList.contains(str)) {
                this.selectionConfig.queryOnlyAudioList.add(str);
            }
        }
        return this;
    }

    public PictureSelectionModel setQuerySandboxDir(String str) {
        this.selectionConfig.sandboxDir = str;
        return this;
    }

    public PictureSelectionModel setQuerySortOrder(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.selectionConfig.sortOrder = str;
        }
        return this;
    }

    public PictureSelectionModel setRecordAudioInterceptListener(OnRecordAudioInterceptListener onRecordAudioInterceptListener) {
        this.selectionConfig.onRecordAudioListener = onRecordAudioInterceptListener;
        return this;
    }

    public PictureSelectionModel setRecordVideoMaxSecond(int i4) {
        this.selectionConfig.recordVideoMaxSecond = i4;
        return this;
    }

    public PictureSelectionModel setRecordVideoMinSecond(int i4) {
        this.selectionConfig.recordVideoMinSecond = i4;
        return this;
    }

    public PictureSelectionModel setRecyclerAnimationMode(int i4) {
        this.selectionConfig.animationMode = i4;
        return this;
    }

    public PictureSelectionModel setRequestedOrientation(int i4) {
        this.selectionConfig.requestedOrientation = i4;
        return this;
    }

    @Deprecated
    public PictureSelectionModel setSandboxFileEngine(SandboxFileEngine sandboxFileEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.sandboxFileEngine = sandboxFileEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public PictureSelectionModel setSelectAnimListener(OnSelectAnimListener onSelectAnimListener) {
        this.selectionConfig.onSelectAnimListener = onSelectAnimListener;
        return this;
    }

    public PictureSelectionModel setSelectFilterListener(OnSelectFilterListener onSelectFilterListener) {
        this.selectionConfig.onSelectFilterListener = onSelectFilterListener;
        return this;
    }

    public PictureSelectionModel setSelectLimitTipsListener(OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public PictureSelectionModel setSelectMaxDurationSecond(int i4) {
        this.selectionConfig.selectMaxDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionModel setSelectMaxFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMaxFileSize = j4;
        } else {
            this.selectionConfig.selectMaxFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionModel setSelectMinDurationSecond(int i4) {
        this.selectionConfig.selectMinDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionModel setSelectMinFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMinFileSize = j4;
        } else {
            this.selectionConfig.selectMinFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionModel setSelectedData(List<LocalMedia> list) {
        if (list == null) {
            return this;
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            selectorConfig.selectedResult.clear();
        } else {
            selectorConfig.addAllSelectResult(new ArrayList<>(list));
        }
        return this;
    }

    public PictureSelectionModel setSelectionMode(int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.selectionMode = i4;
        selectorConfig.maxSelectNum = i4 != 1 ? selectorConfig.maxSelectNum : 1;
        return this;
    }

    public PictureSelectionModel setSelectorUIStyle(PictureSelectorStyle pictureSelectorStyle) {
        if (pictureSelectorStyle != null) {
            this.selectionConfig.selectorStyle = pictureSelectorStyle;
        }
        return this;
    }

    public PictureSelectionModel setSkipCropMimeType(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.selectionConfig.skipCropList.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public PictureSelectionModel setVideoPlayerEngine(VideoPlayerEngine videoPlayerEngine) {
        this.selectionConfig.videoPlayerEngine = videoPlayerEngine;
        return this;
    }

    @Deprecated
    public PictureSelectionModel setVideoQuality(int i4) {
        this.selectionConfig.videoQuality = i4;
        return this;
    }

    public PictureSelectionModel setVideoThumbnailListener(OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public PictureSelectionModel isPageStrategy(boolean z4, int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z4;
        if (i4 < 10) {
            i4 = 60;
        }
        selectorConfig.pageSize = i4;
        return this;
    }

    public PictureSelectionModel setCropEngine(CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    public PictureSelectionModel setCompressEngine(CompressFileEngine compressFileEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressFileEngine = compressFileEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    @Deprecated
    public PictureSelectionModel isPageStrategy(boolean z4, boolean z5) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z4;
        selectorConfig.isFilterInvalidFile = z5;
        return this;
    }

    public PictureSelectionModel setSandboxFileEngine(UriToFileTransformEngine uriToFileTransformEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    @Deprecated
    public PictureSelectionModel isPageStrategy(boolean z4, int i4, boolean z5) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z4;
        if (i4 < 10) {
            i4 = 60;
        }
        selectorConfig.pageSize = i4;
        selectorConfig.isFilterInvalidFile = z5;
        return this;
    }

    public void forResult(int i4) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = false;
            selectorConfig.isActivityResultBack = true;
            if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
                throw new NullPointerException(ProtectedSandApp.s("ᗘ\u0001"));
            }
            Intent intent = new Intent(activity, (Class<?>) PictureSelectorSupporterActivity.class);
            Fragment fragment = this.selector.getFragment();
            if (fragment != null) {
                fragment.startActivityForResult(intent, i4);
            } else {
                activity.startActivityForResult(intent, i4);
            }
            activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, R.anim.ps_anim_fade_in);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗕ\u0001"));
    }

    public void forResult(h<Intent> hVar) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗕ\u0001"));
        }
        if (hVar != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = false;
            selectorConfig.isActivityResultBack = true;
            if (selectorConfig.imageEngine == null && selectorConfig.chooseMode != SelectMimeType.ofAudio()) {
                throw new NullPointerException(ProtectedSandApp.s("ᗘ\u0001"));
            }
            hVar.b(new Intent(activity, (Class<?>) PictureSelectorSupporterActivity.class));
            activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, R.anim.ps_anim_fade_in);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗙ\u0001"));
    }
}
