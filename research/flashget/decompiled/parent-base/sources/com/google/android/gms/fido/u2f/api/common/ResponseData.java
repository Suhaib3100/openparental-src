package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.o0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public abstract class ResponseData extends AbstractSafeParcelable implements ReflectedParcelable {
    @o0
    public abstract JSONObject toJsonObject();
}
