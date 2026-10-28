package com.luck.picture.lib.basic;

import android.content.Context;
import android.content.ContextWrapper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.language.PictureLanguageUtils;

/* loaded from: classes6.dex */
public class PictureContextWrapper extends ContextWrapper {
    public PictureContextWrapper(Context context) {
        super(context);
    }

    public static ContextWrapper wrap(Context context, int i4, int i5) {
        if (i4 != -2) {
            PictureLanguageUtils.setAppLanguage(context, i4, i5);
        }
        return new PictureContextWrapper(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return ProtectedSandApp.s("ᗍ\u0001").equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
