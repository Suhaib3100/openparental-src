package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import androidx.annotation.q0;
import com.flashget.commonx.billing.h;
import com.flashget.commonx.billing.s;
import com.flashget.commonx.billing.ui.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.UUID;
import org.apache.log4j.Logger;

/* loaded from: classes9.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;

    @q0
    private static AudioEffect.Descriptor[] cachedEffects;

    @q0
    private AcousticEchoCanceler aec;

    @q0
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;
    private static final String TAG = ProtectedSandApp.s("ꔪ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꔪ\u0001"));
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString(ProtectedSandApp.s("ꔫ\u0001"));
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString(ProtectedSandApp.s("ꔬ\u0001"));

    private WebRtcAudioEffects() {
        logger.debug(ProtectedSandApp.s("ꔭ\u0001") + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError(ProtectedSandApp.s("ꔮ\u0001"));
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z4 = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        s.a(ProtectedSandApp.s("ꔯ\u0001"), z4, logger);
        return z4;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z4 = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        s.a(ProtectedSandApp.s("ꔰ\u0001"), z4, logger);
        return z4;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
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

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            logger.warn(str + ProtectedSandApp.s("ꔱ\u0001"));
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            logger.warn(str + ProtectedSandApp.s("ꔲ\u0001"));
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i4) {
        Logger logger2 = logger;
        h.a(ProtectedSandApp.s("ꔳ\u0001"), i4, ProtectedSandApp.s("ꔴ\u0001"), logger2);
        boolean z4 = false;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        boolean isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String s4 = ProtectedSandApp.s("ꔵ\u0001");
        String s5 = ProtectedSandApp.s("ꔶ\u0001");
        String s6 = ProtectedSandApp.s("ꔷ\u0001");
        String s7 = ProtectedSandApp.s("ꔸ\u0001");
        if (isAcousticEchoCancelerSupported) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i4);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z5 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z5) != 0) {
                    logger2.error(ProtectedSandApp.s("ꔹ\u0001"));
                }
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꔺ\u0001"));
                sb.append(enabled ? s7 : s6);
                sb.append(s5);
                sb.append(z5);
                sb.append(s4);
                v.a(sb, this.aec.getEnabled() ? s7 : s6, logger2);
            } else {
                logger2.error(ProtectedSandApp.s("ꔻ\u0001"));
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i4);
            this.ns = create2;
            if (create2 == null) {
                logger2.error(ProtectedSandApp.s("ꔾ\u0001"));
                return;
            }
            boolean enabled2 = create2.getEnabled();
            if (this.shouldEnableNs && canUseNoiseSuppressor()) {
                z4 = true;
            }
            if (this.ns.setEnabled(z4) != 0) {
                logger2.error(ProtectedSandApp.s("ꔼ\u0001"));
            }
            StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("ꔽ\u0001"));
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
        logger.debug(ProtectedSandApp.s("ꔿ\u0001"));
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
        logger2.debug(ProtectedSandApp.s("ꕀ\u0001") + z4 + ProtectedSandApp.s("ꔴ\u0001"));
        if (!canUseAcousticEchoCanceler()) {
            logger2.warn(ProtectedSandApp.s("ꕁ\u0001"));
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z4 == this.shouldEnableAec) {
            this.shouldEnableAec = z4;
            return true;
        }
        logger2.error(ProtectedSandApp.s("ꕂ\u0001"));
        return false;
    }

    public boolean setNS(boolean z4) {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꕃ\u0001") + z4 + ProtectedSandApp.s("ꔴ\u0001"));
        if (!canUseNoiseSuppressor()) {
            logger2.warn(ProtectedSandApp.s("ꕄ\u0001"));
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z4 == this.shouldEnableNs) {
            this.shouldEnableNs = z4;
            return true;
        }
        logger2.error(ProtectedSandApp.s("ꕅ\u0001"));
        return false;
    }
}
