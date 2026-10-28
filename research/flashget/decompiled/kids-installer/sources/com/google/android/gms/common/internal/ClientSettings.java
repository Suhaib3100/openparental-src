package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ClientSettings {

    @Nullable
    private final Account zaa;
    private final Set<Scope> zab;
    private final Set<Scope> zac;
    private final Map<Api<?>, zab> zad;
    private final int zae;

    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static final class Builder {

        @Nullable
        private Account zaa;
        private b<Scope> zab;
        private String zac;
        private String zad;
        private SignInOptions zae = SignInOptions.zaa;

        @o0
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @o0
        @KeepForSdk
        public Builder setRealClientPackageName(@o0 String str) {
            this.zac = str;
            return this;
        }

        @o0
        public final Builder zaa(@o0 Collection<Scope> collection) {
            if (this.zab == null) {
                this.zab = new b<>();
            }
            this.zab.addAll(collection);
            return this;
        }

        @o0
        public final Builder zab(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        @o0
        public final Builder zac(@o0 String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@o0 Account account, @o0 Set<Scope> set, @o0 Map<Api<?>, zab> map, int i5, @Nullable View view, @o0 String str, @o0 String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i5, view, str, str2, signInOptions, false);
    }

    @o0
    @KeepForSdk
    public static ClientSettings createDefault(@o0 Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @q0
    @KeepForSdk
    public Account getAccount() {
        return this.zaa;
    }

    @q0
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @o0
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account(ProtectedSandApp.s("ୟ"), ProtectedSandApp.s("ୠ"));
    }

    @o0
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @o0
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@o0 Api<?> api) {
        zab zabVar = this.zad.get(api);
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return this.zab;
        }
        HashSet hashSet = new HashSet(this.zab);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @o0
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @o0
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @q0
    @KeepForSdk
    public View getViewForPopups() {
        return this.zaf;
    }

    @o0
    public final SignInOptions zaa() {
        return this.zai;
    }

    @q0
    public final Integer zab() {
        return this.zaj;
    }

    @q0
    public final String zac() {
        return this.zah;
    }

    @o0
    public final Map<Api<?>, zab> zad() {
        return this.zad;
    }

    public final void zae(@o0 Integer num) {
        this.zaj = num;
    }

    public ClientSettings(@Nullable Account account, @o0 Set<Scope> set, @o0 Map<Api<?>, zab> map, int i5, @Nullable View view, @o0 String str, @o0 String str2, @Nullable SignInOptions signInOptions, boolean z5) {
        this.zaa = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i5;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<zab> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }
}
