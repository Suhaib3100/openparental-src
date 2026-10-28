package com.tencent.liteav.audio2.permission;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio2.permission.PermissionActivity;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.ArrayList;
import java.util.List;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class PermissionRequesterAndroid extends PermissionActivity.a {
    private static final String TAG = ProtectedSandApp.s("凇\u0001");
    private static final List<String> mRequestedPermissions = new ArrayList();
    private final long mNativePermissionRequesterAndroid;

    public PermissionRequesterAndroid(long j4) {
        this.mNativePermissionRequesterAndroid = j4;
    }

    private void handleRequestPermissionsResult(String[] strArr) {
        for (String str : strArr) {
            nativeNotifyPermissionsResultFromJava(this.mNativePermissionRequesterAndroid, hasPermission(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (com.tencent.liteav.base.ContextUtils.getApplicationContext().checkPermission(r7, android.os.Process.myPid(), android.os.Process.myUid()) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean hasPermission(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "凇\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L46
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L11
            goto L46
        L11:
            int r3 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()     // Catch: java.lang.Throwable -> L2c
            r4 = 23
            if (r3 < r4) goto L2e
            android.content.Context r3 = com.tencent.liteav.base.ContextUtils.getApplicationContext()     // Catch: java.lang.Throwable -> L2c
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L2c
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L2c
            int r7 = r3.checkPermission(r7, r4, r5)     // Catch: java.lang.Throwable -> L2c
            if (r7 != 0) goto L2f
            goto L2e
        L2c:
            r7 = move-exception
            goto L31
        L2e:
            r1 = r2
        L2f:
            r2 = r1
            goto L45
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "凈\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.<init>(r4)
            java.lang.String r7 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(r7, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.liteav.base.Log.e(r0, r7, r1)
        L45:
            return r2
        L46:
            java.lang.String r7 = "凉\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.liteav.base.Log.w(r0, r7, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio2.permission.PermissionRequesterAndroid.hasPermission(java.lang.String):boolean");
    }

    private static native void nativeNotifyPermissionsResultFromJava(long j4, boolean z4);

    @Override // com.tencent.liteav.audio2.permission.PermissionActivity.a
    public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        handleRequestPermissionsResult(strArr);
        for (String str : strArr) {
            List<String> list = mRequestedPermissions;
            if (!list.contains(str)) {
                list.add(str);
            }
        }
    }

    public void requestPermission(String str) {
        if (str == null || str.isEmpty()) {
            Log.w(ProtectedSandApp.s("凇\u0001"), ProtectedSandApp.s("凊\u0001"), new Object[0]);
        } else {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
                handleRequestPermissionsResult(new String[]{str});
                return;
            }
            List<String> list = mRequestedPermissions;
            if (list.contains(str)) {
                handleRequestPermissionsResult((String[]) list.toArray(new String[0]));
            } else {
                PermissionActivity.a(ContextUtils.getApplicationContext(), new String[]{str}, this);
            }
        }
    }
}
