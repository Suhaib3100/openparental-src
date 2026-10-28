package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.view.o0;
import androidx.view.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzfk;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzhs;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final o0 zza;
    private final o0 zzb;
    private zzfk zzc;

    @q0
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
        this.zza = new o0();
        this.zzb = new o0();
        this.zzc = zzfl.zzm(AutocompleteActivityMode.OVERLAY, zzhs.zzm(), zzfj.zza);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    static /* synthetic */ void zzd(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    private final void zze() {
        Intent build = new Autocomplete.IntentBuilder(this.zzc.zzl()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    private final void zzf(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.f()) ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, @q0 Intent intent) {
        if (i4 == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                String s4 = ProtectedSandApp.s("\uee4b");
                if (placeSelectionListener == null) {
                    Log.isLoggable(s4, 5);
                    return;
                }
                if (intent == null) {
                    Log.isLoggable(s4, 6);
                } else {
                    if (i5 != -1) {
                        placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                        return;
                    }
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                }
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
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzfl zzflVar = (zzfl) bundle.getParcelable(ProtectedSandApp.s("\uee4c"));
                if (zzflVar == null) {
                    return;
                }
                if (this.zza.f() == 0) {
                    this.zza.o(zzflVar.zzl());
                }
                if (this.zzb.f() == 0) {
                    this.zzb.o(zzflVar.zzk());
                }
                this.zzc = zzflVar.zzg();
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
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable(ProtectedSandApp.s("\uee4c"), this.zzc.zzl());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@RecentlyNonNull View view, @q0 Bundle bundle) {
        final View findViewById = view.findViewById(R.id.places_autocomplete_search_button);
        final View findViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zza(view2);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zzb(view2);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.setText(null);
            }
        });
        zzf(findViewById2);
        this.zza.k(getViewLifecycleOwner(), new p0() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // androidx.view.p0
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.this.zzc(editText, findViewById2, (CharSequence) obj);
            }
        });
        this.zzb.k(getViewLifecycleOwner(), new p0() { // from class: com.google.android.libraries.places.widget.zzh
            @Override // androidx.view.p0
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.zzd(editText, findViewById, (CharSequence) obj);
            }
        });
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzf(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zza(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountry(@q0 String str) {
        this.zzc.zzm(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(@q0 CharSequence charSequence) {
        try {
            if (charSequence == null) {
                String string = getString(R.string.places_autocomplete_search_hint);
                this.zzc.zzb(string);
                this.zzb.o(string);
            } else {
                this.zzc.zzb(charSequence.toString());
                this.zzb.o(charSequence);
            }
            return this;
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

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(@q0 LocationBias locationBias) {
        this.zzc.zzd(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(@q0 LocationRestriction locationRestriction) {
        this.zzc.zze(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(@q0 PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzh(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(@q0 CharSequence charSequence) {
        try {
            this.zzc.zzc(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.o(charSequence);
            return this;
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypeFilter(@q0 TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    final /* synthetic */ void zza(View view) {
        zze();
    }

    final /* synthetic */ void zzb(View view) {
        zze();
    }

    final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzf(view);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zza(zzhs.zzl(strArr));
        return this;
    }
}
