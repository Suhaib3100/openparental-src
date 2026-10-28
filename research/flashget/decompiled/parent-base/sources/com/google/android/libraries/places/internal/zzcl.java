package com.google.android.libraries.places.internal;

import androidx.annotation.q0;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzcl {

    @q0
    private String description;

    @q0
    private Integer distanceMeters;

    @q0
    private zzb[] matchedSubstrings;

    @q0
    private String placeId;

    @q0
    private zza structuredFormatting;

    @q0
    private String[] types;

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zza {

        @q0
        private String mainText;

        @q0
        private zzb[] mainTextMatchedSubstrings;

        @q0
        private String secondaryText;

        @q0
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        @q0
        final zzhs zza() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zzhs.zzl(zzbVarArr);
            }
            return null;
        }

        @q0
        final zzhs zzb() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zzhs.zzl(zzbVarArr);
            }
            return null;
        }

        @q0
        final String zzc() {
            return this.mainText;
        }

        @q0
        final String zzd() {
            return this.secondaryText;
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zzb {

        @q0
        Integer length;

        @q0
        Integer offset;

        zzb() {
        }
    }

    zzcl() {
    }

    @q0
    final zza zza() {
        return this.structuredFormatting;
    }

    @q0
    final zzhs zzb() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        if (zzbVarArr != null) {
            return zzhs.zzl(zzbVarArr);
        }
        return null;
    }

    @q0
    final zzhs zzc() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzhs.zzl(strArr);
        }
        return null;
    }

    @q0
    final Integer zzd() {
        return this.distanceMeters;
    }

    @q0
    final String zze() {
        return this.description;
    }

    @q0
    final String zzf() {
        return this.placeId;
    }
}
