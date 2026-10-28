package com.luck.picture.lib.utils;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i;
import androidx.core.content.FileProvider;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes6.dex */
public class PictureFileUtils {
    private static final int BYTE_SIZE = 1024;
    private static final String POSTFIX_AMR = ProtectedSandApp.s("\u1737\u0001");
    private static final String POSTFIX_JPG = ProtectedSandApp.s("᜶\u0001");
    private static final String POSTFIX_MP4 = ProtectedSandApp.s("\u1738\u0001");
    static final String TAG = ProtectedSandApp.s("ᝒ\u0001");

    private PictureFileUtils() {
    }

    public static void close(@q0 Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copyFile(@o0 String str, @o0 String str2) {
        FileChannel fileChannel;
        FileChannel channel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel2 = null;
        try {
            channel = new FileInputStream(str).getChannel();
        } catch (Exception e4) {
            e = e4;
            fileChannel = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(str2).getChannel();
            channel.transferTo(0L, channel.size(), fileChannel2);
            close(channel);
            close(fileChannel2);
        } catch (Exception e5) {
            e = e5;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            try {
                e.printStackTrace();
                close(fileChannel2);
                close(fileChannel);
            } catch (Throwable th2) {
                th = th2;
                close(fileChannel2);
                close(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            FileChannel fileChannel4 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel4;
            close(fileChannel2);
            close(fileChannel);
            throw th;
        }
    }

    public static File createCameraFile(Context context, int i4, String str, String str2, String str3) {
        return createMediaFile(context, i4, str, str2, str3);
    }

    public static String createFilePath(Context context, String str, String str2) {
        File rootDirFile;
        String s4;
        String lastSourceSuffix = PictureMimeType.getLastSourceSuffix(str);
        if (PictureMimeType.isHasVideo(str)) {
            rootDirFile = getRootDirFile(context, 2);
            s4 = ProtectedSandApp.s("ᜱ\u0001");
        } else if (PictureMimeType.isHasAudio(str)) {
            rootDirFile = getRootDirFile(context, 3);
            s4 = ProtectedSandApp.s("ᜲ\u0001");
        } else {
            rootDirFile = getRootDirFile(context, 1);
            s4 = ProtectedSandApp.s("ᜳ\u0001");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rootDirFile.getPath());
        sb.append(File.separator);
        if (TextUtils.isEmpty(str2)) {
            str2 = DateUtils.getCreateFileName(s4) + lastSourceSuffix;
        }
        sb.append(str2);
        return sb.toString();
    }

    private static File createMediaFile(Context context, int i4, String str, String str2, String str3) {
        return createOutFile(context, i4, str, str2, str3);
    }

    private static File createOutFile(Context context, int i4, String str, String str2, String str3) {
        File file;
        File rootDirFile;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(ProtectedSandApp.s("᜴\u0001"), Environment.getExternalStorageState())) {
                rootDirFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb = new StringBuilder();
                sb.append(rootDirFile.getAbsolutePath());
                String str4 = File.separator;
                file = new File(k0.a(sb, str4, ProtectedSandApp.s("᜵\u0001"), str4));
            } else {
                rootDirFile = getRootDirFile(applicationContext, i4);
                file = new File(rootDirFile.getAbsolutePath() + File.separator);
            }
            if (!rootDirFile.exists()) {
                rootDirFile.mkdirs();
            }
        } else {
            File file2 = new File(str3);
            File parentFile = file2.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i4 == 2) {
            if (isEmpty) {
                str = DateUtils.getCreateFileName(ProtectedSandApp.s("ᜱ\u0001")) + ProtectedSandApp.s("\u1738\u0001");
            }
            return new File(file, str);
        }
        if (i4 == 3) {
            if (isEmpty) {
                str = DateUtils.getCreateFileName(ProtectedSandApp.s("ᜲ\u0001")) + ProtectedSandApp.s("\u1737\u0001");
            }
            return new File(file, str);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ProtectedSandApp.s("᜶\u0001");
        }
        if (isEmpty) {
            str = DateUtils.getCreateFileName(ProtectedSandApp.s("ᜳ\u0001")) + str2;
        }
        return new File(file, str);
    }

    @Deprecated
    public static void deleteAllCacheDirFile(Context context) {
        File[] listFiles;
        File[] listFiles2;
        File[] listFiles3;
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir != null && (listFiles3 = externalFilesDir.listFiles()) != null) {
            for (File file : listFiles3) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
        File externalFilesDir2 = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir2 != null && (listFiles2 = externalFilesDir2.listFiles()) != null) {
            for (File file2 : listFiles2) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        File externalFilesDir3 = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        if (externalFilesDir3 == null || (listFiles = externalFilesDir3.listFiles()) == null) {
            return;
        }
        for (File file3 : listFiles) {
            if (file3.isFile()) {
                file3.delete();
            }
        }
    }

    @Deprecated
    public static void deleteCacheDirFile(Context context, int i4) {
        File[] listFiles;
        File externalFilesDir = context.getExternalFilesDir(i4 == SelectMimeType.ofImage() ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES);
        if (externalFilesDir == null || (listFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatAccurateUnitFileSize(long j4) {
        double d5;
        String s4;
        if (j4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u173e\u0001"));
        }
        if (j4 < 1000) {
            d5 = j4;
            s4 = "";
        } else if (j4 < 1000000) {
            d5 = j4 / 1000.0d;
            s4 = ProtectedSandApp.s("\u1739\u0001");
        } else if (j4 < 1000000000) {
            d5 = j4 / 1000000.0d;
            s4 = ProtectedSandApp.s("\u173a\u0001");
        } else {
            d5 = j4 / 1.0E9d;
            s4 = ProtectedSandApp.s("\u173b\u0001");
        }
        Object format = String.format(new Locale(ProtectedSandApp.s("\u173c\u0001")), ProtectedSandApp.s("\u173d\u0001"), Double.valueOf(d5));
        StringBuilder sb = new StringBuilder();
        if (Math.round(ValueOf.toDouble(format)) - ValueOf.toDouble(format) == p.f60679p) {
            format = Long.valueOf(Math.round(ValueOf.toDouble(format)));
        }
        return i.a(sb, format, s4);
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatFileSize(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u173e\u0001"));
        }
        String s4 = ProtectedSandApp.s("\u173d\u0001");
        if (j4 < 1024) {
            Object format = String.format(s4, Double.valueOf(j4));
            double d5 = ValueOf.toDouble(format);
            long round = Math.round(d5);
            StringBuilder sb = new StringBuilder();
            if (round - d5 == p.f60679p) {
                format = Long.valueOf(round);
            }
            return i.a(sb, format, ProtectedSandApp.s("\u173f\u0001"));
        }
        if (j4 < 1048576) {
            Object format2 = String.format(s4, Double.valueOf(j4 / 1024.0d));
            double d6 = ValueOf.toDouble(format2);
            long round2 = Math.round(d6);
            StringBuilder sb2 = new StringBuilder();
            if (round2 - d6 == p.f60679p) {
                format2 = Long.valueOf(round2);
            }
            return i.a(sb2, format2, ProtectedSandApp.s("\u1739\u0001"));
        }
        if (j4 < 1073741824) {
            Object format3 = String.format(s4, Double.valueOf(j4 / 1048576.0d));
            double d7 = ValueOf.toDouble(format3);
            long round3 = Math.round(d7);
            StringBuilder sb3 = new StringBuilder();
            if (round3 - d7 == p.f60679p) {
                format3 = Long.valueOf(round3);
            }
            return i.a(sb3, format3, ProtectedSandApp.s("\u173a\u0001"));
        }
        Object format4 = String.format(s4, Double.valueOf(j4 / 1.073741824E9d));
        double d10 = ValueOf.toDouble(format4);
        long round4 = Math.round(d10);
        StringBuilder sb4 = new StringBuilder();
        if (round4 - d10 == p.f60679p) {
            format4 = Long.valueOf(round4);
        }
        return i.a(sb4, format4, ProtectedSandApp.s("\u173b\u0001"));
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        String s4 = ProtectedSandApp.s("ᝀ\u0001");
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{s4}, str, strArr, null);
            } catch (IllegalArgumentException e4) {
                String.format(Locale.getDefault(), ProtectedSandApp.s("ᝁ\u0001"), e4.getMessage());
                if (cursor == null) {
                    return "";
                }
            }
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(s4));
                cursor.close();
                return string;
            }
            if (cursor == null) {
                return "";
            }
            cursor.close();
            return "";
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    public static String getPath(Context context, Uri uri) {
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (!DocumentsContract.isDocumentUri(applicationContext, uri)) {
            return ProtectedSandApp.s("ᝊ\u0001").equalsIgnoreCase(uri.getScheme()) ? isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(applicationContext, uri, null, null) : ProtectedSandApp.s("ᝋ\u0001").equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : "";
        }
        boolean isExternalStorageDocument = isExternalStorageDocument(uri);
        String s4 = ProtectedSandApp.s("ᝂ\u0001");
        if (!isExternalStorageDocument) {
            if (isDownloadsDocument(uri)) {
                return getDataColumn(applicationContext, ContentUris.withAppendedId(Uri.parse(ProtectedSandApp.s("ᝅ\u0001")), ValueOf.toLong(DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (!isMediaDocument(uri)) {
                return "";
            }
            String[] split = DocumentsContract.getDocumentId(uri).split(s4);
            String str = split[0];
            if (ProtectedSandApp.s("ᝆ\u0001").equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (ProtectedSandApp.s("ᝇ\u0001").equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (ProtectedSandApp.s("ᝈ\u0001").equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(applicationContext, uri2, ProtectedSandApp.s("ᝉ\u0001"), new String[]{split[1]});
        }
        String[] split2 = DocumentsContract.getDocumentId(uri).split(s4);
        if (!ProtectedSandApp.s("ᝃ\u0001").equalsIgnoreCase(split2[0])) {
            return "";
        }
        boolean isQ = SdkVersionUtils.isQ();
        String s5 = ProtectedSandApp.s("ᝄ\u0001");
        if (isQ) {
            return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + s5 + split2[1];
        }
        return Environment.getExternalStorageDirectory() + s5 + split2[1];
    }

    private static File getRootDirFile(Context context, int i4) {
        return new File(FileDirMap.getFileDirPath(context, i4));
    }

    public static String getVideoThumbnailDir(Context context) {
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), ProtectedSandApp.s("ᝌ\u0001"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return ProtectedSandApp.s("ᝍ\u0001").equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return ProtectedSandApp.s("ᝎ\u0001").equals(uri.getAuthority());
    }

    public static boolean isFileExists(String str) {
        return !TextUtils.isEmpty(str) && com.cby.shareboard.utils.a.a(str);
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return ProtectedSandApp.s("ᝏ\u0001").equals(uri.getAuthority());
    }

    public static boolean isImageFileExists(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 2;
        BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public static boolean isMediaDocument(Uri uri) {
        return ProtectedSandApp.s("ᝐ\u0001").equals(uri.getAuthority());
    }

    public static Uri parUri(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ProtectedSandApp.s("ᝑ\u0001"), file);
    }

    public static boolean writeFileFromIS(InputStream inputStream, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        outputStream.flush();
                        close(bufferedInputStream2);
                        close(bufferedOutputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (Exception e5) {
                e = e5;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    close(bufferedInputStream);
                    close(bufferedOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    close(bufferedInputStream);
                    close(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                close(bufferedInputStream);
                close(bufferedOutputStream);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
