package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(@h ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(@o0 InputStream inputStream, @o0 OutputStream outputStream) throws IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    @KeepForSdk
    public static boolean isGzipByteBuffer(@o0 byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@o0 InputStream inputStream) throws IOException {
        return readInputStreamFully(inputStream, true);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static byte[] toByteArray(@o0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @KeepForSdk
    public static void closeQuietly(@h Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(@o0 InputStream inputStream, @o0 OutputStream outputStream, boolean z4, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        long j4 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i4);
                if (read == -1) {
                    break;
                }
                j4 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z4) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z4) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j4;
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@o0 InputStream inputStream, boolean z4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z4, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
