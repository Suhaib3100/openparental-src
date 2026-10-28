package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public abstract class RequestParams extends AbstractSafeParcelable implements ReflectedParcelable {
    @o0
    public abstract Set<Uri> getAllAppIds();

    @o0
    public abstract Uri getAppId();

    @o0
    public abstract ChannelIdValue getChannelIdValue();

    @o0
    public abstract String getDisplayHint();

    @o0
    public abstract List<RegisteredKey> getRegisteredKeys();

    @o0
    public abstract Integer getRequestId();

    @o0
    public abstract Double getTimeoutSeconds();
}
