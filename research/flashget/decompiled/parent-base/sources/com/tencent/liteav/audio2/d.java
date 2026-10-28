package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* loaded from: classes7.dex */
public final class d extends AudioManager.AudioRecordingCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile a f71749a;

    interface a {
        void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list);
    }

    public d() {
        AudioManager audioManager;
        String s4 = ProtectedSandApp.s("冴\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("况\u0001"))) != null) {
            try {
                audioManager.registerAudioRecordingCallback(this, null);
                Log.i(s4, ProtectedSandApp.s("冶\u0001"), new Object[0]);
            } catch (Throwable th) {
                Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冷\u0001"))), new Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        a aVar = this.f71749a;
        if (aVar == null) {
            return;
        }
        aVar.OnRecordingConfigChanged(list);
    }
}
