package com.google.android.libraries.places.widget;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.internal.zzhs;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public class AutocompleteFragment extends Fragment {
    private View zza;
    private View zzb;
    private EditText zzc;

    @q0
    private LocationBias zzd;

    @q0
    private LocationRestriction zze;

    @q0
    private String zzf;

    @q0
    private TypeFilter zzg;

    @q0
    private zzhs zzh;

    @q0
    private PlaceSelectionListener zzi;

    private final void zzb() {
        this.zzb.setVisibility(true != this.zzc.getText().toString().isEmpty() ? 0 : 8);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i4, int i5, @q0 Intent intent) {
        try {
            getView().setEnabled(true);
            if (i4 == 30421) {
                if (this.zzi == null) {
                    Log.isLoggable(ProtectedSandApp.s("\uee48"), 5);
                } else if (i5 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i5 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                    i5 = 2;
                }
                i4 = 30421;
            }
            super.onActivityResult(i4, i5, intent);
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

    @Override // android.app.Fragment
    @RecentlyNonNull
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(R.layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = inflate.findViewById(R.id.places_autocomplete_search_button);
            this.zzb = inflate.findViewById(R.id.places_autocomplete_clear_button);
            this.zzc = (EditText) inflate.findViewById(R.id.places_autocomplete_search_input);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteFragment.this.zza(view);
                }
            };
            this.zza.setOnClickListener(onClickListener);
            this.zzc.setOnClickListener(onClickListener);
            this.zzb.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteFragment.this.setText("");
                }
            });
            zzb();
            inflate.setEnabled(false);
            return inflate;
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public void setCountry(@q0 String str) {
        this.zzf = str;
    }

    public void setHint(@q0 CharSequence charSequence) {
        if (charSequence == null) {
            try {
                charSequence = getString(R.string.places_autocomplete_search_hint);
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
        this.zzc.setHint(charSequence);
        this.zza.setContentDescription(charSequence);
    }

    public void setLocationBias(@q0 LocationBias locationBias) {
        this.zzd = locationBias;
    }

    public void setLocationRestriction(@q0 LocationRestriction locationRestriction) {
        this.zze = locationRestriction;
    }

    public void setOnPlaceSelectedListener(@q0 PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public void setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        try {
            zzha.zzc(list, ProtectedSandApp.s("\uee49"));
            this.zzh = zzhs.zzk(list);
            getView().setEnabled(true);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public void setText(@q0 CharSequence charSequence) {
        try {
            this.zzc.setText(charSequence);
            zzb();
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public void setTypeFilter(@q0 TypeFilter typeFilter) {
        this.zzg = typeFilter;
    }

    final /* synthetic */ void zza(View view) {
        if (!getView().isEnabled()) {
            zzha.zzc(this.zzh, ProtectedSandApp.s("\uee4a"));
            Log.isLoggable(ProtectedSandApp.s("\uee48"), 6);
            return;
        }
        Autocomplete.IntentBuilder intentBuilder = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, this.zzh);
        intentBuilder.setInitialQuery(this.zzc.getText().toString());
        intentBuilder.setHint(this.zzc.getHint().toString());
        intentBuilder.setCountry(this.zzf);
        intentBuilder.setLocationBias(this.zzd);
        intentBuilder.setLocationRestriction(this.zze);
        intentBuilder.setTypeFilter(this.zzg);
        intentBuilder.zza(zzfj.zza);
        Intent build = intentBuilder.build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(build, 30421);
    }
}
