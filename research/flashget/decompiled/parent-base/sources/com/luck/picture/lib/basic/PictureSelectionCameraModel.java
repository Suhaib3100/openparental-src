package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import androidx.content.preferences.protobuf.o1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.engine.CompressEngine;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.engine.CropEngine;
import com.luck.picture.lib.engine.CropFileEngine;
import com.luck.picture.lib.engine.SandboxFileEngine;
import com.luck.picture.lib.engine.UriToFileTransformEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener;
import com.luck.picture.lib.interfaces.OnCameraInterceptListener;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnPermissionDeniedListener;
import com.luck.picture.lib.interfaces.OnPermissionDescriptionListener;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.luck.picture.lib.interfaces.OnSelectLimitTipsListener;
import com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener;
import com.luck.picture.lib.utils.DoubleUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class PictureSelectionCameraModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionCameraModel(PictureSelector pictureSelector, int i4) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i4;
        selectorConfig.isOnlyCamera = true;
        selectorConfig.isDisplayTimeAxis = false;
        selectorConfig.isPreviewFullScreenMode = false;
        selectorConfig.isPreviewZoomEffect = false;
        selectorConfig.isOpenClickSound = false;
    }

    private PictureSelectionCameraModel setMaxSelectNum(int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1) {
            i4 = 1;
        }
        selectorConfig.maxSelectNum = i4;
        return this;
    }

    public PictureOnlyCameraFragment build() {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        if (!(activity instanceof IBridgePictureBehavior)) {
            throw new NullPointerException(o1.a(ProtectedSandApp.s("ᗎ\u0001"), IBridgePictureBehavior.class));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        selectorConfig.onResultCallListener = null;
        return new PictureOnlyCameraFragment();
    }

    public PictureOnlyCameraFragment buildLaunch(int i4, OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        if (onResultCallbackListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗑ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = true;
        selectorConfig.isActivityResultBack = false;
        selectorConfig.onResultCallListener = onResultCallbackListener;
        FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗐ\u0001"));
        }
        PictureOnlyCameraFragment pictureOnlyCameraFragment = new PictureOnlyCameraFragment();
        Fragment s02 = supportFragmentManager.s0(pictureOnlyCameraFragment.getFragmentTag());
        if (s02 != null) {
            supportFragmentManager.u().C(s02).s();
        }
        supportFragmentManager.u().h(i4, pictureOnlyCameraFragment, pictureOnlyCameraFragment.getFragmentTag()).p(pictureOnlyCameraFragment.getFragmentTag()).s();
        return pictureOnlyCameraFragment;
    }

    public void forResult() {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗐ\u0001"));
        }
        if (!(activity instanceof IBridgePictureBehavior)) {
            throw new NullPointerException(o1.a(ProtectedSandApp.s("ᗒ\u0001"), IBridgePictureBehavior.class));
        }
        String str = PictureOnlyCameraFragment.TAG;
        Fragment s02 = supportFragmentManager.s0(str);
        if (s02 != null) {
            supportFragmentManager.u().C(s02).s();
        }
        FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureOnlyCameraFragment.newInstance());
    }

    public void forResultActivity(int i4) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
        Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i4);
        } else {
            activity.startActivityForResult(intent, i4);
        }
        activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public PictureSelectionCameraModel isCameraAroundState(boolean z4) {
        this.selectionConfig.isCameraAroundState = z4;
        return this;
    }

    public PictureSelectionCameraModel isCameraForegroundService(boolean z4) {
        this.selectionConfig.isCameraForegroundService = z4;
        return this;
    }

    public PictureSelectionCameraModel isCameraRotateImage(boolean z4) {
        this.selectionConfig.isCameraRotateImage = z4;
        return this;
    }

    public PictureSelectionCameraModel isNewKeyBackMode(boolean z4) {
        this.selectionConfig.isNewKeyBackMode = z4;
        return this;
    }

    public PictureSelectionCameraModel isOriginalControl(boolean z4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isOriginalControl = z4;
        selectorConfig.isCheckOriginalImage = z4;
        return this;
    }

    public PictureSelectionCameraModel isOriginalSkipCompress(boolean z4) {
        this.selectionConfig.isOriginalSkipCompress = z4;
        return this;
    }

    public PictureSelectionCameraModel isQuickCapture(boolean z4) {
        this.selectionConfig.isQuickCapture = z4;
        return this;
    }

    public PictureSelectionCameraModel setAddBitmapWatermarkListener(OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public PictureSelectionCameraModel setCameraImageFormat(String str) {
        this.selectionConfig.cameraImageFormat = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraImageFormatForQ(String str) {
        this.selectionConfig.cameraImageFormatForQ = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraInterceptListener(OnCameraInterceptListener onCameraInterceptListener) {
        this.selectionConfig.onCameraInterceptListener = onCameraInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setCameraVideoFormat(String str) {
        this.selectionConfig.cameraVideoFormat = str;
        return this;
    }

    public PictureSelectionCameraModel setCameraVideoFormatForQ(String str) {
        this.selectionConfig.cameraVideoFormatForQ = str;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setCompressEngine(CompressEngine compressEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressEngine = compressEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setCropEngine(CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public PictureSelectionCameraModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionCameraModel setDefaultLanguage(int i4) {
        this.selectionConfig.defaultLanguage = i4;
        return this;
    }

    public PictureSelectionCameraModel setLanguage(int i4) {
        this.selectionConfig.language = i4;
        return this;
    }

    public PictureSelectionCameraModel setMaxVideoSelectNum(int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.chooseMode == SelectMimeType.ofVideo()) {
            i4 = 0;
        }
        selectorConfig.maxVideoSelectNum = i4;
        return this;
    }

    public PictureSelectionCameraModel setOfAllCameraType(int i4) {
        this.selectionConfig.ofAllCameraType = i4;
        return this;
    }

    public PictureSelectionCameraModel setOutputAudioDir(String str) {
        this.selectionConfig.outPutAudioDir = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputAudioFileName(String str) {
        this.selectionConfig.outPutAudioFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraDir(String str) {
        this.selectionConfig.outPutCameraDir = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraImageFileName(String str) {
        this.selectionConfig.outPutCameraImageFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setOutputCameraVideoFileName(String str) {
        this.selectionConfig.outPutCameraVideoFileName = str;
        return this;
    }

    public PictureSelectionCameraModel setPermissionDeniedListener(OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public PictureSelectionCameraModel setPermissionDescriptionListener(OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public PictureSelectionCameraModel setPermissionsInterceptListener(OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setRecordAudioInterceptListener(OnRecordAudioInterceptListener onRecordAudioInterceptListener) {
        this.selectionConfig.onRecordAudioListener = onRecordAudioInterceptListener;
        return this;
    }

    public PictureSelectionCameraModel setRecordVideoMaxSecond(int i4) {
        this.selectionConfig.recordVideoMaxSecond = i4;
        return this;
    }

    public PictureSelectionCameraModel setRecordVideoMinSecond(int i4) {
        this.selectionConfig.recordVideoMinSecond = i4;
        return this;
    }

    public PictureSelectionCameraModel setRequestedOrientation(int i4) {
        this.selectionConfig.requestedOrientation = i4;
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setSandboxFileEngine(SandboxFileEngine sandboxFileEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.sandboxFileEngine = sandboxFileEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public PictureSelectionCameraModel setSelectLimitTipsListener(OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public PictureSelectionCameraModel setSelectMaxDurationSecond(int i4) {
        this.selectionConfig.selectMaxDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionCameraModel setSelectMaxFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMaxFileSize = j4;
        } else {
            this.selectionConfig.selectMaxFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionCameraModel setSelectMinDurationSecond(int i4) {
        this.selectionConfig.selectMinDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionCameraModel setSelectMinFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMinFileSize = j4;
        } else {
            this.selectionConfig.selectMinFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionCameraModel setSelectedData(List<LocalMedia> list) {
        if (list == null) {
            return this;
        }
        setMaxSelectNum(list.size() + 1);
        setMaxVideoSelectNum(list.size() + 1);
        SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            selectorConfig.selectedResult.clear();
        } else {
            selectorConfig.addAllSelectResult(new ArrayList<>(list));
        }
        return this;
    }

    @Deprecated
    public PictureSelectionCameraModel setVideoQuality(int i4) {
        this.selectionConfig.videoQuality = i4;
        return this;
    }

    public PictureSelectionCameraModel setVideoThumbnailListener(OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public PictureSelectionCameraModel setCropEngine(CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    public PictureSelectionCameraModel setCompressEngine(CompressFileEngine compressFileEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressFileEngine = compressFileEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    public PictureSelectionCameraModel setSandboxFileEngine(UriToFileTransformEngine uriToFileTransformEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public void forResultActivity(h<Intent> hVar) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        if (hVar != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = false;
            selectorConfig.isActivityResultBack = true;
            hVar.b(new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class));
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗓ\u0001"));
    }

    public void forResultActivity(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        if (onResultCallbackListener != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = true;
            selectorConfig.isActivityResultBack = false;
            selectorConfig.onResultCallListener = onResultCallbackListener;
            activity.startActivity(new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class));
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗑ\u0001"));
    }

    public void forResult(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗏ\u0001"));
        }
        if (onResultCallbackListener != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = true;
            selectorConfig.isActivityResultBack = false;
            selectorConfig.onResultCallListener = onResultCallbackListener;
            FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                String str = PictureOnlyCameraFragment.TAG;
                Fragment s02 = supportFragmentManager.s0(str);
                if (s02 != null) {
                    supportFragmentManager.u().C(s02).s();
                }
                FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureOnlyCameraFragment.newInstance());
                return;
            }
            throw new NullPointerException(ProtectedSandApp.s("ᗐ\u0001"));
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗑ\u0001"));
    }
}
