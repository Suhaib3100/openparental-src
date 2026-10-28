package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @q0
    @KeepForSdk
    public static String getXmlAttributeString(@o0 String str, @o0 String str2, @o0 Context context, @o0 AttributeSet attributeSet, boolean z4, boolean z5, @o0 String str3) {
        String s4 = ProtectedSandApp.s("쬊");
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith(ProtectedSandApp.s("쬋")) && z4) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
                sb.append(packageName);
                sb.append(s4);
                sb.append(substring);
                resources.getValue(sb.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                new StringBuilder(b.a(str2, 30) + attributeValue.length());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                new StringBuilder(b.a(str2, 28) + typedValue.toString().length());
            }
        }
        if (z5 && attributeValue == null) {
            new StringBuilder(String.valueOf(str2).length() + 33);
        }
        return attributeValue;
    }
}
