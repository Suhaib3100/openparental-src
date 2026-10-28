package com.google.android.gms.signin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zad {
    public static final Api.ClientKey zaa;

    @ShowFirstParty
    public static final Api.ClientKey zab;
    public static final Api.AbstractClientBuilder zac;
    static final Api.AbstractClientBuilder zad;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zab = clientKey2;
        zaa zaaVar = new zaa();
        zac = zaaVar;
        zab zabVar = new zab();
        zad = zabVar;
        zae = new Scope(ProtectedSandApp.s("\ue4f5"));
        zaf = new Scope(ProtectedSandApp.s("\ue4f6"));
        zag = new Api(ProtectedSandApp.s("\ue4f7"), zaaVar, clientKey);
        zah = new Api(ProtectedSandApp.s("\ue4f8"), zabVar, clientKey2);
    }
}
