package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("쯷"));
    private static final Pattern zzb = Pattern.compile(ProtectedSandApp.s("쯸"));

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
                if (jSONObject2.has(next)) {
                    try {
                        Preconditions.checkNotNull(next);
                        if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                        }
                    } catch (JSONException unused) {
                    }
                }
                return false;
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
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            if (!areJsonValuesEquivalent(jSONArray.get(i4), jSONArray2.get(i4))) {
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
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찀"));
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯿"));
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯾"));
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯽"));
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯻"));
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯺"));
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯹"));
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("쯼"));
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
        String zza2 = zzf.zza(str);
        Matcher matcher = zza.matcher(zza2);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(1);
            if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찉"));
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찈"));
            } else if (charAt == '\\') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찇"));
            } else if (charAt == 'b') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찆"));
            } else if (charAt == 'f') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찅"));
            } else if (charAt == 'n') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찄"));
            } else if (charAt == 'r') {
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찃"));
            } else {
                if (charAt != 't') {
                    throw new IllegalStateException(ProtectedSandApp.s("찂"));
                }
                matcher.appendReplacement(stringBuffer, ProtectedSandApp.s("찁"));
            }
        }
        if (stringBuffer == null) {
            return zza2;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
