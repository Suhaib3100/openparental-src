package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import f9.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    @o0
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;

    @o0
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;

    @o0
    @m1
    public static final Scope zaa = new Scope(ProtectedSandApp.s("젂"));

    @o0
    @m1
    public static final Scope zab = new Scope(ProtectedSandApp.s("젃"));

    @o0
    @m1
    public static final Scope zac = new Scope(ProtectedSandApp.s("전"));

    @o0
    @m1
    public static final Scope zad;

    @o0
    @m1
    public static final Scope zae;
    private static final Comparator zag;

    @SafeParcelable.VersionField(id = 1)
    final int zaf;

    @SafeParcelable.Field(getter = "getScopes", id = 2)
    private final ArrayList zah;

    @q0
    @SafeParcelable.Field(getter = "getAccount", id = 3)
    private Account zai;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private boolean zaj;

    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    private final boolean zak;

    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    private final boolean zal;

    @q0
    @SafeParcelable.Field(getter = "getServerClientId", id = 7)
    private String zam;

    @q0
    @SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    private String zan;

    @SafeParcelable.Field(getter = "getExtensions", id = 9)
    private ArrayList zao;

    @q0
    @SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    private String zap;
    private Map zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static final class Builder {
        private Set zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;

        @q0
        private String zae;

        @q0
        private Account zaf;

        @q0
        private String zag;
        private Map zah;

        @q0
        private String zai;

        public Builder() {
            this.zaa = new HashSet();
            this.zah = new HashMap();
        }

        private final String zaa(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.zae;
            boolean z4 = true;
            if (str2 != null && !str2.equals(str)) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, ProtectedSandApp.s("쟿"));
            return str;
        }

        @o0
        @a
        public Builder addExtension(@o0 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zah.containsKey(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new IllegalStateException(ProtectedSandApp.s("저"));
            }
            List<Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.zaa.addAll(impliedScopes);
            }
            this.zah.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        @o0
        public GoogleSignInOptions build() {
            if (this.zaa.contains(GoogleSignInOptions.zae)) {
                Set set = this.zaa;
                Scope scope = GoogleSignInOptions.zad;
                if (set.contains(scope)) {
                    this.zaa.remove(scope);
                }
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(new ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        @o0
        @a
        public Builder requestEmail() {
            this.zaa.add(GoogleSignInOptions.zab);
            return this;
        }

        @o0
        @a
        public Builder requestId() {
            this.zaa.add(GoogleSignInOptions.zac);
            return this;
        }

        @o0
        @a
        public Builder requestIdToken(@o0 String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        @o0
        @a
        public Builder requestProfile() {
            this.zaa.add(GoogleSignInOptions.zaa);
            return this;
        }

        @o0
        @a
        public Builder requestScopes(@o0 Scope scope, @o0 Scope... scopeArr) {
            this.zaa.add(scope);
            this.zaa.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @o0
        @a
        public Builder requestServerAuthCode(@o0 String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        @o0
        @a
        public Builder setAccountName(@o0 String str) {
            this.zaf = new Account(Preconditions.checkNotEmpty(str), ProtectedSandApp.s("적"));
            return this;
        }

        @o0
        @a
        public Builder setHostedDomain(@o0 String str) {
            this.zag = Preconditions.checkNotEmpty(str);
            return this;
        }

        @o0
        @KeepForSdk
        @a
        public Builder setLogSessionId(@o0 String str) {
            this.zai = str;
            return this;
        }

        @o0
        @a
        public Builder requestServerAuthCode(@o0 String str, boolean z4) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z4;
            return this;
        }

        public Builder(@o0 GoogleSignInOptions googleSignInOptions) {
            this.zaa = new HashSet();
            this.zah = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.zaa = new HashSet(googleSignInOptions.zah);
            this.zab = googleSignInOptions.zak;
            this.zac = googleSignInOptions.zal;
            this.zad = googleSignInOptions.zaj;
            this.zae = googleSignInOptions.zam;
            this.zaf = googleSignInOptions.zai;
            this.zag = googleSignInOptions.zan;
            this.zah = GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.zai = googleSignInOptions.zap;
        }
    }

    static {
        Scope scope = new Scope(ProtectedSandApp.s("젅"));
        zad = scope;
        zae = new Scope(ProtectedSandApp.s("젆"));
        Builder builder = new Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        Builder builder2 = new Builder();
        builder2.requestScopes(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new zae();
        zag = new zac();
    }

    @q0
    public static GoogleSignInOptions zab(@q0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("젇"));
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        String s4 = ProtectedSandApp.s("절");
        String optString = jSONObject.has(s4) ? jSONObject.optString(s4) : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, ProtectedSandApp.s("젉")) : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z4 = jSONObject.getBoolean(ProtectedSandApp.s("젊"));
        boolean z5 = jSONObject.getBoolean(ProtectedSandApp.s("젋"));
        boolean z6 = jSONObject.getBoolean(ProtectedSandApp.s("젌"));
        String s5 = ProtectedSandApp.s("젍");
        String optString2 = jSONObject.has(s5) ? jSONObject.optString(s5) : null;
        String s6 = ProtectedSandApp.s("젎");
        return new GoogleSignInOptions(3, arrayList, account, z4, z5, z6, optString2, jSONObject.has(s6) ? jSONObject.optString(s6) : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map zam(@q0 List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.getAccount()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@androidx.annotation.q0 java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.zao     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.zao     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isIdTokenRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isServerAuthCodeRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.getLogSessionId()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @q0
    @KeepForSdk
    public Account getAccount() {
        return this.zai;
    }

    @o0
    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    @q0
    @KeepForSdk
    public String getLogSessionId() {
        return this.zap;
    }

    @o0
    public Scope[] getScopeArray() {
        return (Scope[]) this.zah.toArray(new Scope[this.zah.size()]);
    }

    @o0
    @KeepForSdk
    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zah);
    }

    @q0
    @KeepForSdk
    public String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((Scope) arrayList2.get(i4)).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.zai);
        hashAccumulator.addObject(this.zam);
        hashAccumulator.zaa(this.zal);
        hashAccumulator.zaa(this.zaj);
        hashAccumulator.zaa(this.zak);
        hashAccumulator.addObject(this.zap);
        return hashAccumulator.hash();
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zaf;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i4, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final String zaf() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put(ProtectedSandApp.s("젇"), jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put(ProtectedSandApp.s("절"), account.name);
            }
            jSONObject.put(ProtectedSandApp.s("젊"), this.zaj);
            jSONObject.put(ProtectedSandApp.s("젌"), this.zal);
            jSONObject.put(ProtectedSandApp.s("젋"), this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put(ProtectedSandApp.s("젍"), this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put(ProtectedSandApp.s("젎"), this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) ArrayList arrayList, @q0 @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6, @q0 @SafeParcelable.Param(id = 7) String str, @q0 @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList arrayList2, @q0 @SafeParcelable.Param(id = 10) String str3) {
        this(i4, arrayList, account, z4, z5, z6, str, str2, zam(arrayList2), str3);
    }

    private GoogleSignInOptions(int i4, ArrayList arrayList, @q0 Account account, boolean z4, boolean z5, boolean z6, @q0 String str, @q0 String str2, Map map, @q0 String str3) {
        this.zaf = i4;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z4;
        this.zak = z5;
        this.zal = z6;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
