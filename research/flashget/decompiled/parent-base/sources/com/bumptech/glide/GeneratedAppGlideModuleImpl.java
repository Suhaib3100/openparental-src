package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.manager.o;
import com.flashget.kid.common.imageloader.glide.MyAppGlideMode;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a, reason: collision with root package name */
    private final MyAppGlideMode f42777a = new MyAppGlideMode();

    public GeneratedAppGlideModuleImpl(Context context) {
        Log.isLoggable(ProtectedSandApp.s("\u07fb"), 3);
    }

    @Override // com.bumptech.glide.module.a, com.bumptech.glide.module.b
    public void a(@o0 Context context, @o0 d dVar) {
        this.f42777a.a(context, dVar);
    }

    @Override // com.bumptech.glide.module.d, com.bumptech.glide.module.f
    public void b(@o0 Context context, @o0 c cVar, @o0 Registry registry) {
        new com.github.penfeizhou.animation.glide.e().b(context, cVar, registry);
        this.f42777a.getClass();
    }

    @Override // com.bumptech.glide.module.a
    public boolean c() {
        this.f42777a.getClass();
        return false;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @o0
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @o0
    o.b e() {
        return new a();
    }

    @o0
    a f() {
        return new a();
    }
}
