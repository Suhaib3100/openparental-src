package com.cby.shareboard.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.x0;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import kd.n;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.text.r;
import kotlin.text.v;

/* compiled from: FileUtil.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b&\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ\u0015\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\bJ\u0015\u0010)\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\bJ\u001f\u0010+\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010\u001bJ!\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\bJ\u0017\u00103\u001a\u0004\u0018\u0001022\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J'\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0011\u0010F\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006G"}, d2 = {"Lcom/cby/shareboard/utils/FileUtil;", "", "<init>", "()V", "", "path", "", "isFile", "(Ljava/lang/String;)Z", "type", "alName", "Ljava/io/File;", "getDir", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Landroid/content/Context;", "context", "getFilePath", "(Landroid/content/Context;)Ljava/lang/String;", "getFileImgPath", "getFileAudioPath", "getCachePath", "createRootPath", "file", "createFile", "(Ljava/io/File;)Ljava/lang/String;", "dirPath", "createDir", "(Ljava/lang/String;)Ljava/lang/String;", "", "fileLen", "formatFileSizeToString", "(J)Ljava/lang/String;", "src", "desc", "fileChannelCopy", "(Ljava/io/File;Ljava/io/File;)Z", "isExists", "(Ljava/io/File;)Z", "deleteFile", "filePath", "deleteDirectory", "deleteFolder", "Lkotlin/k2;", "notifyGalleryUpdate", "(Landroid/content/Context;Ljava/lang/String;)V", "fileToBase64", "base64Str", "base64ToFile", "(Ljava/lang/String;Ljava/lang/String;)Z", "isValidBase64", "Landroid/graphics/Bitmap;", "filePathToBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "newDirectoryPath", "moveFileToDirectory", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "newFileName", "moveFileToDirectoryWithRename", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LOG_TAG", "Ljava/lang/String;", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "isSdCardAvailable", "()Z", "isExternalStorageWritable", "isExternalStorageReadable", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@x0(8)
/* loaded from: classes3.dex */
public final class FileUtil {

    @l
    private static final String LOG_TAG = ProtectedSandApp.s("\u0c75");

    @l
    public static final FileUtil INSTANCE = new FileUtil();

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private static final b0 logger = c0.c(FileUtil$logger$2.INSTANCE);

    private FileUtil() {
    }

