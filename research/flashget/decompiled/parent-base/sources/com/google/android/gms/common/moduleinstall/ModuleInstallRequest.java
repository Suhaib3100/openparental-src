package com.google.android.gms.common.moduleinstall;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import f9.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class ModuleInstallRequest {
    private final List zaa;

    @q0
    private final InstallStatusListener zab;

    @q0
    private final Executor zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class Builder {
        private final List zaa = new ArrayList();

        @q0
        private InstallStatusListener zab;

        @q0
        private Executor zac;

        @o0
        @a
        public Builder addApi(@o0 OptionalModuleApi optionalModuleApi) {
            this.zaa.add(optionalModuleApi);
            return this;
        }

        @o0
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.zab, this.zac, true, null);
        }

        @o0
        @a
        public Builder setListener(@o0 InstallStatusListener installStatusListener, @q0 Executor executor) {
            this.zab = installStatusListener;
            this.zac = executor;
            return this;
        }

        @o0
        @a
        public Builder setListener(@o0 InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, null);
        }
    }

    /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean z4, zac zacVar) {
        Preconditions.checkNotNull(list, ProtectedSandApp.s("쭨"));
        Preconditions.checkArgument(!list.isEmpty(), ProtectedSandApp.s("쭩"));
        if (executor != null) {
            Preconditions.checkNotNull(installStatusListener, ProtectedSandApp.s("쭪"));
        }
        this.zaa = list;
        this.zab = installStatusListener;
        this.zac = executor;
    }

    @o0
    public static Builder newBuilder() {
        return new Builder();
    }

    @o0
    public List<OptionalModuleApi> getApis() {
        return this.zaa;
    }

    @q0
    public InstallStatusListener getListener() {
        return this.zab;
    }

    @q0
    public Executor getListenerExecutor() {
        return this.zac;
    }
}
