package com.tencent.liteav.extensions;

import android.content.res.AssetManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class AssetsUtils {
    public static boolean copyAssetFile(String str, String str2) {
        AssetManager applicationAssets = ContextUtils.getApplicationAssets();
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            byte[] bArr = new byte[1024];
            InputStream open = applicationAssets.open(str);
            File file2 = new File(str2 + File.separator + str + ProtectedSandApp.s("収\u0001"));
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            open.close();
            fileOutputStream.close();
            if (file2.renameTo(new File(str2 + File.separator + str))) {
                return true;
            }
            file2.delete();
            return false;
        } catch (IOException e4) {
            LiteavLog.i(ProtectedSandApp.s("叐\u0001"), ProtectedSandApp.s("叏\u0001") + e4.getMessage());
            return false;
        }
    }

    public static boolean hasAssetFile(String str) {
        try {
            InputStream open = ContextUtils.getApplicationAssets().open(str);
            boolean z4 = open != null;
            open.close();
            return z4;
        } catch (IOException e4) {
            LiteavLog.i(ProtectedSandApp.s("叐\u0001"), ProtectedSandApp.s("发\u0001") + e4.getMessage());
            return false;
        }
    }
}
