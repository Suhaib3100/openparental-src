package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10, int i11) {
        nativeABGRToI420(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, i10, i11);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10, int i11, int i12, int i13, int i14) {
        int i15 = (i10 + 1) / 2;
        int i16 = i11 * i10;
        int i17 = i11 * i12;
        int i18 = (i13 * i15) + i17;
        int i19 = (i13 * i14) + i17;
        int i20 = ((i15 - 1) * i13) + i19 + ((i7 + 1) / 2);
        if (byteBuffer4.capacity() < i20) {
            StringBuilder a5 = androidx.collection.s.a("Expected destination buffer capacity to be at least ", i20, " was ");
            a5.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(a5.toString());
        }
        byteBuffer4.limit(i16);
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.limit(i18);
        byteBuffer4.position(i17);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.limit(i20);
        byteBuffer4.position(i19);
        I420Copy(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, slice, i11, slice2, i13, byteBuffer4.slice(), i13, i7, i10);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10, int i11) {
        int i12 = i11 % 180;
        int i13 = i12 == 0 ? i7 : i10;
        int i14 = i12 == 0 ? i10 : i7;
        int i15 = (i14 + 1) / 2;
        int i16 = (i13 + 1) / 2;
        int i17 = i14 * i13;
        int i18 = i15 * i16;
        int i19 = (i18 * 2) + i17;
        if (byteBuffer4.capacity() < i19) {
            StringBuilder a5 = androidx.collection.s.a("Expected destination buffer capacity to be at least ", i19, " was ");
            a5.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(a5.toString());
        }
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.position(i17);
        ByteBuffer slice2 = byteBuffer4.slice();
        byteBuffer4.position(i18 + i17);
        nativeI420Rotate(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, slice, i13, slice2, i16, byteBuffer4.slice(), i16, i7, i10, i11);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10, int i11, int i12) {
        int i13 = (i7 + 1) / 2;
        int i14 = i11 * i10;
        int i15 = i11 * i12;
        int i16 = (((i10 + 1) / 2) * i13 * 2) + i15;
        if (byteBuffer4.capacity() < i16) {
            StringBuilder a5 = androidx.collection.s.a("Expected destination buffer capacity to be at least ", i16, " was ");
            a5.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(a5.toString());
        }
        byteBuffer4.limit(i14);
        byteBuffer4.position(0);
        ByteBuffer slice = byteBuffer4.slice();
        byteBuffer4.limit(i16);
        byteBuffer4.position(i15);
        I420ToNV12(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, slice, i11, byteBuffer4.slice(), i13 * 2, i7, i10);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7) {
        nativeCopyPlane(byteBuffer, i4, byteBuffer2, i5, i6, i7);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10, int i11);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13, int i14);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, int i11, int i12);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10) {
        I420ToNV12(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, i10, i7, i10);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13, int i14) {
        nativeI420Rotate(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, byteBuffer5, i10, byteBuffer6, i11, i12, i13, i14);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, int i11, int i12) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && i11 > 0 && i12 > 0) {
            nativeI420ToNV12(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, byteBuffer5, i10, i11, i12);
            return;
        }
        throw new IllegalArgumentException("Invalid I420ToNV12 input arguments");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, int i10) {
        I420Copy(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, i10, i7, i10, (i7 + 1) / 2, (i10 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null && i12 > 0 && i13 > 0) {
            nativeI420Copy(byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, byteBuffer5, i10, byteBuffer6, i11, i12, i13);
            return;
        }
        throw new IllegalArgumentException("Invalid I420Copy input arguments");
    }
}
