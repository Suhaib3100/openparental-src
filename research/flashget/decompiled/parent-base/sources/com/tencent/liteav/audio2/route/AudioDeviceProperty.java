package com.tencent.liteav.audio2.route;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio2.route.a;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class AudioDeviceProperty implements a.InterfaceC1002a {
    private static final String TAG = ProtectedSandApp.s("凕\u0001");
    private AudioDeviceCallback mAudioDeviceCallback;
    private a mAudioEventBroadcastReceiver;
    private final AudioManager mAudioManager;
    private b mBluetoothHeadsetListener;
    private final Context mContext;
    private long mNativeAudioDeviceProperty;
    private boolean mAudioDeviceCallbackAvailable = false;
    private boolean mUseBluetoothSco = false;

    public static class UsbAudioDeviceInfo {

        /* renamed from: a, reason: collision with root package name */
        public String f71765a = "";

        /* renamed from: b, reason: collision with root package name */
        public String f71766b = "";

        public String getName() {
            return this.f71765a;
        }

        public String getVidPid() {
            return this.f71766b;
        }
    }

    public AudioDeviceProperty(long j4) {
        this.mNativeAudioDeviceProperty = j4;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.mAudioManager = (AudioManager) applicationContext.getSystemService(ProtectedSandApp.s("凒\u0001"));
    }

    private void buildAudioDeviceCallback() {
        if (this.mAudioDeviceCallback != null) {
            return;
        }
        this.mAudioDeviceCallback = new AudioDeviceCallback() { // from class: com.tencent.liteav.audio2.route.AudioDeviceProperty.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                String s4 = ProtectedSandApp.s("凌\u0001");
                Log.i(s4, ProtectedSandApp.s("凋\u0001") + audioDeviceInfoArr.length, new Object[0]);
                AudioDeviceProperty.this.mAudioDeviceCallbackAvailable = true;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.i(s4, ProtectedSandApp.s("凍\u0001") + audioDeviceInfo.getType() + ProtectedSandApp.s("凎\u0001") + audioDeviceInfo.isSink() + ProtectedSandApp.s("减\u0001") + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 26) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                String s4 = ProtectedSandApp.s("凌\u0001");
                Log.i(s4, ProtectedSandApp.s("凐\u0001") + audioDeviceInfoArr.length, new Object[0]);
                int length = audioDeviceInfoArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i4];
                    Log.i(s4, ProtectedSandApp.s("凑\u0001") + audioDeviceInfo.getType() + ProtectedSandApp.s("凎\u0001") + audioDeviceInfo.isSink() + ProtectedSandApp.s("减\u0001") + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if ((audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) && !AudioDeviceProperty.this.isBluetoothHeadsetConnected()) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    }
                }
            }
        };
    }

    private boolean isCommunicationDeviceConnected(int i4) {
        try {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) AudioManager.class.getMethod(ProtectedSandApp.s("凓\u0001"), null).invoke(this.mAudioManager, null);
            if (audioDeviceInfo == null) {
                return false;
            }
            return audioDeviceInfo.getType() == i4;
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), ProtectedSandApp.s("凔\u0001").concat(String.valueOf(th)), new Object[0]);
            return false;
        }
    }

    public static boolean isUsbHeadsetDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i4 = 0; i4 < usbDevice.getInterfaceCount(); i4++) {
            try {
                if (usbDevice.getInterface(i4).getInterfaceClass() == 1) {
                    return true;
                }
            } catch (Throwable th) {
                Log.e(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凖\u0001"))), new Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyBluetoothConnectionChangedFromJava(long j4, boolean z4);

    private static native void nativeNotifyBluetoothScoConnectedFromJava(long j4, boolean z4);

    private static native void nativeNotifySystemVolumeChangedFromJava(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyUsbConnectionChangedFromJava(long j4, String str, boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyWiredHeadsetConnectionChangedFromJava(long j4, boolean z4);

    private void registerAudioDeviceCallback() {
        String s4 = ProtectedSandApp.s("凕\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return;
        }
        if (this.mAudioDeviceCallback == null) {
            buildAudioDeviceCallback();
        }
        AudioDeviceCallback audioDeviceCallback = this.mAudioDeviceCallback;
        if (audioDeviceCallback == null) {
            return;
        }
        try {
            this.mAudioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
            Log.i(s4, ProtectedSandApp.s("凗\u0001"), new Object[0]);
        } catch (Throwable th) {
            Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凘\u0001"))), new Object[0]);
        }
    }

    private void setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        String s4 = ProtectedSandApp.s("凕\u0001");
        try {
            boolean booleanValue = ((Boolean) AudioManager.class.getMethod(ProtectedSandApp.s("凙\u0001"), AudioDeviceInfo.class).invoke(this.mAudioManager, audioDeviceInfo)).booleanValue();
            if (!booleanValue) {
                AudioManager.class.getMethod(ProtectedSandApp.s("凚\u0001"), null).invoke(this.mAudioManager, null);
            }
            Log.i(s4, ProtectedSandApp.s("凛\u0001") + booleanValue + ProtectedSandApp.s("凜\u0001") + audioDeviceInfo.getType() + ProtectedSandApp.s("凝\u0001") + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
        } catch (Throwable th) {
            Log.i(s4, ProtectedSandApp.s("凞\u0001").concat(String.valueOf(th)), new Object[0]);
        }
    }

    private void unregisterAudioDeviceCallback() {
        AudioDeviceCallback audioDeviceCallback;
        String s4 = ProtectedSandApp.s("凕\u0001");
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (audioDeviceCallback = this.mAudioDeviceCallback) != null) {
            try {
                this.mAudioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                Log.i(s4, ProtectedSandApp.s("凟\u0001"), new Object[0]);
            } catch (Throwable th) {
                Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("几\u0001"))), new Object[0]);
            }
        }
    }

    public UsbAudioDeviceInfo GetUsbAudioDeviceInfo(String str) {
        UsbManager usbManager;
        UsbAudioDeviceInfo usbAudioDeviceInfo = new UsbAudioDeviceInfo();
        try {
            usbManager = (UsbManager) this.mContext.getSystemService(ProtectedSandApp.s("凡\u0001"));
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凢\u0001"))), new Object[0]);
        }
        if (usbManager != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                if (!str.contains(usbDevice.getProductName()) && !isUsbHeadsetDevice(usbDevice)) {
                }
                usbAudioDeviceInfo.f71765a = usbDevice.getProductName();
                usbAudioDeviceInfo.f71766b = String.valueOf(usbDevice.getVendorId()) + usbDevice.getProductId();
            }
            return usbAudioDeviceInfo;
        }
        return usbAudioDeviceInfo;
    }

    public boolean checkBluetoothPermission() {
        return b.a(this.mContext);
    }

    public void connectBluetooth() {
        String s4 = ProtectedSandApp.s("凕\u0001");
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 35) {
                this.mUseBluetoothSco = true;
                this.mAudioManager.startBluetoothSco();
                Log.i(s4, ProtectedSandApp.s("凣\u0001"), new Object[0]);
                return;
            }
            List<AudioDeviceInfo> list = (List) AudioManager.class.getMethod(ProtectedSandApp.s("凤\u0001"), null).invoke(this.mAudioManager, null);
            if (list != null && !list.isEmpty()) {
                for (AudioDeviceInfo audioDeviceInfo : list) {
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                        setCommunicationDevice(audioDeviceInfo);
                        return;
                    }
                }
                Log.w(s4, ProtectedSandApp.s("凥\u0001"), new Object[0]);
                this.mUseBluetoothSco = true;
                this.mAudioManager.startBluetoothSco();
            }
        } catch (Throwable th) {
            Log.i(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("処\u0001"))), new Object[0]);
        }
    }

    public void disconnectBluetooth() {
        String s4 = ProtectedSandApp.s("凚\u0001");
        String s5 = ProtectedSandApp.s("凕\u0001");
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 35 && !this.mUseBluetoothSco) {
                AudioManager.class.getMethod(s4, null).invoke(this.mAudioManager, null);
                Log.i(s5, s4, new Object[0]);
                return;
            }
            this.mUseBluetoothSco = false;
            this.mAudioManager.stopBluetoothSco();
            Log.i(s5, ProtectedSandApp.s("凧\u0001"), new Object[0]);
        } catch (Throwable th) {
            Log.i(s5, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凨\u0001"))), new Object[0]);
        }
    }

    public int getMode() {
        try {
            return this.mAudioManager.getMode();
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凩\u0001"))), new Object[0]);
            return 0;
        }
    }

    public int getSystemVolume() {
        try {
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(this.mAudioManager.getMode() == 0 ? 3 : 0);
            if (streamMaxVolume <= 0) {
                return -1;
            }
            return (int) ((this.mAudioManager.getStreamVolume(r2) / streamMaxVolume) * 100.0f);
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凪\u0001"))), new Object[0]);
            return -1;
        }
    }

    public boolean isBluetoothConnected() {
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 35) {
                return isCommunicationDeviceConnected(7) || isCommunicationDeviceConnected(26);
            }
            Intent registerReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter(ProtectedSandApp.s("凫\u0001")));
            return registerReceiver != null && registerReceiver.getIntExtra(ProtectedSandApp.s("凬\u0001"), 0) == 1;
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凭\u0001"))), new Object[0]);
            return false;
        }
    }

    public boolean isBluetoothHeadsetConnected() {
        b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            return bVar.a();
        }
        Log.e(ProtectedSandApp.s("凕\u0001"), ProtectedSandApp.s("凮\u0001"), new Object[0]);
        return false;
    }

    public boolean isBluetoothOn() {
        try {
            return LiteavSystemInfo.getSystemOSVersionInt() < 35 ? this.mAudioManager.isBluetoothScoOn() : isCommunicationDeviceConnected(7) || isCommunicationDeviceConnected(26);
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凯\u0001"))), new Object[0]);
            return false;
        }
    }

    public boolean isBluetoothScoAvailable() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (AudioDeviceInfo audioDeviceInfo : this.mAudioManager.getDevices(2)) {
                arrayList.add(Integer.valueOf(audioDeviceInfo.getType()));
            }
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凰\u0001"))), new Object[0]);
        }
        return arrayList.isEmpty() || !arrayList.contains(8) || arrayList.contains(7);
    }

    public boolean isSpeakerphoneOn() {
        try {
            return this.mAudioManager.isSpeakerphoneOn();
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凱\u0001"))), new Object[0]);
            return false;
        }
    }

    public boolean isUsbHeadsetAvailable() {
        UsbManager usbManager;
        try {
            usbManager = (UsbManager) this.mContext.getSystemService(ProtectedSandApp.s("凡\u0001"));
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凢\u0001"))), new Object[0]);
        }
        if (usbManager == null) {
            return false;
        }
        Iterator<UsbDevice> it = usbManager.getDeviceList().values().iterator();
        while (it.hasNext()) {
            if (isUsbHeadsetDevice(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean isWiredHeadsetOn() {
        try {
            return this.mAudioManager.isWiredHeadsetOn();
        } catch (Throwable th) {
            Log.i(ProtectedSandApp.s("凕\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凲\u0001"))), new Object[0]);
            return false;
        }
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC1002a
    public void onBluetoothConnectionChanged(boolean z4) {
        if (z4 || !isBluetoothHeadsetConnected()) {
            nativeNotifyBluetoothConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z4);
        }
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC1002a
    public void onBluetoothScoConnected(boolean z4) {
        nativeNotifyBluetoothScoConnectedFromJava(this.mNativeAudioDeviceProperty, z4);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC1002a
    public void onSystemVolumeChanged() {
        nativeNotifySystemVolumeChangedFromJava(this.mNativeAudioDeviceProperty);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC1002a
    public void onUsbConnectionChanged(String str, boolean z4) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyUsbConnectionChangedFromJava(this.mNativeAudioDeviceProperty, str, z4);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC1002a
    public void onWiredHeadsetConnectionChanged(boolean z4) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyWiredHeadsetConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z4);
    }

    public void setBluetoothOn(boolean z4) {
        String s4 = ProtectedSandApp.s("凕\u0001");
        try {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 35) {
                this.mAudioManager.setBluetoothScoOn(z4);
                Log.i(s4, ProtectedSandApp.s("凳\u0001").concat(String.valueOf(z4)), new Object[0]);
            }
        } catch (Throwable th) {
            Log.i(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凴\u0001"))), new Object[0]);
        }
    }

    public void setSpeakerphoneOn(boolean z4) {
        String s4 = ProtectedSandApp.s("凕\u0001");
        try {
            this.mAudioManager.setSpeakerphoneOn(z4);
            Log.i(s4, ProtectedSandApp.s("凵\u0001").concat(String.valueOf(z4)), new Object[0]);
        } catch (Throwable th) {
            Log.i(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凶\u0001"))), new Object[0]);
        }
    }

    public void setVoip(boolean z4) {
        String s4 = ProtectedSandApp.s("凕\u0001");
        int i4 = z4 ? 3 : 0;
        try {
            this.mAudioManager.setMode(i4);
            Log.i(s4, ProtectedSandApp.s("凷\u0001").concat(String.valueOf(i4)), new Object[0]);
        } catch (Throwable th) {
            Log.i(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凸\u0001"))), new Object[0]);
        }
    }

    public void setWiredHeadsetOn(boolean z4) {
        String s4 = ProtectedSandApp.s("凕\u0001");
        try {
            this.mAudioManager.setWiredHeadsetOn(z4);
            Log.i(s4, ProtectedSandApp.s("凹\u0001").concat(String.valueOf(z4)), new Object[0]);
        } catch (Throwable th) {
            Log.i(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("出\u0001"))), new Object[0]);
        }
    }

    public void start() {
        registerAudioDeviceCallback();
        a aVar = new a(this.mContext, this);
        this.mAudioEventBroadcastReceiver = aVar;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ProtectedSandApp.s("击\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("凼\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("函\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("凾\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("凿\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("刀\u0001"));
            intentFilter.addAction(ProtectedSandApp.s("刁\u0001"));
            aVar.f71767a.registerReceiver(aVar, intentFilter);
        } catch (Throwable unused) {
            Log.e(ProtectedSandApp.s("刂\u0001"), ProtectedSandApp.s("刃\u0001"), new Object[0]);
        }
        this.mBluetoothHeadsetListener = new b(this.mContext);
    }

    public void stop() {
        Context context;
        a aVar = this.mAudioEventBroadcastReceiver;
        if (aVar != null && (context = aVar.f71767a) != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception unused) {
            }
        }
        this.mAudioEventBroadcastReceiver = null;
        b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            synchronized (bVar.f71771c) {
                try {
                    if (bVar.f71769a != null && bVar.f71770b != null) {
                        bVar.b();
                        bVar.f71770b = null;
                    }
                } finally {
                }
            }
        }
        this.mBluetoothHeadsetListener = null;
        unregisterAudioDeviceCallback();
    }
}
