package com.tencent.liteav.base.storage;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class PersistStorageMmkv {
    private long mNativePersistStorageMmkv;

    public PersistStorageMmkv(String str) {
        this.mNativePersistStorageMmkv = 0L;
        this.mNativePersistStorageMmkv = nativeCreatePersistStorageMmkv(str);
    }

    private static native void nativeClear(long j4, String str);

    private static native void nativeCommit(long j4);

    private static native long nativeCreatePersistStorageMmkv(String str);

    private static native void nativeDestroyPersistStorageMmkv(long j4);

    private static native String[] nativeGetAllKeys(long j4);

    private static native Integer nativeGetInt32(long j4, String str);

    private static native Long nativeGetLong(long j4, String str);

    private static native String nativeGetString(long j4, String str);

    private static native void nativePutInt32(long j4, String str, int i4);

    private static native void nativePutLong(long j4, String str, long j5);

    private static native void nativePutString(long j4, String str, String str2);

    public void clear(String str) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return;
        }
        try {
            nativeClear(j4, str);
        } catch (Throwable unused) {
        }
    }

    public void commit() {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return;
        }
        try {
            nativeCommit(j4);
        } catch (Throwable unused) {
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 != 0) {
            nativeDestroyPersistStorageMmkv(j4);
        }
    }

    public String[] getAllKeys() {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return new String[0];
        }
        try {
            String[] nativeGetAllKeys = nativeGetAllKeys(j4);
            return nativeGetAllKeys == null ? new String[0] : nativeGetAllKeys;
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    public Integer getInt(String str) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return null;
        }
        try {
            return nativeGetInt32(j4, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Long getLong(String str) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return null;
        }
        try {
            return nativeGetLong(j4, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getString(String str) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return null;
        }
        try {
            return nativeGetString(j4, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void put(String str, int i4) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return;
        }
        try {
            nativePutInt32(j4, str, i4);
        } catch (Throwable unused) {
        }
    }

    public void put(String str, long j4) {
        long j5 = this.mNativePersistStorageMmkv;
        if (j5 == 0) {
            return;
        }
        try {
            nativePutLong(j5, str, j4);
        } catch (Throwable unused) {
        }
    }

    public void put(String str, String str2) {
        long j4 = this.mNativePersistStorageMmkv;
        if (j4 == 0) {
            return;
        }
        try {
            nativePutString(j4, str, str2);
        } catch (Throwable unused) {
        }
    }
}
