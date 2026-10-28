package com.nostra13.universalimageloader.utils;

import java.io.File;

/* compiled from: DiskCacheUtils.java */
/* loaded from: classes6.dex */
public final class a {
    private a() {
    }

    public static File a(String str, nb.a aVar) {
        File file = aVar.get(str);
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean b(String str, nb.a aVar) {
        File file = aVar.get(str);
        return file != null && file.exists() && file.delete();
    }
}