    public static /* synthetic */ File getDir$default(FileUtil fileUtil, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = Environment.DIRECTORY_PICTURES;
            l0.o(str, ProtectedSandApp.s("\u0c76"));
        }
        return fileUtil.getDir(str, str2);
    }

    private final LogUtils getLogger() {
        return (LogUtils) logger.getValue();
    }

    @n
    public static final boolean isFile(@m String path) {
        return new File(path).isFile();
    }

    private final boolean isSdCardAvailable() {
        return l0.g(ProtectedSandApp.s("౷"), Environment.getExternalStorageState());
    }

    public final boolean base64ToFile(@m String base64Str, @m String path) {
        if (base64Str == null || v.S1(base64Str)) {
            getLogger().debug(ProtectedSandApp.s("౿"));
            return false;
        }
        String m32 = w.m3(v.r6(new r(ProtectedSandApp.s("౻")).m(v.i2(v.i2(v.i2(base64Str, ProtectedSandApp.s("౸"), "", false, 4, null), ProtectedSandApp.s("౹"), "", false, 4, null), ProtectedSandApp.s("౺"), "", false, 4, null), ""), 76), ProtectedSandApp.s("౹"), null, null, 0, null, null, 62, null);
        getLogger().debug(ProtectedSandApp.s("౼") + m32);
        String i22 = v.i2(m32, ProtectedSandApp.s("౹"), "", false, 4, null);
        if (!isValidBase64(i22)) {
            getLogger().debug(ProtectedSandApp.s("౽"));
            return false;
        }
        byte[] decode = Base64.decode(i22, 2);
        l0.o(decode, ProtectedSandApp.s("౾"));
        int length = decode.length;
        for (int i4 = 0; i4 < length; i4++) {
            byte b5 = decode[i4];
            if (b5 < 0) {
                decode[i4] = (byte) (b5 + 256);
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @l
    public final String createDir(@l String dirPath) {
        File file;
        boolean exists;
        String s4;
        String s5;
        l0.p(dirPath, ProtectedSandApp.s("ಀ"));
        try {
            file = new File(dirPath);
            exists = file.getParentFile().exists();
            s4 = ProtectedSandApp.s("ಁ");
            s5 = ProtectedSandApp.s("ಂ");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (exists) {
            getLogger().debug(s5 + file.getAbsolutePath());
            file.mkdir();
            String absolutePath = file.getAbsolutePath();
            l0.o(absolutePath, s4);
            return absolutePath;
        }
        String absolutePath2 = file.getParentFile().getAbsolutePath();
        l0.o(absolutePath2, s4);
        createDir(absolutePath2);
        getLogger().debug(s5 + file.getAbsolutePath());
        file.mkdir();
        return dirPath;
    }

    @l
    public final String createFile(@l File file) {
        l0.p(file, ProtectedSandApp.s("\u0c75"));
        try {
            boolean exists = file.getParentFile().exists();
            String s4 = ProtectedSandApp.s("ಁ");
            String s5 = ProtectedSandApp.s("ಃ");
            if (exists) {
                getLogger().debug(s5 + file.getAbsolutePath());
                file.createNewFile();
                String absolutePath = file.getAbsolutePath();
                l0.o(absolutePath, s4);
                return absolutePath;
            }
            String absolutePath2 = file.getParentFile().getAbsolutePath();
            l0.o(absolutePath2, s4);
            createDir(absolutePath2);
            file.createNewFile();
            getLogger().debug(s5 + file.getAbsolutePath());
            return "";
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @l
    public final String createRootPath(@l Context context) {
        l0.p(context, ProtectedSandApp.s("಄"));
        if (!isSdCardAvailable()) {
            String path = context.getCacheDir().getPath();
            l0.m(path);
            return path;
        }
        File externalCacheDir = context.getExternalCacheDir();
        l0.m(externalCacheDir);
        String path2 = externalCacheDir.getPath();
        l0.m(path2);
        return path2;
    }

    public final boolean deleteDirectory(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("ಅ"));
        String str = File.separator;
        l0.o(str, ProtectedSandApp.s("ಆ"));
        if (!v.J1(filePath, str, false, 2, null)) {
            filePath = j.a(filePath, str);
        }
        File file = new File(filePath);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        boolean z4 = true;
        for (int i4 = 0; i4 < length; i4++) {
            boolean isFile = listFiles[i4].isFile();
            String s4 = ProtectedSandApp.s("ಁ");
            if (!isFile) {
                String absolutePath = listFiles[i4].getAbsolutePath();
                l0.o(absolutePath, s4);
                z4 = deleteDirectory(absolutePath);
                if (!z4) {
                    break;
                }
            } else {
                String absolutePath2 = listFiles[i4].getAbsolutePath();
                l0.o(absolutePath2, s4);
                z4 = deleteFile(absolutePath2);
                if (!z4) {
                    break;
                }
            }
        }
        if (z4) {
            return file.delete();
        }
        return false;
    }

    public final boolean deleteFile(@l File file) {
        l0.p(file, ProtectedSandApp.s("\u0c75"));
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public final boolean deleteFolder(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("ಅ"));
        File file = new File(filePath);
        if (file.exists()) {
            return file.isFile() ? deleteFile(filePath) : deleteDirectory(filePath);
        }
        return false;
    }

    public final boolean fileChannelCopy(@m File src, @l File desc) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        l0.p(desc, ProtectedSandApp.s("ಇ"));
        createFile(desc);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(src);
                try {
                    fileOutputStream = new FileOutputStream(desc);
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                FileChannel channel = fileInputStream.getChannel();
                channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
                try {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return true;
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return false;
                    }
                }
                if (fileInputStream == null) {
                    return false;
                }
                fileInputStream.close();
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    @m
    public final Bitmap filePathToBitmap(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("ಅ"));
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            return BitmapFactory.decodeFile(filePath);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0021 -> B:11:0x0036). Please report as a decompilation issue!!! */
    @m
    public final String fileToBase64(@m String path) {
        FileInputStream fileInputStream;
        ?? isEmpty = TextUtils.isEmpty(path);
        String str = null;
        str = null;
        str = null;
        InputStream inputStream = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                inputStream = isEmpty;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            isEmpty = isEmpty;
        }
        if (isEmpty != 0) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(path);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                str = Base64.encodeToString(bArr, 16);
                fileInputStream.close();
                isEmpty = fileInputStream;
            } catch (Exception e5) {
                e = e5;
                e.printStackTrace();
                isEmpty = fileInputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    isEmpty = fileInputStream;
                }
                return str;
            }
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        return str;
    }

    @l
    public final String formatFileSizeToString(long fileLen) {
        DecimalFormat decimalFormat = new DecimalFormat(ProtectedSandApp.s("ಈ"));
        return fileLen < 1024 ? j.a(decimalFormat.format(fileLen), ProtectedSandApp.s("ಉ")) : fileLen < 1048576 ? j.a(decimalFormat.format(fileLen / 1024), ProtectedSandApp.s("ಊ")) : fileLen < 1073741824 ? j.a(decimalFormat.format(fileLen / 1048576), ProtectedSandApp.s("ಋ")) : j.a(decimalFormat.format(fileLen / 1073741824), ProtectedSandApp.s("ಌ"));
    }

    @l
    public final String getCachePath(@l Context context) {
        l0.p(context, ProtectedSandApp.s("಄"));
        if (!l0.g(Environment.getExternalStorageState(), ProtectedSandApp.s("౷"))) {
            String path = context.getCacheDir().getPath();
            l0.m(path);
            return path;
        }
        File externalCacheDir = context.getExternalCacheDir();
        l0.m(externalCacheDir);
        String path2 = externalCacheDir.getPath();
        l0.m(path2);
        return path2;
    }

    @l
    public final File getDir(@l String type, @m String alName) {
        l0.p(type, ProtectedSandApp.s("\u0c8d"));
        File file = new File(Environment.getExternalStoragePublicDirectory(type), alName);
        file.mkdirs();
        return file;
    }

    @l
    public final String getFileAudioPath(@l Context context) {
        String path;
        l0.p(context, ProtectedSandApp.s("಄"));
        if (l0.g(Environment.getExternalStorageState(), ProtectedSandApp.s("౷"))) {
            File externalFilesDir = context.getExternalFilesDir(null);
            l0.m(externalFilesDir);
            path = j.a(externalFilesDir.getPath(), ProtectedSandApp.s("ಎ"));
        } else {
            path = context.getFilesDir().getPath();
            l0.m(path);
        }
        if (!a.a(path)) {
            new File(path).mkdirs();
        }
        return path;
    }

    @l
    public final String getFileImgPath(@l Context context) {
        String path;
        l0.p(context, ProtectedSandApp.s("಄"));
        if (l0.g(Environment.getExternalStorageState(), ProtectedSandApp.s("౷"))) {
            File externalFilesDir = context.getExternalFilesDir(null);
            l0.m(externalFilesDir);
            path = j.a(externalFilesDir.getPath(), ProtectedSandApp.s("ಏ"));
        } else {
            path = context.getFilesDir().getPath();
            l0.m(path);
        }
        if (!a.a(path)) {
            new File(path).mkdirs();
        }
        return path;
    }

    @l
    public final String getFilePath(@l Context context) {
        l0.p(context, ProtectedSandApp.s("಄"));
        if (!l0.g(Environment.getExternalStorageState(), ProtectedSandApp.s("౷"))) {
            String path = context.getFilesDir().getPath();
            l0.m(path);
            return path;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        l0.m(externalFilesDir);
        String path2 = externalFilesDir.getPath();
        l0.m(path2);
        return path2;
    }

    public final boolean isExists(@l File file) {
        l0.p(file, ProtectedSandApp.s("\u0c75"));
        return file.exists();
    }

    public final boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        return l0.g(ProtectedSandApp.s("౷"), externalStorageState) || l0.g(ProtectedSandApp.s("ಐ"), externalStorageState);
    }

    public final boolean isExternalStorageWritable() {
        return l0.g(ProtectedSandApp.s("౷"), Environment.getExternalStorageState());
    }

    public final boolean isValidBase64(@l String base64Str) {
        l0.p(base64Str, ProtectedSandApp.s("\u0c91"));
        return Pattern.compile(ProtectedSandApp.s("ಒ")).matcher(base64Str).matches();
    }

    @m
    public final String moveFileToDirectory(@l File file, @l String newDirectoryPath) {
        l0.p(file, ProtectedSandApp.s("\u0c75"));
        l0.p(newDirectoryPath, ProtectedSandApp.s("ಓ"));
        try {
            File file2 = new File(newDirectoryPath);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, file.getName());
            if (file.renameTo(file3)) {
                return file3.getAbsolutePath();
            }
            return null;
        } catch (Exception e4) {
            getLogger().error(ProtectedSandApp.s("ಔ") + e4.getMessage());
            return null;
        }
    }

    @m
    public final String moveFileToDirectoryWithRename(@l File file, @l String newDirectoryPath, @l String newFileName) {
        l0.p(file, ProtectedSandApp.s("\u0c75"));
        l0.p(newDirectoryPath, ProtectedSandApp.s("ಓ"));
        l0.p(newFileName, ProtectedSandApp.s("ಕ"));
        try {
            File file2 = new File(newDirectoryPath);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, newFileName);
            if (file.renameTo(file3)) {
                return file3.getAbsolutePath();
            }
            return null;
        } catch (Exception e4) {
            getLogger().error(ProtectedSandApp.s("ಖ") + e4.getMessage());
            return null;
        }
    }

    public final void notifyGalleryUpdate(@l Context context, @m String filePath) {
        l0.p(context, ProtectedSandApp.s("಄"));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("ಗ"), filePath);
        contentValues.put(ProtectedSandApp.s("ಘ"), ProtectedSandApp.s("ಙ"));
        context.sendBroadcast(new Intent(ProtectedSandApp.s("ಚ"), context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)));
    }

    public final boolean deleteFile(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("ಅ"));
        File file = new File(filePath);
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }
}
