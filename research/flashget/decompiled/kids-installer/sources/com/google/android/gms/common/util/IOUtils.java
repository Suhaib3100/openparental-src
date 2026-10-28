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
import javax.annotation.Nullable;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
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
            if ((((bArr[1] & UByte.f27220r) << 8) | (bArr[0] & UByte.f27220r)) == 35615) {
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
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(@o0 InputStream inputStream, @o0 OutputStream outputStream, boolean z5, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        long j5 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i5);
                if (read == -1) {
                    break;
                }
                j5 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z5) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z5) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j5;
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@o0 InputStream inputStream, boolean z5) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z5, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
