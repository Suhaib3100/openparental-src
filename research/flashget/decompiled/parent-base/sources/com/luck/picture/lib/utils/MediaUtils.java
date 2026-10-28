package com.luck.picture.lib.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.app.PictureAppMaster;
import com.luck.picture.lib.basic.PictureContentResolver;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.MediaExtraInfo;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

/* loaded from: classes6.dex */
public class MediaUtils {
    public static final String QUERY_ARG_SQL_LIMIT = ProtectedSandApp.s("ᜍ\u0001");

    public static Bundle createQueryArgsBundle(String str, String[] strArr, int i4, int i5, String str2) {
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString(ProtectedSandApp.s("ᜉ\u0001"), str);
            bundle.putStringArray(ProtectedSandApp.s("ᜊ\u0001"), strArr);
            bundle.putString(ProtectedSandApp.s("ᜋ\u0001"), str2);
            if (SdkVersionUtils.isR()) {
                bundle.putString(ProtectedSandApp.s("ᜍ\u0001"), i4 + ProtectedSandApp.s("ᜌ\u0001") + i5);
            }
        }
        return bundle;
    }

    public static void deleteUri(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str) || !PictureMimeType.isContent(str)) {
                return;
            }
            context.getContentResolver().delete(Uri.parse(str), null, null);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static String generateCameraFolderName(String str) {
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : ProtectedSandApp.s("ᜎ\u0001");
    }

    public static void getAsyncVideoThumbnail(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.3
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getVideoThumbnail(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static MediaExtraInfo getAudioSize(Context context, String str) {
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (PictureMimeType.isContent(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    mediaExtraInfo.setDuration(ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e4) {
                    e4.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return mediaExtraInfo;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            throw th;
        }
    }

    public static int getDCIMLastImageId(Context context, String str) {
        String s4 = ProtectedSandApp.s("ᜏ\u0001");
        Cursor cursor = null;
        try {
            try {
                String s5 = ProtectedSandApp.s("ᜐ\u0001");
                String[] strArr = {s4 + str + s4};
                cursor = SdkVersionUtils.isR() ? context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, createQueryArgsBundle(s5, strArr, 1, 0, ProtectedSandApp.s("ᜑ\u0001")), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, s5, strArr, ProtectedSandApp.s("ᜒ\u0001"));
                if (cursor == null || cursor.getCount() <= 0 || !cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1;
                }
                int i4 = DateUtils.dateDiffer(cursor.getLong(cursor.getColumnIndex(ProtectedSandApp.s("᜔\u0001")))) <= 1 ? cursor.getInt(cursor.getColumnIndex(ProtectedSandApp.s("ᜓ\u0001"))) : -1;
                cursor.close();
                return i4;
            } catch (Exception e4) {
                e4.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Deprecated
    public static MediaExtraInfo getImageSize(String str) {
        BitmapFactory.Options options;
        InputStream openInputStream;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        InputStream inputStream = null;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                openInputStream = PictureMimeType.isContent(str) ? PictureContentResolver.openInputStream(PictureAppMaster.getInstance().getAppContext(), Uri.parse(str)) : new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            BitmapFactory.decodeStream(openInputStream, null, options);
            mediaExtraInfo.setWidth(options.outWidth);
            mediaExtraInfo.setHeight(options.outHeight);
            PictureFileUtils.close(openInputStream);
        } catch (Exception e5) {
            inputStream = openInputStream;
            e = e5;
            e.printStackTrace();
            PictureFileUtils.close(inputStream);
            return mediaExtraInfo;
        } catch (Throwable th2) {
            inputStream = openInputStream;
            th = th2;
            PictureFileUtils.close(inputStream);
            throw th;
        }
        return mediaExtraInfo;
    }

    private static String getMimeType(File file) {
        return URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static String getMimeTypeFromMediaHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("᜕\u0001")) || str.toLowerCase().endsWith(ProtectedSandApp.s("\u1716\u0001"))) {
            return ProtectedSandApp.s("ᜨ\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("\u1717\u0001"))) {
            return ProtectedSandApp.s("\u1718\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("\u1719\u0001"))) {
            return ProtectedSandApp.s("\u171a\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("\u171b\u0001"))) {
            return ProtectedSandApp.s("\u171c\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("\u171d\u0001"))) {
            return ProtectedSandApp.s("\u171e\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("ᜟ\u0001"))) {
            return ProtectedSandApp.s("ᜠ\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("ᜡ\u0001"))) {
            return ProtectedSandApp.s("ᜢ\u0001");
        }
        boolean endsWith = str.toLowerCase().endsWith(ProtectedSandApp.s("ᜣ\u0001"));
        String s4 = ProtectedSandApp.s("ᜤ\u0001");
        if (endsWith) {
            return s4;
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("ᜥ\u0001"))) {
            return ProtectedSandApp.s("ᜦ\u0001");
        }
        if (str.toLowerCase().endsWith(ProtectedSandApp.s("ᜧ\u0001"))) {
            return s4;
        }
        return null;
    }

    public static String getMimeTypeFromMediaUrl(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = getMimeType(new File(str));
        }
        return TextUtils.isEmpty(mimeTypeFromExtension) ? ProtectedSandApp.s("ᜨ\u0001") : mimeTypeFromExtension;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r2 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long[] getPathMediaBucketId(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "ᜏ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r1 = 2
            java.lang.Long[] r1 = new java.lang.Long[r1]
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r4 = 1
            r1[r4] = r2
            r2 = 0
            java.lang.String r8 = "ᜐ\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.append(r12)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.append(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String[] r9 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r12 = com.luck.picture.lib.utils.SdkVersionUtils.isR()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = "ᜩ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            if (r12 == 0) goto L57
            java.lang.String r12 = "ᜑ\u0001"
            java.lang.String r12 = com.flashget.parentalcontrol.ProtectedSandApp.s(r12)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.os.Bundle r12 = createQueryArgsBundle(r8, r9, r4, r3, r12)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.net.Uri r0 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.database.Cursor r11 = com.luck.picture.lib.loader.a.a(r11, r0, r2, r12, r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
        L51:
            r2 = r11
            goto L6b
        L53:
            r11 = move-exception
            goto Lae
        L55:
            r11 = move-exception
            goto La7
        L57:
            java.lang.String r10 = "ᜒ\u0001"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.net.Uri r6 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r7 = 0
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            goto L51
        L6b:
            if (r2 == 0) goto La1
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r11 <= 0) goto La1
            boolean r11 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r11 == 0) goto La1
            java.lang.String r11 = "ᜓ\u0001"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r1[r3] = r11     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r11 = "ᜪ\u0001"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r1[r4] = r11     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
        La1:
            if (r2 == 0) goto Lad
        La3:
            r2.close()
            goto Lad
        La7:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto Lad
            goto La3
        Lad:
            return r1
        Lae:
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.MediaUtils.getPathMediaBucketId(android.content.Context, java.lang.String):java.lang.Long[]");
    }

    public static String getRealPathUri(long j4, String str) {
        return ContentUris.withAppendedId(PictureMimeType.isHasImage(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : PictureMimeType.isHasVideo(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : PictureMimeType.isHasAudio(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri(ProtectedSandApp.s("ᜩ\u0001")), j4).toString();
    }

    public static void getVideoSize(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getVideoSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static MediaExtraInfo getVideoThumbnail(Context context, String str) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap;
        Bitmap frameAtTime;
        FileOutputStream fileOutputStream2;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (PictureMimeType.isContent(str)) {
                mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
            bitmap = null;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
            bitmap = null;
        }
        if (frameAtTime != null) {
            try {
            } catch (IOException e5) {
                e = e5;
                bitmap = frameAtTime;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bitmap = frameAtTime;
                fileOutputStream = null;
            }
            if (!frameAtTime.isRecycled()) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream2);
                    File file = new File(PictureFileUtils.getVideoThumbnailDir(context), DateUtils.getCreateFileName(ProtectedSandApp.s("ᜭ\u0001")) + ProtectedSandApp.s("ᜮ\u0001"));
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(byteArrayOutputStream2.toByteArray());
                        fileOutputStream2.flush();
                        mediaExtraInfo.setVideoThumbnail(file.getAbsolutePath());
                        mediaExtraInfo.setWidth(frameAtTime.getWidth());
                        mediaExtraInfo.setHeight(frameAtTime.getHeight());
                        byteArrayOutputStream = byteArrayOutputStream2;
                        PictureFileUtils.close(byteArrayOutputStream);
                        PictureFileUtils.close(fileOutputStream2);
                        if (frameAtTime != null && !frameAtTime.isRecycled()) {
                            frameAtTime.recycle();
                        }
                    } catch (IOException e6) {
                        fileOutputStream = fileOutputStream2;
                        e = e6;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        bitmap = frameAtTime;
                        try {
                            e.printStackTrace();
                            PictureFileUtils.close(byteArrayOutputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmap != null && !bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            return mediaExtraInfo;
                        } catch (Throwable th3) {
                            th = th3;
                            PictureFileUtils.close(byteArrayOutputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmap != null && !bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        bitmap = frameAtTime;
                        fileOutputStream = fileOutputStream2;
                        th = th4;
                        PictureFileUtils.close(byteArrayOutputStream);
                        PictureFileUtils.close(fileOutputStream);
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                    bitmap = frameAtTime;
                    fileOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Throwable th5) {
                    th = th5;
                    bitmap = frameAtTime;
                    fileOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                }
                return mediaExtraInfo;
            }
        }
        fileOutputStream2 = null;
        PictureFileUtils.close(byteArrayOutputStream);
        PictureFileUtils.close(fileOutputStream2);
        if (frameAtTime != null) {
            frameAtTime.recycle();
        }
        return mediaExtraInfo;
    }

    public static boolean isLongImage(int i4, int i5) {
        return i4 > 0 && i5 > 0 && i5 > i4 * 3;
    }

    public static void removeMedia(Context context, int i4) {
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ProtectedSandApp.s("ᜯ\u0001"), new String[]{Long.toString(i4)});
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static MediaExtraInfo getVideoSize(Context context, String str) {
        String extractMetadata;
        int i4;
        int i5;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (PictureMimeType.isContent(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                } catch (Exception e4) {
                    e4.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (!TextUtils.equals(ProtectedSandApp.s("ᜫ\u0001"), extractMetadata) && !TextUtils.equals(ProtectedSandApp.s("ᜬ\u0001"), extractMetadata)) {
                i5 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
                i4 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
                mediaExtraInfo.setWidth(i5);
                mediaExtraInfo.setHeight(i4);
                mediaExtraInfo.setOrientation(extractMetadata);
                mediaExtraInfo.setDuration(ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                mediaMetadataRetriever.release();
                return mediaExtraInfo;
            }
            int i6 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
            i4 = i6;
            i5 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
            mediaExtraInfo.setWidth(i5);
            mediaExtraInfo.setHeight(i4);
            mediaExtraInfo.setOrientation(extractMetadata);
            mediaExtraInfo.setDuration(ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
            mediaMetadataRetriever.release();
            return mediaExtraInfo;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            throw th;
        }
    }

    public static MediaExtraInfo getImageSize(Context context, String str) {
        BitmapFactory.Options options;
        InputStream fileInputStream;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        InputStream inputStream = null;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (PictureMimeType.isContent(str)) {
                    fileInputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                } else {
                    fileInputStream = new FileInputStream(str);
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            BitmapFactory.decodeStream(fileInputStream, null, options);
            mediaExtraInfo.setWidth(options.outWidth);
            mediaExtraInfo.setHeight(options.outHeight);
            PictureFileUtils.close(fileInputStream);
        } catch (Exception e5) {
            inputStream = fileInputStream;
            e = e5;
            e.printStackTrace();
            PictureFileUtils.close(inputStream);
            return mediaExtraInfo;
        } catch (Throwable th2) {
            inputStream = fileInputStream;
            th = th2;
            PictureFileUtils.close(inputStream);
            throw th;
        }
        return mediaExtraInfo;
    }

    public static void getImageSize(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getImageSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }
}
