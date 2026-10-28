package com.tencent.qcloud.core.logger.channel;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.LogEntity;
import com.tencent.qcloud.track.service.ClsTrackService;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ClsChannel extends BaseLogChannel {
    private static final String EVENT_CODE_TRACK_COS_SDK_LOG = ProtectedSandApp.s("媛\u0001");
    private final ClsTrackService clsTrackService;

    public ClsChannel(ClsTrackService clsTrackService) {
        this.clsTrackService = clsTrackService;
    }

    private boolean isLoggable(LogEntity logEntity) {
        if (!isEnabled() || logEntity == null) {
            return false;
        }
        return logEntity.getLevel().isLoggable(getMinLevel());
    }

    @Override // com.tencent.qcloud.core.logger.channel.BaseLogChannel
    public void log(LogEntity logEntity) {
        if (isLoggable(logEntity)) {
            HashMap hashMap = new HashMap(logEntity.getExtras());
            hashMap.put(ProtectedSandApp.s("媔\u0001"), String.valueOf(logEntity.getTimestamp()));
            hashMap.put(ProtectedSandApp.s("媕\u0001"), logEntity.getLevel().name());
            hashMap.put(ProtectedSandApp.s("媖\u0001"), logEntity.getCategory().name());
            hashMap.put(ProtectedSandApp.s("媗\u0001"), logEntity.getTag());
            hashMap.put(ProtectedSandApp.s("媘\u0001"), logEntity.getMessage());
            hashMap.put(ProtectedSandApp.s("媙\u0001"), logEntity.getThreadName());
            if (logEntity.getThrowable() != null) {
                hashMap.put(ProtectedSandApp.s("媚\u0001"), Log.getStackTraceString(logEntity.getThrowable()));
            }
            this.clsTrackService.report(ProtectedSandApp.s("媛\u0001"), hashMap);
        }
    }
}
