package com.google.android.gms.common.moduleinstall;

import androidx.annotation.o0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @o0
    Task<ModuleAvailabilityResponse> areModulesAvailable(@o0 OptionalModuleApi... optionalModuleApiArr);

    @o0
    Task<Void> deferredInstall(@o0 OptionalModuleApi... optionalModuleApiArr);

    @o0
    Task<ModuleInstallIntentResponse> getInstallModulesIntent(@o0 OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    @o0
    Task<ModuleInstallResponse> installModules(@o0 ModuleInstallRequest moduleInstallRequest);

    @o0
    Task<Void> releaseModules(@o0 OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    @o0
    Task<Boolean> unregisterListener(@o0 InstallStatusListener installStatusListener);
}
