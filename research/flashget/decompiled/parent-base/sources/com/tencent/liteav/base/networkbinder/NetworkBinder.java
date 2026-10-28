package com.tencent.liteav.base.networkbinder;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class NetworkBinder {
    public static final int CELLULAR = 2;
    public static final int DEFAULT = 0;
    private static final String TAG = ProtectedSandApp.s("化\u0001");
    public static final int WIFI = 1;
    private static boolean isPrint = true;
    private long mNativeNetworkBinderJni;
    private final Object mLocker = new Object();
    private boolean mIsActivatingNetwork = false;
    private boolean mIsNetworkAvailable = false;
    private int mNetworkType = 0;
    private ConnectivityManager.NetworkCallback mNetworkCallback = null;
    private final Runnable mTimeoutRunnable = new Runnable() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (NetworkBinder.this.mLocker) {
                try {
                    if (NetworkBinder.this.mIsActivatingNetwork && NetworkBinder.this.checkNativeValid()) {
                        NetworkBinder.nativeOnNetworkAvailable(NetworkBinder.this.mNativeNetworkBinderJni, "", false);
                        LiteavLog.e(ProtectedSandApp.s("匐\u0001"), ProtectedSandApp.s("匑\u0001"));
                        NetworkBinder.this.mIsActivatingNetwork = false;
                        NetworkBinder.this.mIsNetworkAvailable = false;
                        NetworkBinder.this.deactivateNetworkAdapter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public NetworkBinder(long j4) {
        this.mNativeNetworkBinderJni = j4;
    }

    public static boolean bindSocket(String str, int i4) {
        String s4 = ProtectedSandApp.s("北\u0001");
        String s5 = ProtectedSandApp.s("化\u0001");
        if (str != null && !str.isEmpty() && i4 != -1) {
            try {
                if (!checkSystemVersionValid()) {
                    return false;
                }
                Network findNetwork = findNetwork(str);
                if (findNetwork == null) {
                    LiteavLog.e(s5, ProtectedSandApp.s("匘\u0001").concat(str));
                    return false;
                }
                findNetwork.bindSocket(ParcelFileDescriptor.fromFd(i4).getFileDescriptor());
                LiteavLog.i(s5, ProtectedSandApp.s("匙\u0001") + str + s4 + i4);
                return true;
            } catch (Exception unused) {
                LiteavLog.e(s5, ProtectedSandApp.s("匚\u0001") + str + s4 + i4);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancleTimeoutRunnable() {
        if (this.mHandler != null) {
            Log.i(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匛\u0001"), new Object[0]);
            this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkNativeValid() {
        boolean z4;
        synchronized (this.mLocker) {
            z4 = this.mNativeNetworkBinderJni != -1;
        }
        return z4;
    }

    private static boolean checkSystemVersionValid() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            return true;
        }
        if (isPrint) {
            LiteavLog.e(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匜\u0001"));
            isPrint = false;
        }
        return false;
    }

    private ConnectivityManager.NetworkCallback createNetworkCallback() {
        final ConnectivityManager connectivityManager;
        synchronized (this.mLocker) {
            try {
                ConnectivityManager.NetworkCallback networkCallback = this.mNetworkCallback;
                if (networkCallback != null) {
                    return networkCallback;
                }
                if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null) {
                    return null;
                }
                ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.2
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        super.onAvailable(network);
                        if (network == null) {
                            Log.e(ProtectedSandApp.s("匒\u0001"), ProtectedSandApp.s("匓\u0001"), new Object[0]);
                            return;
                        }
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                        synchronized (NetworkBinder.this.mLocker) {
                            try {
                                if (NetworkBinder.this.mIsActivatingNetwork) {
                                    NetworkBinder.this.mIsActivatingNetwork = false;
                                    NetworkBinder.this.mIsNetworkAvailable = true;
                                    if (linkProperties != null && NetworkBinder.this.checkNativeValid()) {
                                        String interfaceName = linkProperties.getInterfaceName();
                                        NetworkBinder.nativeOnNetworkAvailable(NetworkBinder.this.mNativeNetworkBinderJni, interfaceName, true);
                                        Log.i(ProtectedSandApp.s("匒\u0001"), ProtectedSandApp.s("匔\u0001").concat(String.valueOf(interfaceName)), new Object[0]);
                                    }
                                    NetworkBinder.this.cancleTimeoutRunnable();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        super.onLost(network);
                        synchronized (NetworkBinder.this.mLocker) {
                            try {
                                if (NetworkBinder.this.mIsNetworkAvailable && !NetworkBinder.this.mIsActivatingNetwork) {
                                    NetworkBinder.this.mIsNetworkAvailable = false;
                                    if (NetworkBinder.this.checkNativeValid()) {
                                        NetworkBinder.nativeOnNetworkAvailable(NetworkBinder.this.mNativeNetworkBinderJni, "", false);
                                        Log.i(ProtectedSandApp.s("匒\u0001"), ProtectedSandApp.s("匕\u0001"), new Object[0]);
                                    }
                                    NetworkBinder.this.deactivateNetworkAdapter();
                                }
                            } finally {
                            }
                        }
                    }
                };
                synchronized (this.mLocker) {
                    this.mNetworkCallback = networkCallback2;
                }
                return networkCallback2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deactivateNetworkAdapter() {
        ConnectivityManager connectivityManager;
        try {
            if (checkSystemVersionValid() && (connectivityManager = getConnectivityManager()) != null) {
                synchronized (this.mLocker) {
                    try {
                        if (this.mNetworkCallback != null) {
                            Log.i(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匝\u0001"), new Object[0]);
                            connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception unused) {
            LiteavLog.e(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匞\u0001"));
        }
    }

    public static Network findNetwork(String str) {
        ConnectivityManager connectivityManager;
        if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null) {
            return null;
        }
        for (Network network : connectivityManager.getAllNetworks()) {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null && linkProperties.getInterfaceName().equals(str)) {
                return network;
            }
        }
        return null;
    }

    private static ConnectivityManager getConnectivityManager() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return (ConnectivityManager) applicationContext.getSystemService(ProtectedSandApp.s("匟\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnNetworkAvailable(long j4, String str, boolean z4);

    public boolean activateNetworkAdapter(int i4) {
        if (i4 != 1 && i4 != 2) {
            return false;
        }
        try {
        } catch (Exception unused) {
            LiteavLog.e(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匡\u0001").concat(String.valueOf(i4)));
        }
        synchronized (this.mLocker) {
            try {
                if (this.mIsActivatingNetwork) {
                    LiteavLog.e(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匠\u0001"));
                    return false;
                }
                this.mIsActivatingNetwork = true;
                this.mIsNetworkAvailable = false;
                if (this.mNetworkType != i4) {
                    deactivateNetworkAdapter();
                }
                this.mNetworkType = i4;
                if (doActivateNetworkAdapter(i4)) {
                    synchronized (this.mLocker) {
                        try {
                            Handler handler = this.mHandler;
                            if (handler != null) {
                                handler.postDelayed(this.mTimeoutRunnable, 2000L);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mIsActivatingNetwork = false;
            this.mIsNetworkAvailable = false;
            deactivateNetworkAdapter();
            cancleTimeoutRunnable();
            this.mNativeNetworkBinderJni = -1L;
        }
    }

    public boolean doActivateNetworkAdapter(int i4) {
        int i5;
        ConnectivityManager connectivityManager;
        ConnectivityManager.NetworkCallback createNetworkCallback;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = 0;
            }
            return false;
        }
        i5 = 1;
        try {
            if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null || (createNetworkCallback = createNetworkCallback()) == null) {
                return false;
            }
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(i5).build(), createNetworkCallback);
            return true;
        } catch (Exception unused) {
            LiteavLog.e(ProtectedSandApp.s("化\u0001"), ProtectedSandApp.s("匢\u0001").concat(String.valueOf(i4)));
        }
    }

    public void resumeDefaultNetworkAdapter() {
        this.mNetworkType = 0;
        deactivateNetworkAdapter();
    }
}
