package com.google.android.libraries.places.internal;

import androidx.annotation.q0;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzdv {

    @q0
    private zza[] addressComponents;

    @q0
    private String businessStatus;

    @q0
    private String formattedAddress;

    @q0
    private zzb geometry;

    @q0
    private String icon;

    @q0
    private String iconBackgroundColor;

    @q0
    private String iconMaskBaseUri;

    @q0
    private String internationalPhoneNumber;

    @q0
    private String name;

    @q0
    private zzc openingHours;

    @q0
    private zzd[] photos;

    @q0
    private String placeId;

    @q0
    private zze plusCode;

    @q0
    private Integer priceLevel;

    @q0
    private Double rating;

    @q0
    private String[] types;

    @q0
    private Integer userRatingsTotal;

    @q0
    private Integer utcOffset;

    @q0
    private String website;

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zza {

        @q0
        private String longName;

        @q0
        private String shortName;

        @q0
        private String[] types;

        zza() {
        }

        @q0
        final zzhs zza() {
            String[] strArr = this.types;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }

        @q0
        final String zzb() {
            return this.longName;
        }

        @q0
        final String zzc() {
            return this.shortName;
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zzb {

        @q0
        private zza location;

        @q0
        private C0798zzb viewport;

        /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
        class zza {

            @q0
            private Double lat;

            @q0
            private Double lng;

            zza() {
            }

            @q0
            final Double zza() {
                return this.lat;
            }

            @q0
            final Double zzb() {
                return this.lng;
            }
        }

        /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
        /* renamed from: com.google.android.libraries.places.internal.zzdv$zzb$zzb, reason: collision with other inner class name */
        class C0798zzb {

            @q0
            private zza northeast;

            @q0
            private zza southwest;

            C0798zzb() {
            }

            @q0
            final zza zza() {
                return this.northeast;
            }

            @q0
            final zza zzb() {
                return this.southwest;
            }
        }

        zzb() {
        }

        @q0
        final zza zza() {
            return this.location;
        }

        @q0
        final C0798zzb zzb() {
            return this.viewport;
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zzc {

        @q0
        private zza[] periods;

        @q0
        private String[] weekdayText;

        /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
        class zza {

            @q0
            private zzb close;

            @q0
            private zzb open;

            zza() {
            }

            @q0
            final zzb zza() {
                return this.close;
            }

            @q0
            final zzb zzb() {
                return this.open;
            }
        }

        /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
        class zzb {

            @q0
            private Integer day;

            @q0
            private String time;

            zzb() {
            }

            @q0
            final Integer zza() {
                return this.day;
            }

            @q0
            final String zzb() {
                return this.time;
            }
        }

        zzc() {
        }

        @q0
        final zzhs zza() {
            zza[] zzaVarArr = this.periods;
            if (zzaVarArr != null) {
                return zzhs.zzl(zzaVarArr);
            }
            return null;
        }

        @q0
        final zzhs zzb() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zzd {

        @q0
        private Integer height;

        @q0
        private String[] htmlAttributions;

        @q0
        private String photoReference;

        @q0
        private Integer width;

        zzd() {
        }

        @q0
        final zzhs zza() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return zzhs.zzl(strArr);
            }
            return null;
        }

        @q0
        final Integer zzb() {
            return this.height;
        }

        @q0
        final Integer zzc() {
            return this.width;
        }

        @q0
        final String zzd() {
            return this.photoReference;
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    class zze {

        @q0
        private String compoundCode;

        @q0
        private String globalCode;

        zze() {
        }

        @q0
        final String zza() {
            return this.compoundCode;
        }

        @q0
        final String zzb() {
            return this.globalCode;
        }
    }

    zzdv() {
    }

    @q0
    final zzb zza() {
        return this.geometry;
    }

    @q0
    final zzc zzb() {
        return this.openingHours;
    }

    @q0
    final zze zzc() {
        return this.plusCode;
    }

    @q0
    final zzhs zzd() {
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr != null) {
            return zzhs.zzl(zzaVarArr);
        }
        return null;
    }

    @q0
    final zzhs zze() {
        zzd[] zzdVarArr = this.photos;
        if (zzdVarArr != null) {
            return zzhs.zzl(zzdVarArr);
        }
        return null;
    }

    @q0
    final zzhs zzf() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzhs.zzl(strArr);
        }
        return null;
    }

    @q0
    final Double zzg() {
        return this.rating;
    }

    @q0
    final Integer zzh() {
        return this.priceLevel;
    }

    @q0
    final Integer zzi() {
        return this.userRatingsTotal;
    }

    @q0
    final Integer zzj() {
        return this.utcOffset;
    }

    @q0
    final String zzk() {
        return this.businessStatus;
    }

    @q0
    final String zzl() {
        return this.formattedAddress;
    }

    @q0
    final String zzm() {
        return this.iconBackgroundColor;
    }

    @q0
    final String zzn() {
        return this.iconMaskBaseUri;
    }

    @q0
    final String zzo() {
        return this.internationalPhoneNumber;
    }

    @q0
    final String zzp() {
        return this.name;
    }

    @q0
    final String zzq() {
        return this.placeId;
    }

    @q0
    final String zzr() {
        return this.website;
    }
}
