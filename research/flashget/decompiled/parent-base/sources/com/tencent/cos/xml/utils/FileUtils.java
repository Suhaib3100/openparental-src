package com.tencent.cos.xml.utils;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlBaseService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes7.dex */
public class FileUtils {
    public static boolean clearFile(String str) throws IOException {
        if (deleteFileIfExist(str)) {
            return new File(str).createNewFile();
        }
        return false;
    }

    public static boolean deleteFileIfExist(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static void intercept(String str, long j4, long j5) throws IOException {
        if (j5 <= 0) {
            clearFile(str);
        }
        File file = new File(str);
        File file2 = new File(str.concat(ProtectedSandApp.s("僴\u0001") + System.currentTimeMillis() + ProtectedSandApp.s("僵\u0001")));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileInputStream fileInputStream = new FileInputStream(file);
        if (j4 > 0 && fileInputStream.skip(j4) != j4) {
            throw new IOException(ProtectedSandApp.s("僶\u0001"));
        }
        byte[] bArr = new byte[65536];
        long j6 = 65536;
        long min = Math.min(j6, j5);
        while (true) {
            int read = fileInputStream.read(bArr, 0, (int) min);
            if (read <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
            j5 -= read;
            min = Math.min(j6, j5);
        }
        deleteFileIfExist(str);
        if (!file2.renameTo(file)) {
            throw new IOException(d.a(ProtectedSandApp.s("僷\u0001"), str, ProtectedSandApp.s("僸\u0001")));
        }
    }

    public static File[] listFile(File file) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        return file.listFiles();
    }

    public static void saveInputStreamToTmpFile(InputStream inputStream, File file, long j4, long j5) throws IOException {
        FileOutputStream fileOutputStream;
        int read;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            long j6 = 0;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            if (j4 > 0) {
                inputStream.skip(j4);
            }
            while (j6 < j5 && (read = inputStream.read(bArr)) != -1) {
                long j7 = read;
                fileOutputStream.write(bArr, 0, (int) Math.min(j7, j5 - j6));
                j6 += j7;
            }
            fileOutputStream.flush();
            OkhttpInternalUtils.closeQuietly(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                OkhttpInternalUtils.closeQuietly(fileOutputStream2);
            }
            throw th;
        }
    }

    public static String tempCache(InputStream inputStream) throws CosXmlClientException {
        String str;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                str = CosXmlBaseService.appCachePath + File.separator + ProtectedSandApp.s("價\u0001");
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr, 0, 65536);
                if (read <= 0) {
                    fileOutputStream.flush();
                    CloseUtil.closeQuietly(fileOutputStream);
                    CloseUtil.closeQuietly(inputStream);
                    return str;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            CloseUtil.closeQuietly(fileOutputStream2);
            CloseUtil.closeQuietly(inputStream);
            throw th;
        }
    }

    public static boolean truncateFile(File file, long j4) {
        if (file != null && file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("僺\u0001"));
                try {
                    randomAccessFile.setLength(j4);
                    randomAccessFile.close();
                    return true;
                } finally {
                }
            } catch (IOException e4) {
                COSLogger.wProcess(ProtectedSandApp.s("僼\u0001"), ProtectedSandApp.s("僻\u0001") + e4.getMessage());
            }
        }
        return false;
    }
}
