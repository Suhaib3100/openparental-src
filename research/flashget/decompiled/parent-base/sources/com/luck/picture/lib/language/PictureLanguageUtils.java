package com.luck.picture.lib.language;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.utils.SpUtils;
import java.util.Locale;

/* loaded from: classes6.dex */
public class PictureLanguageUtils {
    private static final String KEY_LOCALE = ProtectedSandApp.s("ᙩ\u0001");
    private static final String VALUE_FOLLOW_SYSTEM = ProtectedSandApp.s("ᙪ\u0001");

    private PictureLanguageUtils() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᙨ\u0001"));
    }

    private static void applyLanguage(@o0 Context context, @o0 Locale locale) {
        applyLanguage(context, locale, false);
    }

    private static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public static void setAppLanguage(Context context, int i4, int i5) {
        if (i4 >= 0) {
            applyLanguage(context, LocaleTransform.getLanguage(i4));
        } else if (i5 >= 0) {
            applyLanguage(context, LocaleTransform.getLanguage(i5));
        } else {
            setDefaultLanguage(context);
        }
    }

    private static void setDefaultLanguage(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(Locale.getDefault());
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    private static void updateLanguage(@o0 Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (equals(locale2.getLanguage(), locale.getLanguage()) && equals(locale2.getCountry(), locale.getCountry())) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    private static void applyLanguage(@o0 Context context, @o0 Locale locale, boolean z4) {
        String s4 = ProtectedSandApp.s("ᙩ\u0001");
        if (z4) {
            SpUtils.putString(context, s4, ProtectedSandApp.s("ᙪ\u0001"));
        } else {
            SpUtils.putString(context, s4, locale.getLanguage() + ProtectedSandApp.s("ᙫ\u0001") + locale.getCountry());
        }
        updateLanguage(context, locale);
    }
}
