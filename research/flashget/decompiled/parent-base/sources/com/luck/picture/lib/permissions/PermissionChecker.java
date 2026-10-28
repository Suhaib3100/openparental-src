package com.luck.picture.lib.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.x0;
import androidx.core.app.b;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.SpUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class PermissionChecker {
    private static final int REQUEST_CODE = 10086;
    private static PermissionChecker mInstance;

    private PermissionChecker() {
    }

    public static boolean checkSelfPermission(Context context, String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (d.checkSelfPermission(context.getApplicationContext(), str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static PermissionChecker getInstance() {
        if (mInstance == null) {
            synchronized (PermissionChecker.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new PermissionChecker();
                    }
                } finally {
                }
            }
        }
        return mInstance;
    }

    public static boolean isCheckCamera(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚭ\u0001")});
    }

    @x0(api = 33)
    public static boolean isCheckReadAudio(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚮ\u0001")});
    }

    public static boolean isCheckReadExternalStorage(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚯ\u0001")});
    }

    @x0(api = 33)
    public static boolean isCheckReadImages(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚰ\u0001")});
    }

    public static boolean isCheckReadStorage(int i4, Context context) {
        return SdkVersionUtils.isTIRAMISU() ? i4 == SelectMimeType.ofImage() ? isCheckReadImages(context) : i4 == SelectMimeType.ofVideo() ? isCheckReadVideo(context) : i4 == SelectMimeType.ofAudio() ? isCheckReadAudio(context) : isCheckReadImages(context) && isCheckReadVideo(context) : isCheckReadExternalStorage(context);
    }

    @x0(api = 33)
    public static boolean isCheckReadVideo(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚱ\u0001")});
    }

    public static boolean isCheckSelfPermission(Context context, String[] strArr) {
        return checkSelfPermission(context, strArr);
    }

    public static boolean isCheckWriteExternalStorage(Context context) {
        return checkSelfPermission(context, new String[]{ProtectedSandApp.s("ᚲ\u0001")});
    }

    public void onRequestPermissionsResult(Context context, String[] strArr, int[] iArr, PermissionResultCallback permissionResultCallback) {
        Activity activity = (Activity) context;
        for (String str : strArr) {
            SpUtils.putBoolean(context, str, b.r(activity, str));
        }
        if (PermissionUtil.isAllGranted(context, strArr, iArr)) {
            permissionResultCallback.onGranted();
        } else {
            permissionResultCallback.onDenied();
        }
    }

    public void requestPermissions(Fragment fragment, String[] strArr, PermissionResultCallback permissionResultCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        requestPermissions(fragment, arrayList, REQUEST_CODE, permissionResultCallback);
    }

    public void requestPermissions(Fragment fragment, List<String[]> list, PermissionResultCallback permissionResultCallback) {
        requestPermissions(fragment, list, REQUEST_CODE, permissionResultCallback);
    }

    private void requestPermissions(Fragment fragment, List<String[]> list, int i4, PermissionResultCallback permissionResultCallback) {
        if (!ActivityCompatHelper.isDestroy(fragment.getActivity()) && (fragment instanceof PictureCommonFragment)) {
            FragmentActivity activity = fragment.getActivity();
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : list) {
                for (String str : strArr) {
                    if (d.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                if (permissionResultCallback != null) {
                    permissionResultCallback.onGranted();
                }
            } else {
                ((PictureCommonFragment) fragment).setPermissionsResultAction(permissionResultCallback);
                String[] strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
                fragment.requestPermissions(strArr2, i4);
                b.l(activity, strArr2, i4);
            }
        }
    }
}
