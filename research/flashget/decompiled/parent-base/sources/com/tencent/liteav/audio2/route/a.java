package com.tencent.liteav.audio2.route;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import androidx.appcompat.view.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;

/* loaded from: classes7.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final Context f71767a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1002a f71768b;

    /* renamed from: com.tencent.liteav.audio2.route.a$a, reason: collision with other inner class name */
    public interface InterfaceC1002a {
        void onBluetoothConnectionChanged(boolean z4);

        void onBluetoothScoConnected(boolean z4);

        void onSystemVolumeChanged();

        void onUsbConnectionChanged(String str, boolean z4);

        void onWiredHeadsetConnectionChanged(boolean z4);
    }

    public a(Context context, InterfaceC1002a interfaceC1002a) {
        this.f71767a = context;
        this.f71768b = interfaceC1002a;
    }

    private static String a(int i4) {
        switch (i4) {
            case 10:
                return ProtectedSandApp.s("刊\u0001");
            case 11:
                return ProtectedSandApp.s("刉\u0001");
            case 12:
                return ProtectedSandApp.s("刈\u0001");
            case 13:
                return ProtectedSandApp.s("切\u0001");
            default:
                return ProtectedSandApp.s("分\u0001");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c5;
        String str;
        String s4 = ProtectedSandApp.s("刋\u0001");
        String s5 = ProtectedSandApp.s("刌\u0001");
        String s6 = ProtectedSandApp.s("刅\u0001");
        if (intent == null || context == null) {
            Log.e(s6, ProtectedSandApp.s("刧\u0001"), new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
        }
        String s7 = ProtectedSandApp.s("刍\u0001");
        switch (action.hashCode()) {
            case -2114103349:
                if (action.equals(s5)) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1940635523:
                if (action.equals(ProtectedSandApp.s("划\u0001"))) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1676458352:
                if (action.equals(ProtectedSandApp.s("刑\u0001"))) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -1608292967:
                if (action.equals(s4)) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -1530327060:
                if (action.equals(ProtectedSandApp.s("刐\u0001"))) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1435586571:
                if (action.equals(ProtectedSandApp.s("刏\u0001"))) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 545516589:
                if (action.equals(ProtectedSandApp.s("刎\u0001"))) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
            case 3:
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(ProtectedSandApp.s("刢\u0001"));
                if (usbDevice != null) {
                    if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                        str = usbDevice.getProductName();
                        StringBuilder a5 = g.a(ProtectedSandApp.s("刣\u0001"), str, ProtectedSandApp.s("判\u0001"));
                        a5.append(usbDevice.getManufacturerName());
                        Log.i(s6, a5.toString(), new Object[0]);
                    } else {
                        str = "";
                    }
                    if (!AudioDeviceProperty.isUsbHeadsetDevice(usbDevice)) {
                        Log.i(s6, ProtectedSandApp.s("別\u0001"), new Object[0]);
                        break;
                    } else if (!s5.equals(intent.getAction())) {
                        if (!s4.equals(intent.getAction())) {
                            Log.i(s6, ProtectedSandApp.s("刦\u0001") + intent.getAction(), new Object[0]);
                            break;
                        } else {
                            this.f71768b.onUsbConnectionChanged(str, false);
                            break;
                        }
                    } else {
                        this.f71768b.onUsbConnectionChanged(str, true);
                        break;
                    }
                }
                break;
            case 1:
                InterfaceC1002a interfaceC1002a = this.f71768b;
                if (interfaceC1002a != null) {
                    interfaceC1002a.onSystemVolumeChanged();
                    break;
                }
                break;
            case 2:
                int a6 = a(intent, ProtectedSandApp.s("刟\u0001"), -1);
                Log.i(s6, ProtectedSandApp.s("删\u0001").concat(String.valueOf(a6)), new Object[0]);
                if (a6 != -1) {
                    this.f71768b.onWiredHeadsetConnectionChanged(a6 != 0);
                    break;
                } else {
                    Log.e(s6, ProtectedSandApp.s("刡\u0001"), new Object[0]);
                    break;
                }
            case 4:
                int a7 = a(intent, ProtectedSandApp.s("创\u0001"), 0);
                Log.i(s6, ProtectedSandApp.s("初\u0001") + a(a7) + ProtectedSandApp.s("刞\u0001") + a(a(intent, ProtectedSandApp.s("刜\u0001"), 0)), new Object[0]);
                if (a7 == 10) {
                    this.f71768b.onBluetoothConnectionChanged(false);
                    break;
                }
                break;
            case 5:
                int a8 = a(intent, s7, 10);
                if (a8 != 12) {
                    if (a8 == 10) {
                        Log.i(s6, ProtectedSandApp.s("刚\u0001"), new Object[0]);
                        this.f71768b.onBluetoothScoConnected(false);
                        break;
                    }
                } else {
                    Log.i(s6, ProtectedSandApp.s("则\u0001"), new Object[0]);
                    this.f71768b.onBluetoothScoConnected(true);
                    break;
                }
                break;
            case 6:
                int a10 = a(intent, s7, -1);
                Log.i(s6, ProtectedSandApp.s("刘\u0001"), a10 != 0 ? a10 != 1 ? a10 != 2 ? a10 != 3 ? ProtectedSandApp.s("分\u0001") : ProtectedSandApp.s("刔\u0001") : ProtectedSandApp.s("刕\u0001") : ProtectedSandApp.s("刖\u0001") : ProtectedSandApp.s("列\u0001"));
                if (a10 == 0) {
                    this.f71768b.onBluetoothConnectionChanged(false);
                    break;
                } else if (a10 == 2) {
                    this.f71768b.onBluetoothConnectionChanged(true);
                    break;
                }
                break;
            default:
                Log.w(s6, ProtectedSandApp.s("刓\u0001").concat(action), new Object[0]);
                break;
        }
    }

    private static int a(Intent intent, String str, int i4) {
        try {
            return intent.getIntExtra(str, i4);
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4);
            Log.e(ProtectedSandApp.s("刅\u0001"), ProtectedSandApp.s("刄\u0001").concat(valueOf), new Object[0]);
            return i4;
        }
    }
}
