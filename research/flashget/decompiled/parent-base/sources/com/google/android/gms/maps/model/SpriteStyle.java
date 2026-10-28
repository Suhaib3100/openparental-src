package com.google.android.gms.maps.model;

import androidx.annotation.o0;
import com.google.android.gms.maps.model.StampStyle;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class SpriteStyle extends StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        @o0
        public SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @o0
        protected Builder self() {
            return this;
        }

        /* synthetic */ Builder(zzs zzsVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @o0
        protected final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }
    }

    public SpriteStyle(@o0 BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    @o0
    public static Builder newBuilder(@o0 BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
