package com.tencent.cos.xml;

import android.os.Handler;
import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CloudControl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class CloudControl {
    private static final String TAG = ProtectedSandApp.s("㑝\u0001");
    private static volatile CloudControl instance;
    public final ThreadPoolExecutor CLOUD_CONTROL_EXECUTOR;
    private final Handler handler;
    private final String BEACON_CLOUD_URL = ProtectedSandApp.s("㑙\u0001");
    private final String BEACON_CLOUD_APPKEY = ProtectedSandApp.s("㑚\u0001");

    interface BeaconCloudCallback {
        void onError(Exception exc);

        void onSuccess(String str);
    }

    private CloudControl() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE));
        this.CLOUD_CONTROL_EXECUTOR = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public static CloudControl getInstance() {
        if (instance == null) {
            synchronized (CloudControl.class) {
                try {
                    if (instance == null) {
                        instance = new CloudControl();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBeaconAppKey$0(BeaconCloudCallback beaconCloudCallback, int i4) {
        beaconCloudCallback.onError(new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("㑛\u0001"), i4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBeaconAppKey$3(String str, final BeaconCloudCallback beaconCloudCallback) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ProtectedSandApp.s("㑙\u0001") + str).openConnection();
            httpURLConnection.setRequestMethod(ProtectedSandApp.s("㑜\u0001"));
            httpURLConnection.connect();
            final int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                this.handler.post(new Runnable() { // from class: com.tencent.cos.xml.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CloudControl.lambda$getBeaconAppKey$0(CloudControl.BeaconCloudCallback.this, responseCode);
                    }
                });
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    final String string = new JSONObject(sb.toString()).getString(ProtectedSandApp.s("㑚\u0001"));
                    this.handler.post(new Runnable() { // from class: com.tencent.cos.xml.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            CloudControl.BeaconCloudCallback.this.onSuccess(string);
                        }
                    });
                    return;
                }
                sb.append(readLine);
            }
        } catch (Exception e4) {
            this.handler.post(new Runnable() { // from class: com.tencent.cos.xml.c
                @Override // java.lang.Runnable
                public final void run() {
                    CloudControl.BeaconCloudCallback.this.onError(e4);
                }
            });
        }
    }

    public void getBeaconAppKey(final String str, final BeaconCloudCallback beaconCloudCallback) {
        this.CLOUD_CONTROL_EXECUTOR.execute(new Runnable() { // from class: com.tencent.cos.xml.a
            @Override // java.lang.Runnable
            public final void run() {
                CloudControl.this.lambda$getBeaconAppKey$3(str, beaconCloudCallback);
            }
        });
    }
}
