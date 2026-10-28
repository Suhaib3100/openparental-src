package com.tencent.qcloud.track.service;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.track.cls.ClsAuthenticationException;
import com.tencent.qcloud.track.cls.ClsLifecycleCredentialProvider;
import com.tencent.qcloud.track.cls.ClsSessionCredentials;
import com.tencentcloudapi.cls.android.producer.AsyncProducerClient;
import com.tencentcloudapi.cls.android.producer.AsyncProducerConfig;
import com.tencentcloudapi.cls.android.producer.Callback;
import com.tencentcloudapi.cls.android.producer.Result;
import com.tencentcloudapi.cls.android.producer.common.LogItem;
import com.tencentcloudapi.cls.android.producer.errors.ProducerException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public class ClsTrackService extends ATrackService {
    private static final String TAG = ProtectedSandApp.s("安\u0001");
    private AsyncProducerClient clsClient;
    private ClsLifecycleCredentialProvider clsLifecycleCredentialProvider;
    private ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    private String topicId;

    public static boolean isInclude() {
        try {
            Class.forName(ProtectedSandApp.s("宁\u0001"));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putLogs$1(Map map, String str, Result result) {
        if (isDebug()) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("宂\u0001"));
            for (String str2 : map.keySet()) {
                sb.append(str2);
                sb.append(ProtectedSandApp.s("它\u0001"));
                sb.append((String) map.get(str2));
                sb.append(ProtectedSandApp.s("宄\u0001"));
            }
            sb.delete(sb.length() - 2, sb.length()).append(ProtectedSandApp.s("宅\u0001"));
            String.format(ProtectedSandApp.s("宆\u0001"), str, this.topicId, sb, result.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$report$0(String str, Map map) {
        ClsSessionCredentials clsSessionCredentials;
        try {
            clsSessionCredentials = this.clsLifecycleCredentialProvider.getCredentials();
        } catch (ClsAuthenticationException e4) {
            e4.printStackTrace();
            clsSessionCredentials = null;
        }
        if (clsSessionCredentials != null) {
            this.clsClient.getProducerConfig().resetSecurityToken(clsSessionCredentials.getSecretId(), clsSessionCredentials.getSecretKey(), clsSessionCredentials.getToken());
            putLogs(str, map);
        }
    }

    private void putLogs(final String str, final Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        LogItem logItem = new LogItem();
        for (String str2 : map.keySet()) {
            logItem.PushBack(str2, map.get(str2));
        }
        arrayList.add(logItem);
        try {
            this.clsClient.putLogs(this.topicId, arrayList, new Callback() { // from class: com.tencent.qcloud.track.service.c
                public final void a(Result result) {
                    ClsTrackService.this.lambda$putLogs$1(map, str, result);
                }
            });
        } catch (ProducerException | InterruptedException e4) {
            e4.printStackTrace();
        }
    }

    public void init(Context context, String str, String str2) {
        this.isInit = true;
        this.topicId = str;
        this.clsClient = new AsyncProducerClient(new AsyncProducerConfig(context.getApplicationContext(), str2, ProtectedSandApp.s("宇\u0001"), ProtectedSandApp.s("守\u0001"), "", (String) null));
    }

    @Override // com.tencent.qcloud.track.IReport
    public void report(final String str, final Map<String, String> map) {
        if (!isCloseReport() && this.isInit && isInclude()) {
            if (this.clsLifecycleCredentialProvider == null) {
                putLogs(str, map);
            } else {
                this.singleThreadExecutor.submit(new Runnable() { // from class: com.tencent.qcloud.track.service.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ClsTrackService.this.lambda$report$0(str, map);
                    }
                });
            }
        }
    }

    public void setCredentialProvider(ClsLifecycleCredentialProvider clsLifecycleCredentialProvider) {
        this.clsLifecycleCredentialProvider = clsLifecycleCredentialProvider;
    }

    public void setSecurityCredential(String str, String str2) {
        this.clsClient.getProducerConfig().resetSecurityToken(str, str2, "");
    }
}
