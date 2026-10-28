package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("ౝ"));
    private static final Pattern zzb = Pattern.compile(ProtectedSandApp.s("\u0c5e"));

    private JsonUtils() {
    }

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(@q0 Object obj, @q0 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Preconditions.checkNotNull(next);
                } catch (JSONException unused) {
                }
                if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            if (!areJsonValuesEquivalent(jSONArray.get(i5), jSONArray2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    @q0
    @KeepForSdk
    public static String escapeString(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zzb.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౦"));
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("\u0c65"));
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("\u0c64"));
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("ౣ"));
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("ౡ"));
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("ౠ"));
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("\u0c5f"));
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("ౢ"));
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @o0
    @KeepForSdk
    public static String unescapeString(@o0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String zza2 = zzc.zza(str);
        Matcher matcher = zza.matcher(zza2);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(1);
            if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౯"));
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౮"));
            } else if (charAt == '\\') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౭"));
            } else if (charAt == 'b') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౬"));
            } else if (charAt == 'f') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౫"));
            } else if (charAt == 'n') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౪"));
            } else if (charAt == 'r') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౩"));
            } else {
                if (charAt != 't') {
                    throw new IllegalStateException(ProtectedSandApp.s("౨"));
                }
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("౧"));
            }
        }
        if (stringBuffer == null) {
            return zza2;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
