package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Intent;
import androidx.content.preferences.protobuf.o1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.PictureSelectorSystemFragment;
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
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnPermissionDeniedListener;
import com.luck.picture.lib.interfaces.OnPermissionDescriptionListener;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.luck.picture.lib.interfaces.OnSelectFilterListener;
import com.luck.picture.lib.interfaces.OnSelectLimitTipsListener;
import com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener;
import com.luck.picture.lib.utils.DoubleUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PictureSelectionSystemModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionSystemModel(PictureSelector pictureSelector, int i4) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i4;
        selectorConfig.isPreviewFullScreenMode = false;
        selectorConfig.isPreviewZoomEffect = false;
    }

    public void forSystemResult(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗨ\u0001"));
        }
        if (onResultCallbackListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗩ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.onResultCallListener = onResultCallbackListener;
        selectorConfig.isResultListenerBack = true;
        selectorConfig.isActivityResultBack = false;
        FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗦ\u0001"));
        }
        String str = PictureSelectorSystemFragment.TAG;
        Fragment s02 = supportFragmentManager.s0(str);
        if (s02 != null) {
            supportFragmentManager.u().C(s02).s();
        }
        FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureSelectorSystemFragment.newInstance());
    }

    public void forSystemResultActivity(int i4) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗨ\u0001"));
        }
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isResultListenerBack = false;
        selectorConfig.isActivityResultBack = true;
        Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
        intent.putExtra(ProtectedSandApp.s("ᗪ\u0001"), 1);
        Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i4);
        } else {
            activity.startActivityForResult(intent, i4);
        }
        activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public PictureSelectionSystemModel isNewKeyBackMode(boolean z4) {
        this.selectionConfig.isNewKeyBackMode = z4;
        return this;
    }

    public PictureSelectionSystemModel isOriginalControl(boolean z4) {
        this.selectionConfig.isCheckOriginalImage = z4;
        return this;
    }

    public PictureSelectionSystemModel isOriginalSkipCompress(boolean z4) {
        this.selectionConfig.isOriginalSkipCompress = z4;
        return this;
    }

    public PictureSelectionSystemModel setAddBitmapWatermarkListener(OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    @Deprecated
    public PictureSelectionSystemModel setCompressEngine(CompressEngine compressEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressEngine = compressEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    @Deprecated
    public PictureSelectionSystemModel setCropEngine(CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public PictureSelectionSystemModel setCustomLoadingListener(OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public PictureSelectionSystemModel setPermissionDeniedListener(OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public PictureSelectionSystemModel setPermissionDescriptionListener(OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public PictureSelectionSystemModel setPermissionsInterceptListener(OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    @Deprecated
    public PictureSelectionSystemModel setSandboxFileEngine(SandboxFileEngine sandboxFileEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.sandboxFileEngine = sandboxFileEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public PictureSelectionSystemModel setSelectFilterListener(OnSelectFilterListener onSelectFilterListener) {
        this.selectionConfig.onSelectFilterListener = onSelectFilterListener;
        return this;
    }

    public PictureSelectionSystemModel setSelectLimitTipsListener(OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public PictureSelectionSystemModel setSelectMaxDurationSecond(int i4) {
        this.selectionConfig.selectMaxDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionSystemModel setSelectMaxFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMaxFileSize = j4;
        } else {
            this.selectionConfig.selectMaxFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionSystemModel setSelectMinDurationSecond(int i4) {
        this.selectionConfig.selectMinDurationSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionSystemModel setSelectMinFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.selectMinFileSize = j4;
        } else {
            this.selectionConfig.selectMinFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionSystemModel setSelectionMode(int i4) {
        this.selectionConfig.selectionMode = i4;
        return this;
    }

    public PictureSelectionSystemModel setSkipCropMimeType(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.selectionConfig.skipCropList.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public PictureSelectionSystemModel setVideoThumbnailListener(OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public PictureSelectionSystemModel setCropEngine(CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    public PictureSelectionSystemModel setCompressEngine(CompressFileEngine compressFileEngine) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.compressFileEngine = compressFileEngine;
        selectorConfig.isCompressEngine = true;
        return this;
    }

    public PictureSelectionSystemModel setSandboxFileEngine(UriToFileTransformEngine uriToFileTransformEngine) {
        if (SdkVersionUtils.isQ()) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            selectorConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public void forSystemResultActivity(h<Intent> hVar) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗨ\u0001"));
        }
        if (hVar != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = false;
            selectorConfig.isActivityResultBack = true;
            Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
            intent.putExtra(ProtectedSandApp.s("ᗪ\u0001"), 1);
            hVar.b(intent);
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗫ\u0001"));
    }

    public void forSystemResult() {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity != null) {
            if (activity instanceof IBridgePictureBehavior) {
                SelectorConfig selectorConfig = this.selectionConfig;
                selectorConfig.isActivityResultBack = true;
                selectorConfig.onResultCallListener = null;
                selectorConfig.isResultListenerBack = false;
                FragmentManager supportFragmentManager = activity instanceof FragmentActivity ? ((FragmentActivity) activity).getSupportFragmentManager() : null;
                if (supportFragmentManager != null) {
                    String str = PictureSelectorSystemFragment.TAG;
                    Fragment s02 = supportFragmentManager.s0(str);
                    if (s02 != null) {
                        supportFragmentManager.u().C(s02).s();
                    }
                    FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, PictureSelectorSystemFragment.newInstance());
                    return;
                }
                throw new NullPointerException(ProtectedSandApp.s("ᗦ\u0001"));
            }
            throw new NullPointerException(o1.a(ProtectedSandApp.s("ᗧ\u0001"), IBridgePictureBehavior.class));
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗨ\u0001"));
    }

    public void forSystemResultActivity(OnResultCallbackListener<LocalMedia> onResultCallbackListener) {
        if (DoubleUtils.isFastDoubleClick()) {
            return;
        }
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗨ\u0001"));
        }
        if (onResultCallbackListener != null) {
            SelectorConfig selectorConfig = this.selectionConfig;
            selectorConfig.isResultListenerBack = true;
            selectorConfig.isActivityResultBack = false;
            selectorConfig.onResultCallListener = onResultCallbackListener;
            Intent intent = new Intent(activity, (Class<?>) PictureSelectorTransparentActivity.class);
            intent.putExtra(ProtectedSandApp.s("ᗪ\u0001"), 1);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗩ\u0001"));
    }
}
