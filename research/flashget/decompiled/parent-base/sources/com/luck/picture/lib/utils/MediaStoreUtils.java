package com.luck.picture.lib.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.SelectorConfig;
import java.io.File;

/* loaded from: classes6.dex */
public class MediaStoreUtils {
    public static ContentValues buildImageContentValues(String str, String str2) {
        String valueOf = ValueOf.toString(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        boolean isEmpty = TextUtils.isEmpty(str);
        String s4 = ProtectedSandApp.s("\u16fb\u0001");
        String s5 = ProtectedSandApp.s("\u16fc\u0001");
        if (isEmpty) {
            contentValues.put(s5, DateUtils.getCreateFileName(s4));
        } else {
            String s6 = ProtectedSandApp.s("\u16fd\u0001");
            if (str.lastIndexOf(s6) == -1) {
                contentValues.put(s5, DateUtils.getCreateFileName(s4));
            } else {
                contentValues.put(s5, str.replaceAll(str.substring(str.lastIndexOf(s6)), ""));
            }
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith(ProtectedSandApp.s("\u16fe\u0001"))) {
            str2 = ProtectedSandApp.s("\u16ff\u0001");
        }
        contentValues.put(ProtectedSandApp.s("ᜀ\u0001"), str2);
        if (SdkVersionUtils.isQ()) {
            contentValues.put(ProtectedSandApp.s("ᜁ\u0001"), valueOf);
            contentValues.put(ProtectedSandApp.s("ᜂ\u0001"), ProtectedSandApp.s("ᜃ\u0001"));
        }
        return contentValues;
    }

    public static ContentValues buildVideoContentValues(String str, String str2) {
        String valueOf = ValueOf.toString(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        boolean isEmpty = TextUtils.isEmpty(str);
        String s4 = ProtectedSandApp.s("ᜄ\u0001");
        String s5 = ProtectedSandApp.s("\u16fc\u0001");
        if (isEmpty) {
            contentValues.put(s5, DateUtils.getCreateFileName(s4));
        } else {
            String s6 = ProtectedSandApp.s("\u16fd\u0001");
            if (str.lastIndexOf(s6) == -1) {
                contentValues.put(s5, DateUtils.getCreateFileName(s4));
            } else {
                contentValues.put(s5, str.replaceAll(str.substring(str.lastIndexOf(s6)), ""));
            }
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith(ProtectedSandApp.s("ᜅ\u0001"))) {
            str2 = ProtectedSandApp.s("ᜆ\u0001");
        }
        contentValues.put(ProtectedSandApp.s("ᜀ\u0001"), str2);
        if (SdkVersionUtils.isQ()) {
            contentValues.put(ProtectedSandApp.s("ᜁ\u0001"), valueOf);
            contentValues.put(ProtectedSandApp.s("ᜂ\u0001"), Environment.DIRECTORY_MOVIES);
        }
        return contentValues;
    }

    public static Uri createCameraOutImageUri(Context context, SelectorConfig selectorConfig) {
        String str;
        if (TextUtils.isEmpty(selectorConfig.outPutCameraImageFileName)) {
            str = "";
        } else if (selectorConfig.isOnlyCamera) {
            str = selectorConfig.outPutCameraImageFileName;
        } else {
            str = System.currentTimeMillis() + ProtectedSandApp.s("ᜇ\u0001") + selectorConfig.outPutCameraImageFileName;
        }
        if (SdkVersionUtils.isQ() && TextUtils.isEmpty(selectorConfig.outPutCameraDir)) {
            Uri createImageUri = createImageUri(context, str, selectorConfig.cameraImageFormatForQ);
            selectorConfig.cameraPath = createImageUri != null ? createImageUri.toString() : "";
            return createImageUri;
        }
        File createCameraFile = PictureFileUtils.createCameraFile(context, 1, str, selectorConfig.cameraImageFormat, selectorConfig.outPutCameraDir);
        selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
        return PictureFileUtils.parUri(context, createCameraFile);
    }

    public static Uri createCameraOutVideoUri(Context context, SelectorConfig selectorConfig) {
        String str;
        if (TextUtils.isEmpty(selectorConfig.outPutCameraVideoFileName)) {
            str = "";
        } else if (selectorConfig.isOnlyCamera) {
            str = selectorConfig.outPutCameraVideoFileName;
        } else {
            str = System.currentTimeMillis() + ProtectedSandApp.s("ᜇ\u0001") + selectorConfig.outPutCameraVideoFileName;
        }
        if (SdkVersionUtils.isQ() && TextUtils.isEmpty(selectorConfig.outPutCameraDir)) {
            Uri createVideoUri = createVideoUri(context, str, selectorConfig.cameraVideoFormatForQ);
            selectorConfig.cameraPath = createVideoUri != null ? createVideoUri.toString() : "";
            return createVideoUri;
        }
        File createCameraFile = PictureFileUtils.createCameraFile(context, 2, str, selectorConfig.cameraVideoFormat, selectorConfig.outPutCameraDir);
        selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
        return PictureFileUtils.parUri(context, createCameraFile);
    }

    public static Uri createImageUri(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues buildImageContentValues = buildImageContentValues(str, str2);
        if (externalStorageState.equals(ProtectedSandApp.s("ᜈ\u0001"))) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, buildImageContentValues);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, buildImageContentValues);
        }
        return uriArr[0];
    }

    public static Uri createVideoUri(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues buildVideoContentValues = buildVideoContentValues(str, str2);
        if (externalStorageState.equals(ProtectedSandApp.s("ᜈ\u0001"))) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, buildVideoContentValues);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, buildVideoContentValues);
        }
        return uriArr[0];
    }
}
