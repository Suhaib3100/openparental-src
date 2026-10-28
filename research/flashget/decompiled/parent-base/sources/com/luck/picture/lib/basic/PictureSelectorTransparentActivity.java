package com.luck.picture.lib.basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.q0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.PictureSelectorSystemFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.immersive.ImmersiveManager;
import com.luck.picture.lib.interfaces.OnInjectActivityPreviewListener;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.StyleUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class PictureSelectorTransparentActivity extends AppCompatActivity {
    private SelectorConfig selectorConfig;

    private void immersive() {
        if (this.selectorConfig.selectorStyle == null) {
            SelectorProviders.getInstance().getSelectorConfig();
        }
        SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int statusBarColor = selectMainStyle.getStatusBarColor();
        int navigationBarColor = selectMainStyle.getNavigationBarColor();
        boolean isDarkStatusBarBlack = selectMainStyle.isDarkStatusBarBlack();
        if (!StyleUtils.checkStyleValidity(statusBarColor)) {
            statusBarColor = d.getColor(this, R.color.ps_color_grey);
        }
        if (!StyleUtils.checkStyleValidity(navigationBarColor)) {
            navigationBarColor = d.getColor(this, R.color.ps_color_grey);
        }
        ImmersiveManager.immersiveAboveAPI23(this, statusBarColor, navigationBarColor, isDarkStatusBarBlack);
    }

    private void initSelectorConfig() {
        this.selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
    }

    private boolean isExternalPreview() {
        return getIntent().getIntExtra(ProtectedSandApp.s("ᗭ\u0001"), 0) == 2;
    }

    @SuppressLint({"RtlHardcoded"})
    private void setActivitySize() {
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    private void setupFragment() {
        String str;
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment;
        Fragment fragment;
        int intExtra = getIntent().getIntExtra(ProtectedSandApp.s("ᗭ\u0001"), 0);
        if (intExtra == 1) {
            str = PictureSelectorSystemFragment.TAG;
            fragment = PictureSelectorSystemFragment.newInstance();
        } else if (intExtra == 2) {
            OnInjectActivityPreviewListener onInjectActivityPreviewListener = this.selectorConfig.onInjectActivityPreviewListener;
            PictureSelectorPreviewFragment onInjectPreviewFragment = onInjectActivityPreviewListener != null ? onInjectActivityPreviewListener.onInjectPreviewFragment() : null;
            if (onInjectPreviewFragment != null) {
                pictureSelectorPreviewFragment = onInjectPreviewFragment;
                str = onInjectPreviewFragment.getFragmentTag();
            } else {
                str = PictureSelectorPreviewFragment.TAG;
                pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.newInstance();
            }
            int intExtra2 = getIntent().getIntExtra(ProtectedSandApp.s("ᗮ\u0001"), 0);
            ArrayList<LocalMedia> arrayList = new ArrayList<>(this.selectorConfig.selectedPreviewResult);
            pictureSelectorPreviewFragment.setExternalPreviewData(intExtra2, arrayList.size(), arrayList, getIntent().getBooleanExtra(ProtectedSandApp.s("ᗯ\u0001"), false));
            fragment = pictureSelectorPreviewFragment;
        } else {
            str = PictureOnlyCameraFragment.TAG;
            fragment = PictureOnlyCameraFragment.newInstance();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment s02 = supportFragmentManager.s0(str);
        if (s02 != null) {
            supportFragmentManager.u().C(s02).s();
        }
        FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, fragment);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (getIntent().getIntExtra(ProtectedSandApp.s("ᗭ\u0001"), 0) == 2) {
            SelectorConfig selectorConfig = this.selectorConfig;
            if (!selectorConfig.isPreviewZoomEffect) {
                overridePendingTransition(0, selectorConfig.selectorStyle.getWindowAnimationStyle().activityExitAnimation);
                return;
            }
        }
        overridePendingTransition(0, R.anim.ps_anim_fade_out);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        initSelectorConfig();
        immersive();
        setContentView(R.layout.ps_empty);
        if (!isExternalPreview()) {
            setActivitySize();
        }
        setupFragment();
    }
}
