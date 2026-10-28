package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* loaded from: classes7.dex */
public final class c extends AudioManager$AudioPlaybackCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile a f71748a;

    interface a {
        void a();
    }

    public c() {
        AudioManager audioManager;
        String s4 = ProtectedSandApp.s("冰\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 26 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("冱\u0001"))) != null) {
            try {
                audioManager.registerAudioPlaybackCallback(this, null);
                Log.i(s4, ProtectedSandApp.s("冲\u0001"), new Object[0]);
            } catch (Throwable th) {
                Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("决\u0001"))), new Object[0]);
            }
        }
    }

    public final void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
        a aVar = this.f71748a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
