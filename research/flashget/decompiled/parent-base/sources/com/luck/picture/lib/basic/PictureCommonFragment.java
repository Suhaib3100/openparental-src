package com.luck.picture.lib.basic;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.c0;
import com.cby.shareboard.utils.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.R;
import com.luck.picture.lib.app.PictureAppMaster;
import com.luck.picture.lib.config.Crop;
import com.luck.picture.lib.config.PermissionEvent;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.dialog.PhotoItemSelectedDialog;
import com.luck.picture.lib.dialog.PictureLoadingDialog;
import com.luck.picture.lib.dialog.RemindDialog;
import com.luck.picture.lib.engine.PictureSelectorEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.immersive.ImmersiveManager;
import com.luck.picture.lib.interfaces.OnCallbackIndexListener;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.interfaces.OnCustomLoadingListener;
import com.luck.picture.lib.interfaces.OnItemClickListener;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.luck.picture.lib.interfaces.OnRequestPermissionListener;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.luck.picture.lib.interfaces.OnSelectFilterListener;
import com.luck.picture.lib.interfaces.OnSelectLimitTipsListener;
import com.luck.picture.lib.language.PictureLanguageUtils;
import com.luck.picture.lib.loader.IBridgeMediaLoader;
import com.luck.picture.lib.permissions.PermissionChecker;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.luck.picture.lib.permissions.PermissionResultCallback;
import com.luck.picture.lib.permissions.PermissionUtil;
import com.luck.picture.lib.service.ForegroundService;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.BitmapUtils;
import com.luck.picture.lib.utils.DateUtils;
import com.luck.picture.lib.utils.FileDirMap;
import com.luck.picture.lib.utils.MediaStoreUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.PictureFileUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.ToastUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class PictureCommonFragment extends Fragment implements IPictureSelectorCommonEvent {
    public static final String TAG = ProtectedSandApp.s("ᖁ\u0001");
    private Context context;
    private long enterAnimDuration;
    protected IBridgePictureBehavior iBridgePictureBehavior;
    protected IBridgeMediaLoader mLoader;
    private Dialog mLoadingDialog;
    protected int mPage = 1;
    private PermissionResultCallback mPermissionResultCallback;
    protected SelectorConfig selectorConfig;
    private int soundID;
    private SoundPool soundPool;
    protected Dialog tipsDialog;

    public static class SelectorResult {
        public int mResultCode;
        public Intent mResultData;

        public SelectorResult(int i4, Intent intent) {
            this.mResultCode = i4;
            this.mResultData = intent;
        }
    }

    private void addBitmapWatermark(final ArrayList<LocalMedia> arrayList) {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            LocalMedia localMedia = arrayList.get(i4);
            if (!PictureMimeType.isHasAudio(localMedia.getMimeType())) {
                concurrentHashMap.put(localMedia.getAvailablePath(), localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            dispatchWatermarkResult(arrayList);
            return;
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            this.selectorConfig.onBitmapWatermarkListener.onAddBitmapWatermark(getAppContext(), (String) entry.getKey(), ((LocalMedia) entry.getValue()).getMimeType(), new OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.13
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(String str, String str2) {
                    if (TextUtils.isEmpty(str)) {
                        PictureCommonFragment.this.dispatchWatermarkResult(arrayList);
                        return;
                    }
                    LocalMedia localMedia2 = (LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        localMedia2.setWatermarkPath(str2);
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        PictureCommonFragment.this.dispatchWatermarkResult(arrayList);
                    }
                }
            });
        }
    }

    private boolean checkCompleteSelectLimit() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 2 && !selectorConfig.isOnlyCamera) {
            if (selectorConfig.isWithVideoImage) {
                ArrayList<LocalMedia> selectedResult = selectorConfig.getSelectedResult();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < selectedResult.size(); i6++) {
                    if (PictureMimeType.isHasVideo(selectedResult.get(i6).getMimeType())) {
                        i5++;
                    } else {
                        i4++;
                    }
                }
                SelectorConfig selectorConfig2 = this.selectorConfig;
                int i7 = selectorConfig2.minSelectNum;
                if (i7 > 0 && i4 < i7) {
                    OnSelectLimitTipsListener onSelectLimitTipsListener = selectorConfig2.onSelectLimitTipsListener;
                    if (onSelectLimitTipsListener != null && onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 5)) {
                        return true;
                    }
                    showTipsDialog(getString(R.string.ps_min_img_num, String.valueOf(this.selectorConfig.minSelectNum)));
                    return true;
                }
                int i10 = selectorConfig2.minVideoSelectNum;
                if (i10 > 0 && i5 < i10) {
                    OnSelectLimitTipsListener onSelectLimitTipsListener2 = selectorConfig2.onSelectLimitTipsListener;
                    if (onSelectLimitTipsListener2 != null && onSelectLimitTipsListener2.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 7)) {
                        return true;
                    }
                    showTipsDialog(getString(R.string.ps_min_video_num, String.valueOf(this.selectorConfig.minVideoSelectNum)));
                    return true;
                }
            } else {
                String resultFirstMimeType = selectorConfig.getResultFirstMimeType();
                if (PictureMimeType.isHasImage(resultFirstMimeType)) {
                    SelectorConfig selectorConfig3 = this.selectorConfig;
                    if (selectorConfig3.minSelectNum > 0) {
                        int selectCount = selectorConfig3.getSelectCount();
                        SelectorConfig selectorConfig4 = this.selectorConfig;
                        if (selectCount < selectorConfig4.minSelectNum) {
                            OnSelectLimitTipsListener onSelectLimitTipsListener3 = selectorConfig4.onSelectLimitTipsListener;
                            if (onSelectLimitTipsListener3 != null && onSelectLimitTipsListener3.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 5)) {
                                return true;
                            }
                            showTipsDialog(getString(R.string.ps_min_img_num, String.valueOf(this.selectorConfig.minSelectNum)));
                            return true;
                        }
                    }
                }
                if (PictureMimeType.isHasVideo(resultFirstMimeType)) {
                    SelectorConfig selectorConfig5 = this.selectorConfig;
                    if (selectorConfig5.minVideoSelectNum > 0) {
                        int selectCount2 = selectorConfig5.getSelectCount();
                        SelectorConfig selectorConfig6 = this.selectorConfig;
                        if (selectCount2 < selectorConfig6.minVideoSelectNum) {
                            OnSelectLimitTipsListener onSelectLimitTipsListener4 = selectorConfig6.onSelectLimitTipsListener;
                            if (onSelectLimitTipsListener4 != null && onSelectLimitTipsListener4.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 7)) {
                                return true;
                            }
                            showTipsDialog(getString(R.string.ps_min_video_num, String.valueOf(this.selectorConfig.minVideoSelectNum)));
                            return true;
                        }
                    }
                }
                if (PictureMimeType.isHasAudio(resultFirstMimeType)) {
                    SelectorConfig selectorConfig7 = this.selectorConfig;
                    if (selectorConfig7.minAudioSelectNum > 0) {
                        int selectCount3 = selectorConfig7.getSelectCount();
                        SelectorConfig selectorConfig8 = this.selectorConfig;
                        if (selectCount3 < selectorConfig8.minAudioSelectNum) {
                            OnSelectLimitTipsListener onSelectLimitTipsListener5 = selectorConfig8.onSelectLimitTipsListener;
                            if (onSelectLimitTipsListener5 != null && onSelectLimitTipsListener5.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 12)) {
                                return true;
                            }
                            showTipsDialog(getString(R.string.ps_min_audio_num, String.valueOf(this.selectorConfig.minAudioSelectNum)));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    private void copyExternalPathToAppInDirFor29(final ArrayList<LocalMedia> arrayList) {
        showLoading();
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<ArrayList<LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.15
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public ArrayList<LocalMedia> doInBackground() {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    LocalMedia localMedia = (LocalMedia) arrayList.get(i4);
                    PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
                    pictureCommonFragment.selectorConfig.sandboxFileEngine.onStartSandboxFileTransform(pictureCommonFragment.getAppContext(), PictureCommonFragment.this.selectorConfig.isCheckOriginalImage, i4, localMedia, new OnCallbackIndexListener<LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.15.1
                        @Override // com.luck.picture.lib.interfaces.OnCallbackIndexListener
                        public void onCall(LocalMedia localMedia2, int i5) {
                            LocalMedia localMedia3 = (LocalMedia) arrayList.get(i5);
                            localMedia3.setSandboxPath(localMedia2.getSandboxPath());
                            if (PictureCommonFragment.this.selectorConfig.isCheckOriginalImage) {
                                localMedia3.setOriginalPath(localMedia2.getOriginalPath());
                                localMedia3.setOriginal(!TextUtils.isEmpty(localMedia2.getOriginalPath()));
                            }
                        }
                    });
                }
                return arrayList;
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(ArrayList<LocalMedia> arrayList2) {
                PictureThreadUtils.cancel(this);
                PictureCommonFragment.this.dispatchUriToFileTransformResult(arrayList2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyOutputAudioToDir() {
        String str;
        try {
            if (TextUtils.isEmpty(this.selectorConfig.outPutAudioDir)) {
                return;
            }
            InputStream openInputStream = PictureMimeType.isContent(this.selectorConfig.cameraPath) ? PictureContentResolver.openInputStream(getAppContext(), Uri.parse(this.selectorConfig.cameraPath)) : new FileInputStream(this.selectorConfig.cameraPath);
            if (TextUtils.isEmpty(this.selectorConfig.outPutAudioFileName)) {
                str = "";
            } else {
                SelectorConfig selectorConfig = this.selectorConfig;
                if (selectorConfig.isOnlyCamera) {
                    str = selectorConfig.outPutAudioFileName;
                } else {
                    str = System.currentTimeMillis() + ProtectedSandApp.s("ᖂ\u0001") + this.selectorConfig.outPutAudioFileName;
                }
            }
            Context appContext = getAppContext();
            SelectorConfig selectorConfig2 = this.selectorConfig;
            File createCameraFile = PictureFileUtils.createCameraFile(appContext, selectorConfig2.chooseMode, str, "", selectorConfig2.outPutAudioDir);
            if (PictureFileUtils.writeFileFromIS(openInputStream, new FileOutputStream(createCameraFile.getAbsolutePath()))) {
                MediaUtils.deleteUri(getAppContext(), this.selectorConfig.cameraPath);
                this.selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
            }
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
        }
    }

    private void createCompressEngine() {
        PictureSelectorEngine pictureSelectorEngine;
        PictureSelectorEngine pictureSelectorEngine2;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isCompressEngine) {
            if (selectorConfig.compressFileEngine == null && (pictureSelectorEngine2 = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
                this.selectorConfig.compressFileEngine = pictureSelectorEngine2.createCompressFileEngine();
            }
            if (this.selectorConfig.compressEngine != null || (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
                return;
            }
            this.selectorConfig.compressEngine = pictureSelectorEngine.createCompressEngine();
        }
    }

    private void createImageLoaderEngine() {
        PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.imageEngine != null || (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
            return;
        }
        this.selectorConfig.imageEngine = pictureSelectorEngine.createImageLoaderEngine();
    }

    private void createLayoutResourceListener() {
        PictureSelectorEngine pictureSelectorEngine;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isInjectLayoutResource && selectorConfig.onLayoutResourceListener == null && (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.onLayoutResourceListener = pictureSelectorEngine.createLayoutResourceListener();
        }
    }

    private void createLoaderDataEngine() {
        PictureSelectorEngine pictureSelectorEngine;
        PictureSelectorEngine pictureSelectorEngine2;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isLoaderDataEngine && selectorConfig.loaderDataEngine == null && (pictureSelectorEngine2 = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.loaderDataEngine = pictureSelectorEngine2.createLoaderDataEngine();
        }
        SelectorConfig selectorConfig2 = this.selectorConfig;
        if (selectorConfig2.isLoaderFactoryEngine && selectorConfig2.loaderFactory == null && (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.loaderFactory = pictureSelectorEngine.onCreateLoader();
        }
    }

    private void createResultCallbackListener() {
        PictureSelectorEngine pictureSelectorEngine;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isResultListenerBack && selectorConfig.onResultCallListener == null && (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.onResultCallListener = pictureSelectorEngine.getResultCallbackListener();
        }
    }

    private void createSandboxFileEngine() {
        PictureSelectorEngine pictureSelectorEngine;
        PictureSelectorEngine pictureSelectorEngine2;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isSandboxFileEngine) {
            if (selectorConfig.uriToFileTransformEngine == null && (pictureSelectorEngine2 = PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
                this.selectorConfig.uriToFileTransformEngine = pictureSelectorEngine2.createUriToFileTransformEngine();
            }
            if (this.selectorConfig.sandboxFileEngine != null || (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
                return;
            }
            this.selectorConfig.sandboxFileEngine = pictureSelectorEngine.createSandboxFileEngine();
        }
    }

    private void createVideoPlayerEngine() {
        PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.videoPlayerEngine != null || (pictureSelectorEngine = PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
            return;
        }
        this.selectorConfig.videoPlayerEngine = pictureSelectorEngine.createVideoPlayerEngine();
    }

    private void dispatchHandleCamera(final Intent intent) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.9
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public LocalMedia doInBackground() {
                String outputPath = PictureCommonFragment.this.getOutputPath(intent);
                if (!TextUtils.isEmpty(outputPath)) {
                    PictureCommonFragment.this.selectorConfig.cameraPath = outputPath;
                }
                if (TextUtils.isEmpty(PictureCommonFragment.this.selectorConfig.cameraPath)) {
                    return null;
                }
                if (PictureCommonFragment.this.selectorConfig.chooseMode == SelectMimeType.ofAudio()) {
                    PictureCommonFragment.this.copyOutputAudioToDir();
                }
                PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
                LocalMedia buildLocalMedia = pictureCommonFragment.buildLocalMedia(pictureCommonFragment.selectorConfig.cameraPath);
                buildLocalMedia.setCameraSource(true);
                return buildLocalMedia;
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(LocalMedia localMedia) {
                PictureThreadUtils.cancel(this);
                if (localMedia != null) {
                    PictureCommonFragment.this.onScannerScanFile(localMedia);
                    PictureCommonFragment.this.dispatchCameraMediaResult(localMedia);
                }
                PictureCommonFragment.this.selectorConfig.cameraPath = "";
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchUriToFileTransformResult(ArrayList<LocalMedia> arrayList) {
        showLoading();
        if (checkAddBitmapWatermark()) {
            addBitmapWatermark(arrayList);
        } else if (checkVideoThumbnail()) {
            videoThumbnail(arrayList);
        } else {
            onCallBackResult(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchWatermarkResult(ArrayList<LocalMedia> arrayList) {
        if (checkVideoThumbnail()) {
            videoThumbnail(arrayList);
        } else {
            onCallBackResult(arrayList);
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    private static String getTipsMsg(Context context, String str, int i4) {
        return PictureMimeType.isHasVideo(str) ? context.getString(R.string.ps_message_video_max_num, String.valueOf(i4)) : PictureMimeType.isHasAudio(str) ? context.getString(R.string.ps_message_audio_max_num, String.valueOf(i4)) : context.getString(R.string.ps_message_max_num, String.valueOf(i4));
    }

    private void mergeOriginalImage(ArrayList<LocalMedia> arrayList) {
        if (this.selectorConfig.isCheckOriginalImage) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                LocalMedia localMedia = arrayList.get(i4);
                localMedia.setOriginal(true);
                localMedia.setOriginalPath(localMedia.getPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallBackResult(ArrayList<LocalMedia> arrayList) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        dismissLoading();
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isActivityResultBack) {
            getActivity().setResult(-1, PictureSelector.putIntentResult(arrayList));
            onSelectFinish(-1, arrayList);
        } else {
            OnResultCallbackListener<LocalMedia> onResultCallbackListener = selectorConfig.onResultCallListener;
            if (onResultCallbackListener != null) {
                onResultCallbackListener.onResult(arrayList);
            }
        }
        onExitPictureSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScannerScanFile(LocalMedia localMedia) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (SdkVersionUtils.isQ()) {
            if (PictureMimeType.isHasVideo(localMedia.getMimeType()) && PictureMimeType.isContent(localMedia.getPath())) {
                new PictureMediaScannerConnection(getActivity(), localMedia.getRealPath());
                return;
            }
            return;
        }
        String realPath = PictureMimeType.isContent(localMedia.getPath()) ? localMedia.getRealPath() : localMedia.getPath();
        new PictureMediaScannerConnection(getActivity(), realPath);
        if (PictureMimeType.isHasImage(localMedia.getMimeType())) {
            int dCIMLastImageId = MediaUtils.getDCIMLastImageId(getAppContext(), new File(realPath).getParent());
            if (dCIMLastImageId != -1) {
                MediaUtils.removeMedia(getAppContext(), dCIMLastImageId);
            }
        }
    }

    private void playClickEffect() {
        SoundPool soundPool = this.soundPool;
        if (soundPool == null || !this.selectorConfig.isOpenClickSound) {
            return;
        }
        soundPool.play(this.soundID, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    private void releaseSoundPool() {
        try {
            SoundPool soundPool = this.soundPool;
            if (soundPool != null) {
                soundPool.release();
                this.soundPool = null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void setTranslucentStatusBar() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isPreviewFullScreenMode) {
            ImmersiveManager.translucentStatusBar(requireActivity(), selectorConfig.selectorStyle.getSelectMainStyle().isDarkStatusBarBlack());
        }
    }

    private void showTipsDialog(String str) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        try {
            Dialog dialog = this.tipsDialog;
            if (dialog == null || !dialog.isShowing()) {
                RemindDialog buildDialog = RemindDialog.buildDialog(getAppContext(), str);
                this.tipsDialog = buildDialog;
                buildDialog.show();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void uriToFileTransform29(final ArrayList<LocalMedia> arrayList) {
        showLoading();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            LocalMedia localMedia = arrayList.get(i4);
            concurrentHashMap.put(localMedia.getPath(), localMedia);
        }
        if (concurrentHashMap.size() == 0) {
            dispatchUriToFileTransformResult(arrayList);
        } else {
            PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<ArrayList<LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.14
                @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
                public ArrayList<LocalMedia> doInBackground() {
                    Iterator it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        LocalMedia localMedia2 = (LocalMedia) ((Map.Entry) it.next()).getValue();
                        if (PictureCommonFragment.this.selectorConfig.isCheckOriginalImage || TextUtils.isEmpty(localMedia2.getSandboxPath())) {
                            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
                            pictureCommonFragment.selectorConfig.uriToFileTransformEngine.onUriToFileAsyncTransform(pictureCommonFragment.getAppContext(), localMedia2.getPath(), localMedia2.getMimeType(), new OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.14.1
                                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                                public void onCallback(String str, String str2) {
                                    LocalMedia localMedia3;
                                    if (TextUtils.isEmpty(str) || (localMedia3 = (LocalMedia) concurrentHashMap.get(str)) == null) {
                                        return;
                                    }
                                    if (TextUtils.isEmpty(localMedia3.getSandboxPath())) {
                                        localMedia3.setSandboxPath(str2);
                                    }
                                    if (PictureCommonFragment.this.selectorConfig.isCheckOriginalImage) {
                                        localMedia3.setOriginalPath(str2);
                                        localMedia3.setOriginal(!TextUtils.isEmpty(str2));
                                    }
                                    concurrentHashMap.remove(str);
                                }
                            });
                        }
                    }
                    return arrayList;
                }

                @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
                public void onSuccess(ArrayList<LocalMedia> arrayList2) {
                    PictureThreadUtils.cancel(this);
                    PictureCommonFragment.this.dispatchUriToFileTransformResult(arrayList2);
                }
            });
        }
    }

    private void videoThumbnail(final ArrayList<LocalMedia> arrayList) {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            LocalMedia localMedia = arrayList.get(i4);
            String availablePath = localMedia.getAvailablePath();
            if (PictureMimeType.isHasVideo(localMedia.getMimeType()) || PictureMimeType.isUrlHasVideo(availablePath)) {
                concurrentHashMap.put(availablePath, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            onCallBackResult(arrayList);
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.selectorConfig.onVideoThumbnailEventListener.onVideoThumbnail(getAppContext(), (String) ((Map.Entry) it.next()).getKey(), new OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.12
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(String str, String str2) {
                    LocalMedia localMedia2 = (LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        localMedia2.setVideoThumbnailPath(str2);
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        PictureCommonFragment.this.onCallBackResult(arrayList);
                    }
                }
            });
        }
    }

    protected LocalMedia buildLocalMedia(String str) {
        LocalMedia generateLocalMedia = LocalMedia.generateLocalMedia(getAppContext(), str);
        generateLocalMedia.setChooseModel(this.selectorConfig.chooseMode);
        if (!SdkVersionUtils.isQ() || PictureMimeType.isContent(str)) {
            generateLocalMedia.setSandboxPath(null);
        } else {
            generateLocalMedia.setSandboxPath(str);
        }
        if (this.selectorConfig.isCameraRotateImage && PictureMimeType.isHasImage(generateLocalMedia.getMimeType())) {
            BitmapUtils.rotateImage(getAppContext(), str);
        }
        return generateLocalMedia;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkAddBitmapWatermark() {
        return this.selectorConfig.onBitmapWatermarkListener != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkCompressValidity() {
        if (this.selectorConfig.compressFileEngine != null) {
            for (int i4 = 0; i4 < this.selectorConfig.getSelectCount(); i4++) {
                if (PictureMimeType.isHasImage(this.selectorConfig.getSelectedResult().get(i4).getMimeType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkCropValidity() {
        if (this.selectorConfig.cropFileEngine == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.selectorConfig.skipCropList;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (this.selectorConfig.getSelectCount() == 1) {
            String resultFirstMimeType = this.selectorConfig.getResultFirstMimeType();
            boolean isHasImage = PictureMimeType.isHasImage(resultFirstMimeType);
            if (isHasImage && hashSet.contains(resultFirstMimeType)) {
                return false;
            }
            return isHasImage;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.selectorConfig.getSelectCount(); i5++) {
            LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i5);
            if (PictureMimeType.isHasImage(localMedia.getMimeType()) && hashSet.contains(localMedia.getMimeType())) {
                i4++;
            }
        }
        return i4 != this.selectorConfig.getSelectCount();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldCompressValidity() {
        if (this.selectorConfig.compressEngine != null) {
            for (int i4 = 0; i4 < this.selectorConfig.getSelectCount(); i4++) {
                if (PictureMimeType.isHasImage(this.selectorConfig.getSelectedResult().get(i4).getMimeType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldCropValidity() {
        if (this.selectorConfig.cropEngine == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.selectorConfig.skipCropList;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (this.selectorConfig.getSelectCount() == 1) {
            String resultFirstMimeType = this.selectorConfig.getResultFirstMimeType();
            boolean isHasImage = PictureMimeType.isHasImage(resultFirstMimeType);
            if (isHasImage && hashSet.contains(resultFirstMimeType)) {
                return false;
            }
            return isHasImage;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.selectorConfig.getSelectCount(); i5++) {
            LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i5);
            if (PictureMimeType.isHasImage(localMedia.getMimeType()) && hashSet.contains(localMedia.getMimeType())) {
                i4++;
            }
        }
        return i4 != this.selectorConfig.getSelectCount();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldTransformSandboxFile() {
        return SdkVersionUtils.isQ() && this.selectorConfig.sandboxFileEngine != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    @SuppressLint({"StringFormatInvalid"})
    public boolean checkOnlyMimeTypeValidity(LocalMedia localMedia, boolean z4, String str, String str2, long j4, long j5) {
        if (!PictureMimeType.isMimeTypeSame(str2, str)) {
            OnSelectLimitTipsListener onSelectLimitTipsListener = this.selectorConfig.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener != null && onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 3)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_rule));
            return true;
        }
        SelectorConfig selectorConfig = this.selectorConfig;
        long j6 = selectorConfig.selectMaxFileSize;
        if (j6 > 0 && j4 > j6) {
            OnSelectLimitTipsListener onSelectLimitTipsListener2 = selectorConfig.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener2 != null && onSelectLimitTipsListener2.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 1)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_select_max_size, PictureFileUtils.formatFileSize(this.selectorConfig.selectMaxFileSize)));
            return true;
        }
        long j7 = selectorConfig.selectMinFileSize;
        if (j7 > 0 && j4 < j7) {
            OnSelectLimitTipsListener onSelectLimitTipsListener3 = selectorConfig.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener3 != null && onSelectLimitTipsListener3.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 2)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_select_min_size, PictureFileUtils.formatFileSize(this.selectorConfig.selectMinFileSize)));
            return true;
        }
        if (PictureMimeType.isHasVideo(str)) {
            SelectorConfig selectorConfig2 = this.selectorConfig;
            if (selectorConfig2.selectionMode == 2) {
                int i4 = selectorConfig2.maxVideoSelectNum;
                if (i4 <= 0) {
                    i4 = selectorConfig2.maxSelectNum;
                }
                selectorConfig2.maxVideoSelectNum = i4;
                if (!z4) {
                    int selectCount = selectorConfig2.getSelectCount();
                    SelectorConfig selectorConfig3 = this.selectorConfig;
                    if (selectCount >= selectorConfig3.maxVideoSelectNum) {
                        OnSelectLimitTipsListener onSelectLimitTipsListener4 = selectorConfig3.onSelectLimitTipsListener;
                        if (onSelectLimitTipsListener4 != null && onSelectLimitTipsListener4.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 6)) {
                            return true;
                        }
                        showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxVideoSelectNum));
                        return true;
                    }
                }
            }
            if (!z4 && this.selectorConfig.selectMinDurationSecond > 0) {
                long millisecondToSecond = DateUtils.millisecondToSecond(j5);
                SelectorConfig selectorConfig4 = this.selectorConfig;
                if (millisecondToSecond < selectorConfig4.selectMinDurationSecond) {
                    OnSelectLimitTipsListener onSelectLimitTipsListener5 = selectorConfig4.onSelectLimitTipsListener;
                    if (onSelectLimitTipsListener5 != null && onSelectLimitTipsListener5.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 9)) {
                        return true;
                    }
                    showTipsDialog(getString(R.string.ps_select_video_min_second, Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)));
                    return true;
                }
            }
            if (z4 || this.selectorConfig.selectMaxDurationSecond <= 0) {
                return false;
            }
            long millisecondToSecond2 = DateUtils.millisecondToSecond(j5);
            SelectorConfig selectorConfig5 = this.selectorConfig;
            if (millisecondToSecond2 <= selectorConfig5.selectMaxDurationSecond) {
                return false;
            }
            OnSelectLimitTipsListener onSelectLimitTipsListener6 = selectorConfig5.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener6 != null && onSelectLimitTipsListener6.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 8)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_select_video_max_second, Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)));
            return true;
        }
        if (!PictureMimeType.isHasAudio(str)) {
            SelectorConfig selectorConfig6 = this.selectorConfig;
            if (selectorConfig6.selectionMode != 2 || z4) {
                return false;
            }
            int size = selectorConfig6.getSelectedResult().size();
            SelectorConfig selectorConfig7 = this.selectorConfig;
            if (size < selectorConfig7.maxSelectNum) {
                return false;
            }
            OnSelectLimitTipsListener onSelectLimitTipsListener7 = selectorConfig7.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener7 != null && onSelectLimitTipsListener7.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                return true;
            }
            showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxSelectNum));
            return true;
        }
        SelectorConfig selectorConfig8 = this.selectorConfig;
        if (selectorConfig8.selectionMode == 2 && !z4) {
            int size2 = selectorConfig8.getSelectedResult().size();
            SelectorConfig selectorConfig9 = this.selectorConfig;
            if (size2 >= selectorConfig9.maxSelectNum) {
                OnSelectLimitTipsListener onSelectLimitTipsListener8 = selectorConfig9.onSelectLimitTipsListener;
                if (onSelectLimitTipsListener8 != null && onSelectLimitTipsListener8.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                    return true;
                }
                showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxSelectNum));
                return true;
            }
        }
        if (!z4 && this.selectorConfig.selectMinDurationSecond > 0) {
            long millisecondToSecond3 = DateUtils.millisecondToSecond(j5);
            SelectorConfig selectorConfig10 = this.selectorConfig;
            if (millisecondToSecond3 < selectorConfig10.selectMinDurationSecond) {
                OnSelectLimitTipsListener onSelectLimitTipsListener9 = selectorConfig10.onSelectLimitTipsListener;
                if (onSelectLimitTipsListener9 != null && onSelectLimitTipsListener9.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 11)) {
                    return true;
                }
                showTipsDialog(getString(R.string.ps_select_audio_min_second, Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)));
                return true;
            }
        }
        if (z4 || this.selectorConfig.selectMaxDurationSecond <= 0) {
            return false;
        }
        long millisecondToSecond4 = DateUtils.millisecondToSecond(j5);
        SelectorConfig selectorConfig11 = this.selectorConfig;
        if (millisecondToSecond4 <= selectorConfig11.selectMaxDurationSecond) {
            return false;
        }
        OnSelectLimitTipsListener onSelectLimitTipsListener10 = selectorConfig11.onSelectLimitTipsListener;
        if (onSelectLimitTipsListener10 != null && onSelectLimitTipsListener10.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 10)) {
            return true;
        }
        showTipsDialog(getString(R.string.ps_select_audio_max_second, Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)));
        return true;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkTransformSandboxFile() {
        return SdkVersionUtils.isQ() && this.selectorConfig.uriToFileTransformEngine != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkVideoThumbnail() {
        return this.selectorConfig.onVideoThumbnailEventListener != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    public boolean checkWithMimeTypeValidity(LocalMedia localMedia, boolean z4, String str, int i4, long j4, long j5) {
        SelectorConfig selectorConfig = this.selectorConfig;
        long j6 = selectorConfig.selectMaxFileSize;
        if (j6 > 0 && j4 > j6) {
            OnSelectLimitTipsListener onSelectLimitTipsListener = selectorConfig.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener != null && onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 1)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_select_max_size, PictureFileUtils.formatFileSize(this.selectorConfig.selectMaxFileSize)));
            return true;
        }
        long j7 = selectorConfig.selectMinFileSize;
        if (j7 > 0 && j4 < j7) {
            OnSelectLimitTipsListener onSelectLimitTipsListener2 = selectorConfig.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener2 != null && onSelectLimitTipsListener2.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 2)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_select_min_size, PictureFileUtils.formatFileSize(this.selectorConfig.selectMinFileSize)));
            return true;
        }
        if (!PictureMimeType.isHasVideo(str)) {
            SelectorConfig selectorConfig2 = this.selectorConfig;
            if (selectorConfig2.selectionMode != 2 || z4) {
                return false;
            }
            int size = selectorConfig2.getSelectedResult().size();
            SelectorConfig selectorConfig3 = this.selectorConfig;
            if (size < selectorConfig3.maxSelectNum) {
                return false;
            }
            OnSelectLimitTipsListener onSelectLimitTipsListener3 = selectorConfig3.onSelectLimitTipsListener;
            if (onSelectLimitTipsListener3 != null && onSelectLimitTipsListener3.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                return true;
            }
            showTipsDialog(getString(R.string.ps_message_max_num, Integer.valueOf(this.selectorConfig.maxSelectNum)));
            return true;
        }
        SelectorConfig selectorConfig4 = this.selectorConfig;
        if (selectorConfig4.selectionMode == 2) {
            if (selectorConfig4.maxVideoSelectNum <= 0) {
                OnSelectLimitTipsListener onSelectLimitTipsListener4 = selectorConfig4.onSelectLimitTipsListener;
                if (onSelectLimitTipsListener4 != null && onSelectLimitTipsListener4.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 3)) {
                    return true;
                }
                showTipsDialog(getString(R.string.ps_rule));
                return true;
            }
            if (!z4) {
                int size2 = selectorConfig4.getSelectedResult().size();
                SelectorConfig selectorConfig5 = this.selectorConfig;
                if (size2 >= selectorConfig5.maxSelectNum) {
                    OnSelectLimitTipsListener onSelectLimitTipsListener5 = selectorConfig5.onSelectLimitTipsListener;
                    if (onSelectLimitTipsListener5 != null && onSelectLimitTipsListener5.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                        return true;
                    }
                    showTipsDialog(getString(R.string.ps_message_max_num, Integer.valueOf(this.selectorConfig.maxSelectNum)));
                    return true;
                }
            }
            if (!z4) {
                SelectorConfig selectorConfig6 = this.selectorConfig;
                if (i4 >= selectorConfig6.maxVideoSelectNum) {
                    OnSelectLimitTipsListener onSelectLimitTipsListener6 = selectorConfig6.onSelectLimitTipsListener;
                    if (onSelectLimitTipsListener6 != null && onSelectLimitTipsListener6.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 6)) {
                        return true;
                    }
                    showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxVideoSelectNum));
                    return true;
                }
            }
        }
        if (!z4 && this.selectorConfig.selectMinDurationSecond > 0) {
            long millisecondToSecond = DateUtils.millisecondToSecond(j5);
            SelectorConfig selectorConfig7 = this.selectorConfig;
            if (millisecondToSecond < selectorConfig7.selectMinDurationSecond) {
                OnSelectLimitTipsListener onSelectLimitTipsListener7 = selectorConfig7.onSelectLimitTipsListener;
                if (onSelectLimitTipsListener7 != null && onSelectLimitTipsListener7.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 9)) {
                    return true;
                }
                showTipsDialog(getString(R.string.ps_select_video_min_second, Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)));
                return true;
            }
        }
        if (z4 || this.selectorConfig.selectMaxDurationSecond <= 0) {
            return false;
        }
        long millisecondToSecond2 = DateUtils.millisecondToSecond(j5);
        SelectorConfig selectorConfig8 = this.selectorConfig;
        if (millisecondToSecond2 <= selectorConfig8.selectMaxDurationSecond) {
            return false;
        }
        OnSelectLimitTipsListener onSelectLimitTipsListener8 = selectorConfig8.onSelectLimitTipsListener;
        if (onSelectLimitTipsListener8 != null && onSelectLimitTipsListener8.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 8)) {
            return true;
        }
        showTipsDialog(getString(R.string.ps_select_video_max_second, Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int confirmSelect(LocalMedia localMedia, boolean z4) {
        OnSelectFilterListener onSelectFilterListener = this.selectorConfig.onSelectFilterListener;
        int i4 = 0;
        if (onSelectFilterListener != null && onSelectFilterListener.onSelectFilter(localMedia)) {
            OnSelectLimitTipsListener onSelectLimitTipsListener = this.selectorConfig.onSelectLimitTipsListener;
            if (!(onSelectLimitTipsListener != null ? onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 13) : false)) {
                ToastUtils.showToast(getAppContext(), getString(R.string.ps_select_no_support));
            }
            return -1;
        }
        if (isCheckSelectValidity(localMedia, z4) != 200) {
            return -1;
        }
        ArrayList<LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
        if (z4) {
            selectedResult.remove(localMedia);
            i4 = 1;
        } else {
            if (this.selectorConfig.selectionMode == 1 && selectedResult.size() > 0) {
                sendFixedSelectedChangeEvent(selectedResult.get(0));
                selectedResult.clear();
            }
            selectedResult.add(localMedia);
            localMedia.setNum(selectedResult.size());
            playClickEffect();
        }
        sendSelectedChangeEvent(i4 ^ 1, localMedia);
        return i4;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void dismissLoading() {
        try {
            if (!ActivityCompatHelper.isDestroy(getActivity()) && this.mLoadingDialog.isShowing()) {
                this.mLoadingDialog.dismiss();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void dispatchCameraMediaResult(LocalMedia localMedia) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dispatchTransformResult() {
        if (!checkCompleteSelectLimit() && isAdded()) {
            ArrayList<LocalMedia> arrayList = new ArrayList<>(this.selectorConfig.getSelectedResult());
            if (checkCropValidity()) {
                onCrop(arrayList);
                return;
            }
            if (checkOldCropValidity()) {
                onOldCrop(arrayList);
                return;
            }
            if (checkCompressValidity()) {
                onCompress(arrayList);
            } else if (checkOldCompressValidity()) {
                onOldCompress(arrayList);
            } else {
                onResultEvent(arrayList);
            }
        }
    }

    protected Context getAppContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        Context appContext = PictureAppMaster.getInstance().getAppContext();
        return appContext != null ? appContext : this.context;
    }

    public long getEnterAnimationDuration() {
        long j4 = this.enterAnimDuration;
        if (j4 > 50) {
            j4 -= 50;
        }
        if (j4 >= 0) {
            return j4;
        }
        return 0L;
    }

    public String getFragmentTag() {
        return TAG;
    }

    protected String getOutputPath(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra(ProtectedSandApp.s("ᖃ\u0001"));
        String str = this.selectorConfig.cameraPath;
        boolean z4 = TextUtils.isEmpty(str) || PictureMimeType.isContent(str) || a.a(str);
        if ((this.selectorConfig.chooseMode == SelectMimeType.ofAudio() || !z4) && uri == null) {
            uri = intent.getData();
        }
        if (uri == null) {
            return null;
        }
        return PictureMimeType.isContent(uri.toString()) ? uri.toString() : uri.getPath();
    }

    public int getResourceId() {
        return 0;
    }

    protected SelectorResult getResult(int i4, ArrayList<LocalMedia> arrayList) {
        return new SelectorResult(i4, arrayList != null ? PictureSelector.putIntentResult(arrayList) : null);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionDenied(String[] strArr) {
        PermissionConfig.CURRENT_REQUEST_PERMISSION = strArr;
        if (this.selectorConfig.onPermissionDeniedListener == null) {
            PermissionUtil.goIntentSetting(this, 1102);
        } else {
            onPermissionExplainEvent(false, strArr);
            this.selectorConfig.onPermissionDeniedListener.onDenied(this, strArr, 1102, new OnCallbackListener<Boolean>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.1
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(Boolean bool) {
                    if (bool.booleanValue()) {
                        PictureCommonFragment.this.handlePermissionSettingResult(PermissionConfig.CURRENT_REQUEST_PERMISSION);
                    }
                }
            });
        }
    }

    public void handlePermissionSettingResult(String[] strArr) {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void initAppLanguage() {
        if (this.selectorConfig == null) {
            this.selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
        }
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig == null || selectorConfig.language == -2) {
            return;
        }
        FragmentActivity activity = getActivity();
        SelectorConfig selectorConfig2 = this.selectorConfig;
        PictureLanguageUtils.setAppLanguage(activity, selectorConfig2.language, selectorConfig2.defaultLanguage);
    }

    protected int isCheckSelectValidity(LocalMedia localMedia, boolean z4) {
        String mimeType = localMedia.getMimeType();
        long duration = localMedia.getDuration();
        long size = localMedia.getSize();
        ArrayList<LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
        SelectorConfig selectorConfig = this.selectorConfig;
        if (!selectorConfig.isWithVideoImage) {
            return checkOnlyMimeTypeValidity(localMedia, z4, mimeType, selectorConfig.getResultFirstMimeType(), size, duration) ? -1 : 200;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < selectedResult.size(); i5++) {
            if (PictureMimeType.isHasVideo(selectedResult.get(i5).getMimeType())) {
                i4++;
            }
        }
        return checkWithMimeTypeValidity(localMedia, z4, mimeType, i4, size, duration) ? -1 : 200;
    }

    protected boolean isNormalDefaultEnter() {
        return (getActivity() instanceof PictureSelectorSupporterActivity) || (getActivity() instanceof PictureSelectorTransparentActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1) {
            if (i4 == 909) {
                dispatchHandleCamera(intent);
            } else if (i4 == 696) {
                onEditMedia(intent);
            } else if (i4 == 69) {
                ArrayList<LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
                try {
                    if (selectedResult.size() == 1) {
                        LocalMedia localMedia = selectedResult.get(0);
                        Uri output = Crop.getOutput(intent);
                        localMedia.setCutPath(output != null ? output.getPath() : "");
                        localMedia.setCut(!TextUtils.isEmpty(localMedia.getCutPath()));
                        localMedia.setCropImageWidth(Crop.getOutputImageWidth(intent));
                        localMedia.setCropImageHeight(Crop.getOutputImageHeight(intent));
                        localMedia.setCropOffsetX(Crop.getOutputImageOffsetX(intent));
                        localMedia.setCropOffsetY(Crop.getOutputImageOffsetY(intent));
                        localMedia.setCropResultAspectRatio(Crop.getOutputCropAspectRatio(intent));
                        localMedia.setCustomData(Crop.getOutputCustomExtraData(intent));
                        localMedia.setSandboxPath(localMedia.getCutPath());
                    } else {
                        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("ᖃ\u0001"));
                        if (TextUtils.isEmpty(stringExtra)) {
                            stringExtra = intent.getStringExtra(ProtectedSandApp.s("ᖄ\u0001"));
                        }
                        JSONArray jSONArray = new JSONArray(stringExtra);
                        if (jSONArray.length() == selectedResult.size()) {
                            for (int i6 = 0; i6 < selectedResult.size(); i6++) {
                                LocalMedia localMedia2 = selectedResult.get(i6);
                                JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                                localMedia2.setCutPath(optJSONObject.optString(ProtectedSandApp.s("ᖅ\u0001")));
                                localMedia2.setCut(!TextUtils.isEmpty(localMedia2.getCutPath()));
                                localMedia2.setCropImageWidth(optJSONObject.optInt(ProtectedSandApp.s("ᖆ\u0001")));
                                localMedia2.setCropImageHeight(optJSONObject.optInt(ProtectedSandApp.s("ᖇ\u0001")));
                                localMedia2.setCropOffsetX(optJSONObject.optInt(ProtectedSandApp.s("ᖈ\u0001")));
                                localMedia2.setCropOffsetY(optJSONObject.optInt(ProtectedSandApp.s("ᖉ\u0001")));
                                localMedia2.setCropResultAspectRatio((float) optJSONObject.optDouble(ProtectedSandApp.s("ᖊ\u0001")));
                                localMedia2.setCustomData(optJSONObject.optString(ProtectedSandApp.s("ᖋ\u0001")));
                                localMedia2.setSandboxPath(localMedia2.getCutPath());
                            }
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    ToastUtils.showToast(getAppContext(), e4.getMessage());
                }
                ArrayList<LocalMedia> arrayList = new ArrayList<>(selectedResult);
                if (checkCompressValidity()) {
                    onCompress(arrayList);
                } else if (checkOldCompressValidity()) {
                    onOldCompress(arrayList);
                } else {
                    onResultEvent(arrayList);
                }
            }
        } else if (i5 == 96) {
            Throwable error = intent != null ? Crop.getError(intent) : new Throwable(ProtectedSandApp.s("ᖌ\u0001"));
            if (error != null) {
                ToastUtils.showToast(getAppContext(), error.getMessage());
            }
        } else if (i5 == 0) {
            if (i4 == 909) {
                if (!TextUtils.isEmpty(this.selectorConfig.cameraPath)) {
                    MediaUtils.deleteUri(getAppContext(), this.selectorConfig.cameraPath);
                    this.selectorConfig.cameraPath = "";
                }
            } else if (i4 == 1102) {
                handlePermissionSettingResult(PermissionConfig.CURRENT_REQUEST_PERMISSION);
            }
        }
        ForegroundService.stopService(getAppContext());
    }

    public void onApplyPermissionsEvent(final int i4, String[] strArr) {
        this.selectorConfig.onPermissionsEventListener.requestPermission(this, strArr, new OnRequestPermissionListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.8
            @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
            public void onCall(String[] strArr2, boolean z4) {
                if (!z4) {
                    PictureCommonFragment.this.handlePermissionDenied(strArr2);
                } else if (i4 == PermissionEvent.EVENT_VIDEO_CAMERA) {
                    PictureCommonFragment.this.startCameraVideoCapture();
                } else {
                    PictureCommonFragment.this.startCameraImageCapture();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@o0 Context context) {
        initAppLanguage();
        onRecreateEngine();
        super.onAttach(context);
        this.context = context;
        if (getParentFragment() instanceof IBridgePictureBehavior) {
            this.iBridgePictureBehavior = (IBridgePictureBehavior) getParentFragment();
        } else if (context instanceof IBridgePictureBehavior) {
            this.iBridgePictureBehavior = (IBridgePictureBehavior) context;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBackCurrentFragment() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (!isStateSaved()) {
            IBridgeViewLifecycle iBridgeViewLifecycle = this.selectorConfig.viewLifecycle;
            if (iBridgeViewLifecycle != null) {
                iBridgeViewLifecycle.onDestroy(this);
            }
            getActivity().getSupportFragmentManager().r1();
        }
        List<Fragment> I0 = getActivity().getSupportFragmentManager().I0();
        for (int i4 = 0; i4 < I0.size(); i4++) {
            Fragment fragment = I0.get(i4);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).onFragmentResume();
            }
        }
    }

    public void onCheckOriginalChange() {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCompress(final ArrayList<LocalMedia> arrayList) {
        showLoading();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList<Uri> arrayList2 = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            LocalMedia localMedia = arrayList.get(i4);
            String availablePath = localMedia.getAvailablePath();
            if (!PictureMimeType.isHasHttp(availablePath)) {
                SelectorConfig selectorConfig = this.selectorConfig;
                if ((!selectorConfig.isCheckOriginalImage || !selectorConfig.isOriginalSkipCompress) && PictureMimeType.isHasImage(localMedia.getMimeType())) {
                    arrayList2.add(PictureMimeType.isContent(availablePath) ? Uri.parse(availablePath) : Uri.fromFile(new File(availablePath)));
                    concurrentHashMap.put(availablePath, localMedia);
                }
            }
        }
        if (concurrentHashMap.size() == 0) {
            onResultEvent(arrayList);
        } else {
            this.selectorConfig.compressFileEngine.onStartCompress(getAppContext(), arrayList2, new OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.10
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(String str, String str2) {
                    if (TextUtils.isEmpty(str)) {
                        PictureCommonFragment.this.onResultEvent(arrayList);
                        return;
                    }
                    LocalMedia localMedia2 = (LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        if (!SdkVersionUtils.isQ()) {
                            localMedia2.setCompressPath(str2);
                            localMedia2.setCompressed(!TextUtils.isEmpty(str2));
                        } else if (!TextUtils.isEmpty(str2) && (str2.contains(ProtectedSandApp.s("ᗋ\u0001")) || str2.contains(ProtectedSandApp.s("ᗌ\u0001")))) {
                            localMedia2.setCompressPath(str2);
                            localMedia2.setCompressed(!TextUtils.isEmpty(str2));
                            localMedia2.setSandboxPath(localMedia2.getCompressPath());
                        }
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        PictureCommonFragment.this.onResultEvent(arrayList);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAppLanguage();
    }

    @Override // androidx.fragment.app.Fragment
    @q0
    public Animation onCreateAnimation(int i4, boolean z4, int i5) {
        Animation loadAnimation;
        PictureWindowAnimationStyle windowAnimationStyle = this.selectorConfig.selectorStyle.getWindowAnimationStyle();
        if (z4) {
            loadAnimation = windowAnimationStyle.activityEnterAnimation != 0 ? AnimationUtils.loadAnimation(getAppContext(), windowAnimationStyle.activityEnterAnimation) : AnimationUtils.loadAnimation(getAppContext(), R.anim.ps_anim_alpha_enter);
            setEnterAnimationDuration(loadAnimation.getDuration());
            onEnterFragment();
        } else {
            loadAnimation = windowAnimationStyle.activityExitAnimation != 0 ? AnimationUtils.loadAnimation(getAppContext(), windowAnimationStyle.activityExitAnimation) : AnimationUtils.loadAnimation(getAppContext(), R.anim.ps_anim_alpha_exit);
            onExitFragment();
        }
        return loadAnimation;
    }

    public void onCreateLoader() {
    }

    @Override // androidx.fragment.app.Fragment
    @q0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        return getResourceId() != 0 ? layoutInflater.inflate(getResourceId(), viewGroup, false) : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCrop(ArrayList<LocalMedia> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Uri uri = null;
        Uri uri2 = null;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            LocalMedia localMedia = arrayList.get(i4);
            arrayList2.add(localMedia.getAvailablePath());
            if (uri == null && PictureMimeType.isHasImage(localMedia.getMimeType())) {
                String availablePath = localMedia.getAvailablePath();
                uri = (PictureMimeType.isContent(availablePath) || PictureMimeType.isHasHttp(availablePath)) ? Uri.parse(availablePath) : Uri.fromFile(new File(availablePath));
                uri2 = Uri.fromFile(new File(new File(FileDirMap.getFileDirPath(getAppContext(), 1)).getAbsolutePath(), DateUtils.getCreateFileName(ProtectedSandApp.s("ᖍ\u0001")) + ProtectedSandApp.s("ᖎ\u0001")));
            }
        }
        this.selectorConfig.cropFileEngine.onStartCrop(this, uri, uri2, arrayList2, 69);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        releaseSoundPool();
        super.onDestroy();
    }

    public void onEditMedia(Intent intent) {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onEnterFragment() {
    }

    public void onExitFragment() {
    }

    protected void onExitPictureSelector() {
        if (!ActivityCompatHelper.isDestroy(getActivity())) {
            if (isNormalDefaultEnter()) {
                IBridgeViewLifecycle iBridgeViewLifecycle = this.selectorConfig.viewLifecycle;
                if (iBridgeViewLifecycle != null) {
                    iBridgeViewLifecycle.onDestroy(this);
                }
                getActivity().finish();
            } else {
                List<Fragment> I0 = getActivity().getSupportFragmentManager().I0();
                for (int i4 = 0; i4 < I0.size(); i4++) {
                    if (I0.get(i4) instanceof PictureCommonFragment) {
                        onBackCurrentFragment();
                    }
                }
            }
        }
        SelectorProviders.getInstance().destroy();
    }

    public void onFixedSelectedChange(LocalMedia localMedia) {
    }

    public void onFragmentResume() {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onInterceptCameraEvent(int i4) {
        ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
        this.selectorConfig.onCameraInterceptListener.openCamera(this, i4, PictureConfig.REQUEST_CAMERA);
    }

    public void onKeyBackFragmentFinish() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isActivityResultBack) {
            getActivity().setResult(0);
            onSelectFinish(0, null);
        } else {
            OnResultCallbackListener<LocalMedia> onResultCallbackListener = selectorConfig.onResultCallListener;
            if (onResultCallbackListener != null) {
                onResultCallbackListener.onCancel();
            }
        }
        onExitPictureSelector();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onOldCompress(ArrayList<LocalMedia> arrayList) {
        showLoading();
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isCheckOriginalImage && selectorConfig.isOriginalSkipCompress) {
            onResultEvent(arrayList);
        } else {
            selectorConfig.compressEngine.onStartCompress(getAppContext(), arrayList, new OnCallbackListener<ArrayList<LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.11
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(ArrayList<LocalMedia> arrayList2) {
                    PictureCommonFragment.this.onResultEvent(arrayList2);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onOldCrop(ArrayList<LocalMedia> arrayList) {
        LocalMedia localMedia;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                localMedia = null;
                break;
            }
            localMedia = arrayList.get(i4);
            if (PictureMimeType.isHasImage(arrayList.get(i4).getMimeType())) {
                break;
            } else {
                i4++;
            }
        }
        this.selectorConfig.cropEngine.onStartCrop(this, localMedia, arrayList, 69);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onPermissionExplainEvent(boolean z4, String[] strArr) {
        if (this.selectorConfig.onPermissionDescriptionListener != null) {
            if (PermissionChecker.isCheckSelfPermission(getAppContext(), strArr)) {
                this.selectorConfig.onPermissionDescriptionListener.onDismiss(this);
            } else if (!z4) {
                this.selectorConfig.onPermissionDescriptionListener.onDismiss(this);
            } else if (PermissionUtil.getPermissionStatus(requireActivity(), strArr[0]) != 3) {
                this.selectorConfig.onPermissionDescriptionListener.onPermissionDescription(this, strArr);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onRecreateEngine() {
        createImageLoaderEngine();
        createVideoPlayerEngine();
        createCompressEngine();
        createSandboxFileEngine();
        createLoaderDataEngine();
        createResultCallbackListener();
        createLayoutResourceListener();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i4, @o0 String[] strArr, @o0 int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (this.mPermissionResultCallback != null) {
            PermissionChecker.getInstance().onRequestPermissionsResult(getContext(), strArr, iArr, this.mPermissionResultCallback);
            this.mPermissionResultCallback = null;
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onResultEvent(ArrayList<LocalMedia> arrayList) {
        if (checkTransformSandboxFile()) {
            uriToFileTransform29(arrayList);
        } else if (checkOldTransformSandboxFile()) {
            copyExternalPathToAppInDirFor29(arrayList);
        } else {
            mergeOriginalImage(arrayList);
            dispatchUriToFileTransformResult(arrayList);
        }
    }

    protected void onSelectFinish(int i4, ArrayList<LocalMedia> arrayList) {
        if (this.iBridgePictureBehavior != null) {
            this.iBridgePictureBehavior.onSelectFinish(getResult(i4, arrayList));
        }
    }

    public void onSelectedChange(boolean z4, LocalMedia localMedia) {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onSelectedOnlyCamera() {
        PhotoItemSelectedDialog newInstance = PhotoItemSelectedDialog.newInstance();
        newInstance.setOnItemClickListener(new OnItemClickListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.4
            @Override // com.luck.picture.lib.interfaces.OnItemClickListener
            public void onItemClick(View view, int i4) {
                if (i4 == 0) {
                    PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
                    if (pictureCommonFragment.selectorConfig.onCameraInterceptListener != null) {
                        pictureCommonFragment.onInterceptCameraEvent(1);
                        return;
                    } else {
                        pictureCommonFragment.openImageCamera();
                        return;
                    }
                }
                if (i4 != 1) {
                    return;
                }
                PictureCommonFragment pictureCommonFragment2 = PictureCommonFragment.this;
                if (pictureCommonFragment2.selectorConfig.onCameraInterceptListener != null) {
                    pictureCommonFragment2.onInterceptCameraEvent(2);
                } else {
                    pictureCommonFragment2.openVideoCamera();
                }
            }
        });
        newInstance.setOnDismissListener(new PhotoItemSelectedDialog.OnDismissListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.5
            @Override // com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener
            public void onDismiss(boolean z4, DialogInterface dialogInterface) {
                PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
                if (pictureCommonFragment.selectorConfig.isOnlyCamera && z4) {
                    pictureCommonFragment.onKeyBackFragmentFinish();
                }
            }
        });
        newInstance.show(getChildFragmentManager(), ProtectedSandApp.s("ᖏ\u0001"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
        FileDirMap.init(view.getContext());
        IBridgeViewLifecycle iBridgeViewLifecycle = this.selectorConfig.viewLifecycle;
        if (iBridgeViewLifecycle != null) {
            iBridgeViewLifecycle.onViewCreated(this, view, bundle);
        }
        OnCustomLoadingListener onCustomLoadingListener = this.selectorConfig.onCustomLoadingListener;
        if (onCustomLoadingListener != null) {
            this.mLoadingDialog = onCustomLoadingListener.create(getAppContext());
        } else {
            this.mLoadingDialog = new PictureLoadingDialog(getAppContext());
        }
        setRequestedOrientation();
        setTranslucentStatusBar();
        setRootViewKeyListener(requireView());
        SelectorConfig selectorConfig = this.selectorConfig;
        if (!selectorConfig.isOpenClickSound || selectorConfig.isOnlyCamera) {
            return;
        }
        SoundPool soundPool = new SoundPool(1, 3, 0);
        this.soundPool = soundPool;
        this.soundID = soundPool.load(getAppContext(), R.raw.ps_click_music, 1);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openImageCamera() {
        String[] strArr = PermissionConfig.CAMERA;
        onPermissionExplainEvent(true, strArr);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(PermissionEvent.EVENT_IMAGE_CAMERA, strArr);
        } else {
            PermissionChecker.getInstance().requestPermissions(this, strArr, new PermissionResultCallback() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.6
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    PictureCommonFragment.this.handlePermissionDenied(PermissionConfig.CAMERA);
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    PictureCommonFragment.this.startCameraImageCapture();
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openSelectedCamera() {
        SelectorConfig selectorConfig = this.selectorConfig;
        int i4 = selectorConfig.chooseMode;
        if (i4 == 0) {
            if (selectorConfig.ofAllCameraType == SelectMimeType.ofImage()) {
                openImageCamera();
                return;
            } else if (this.selectorConfig.ofAllCameraType == SelectMimeType.ofVideo()) {
                openVideoCamera();
                return;
            } else {
                onSelectedOnlyCamera();
                return;
            }
        }
        if (i4 == 1) {
            openImageCamera();
        } else if (i4 == 2) {
            openVideoCamera();
        } else {
            if (i4 != 3) {
                return;
            }
            openSoundRecording();
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openSoundRecording() {
        if (this.selectorConfig.onRecordAudioListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᖐ\u0001"));
        }
        ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
        this.selectorConfig.onRecordAudioListener.onRecordAudio(this, PictureConfig.REQUEST_CAMERA);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openVideoCamera() {
        String[] strArr = PermissionConfig.CAMERA;
        onPermissionExplainEvent(true, strArr);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(PermissionEvent.EVENT_VIDEO_CAMERA, strArr);
        } else {
            PermissionChecker.getInstance().requestPermissions(this, strArr, new PermissionResultCallback() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.7
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    PictureCommonFragment.this.handlePermissionDenied(PermissionConfig.CAMERA);
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    PictureCommonFragment.this.startCameraVideoCapture();
                }
            });
        }
    }

    public void reStartSavedInstance(Bundle bundle) {
    }

    public void sendChangeSubSelectPositionEvent(boolean z4) {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendFixedSelectedChangeEvent(LocalMedia localMedia) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        List<Fragment> I0 = getActivity().getSupportFragmentManager().I0();
        for (int i4 = 0; i4 < I0.size(); i4++) {
            Fragment fragment = I0.get(i4);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).onFixedSelectedChange(localMedia);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendSelectedChangeEvent(boolean z4, LocalMedia localMedia) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        List<Fragment> I0 = getActivity().getSupportFragmentManager().I0();
        for (int i4 = 0; i4 < I0.size(); i4++) {
            Fragment fragment = I0.get(i4);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).onSelectedChange(z4, localMedia);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendSelectedOriginalChangeEvent() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        List<Fragment> I0 = getActivity().getSupportFragmentManager().I0();
        for (int i4 = 0; i4 < I0.size(); i4++) {
            Fragment fragment = I0.get(i4);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).onCheckOriginalChange();
            }
        }
    }

    public void setEnterAnimationDuration(long j4) {
        this.enterAnimDuration = j4;
    }

    public void setPermissionsResultAction(PermissionResultCallback permissionResultCallback) {
        this.mPermissionResultCallback = permissionResultCallback;
    }

    protected void setRequestedOrientation() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        getActivity().setRequestedOrientation(this.selectorConfig.requestedOrientation);
    }

    public void setRootViewKeyListener(View view) {
        boolean z4 = true;
        if (this.selectorConfig.isNewKeyBackMode) {
            requireActivity().getOnBackPressedDispatcher().i(getViewLifecycleOwner(), new c0(z4) { // from class: com.luck.picture.lib.basic.PictureCommonFragment.2
                @Override // androidx.view.c0
                public void handleOnBackPressed() {
                    PictureCommonFragment.this.onKeyBackFragmentFinish();
                }
            });
            return;
        }
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.3
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view2, int i4, KeyEvent keyEvent) {
                if (i4 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                PictureCommonFragment.this.onKeyBackFragmentFinish();
                return true;
            }
        });
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void showLoading() {
        try {
            if (ActivityCompatHelper.isDestroy(getActivity()) || this.mLoadingDialog.isShowing()) {
                return;
            }
            this.mLoadingDialog.show();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    protected void startCameraImageCapture() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onCameraInterceptListener != null) {
            onInterceptCameraEvent(1);
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("ᖑ\u0001"));
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
            Uri createCameraOutImageUri = MediaStoreUtils.createCameraOutImageUri(getAppContext(), this.selectorConfig);
            if (createCameraOutImageUri != null) {
                if (this.selectorConfig.isCameraAroundState) {
                    intent.putExtra(ProtectedSandApp.s("ᖒ\u0001"), 1);
                }
                intent.putExtra(ProtectedSandApp.s("ᖃ\u0001"), createCameraOutImageUri);
                startActivityForResult(intent, PictureConfig.REQUEST_CAMERA);
            }
        }
    }

    protected void startCameraVideoCapture() {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onCameraInterceptListener != null) {
            onInterceptCameraEvent(2);
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("ᖓ\u0001"));
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
            Uri createCameraOutVideoUri = MediaStoreUtils.createCameraOutVideoUri(getAppContext(), this.selectorConfig);
            if (createCameraOutVideoUri != null) {
                intent.putExtra(ProtectedSandApp.s("ᖃ\u0001"), createCameraOutVideoUri);
                if (this.selectorConfig.isCameraAroundState) {
                    intent.putExtra(ProtectedSandApp.s("ᖒ\u0001"), 1);
                }
                intent.putExtra(ProtectedSandApp.s("ᖔ\u0001"), this.selectorConfig.isQuickCapture);
                intent.putExtra(ProtectedSandApp.s("ᖕ\u0001"), this.selectorConfig.recordVideoMaxSecond);
                intent.putExtra(ProtectedSandApp.s("ᖖ\u0001"), this.selectorConfig.videoQuality);
                startActivityForResult(intent, PictureConfig.REQUEST_CAMERA);
            }
        }
    }
}
