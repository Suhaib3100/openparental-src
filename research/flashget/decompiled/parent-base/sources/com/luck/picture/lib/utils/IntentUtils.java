package com.luck.picture.lib.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;

/* loaded from: classes6.dex */
public class IntentUtils {
    public static void startSystemPlayerVideo(Context context, String str) {
        Uri parse;
        Intent intent = new Intent(ProtectedSandApp.s("ᛸ\u0001"));
        boolean z4 = PictureMimeType.isContent(str) || PictureMimeType.isHasHttp(str);
        if (SdkVersionUtils.isQ()) {
            parse = z4 ? Uri.parse(str) : Uri.fromFile(new File(str));
        } else if (!SdkVersionUtils.isMaxN()) {
            parse = z4 ? Uri.parse(str) : Uri.fromFile(new File(str));
        } else if (z4) {
            parse = Uri.parse(str);
        } else {
            parse = FileProvider.getUriForFile(context, context.getPackageName() + ProtectedSandApp.s("\u16f9\u0001"), new File(str));
        }
        intent.addFlags(268468224);
        intent.addFlags(1);
        intent.setDataAndType(parse, ProtectedSandApp.s("\u16fa\u0001"));
        context.startActivity(intent);
    }
}
