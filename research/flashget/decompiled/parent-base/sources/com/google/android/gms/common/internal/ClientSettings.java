package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import zc.h;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class ClientSettings {

    @h
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;

    @h
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static final class Builder {

        @h
        private Account zaa;
        private d zab;
        private String zac;
        private String zad;
        private final SignInOptions zae = SignInOptions.zaa;

        @o0
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @o0
        @KeepForSdk
        @f9.a
        public Builder setRealClientPackageName(@o0 String str) {
            this.zac = str;
            return this;
        }

        @o0
        @f9.a
        public final Builder zaa(@o0 Collection collection) {
            if (this.zab == null) {
                this.zab = new d();
            }
            this.zab.addAll(collection);
            return this;
        }

        @o0
        @f9.a
        public final Builder zab(@h Account account) {
            this.zaa = account;
            return this;
        }

        @o0
        @f9.a
        public final Builder zac(@o0 String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@o0 Account account, @o0 Set<Scope> set, @o0 Map<Api<?>, zab> map, int i4, @h View view, @o0 String str, @o0 String str2, @h SignInOptions signInOptions) {
        this(account, set, map, i4, view, str, str2, signInOptions, false);
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
        return account != null ? account : new Account(ProtectedSandApp.s("쫍"), ProtectedSandApp.s("쫎"));
    }

    @o0
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @o0
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@o0 Api<?> api) {
        zab zabVar = (zab) this.zad.get(api);
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
    public final Map zad() {
        return this.zad;
    }

    public final void zae(@o0 Integer num) {
        this.zaj = num;
    }

    public ClientSettings(@h Account account, @o0 Set set, @o0 Map map, int i4, @h View view, @o0 String str, @o0 String str2, @h SignInOptions signInOptions, boolean z4) {
        this.zaa = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i4;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((zab) it.next()).zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }
}
