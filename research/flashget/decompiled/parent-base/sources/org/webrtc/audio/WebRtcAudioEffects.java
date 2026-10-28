package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import androidx.annotation.q0;
import com.flashget.commonx.billing.ui.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.UUID;
import org.apache.log4j.Logger;

/* loaded from: classes9.dex */
class WebRtcAudioEffects {
    private static final boolean DEBUG = false;

    @q0
    private static AudioEffect.Descriptor[] cachedEffects;

    @q0
    private AcousticEchoCanceler aec;

    @q0
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;
    private static final String TAG = ProtectedSandApp.s("ꔒ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꔒ\u0001"));
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString(ProtectedSandApp.s("ꔓ\u0001"));
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString(ProtectedSandApp.s("ꔔ\u0001"));

    public WebRtcAudioEffects() {
        v.a(new StringBuilder(ProtectedSandApp.s("ꔕ\u0001")), WebRtcAudioUtils.getThreadInfo(), logger);
    }

    private static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError(ProtectedSandApp.s("ꔖ\u0001"));
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    @q0
    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !r4.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i4) {
        Logger logger2 = logger;
        com.flashget.commonx.billing.h.a(ProtectedSandApp.s("ꔗ\u0001"), i4, ProtectedSandApp.s("ꔘ\u0001"), logger2);
        boolean z4 = false;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        boolean isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String s4 = ProtectedSandApp.s("ꔙ\u0001");
        String s5 = ProtectedSandApp.s("ꔚ\u0001");
        String s6 = ProtectedSandApp.s("ꔛ\u0001");
        String s7 = ProtectedSandApp.s("ꔜ\u0001");
        if (isAcousticEchoCancelerSupported) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i4);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z5 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z5) != 0) {
                    logger2.error(ProtectedSandApp.s("ꔝ\u0001"));
                }
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꔞ\u0001"));
                sb.append(enabled ? s7 : s6);
                sb.append(s5);
                sb.append(z5);
                sb.append(s4);
                v.a(sb, this.aec.getEnabled() ? s7 : s6, logger2);
            } else {
                logger2.error(ProtectedSandApp.s("ꔟ\u0001"));
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i4);
            this.ns = create2;
            if (create2 == null) {
                logger2.error(ProtectedSandApp.s("ꔢ\u0001"));
                return;
            }
            boolean enabled2 = create2.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z4 = true;
            }
            if (this.ns.setEnabled(z4) != 0) {
                logger2.error(ProtectedSandApp.s("ꔠ\u0001"));
            }
            StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("ꔡ\u0001"));
            sb2.append(enabled2 ? s7 : s6);
            sb2.append(s5);
            sb2.append(z4);
            sb2.append(s4);
            if (this.ns.getEnabled()) {
                s6 = s7;
            }
            v.a(sb2, s6, logger2);
        }
    }

    public void release() {
        logger.debug(ProtectedSandApp.s("ꔣ\u0001"));
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z4) {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꔤ\u0001") + z4 + ProtectedSandApp.s("ꔘ\u0001"));
        if (!isAcousticEchoCancelerSupported()) {
            logger2.warn(ProtectedSandApp.s("ꔥ\u0001"));
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z4 == this.shouldEnableAec) {
            this.shouldEnableAec = z4;
            return true;
        }
        logger2.error(ProtectedSandApp.s("ꔦ\u0001"));
        return false;
    }

    public boolean setNS(boolean z4) {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꔧ\u0001") + z4 + ProtectedSandApp.s("ꔘ\u0001"));
        if (!isNoiseSuppressorSupported()) {
            logger2.warn(ProtectedSandApp.s("ꔨ\u0001"));
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z4 == this.shouldEnableNs) {
            this.shouldEnableNs = z4;
            return true;
        }
        logger2.error(ProtectedSandApp.s("ꔩ\u0001"));
        return false;
    }
}
