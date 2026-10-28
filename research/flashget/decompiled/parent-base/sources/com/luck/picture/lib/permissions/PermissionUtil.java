package com.luck.picture.lib.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.e1;
import androidx.annotation.o0;
import androidx.core.app.b;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.utils.SpUtils;

/* loaded from: classes6.dex */
public class PermissionUtil {
    public static final String ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION = ProtectedSandApp.s("ᚿ\u0001");
    public static final int DEFAULT = 0;
    public static final int REFUSE = 2;
    public static final int REFUSE_PERMANENT = 3;
    public static final int SUCCESS = 1;

    public static int getPermissionStatus(Activity activity, String str) {
        int checkSelfPermission = d.checkSelfPermission(activity, str);
        if (b.r(activity, str)) {
            return 2;
        }
        if (checkSelfPermission == 0) {
            return 1;
        }
        return !SpUtils.contains(activity, str) ? 0 : 3;
    }

    public static void goIntentSetting(Fragment fragment, int i4) {
        try {
            Intent intent = new Intent(ProtectedSandApp.s("ᚺ\u0001"));
            intent.setData(Uri.fromParts(ProtectedSandApp.s("ᚻ\u0001"), fragment.getActivity().getPackageName(), null));
            fragment.startActivityForResult(intent, i4);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static boolean hasPermissions(@o0 Context context, @e1(min = 1) @o0 String... strArr) {
        for (String str : strArr) {
            if (d.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllGranted(Context context, String[] strArr, int[] iArr) {
        boolean z4 = true;
        boolean z5 = context.getApplicationInfo().targetSdkVersion >= 34 && d.checkSelfPermission(context, ProtectedSandApp.s("ᚼ\u0001")) == 0;
        if (iArr.length <= 0) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] == 0) {
                i4++;
            } else if (!z5 || (!strArr[i4].equals(ProtectedSandApp.s("ᚽ\u0001")) && !strArr[i4].equals(ProtectedSandApp.s("ᚾ\u0001")))) {
                z4 = false;
            }
        }
        return z4;
    }
}
