package com.yalantis.ucrop.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.x0;
import androidx.core.view.u0;
import androidx.exifinterface.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    public static final int UNKNOWN_ORIENTATION = -1;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = ProtectedSandApp.s("弰\u0001");
    private static final String TAG = ProtectedSandApp.s("弱\u0001");
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = ProtectedSandApp.s("弰\u0001").getBytes(Charset.forName(ProtectedSandApp.s("弲\u0001")));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static class RandomAccessReader {
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i4) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
        }

        public short getInt16(int i4) {
            return this.data.getShort(i4);
        }

        public int getInt32(int i4) {
            return this.data.getInt(i4);
        }

        public int length() {
            return this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }
    }

    private interface Reader {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i4) throws IOException;

        long skip(long j4) throws IOException;
    }

    private static class StreamReader implements Reader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return ((this.is.read() << 8) & u0.f27413f) | (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            return (short) (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i4) throws IOException {
            int i5 = i4;
            while (i5 > 0) {
                int read = this.is.read(bArr, i4 - i5, i5);
                if (read == -1) {
                    break;
                }
                i5 -= read;
            }
            return i4 - i5;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j4) throws IOException {
            if (j4 < 0) {
                return 0L;
            }
            long j5 = j4;
            while (j5 > 0) {
                long skip = this.is.skip(j5);
                if (skip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j5 -= skip;
            }
            return j4 - j5;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i4, int i5) {
        return (i5 * 12) + i4 + 2;
    }

    public static void copyExif(a aVar, int i4, int i5, String str) {
        try {
            copyExifAttributes(aVar, new a(str), i4, i5);
        } catch (IOException e4) {
            e4.getMessage();
        }
    }

    private static void copyExifAttributes(a aVar, a aVar2, int i4, int i5) throws IOException {
        String[] strArr = {ProtectedSandApp.s("弶\u0001"), ProtectedSandApp.s("強\u0001"), ProtectedSandApp.s("弸\u0001"), ProtectedSandApp.s("弹\u0001"), ProtectedSandApp.s("强\u0001"), ProtectedSandApp.s("弻\u0001"), ProtectedSandApp.s("弼\u0001"), ProtectedSandApp.s("弽\u0001"), ProtectedSandApp.s("弾\u0001"), ProtectedSandApp.s("弿\u0001"), ProtectedSandApp.s("彀\u0001"), ProtectedSandApp.s("彁\u0001"), ProtectedSandApp.s("彂\u0001"), ProtectedSandApp.s("彃\u0001"), ProtectedSandApp.s("彄\u0001"), ProtectedSandApp.s("彅\u0001"), ProtectedSandApp.s("彆\u0001"), ProtectedSandApp.s("彇\u0001"), ProtectedSandApp.s("彈\u0001"), ProtectedSandApp.s("彉\u0001"), ProtectedSandApp.s("弴\u0001"), ProtectedSandApp.s("張\u0001")};
        for (int i6 = 0; i6 < 22; i6++) {
            String str = strArr[i6];
            String i7 = aVar.i(str);
            if (!TextUtils.isEmpty(i7)) {
                aVar2.v0(str, i7);
            }
        }
        aVar2.v0(ProtectedSandApp.s("彊\u0001"), String.valueOf(i4));
        aVar2.v0(ProtectedSandApp.s("彋\u0001"), String.valueOf(i5));
        aVar2.v0(ProtectedSandApp.s("彌\u0001"), ProtectedSandApp.s("彍\u0001"));
        aVar2.q0();
    }

    private static boolean handles(int i4) {
        return (i4 & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i4 == MOTOROLA_TIFF_MAGIC_NUMBER || i4 == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i4) {
        boolean z4 = bArr != null && i4 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z4) {
            int i5 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i5 >= bArr2.length) {
                    break;
                }
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            }
        }
        return z4;
    }

    private int moveToExifSegmentAndGetLength() throws IOException {
        String s4;
        long j4;
        do {
            short uInt8 = this.reader.getUInt8();
            s4 = ProtectedSandApp.s("弱\u0001");
            if (uInt8 != 255) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            short uInt82 = this.reader.getUInt8();
            if (uInt82 == SEGMENT_SOS) {
                return -1;
            }
            if (uInt82 == MARKER_EOI) {
                Log.isLoggable(s4, 3);
                return -1;
            }
            int uInt16 = this.reader.getUInt16() - 2;
            if (uInt82 == EXIF_SEGMENT_TYPE) {
                return uInt16;
            }
            j4 = uInt16;
        } while (this.reader.skip(j4) == j4);
        Log.isLoggable(s4, 3);
        return -1;
    }

    private int parseExifSegment(byte[] bArr, int i4) throws IOException {
        int read = this.reader.read(bArr, i4);
        String s4 = ProtectedSandApp.s("弱\u0001");
        if (read != i4) {
            Log.isLoggable(s4, 3);
            return -1;
        }
        if (hasJpegExifPreamble(bArr, i4)) {
            return parseExifSegment(new RandomAccessReader(bArr, i4));
        }
        Log.isLoggable(s4, 3);
        return -1;
    }

    public int getOrientation() throws IOException {
        boolean handles = handles(this.reader.getUInt16());
        String s4 = ProtectedSandApp.s("弱\u0001");
        if (!handles) {
            Log.isLoggable(s4, 3);
            return -1;
        }
        int moveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength();
        if (moveToExifSegmentAndGetLength != -1) {
            return parseExifSegment(new byte[moveToExifSegmentAndGetLength], moveToExifSegmentAndGetLength);
        }
        Log.isLoggable(s4, 3);
        return -1;
    }

    public static void copyExif(Context context, int i4, int i5, Uri uri, String str) {
        if (context == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new a(inputStream, 0), new a(str), i4, i5);
                } catch (IOException e4) {
                    e4.getMessage();
                    if (inputStream == null) {
                        return;
                    } else {
                        inputStream.close();
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.getMessage();
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e6.getMessage();
        }
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16 = randomAccessReader.getInt16(6);
        String s4 = ProtectedSandApp.s("弱\u0001");
        if (int16 == MOTOROLA_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (int16 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            Log.isLoggable(s4, 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int162 = randomAccessReader.getInt16(int32);
        for (int i4 = 0; i4 < int162; i4++) {
            int calcTagOffset = calcTagOffset(int32, i4);
            if (randomAccessReader.getInt16(calcTagOffset) == ORIENTATION_TAG_TYPE) {
                short int163 = randomAccessReader.getInt16(calcTagOffset + 2);
                if (int163 >= 1 && int163 <= 12) {
                    int int322 = randomAccessReader.getInt32(calcTagOffset + 4);
                    if (int322 < 0) {
                        Log.isLoggable(s4, 3);
                    } else {
                        Log.isLoggable(s4, 3);
                        int i5 = int322 + BYTES_PER_FORMAT[int163];
                        if (i5 > 4) {
                            Log.isLoggable(s4, 3);
                        } else {
                            int i6 = calcTagOffset + 8;
                            if (i6 >= 0 && i6 <= randomAccessReader.length()) {
                                if (i5 >= 0 && i5 + i6 <= randomAccessReader.length()) {
                                    return randomAccessReader.getInt16(i6);
                                }
                                Log.isLoggable(s4, 3);
                            } else {
                                Log.isLoggable(s4, 3);
                            }
                        }
                    }
                } else {
                    Log.isLoggable(s4, 3);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x003b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @androidx.annotation.x0(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyExif(android.content.Context r3, int r4, int r5, android.net.Uri r6, android.net.Uri r7) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 0
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.io.InputStream r6 = r1.openInputStream(r6)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            androidx.exifinterface.media.a r1 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            r2 = 0
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            java.lang.String r2 = "弳\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            android.os.ParcelFileDescriptor r0 = r3.openFileDescriptor(r7, r2)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            androidx.exifinterface.media.a r3 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            java.io.FileDescriptor r7 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            copyExifAttributes(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            if (r6 == 0) goto L36
            r6.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r3 = move-exception
            r3.getMessage()
        L36:
            r0.close()     // Catch: java.io.IOException -> L3a
            goto L5e
        L3a:
            r3 = move-exception
            r3.getMessage()
            goto L5e
        L3f:
            r3 = move-exception
            r4 = r0
            r0 = r6
            goto L60
        L43:
            r3 = move-exception
            r4 = r0
            r0 = r6
            goto L4c
        L47:
            r3 = move-exception
            r4 = r0
            goto L60
        L4a:
            r3 = move-exception
            r4 = r0
        L4c:
            r3.getMessage()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r3 = move-exception
            r3.getMessage()
        L59:
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.io.IOException -> L3a
        L5e:
            return
        L5f:
            r3 = move-exception
        L60:
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r5 = move-exception
            r5.getMessage()
        L6a:
            if (r4 == 0) goto L74
            r4.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r4 = move-exception
            r4.getMessage()
        L74:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.ImageHeaderParser.copyExif(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    @x0(21)
    public static void copyExif(Context context, a aVar, int i4, int i5, Uri uri) {
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, ProtectedSandApp.s("弳\u0001"));
                    copyExifAttributes(aVar, new a(parcelFileDescriptor.getFileDescriptor()), i4, i5);
                    parcelFileDescriptor.close();
                } catch (IOException e4) {
                    e4.getMessage();
                    if (parcelFileDescriptor == null) {
                    } else {
                        parcelFileDescriptor.close();
                    }
                }
            } catch (Throwable th) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e5) {
                        e5.getMessage();
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e6.getMessage();
        }
    }
}
