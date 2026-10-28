package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.support.v4.media.d;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import dalvik.annotation.optimization.FastNative;
import fg.e;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final Set<Long> checkedHandleSet;
    private static MMKVHandler gCallbackHandler;
    private static MMKVContentChangeNotification gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final MMKVLogLevel[] index2LogLevel;
    private static boolean isProcessModeCheckerEnabled;
    private static final EnumMap<MMKVLogLevel, Integer> logLevel2Index;
    private static final HashMap<String, Parcelable.Creator<?>> mCreators;
    private static final EnumMap<MMKVRecoverStrategic, Integer> recoverIndex;
    private static String rootDir;
    private final long nativeHandle;

    /* renamed from: com.tencent.mmkv.MMKV$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            $SwitchMap$com$tencent$mmkv$MMKVLogLevel = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface LibLoader {
        void loadLibrary(String libName);
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>((Class<MMKVRecoverStrategic>) MMKVRecoverStrategic.class);
        recoverIndex = enumMap;
        enumMap.put((EnumMap<MMKVRecoverStrategic, Integer>) MMKVRecoverStrategic.OnErrorDiscard, (MMKVRecoverStrategic) 0);
        enumMap.put((EnumMap<MMKVRecoverStrategic, Integer>) MMKVRecoverStrategic.OnErrorRecover, (MMKVRecoverStrategic) 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>((Class<MMKVLogLevel>) MMKVLogLevel.class);
        logLevel2Index = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel, (MMKVLogLevel) 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel2, (MMKVLogLevel) 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel3, (MMKVLogLevel) 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel4, (MMKVLogLevel) 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel5, (MMKVLogLevel) 4);
        index2LogLevel = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        checkedHandleSet = new HashSet();
        rootDir = null;
        isProcessModeCheckerEnabled = true;
        mCreators = new HashMap<>();
        gWantLogReDirecting = false;
    }

    private MMKV(long handle) {
        this.nativeHandle = handle;
    }

    private native long actualSize(long handle);

    private native String[] allKeys(long handle, boolean filterExpire);

    @o0
    public static MMKV backedUpMMKVWithID(String mmapID, int mode, @q0 String cryptKey, String rootPath) throws RuntimeException {
        if (rootDir == null) {
            throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
        }
        int i4 = mode | 16;
        return checkProcessMode(getMMKVWithID(mmapID, i4, cryptKey, rootPath, 0L), mmapID, i4);
    }

    public static native long backupAllToDirectory(String dstDir);

    public static native boolean backupOneToDirectory(String mmapID, String dstDir, @q0 String rootPath);

    @e("_, _, _ -> new")
    @o0
    private static MMKV checkProcessMode(long handle, String mmapID, int mode) throws RuntimeException {
        String str;
        String s4 = ProtectedSandApp.s("塿\u0001");
        String s5 = ProtectedSandApp.s("墀\u0001");
        if (handle == 0) {
            throw new RuntimeException(d.a(ProtectedSandApp.s("墄\u0001"), mmapID, ProtectedSandApp.s("墅\u0001")));
        }
        if (!isProcessModeCheckerEnabled) {
            return new MMKV(handle);
        }
        Set<Long> set = checkedHandleSet;
        synchronized (set) {
            try {
                if (!set.contains(Long.valueOf(handle))) {
                    if (!checkProcessMode(handle)) {
                        if (mode == 1) {
                            str = s5 + mmapID + ProtectedSandApp.s("墁\u0001");
                        } else {
                            str = (s4 + mmapID + ProtectedSandApp.s("墂\u0001")) + ProtectedSandApp.s("境\u0001");
                        }
                        throw new IllegalArgumentException(str);
                    }
                    set.add(Long.valueOf(handle));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(handle);
    }

    private static native boolean checkProcessMode(long handle);

    private native boolean containsKey(long handle, String key);

    private native long count(long handle, boolean filterExpire);

    private static native long createNB(int size);

    @q0
    public static NativeBuffer createNativeBuffer(int size) {
        long createNB = createNB(size);
        if (createNB <= 0) {
            return null;
        }
        return new NativeBuffer(createNB, size);
    }

    private native boolean decodeBool(long handle, String key, boolean defaultValue);

    @q0
    private native byte[] decodeBytes(long handle, String key);

    private native double decodeDouble(long handle, String key, double defaultValue);

    private native float decodeFloat(long handle, String key, float defaultValue);

    private native int decodeInt(long handle, String key, int defaultValue);

    private native long decodeLong(long handle, String key, long defaultValue);

    @q0
    private native String decodeString(long handle, String key, @q0 String defaultValue);

    @q0
    private native String[] decodeStringSet(long handle, String key);

    @o0
    public static MMKV defaultMMKV() throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(1, null), ProtectedSandApp.s("墆\u0001"), 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    private static native void destroyNB(long pointer, int size);

    public static void destroyNativeBuffer(@o0 NativeBuffer buffer) {
        destroyNB(buffer.pointer, buffer.size);
    }

    public static void disableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = false;
        }
    }

    private static String doInitialize(String rootDir2, String cacheDir, LibLoader loader, MMKVLogLevel logLevel, boolean wantLogReDirecting) {
        String s4 = ProtectedSandApp.s("墇\u0001");
        if (loader != null) {
            loader.loadLibrary(s4);
        } else {
            System.loadLibrary(s4);
        }
        jniInitialize(rootDir2, cacheDir, logLevel2Int(logLevel), wantLogReDirecting);
        rootDir = rootDir2;
        return rootDir2;
    }

    public static void enableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = true;
        }
    }

    private native boolean encodeBool(long handle, String key, boolean value);

    private native boolean encodeBool_2(long handle, String key, boolean value, int expireDurationInSecond);

    private native boolean encodeBytes(long handle, String key, @q0 byte[] value);

    private native boolean encodeBytes_2(long handle, String key, @q0 byte[] value, int expireDurationInSecond);

    private native boolean encodeDouble(long handle, String key, double value);

    private native boolean encodeDouble_2(long handle, String key, double value, int expireDurationInSecond);

    private native boolean encodeFloat(long handle, String key, float value);

    private native boolean encodeFloat_2(long handle, String key, float value, int expireDurationInSecond);

    private native boolean encodeInt(long handle, String key, int value);

    private native boolean encodeInt_2(long handle, String key, int value, int expireDurationInSecond);

    private native boolean encodeLong(long handle, String key, long value);

    private native boolean encodeLong_2(long handle, String key, long value, int expireDurationInSecond);

    private native boolean encodeSet(long handle, String key, @q0 String[] value);

    private native boolean encodeSet_2(long handle, String key, @q0 String[] value, int expireDurationInSecond);

    private native boolean encodeString(long handle, String key, @q0 String value);

    private native boolean encodeString_2(long handle, String key, @q0 String value, int expireDurationInSecond);

    private static native long getDefaultMMKV(int mode, @q0 String cryptKey);

    private static native long getMMKVWithAshmemFD(String mmapID, int fd2, int metaFD, @q0 String cryptKey);

    private static native long getMMKVWithID(String mmapID, int mode, @q0 String cryptKey, @q0 String rootPath, long expectedCapacity);

    private static native long getMMKVWithIDAndSize(String mmapID, int size, int mode, @q0 String cryptKey);

    private byte[] getParcelableByte(@o0 Parcelable value) {
        Parcel obtain = Parcel.obtain();
        value.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static String getRootDir() {
        return rootDir;
    }

    public static String initialize(@o0 Context context) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + ProtectedSandApp.s("墈\u0001"), null, MMKVLogLevel.LevelInfo, null);
    }

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static boolean isFileValid(String mmapID) {
        return isFileValid(mmapID, null);
    }

    public static native boolean isFileValid(String mmapID, @q0 String rootPath);

    private static native void jniInitialize(String rootDir2, String cacheDir, int level, boolean wantLogReDirecting);

    @e(pure = true)
    private static int logLevel2Int(@o0 MMKVLogLevel level) {
        int i4 = AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[level.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        int i5 = 2;
        if (i4 != 2) {
            i5 = 3;
            if (i4 != 3) {
                i5 = 4;
                if (i4 != 4) {
                    return 1;
                }
            }
        }
        return i5;
    }

    private static void mmkvLogImp(int level, String file, int line, String function, String message) {
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler == null || !gWantLogReDirecting) {
            int i4 = AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[index2LogLevel[level].ordinal()];
        } else {
            mMKVHandler.mmkvLog(index2LogLevel[level], file, line, function, message);
        }
    }

    @e("_, _, _, _ -> new")
    @o0
    public static MMKV mmkvWithAshmemFD(String mmapID, int fd2, int metaFD, String cryptKey) throws RuntimeException {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(mmapID, fd2, metaFD, cryptKey);
        if (mMKVWithAshmemFD != 0) {
            return new MMKV(mMKVWithAshmemFD);
        }
        throw new RuntimeException(d.a(ProtectedSandApp.s("墊\u0001"), mmapID, ProtectedSandApp.s("墅\u0001")));
    }

    @o0
    public static MMKV mmkvWithAshmemID(Context context, String mmapID, int size, int mode, @q0 String cryptKey) throws RuntimeException {
        MMKV mmkv;
        if (rootDir == null) {
            throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
        }
        String processNameByPID = MMKVContentProvider.getProcessNameByPID(context, Process.myPid());
        if (processNameByPID == null || processNameByPID.length() == 0) {
            MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelError;
            String s4 = ProtectedSandApp.s("墘\u0001");
            simpleLog(mMKVLogLevel, s4);
            throw new IllegalStateException(s4);
        }
        if (processNameByPID.contains(ProtectedSandApp.s("墋\u0001"))) {
            Uri contentUri = MMKVContentProvider.contentUri(context);
            if (contentUri == null) {
                MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelError;
                String s5 = ProtectedSandApp.s("墔\u0001");
                simpleLog(mMKVLogLevel2, s5);
                throw new IllegalStateException(s5);
            }
            MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelInfo;
            simpleLog(mMKVLogLevel3, ProtectedSandApp.s("墌\u0001") + contentUri);
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("墍\u0001"), size);
            bundle.putInt(ProtectedSandApp.s("墎\u0001"), mode);
            if (cryptKey != null) {
                bundle.putString(ProtectedSandApp.s("墏\u0001"), cryptKey);
            }
            Bundle call = context.getContentResolver().call(contentUri, ProtectedSandApp.s("墐\u0001"), mmapID, bundle);
            if (call != null) {
                call.setClassLoader(ParcelableMMKV.class.getClassLoader());
                ParcelableMMKV parcelableMMKV = (ParcelableMMKV) call.getParcelable(ProtectedSandApp.s("墑\u0001"));
                if (parcelableMMKV != null && (mmkv = parcelableMMKV.toMMKV()) != null) {
                    simpleLog(mMKVLogLevel3, mmkv.mmapID() + ProtectedSandApp.s("墒\u0001") + mmkv.ashmemFD() + ProtectedSandApp.s("墓\u0001") + mmkv.ashmemMetaFD());
                    return mmkv;
                }
            }
        }
        simpleLog(MMKVLogLevel.LevelInfo, ProtectedSandApp.s("墕\u0001"));
        long mMKVWithIDAndSize = getMMKVWithIDAndSize(mmapID, size, mode | 8, cryptKey);
        if (mMKVWithIDAndSize != 0) {
            return new MMKV(mMKVWithIDAndSize);
        }
        throw new IllegalStateException(d.a(ProtectedSandApp.s("墖\u0001"), mmapID, ProtectedSandApp.s("増\u0001")));
    }

    @o0
    public static MMKV mmkvWithID(String mmapID) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, 1, null, null, 0L), mmapID, 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String mmapID) {
        MMKVContentChangeNotification mMKVContentChangeNotification = gContentChangeNotify;
        if (mMKVContentChangeNotification != null) {
            mMKVContentChangeNotification.onContentChangedByOuterProcess(mmapID);
        }
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String mmapID) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVCRCCheckFail(mmapID);
        }
        simpleLog(MMKVLogLevel.LevelInfo, ProtectedSandApp.s("墙\u0001") + mmapID + ProtectedSandApp.s("墚\u0001") + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String mmapID) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVFileLengthError(mmapID);
        }
        simpleLog(MMKVLogLevel.LevelInfo, ProtectedSandApp.s("墙\u0001") + mmapID + ProtectedSandApp.s("墚\u0001") + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static void registerContentChangeNotify(MMKVContentChangeNotification notify) {
        gContentChangeNotify = notify;
        setWantsContentChangeNotify(notify != null);
    }

    public static void registerHandler(MMKVHandler handler) {
        gCallbackHandler = handler;
        boolean wantLogRedirecting = handler.wantLogRedirecting();
        gWantLogReDirecting = wantLogRedirecting;
        setCallbackHandler(wantLogRedirecting, true);
    }

    public static boolean removeStorage(String mmapID) {
        return removeStorage(mmapID, null);
    }

    public static native boolean removeStorage(String mmapID, @q0 String rootPath);

    private native void removeValueForKey(long handle, String key);

    public static native long restoreAllFromDirectory(String srcDir);

    public static native boolean restoreOneMMKVFromDirectory(String mmapID, String srcDir, @q0 String rootPath);

    private static native void setCallbackHandler(boolean logReDirecting, boolean hasCallback);

    private static native void setLogLevel(int level);

    public static void setLogLevel(MMKVLogLevel level) {
        setLogLevel(logLevel2Int(level));
    }

    private static native void setWantsContentChangeNotify(boolean needsNotify);

    private static void simpleLog(MMKVLogLevel level, String message) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = logLevel2Index.get(level);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), message);
    }

    private native void sync(boolean sync);

    private native long totalSize(long handle);

    public static void unregisterContentChangeNotify() {
        gContentChangeNotify = null;
        setWantsContentChangeNotify(false);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false);
        gWantLogReDirecting = false;
    }

    private native int valueSize(long handle, String key, boolean actualSize);

    public static native String version();

    private native int writeValueToNB(long handle, String key, long pointer, int size);

    public long actualSize() {
        return actualSize(this.nativeHandle);
    }

    @q0
    public String[] allKeys() {
        return allKeys(this.nativeHandle, false);
    }

    @q0
    public String[] allNonExpireKeys() {
        return allKeys(this.nativeHandle, true);
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
        sync(false);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@q0 String cryptKey);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        return containsKey(key);
    }

    public boolean containsKey(String key) {
        return containsKey(this.nativeHandle, key);
    }

    public long count() {
        return count(this.nativeHandle, false);
    }

    public long countNonExpiredKeys() {
        return count(this.nativeHandle, true);
    }

    @q0
    public native String cryptKey();

    public boolean decodeBool(String key) {
        return decodeBool(this.nativeHandle, key, false);
    }

    @q0
    public byte[] decodeBytes(String key) {
        return decodeBytes(key, (byte[]) null);
    }

    public double decodeDouble(String key) {
        return decodeDouble(this.nativeHandle, key, p.f60679p);
    }

    public float decodeFloat(String key) {
        return decodeFloat(this.nativeHandle, key, 0.0f);
    }

    public int decodeInt(String key) {
        return decodeInt(this.nativeHandle, key, 0);
    }

    public long decodeLong(String key) {
        return decodeLong(this.nativeHandle, key, 0L);
    }

    @q0
    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return (T) decodeParcelable(str, cls, null);
    }

    @q0
    public String decodeString(String key) {
        return decodeString(this.nativeHandle, key, null);
    }

    @q0
    public Set<String> decodeStringSet(String key) {
        return decodeStringSet(key, (Set<String>) null);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int expireDurationInSecond);

    public void enableCompareBeforeSet() {
        isExpirationEnabled();
        isEncryptionEnabled();
        nativeEnableCompareBeforeSet();
    }

    public boolean encode(String key, boolean value) {
        return encodeBool(this.nativeHandle, key, value);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("墝\u0001"));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String key, boolean defValue) {
        return decodeBool(this.nativeHandle, key, defValue);
    }

    public byte[] getBytes(String key, @q0 byte[] defValue) {
        return decodeBytes(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String key, float defValue) {
        return decodeFloat(this.nativeHandle, key, defValue);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String key, int defValue) {
        return decodeInt(this.nativeHandle, key, defValue);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String key, long defValue) {
        return decodeLong(this.nativeHandle, key, defValue);
    }

    @Override // android.content.SharedPreferences
    @q0
    public String getString(String key, @q0 String defValue) {
        return decodeString(this.nativeHandle, key, defValue);
    }

    @Override // android.content.SharedPreferences
    @q0
    public Set<String> getStringSet(String key, @q0 Set<String> defValues) {
        return decodeStringSet(key, defValues);
    }

    public int getValueActualSize(String key) {
        return valueSize(this.nativeHandle, key, true);
    }

    public int getValueSize(String key) {
        return valueSize(this.nativeHandle, key, false);
    }

    public int importFromSharedPreferences(@o0 SharedPreferences preferences) {
        Map<String, ?> all = preferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, key, (String) value);
                } else if (value instanceof Set) {
                    encode(key, (Set<String>) value);
                } else {
                    simpleLog(MMKVLogLevel.LevelError, ProtectedSandApp.s("增\u0001") + value.getClass());
                }
            }
        }
        return all.size();
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String key, boolean value) {
        encodeBool(this.nativeHandle, key, value);
        return this;
    }

    public SharedPreferences.Editor putBytes(String key, @q0 byte[] bytes) {
        encode(key, bytes);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String key, float value) {
        encodeFloat(this.nativeHandle, key, value);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String key, int value) {
        encodeInt(this.nativeHandle, key, value);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String key, long value) {
        encodeLong(this.nativeHandle, key, value);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String key, @q0 String value) {
        encodeString(this.nativeHandle, key, value);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String key, @q0 Set<String> values) {
        encode(key, values);
        return this;
    }

    public native boolean reKey(@q0 String cryptKey);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("墟\u0001"));
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String key) {
        removeValueForKey(key);
        return this;
    }

    public void removeValueForKey(String key) {
        removeValueForKey(this.nativeHandle, key);
    }

    public native void removeValuesForKeys(String[] arrKeys);

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("墟\u0001"));
    }

    public int writeValueToNativeBuffer(String key, @o0 NativeBuffer buffer) {
        return writeValueToNB(this.nativeHandle, key, buffer.pointer, buffer.size);
    }

    public boolean decodeBool(String key, boolean defaultValue) {
        return decodeBool(this.nativeHandle, key, defaultValue);
    }

    @q0
    public byte[] decodeBytes(String key, @q0 byte[] defaultValue) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, key);
        return decodeBytes != null ? decodeBytes : defaultValue;
    }

    public double decodeDouble(String key, double defaultValue) {
        return decodeDouble(this.nativeHandle, key, defaultValue);
    }

    public float decodeFloat(String key, float defaultValue) {
        return decodeFloat(this.nativeHandle, key, defaultValue);
    }

    public int decodeInt(String key, int defaultValue) {
        return decodeInt(this.nativeHandle, key, defaultValue);
    }

    public long decodeLong(String key, long defaultValue) {
        return decodeLong(this.nativeHandle, key, defaultValue);
    }

    @q0
    public <T extends Parcelable> T decodeParcelable(String key, Class<T> tClass, @q0 T defaultValue) {
        byte[] decodeBytes;
        Parcelable.Creator<?> creator;
        String s4 = ProtectedSandApp.s("墛\u0001");
        if (tClass == null || (decodeBytes = decodeBytes(this.nativeHandle, key)) == null) {
            return defaultValue;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decodeBytes, 0, decodeBytes.length);
        obtain.setDataPosition(0);
        try {
            String cls = tClass.toString();
            HashMap<String, Parcelable.Creator<?>> hashMap = mCreators;
            synchronized (hashMap) {
                try {
                    creator = hashMap.get(cls);
                    if (creator == null && (creator = (Parcelable.Creator) tClass.getField(ProtectedSandApp.s("墜\u0001")).get(null)) != null) {
                        hashMap.put(cls, creator);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(obtain);
            }
            throw new Exception(s4 + cls);
        } catch (Exception e4) {
            simpleLog(MMKVLogLevel.LevelError, e4.toString());
            return defaultValue;
        } finally {
            obtain.recycle();
        }
    }

    @q0
    public String decodeString(String key, @q0 String defaultValue) {
        return decodeString(this.nativeHandle, key, defaultValue);
    }

    @q0
    public Set<String> decodeStringSet(String key, @q0 Set<String> defaultValue) {
        return decodeStringSet(key, defaultValue, HashSet.class);
    }

    public boolean encode(String key, boolean value, int expireDurationInSecond) {
        return encodeBool_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public SharedPreferences.Editor putBoolean(String key, boolean value, int expireDurationInSecond) {
        encodeBool_2(this.nativeHandle, key, value, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putBytes(String key, @q0 byte[] bytes, int expireDurationInSecond) {
        encode(key, bytes, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putFloat(String key, float value, int expireDurationInSecond) {
        encodeFloat_2(this.nativeHandle, key, value, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putInt(String key, int value, int expireDurationInSecond) {
        encodeInt_2(this.nativeHandle, key, value, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putLong(String key, long value, int expireDurationInSecond) {
        encodeLong_2(this.nativeHandle, key, value, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putString(String key, @q0 String value, int expireDurationInSecond) {
        encodeString_2(this.nativeHandle, key, value, expireDurationInSecond);
        return this;
    }

    public SharedPreferences.Editor putStringSet(String key, @q0 Set<String> values, int expireDurationInSecond) {
        encode(key, values, expireDurationInSecond);
        return this;
    }

    @q0
    public Set<String> decodeStringSet(String key, @q0 Set<String> defaultValue, Class<? extends Set> cls) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, key);
        if (decodeStringSet == null) {
            return defaultValue;
        }
        try {
            Set<String> newInstance = cls.newInstance();
            newInstance.addAll(Arrays.asList(decodeStringSet));
            return newInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return defaultValue;
        }
    }

    public boolean encode(String key, int value) {
        return encodeInt(this.nativeHandle, key, value);
    }

    public static String initialize(@o0 Context context, MMKVLogLevel logLevel) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + ProtectedSandApp.s("墈\u0001"), null, logLevel, null);
    }

    public boolean encode(String key, int value, int expireDurationInSecond) {
        return encodeInt_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    @o0
    public static MMKV defaultMMKV(int mode, @q0 String cryptKey) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(mode, cryptKey), ProtectedSandApp.s("墆\u0001"), mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, int mode) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, mode, null, null, 0L), mmapID, mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    public boolean encode(String key, long value) {
        return encodeLong(this.nativeHandle, key, value);
    }

    public static String initialize(@o0 Context context, LibLoader loader) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + ProtectedSandApp.s("墈\u0001"), loader, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String key, long value, int expireDurationInSecond) {
        return encodeLong_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public boolean encode(String key, float value) {
        return encodeFloat(this.nativeHandle, key, value);
    }

    public boolean encode(String key, float value, int expireDurationInSecond) {
        return encodeFloat_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public static String initialize(@o0 Context context, LibLoader loader, MMKVLogLevel logLevel) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + ProtectedSandApp.s("墈\u0001"), loader, logLevel, null);
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, int mode, long expectedCapacity) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, mode, null, null, expectedCapacity), mmapID, mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    public boolean encode(String key, double value) {
        return encodeDouble(this.nativeHandle, key, value);
    }

    public boolean encode(String key, double value, int expireDurationInSecond) {
        return encodeDouble_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public static String initialize(Context context, String rootDir2) {
        return initialize(context, rootDir2, null, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String key, @q0 String value) {
        return encodeString(this.nativeHandle, key, value);
    }

    public boolean encode(String key, @q0 String value, int expireDurationInSecond) {
        return encodeString_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public static String initialize(Context context, String rootDir2, MMKVLogLevel logLevel) {
        return initialize(context, rootDir2, null, logLevel, null);
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, int mode, @q0 String cryptKey) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, mode, cryptKey, null, 0L), mmapID, mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    public boolean encode(String key, @q0 Set<String> value) {
        return encodeSet(this.nativeHandle, key, value == null ? null : (String[]) value.toArray(new String[0]));
    }

    public static String initialize(Context context, String rootDir2, LibLoader loader) {
        return initialize(context, rootDir2, loader, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String key, @q0 Set<String> value, int expireDurationInSecond) {
        return encodeSet_2(this.nativeHandle, key, value == null ? null : (String[]) value.toArray(new String[0]), expireDurationInSecond);
    }

    public boolean encode(String key, @q0 byte[] value) {
        return encodeBytes(this.nativeHandle, key, value);
    }

    public static String initialize(Context context, String rootDir2, LibLoader loader, MMKVLogLevel logLevel) {
        return initialize(context, rootDir2, loader, logLevel, null);
    }

    public boolean encode(String key, @q0 byte[] value, int expireDurationInSecond) {
        return encodeBytes_2(this.nativeHandle, key, value, expireDurationInSecond);
    }

    public static String initialize(@o0 Context context, String rootDir2, LibLoader loader, MMKVLogLevel logLevel, MMKVHandler handler) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            disableProcessModeChecker();
        } else {
            enableProcessModeChecker();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        gCallbackHandler = handler;
        if (handler != null && handler.wantLogRedirecting()) {
            gWantLogReDirecting = true;
        }
        String doInitialize = doInitialize(rootDir2, absolutePath, loader, logLevel, gWantLogReDirecting);
        if (gCallbackHandler != null) {
            setCallbackHandler(gWantLogReDirecting, true);
        }
        return doInitialize;
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, String rootPath) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, 1, null, rootPath, 0L), mmapID, 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    public boolean encode(String key, @q0 Parcelable value) {
        if (value == null) {
            return encodeBytes(this.nativeHandle, key, null);
        }
        return encodeBytes(this.nativeHandle, key, getParcelableByte(value));
    }

    public boolean encode(String key, @q0 Parcelable value, int expireDurationInSecond) {
        if (value == null) {
            return encodeBytes_2(this.nativeHandle, key, null, expireDurationInSecond);
        }
        return encodeBytes_2(this.nativeHandle, key, getParcelableByte(value), expireDurationInSecond);
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, String rootPath, long expectedCapacity) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, 1, null, rootPath, expectedCapacity), mmapID, 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, int mode, @q0 String cryptKey, String rootPath, long expectedCapacity) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, mode, cryptKey, rootPath, expectedCapacity), mmapID, mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    @Deprecated
    public static String initialize(String rootDir2) {
        return doInitialize(rootDir2, j.a(rootDir2, ProtectedSandApp.s("墉\u0001")), null, MMKVLogLevel.LevelInfo, false);
    }

    @o0
    public static MMKV mmkvWithID(String mmapID, int mode, @q0 String cryptKey, String rootPath) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(mmapID, mode, cryptKey, rootPath, 0L), mmapID, mode);
        }
        throw new IllegalStateException(ProtectedSandApp.s("塾\u0001"));
    }

    @Deprecated
    public static String initialize(String rootDir2, MMKVLogLevel logLevel) {
        return doInitialize(rootDir2, j.a(rootDir2, ProtectedSandApp.s("墉\u0001")), null, logLevel, false);
    }

    @Deprecated
    public static String initialize(String rootDir2, LibLoader loader) {
        return doInitialize(rootDir2, j.a(rootDir2, ProtectedSandApp.s("墉\u0001")), loader, MMKVLogLevel.LevelInfo, false);
    }

    @Deprecated
    public static String initialize(String rootDir2, LibLoader loader, MMKVLogLevel logLevel) {
        return doInitialize(rootDir2, j.a(rootDir2, ProtectedSandApp.s("墉\u0001")), loader, logLevel, false);
    }
}
