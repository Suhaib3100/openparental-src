package com.google.android.libraries.places.widget.internal.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.q0;
import androidx.recyclerview.widget.u;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzev;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzr extends u {
    private int zza;
    private boolean zzb;
    private final zze zzc;

    public zzr(zze zzeVar, byte[] bArr) {
        super(new zzq(null));
        this.zzb = true;
        this.zzc = zzeVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void submitList(@q0 List list) {
        try {
            int i4 = 0;
            this.zzb = (this.zza != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                i4 = list.size();
            }
            this.zza = i4;
            super.submitList(list);
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzs onCreateViewHolder(ViewGroup viewGroup, int i4) {
        try {
            return new zzs(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false), null);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzs zzsVar, int i4) {
        try {
            zzsVar.zza((AutocompletePrediction) getItem(i4), this.zzb);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }
}
