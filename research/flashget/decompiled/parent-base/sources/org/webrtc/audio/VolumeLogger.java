package org.webrtc.audio;

import android.media.AudioManager;
import androidx.annotation.q0;
import androidx.work.i0;
import com.flashget.commonx.billing.ui.v;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.log4j.Logger;

/* loaded from: classes9.dex */
class VolumeLogger {
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;

    @q0
    private Timer timer;
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final Logger logger = Logger.getLogger("VolumeLogger");

    private class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        LogVolumeTask(int i4, int i5) {
            this.maxRingVolume = i4;
            this.maxVoiceCallVolume = i5;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                VolumeLogger.logger.debug("STREAM_RING stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                return;
            }
            if (mode == 3) {
                VolumeLogger.logger.debug("VOICE_CALL stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logger logger2 = logger;
        v.a(new StringBuilder("start"), WebRtcAudioUtils.getThreadInfo(), logger2);
        if (this.timer != null) {
            return;
        }
        logger2.debug("audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer("WebRtcVolumeLevelLoggerThread");
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, i0.f35989d);
    }

    public void stop() {
        v.a(new StringBuilder("stop"), WebRtcAudioUtils.getThreadInfo(), logger);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
