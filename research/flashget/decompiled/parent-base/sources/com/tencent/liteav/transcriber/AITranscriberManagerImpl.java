package com.tencent.liteav.transcriber;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.transcriber.AITranscriberManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@JNINamespace("liteav::manager")
/* loaded from: classes7.dex */
public class AITranscriberManagerImpl implements AITranscriberManager {
    private static final String TAG = ProtectedSandApp.s("呟\u0001");
    private TranscriberListenerWrapper mListenerDispatcher = new TranscriberListenerWrapper();
    private long mNativeAITranscriberManagerJni;

    static class TranscriberListenerWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final List<AITranscriberManager.AITranscriberListener> f72058a = new ArrayList();

        TranscriberListenerWrapper() {
        }

        public final boolean a(AITranscriberManager.AITranscriberListener aITranscriberListener) {
            boolean z4;
            if (aITranscriberListener == null) {
                return false;
            }
            synchronized (this) {
                try {
                    if (!this.f72058a.contains(aITranscriberListener)) {
                        this.f72058a.add(aITranscriberListener);
                    }
                    z4 = this.f72058a.size() > 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z4;
        }

        public final boolean b(AITranscriberManager.AITranscriberListener aITranscriberListener) {
            boolean z4;
            synchronized (this) {
                this.f72058a.remove(aITranscriberListener);
                z4 = this.f72058a.size() == 0;
            }
            return z4;
        }

        public void onRealtimeTranscriberError(String str, String str2, int i4, String str3) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f72058a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AITranscriberManager.AITranscriberListener aITranscriberListener = (AITranscriberManager.AITranscriberListener) it.next();
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberError(str, str2, i4, str3);
                }
            }
        }

        public void onRealtimeTranscriberStarted(String str, String str2) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f72058a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AITranscriberManager.AITranscriberListener aITranscriberListener = (AITranscriberManager.AITranscriberListener) it.next();
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberStarted(str, str2);
                }
            }
        }

        public void onRealtimeTranscriberStopped(String str, String str2, int i4) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f72058a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AITranscriberManager.AITranscriberListener aITranscriberListener = (AITranscriberManager.AITranscriberListener) it.next();
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberStopped(str, str2, i4);
                }
            }
        }

        public void onReceiveTranscriberMessage(String str, AITranscriberManager.TranscriberMessage transcriberMessage) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f72058a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AITranscriberManager.AITranscriberListener aITranscriberListener = (AITranscriberManager.AITranscriberListener) it.next();
                if (aITranscriberListener != null) {
                    aITranscriberListener.onReceiveTranscriberMessage(str, transcriberMessage);
                }
            }
        }
    }

    static class TranscriberMessageWrapper {
        TranscriberMessageWrapper() {
        }

        public static AITranscriberManager.TranscriberMessage constructor() {
            return new AITranscriberManager.TranscriberMessage();
        }

        public static void putTranslationText(AITranscriberManager.TranscriberMessage transcriberMessage, String str, String str2) {
            if (transcriberMessage.translationTexts == null) {
                transcriberMessage.translationTexts = new HashMap();
            }
            transcriberMessage.translationTexts.put(str, str2);
        }

        public static void setIsCompleted(AITranscriberManager.TranscriberMessage transcriberMessage, boolean z4) {
            transcriberMessage.isCompleted = z4;
        }

        public static void setSegmentId(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.segmentId = str;
        }

        public static void setSourceText(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.sourceText = str;
        }

        public static void setSpeakerUserId(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.speakerUserId = str;
        }

        public static void setTimestamp(AITranscriberManager.TranscriberMessage transcriberMessage, long j4) {
            transcriberMessage.timestamp = j4;
        }
    }

    static class TranscriberParamsWrapper {

        /* renamed from: a, reason: collision with root package name */
        private AITranscriberManager.TranscriberParams f72059a;

        public TranscriberParamsWrapper(AITranscriberManager.TranscriberParams transcriberParams) {
            this.f72059a = transcriberParams;
        }

        public String getSourceLanguage() {
            return this.f72059a.sourceLanguage;
        }

        public String getTranscriberRobotId() {
            return this.f72059a.transcriberRobotId;
        }

        public String[] getTranslationLanguages() {
            List<String> list = this.f72059a.translationLanguages;
            if (list == null) {
                return null;
            }
            return (String[]) list.toArray(new String[0]);
        }

        public String[] getUserIdsToTranscribe() {
            List<String> list = this.f72059a.userIdsToTranscribe;
            if (list == null) {
                return null;
            }
            return (String[]) list.toArray(new String[0]);
        }
    }

    public AITranscriberManagerImpl(long j4) {
        this.mNativeAITranscriberManagerJni = 0L;
        this.mNativeAITranscriberManagerJni = j4;
    }

    private static native void nativeDestroy(long j4);

    private static native void nativePauseReceivingMessage(long j4);

    private static native void nativeResumeReceivingMessage(long j4);

    private static native void nativeSetListener(long j4, TranscriberListenerWrapper transcriberListenerWrapper);

    private static native void nativeStartRealtimeTranscriber(long j4, TranscriberParamsWrapper transcriberParamsWrapper);

    private static native void nativeStopRealtimeTranscriber(long j4, String str);

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void addListener(AITranscriberManager.AITranscriberListener aITranscriberListener) {
        if (aITranscriberListener != null && this.mListenerDispatcher.a(aITranscriberListener)) {
            long j4 = this.mNativeAITranscriberManagerJni;
            if (j4 != 0) {
                nativeSetListener(j4, this.mListenerDispatcher);
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativeAITranscriberManagerJni;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeAITranscriberManagerJni = 0L;
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void pauseReceivingMessage() {
        long j4 = this.mNativeAITranscriberManagerJni;
        if (j4 != 0) {
            nativePauseReceivingMessage(j4);
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void removeListener(AITranscriberManager.AITranscriberListener aITranscriberListener) {
        if (aITranscriberListener != null && this.mListenerDispatcher.b(aITranscriberListener)) {
            long j4 = this.mNativeAITranscriberManagerJni;
            if (j4 != 0) {
                nativeSetListener(j4, null);
            }
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void resumeReceivingMessage() {
        long j4 = this.mNativeAITranscriberManagerJni;
        if (j4 != 0) {
            nativeResumeReceivingMessage(j4);
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void startRealtimeTranscriber(AITranscriberManager.TranscriberParams transcriberParams) {
        long j4 = this.mNativeAITranscriberManagerJni;
        if (j4 == 0 || transcriberParams == null) {
            return;
        }
        nativeStartRealtimeTranscriber(j4, new TranscriberParamsWrapper(transcriberParams));
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void stopRealtimeTranscriber(String str) {
        long j4 = this.mNativeAITranscriberManagerJni;
        if (j4 == 0 || str == null) {
            return;
        }
        nativeStopRealtimeTranscriber(j4, str);
    }
}
