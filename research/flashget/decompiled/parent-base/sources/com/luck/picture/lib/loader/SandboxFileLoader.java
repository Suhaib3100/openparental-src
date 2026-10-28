package com.luck.picture.lib.loader;

import android.content.Context;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.utils.SortUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class SandboxFileLoader {
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
    
        if (r2 < r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
    
        if (r2 > r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
    
        if (r2 != 0) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> loadInAppSandboxFile(android.content.Context r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.SandboxFileLoader.loadInAppSandboxFile(android.content.Context, java.lang.String):java.util.ArrayList");
    }

    public static LocalMediaFolder loadInAppSandboxFolderFile(Context context, String str) {
        ArrayList<LocalMedia> loadInAppSandboxFile = loadInAppSandboxFile(context, str);
        if (loadInAppSandboxFile == null || loadInAppSandboxFile.size() <= 0) {
            return null;
        }
        SortUtils.sortLocalMediaAddedTime(loadInAppSandboxFile);
        LocalMedia localMedia = loadInAppSandboxFile.get(0);
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.setFolderName(localMedia.getParentFolderName());
        localMediaFolder.setFirstImagePath(localMedia.getPath());
        localMediaFolder.setFirstMimeType(localMedia.getMimeType());
        localMediaFolder.setBucketId(localMedia.getBucketId());
        localMediaFolder.setFolderTotalNum(loadInAppSandboxFile.size());
        localMediaFolder.setData(loadInAppSandboxFile);
        return localMediaFolder;
    }
}
