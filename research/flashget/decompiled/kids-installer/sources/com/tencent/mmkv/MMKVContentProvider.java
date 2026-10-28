package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public class MMKVContentProvider extends ContentProvider {
    private static Uri gUri;
    protected static final String FUNCTION_NAME = ProtectedSandApp.s("㚇");
    protected static final String KEY_CRYPT = ProtectedSandApp.s("㚈");
    protected static final String KEY_MODE = ProtectedSandApp.s("㚉");
    protected static final String KEY_SIZE = ProtectedSandApp.s("㚊");
    protected static final String KEY = ProtectedSandApp.s("㚋");

    @q0
    protected static Uri contentUri(Context context) {
        String queryAuthority;
        Uri uri = gUri;
        if (uri != null) {
            return uri;
        }
        if (context == null || (queryAuthority = queryAuthority(context)) == null) {
            return null;
        }
        Uri parse = Uri.parse(ProtectedSandApp.s("㙼").concat(queryAuthority));
        gUri = parse;
        return parse;
    }

    protected static String getProcessNameByPID(@o0 Context context, int pid) {
        if (pid == Process.myPid()) {
            return MMKVProcessUtil.getCurrentProcessName(context);
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("㙽"));
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == pid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    @o0
    private Bundle mmkvFromAshmemID(String ashmemID, int size, int mode, String cryptKey) throws RuntimeException {
        MMKV mmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), ashmemID, size, mode, cryptKey);
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvWithAshmemID);
        mmkvWithAshmemID.ashmemFD();
        mmkvWithAshmemID.ashmemMetaFD();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("㙾"), parcelableMMKV);
        return bundle;
    }

    @q0
    private static String queryAuthority(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @q0
    public Bundle call(@o0 String method, @q0 String mmapID, @q0 Bundle extras) {
        if (method.equals(ProtectedSandApp.s("㙿")) && extras != null) {
            try {
                return mmkvFromAshmemID(mmapID, extras.getInt(ProtectedSandApp.s("㚀")), extras.getInt(ProtectedSandApp.s("㚁")), extras.getString(ProtectedSandApp.s("㚂")));
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String selection, @q0 String[] selectionArgs) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚃"));
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @q0
    public Uri insert(@o0 Uri uri, @q0 ContentValues values) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚄"));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return getContext() != null;
    }

    @Override // android.content.ContentProvider
    @q0
    public Cursor query(@o0 Uri uri, @q0 String[] projection, @q0 String selection, @q0 String[] selectionArgs, @q0 String sortOrder) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚅"));
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @q0 ContentValues values, @q0 String selection, @q0 String[] selectionArgs) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚆"));
    }
}
