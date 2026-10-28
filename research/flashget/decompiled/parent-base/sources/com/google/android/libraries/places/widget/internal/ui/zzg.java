package com.google.android.libraries.places.widget.internal.ui;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzgf;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzg extends RecyclerView.s {
    final /* synthetic */ AutocompleteImplFragment zza;

    zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        zzgf zzgfVar;
        EditText editText;
        if (i4 == 1) {
            try {
                zzgfVar = this.zza.zze;
                zzgfVar.zzg();
                editText = this.zza.zzg;
                editText.clearFocus();
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
    }
}
