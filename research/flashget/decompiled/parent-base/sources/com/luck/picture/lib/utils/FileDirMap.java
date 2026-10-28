package com.luck.picture.lib.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FileDirMap {
    private static final HashMap<Integer, String> dirMap = new HashMap<>();

    public static void clear() {
        dirMap.clear();
    }

    public static String getFileDirPath(Context context, int i4) {
        HashMap<Integer, String> hashMap = dirMap;
        String str = hashMap.get(Integer.valueOf(i4));
        if (str != null) {
            return str;
        }
        init(context);
        return hashMap.get(Integer.valueOf(i4));
    }

    public static void init(Context context) {
        if (ActivityCompatHelper.assertValidRequest(context)) {
            HashMap<Integer, String> hashMap = dirMap;
            if (hashMap.get(1) == null) {
                File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                hashMap.put(1, (externalFilesDir == null || !externalFilesDir.exists()) ? context.getCacheDir().getPath() : externalFilesDir.getPath());
            }
            if (hashMap.get(2) == null) {
                File externalFilesDir2 = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
                hashMap.put(2, (externalFilesDir2 == null || !externalFilesDir2.exists()) ? context.getCacheDir().getPath() : externalFilesDir2.getPath());
            }
            if (hashMap.get(3) == null) {
                File externalFilesDir3 = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
                hashMap.put(3, (externalFilesDir3 == null || !externalFilesDir3.exists()) ? context.getCacheDir().getPath() : externalFilesDir3.getPath());
            }
        }
    }
}
