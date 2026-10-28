package com.google.android.gms.common.api.internal;

import androidx.annotation.n1;
import androidx.annotation.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@n1
/* loaded from: classes2.dex */
public interface zacs {
    void zae(ConnectionResult connectionResult);

    void zaf(@q0 IAccountAccessor iAccountAccessor, @q0 Set<Scope> set);
}
