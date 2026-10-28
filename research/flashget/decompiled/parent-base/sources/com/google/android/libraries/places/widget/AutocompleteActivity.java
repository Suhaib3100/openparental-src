package com.google.android.libraries.places.widget;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.appcompat.app.AppCompatActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;

    @m1
    static boolean zza = true;

    @j0
    private int zzb;

    @h1
    private int zzc;
    private boolean zzd;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
        this.zzd = false;
    }

    private final void zzc(int i4, @q0 Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra(ProtectedSandApp.s("\uee42"), place);
            }
            intent.putExtra(ProtectedSandApp.s("\uee43"), status);
            setResult(i4, intent);
            finish();
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(@q0 Bundle bundle) {
        try {
            zzha.zzi(Places.isInitialized(), ProtectedSandApp.s("\uee44"));
            if (zza) {
                zzha.zzi(getCallingActivity() != null, ProtectedSandApp.s("\uee45"));
            }
            zzfl zzflVar = (zzfl) getIntent().getParcelableExtra(ProtectedSandApp.s("\uee46"));
            if (zzflVar == null) {
                throw null;
            }
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = zzflVar.zzh().ordinal();
            if (ordinal == 0) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzc = R.style.PlacesAutocompleteFullscreen;
            } else if (ordinal == 1) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzc = R.style.PlacesAutocompleteOverlay;
            }
            getSupportFragmentManager().W1(new com.google.android.libraries.places.widget.internal.ui.zzh(this.zzb, this, zzflVar));
            setTheme(this.zzc);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().r0(R.id.places_autocomplete_content);
            zzha.zzh(autocompleteImplFragment != null);
            autocompleteImplFragment.zzh(this);
            final View findViewById = findViewById(android.R.id.content);
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AutocompleteActivity.this.zzb(autocompleteImplFragment, findViewById, view, motionEvent);
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteActivity.this.zza(view);
                }
            });
            if (zzflVar.zzj().isEmpty()) {
                zzc(2, null, new Status(PlacesStatusCodes.INVALID_REQUEST, ProtectedSandApp.s("\uee47")));
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

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) {
        zzc(-1, place, Status.RESULT_SUCCESS);
    }

    final /* synthetic */ void zza(View view) {
        if (this.zzd) {
            zzc(0, null, new Status(16));
        }
    }

    final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzd = false;
        if (autocompleteImplFragment.getView() == null || motionEvent.getY() <= r1.getBottom()) {
            return false;
        }
        this.zzd = true;
        view.performClick();
        return true;
    }
}
