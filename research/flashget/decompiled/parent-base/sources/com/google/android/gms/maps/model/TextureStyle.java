package com.google.android.gms.maps.model;

import androidx.annotation.o0;
import com.google.android.gms.maps.model.StampStyle;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class TextureStyle extends StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        @o0
        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @o0
        protected final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        /* synthetic */ Builder(zzac zzacVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @o0
        /* renamed from: self, reason: avoid collision after fix types in other method */
        protected Builder self2() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzad zzadVar) {
        super(bitmapDescriptor);
    }

    @o0
    public static Builder newBuilder(@o0 BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
