package com.tencent.liteav.audio2.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* loaded from: classes7.dex */
public class PermissionActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<PermissionActivity, a> f71763a = new HashMap();

    public static abstract class a implements Serializable {
        public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        }
    }

    static void a(Context context, String[] strArr, a aVar) {
        try {
            Intent intent = new Intent(context, (Class<?>) PermissionActivity.class);
            intent.putExtra(ProtectedSandApp.s("凂\u0001"), strArr);
            intent.putExtra(ProtectedSandApp.s("凃\u0001"), aVar);
            intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
            context.startActivity(intent);
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            String s4 = ProtectedSandApp.s("凅\u0001");
            Log.e(s4, ProtectedSandApp.s("凄\u0001").concat(valueOf), new Object[0]);
            try {
                Activity c5 = i.a().c();
                if (c5 != null) {
                    c5.requestPermissions(strArr, 1000);
                    aVar.onRequestPermissionsResult(strArr, new int[1]);
                }
            } catch (Throwable th2) {
                Log.e(s4, ProtectedSandApp.s("准\u0001").concat(String.valueOf(th2)), new Object[0]);
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        try {
            Intent intent = getIntent();
            f71763a.put(this, (a) intent.getSerializableExtra(ProtectedSandApp.s("凃\u0001")));
            String[] stringArrayExtra = intent.getStringArrayExtra(ProtectedSandApp.s("凂\u0001"));
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
                requestPermissions(stringArrayExtra, 1000);
            }
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            Log.e(ProtectedSandApp.s("凅\u0001"), ProtectedSandApp.s("准\u0001").concat(valueOf), new Object[0]);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        a aVar = f71763a.get(this);
        if (aVar == null) {
            return;
        }
        aVar.onRequestPermissionsResult(strArr, iArr);
        finish();
    }
}
