package com.luck.picture.lib.immersive;

import android.os.Build;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.utils.ValueOf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class RomUtils {
    private static Integer romType;
    private static final String UNKNOWN = ProtectedSandApp.s("ᙔ\u0001");
    private static final String[] ROM_SAMSUNG = {ProtectedSandApp.s("ᙕ\u0001")};

    public static class AvailableRomType {
        public static final int ANDROID_NATIVE = 3;
        public static final int FLYME = 2;
        public static final int MIUI = 1;
        public static final int NA = 4;
    }

    private static String getBrand() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("ᙔ\u0001");
    }

    public static int getFlymeVersion() {
        String str = Build.DISPLAY;
        if (!TextUtils.isEmpty(str)) {
            String s4 = ProtectedSandApp.s("ᙖ\u0001");
            if (str.contains(s4)) {
                return stringToInt(str.replaceAll(s4, "").replaceAll(ProtectedSandApp.s("ᙗ\u0001"), "").replaceAll(ProtectedSandApp.s("ᙘ\u0001"), "").substring(0, 1));
            }
        }
        return 0;
    }

    public static int getLightStatusBarAvailableRomType() {
        Integer num = romType;
        if (num != null) {
            return num.intValue();
        }
        if (isMIUIV6OrAbove()) {
            Integer num2 = 1;
            romType = num2;
            return num2.intValue();
        }
        if (isFlymeV4OrAbove()) {
            Integer num3 = 2;
            romType = num3;
            return num3.intValue();
        }
        if (isAndroid5OrAbove()) {
            Integer num4 = 3;
            romType = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        romType = num5;
        return num5.intValue();
    }

    public static int getMIUIVersionCode() {
        String systemProperty = getSystemProperty();
        if (TextUtils.isEmpty(systemProperty)) {
            return 0;
        }
        try {
            return ValueOf.toInt(systemProperty);
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    private static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("ᙔ\u0001");
    }

    private static String getSystemProperty() {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(ProtectedSandApp.s("ᙙ\u0001")).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return readLine;
        } catch (IOException unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static boolean isAndroid5OrAbove() {
        return true;
    }

    private static boolean isFlymeV4OrAbove() {
        return getFlymeVersion() >= 4;
    }

    private static boolean isMIUIV6OrAbove() {
        String systemProperty = getSystemProperty();
        if (TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        try {
            return ValueOf.toInt(systemProperty) >= 4;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static boolean isRightRom(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSamsung() {
        return isRightRom(getBrand(), getManufacturer(), ROM_SAMSUNG);
    }

    public static int stringToInt(String str) {
        if (Pattern.compile(ProtectedSandApp.s("ᙚ\u0001")).matcher(str).matches()) {
            return ValueOf.toInt(str);
        }
        return 0;
    }
}
