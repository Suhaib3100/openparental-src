package com.tencent.liteav.transcriber;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface AITranscriberManager {

    public interface AITranscriberListener {
        void onRealtimeTranscriberError(String str, String str2, int i4, String str3);

        void onRealtimeTranscriberStarted(String str, String str2);

        void onRealtimeTranscriberStopped(String str, String str2, int i4);

        void onReceiveTranscriberMessage(String str, TranscriberMessage transcriberMessage);
    }

    public static class TranscriberMessage {
        public boolean isCompleted;
        public String segmentId;
        public String sourceText;
        public String speakerUserId;
        public long timestamp;
        public Map<String, String> translationTexts;
    }

    public static class TranscriberParams {
        public String sourceLanguage;
        public String transcriberRobotId;
        public List<String> translationLanguages;
        public List<String> userIdsToTranscribe;
    }

    void addListener(AITranscriberListener aITranscriberListener);

    void pauseReceivingMessage();

    void removeListener(AITranscriberListener aITranscriberListener);

    void resumeReceivingMessage();

    void startRealtimeTranscriber(TranscriberParams transcriberParams);

    void stopRealtimeTranscriber(String str);
}
