package com.luck.picture.lib;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.result.h;
import b.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnRequestPermissionListener;
import com.luck.picture.lib.permissions.PermissionChecker;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.luck.picture.lib.permissions.PermissionResultCallback;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.ToastUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class PictureSelectorSystemFragment extends PictureCommonFragment {
    public static final String TAG = ProtectedSandApp.s("ᖿ\u0001");
    private h<String> mContentLauncher;
    private h<String> mContentsLauncher;
    private h<String> mDocMultipleLauncher;
    private h<String> mDocSingleLauncher;

    private void createContent() {
        this.mContentLauncher = registerForActivityResult(new a<String, Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.9
            @Override // b.a
            @o0
            public Intent createIntent(@o0 Context context, String str) {
                boolean equals = TextUtils.equals(ProtectedSandApp.s("ᖼ\u0001"), str);
                String s4 = ProtectedSandApp.s("ᖽ\u0001");
                return equals ? new Intent(s4, MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals(ProtectedSandApp.s("ᖾ\u0001"), str) ? new Intent(s4, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent(s4, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // b.a
            public Uri parseResult(int i4, @q0 Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }
        }, new androidx.view.result.a<Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.10
            @Override // androidx.view.result.a
            public void onActivityResult(Uri uri) {
                if (uri == null) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                LocalMedia buildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                buildLocalMedia.setPath(SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                if (PictureSelectorSystemFragment.this.confirmSelect(buildLocalMedia, false) == 0) {
                    PictureSelectorSystemFragment.this.dispatchTransformResult();
                } else {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                }
            }
        });
    }

    private void createMultipleContents() {
        this.mContentsLauncher = registerForActivityResult(new a<String, List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.7
            @Override // b.a
            @o0
            public Intent createIntent(@o0 Context context, String str) {
                boolean equals = TextUtils.equals(ProtectedSandApp.s("ᖸ\u0001"), str);
                String s4 = ProtectedSandApp.s("ᖹ\u0001");
                Intent intent = equals ? new Intent(s4, MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals(ProtectedSandApp.s("ᖺ\u0001"), str) ? new Intent(s4, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent(s4, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.putExtra(ProtectedSandApp.s("ᖻ\u0001"), true);
                return intent;
            }

            @Override // b.a
            public List<Uri> parseResult(int i4, @q0 Intent intent) {
                ArrayList arrayList = new ArrayList();
                if (intent == null) {
                    return arrayList;
                }
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i5 = 0; i5 < itemCount; i5++) {
                        arrayList.add(clipData.getItemAt(i5).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
                return arrayList;
            }
        }, new androidx.view.result.a<List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.8
            @Override // androidx.view.result.a
            public void onActivityResult(List<Uri> list) {
                if (list == null || list.size() == 0) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i4 = 0; i4 < list.size(); i4++) {
                    LocalMedia buildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i4).toString());
                    buildLocalMedia.setPath(SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    ((PictureCommonFragment) PictureSelectorSystemFragment.this).selectorConfig.addSelectResult(buildLocalMedia);
                }
                PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createMultipleDocuments() {
        this.mDocMultipleLauncher = registerForActivityResult(new a<String, List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.3
            @Override // b.a
            @o0
            public Intent createIntent(@o0 Context context, String str) {
                Intent intent = new Intent(ProtectedSandApp.s("ᖵ\u0001"));
                intent.putExtra(ProtectedSandApp.s("ᖶ\u0001"), true);
                intent.setType(str);
                return intent;
            }

            @Override // b.a
            public List<Uri> parseResult(int i4, @q0 Intent intent) {
                ArrayList arrayList = new ArrayList();
                if (intent == null) {
                    return arrayList;
                }
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i5 = 0; i5 < itemCount; i5++) {
                        arrayList.add(clipData.getItemAt(i5).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
                return arrayList;
            }
        }, new androidx.view.result.a<List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.4
            @Override // androidx.view.result.a
            public void onActivityResult(List<Uri> list) {
                if (list == null || list.size() == 0) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i4 = 0; i4 < list.size(); i4++) {
                    LocalMedia buildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i4).toString());
                    buildLocalMedia.setPath(SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    ((PictureCommonFragment) PictureSelectorSystemFragment.this).selectorConfig.addSelectResult(buildLocalMedia);
                }
                PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createSingleDocuments() {
        this.mDocSingleLauncher = registerForActivityResult(new a<String, Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.5
            @Override // b.a
            @o0
            public Intent createIntent(@o0 Context context, String str) {
                Intent intent = new Intent(ProtectedSandApp.s("ᖷ\u0001"));
                intent.setType(str);
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // b.a
            public Uri parseResult(int i4, @q0 Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }
        }, new androidx.view.result.a<Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.6
            @Override // androidx.view.result.a
            public void onActivityResult(Uri uri) {
                if (uri == null) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                LocalMedia buildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                buildLocalMedia.setPath(SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                if (PictureSelectorSystemFragment.this.confirmSelect(buildLocalMedia, false) == 0) {
                    PictureSelectorSystemFragment.this.dispatchTransformResult();
                } else {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                }
            }
        });
    }

    private void createSystemContracts() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 1) {
            if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
                createSingleDocuments();
                return;
            } else {
                createContent();
                return;
            }
        }
        if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
            createMultipleDocuments();
        } else {
            createMultipleContents();
        }
    }

    private String getInput() {
        return this.selectorConfig.chooseMode == SelectMimeType.ofVideo() ? ProtectedSandApp.s("ᗀ\u0001") : this.selectorConfig.chooseMode == SelectMimeType.ofAudio() ? ProtectedSandApp.s("ᗁ\u0001") : ProtectedSandApp.s("ᗂ\u0001");
    }

    public static PictureSelectorSystemFragment newInstance() {
        return new PictureSelectorSystemFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSystemAlbum() {
        onPermissionExplainEvent(false, null);
        SelectorConfig selectorConfig = this.selectorConfig;
        int i4 = selectorConfig.selectionMode;
        String s4 = ProtectedSandApp.s("ᗃ\u0001");
        if (i4 == 1) {
            if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
                this.mDocSingleLauncher.b(s4);
                return;
            } else {
                this.mContentLauncher.b(getInput());
                return;
            }
        }
        if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
            this.mDocMultipleLauncher.b(s4);
        } else {
            this.mContentsLauncher.b(getInput());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        return R.layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(String[] strArr) {
        onPermissionExplainEvent(false, null);
        SelectorConfig selectorConfig = this.selectorConfig;
        OnPermissionsInterceptListener onPermissionsInterceptListener = selectorConfig.onPermissionsEventListener;
        if (onPermissionsInterceptListener != null ? onPermissionsInterceptListener.hasPermissions(this, strArr) : PermissionChecker.isCheckReadStorage(selectorConfig.chooseMode, getContext())) {
            openSystemAlbum();
        } else {
            ToastUtils.showToast(getContext(), getString(R.string.ps_jurisdiction));
            onKeyBackFragmentFinish();
        }
        PermissionConfig.CURRENT_REQUEST_PERMISSION = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == 0) {
            onKeyBackFragmentFinish();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onApplyPermissionsEvent(int i4, String[] strArr) {
        if (i4 == -2) {
            this.selectorConfig.onPermissionsEventListener.requestPermission(this, PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode), new OnRequestPermissionListener() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.2
                @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
                public void onCall(String[] strArr2, boolean z4) {
                    if (z4) {
                        PictureSelectorSystemFragment.this.openSystemAlbum();
                    } else {
                        PictureSelectorSystemFragment.this.handlePermissionDenied(strArr2);
                    }
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        h<String> hVar = this.mDocMultipleLauncher;
        if (hVar != null) {
            hVar.d();
        }
        h<String> hVar2 = this.mDocSingleLauncher;
        if (hVar2 != null) {
            hVar2.d();
        }
        h<String> hVar3 = this.mContentsLauncher;
        if (hVar3 != null) {
            hVar3.d();
        }
        h<String> hVar4 = this.mContentLauncher;
        if (hVar4 != null) {
            hVar4.d();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        createSystemContracts();
        if (PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext())) {
            openSystemAlbum();
            return;
        }
        final String[] readPermissionArray = PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode);
        onPermissionExplainEvent(true, readPermissionArray);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(-2, readPermissionArray);
        } else {
            PermissionChecker.getInstance().requestPermissions(this, readPermissionArray, new PermissionResultCallback() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.1
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    PictureSelectorSystemFragment.this.handlePermissionDenied(readPermissionArray);
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    PictureSelectorSystemFragment.this.openSystemAlbum();
                }
            });
        }
    }
}
