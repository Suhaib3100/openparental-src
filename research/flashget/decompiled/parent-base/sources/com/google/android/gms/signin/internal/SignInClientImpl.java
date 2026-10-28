package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab;
    private final ClientSettings zac;
    private final Bundle zad;

    @q0
    private final Integer zae;

    public SignInClientImpl(@o0 Context context, @o0 Looper looper, boolean z4, @o0 ClientSettings clientSettings, @o0 Bundle bundle, @o0 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @o0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zab = true;
        this.zac = clientSettings;
        this.zad = bundle;
        this.zae = clientSettings.zab();
    }

    @o0
    @KeepForSdk
    public static Bundle createBundleFromClientSettings(@o0 ClientSettings clientSettings) {
        clientSettings.zaa();
        Integer zab = clientSettings.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("\ue4e3"), clientSettings.getAccount());
        if (zab != null) {
            bundle.putInt(ProtectedSandApp.s("\ue4e4"), zab.intValue());
        }
        bundle.putBoolean(ProtectedSandApp.s("\ue4e5"), false);
        bundle.putBoolean(ProtectedSandApp.s("\ue4e6"), false);
        bundle.putString(ProtectedSandApp.s("\ue4e7"), null);
        bundle.putBoolean(ProtectedSandApp.s("\ue4e8"), true);
        bundle.putBoolean(ProtectedSandApp.s("\ue4e9"), false);
        bundle.putString(ProtectedSandApp.s("\ue4ea"), null);
        bundle.putString(ProtectedSandApp.s("\ue4eb"), null);
        bundle.putBoolean(ProtectedSandApp.s("\ue4ec"), false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0
    protected final /* synthetic */ IInterface createServiceInterface(@o0 IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("\ue4ed"));
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zac.getRealClientPackageName())) {
            this.zad.putString(ProtectedSandApp.s("\ue4ee"), this.zac.getRealClientPackageName());
        }
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0
    protected final String getServiceDescriptor() {
        return ProtectedSandApp.s("\ue4ed");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0
    protected final String getStartServiceAction() {
        return ProtectedSandApp.s("\ue4ef");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.zab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zaa() {
        try {
            ((zaf) getService()).zae(((Integer) Preconditions.checkNotNull(this.zae)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zac(@o0 IAccountAccessor iAccountAccessor, boolean z4) {
        try {
            ((zaf) getService()).zaf(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.zae)).intValue(), z4);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zad(zae zaeVar) {
        Preconditions.checkNotNull(zaeVar, ProtectedSandApp.s("\ue4f0"));
        try {
            Account accountOrDefault = this.zac.getAccountOrDefault();
            ((zaf) getService()).zag(new zai(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.zae)).intValue(), ProtectedSandApp.s("\ue4f1").equals(accountOrDefault.name) ? Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount() : null)), zaeVar);
        } catch (RemoteException e4) {
            try {
                zaeVar.zab(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf(ProtectedSandApp.s("\ue4f2"), ProtectedSandApp.s("\ue4f3"), e4);
            }
        }
    }
}
